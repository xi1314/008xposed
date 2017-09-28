package com.imengququ.myxposed.soft.tools;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import com.alibaba.fastjson.JSONObject;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class BackupFileSettingsActivity
  extends Activity
{
  private static String iniFile = ".BackupFileActivity_set";
  private static JSONObject jsonObject;
  private CheckBox oneImei;
  
  static
  {
    if ("null".equals(getValue("oneImei")))
    {
      jsonObject.put("oneImei", "true");
      PoseHelper008.saveDataToFile(iniFile, jsonObject.toJSONString());
    }
  }
  
  public static String getValue(String paramString)
  {
    String str = PoseHelper008.getFileData(iniFile);
    if (str.length() > 0) {
      jsonObject = JSONObject.parseObject(str);
    }
    if (jsonObject == null) {
      jsonObject = new JSONObject();
    }
    return jsonObject.get(paramString);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903071);
    this.oneImei = ((CheckBox)findViewById(2131230875));
    if ("true".equals(getValue("oneImei"))) {
      this.oneImei.setChecked(true);
    }
  }
  
  protected void onDestroy()
  {
    if (this.oneImei.isChecked()) {
      jsonObject.put("oneImei", "true");
    }
    for (;;)
    {
      PoseHelper008.saveDataToFile(iniFile, jsonObject.toJSONString());
      super.onDestroy();
      return;
      jsonObject.put("oneImei", "false");
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     BackupFileSettingsActivity

 * JD-Core Version:    0.7.0.1

 */