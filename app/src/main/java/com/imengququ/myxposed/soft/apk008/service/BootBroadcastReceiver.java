package com.imengququ.myxposed.soft.apk008.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootBroadcastReceiver
  extends BroadcastReceiver
{
  //广播接受执行
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext.startService(new Intent(paramContext, ServiceFor008K.class));
  }
}

