package com.soft.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class InstallActivityInstalledReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.intent.action.PACKAGE_ADDED"))
    {
      String str = paramIntent.getDataString().split(":")[1];
      Toast.makeText(paramContext, "安装" + str + "成功", 0).show();
    }
    if (paramIntent.getAction().equals("android.intent.action.PACKAGE_REMOVED")) {
      paramIntent.getDataString().split(":");
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.InstallActivityInstalledReceiver
 * JD-Core Version:    0.7.0.1
 */