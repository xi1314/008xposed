package com.soft.apk008;

import android.widget.RadioButton;
import android.widget.Toast;

import com.a.a.Map;
import com.data.simulate.SimulateDataTest;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class bg
  implements Runnable
{
  bg(be parambe, String paramString) {}
  
  public final void run()
  {
    SetDataActivity.a(this.a.a);
    for (;;)
    {
      Object localObject3;
      String str;
      int i;
      try
      {
        localObject3 = Map.getmap(this.b);
        ((Map)localObject3).remove("getString");
        ((Map)localObject3).remove("getString2");
        ((Map)localObject3).remove("getLine1Number");
        ((Map)localObject3).remove("getSimSerialNumber");
        ((Map)localObject3).remove("getSubscriberId");
        ((Map)localObject3).remove("getSimCountryIso");
        ((Map)localObject3).remove("getSimOperator");
        ((Map)localObject3).remove("getSimOperatorName");
        ((Map)localObject3).remove("getNetworkCountryIso");
        ((Map)localObject3).remove("getNetworkOperator");
        ((Map)localObject3).remove("getNetworkOperatorName");
        ((Map)localObject3).remove("getNetworkType");
        ((Map)localObject3).remove("getPhoneType");
        ((Map)localObject3).remove("getSimState");
        ((Map)localObject3).remove("getMacAddress");
        ((Map)localObject3).remove("getSSID");
        ((Map)localObject3).remove("getBSSID");
        Object localObject1 = ((Map)localObject3).getStringfrommap("getMetrics");
        ((Map)localObject3).putkey("getMetrics", ((String)localObject1).subSequence(0, ((String)localObject1).indexOf(" ")));
        localObject1 = ((Map)localObject3).getStringfrommap("getDeviceId");
        String[] arrayOfString;
        if (((String)localObject1).length() > 10)
        {
          str = ((String)localObject1).substring(0, 9);
          localObject1 = SimulateDataTest.getSimData();
          str = LoadActivity.getImei(this.a.a, LoadActivity.a, LoadActivity.b, str);
          ((Map)localObject3).putkey("getSubscriberId", localObject1[0]);
          ((Map)localObject3).putkey("getSimOperator", localObject1[1]);
          ((Map)localObject3).putkey("getNetworkOperatorName", localObject1[2]);
          ((Map)localObject3).putkey("getSimSerialNumber", localObject1[3]);
          ((Map)localObject3).putkey("getDeviceId", str);
          if (((Map)localObject3).get("systemMsg") != null) {
            Toast.makeText(this.a.a, ((Map)localObject3).get("systemMsg"), 0).show();
          }
          arrayOfString = SetDataActivity.m;
          int j = arrayOfString.length;
          i = 0;
          if (i >= j)
          {
            PoseHelper008.saveData();
            this.a.a.a();
            localObject1 = PoseHelper008.valueMap.get("getJiZhan");
            str = PoseHelper008.valueMap.get("gps");
            localObject3 = PoseHelper008.valueMap.get("location_mode");
            SetDataActivity.l(this.a.a).setText((CharSequence)localObject1);
            SetDataActivity.m(this.a.a).setText(str);
            if (!((String)localObject3).equals("1")) {
              break label600;
            }
            ((RadioButton)SetDataActivity.k(this.a.a).findViewById(2131361973)).setChecked(true);
            PoseHelper008.saveData();
          }
        }
        else
        {
          ((Map)localObject3).remove("getDeviceId");
          continue;
        }
        str = arrayOfString[i];
      }
      catch (Exception localException)
      {
        this.a.a.runOnUiThread(new bh(this));
        return;
      }
      if (str.equals("getRadioVersion")) {}
      for (Object localObject2 = "getRadioVersion1";; localObject2 = str)
      {
        if (((String)localObject2).toUpperCase().equals(localObject2)) {}
        for (localObject2 = ((Map)localObject3).getStringfrommap(((String)localObject2).toLowerCase()); (localObject2 != null) && (((String)localObject2).trim().length() > 0); localObject2 = ((Map)localObject3).getStringfrommap((String)localObject2))
        {
          PoseHelper008.valueMap.putkey(str, localObject2);
          break;
        }
        label600:
        if (((String)localObject3).equals("2"))
        {
          ((RadioButton)SetDataActivity.k(this.a.a).findViewById(2131361974)).setChecked(true);
          break;
        }
        ((RadioButton)SetDataActivity.k(this.a.a).findViewById(2131361977)).setChecked(true);
        break;
      }
      i += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.bg

 * JD-Core Version:    0.7.0.1

 */