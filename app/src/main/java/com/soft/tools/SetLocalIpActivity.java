package com.soft.tools;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class SetLocalIpActivity
  extends Activity
{
  public static String a;
  public static int b = -1;
  private EditText c;
  private Spinner d;
  
  public static String a()
  {
    Object localObject;
    if (a == null)
    {
      localObject = PoseHelper008.getFileData("SetLocalIpActivity");
      if ((((String)localObject).length() != 0) && (((String)localObject).indexOf("_") >= 0)) {
        break label41;
      }
      a = "192.168.1.100";
    }
    for (b = 1;; b = Integer.parseInt(localObject[1]))
    {
      return a;
      label41:
      localObject = ((String)localObject).split("_");
      a = localObject[0];
    }
  }
  
  public static int b()
  {
    Object localObject;
    if (b == -1)
    {
      localObject = PoseHelper008.getFileData("SetLocalIpActivity");
      if ((((String)localObject).length() != 0) && (((String)localObject).indexOf("_") >= 0)) {
        break label42;
      }
      a = "192.168.1.100";
    }
    for (b = 1;; b = Integer.parseInt(localObject[1]))
    {
      return b;
      label42:
      localObject = ((String)localObject).split("_");
      a = localObject[0];
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903120);
    paramBundle = (Button)findViewById(2131362181);
    this.c = ((EditText)findViewById(2131362179));
    Object localObject = PoseHelper008.getFileData("SetLocalIpActivity");
    if ((((String)localObject).length() == 0) || (((String)localObject).indexOf("_") < 0)) {
      a = "192.168.1.100";
    }
    for (b = 1;; b = Integer.parseInt(localObject[1]))
    {
      this.c.setText(a);
      paramBundle.setOnClickListener(new ej(this));
      this.d = ((Spinner)findViewById(2131362180));
      paramBundle = new ArrayAdapter(this, 17367048, new String[] { "一位", "两位", "三位", "四位" });
      this.d.setAdapter(paramBundle);
      this.d.setSelection(b - 1);
      return;
      localObject = ((String)localObject).split("_");
      a = localObject[0];
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.SetLocalIpActivity
 * JD-Core Version:    0.7.0.1
 */