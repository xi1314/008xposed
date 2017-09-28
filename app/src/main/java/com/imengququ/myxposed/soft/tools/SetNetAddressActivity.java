package com.imengququ.myxposed.soft.tools;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.CheckBox;
import android.widget.EditText;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class SetNetAddressActivity
  extends Activity
{
  static String SetNetAddressActivity_address = "SetNetAddressActivity_address";
  static String SetNetAddressActivity_open = "SetNetAddressActivity_open";
  CheckBox box;
  EditText text;
  
  public static String getMyAddress()
  {
    return PoseHelper008.getFileData(SetNetAddressActivity_address);
  }
  
  public static boolean isMyNetOpen()
  {
    return PoseHelper008.getFileData(SetNetAddressActivity_open).equals("true");
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903082);
    this.text = ((EditText)findViewById(2131230924));
    this.box = ((CheckBox)findViewById(2131230925));
    paramBundle = PoseHelper008.getFileData(SetNetAddressActivity_address);
    this.text.setText(paramBundle);
    if (PoseHelper008.getFileData(SetNetAddressActivity_open).equals("true"))
    {
      this.box.setChecked(true);
      return;
    }
    this.box.setChecked(false);
  }
  
  protected void onDestroy()
  {
    PoseHelper008.saveDataToFile(SetNetAddressActivity_address, this.text.getText().toString());
    if (this.box.isChecked()) {
      PoseHelper008.saveDataToFile(SetNetAddressActivity_open, "true");
    }
    for (;;)
    {
      super.onDestroy();
      return;
      PoseHelper008.saveDataToFile(SetNetAddressActivity_open, "false");
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     SetNetAddressActivity

 * JD-Core Version:    0.7.0.1

 */