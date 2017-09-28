package com.imengququ.myxposed.soft.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import de.robv.android.xposed.mods.tutorial.Shell;

public class InstallActivity
  extends Activity
{
  public static final String fileName = "tool_installActivity";
  public static int total;
  private MyAdapter adapter;
  private Button buttonAdd;
  private Button buttonInstall;
  private JSONArray data = new JSONArray();
  private ListView listView;
  OnClickListener listener = new OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (InstallActivity.this.buttonAdd.equals(paramAnonymousView)) {
        InstallActivity.this.add();
      }
      while (!InstallActivity.this.buttonInstall.equals(paramAnonymousView)) {
        return;
      }
      InstallActivity.this.install();
    }
  };
  private ProgressDialog mProgress;
  private InstallActivityInstalledReceiver receiveBroadCast;
  
  public static String getPath(Context paramContext, Uri paramUri)
  {
    if ("content".equalsIgnoreCase(paramUri.getScheme())) {

    }
    try
    {
      Cursor cursor = paramContext.getContentResolver().query(paramUri, new String[] { "_data" }, null, null, null);
      int i = cursor.getColumnIndexOrThrow("_data");
      if (!cursor.moveToFirst()) {
        break label79;
      }
     String paramContextString = cursor.getString(i);
      return paramContextString;
    }
    catch (Exception e) {

    }
    if ("file".equalsIgnoreCase(paramUri.getScheme())) {
      return paramUri.getPath();
    }
    label79:
    return null;
  }
  
  private void showFileChooser()
  {
    Intent localIntent = new Intent("android.intent.action.GET_CONTENT");
    localIntent.setType("*/*");
    localIntent.addCategory("android.intent.category.OPENABLE");
    try
    {
      startActivityForResult(Intent.createChooser(localIntent, "选择文件"), 1);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Toast.makeText(this, "请安装一个文件管理器", 0).show();
    }
  }
  
  public void add()
  {
    showFileChooser();
  }
  
  public void deleteItem(String paramString)
  {
    int i = 0;

      for (i=0;i <this.data.size();i++) {
        JSONObject localJSONObject = (JSONObject)this.data.get(i);
        if (((String)localJSONObject.get("fileName")).equals(paramString)){

          this.data.remove(localJSONObject);
        }
      }
    this.adapter.notifyDataSetChanged();

  }
  
  public void install()
  {
    this.mProgress.setProgress(0);
    this.mProgress.show();
    new Thread()
    {
      public void run()
      {
        InstallActivity.this.runOnUiThread(new Runnable()
        {
          public void run()
          {
            Toast.makeText(InstallActivity.this, "安装中", 0).show();
          }
        });

        InstallActivity.total = InstallActivity.this.data.size();
        int i ;
        for (i=0;i <InstallActivity.this.data.size();i++)
        {

          String str = (String)((JSONObject)InstallActivity.this.data.get(i)).get("fileName");
          Shell.execCommand("pm install " + str, true, false);

        }
        if(i>=InstallActivity.this.data.size()){
        InstallActivity.this.runOnUiThread(new Runnable()
        {
          public void run()
          {
            InstallActivity.this.mProgress.hide();
          }
        });}
      }
    }.start();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramIntent != null) && (paramInt2 == -1))
    {
      String str = getPath(this, paramIntent.getData());
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("fileName", str);
      this.data.add(localJSONObject);
      this.adapter.notifyDataSetChanged();
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903075);
    this.buttonAdd = ((Button)findViewById(2131230888));
    this.buttonInstall = ((Button)findViewById(2131230889));
    this.listView = ((ListView)findViewById(2131230887));
    this.data = JSON.parseArray(PoseHelper008.getFileData("tool_installActivity"));
    if (this.data == null) {
      this.data = new JSONArray();
    }
    this.adapter = new MyAdapter();
    this.listView.setAdapter(this.adapter);
    this.buttonAdd.setOnClickListener(this.listener);
    this.buttonInstall.setOnClickListener(this.listener);
    this.mProgress = new ProgressDialog(this);
    this.mProgress.setTitle("正在安装，请稍候。");
    this.mProgress.setProgressStyle(1);
    this.mProgress.hide();
    this.mProgress.setMax(100);
    this.receiveBroadCast = new InstallActivityInstalledReceiver();
    paramBundle = new IntentFilter();
    paramBundle.addDataScheme("package");
    paramBundle.addAction("android.intent.action.PACKAGE_ADDED");
    registerReceiver(this.receiveBroadCast, paramBundle);
  }
  
  protected void onDestroy()
  {
    PoseHelper008.saveDataToFile("tool_installActivity", JSON.toJSONString(this.data));
    unregisterReceiver(this.receiveBroadCast);
    super.onDestroy();
  }
  
  class MyAdapter
    extends BaseAdapter
  {
    MyAdapter() {}
    
    public int getCount()
    {
      return InstallActivity.this.data.size();
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
      if (paramView == null)
      {
        paramViewGroup = ((LayoutInflater)InstallActivity.this.getSystemService("layout_inflater")).inflate(2130903076, null);
        paramView = new ViewHolder(InstallActivity.this);
        paramView.text = ((TextView)paramViewGroup.findViewById(2131230890));
        paramView.button = ((Button)paramViewGroup.findViewById(2131230891));
        paramViewGroup.setTag(paramView);
      }
      paramView = (ViewHolder)paramViewGroup.getTag();
      final String str = (String)((JSONObject)InstallActivity.this.data.get(paramInt)).get("fileName");
      paramView.text.setText(str);
      paramView.button.setOnClickListener(new OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          InstallActivity.this.deleteItem(str);
        }
      });
      return paramViewGroup;
    }
  }
  
  class ViewHolder
  {
    public Button button;
    public TextView text;
    
    ViewHolder() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     InstallActivity

 * JD-Core Version:    0.7.0.1

 */