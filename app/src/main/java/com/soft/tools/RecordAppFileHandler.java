package com.soft.tools;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.a.a.Map;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;

import java.io.File;

public class RecordAppFileHandler
  extends Activity
{
  public static Map b;
  static String d = null;
  static String e = null;
  ProgressDialog a;
  View.OnClickListener c = new do(this);
  private EditText f;
  private Button g;
  private Button h;
  private EditText i;
  private Button j;
  private CheckBox k;
  
  public static void a(Context paramContext, boolean paramBoolean)
  {
    if ((PoseHelper008.valueMap == null) || (PoseHelper008.valueMap.size() == 0)) {}
    do
    {
      do
      {
        return;
        localObject1 = c();
      } while (((String)localObject1).trim().length() <= 0);
      localObject1 = ((String)localObject1).split("_");
    } while (localObject1.length != 2);
    Object localObject1 = localObject1[1];
    String[] arrayOfString = f.a((String)localObject1).split("\n");
    int i2 = arrayOfString.length;
    int m = 0;
    for (n = 0;; n = i1)
    {
      if (m >= i2)
      {
        if (paramBoolean) {
          Toast.makeText(paramContext, "清除成功,共清除" + n + "个文件", 0).show();
        }
        if (!RecordAppFileHandlerSetting.c()) {
          break;
        }
        f.d((String)localObject1);
        return;
      }
      Object localObject2 = arrayOfString[m];
      if (RecordAppFileHandlerSetting.b())
      {
        i1 = n;
        if (((String)localObject2).endsWith(".apk")) {}
      }
      else
      {
        i1 = n;
        if (RecordAppFileHandlerSetting.a((String)localObject2))
        {
          localObject2 = new File(((String)localObject2).trim());
          i1 = n;
          if (((File)localObject2).exists())
          {
            i1 = n;
            if (!((File)localObject2).isFile()) {}
          }
        }
      }
      try
      {
        ((File)localObject2).delete();
        i1 = n + 1;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          i1 = n;
        }
      }
      m += 1;
    }
  }
  
  public static void a(String paramString)
  {
    String str;
    if (b == null) {
      str = PoseHelper008.getFileData("RecordAppFileHandler");
    }
    try
    {
      b = e.b(str);
      label19:
      if (b == null) {
        b = new Map();
      }
      d = paramString;
      b.putkey("file_hook_package", paramString);
      b.putkey("file_hook_package_open", "true");
      PoseHelper008.saveDataToFile("RecordAppFileHandler", b.a());
      return;
    }
    catch (Exception localException)
    {
      break label19;
    }
  }
  
  public static String c()
  {
    String str;
    if (b == null) {
      str = PoseHelper008.getFileData("RecordAppFileHandler");
    }
    try
    {
      b = e.b(str);
      label19:
      if (b == null) {
        b = new Map();
      }
      str = b.get("file_hook_package");
      d = str;
      return str;
    }
    catch (Exception localException)
    {
      break label19;
    }
  }
  
  public static String d()
  {
    String str;
    if (b == null) {
      str = PoseHelper008.getFileData("RecordAppFileHandler");
    }
    try
    {
      b = e.b(str);
      label19:
      if (b == null) {
        b = new Map();
      }
      str = b.get("file_hook_package_open");
      e = str;
      return str;
    }
    catch (Exception localException)
    {
      break label19;
    }
  }
  
  public final void a()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("注意");
    localBuilder.setMessage("是否删除记录");
    localBuilder.setNegativeButton("确定", new dr(this));
    localBuilder.setPositiveButton("取消", new ds(this));
    localBuilder.create().show();
  }
  
  public final void b()
  {
    String str = this.f.getText().toString();
    String[] arrayOfString;
    int i2;
    int m;
    if (str.trim().length() > 0)
    {
      str = str.split("_")[1];
      arrayOfString = f.a(str).split("\n");
      i2 = arrayOfString.length;
      m = 0;
    }
    for (n = 0;; n = i1)
    {
      if (m >= i2)
      {
        Toast.makeText(this, "清除成功,共清除" + n + "个文件", 0).show();
        if (RecordAppFileHandlerSetting.c()) {
          f.d(str);
        }
        return;
      }
      Object localObject = arrayOfString[m];
      if (RecordAppFileHandlerSetting.b())
      {
        i1 = n;
        if (((String)localObject).endsWith(".apk")) {}
      }
      else
      {
        i1 = n;
        if (RecordAppFileHandlerSetting.a((String)localObject))
        {
          localObject = new File(((String)localObject).trim());
          i1 = n;
          if (((File)localObject).exists())
          {
            i1 = n;
            if (!((File)localObject).isFile()) {}
          }
        }
      }
      try
      {
        ((File)localObject).delete();
        i1 = n + 1;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          i1 = n;
        }
      }
      m += 1;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 != 1) || (paramIntent == null)) {
      return;
    }
    paramIntent = paramIntent.getStringExtra("packageName");
    PoseHelper008.valueMap.putkey("file_hook_package", paramIntent);
    this.f.setText(paramIntent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903112);
    e = null;
    this.f = ((EditText)findViewById(2131362158));
    this.g = ((Button)findViewById(2131362159));
    this.i = ((EditText)findViewById(2131362160));
    this.h = ((Button)findViewById(2131362161));
    this.j = ((Button)findViewById(2131362162));
    this.k = ((CheckBox)findViewById(2131362163));
    this.g.setOnClickListener(this.c);
    this.h.setOnClickListener(this.c);
    this.j.setOnClickListener(this.c);
    this.a = new ProgressDialog(this);
    this.a.setCancelable(false);
    this.a.setMessage("文件读取中，请稍候");
    this.a.show();
    PoseHelper008.initData(this);
    this.f.setText(c());
    paramBundle = this.f.getText().toString();
    if (paramBundle.trim().length() > 0)
    {
      paramBundle = paramBundle.split("_");
      if (paramBundle.length == 2) {
        new dp(this, paramBundle[1]).start();
      }
    }
    for (;;)
    {
      if (d().equals("true")) {
        this.k.setChecked(true);
      }
      return;
      this.a.cancel();
      continue;
      this.a.cancel();
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296279, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    String str;
    if (this.k.isChecked())
    {
      str = "true";
      PoseHelper008.valueMap.putkey("file_hook_package_open", "true");
    }
    for (;;)
    {
      b.putkey("file_hook_package", this.f.getText().toString().trim());
      b.putkey("file_hook_package_open", str);
      PoseHelper008.saveDataToFile("RecordAppFileHandler", b.a());
      PoseHelper008.saveData();
      super.onDestroy();
      return;
      str = "false";
      PoseHelper008.valueMap.putkey("file_hook_package_open", "false");
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362315)
    {
      paramMenuItem = new Intent();
      paramMenuItem.setClass(this, RecordAppFileHandlerSetting.class);
      startActivity(paramMenuItem);
    }
    return true;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.RecordAppFileHandler

 * JD-Core Version:    0.7.0.1

 */