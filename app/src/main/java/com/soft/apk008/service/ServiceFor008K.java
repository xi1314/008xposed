package com.soft.apk008.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import com.soft.apk008.Apk008Activity;
import com.soft.apk008.LoadActivity;

public class ServiceFor008K
  extends Service
{
  public static Handler a = null;
  MediaPlayer b = null;
  private IBinder c = new a();
  
  public IBinder onBind(Intent paramIntent)
  {
    return this.c;
  }
  
  public void onCreate()
  {
    Log.i("LocalService", "onCreate");
    super.onCreate();
    a = new a(this);
    int i = 2130837509;
    if (!LoadActivity.c) {
      i = 2130837591;
    }
    Notification localNotification = new Notification(i, "服务开启", System.currentTimeMillis());
    localNotification.flags |= 0x20;
    localNotification.flags = 2;
    PendingIntent localPendingIntent = PendingIntent.getActivity(this, 0, new Intent(this, Apk008Activity.class), 0);
    if (LoadActivity.c) {
      localNotification.setLatestEventInfo(this, "008Apk", "008为你守护", localPendingIntent);
    }
    for (;;)
    {
      getSystemService("notification");
      startForeground(1, localNotification);
      return;
      localNotification.setLatestEventInfo(this, "我的手机", "我的手机为你守护", localPendingIntent);
    }
  }
  
  public void onDestroy()
  {
    Log.i("LocalService", "onDestroy");
    super.onDestroy();
    Intent localIntent = new Intent();
    localIntent.setClass(this, ServiceFor008K.class);
    startService(localIntent);
  }
  
  public void onStart(Intent paramIntent, int paramInt)
  {
    Log.i("LocalService", "onStart");
    super.onStart(paramIntent, paramInt);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    Log.i("LocalService", "onStartCommand");
    return 3;
  }
  
  public final class a
    extends Binder
  {
    public a() {}
  }
}


