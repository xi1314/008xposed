package com.imengququ.myxposed.soft.tools;

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
  public static final String LOG_TAG = "MockGpsProviderActivity";
  private static final String MOCK_GPS_PROVIDER_INDEX = "008gps";
  private String GPS_MOCK_PROVIDER = "gps";
  private Integer mMockGpsProviderIndex = Integer.valueOf(0);
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903048);
    paramBundle = (TextView)findViewById(2131230774);
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
      paramBundle.setTestProviderEnabled(this.GPS_MOCK_PROVIDER, false);
      paramBundle.clearTestProviderLocation(this.GPS_MOCK_PROVIDER);
      if (!paramBundle.isProviderEnabled(this.GPS_MOCK_PROVIDER))
      {
        paramBundle.addTestProvider(this.GPS_MOCK_PROVIDER, false, false, false, false, true, false, false, 0, 5);
        paramBundle.setTestProviderEnabled(this.GPS_MOCK_PROVIDER, true);
      }
      Location localLocation = new Location(this.GPS_MOCK_PROVIDER);
      localLocation.setLatitude(36.008228110700003D);
      localLocation.setLongitude(103.87400710510001D);
      localLocation.setAltitude(0.0D);
      localLocation.setTime(System.currentTimeMillis());
      paramBundle.setTestProviderLocation(this.GPS_MOCK_PROVIDER, localLocation);
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     MockGpsProviderActivity

 * JD-Core Version:    0.7.0.1

 */