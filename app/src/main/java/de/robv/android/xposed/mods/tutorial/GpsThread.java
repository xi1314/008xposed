package de.robv.android.xposed.mods.tutorial;

import android.location.Location;
import android.os.Message;

final class GpsThread
  extends Thread
{
  GpsThread(GpsListener parama) {}
  
  public final void run()
  {
    for (;;)
    {
      try
      {
        Object localObject = ((String)PoseHelper008.valueMap.get("gps")).split("_");
        if (localObject.length == 2)
        {
          d2 = Double.parseDouble(localObject[0]);
          d1 = Double.parseDouble(localObject[1]);
          localObject = new Location("gps");
          ((Location)localObject).setLatitude(d2);
          ((Location)localObject).setLongitude(d1);
          ((Location)localObject).setAltitude(0.0D);
          ((Location)localObject).setAccuracy(10.0F);
          ((Location)localObject).setSpeed(0.1F);
          ((Location)localObject).setTime(System.currentTimeMillis());
          Message localMessage = new Message();
          localMessage.obj = localObject;
          this.a.a.sendMessage(localMessage);
          Thread.sleep(7000L);
          continue;
          continue;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
      }
      double d1 = 0.0D;
      double d2 = 0.0D;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     de.robv.android.xposed.mods.tutorial.saveaccountdatatoFile

 * JD-Core Version:    0.7.0.1

 */