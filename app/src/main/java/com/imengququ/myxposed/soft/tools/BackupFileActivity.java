package com.imengququ.myxposed.soft.tools;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.soft.apk008.StartActivity;
import com.soft.apk008.WebMessageActivity;
import com.soft.toos.findApp.QuickFindActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import de.robv.android.xposed.mods.tutorial.Shell;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BackupFileActivity
  extends Activity
{
  public static final String folderName = "008backUp";
  private static String iniFile = ".BackupFileActivity";
  private static ExecutorService mThreadPool;
  private MyAdapter adapter;
  private ArrayList<String> array = new ArrayList();
  private Button button;
  private View buttonBackUp;
  private View buttonDeleteSelect;
  private View buttonSelectOther;
  private HashMap<String, String> checkMap = new HashMap();
  private HashMap<String, ArrayList<String>> dataMap = new HashMap();
  private EditText editText;
  private ListView listView;
  private View.OnClickListener listener = new View.OnClickListener()
  {
    public void onClick(final View View)
    {
      if (View.equals(BackupFileActivity.this.button))
      {
        Intent i = new Intent();
        i.setClass(BackupFileActivity.this, QuickFindActivity.class);
        BackupFileActivity.this.startActivityForResult(i, 1);
      }
      do
      {
        return;
        if (View.equals(BackupFileActivity.this.buttonBackUp))
        {
          String str = BackupFileActivity.this.editText.getText().toString().split("_");
          if ((str== null) || (str.length != 2))
          {
            Toast.makeText(BackupFileActivity.this, "还未选择应用", 0).show();
            return;
          }
          if (BackupFileSettingsActivity.getValue("oneImei").equals("true")) {
            BackupFileActivity.this.deleteAllImei(PoseHelper008.valueMap.getString("getDeviceId"));
          }
          BackupFileActivity.this.progressDialog.show();
          new Thread()
          {
            public void run()
            {
              BackupFileActivity.backUp(paramAnonymousView[1], paramAnonymousView[1] + "__" + System.currentTimeMillis() + "--" + PoseHelper008.valueMap.getString("getDeviceId"));
              BackupFileActivity.this.runOnUiThread(new Runnable()
              {
                public void run()
                {
                  BackupFileActivity.this.progressDialog.hide();
                  BackupFileActivity.this.init();
                  BackupFileActivity.this.adapter.notifyDataSetChanged();
                  Toast.makeText(BackupFileActivity.this, "备份成功", 0).show();
                }
              });
            }
          }.start();
          return;
        }
        if (paramAnonymousView.equals(BackupFileActivity.this.buttonDeleteSelect))
        {
          paramAnonymousView = new Builder(BackupFileActivity.this);
          paramAnonymousView.setTitle("注意");
          paramAnonymousView.setMessage("确定删除？删除后无法还原！");
          paramAnonymousView.setNegativeButton("确定", new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              paramAnonymous2DialogInterface = BackupFileActivity.this.checkMap.entrySet().iterator();
              for (;;)
              {
                if (!paramAnonymous2DialogInterface.hasNext())
                {
                  BackupFileActivity.this.init();
                  BackupFileActivity.this.adapter.notifyDataSetChanged();
                  return;
                }
                paramAnonymous2Int = Integer.parseInt((String)((Map.Entry)paramAnonymous2DialogInterface.next()).getKey());
                if (paramAnonymous2Int < BackupFileActivity.this.array.size())
                {
                  String str = BackupFileActivity.this.editText.getText().toString().split("_")[1];
                  Object localObject = (String)BackupFileActivity.this.array.get(paramAnonymous2Int);
                  str = str + "__" + (String)localObject;
                  localObject = new File(Environment.getExternalStorageDirectory(), "008backUp");
                  if (!((File)localObject).exists()) {
                    ((File)localObject).mkdir();
                  }
                  str = ((File)localObject).getAbsolutePath() + File.separator + str;
                  if (new File(str).exists()) {
                    Shell.execCommand("rm -r " + str, true, false);
                  }
                  try
                  {
                    Thread.sleep(500L);
                  }
                  catch (InterruptedException localInterruptedException)
                  {
                    localInterruptedException.printStackTrace();
                  }
                }
              }
            }
          });
          paramAnonymousView.setPositiveButton("取消", new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              paramAnonymous2DialogInterface.cancel();
            }
          });
          paramAnonymousView.create().show();
          return;
        }
      } while (!paramAnonymousView.equals(BackupFileActivity.this.buttonSelectOther));
      int i = 0;
      if (i >= BackupFileActivity.this.array.size())
      {
        BackupFileActivity.this.adapter.notifyDataSetChanged();
        return;
      }
      if (BackupFileActivity.this.checkMap.get(i) == null) {
        BackupFileActivity.this.checkMap.put(i, i);
      }
      for (;;)
      {
        i += 1;
        break;
        BackupFileActivity.this.checkMap.remove(i);
      }
    }
  };
  private ProgressDialog progressDialog;
  
  public static boolean backUp(String paramString1, String paramString2)
  {
    File localFile = new File(Environment.getExternalStorageDirectory(), "008backUp");
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    paramString2 = localFile.getAbsolutePath() + File.separator + paramString2;
    if (new File(paramString2).exists()) {
      Shell.execCommand("rm -r " + paramString2, true, false);
    }
    for (;;)
    {
      try
      {
        Thread.sleep(500L);
        paramString1 = "/data/data/" + paramString1;
        copyFolderByCat(paramString1, paramString1, paramString2);
        return true;
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
        continue;
      }
      new File(paramString2).mkdir();
    }
  }
  
  public static void copyFileByCat(String paramString1, String paramString2)
  {
    Shell.execCommand("cat " + paramString1 + "  > " + paramString2, true, false);
  }
  
  public static void copyFolderByCat(String paramString1, String paramString2, String paramString3)
  {
    String str1 = Shell.execCommandWithResult("ls -l " + paramString2, true).trim();
    if (str1.length() == 0) {
      return;
    }
    String[] arrayOfString = str1.split("\n");
    if (str1.equals(paramString2))
    {
      i = paramString2.indexOf(paramString1);
      paramString1 = paramString2.substring(paramString1.length() + i, paramString2.length());
      copyFileByCat(paramString2, paramString3 + paramString1);
      return;
    }
    int i = paramString2.indexOf(paramString1);
    str1 = paramString2.substring(paramString1.length() + i, paramString2.length());
    String str2 = paramString3 + str1;
    Shell.execCommand("mkdir " + str2, true, false);
    int j = arrayOfString.length;
    i = 0;
    label169:
    String str3;
    if (i < j)
    {
      str2 = arrayOfString[i];
      str3 = str2.substring(str2.lastIndexOf(" ") + 1, str2.length());
      if (str2.charAt(0) != 'd') {
        break label250;
      }
      copyFolderByCat(paramString1, paramString2 + File.separator + str3, paramString3);
    }
    for (;;)
    {
      i += 1;
      break label169;
      break;
      label250:
      copyFileByCat(paramString2 + File.separator + str3, paramString3 + str1 + File.separator + str3);
    }
  }
  
  public static ExecutorService getThreadPool()
  {
    if (mThreadPool == null) {}
    try
    {
      if (mThreadPool == null) {
        mThreadPool = Executors.newFixedThreadPool(2);
      }
      return mThreadPool;
    }
    finally {}
  }
  
  private static void give777(File paramFile)
  {
    Object localObject;
    if (paramFile.isDirectory())
    {
      localObject = Shell.execCommandWithResult("ls " + paramFile.getAbsolutePath(), true).trim();
      if ((((String)localObject).length() != 0) && (!paramFile.getAbsolutePath().equals(localObject))) {
        break label54;
      }
    }
    for (;;)
    {
      return;
      label54:
      localObject = ((String)localObject).split("\n");
      int j = localObject.length;
      int i = 0;
      while (i < j)
      {
        String str1 = localObject[i];
        String str2 = paramFile.getAbsolutePath() + File.separator + str1;
        if (new File(str2).isDirectory())
        {
          Shell.execCommand("chmod 777 " + paramFile.getAbsolutePath() + File.separator + str1 + File.separator + "*", true, false);
          Shell.execCommand("chmod 777 " + paramFile.getAbsolutePath() + File.separator + str1, true, false);
          give777(new File(str2));
        }
        i += 1;
      }
    }
  }
  
  public static boolean restore(String paramString1, String paramString2)
  {
    File localFile = new File(Environment.getExternalStorageDirectory(), "008backUp");
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    paramString2 = localFile.getAbsolutePath() + File.separator + paramString2;
    if (!new File(paramString2).exists()) {
      return false;
    }
    paramString1 = "/data/data/" + paramString1;
    copyFolderByCat(paramString2, paramString2, paramString1);
    try
    {
      Thread.sleep(100L);
      give777(new File(paramString1));
      return true;
    }
    catch (InterruptedException paramString2)
    {
      for (;;)
      {
        paramString2.printStackTrace();
      }
    }
  }
  
  protected void deleteAllImei(String paramString)
  {
    File localFile = new File(Environment.getExternalStorageDirectory(), "008backUp");
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    String[] arrayOfString = localFile.list();
    int j = arrayOfString.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {}
      try
      {
        Thread.sleep(200L);
        return;
      }
      catch (InterruptedException paramString)
      {
        String str;
        paramString.printStackTrace();
      }
      str = arrayOfString[i];
      if (str.indexOf(paramString) >= 0)
      {
        str = localFile.getAbsolutePath() + File.separator + str;
        if (new File(str).exists()) {
          Shell.execCommand("rm  -r " + str, true, false);
        }
      }
      try
      {
        Thread.sleep(10L);
        i += 1;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          localInterruptedException.printStackTrace();
        }
      }
    }
  }
  
  public void init()
  {
    this.dataMap.clear();
    Object localObject1 = new File(Environment.getExternalStorageDirectory(), "008backUp");
    if (!((File)localObject1).exists()) {
      ((File)localObject1).mkdir();
    }
    String[] arrayOfString = ((File)localObject1).list();
    int j;
    int i;
    if ((arrayOfString != null) && (arrayOfString.length > 0))
    {
      j = arrayOfString.length;
      i = 0;
    }
    for (;;)
    {
      if (i >= j)
      {
        localObject1 = this.editText.getText().toString().split("_");
        if (localObject1.length == 2) {
          this.array = ((ArrayList)this.dataMap.get(localObject1[1]));
        }
        if (this.array == null) {
          this.array = new ArrayList();
        }
        return;
      }
      localObject1 = arrayOfString[i].split("__");
      Object localObject2 = localObject1[0];
      Object localObject3 = localObject1[1];
      ArrayList localArrayList = (ArrayList)this.dataMap.get(localObject2);
      localObject1 = localArrayList;
      if (localArrayList == null)
      {
        localObject1 = new ArrayList();
        this.dataMap.put(localObject2, localObject1);
      }
      ((ArrayList)localObject1).add(localObject3);
      i += 1;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 != 1) || (paramIntent == null)) {
      return;
    }
    paramIntent = paramIntent.getStringExtra("packageName");
    this.editText.setText(paramIntent);
    init();
    this.adapter.notifyDataSetChanged();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903069);
    this.listView = ((ListView)findViewById(2131230867));
    this.editText = ((EditText)findViewById(2131230865));
    this.button = ((Button)findViewById(2131230866));
    this.buttonBackUp = findViewById(2131230868);
    this.buttonSelectOther = findViewById(2131230870);
    this.buttonDeleteSelect = findViewById(2131230869);
    this.button.setOnClickListener(this.listener);
    this.buttonBackUp.setOnClickListener(this.listener);
    this.buttonSelectOther.setOnClickListener(this.listener);
    this.buttonDeleteSelect.setOnClickListener(this.listener);
    this.editText.setText(PoseHelper008.getFileData(iniFile));
    init();
    this.adapter = new MyAdapter();
    this.listView.setAdapter(this.adapter);
    this.listView.setOnItemClickListener(new OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        BackupFileActivity.this.showHandleDialog(paramAnonymousInt);
      }
    });
    PoseHelper008.initData(this);
    this.progressDialog = new ProgressDialog(this);
    this.progressDialog.setCancelable(false);
    this.progressDialog.setMessage("操作中，请稍候");
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131165188, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    PoseHelper008.saveDataToFile(iniFile, this.editText.getText().toString());
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131230980)
    {
      paramMenuItem = new Intent();
      paramMenuItem.setClass(this, BackupFileSettingsActivity.class);
      startActivity(paramMenuItem);
    }
    for (;;)
    {
      return true;
      if (paramMenuItem.getItemId() == 2131230979)
      {
        paramMenuItem = new Intent();
        paramMenuItem.setClass(this, WebMessageActivity.class);
        paramMenuItem.putExtra("url", StartActivity.baseUrl + "/phone/ContentAction.action?action=backUpHelp");
        startActivity(paramMenuItem);
      }
    }
  }
  
  protected void showHandleDialog(int paramInt)
  {
    final String str1 = this.editText.getText().toString().split("_")[1];
    final String str2 = (String)this.array.get(paramInt);
    str2 = str1 + "__" + str2;
    Builder localBuilder = new Builder(this);
    localBuilder.setTitle("注意");
    localBuilder.setMessage("选择你的操作");
    localBuilder.setPositiveButton("还原", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        BackupFileActivity.this.progressDialog.show();
        new Thread()
        {
          public void run()
          {
            BackupFileActivity.restore(this.val$packAgeName, this.val$backName);
            BackupFileActivity.this.runOnUiThread(new Runnable()
            {
              public void run()
              {
                BackupFileActivity.this.progressDialog.hide();
                Toast.makeText(BackupFileActivity.this, "还原成功", 0).show();
                BackupFileActivity.this.init();
                BackupFileActivity.this.adapter.notifyDataSetChanged();
              }
            });
          }
        }.start();
      }
    });
    localBuilder.setNegativeButton("删除", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface = new Builder(BackupFileActivity.this);
        paramAnonymousDialogInterface.setTitle("注意");
        paramAnonymousDialogInterface.setMessage("确定删除？删除后无法还原！");
        paramAnonymousDialogInterface.setNegativeButton("确定", new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            paramAnonymous2DialogInterface = new File(Environment.getExternalStorageDirectory(), "008backUp");
            if (!paramAnonymous2DialogInterface.exists()) {
              paramAnonymous2DialogInterface.mkdir();
            }
            paramAnonymous2DialogInterface = paramAnonymous2DialogInterface.getAbsolutePath() + File.separator + this.val$backName;
            if (new File(paramAnonymous2DialogInterface).exists()) {
              Shell.execCommand("rm  -r " + paramAnonymous2DialogInterface, true, false);
            }
            try
            {
              Thread.sleep(500L);
              BackupFileActivity.this.init();
              BackupFileActivity.this.adapter.notifyDataSetChanged();
              return;
            }
            catch (InterruptedException paramAnonymous2DialogInterface)
            {
              for (;;)
              {
                paramAnonymous2DialogInterface.printStackTrace();
              }
            }
          }
        });
        paramAnonymousDialogInterface.setPositiveButton("取消", new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            paramAnonymous2DialogInterface.cancel();
          }
        });
        paramAnonymousDialogInterface.create().show();
      }
    });
    localBuilder.create().show();
  }
  
  class MyAdapter
    extends BaseAdapter
  {
    MyAdapter() {}
    
    public int getCount()
    {
      return BackupFileActivity.this.array.size();
    }
    
    public Object getItem(int paramInt)
    {
      return null;
    }
    
    public long getItemId(int paramInt)
    {
      return 0L;
    }
    
    public View getView(final int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = ((LayoutInflater)BackupFileActivity.this.getSystemService("layout_inflater")).inflate(2130903070, null);
        paramView = (TextView)paramViewGroup.findViewById(2131230873);
        localObject = (TextView)paramViewGroup.findViewById(2131230871);
        CheckBox localCheckBox = (CheckBox)paramViewGroup.findViewById(2131230872);
        ViewHolder localViewHolder = new ViewHolder(BackupFileActivity.this);
        localViewHolder.backName = paramView;
        localViewHolder.createTime = ((TextView)localObject);
        localViewHolder.checkBox = localCheckBox;
        paramViewGroup.setTag(localViewHolder);
      }
      paramView = (ViewHolder)paramViewGroup.getTag();
      Object localObject = ((String)BackupFileActivity.this.array.get(paramInt)).split("--");
      if (localObject.length == 2)
      {
        paramView.backName.setText(localObject[1]);
        localObject = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(Long.parseLong(localObject[0])));
        paramView.createTime.setText((CharSequence)localObject);
      }
      if (BackupFileActivity.this.checkMap.get(paramInt) != null)
      {
        paramView.checkBox.setOnCheckedChangeListener(null);
        paramView.checkBox.setChecked(true);
      }
      for (;;)
      {
        paramView.checkBox.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
          public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
          {
            if (paramAnonymousBoolean)
            {
              BackupFileActivity.this.checkMap.put(paramInt, paramInt);
              return;
            }
            BackupFileActivity.this.checkMap.remove(paramInt);
          }
        });
        return paramViewGroup;
        paramView.checkBox.setOnCheckedChangeListener(null);
        paramView.checkBox.setChecked(false);
      }
    }
  }
  
  class ViewHolder
  {
    TextView backName;
    CheckBox checkBox;
    TextView createTime;
    
    ViewHolder() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     BackupFileActivity

 * JD-Core Version:    0.7.0.1

 */