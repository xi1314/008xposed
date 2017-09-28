package com.soft.tools;

import android.widget.Toast;

import com.a.a.Map;
import com.data.simulate.SimulateDataTest;
import com.soft.apk008.HistoryActivity;
import com.soft.apk008.LoadActivity;
import com.soft.apk008.SetMessageActivity;
import com.soft.apk008.SettingActivity;
import com.soft.apk008.StartActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class cn
  implements Runnable
{
  cn(cl paramcl, String paramString, boolean paramBoolean) {}
  
  public final void run()
  {
    for (;;)
    {
      Map locale;
      Object localObject3;
      String[] arrayOfString;
      int i;
      try
      {
        locale = Map.getmap(this.b);
        Object localObject1 = locale.getStringfrommap("error");
        if (localObject1 != null)
        {
          com.lishu.c.a.c(this.a.a, (String)localObject1);
          return;
        }
        if (!SetNetAddressActivity.b())
        {
          locale.remove("getString");
          locale.remove("getString2");
          locale.remove("getLine1Number");
          locale.remove("getSimSerialNumber");
          locale.remove("getSubscriberId");
          locale.remove("getSimCountryIso");
          locale.remove("getSimOperator");
          locale.remove("getSimOperatorName");
          locale.remove("getNetworkCountryIso");
          locale.remove("getNetworkOperator");
          locale.remove("getNetworkOperatorName");
          locale.remove("getNetworkType");
          locale.remove("getPhoneType");
          locale.remove("getSimState");
          locale.remove("getMacAddress");
          locale.remove("getSSID");
          locale.remove("getBSSID");
          localObject1 = locale.getStringfrommap("getMetrics");
          if (localObject1 != null) {
            locale.putkey("getMetrics", ((String)localObject1).subSequence(0, ((String)localObject1).indexOf(" ")));
          }
          if (SettingActivity.a("modalCheck").equals("false"))
          {
            locale.remove("BRAND".toLowerCase());
            locale.remove("MODEL".toLowerCase());
            locale.remove("PRODUCT".toLowerCase());
            locale.remove("DEVICE".toLowerCase());
            locale.remove("MANUFACTURER".toLowerCase());
            locale.remove("getMetrics".toLowerCase());
            locale.remove("setCpuName".toLowerCase());
            locale.remove("HARDWARE".toLowerCase());
            locale.remove("FINGERPRINT".toLowerCase());
            locale.remove("getRadioVersion1".toLowerCase());
            locale.remove("getRadioVersion".toLowerCase());
          }
          localObject1 = locale.getStringfrommap("getDeviceId");
          if (((String)localObject1).length() > 10)
          {
            localObject3 = ((String)localObject1).substring(0, 9);
            localObject1 = SimulateDataTest.getSimData();
            localObject3 = LoadActivity.getImei(this.a.a, LoadActivity.a, LoadActivity.b, (String)localObject3);
            PoseHelper008.valueMap.putkey("getSubscriberId", localObject1[0]);
            PoseHelper008.valueMap.putkey("getSimOperator", localObject1[1]);
            PoseHelper008.valueMap.putkey("getNetworkOperator", localObject1[1]);
            PoseHelper008.valueMap.putkey("getNetworkOperatorName", localObject1[2]);
            PoseHelper008.valueMap.putkey("getSimOperatorName", localObject1[2]);
            PoseHelper008.valueMap.putkey("getSimSerialNumber", localObject1[3]);
            PoseHelper008.valueMap.putkey("getNetworkType", localObject1[4]);
            PoseHelper008.valueMap.putkey("getPhoneType", localObject1[5]);
            PoseHelper008.valueMap.putkey("getSubtypeName", localObject1[6]);
            locale.putkey("getDeviceId", localObject3);
          }
        }
        else
        {
          if (locale.get("systemMsg") != null) {
            Toast.makeText(this.a.a, locale.get("systemMsg"), 0).show();
          }
          arrayOfString = SetMessageActivity.m;
          int j = arrayOfString.length;
          i = 0;
          if (i < j) {
            break label729;
          }
          localObject1 = SimulateDataTest.getMacByPlatforms(PoseHelper008.valueMap.getStringfrommap("MANUFACTURER"), 2);
          PoseHelper008.valueMap.putkey("getMacAddress", localObject1[0]);
          PoseHelper008.valueMap.putkey("getAddress", localObject1[1]);
          PoseHelper008.valueMap.putkey("sign", SetMessageActivity.b(PoseHelper008.valueMap.get("getDeviceId")));
          PoseHelper008.saveData();
          QuickToolActivity.a(this.a.a, 2);
          if ((StartActivity.h.indexOf("myNet") < 0) || (!SetNetAddressActivity.a())) {
            break label806;
          }
          this.a.a.b(this.c);
          return;
        }
      }
      catch (Exception localException)
      {
        this.a.a.runOnUiThread(new co(this));
        return;
      }
      locale.remove("getDeviceId");
      continue;
      label729:
      String str1 = arrayOfString[i];
      if (str1.equals("getRadioVersion")) {}
      for (Object localObject2 = "getRadioVersion1";; localObject2 = str1)
      {
        String str2 = locale.getStringfrommap(((String)localObject2).toLowerCase());
        localObject3 = str2;
        if (str2 == null) {
          localObject3 = locale.getStringfrommap((String)localObject2);
        }
        if ((localObject3 == null) || (((String)localObject3).trim().length() <= 0)) {
          break label833;
        }
        PoseHelper008.valueMap.putkey(str1, localObject3);
        break label833;
        label806:
        if (!this.c) {
          break;
        }
        HistoryActivity.a();
        com.lishu.b.a.a.a(HistoryActivity.a, PoseHelper008.valueMap);
        return;
      }
      return;
      label833:
      i += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.cn

 * JD-Core Version:    0.7.0.1

 */