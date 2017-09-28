package com.soft.tools;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import com.a.a.Map;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class MyWifiNameActivity
  extends Activity
{
  public static Map a;
  public View.OnClickListener b = new cg(this);
  private TextView c;
  private Button d;
  private TextView e;
  private Button f;
  private Switch g;
  
  public static String b()
  {
    int j = d().intValue();
    Object localObject = PoseHelper008.getFileData("mywifi.txt");
    if (((String)localObject).length() == 0) {
      return "";
    }
    localObject = ((String)localObject).split("\n");
    int i = j;
    if (j >= localObject.length) {
      i = 0;
    }
    a.putkey("index", i + 1);
    PoseHelper008.saveDataToFile(".MyWifiNameActivity", a.a());
    return localObject[i].trim();
  }
  
  public static boolean c()
  {
    String str;
    if (a == null) {
      str = PoseHelper008.getFileData(".MyWifiNameActivity");
    }
    try
    {
      a = e.b(str);
      label19:
      if (a == null) {
        a = new Map();
      }
      return a.get("isOpen").equals("true");
    }
    catch (Exception localException)
    {
      break label19;
    }
  }
  
  private static Integer d()
  {
    Object localObject = PoseHelper008.getFileData(".MyWifiNameActivity");
    if (((String)localObject).length() > 0) {}
    try
    {
      a = a.getmap((String)localObject);
      label20:
      if (a == null) {
        a = new Map();
      }
      Integer localInteger = a.g("index");
      localObject = localInteger;
      if (localInteger == null) {
        localObject = Integer.valueOf(0);
      }
      return localObject;
      return Integer.valueOf(0);
    }
    catch (Exception localException)
    {
      break label20;
    }
  }
  
  public final void a()
  {
    Object localObject = PoseHelper008.getFileData(".MyWifiNameActivity");
    try
    {
      a = e.b((String)localObject);
      label13:
      if (a == null) {
        a = new Map();
      }
      String str = a.get("index");
      localObject = str;
      if (str.length() == 0)
      {
        localObject = str;
        if (!str.equals("null")) {
          localObject = "0";
        }
      }
      try
      {
        i = Integer.parseInt((String)localObject);
        localObject = PoseHelper008.getFileData("mywifi.txt");
        if (((String)localObject).length() > 0)
        {
          localObject = ((String)localObject).trim().split("\n");
          this.e.setText("共检测到" + localObject.length + "数据");
          this.c.setText("当前为第" + i + "条");
          if (!c()) {
            break label194;
          }
          this.g.setChecked(true);
        }
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          int i = 0;
          continue;
          a.putkey("index", "0");
        }
        label194:
        this.g.setChecked(false);
        return;
      }
    }
    catch (Exception localException2)
    {
      break label13;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903103);
    this.d = ((Button)findViewById(2131362100));
    this.e = ((TextView)findViewById(2131362101));
    this.c = ((TextView)findViewById(2131362102));
    this.f = ((Button)findViewById(2131362103));
    this.g = ((Switch)findViewById(2131362104));
    a();
    this.d.setOnClickListener(this.b);
    this.f.setOnClickListener(this.b);
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.g.isChecked()) {
      a.putkey("isOpen", "true");
    }
    for (;;)
    {
      PoseHelper008.saveDataToFile(".MyWifiNameActivity", a.a());
      return;
      a.putkey("isOpen", "false");
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.MyWifiNameActivity

 * JD-Core Version:    0.7.0.1

 */