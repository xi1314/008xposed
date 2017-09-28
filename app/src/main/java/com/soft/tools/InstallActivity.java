package com.soft.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.a.a.Map;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class InstallActivity
  extends Activity
{
  public static int b;
  View.OnClickListener a = new bm(this);
  private Button c;
  private Button d;
  private ListView e;
  private b f = new b();
  private a g;
  private ProgressDialog h;
  private InstallActivityInstalledReceiver i;
  
  private static String a(Context paramContext, Uri paramUri)
  {
    if ("content".equalsIgnoreCase(paramUri.getScheme())) {}
    try
    {
      paramContext = paramContext.getContentResolver().query(paramUri, new String[] { "_data" }, null, null, null);
      int j = paramContext.getColumnIndexOrThrow("_data");
      if (!paramContext.moveToFirst()) {
        break label79;
      }
      paramContext = paramContext.getString(j);
      return paramContext;
    }
    catch (Exception paramContext) {}
    if ("file".equalsIgnoreCase(paramUri.getScheme())) {
      return paramUri.getPath();
    }
    label79:
    return null;
  }
  
  public final void a()
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
  
  public final void a(String paramString)
  {
    int j = 0;
    for (;;)
    {
      if (j >= this.f.size()) {}
      for (;;)
      {
        this.g.notifyDataSetChanged();
        return;
        Map locale = (Map)this.f.get(j);
        if (!((String)locale.get("fileName")).equals(paramString)) {
          break;
        }
        this.f.remove(locale);
      }
      j += 1;
    }
  }
  
  public final void b()
  {
    this.h.setProgress(0);
    this.h.show();
    new bn(this).start();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramIntent != null) && (paramInt2 == -1))
    {
      String str = a(this, paramIntent.getData());
      Map locale = new Map();
      locale.putkey("fileName", str);
      this.f.add(locale);
      this.g.notifyDataSetChanged();
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903096);
    this.c = ((Button)findViewById(2131362086));
    this.d = ((Button)findViewById(2131362087));
    this.e = ((ListView)findViewById(2131362085));
    this.f = a.c(PoseHelper008.getFileData("tool_installActivity"));
    if (this.f == null) {
      this.f = new b();
    }
    this.g = new a();
    this.e.setAdapter(this.g);
    this.c.setOnClickListener(this.a);
    this.d.setOnClickListener(this.a);
    this.h = new ProgressDialog(this);
    this.h.setTitle("正在安装，请稍候。");
    this.h.setProgressStyle(1);
    this.h.hide();
    this.h.setMax(100);
    this.i = new InstallActivityInstalledReceiver();
    paramBundle = new IntentFilter();
    paramBundle.addDataScheme("package");
    paramBundle.addAction("android.intent.action.PACKAGE_ADDED");
    registerReceiver(this.i, paramBundle);
  }
  
  protected void onDestroy()
  {
    PoseHelper008.saveDataToFile("tool_installActivity", a.a(this.f));
    unregisterReceiver(this.i);
    super.onDestroy();
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return InstallActivity.c(InstallActivity.this).size();
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
        paramViewGroup = ((LayoutInflater)InstallActivity.this.getSystemService("layout_inflater")).inflate(2130903097, null);
        paramView = new InstallActivity.b(InstallActivity.this);
        paramView.a = ((TextView)paramViewGroup.findViewById(2131362088));
        paramView.b = ((Button)paramViewGroup.findViewById(2131362089));
        paramViewGroup.setTag(paramView);
      }
      paramView = (InstallActivity.b)paramViewGroup.getTag();
      String str = (String)((Map)InstallActivity.c(InstallActivity.this).get(paramInt)).get("fileName");
      paramView.a.setText(str);
      paramView.b.setOnClickListener(new bq(this, str));
      return paramViewGroup;
    }
  }
  
  final class b
  {
    public TextView a;
    public Button b;
    
    b() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.InstallActivity

 * JD-Core Version:    0.7.0.1

 */