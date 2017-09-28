package com.soft.tools;

import android.app.Activity;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.widget.TextView;

public class MockGpsProviderActivity
  extends Activity
{
  private Integer a = Integer.valueOf(0);
  private String b = "gps";
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903051);
    paramBundle = (TextView)findViewById(2131361860);
    try
    {
      if (Settings.Secure.getLong(getContentResolver(), "mock_location") == 0L)
      {
        paramBundle.setText("请在开发者选项中，勾选允许位置模拟");
        return;
      }
    }
    catch (Settings.SettingNotFoundException paramBundle)
    {
      paramBundle.printStackTrace();
      paramBundle = (LocationManager)getSystemService("location");
      paramBundle.setTestProviderEnabled(this.b, false);
      paramBundle.clearTestProviderLocation(this.b);
      if (!paramBundle.isProviderEnabled(this.b))
      {
        paramBundle.addTestProvider(this.b, false, false, false, false, true, false, false, 0, 5);
        paramBundle.setTestProviderEnabled(this.b, true);
      }
      Location localLocation = new Location(this.b);
      localLocation.setLatitude(36.008228110700003D);
      localLocation.setLongitude(103.87400710510001D);
      localLocation.setAltitude(0.0D);
      localLocation.setTime(System.currentTimeMillis());
      paramBundle.setTestProviderLocation(this.b, localLocation);
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.MockGpsProviderActivity
 * JD-Core Version:    0.7.0.1
 */