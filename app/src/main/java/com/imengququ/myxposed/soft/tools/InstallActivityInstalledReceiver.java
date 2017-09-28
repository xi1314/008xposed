package com.imengququ.myxposed.soft.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class InstallActivityInstalledReceiver
  extends BroadcastReceiver
{
  public static final String fileName = "UnInstallActivity";
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.intent.action.PACKAGE_ADDED"))
    {
      String str = paramIntent.getDataString().split(":")[1];
      Toast.makeText(paramContext, "安装" + str + "成功", Toast.LENGTH_SHORT).show();
    }
    if (paramIntent.getAction().equals("android.intent.action.PACKAGE_REMOVED")) {
      paramContext = paramIntent.getDataString().split(":")[1];
    }
  }
}


