package com.soft.apk008.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.lishu.levitate.FloatWindow;
import com.soft.apk008.remainNew.Widget008BaseProvider;

public class BootBroadcastReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext.startService(new Intent(paramContext, ServiceFor008K.class));
    Widget008BaseProvider.a(paramContext);
    paramContext.startService(new Intent(paramContext, FloatWindow.class));
  }
}


