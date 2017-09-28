package com.imengququ.myxposed.soft.apk008;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.lishu.jifen.db.FileHelper;
import com.lishu.net.AlertDialogHelper;
import com.soft.apk008.remain.RecordSelectActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class HistoryActivity
  extends Activity
{
  public static String nowFileName = "";
  private MyListAdapter adapter;
  private ArrayList<HashMap<String, String>> dataList = new ArrayList();
  private View.OnClickListener itemClickListener = new View.OnClickListener()
  {
    public void onClick(View View)
    {
      String tag = (String)View.getTag();
      Intent localIntent = new Intent();
      localIntent.putExtra("getDeviceId", tag);
      HistoryActivity.this.setResult(1, localIntent);
      HistoryActivity.this.finish();
    }
  };
  private int itemId = 100;
  private ListView listView;
  private View.OnClickListener onDeleteClickListener = new View.OnClickListener()
  {
    public void onClick(final View View)
    {
    String   TAG = (String)View.getTag();
      if ((TAG != null) && (TAG.length() > 0))
      {
        Builder localBuilder = new Builder(HistoryActivity.this);
        localBuilder.setTitle("是否删除");
        localBuilder.setMessage("是否删除该项");
        localBuilder.setNegativeButton("确定", new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface DialogInterface, int Int)
          {
            FileHelper.deleteItem(HistoryActivity.nowFileName, View);
            DialogInterface.cancel();
            HistoryActivity.this.initData();
          }
        });
        localBuilder.setPositiveButton("取消", new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface DialogInterface, int paramAnonymous2Int)
          {
            DialogInterface.cancel();
          }
        });
        localBuilder.create().show();
      }
    }
  };
  private View.OnClickListener onEditClickListener = new View.OnClickListener()
  {
    public void onClick(final View View)
    {
      String tag = (String)View.getTag();
      if ((tag != null) && (tag.length() > 0))
      {
        Builder localBuilder = new Builder(HistoryActivity.this);
        localBuilder.setTitle("输入别名");
        final EditText localEditText = new EditText(HistoryActivity.this);
        localBuilder.setView(localEditText);
        localBuilder.setNegativeButton("确定", new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface DialogInterface, int Int)
          {
            String str = localEditText.getText().toString();
            if (str.length() > 0)
            {
              FileHelper.UpdateItem(HistoryActivity.nowFileName, paramAnonymousView, str);
              HistoryActivity.this.initData();
              DialogInterface.cancel();
            }
          }
        });
        localBuilder.setPositiveButton("取消", new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            paramAnonymous2DialogInterface.cancel();
          }
        });
        localBuilder.create().show();
      }
    }
  };
  
  public static void getFristName()
  {
    String[] arrayOfString = FileHelper.getAllKind();
    nowFileName = PoseHelper008.getFileData("nowFileName");
    int i = 0;
    int k = 0;
    int m;
    int j;
    if (nowFileName.length() > 0)
    {
      m = arrayOfString.length;
      j = 0;
      i = k;
    }
    for (;;)
    {
      if (j >= m)
      {
        if ((i == 0) && (arrayOfString.length > 0)) {
          nowFileName = arrayOfString[0];
        }
        return;
      }
      if (arrayOfString[j].equals(nowFileName)) {
        i = 1;
      }
      j += 1;
    }
  }
  
  private void initData()
  {
    Object localObject = FileHelper.getAllKind();
    nowFileName = PoseHelper008.getFileData("nowFileName");
    int i = 0;
    int k = 0;
    int j;
    if (nowFileName.length() > 0)
    {
      int m = localObject.length;
      j = 0;
      i = k;
      if (j < m) {}
    }
    else if (i == 0)
    {
      if (localObject.length <= 0) {
        break label127;
      }
      nowFileName = localObject[0];
    }
    for (;;)
    {
      if (nowFileName.length() > 0) {
        getActionBar().setSubtitle(nowFileName);
      }
      PoseHelper008.saveDataToFile("nowFileName", nowFileName);
      localObject = (ArrayList)FileHelper.AllItemList.get(nowFileName);
      if (localObject != null) {
        break label139;
      }
      return;
      if (localObject[j].equals(nowFileName)) {
        i = 1;
      }
      j += 1;
      break;
      label127:
      getActionBar().setSubtitle("暂时无历史");
    }
    label139:
    Iterator localIterator = ((ArrayList)localObject).iterator();
    if (!localIterator.hasNext())
    {
      this.adapter.notifyDataSetChanged();
      return;
    }
    localObject = (HashMap)localIterator.next();
    String str1 = (String)((HashMap)localObject).get("getDeviceId");
    String str2 = (String)((HashMap)localObject).get("getSubscriberId");
    str2 = (String)((HashMap)localObject).get("tagName");
    localObject = (String)((HashMap)localObject).get("time");
    long l;
    if (localObject != null) {
      l = Long.parseLong((String)localObject);
    }
    for (localObject = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(l));; localObject = "")
    {
      addItem(str2, str1, (String)localObject);
      break;
    }
  }
  
  public void addItem(String paramString1, String paramString2, String paramString3)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("tagName", paramString1);
    localHashMap.put("imei", paramString2);
    localHashMap.put("time", paramString3);
    this.dataList.add(localHashMap);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramIntent != null))
    {
      paramIntent = paramIntent.getStringExtra("name");
      if (!paramIntent.equals(nowFileName))
      {
        nowFileName = paramIntent;
        PoseHelper008.saveDataToFile("nowFileName", nowFileName);
        initData();
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.listView = new ListView(this);
    setContentView(this.listView);
    this.adapter = new MyListAdapter(null);
    this.listView.setAdapter(this.adapter);
    initData();
    this.listView.setOnItemClickListener(new OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong) {}
    });
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131165184, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131230965)
    {
      paramMenuItem = new Builder(this);
      paramMenuItem.setTitle("注意");
      paramMenuItem.setMessage("是否删除所有数据");
      paramMenuItem.setPositiveButton("确定", new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          if ((ArrayList)FileHelper.AllItemList.get(HistoryActivity.nowFileName) == null) {
            return;
          }
          FileHelper.clearKind(HistoryActivity.nowFileName);
          HistoryActivity.this.initData();
          paramAnonymousDialogInterface.cancel();
        }
      });
      paramMenuItem.setNegativeButton("取消", new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          paramAnonymousDialogInterface.cancel();
        }
      });
      paramMenuItem.create().show();
    }
    do
    {
      return true;
      if (paramMenuItem.getItemId() == 2131230967)
      {
        paramMenuItem = new Intent();
        paramMenuItem.setClass(this, RecordSelectActivity.class);
        startActivityForResult(paramMenuItem, 1);
        return true;
      }
      if (paramMenuItem.getItemId() == 2131230966)
      {
        showDeleteKindDialog();
        return true;
      }
      if (paramMenuItem.getItemId() == 2131230970)
      {
        showNewKindDialog();
        return true;
      }
      if (paramMenuItem.getItemId() == 2131230969)
      {
        showReNameKindDialog();
        return true;
      }
    } while (paramMenuItem.getItemId() != 2131230968);
    showMaxNumDialog();
    return true;
  }
  
  public void showChangeKindDialog()
  {
    if (nowFileName.equals(""))
    {
      Toast.makeText(this, "当前无历史记录", 0).show();
      return;
    }
    final Spinner localSpinner = new Spinner(this);
    Builder localBuilder = AlertDialogHelper.getBuilder(this, "切换分类", "", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousInt = localSpinner.getSelectedItemPosition();
        paramAnonymousDialogInterface = FileHelper.getAllKind()[paramAnonymousInt];
        if (!paramAnonymousDialogInterface.equals(HistoryActivity.nowFileName))
        {
          HistoryActivity.nowFileName = paramAnonymousDialogInterface;
          PoseHelper008.saveDataToFile("nowFileName", HistoryActivity.nowFileName);
          HistoryActivity.this.initData();
        }
      }
    });
    localBuilder.setView(localSpinner);
    localSpinner.setAdapter(new ArrayAdapter(this, 17367046, FileHelper.getAllKind()));
    localBuilder.create().show();
  }
  
  public void showDeleteKindDialog()
  {
    if (nowFileName.equals(""))
    {
      Toast.makeText(this, "当前无历史记录", 0).show();
      return;
    }
    AlertDialogHelper.getBuilder(this, "是否删除当前分类", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        FileHelper.deleteKind(HistoryActivity.nowFileName);
        HistoryActivity.this.initData();
      }
    }).create().show();
  }
  
  public void showMaxNumDialog()
  {
    Object localObject = new Builder(this);
    ((Builder)localObject).setTitle("当分类中的数据大于设置的数值时，系统将自动删除最早的那条数据");
    final EditText localEditText = new EditText(this);
    ((Builder)localObject).setView(localEditText);
    localEditText.setText(PoseHelper008.getFileData("HistoryActivity_maxNum"));
    ((Builder)localObject).setNegativeButton("确定", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        String str = localEditText.getText().toString();
        try
        {
          paramAnonymousInt = Integer.parseInt(str);
          PoseHelper008.saveDataToFile("HistoryActivity_maxNum", paramAnonymousInt);
          paramAnonymousDialogInterface.cancel();
          return;
        }
        catch (Exception paramAnonymousDialogInterface)
        {
          Toast.makeText(HistoryActivity.this, "输入的不是数字", 0).show();
        }
      }
    });
    ((Builder)localObject).setPositiveButton("取消", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.cancel();
      }
    });
    localObject = ((Builder)localObject).create();
    ((Dialog)localObject).setCancelable(false);
    ((Dialog)localObject).show();
  }
  
  public void showNewKindDialog()
  {
    final EditText localEditText = new EditText(this);
    Builder localBuilder = AlertDialogHelper.getBuilder(this, "新建分类", "", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface = localEditText.getText().toString();
        if (FileHelper.addKind(paramAnonymousDialogInterface))
        {
          HistoryActivity.nowFileName = paramAnonymousDialogInterface;
          HistoryActivity.this.initData();
          return;
        }
        Toast.makeText(HistoryActivity.this, "添加失败", 0).show();
      }
    });
    localBuilder.setView(localEditText);
    localBuilder.create().show();
  }
  
  public void showReNameKindDialog()
  {
    if (nowFileName.equals(""))
    {
      Toast.makeText(this, "当前无历史记录", 0).show();
      return;
    }
    final EditText localEditText = new EditText(this);
    Builder localBuilder = AlertDialogHelper.getBuilder(this, "重命名分类", "", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface = localEditText.getText().toString();
        FileHelper.renameKind(HistoryActivity.nowFileName, paramAnonymousDialogInterface);
        HistoryActivity.this.initData();
      }
    });
    localBuilder.setView(localEditText);
    localBuilder.create().show();
  }
  
  private class MyListAdapter
    extends BaseAdapter
  {
    private MyListAdapter() {}
    
    public int getCount()
    {
      return HistoryActivity.this.dataList.size();
    }
    
    public Object getItem(int paramInt)
    {
      return null;
    }
    
    public long getItemId(int paramInt)
    {
      return 0L;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      paramViewGroup = paramView;
      if (paramView == null) {
        paramViewGroup = (RelativeLayout)((LayoutInflater)HistoryActivity.this.getSystemService("layout_inflater")).inflate(2130903045, null);
      }
      Object localObject2 = (HashMap)HistoryActivity.this.dataList.get(paramInt);
      Object localObject1 = (String)((HashMap)localObject2).get("tagName");
      paramView = (String)((HashMap)localObject2).get("imei");
      localObject2 = (String)((HashMap)localObject2).get("time");
      ((TextView)paramViewGroup.findViewById(2131230747)).setText((CharSequence)localObject1);
      ((TextView)paramViewGroup.findViewById(2131230748)).setText(paramView);
      ((TextView)paramViewGroup.findViewById(2131230751)).setText((CharSequence)localObject2);
      localObject1 = (Button)paramViewGroup.findViewById(2131230750);
      ((Button)localObject1).setOnClickListener(HistoryActivity.this.onEditClickListener);
      ((Button)localObject1).setTag(paramView);
      ((Button)localObject1).setText("编辑");
      localObject1 = (Button)paramViewGroup.findViewById(2131230749);
      ((Button)localObject1).setOnClickListener(HistoryActivity.this.onDeleteClickListener);
      ((Button)localObject1).setTag(paramView);
      ((Button)localObject1).setText("删除");
      paramViewGroup.setTag(paramView);
      paramViewGroup.setOnClickListener(HistoryActivity.this.itemClickListener);
      return paramViewGroup;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     HistoryActivity

 * JD-Core Version:    0.7.0.1

 */