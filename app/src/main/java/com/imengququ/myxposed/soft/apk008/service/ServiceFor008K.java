package com.imengququ.myxposed.soft.apk008.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.soft.apk008.Apk008Activity;

public class ServiceFor008K
  extends Service
{
  private static final String TAG = "LocalService";
  private IBinder binder = new LocalBinder();
  MediaPlayer mediaPlayer = null;
  
  public IBinder onBind(Intent paramIntent)
  {
    return this.binder;
  }
  
  public void onCreate()
  {
    Log.i("LocalService", "onCreate");
    super.onCreate();
    Notification localNotification = new Notification(2130837508, "服务开启", System.currentTimeMillis());
    localNotification.flags |= 0x20;
    localNotification.flags = 2;
    localNotification.setLatestEventInfo(this, "008Apk", "008为你守护", PendingIntent.getActivity(this, 0, new Intent(this, Apk008Activity.class), 0));
    NotificationManager localNotificationManager = (NotificationManager)getSystemService("notification");
    startForeground(1, localNotification);
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
  
  public class LocalBinder
    extends Binder
  {
    public LocalBinder() {}
    
    ServiceFor008K getService()
    {
      return ServiceFor008K.this;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     ServiceFor008K

 * JD-Core Version:    0.7.0.1

 */