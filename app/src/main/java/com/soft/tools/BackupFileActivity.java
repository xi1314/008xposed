package com.soft.tools;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.soft.apk008.StartActivity;
import com.soft.apk008.WebMessageActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

public class BackupFileActivity
  extends Activity
{
  private static String k = ".BackupFileActivity";
  private static String l = "";
  private static String n = "busybox";
  private ListView a;
  private EditText b;
  private Button c;
  private ArrayList d = new ArrayList();
  private HashMap e = new HashMap();
  private HashMap f = new HashMap();
  private a g;
  private View h;
  private View i;
  private View j;
  private ProgressDialog m;
  private View.OnClickListener o = new d(this);
  
  public static void a(Activity paramActivity)
  {
    if (!BackupFileSettingsActivity.a("autoRestore").equals("true")) {}
    File localFile;
    String[] arrayOfString1;
    do
    {
      return;
      localFile = new File(l, "008backUp");
      if (!localFile.exists()) {
        localFile.mkdir();
      }
      arrayOfString1 = localFile.list();
    } while ((arrayOfString1 == null) || (arrayOfString1.length == 0));
    String str1 = h.a("cat /data/system/packages.list", true);
    int i3 = arrayOfString1.length;
    int i1 = 0;
    label74:
    String str2;
    String[] arrayOfString2;
    int i4;
    int i2;
    if (i1 < i3)
    {
      str2 = arrayOfString1[i1];
      arrayOfString2 = new File(localFile, str2).list();
      if ((arrayOfString2 != null) && (arrayOfString2.length != 0))
      {
        i4 = arrayOfString2.length;
        i2 = 0;
      }
    }
    for (;;)
    {
      if (i2 >= i4)
      {
        i1 += 1;
        break label74;
        break;
      }
      String str3 = arrayOfString2[i2];
      int i5 = str1.indexOf(str3);
      if (i5 >= 0)
      {
        int i6 = str1.indexOf(" ", str3.length() + i5 + 1);
        a(paramActivity, str3, str2, str1.substring(i5 + str3.length() + 1, i6).trim());
      }
      i2 += 1;
    }
  }
  
  protected static void a(String paramString)
  {
    File localFile = new File(l, "008backUp");
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    String[] arrayOfString = localFile.list();
    int i2 = arrayOfString.length;
    int i1 = 0;
    for (;;)
    {
      if (i1 >= i2) {}
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
      str = arrayOfString[i1];
      if (str.indexOf(paramString) >= 0)
      {
        str = localFile.getAbsolutePath() + File.separator + str;
        if (new File(str).exists()) {
          h.a("rm  -r " + str);
        }
      }
      try
      {
        Thread.sleep(10L);
        i1 += 1;
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
  
  public static boolean a(Activity paramActivity, String paramString1, String paramString2, String paramString3)
  {
    String[] arrayOfString = paramString2.split("__");
    if (arrayOfString.length != 2) {}
    do
    {
      return false;
      if (!FindPhoneDataActivity.a(arrayOfString[1])) {
        paramActivity.runOnUiThread(new p());
      }
      paramActivity = new File(l, "008backUp");
      if (!paramActivity.exists()) {
        paramActivity.mkdir();
      }
      paramActivity = l + File.separator + "008backUp" + File.separator + paramString2 + File.separator + paramString1;
    } while (!new File(paramActivity).exists());
    paramString1 = "/data/data/" + paramString1;
    h.a(n + " rm -r -applicationInfolist " + paramString1, true);
    b(paramActivity, paramString1);
    paramActivity = h.a("chmod -R 777 " + paramString1 + "\n" + n + " chown -R " + paramString3 + ":" + paramString3 + "  " + paramString1, true);
    System.out.println("result" + paramActivity);
    return true;
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    File localFile = new File(l, "008backUp");
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    paramString2 = l + File.separator + "008backUp" + File.separator + paramString2;
    if (!new File(paramString2).exists()) {
      new File(paramString2).mkdir();
    }
    if (new File(paramString2 + File.separator + paramString1).exists()) {
      h.a("rm -r " + paramString2 + File.separator + paramString1);
    }
    try
    {
      Thread.sleep(500L);
      new File(paramString2).mkdirs();
      b("/data/data/" + paramString1, paramString2 + File.separator + paramString1);
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        localInterruptedException.printStackTrace();
      }
    }
  }
  
  public static void b()
  {
    if (!BackupFileSettingsActivity.a("autoBackUp").equals("true")) {}
    for (;;)
    {
      return;
      if (BackupFileSettingsActivity.a("oneImei").equals("true")) {
        a(PoseHelper008.valueMap.getStringfrommap("getDeviceId"));
      }
      String[] arrayOfString = PoseHelper008.getFileData(k).split(",");
      String str = System.currentTimeMillis() + "__" + PoseHelper008.valueMap.getStringfrommap("getDeviceId");
      if ((arrayOfString != null) && (arrayOfString.length > 0))
      {
        int i2 = arrayOfString.length;
        int i1 = 0;
        while (i1 < i2)
        {
          a(arrayOfString[i1], str);
          i1 += 1;
        }
      }
    }
  }
  
  private static void b(String paramString1, String paramString2)
  {
    h.a(n + " cp -r -applicationInfolist " + paramString1 + "   " + paramString2, true);
  }
  
  public final void a()
  {
    this.f.clear();
    String str1 = this.b.getText().toString();
    File localFile = new File(l, "008backUp");
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    String[] arrayOfString1 = localFile.list();
    this.d.clear();
    int i1;
    if ((arrayOfString1 != null) && (arrayOfString1.length > 0))
    {
      int i3 = arrayOfString1.length;
      i1 = 0;
      if (i1 < i3) {}
    }
    else
    {
      if (this.d == null) {
        this.d = new ArrayList();
      }
      i1 = 0;
      if (i1 < this.d.size()) {
        break label262;
      }
      return;
    }
    String str2 = arrayOfString1[i1];
    String str3 = str2.split("__")[0];
    String[] arrayOfString2 = new File(localFile, str2).list();
    int i4;
    if ((arrayOfString1 != null) && (arrayOfString1.length > 0))
    {
      i4 = arrayOfString2.length;
      i2 = 0;
    }
    Object localObject;
    for (;;)
    {
      if (i2 >= i4)
      {
        i1 += 1;
        break;
      }
      if (str1.contains(arrayOfString2[i2]))
      {
        ArrayList localArrayList = (ArrayList)this.f.get(str3);
        localObject = localArrayList;
        if (localArrayList == null)
        {
          localObject = new ArrayList();
          this.f.put(str3, localObject);
          this.d.add(str2);
        }
        ((ArrayList)localObject).add(str2);
      }
      i2 += 1;
    }
    label262:
    int i2 = i1;
    for (;;)
    {
      if (i2 >= this.d.size())
      {
        i1 += 1;
        break;
      }
      localObject = ((String)this.d.get(i1)).split("__");
      if (localObject.length == 2)
      {
        long l1 = Long.parseLong(localObject[0]);
        if (Long.parseLong(((String)this.d.get(i2)).split("__")[0]) > l1) {
          Collections.swap(this.d, i1, i2);
        }
      }
      i2 += 1;
    }
  }
  
  protected final void a(int paramInt)
  {
    String[] arrayOfString = this.b.getText().toString().split(",");
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("注意");
    localBuilder.setMessage("选择你的操作");
    localBuilder.setPositiveButton("还原", new j(this, paramInt, arrayOfString));
    localBuilder.setNegativeButton("删除", new m(this, paramInt, arrayOfString));
    localBuilder.create().show();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 != 1) || (paramIntent == null)) {
      return;
    }
    paramIntent = paramIntent.getStringExtra("items");
    this.b.setText(paramIntent);
    a();
    this.g.notifyDataSetChanged();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903081);
    this.a = ((ListView)findViewById(2131362017));
    this.b = ((EditText)findViewById(2131362015));
    this.c = ((Button)findViewById(2131362016));
    this.h = findViewById(2131362018);
    this.i = findViewById(2131362020);
    this.j = findViewById(2131362019);
    this.c.setOnClickListener(this.o);
    this.h.setOnClickListener(this.o);
    this.i.setOnClickListener(this.o);
    this.j.setOnClickListener(this.o);
    this.b.setText(PoseHelper008.getFileData(k));
    BackupFileSettingsActivity.a(this);
    if (l.length() == 0)
    {
      if ((FolderBackUpActivity.b != null) && (FolderBackUpActivity.b.length() > 0)) {
        l = FolderBackUpActivity.b;
      }
      l = Environment.getExternalStorageDirectory().getAbsolutePath();
      paramBundle = h.a("ls " + l, true);
      if ((paramBundle.indexOf("No such") >= 0) || (paramBundle.length() == 0)) {
        l = "/sdcard";
      }
    }
    a();
    this.g = new a();
    this.a.setAdapter(this.g);
    this.a.setOnItemClickListener(new i(this));
    PoseHelper008.initData(this);
    this.m = new ProgressDialog(this);
    this.m.setCancelable(false);
    this.m.setMessage("操作中，请稍候");
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296262, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    PoseHelper008.saveDataToFile(k, this.b.getText().toString());
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362287)
    {
      paramMenuItem = new Intent();
      paramMenuItem.setClass(this, BackupFileSettingsActivity.class);
      startActivity(paramMenuItem);
    }
    for (;;)
    {
      return true;
      if (paramMenuItem.getItemId() == 2131362286)
      {
        paramMenuItem = new Intent();
        paramMenuItem.setClass(this, WebMessageActivity.class);
        paramMenuItem.putExtra("url", StartActivity.b + "/phone/ContentAction.action?action=backUpHelp");
        startActivity(paramMenuItem);
      }
    }
  }
  
  protected void onResume()
  {
    String str = BackupFileSettingsActivity.a("busyBoxName");
    if (str.equals("null")) {}
    for (n = "";; n = str)
    {
      super.onResume();
      return;
    }
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return BackupFileActivity.h(BackupFileActivity.this).size();
    }
    
    public final Object getItem(int paramInt)
    {
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = ((LayoutInflater)BackupFileActivity.this.getSystemService("layout_inflater")).inflate(2130903082, null);
        paramView = (TextView)paramViewGroup.findViewById(2131362023);
        localObject = (TextView)paramViewGroup.findViewById(2131362021);
        CheckBox localCheckBox = (CheckBox)paramViewGroup.findViewById(2131362022);
        BackupFileActivity.b localb = new BackupFileActivity.b(BackupFileActivity.this);
        localb.a = paramView;
        localb.b = ((TextView)localObject);
        localb.c = localCheckBox;
        paramViewGroup.setTag(localb);
      }
      paramView = (BackupFileActivity.b)paramViewGroup.getTag();
      Object localObject = ((String)BackupFileActivity.h(BackupFileActivity.this).get(paramInt)).split("__");
      if (localObject.length == 2)
      {
        paramView.a.setText(localObject[1]);
        localObject = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(Long.parseLong(localObject[0])));
        paramView.b.setText((CharSequence)localObject);
      }
      if (BackupFileActivity.g(BackupFileActivity.this).get(paramInt) != null)
      {
        paramView.c.setOnCheckedChangeListener(null);
        paramView.c.setChecked(true);
      }
      for (;;)
      {
        paramView.c.setOnCheckedChangeListener(new q(this, paramInt));
        return paramViewGroup;
        paramView.c.setOnCheckedChangeListener(null);
        paramView.c.setChecked(false);
      }
    }
  }
  
  final class b
  {
    TextView a;
    TextView b;
    CheckBox c;
    
    b() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.BackupFileActivity

 * JD-Core Version:    0.7.0.1

 */