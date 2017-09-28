package com.imengququ.myxposed.soft.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class MyInstalledReceiver
  extends BroadcastReceiver
{
  public static final String fileName = "UnInstallActivity";
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      if (paramIntent.getAction().equals("android.intent.action.PACKAGE_ADDED"))
      {
        paramContext = paramIntent.getDataString().split(":")[1];
        JSONObject localJSONObject = JSONObject.parseObject(PoseHelper008.getFileData("UnInstallActivity"));
        localJSONObject.put(paramContext, "");
        PoseHelper008.saveDataToFile("UnInstallActivity", JSON.toJSONString(localJSONObject));
      }
      if (paramIntent.getAction().equals("android.intent.action.PACKAGE_REMOVED"))
      {
        paramContext = paramIntent.getDataString().split(":")[1];
        paramIntent = JSONObject.parseObject(PoseHelper008.getFileData("UnInstallActivity"));
        paramIntent.put(paramContext, "");
        PoseHelper008.saveDataToFile("UnInstallActivity", JSON.toJSONString(paramIntent));
      }
      return;
    }
    catch (Exception paramContext) {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     MyInstalledReceiver

 * JD-Core Version:    0.7.0.1

 */