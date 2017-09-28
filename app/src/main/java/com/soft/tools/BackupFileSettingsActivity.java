package com.soft.tools;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import com.a.a.Map;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

import java.io.File;
import java.io.FileOutputStream;

public class BackupFileSettingsActivity
  extends Activity
{
  public static String a;
  public static String b;
  private static String j = ".BackupFileActivity_set";
  private static Map k;
  private CheckBox c;
  private RadioButton d;
  private Button e;
  private RadioButton f;
  private RadioButton g;
  private CheckBox h;
  private CheckBox i;
  
  static
  {
    a = "busybox008";
    b = "/data/data/" + PoseHelper008.packageName + "/" + a;
    if ("null".equals(a("oneImei")))
    {
      k.putkey("oneImei", "true");
      PoseHelper008.saveDataToFile(j, k.a());
    }
  }
  
  public static String a(String paramString)
  {
    String str = PoseHelper008.getFileData(j);
    if (str.length() > 0) {
      k = e.b(str);
    }
    if (k == null) {
      k = new Map();
    }
    return k.get(paramString);
  }
  
  public static void a(Context paramContext)
  {
    try
    {
      Object localObject = new File(b);
      if (((File)localObject).exists()) {
        ((File)localObject).delete();
      }
      ((File)localObject).createNewFile();
      paramContext = paramContext.getAssets().open("busybox-arm.png");
      localObject = new FileOutputStream((File)localObject);
      byte[] arrayOfByte = new byte[8192];
      for (;;)
      {
        int m = paramContext.read(arrayOfByte);
        if (m <= 0)
        {
          ((FileOutputStream)localObject).close();
          paramContext.close();
          h.a("chmod 777 " + b, true);
          return;
        }
        ((FileOutputStream)localObject).write(arrayOfByte, 0, m);
      }
      return;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903084);
    this.c = ((CheckBox)findViewById(2131362029));
    this.d = ((RadioButton)findViewById(2131362034));
    this.f = ((RadioButton)findViewById(2131362032));
    this.g = ((RadioButton)findViewById(2131362033));
    this.h = ((CheckBox)findViewById(2131362030));
    this.i = ((CheckBox)findViewById(2131362031));
    this.e = ((Button)findViewById(2131362035));
    if ("true".equals(a("oneImei"))) {
      this.c.setChecked(true);
    }
    paramBundle = a("busyBoxName");
    if (b.equals(paramBundle))
    {
      this.d.setChecked(true);
      if (!a("autoBackUp").equals("true")) {
        break label236;
      }
      this.h.setChecked(true);
      label168:
      if (!a("autoRestore").equals("true")) {
        break label247;
      }
      this.i.setChecked(true);
    }
    for (;;)
    {
      this.e.setOnClickListener(new r(this));
      return;
      if ("busybox".equals(paramBundle))
      {
        this.g.setChecked(true);
        break;
      }
      this.f.setChecked(true);
      break;
      label236:
      this.h.setChecked(false);
      break label168;
      label247:
      this.i.setChecked(false);
    }
  }
  
  protected void onPause()
  {
    String str;
    if (this.c.isChecked())
    {
      k.putkey("oneImei", "true");
      str = "";
      if (!this.d.isChecked()) {
        break label122;
      }
      str = b;
      label38:
      k.putkey("busyBoxName", str);
      if (!this.h.isChecked()) {
        break label138;
      }
      k.putkey("autoBackUp", "true");
      label69:
      if (!this.i.isChecked()) {
        break label152;
      }
      k.putkey("autoRestore", "true");
    }
    for (;;)
    {
      PoseHelper008.saveDataToFile(j, k.a());
      super.onPause();
      return;
      k.putkey("oneImei", "false");
      break;
      label122:
      if (!this.g.isChecked()) {
        break label38;
      }
      str = "busybox";
      break label38;
      label138:
      k.putkey("autoBackUp", "false");
      break label69;
      label152:
      k.putkey("autoRestore", "false");
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.BackupFileSettingsActivity

 * JD-Core Version:    0.7.0.1

 */