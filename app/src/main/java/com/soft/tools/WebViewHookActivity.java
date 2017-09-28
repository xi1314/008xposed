package com.soft.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.a.a.Map;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class WebViewHookActivity
  extends Activity
{
  public View.OnClickListener a = new fb(this);
  private EditText b;
  private Button c;
  private EditText d;
  private Button e;
  private Button f;
  private CheckBox g;
  
  public static Map a()
  {
    Object localObject2 = PoseHelper008.getFileData("WebViewHookActivity_set");
    Object localObject1 = null;
    try
    {
      localObject2 = e.b((String)localObject2);
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new Map();
    }
    return localObject2;
  }
  
  public static void a(String paramString)
  {
    PoseHelper008.saveDataToFile("WebViewHookActivity", c() + "\nstart" + paramString + "\nend");
  }
  
  public static void b()
  {
    PoseHelper008.saveDataToFile("WebViewHookActivity", "");
  }
  
  private static String c()
  {
    return PoseHelper008.getFileData("WebViewHookActivity").trim();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 != 1) || (paramIntent == null)) {
      return;
    }
    paramIntent = paramIntent.getStringExtra("packageName");
    this.b.setText(paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903127);
    this.b = ((EditText)findViewById(2131362196));
    this.c = ((Button)findViewById(2131362197));
    this.d = ((EditText)findViewById(2131362198));
    this.e = ((Button)findViewById(2131362199));
    this.f = ((Button)findViewById(2131362200));
    this.g = ((CheckBox)findViewById(2131362201));
    this.c.setOnClickListener(this.a);
    this.e.setOnClickListener(this.a);
    this.f.setOnClickListener(this.a);
    this.d.setText(c());
    Object localObject = a();
    paramBundle = ((Map)localObject).get("setStr");
    localObject = ((Map)localObject).get("open");
    this.b.setText(paramBundle);
    if (((String)localObject).equals("true"))
    {
      this.g.setChecked(true);
      return;
    }
    this.g.setChecked(false);
  }
  
  protected void onDestroy()
  {
    Map locale = a();
    String str = this.b.getText().toString();
    boolean bool = this.g.isChecked();
    locale.putkey("setStr", str);
    locale.putkey("open", bool);
    PoseHelper008.saveDataToFile("WebViewHookActivity_set", locale.a());
    super.onDestroy();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.WebViewHookActivity

 * JD-Core Version:    0.7.0.1

 */