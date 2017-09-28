package de.robv.android.xposed.mods.tutorial;

import android.location.GpsStatus;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Handler;
import java.util.ArrayList;

public final class GpsListener
{
  static GpsListener gpsListener = null;
  Handler handler = new GpsHandle(this);
  private Thread gpsThread = new GpsThread(this);
  private LocationManager locationManager;
  private ArrayList GpsArry = new ArrayList();
  private ArrayList gpsstateArrayList = new ArrayList();
  
  public GpsListener()
  {
    this.gpsThread.start();
  }
  
  public static GpsListener getgpslistener()
  {
    GpsListener locala = new GpsListener();
    gpsListener = locala;
    return locala;
  }
  
  public final void addgpsstatelistener(GpsStatus.Listener paramListener)
  {
    if (!this.gpsstateArrayList.contains(paramListener))
    {
      this.gpsstateArrayList.add(paramListener);
      paramListener.onGpsStatusChanged(1);
      paramListener.onGpsStatusChanged(4);
    }
  }
  
  public final void addlocationlistener(LocationListener paramLocationListener)
  {
    if (!this.GpsArry.contains(paramLocationListener))
    {
      this.GpsArry.add(paramLocationListener);
      paramLocationListener.onProviderEnabled("gps");
    }
  }
  
  public final void setLocationManager(LocationManager paramLocationManager)
  {

    this.locationManager = paramLocationManager;
  }
}


