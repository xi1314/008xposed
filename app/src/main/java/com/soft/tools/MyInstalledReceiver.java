package com.soft.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.a.a.maputils;
import com.a.a.Map;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class MyInstalledReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      if (paramIntent.getAction().equals("android.intent.action.PACKAGE_ADDED"))
      {
        paramContext = paramIntent.getDataString().split(":")[1];
        Map locale = Map.getmap(PoseHelper008.getFileData("UnInstallActivity"));
        locale.putkey(paramContext, "");
        PoseHelper008.saveDataToFile("UnInstallActivity", maputils.creatmap(locale));
      }
      if (paramIntent.getAction().equals("android.intent.action.PACKAGE_REMOVED"))
      {
        paramContext = paramIntent.getDataString().split(":")[1];
        paramIntent = Map.getmap(PoseHelper008.getFileData("UnInstallActivity"));
        paramIntent.a(paramContext, "");
        PoseHelper008.saveDataToFile("UnInstallActivity", maputils.creatmap(paramIntent));
      }
      return;
    }
    catch (Exception paramContext) {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.MyInstalledReceiver

 * JD-Core Version:    0.7.0.1

 */