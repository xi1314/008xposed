package com.soft.tools;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.CheckBox;
import android.widget.EditText;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class SetNetAddressActivity
  extends Activity
{
  static String c = "SetNetAddressActivity_address";
  static String d = "SetNetAddressActivity_open";
  static String e = "SetNetAddressActivity_closeRandom";
  EditText a;
  CheckBox b;
  private CheckBox f;
  
  public static boolean a()
  {
    return PoseHelper008.getFileData(d).equals("true");
  }
  
  public static boolean b()
  {
    return PoseHelper008.getFileData(e).equals("true");
  }
  
  public static String c()
  {
    return PoseHelper008.getFileData(c);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903119);
    this.a = ((EditText)findViewById(2131362176));
    this.b = ((CheckBox)findViewById(2131362177));
    this.f = ((CheckBox)findViewById(2131362178));
    paramBundle = PoseHelper008.getFileData(c);
    this.a.setText(paramBundle);
    if (PoseHelper008.getFileData(d).equals("true")) {
      this.b.setChecked(true);
    }
    while (PoseHelper008.getFileData(e).equals("true"))
    {
      this.f.setChecked(true);
      return;
      this.b.setChecked(false);
    }
    this.f.setChecked(false);
  }
  
  protected void onDestroy()
  {
    PoseHelper008.saveDataToFile(c, this.a.getText().toString());
    if (this.b.isChecked())
    {
      PoseHelper008.saveDataToFile(d, "true");
      if (!this.f.isChecked()) {
        break label74;
      }
      PoseHelper008.saveDataToFile(e, "true");
    }
    for (;;)
    {
      super.onDestroy();
      return;
      PoseHelper008.saveDataToFile(d, "false");
      break;
      label74:
      PoseHelper008.saveDataToFile(e, "false");
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.SetNetAddressActivity
 * JD-Core Version:    0.7.0.1
 */