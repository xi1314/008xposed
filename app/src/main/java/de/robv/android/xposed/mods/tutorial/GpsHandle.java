package de.robv.android.xposed.mods.tutorial;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import java.util.Iterator;

final class GpsHandle
  extends Handler
{
  GpsHandle(GpsListener parama) {}
  
  public final void handleMessage(Message paramMessage)
  {
   Location location = (Location)paramMessage.obj;
    Iterator localIterator = GpsListener.a(this.a).iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      LocationListener localLocationListener = (LocationListener)localIterator.next();
      localLocationListener.onStatusChanged("gps", 2, new Bundle());
      localLocationListener.onLocationChanged(location);
    }
  }
}


