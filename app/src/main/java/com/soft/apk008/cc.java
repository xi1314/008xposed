package com.soft.apk008;

import android.widget.RadioButton;
import android.widget.Toast;

import com.a.a.Map;
import com.data.simulate.SimulateDataTest;
import com.lishu.c.a;
import com.soft.tools.SetNetAddressActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class cc
  implements Runnable
{
  cc(ca paramca, String paramString) {}
  
  public final void run()
  {
    for (;;)
    {
      Object localObject3;
      int i;
      Object localObject4;
      try
      {
        localObject3 = Map.getmap(this.b);
        Object localObject1 = ((Map)localObject3).getStringfrommap("error");
        if (localObject1 != null)
        {
          a.c(this.a.a, (String)localObject1);
          return;
        }
        if (!SetNetAddressActivity.b())
        {
          if (SettingActivity.a("setJizhanCheck").equals("false")) {
            ((Map)localObject3).remove("getJiZhan");
          }
          localObject1 = ((Map)localObject3).getStringfrommap("getMetrics");
          if (localObject1 != null) {
            ((Map)localObject3).putkey("getMetrics", ((String)localObject1).subSequence(0, ((String)localObject1).indexOf(" ")));
          }
          if (SettingActivity.a("modalCheck").equals("false"))
          {
            ((Map)localObject3).remove("BRAND".toLowerCase());
            ((Map)localObject3).remove("MODEL".toLowerCase());
            ((Map)localObject3).remove("PRODUCT".toLowerCase());
            ((Map)localObject3).remove("DEVICE".toLowerCase());
            ((Map)localObject3).remove("MANUFACTURER".toLowerCase());
            ((Map)localObject3).remove("getMetrics".toLowerCase());
            ((Map)localObject3).remove("setCpuName".toLowerCase());
            ((Map)localObject3).remove("HARDWARE".toLowerCase());
            ((Map)localObject3).remove("FINGERPRINT".toLowerCase());
            ((Map)localObject3).remove("getRadioVersion1".toLowerCase());
            ((Map)localObject3).remove("getRadioVersion".toLowerCase());
          }
          localObject1 = ((Map)localObject3).getStringfrommap("getDeviceId");
          if (((String)localObject1).length() <= 10) {
            break label773;
          }
          str1 = ((String)localObject1).substring(0, 9);
          i = SettingActivity.a();
          if (i == 0)
          {
            localObject1 = SimulateDataTest.getSimData();
            str1 = LoadActivity.getImei(this.a.a, LoadActivity.a, LoadActivity.b, str1);
            ((Map)localObject3).putkey("getLine1Number", SimulateDataTest.getPhoneNumber(localObject1[0]));
            PoseHelper008.valueMap.putkey("getSubscriberId", localObject1[0]);
            PoseHelper008.valueMap.putkey("getSimOperator", localObject1[1]);
            PoseHelper008.valueMap.putkey("getNetworkOperator", localObject1[1]);
            PoseHelper008.valueMap.putkey("getNetworkOperatorName", localObject1[2]);
            PoseHelper008.valueMap.putkey("getSimOperatorName", localObject1[2]);
            PoseHelper008.valueMap.putkey("getSimSerialNumber", localObject1[3]);
            PoseHelper008.valueMap.putkey("getNetworkType", localObject1[4]);
            PoseHelper008.valueMap.putkey("getPhoneType", localObject1[5]);
            PoseHelper008.valueMap.putkey("getSubtypeName", localObject1[6]);
            ((Map)localObject3).putkey("getDeviceId", str1);
          }
        }
        else
        {
          if (((Map)localObject3).get("systemMsg") != null) {
            Toast.makeText(this.a.a, ((Map)localObject3).get("systemMsg"), 0).show();
          }
          localObject4 = SetMessageActivity.m;
          int j = localObject4.length;
          i = 0;
          if (i < j) {
            break label784;
          }
          localObject1 = SimulateDataTest.getMacByPlatforms(PoseHelper008.valueMap.getStringfrommap("MANUFACTURER"), 2);
          PoseHelper008.valueMap.putkey("getMacAddress", localObject1[0]);
          PoseHelper008.valueMap.putkey("getAddress", localObject1[1]);
          PoseHelper008.saveData();
          this.a.a.a();
          localObject1 = PoseHelper008.valueMap.get("getJiZhan");
          str1 = PoseHelper008.valueMap.get("gps");
          localObject3 = PoseHelper008.valueMap.get("location_mode");
          localObject4 = PoseHelper008.valueMap.getStringfrommap("connect_mode");
          SetMessageActivity.m(this.a.a).setText((CharSequence)localObject1);
          SetMessageActivity.n(this.a.a).setText(str1);
          if (!((String)localObject3).equals("1")) {
            break label845;
          }
          ((RadioButton)SetMessageActivity.l(this.a.a).findViewById(2131361973)).setChecked(true);
          if (!((String)localObject4).equals("1")) {
            break label982;
          }
          ((RadioButton)SetMessageActivity.o(this.a.a).findViewById(2131361992)).setChecked(true);
          PoseHelper008.saveData();
          return;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        this.a.a.runOnUiThread(new cd(this));
        return;
      }
      Object localObject2 = SimulateDataTest.getSimDataCommon(i);
      continue;
      label773:
      ((Map)localObject3).remove("getDeviceId");
      continue;
      label784:
      String str2 = localObject4[i];
      String str1 = ((Map)localObject3).getStringfrommap(str2.toLowerCase());
      localObject2 = str1;
      if (str1 == null) {
        localObject2 = ((Map)localObject3).getStringfrommap(str2);
      }
      if ((localObject2 != null) && (((String)localObject2).trim().length() > 0))
      {
        PoseHelper008.valueMap.putkey(str2, localObject2);
        break label1045;
        label845:
        if (((String)localObject3).equals("2"))
        {
          ((RadioButton)SetMessageActivity.l(this.a.a).findViewById(2131361974)).setChecked(true);
          continue;
        }
        if (((String)localObject3).equals("3"))
        {
          ((RadioButton)SetMessageActivity.l(this.a.a).findViewById(2131361975)).setChecked(true);
          continue;
        }
        if (((String)localObject3).equals("4"))
        {
          ((RadioButton)SetMessageActivity.l(this.a.a).findViewById(2131361976)).setChecked(true);
          continue;
        }
        ((RadioButton)SetMessageActivity.l(this.a.a).findViewById(2131361977)).setChecked(true);
        continue;
        label982:
        if (((String)localObject4).equals("2"))
        {
          ((RadioButton)SetMessageActivity.o(this.a.a).findViewById(2131361993)).setChecked(true);
          continue;
        }
        ((RadioButton)SetMessageActivity.o(this.a.a).findViewById(2131361994)).setChecked(true);
        continue;
      }
      label1045:
      i += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.cc

 * JD-Core Version:    0.7.0.1

 */