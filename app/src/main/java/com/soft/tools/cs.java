package com.soft.tools;

import android.widget.Toast;
import com.a.a.Map;
import com.data.simulate.SimulateDataTest;
import com.lishu.b.a.a;
import com.soft.apk008.HistoryActivity;
import com.soft.apk008.LoadActivity;
import com.soft.apk008.SetMessageActivity;
import com.soft.apk008.SettingActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class cs
  implements Runnable
{
  cs(cq paramcq, String paramString, boolean paramBoolean) {}
  
  public final void run()
  {
    for (;;)
    {
      Map locale;
      int i;
      try
      {
        locale = Map.getmap(this.b);
        Object localObject1;
        String[] arrayOfString;
        if (!SetNetAddressActivity.b())
        {
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
            str1 = ((String)localObject1).substring(0, 9);
            localObject1 = SimulateDataTest.getSimData();
            str1 = LoadActivity.getImei(this.a.a, LoadActivity.a, LoadActivity.b, str1);
            PoseHelper008.valueMap.putkey("getSubscriberId", localObject1[0]);
            PoseHelper008.valueMap.putkey("getSimOperator", localObject1[1]);
            PoseHelper008.valueMap.putkey("getNetworkOperator", localObject1[1]);
            PoseHelper008.valueMap.putkey("getNetworkOperatorName", localObject1[2]);
            PoseHelper008.valueMap.putkey("getSimOperatorName", localObject1[2]);
            PoseHelper008.valueMap.putkey("getSimSerialNumber", localObject1[3]);
            PoseHelper008.valueMap.putkey("getNetworkType", localObject1[4]);
            PoseHelper008.valueMap.putkey("getPhoneType", localObject1[5]);
            PoseHelper008.valueMap.putkey("getSubtypeName", localObject1[6]);
            locale.putkey("getDeviceId", str1);
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
            break label570;
          }
          localObject1 = SimulateDataTest.getMacByPlatforms(PoseHelper008.valueMap.getStringfrommap("MANUFACTURER"), 2);
          PoseHelper008.valueMap.putkey("getMacAddress", localObject1[0]);
          PoseHelper008.valueMap.putkey("getAddress", localObject1[1]);
          PoseHelper008.valueMap.putkey("sign", SetMessageActivity.b(PoseHelper008.valueMap.get("getDeviceId")));
          PoseHelper008.saveData();
          QuickToolActivity.a(this.a.a, 2);
          if (!this.c) {
            break;
          }
          HistoryActivity.a();
          a.a(HistoryActivity.a, PoseHelper008.valueMap);
          return;
        }
        locale.remove("getDeviceId");
        continue;
        str2 = arrayOfString[i];
      }
      catch (Exception localException)
      {
        this.a.a.runOnUiThread(new ct(this));
        return;
      }
      label570:
      String str2;
      String str1 = locale.getStringfrommap(str2.toLowerCase());
      Object localObject2 = str1;
      if (str1 == null) {
        localObject2 = locale.getStringfrommap(str2);
      }
      if ((localObject2 != null) && (((String)localObject2).trim().length() > 0)) {
        PoseHelper008.valueMap.putkey(str2, localObject2);
      }
      i += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.cs

 * JD-Core Version:    0.7.0.1

 */