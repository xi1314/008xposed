package com.soft.apk008;

import android.widget.RadioButton;
import android.widget.Toast;

import com.a.a.Map;
import com.data.simulate.SimulateDataTest;
import com.lishu.c.a;
import com.soft.tools.SetNetAddressActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class bx
  implements Runnable
{
  bx(bv parambv, String paramString) {}
  
  public final void run()
  {
    SetMessageActivity.a(this.a.a);
    for (;;)
    {
      Map locale;
      Object localObject3;
      int i;
      String[] arrayOfString;
      try
      {
        locale = Map.getmap(this.b);
        Object localObject1 = locale.getStringfrommap("error");
        if (localObject1 != null)
        {
          a.c(this.a.a, (String)localObject1);
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
          locale.remove("getAddress");
          if (SettingActivity.a("setJizhanCheck").equals("false")) {
            locale.remove("getJiZhan");
          }
          localObject1 = locale.getStringfrommap("getMetrics");
          locale.putkey("getMetrics", ((String)localObject1).subSequence(0, ((String)localObject1).indexOf(" ")));
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
          if (((String)localObject1).length() <= 10) {
            break label883;
          }
          localObject3 = ((String)localObject1).substring(0, 9);
          i = SettingActivity.a();
          if (i == 0)
          {
            localObject1 = SimulateDataTest.getSimData();
            localObject3 = LoadActivity.getImei(this.a.a, LoadActivity.a, LoadActivity.b, (String)localObject3);
            locale.putkey("getLine1Number", SimulateDataTest.getPhoneNumber(localObject1[0]));
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
            break label894;
          }
          localObject1 = SimulateDataTest.getMacByPlatforms(PoseHelper008.valueMap.getStringfrommap("MANUFACTURER"), 2);
          PoseHelper008.valueMap.putkey("getMacAddress", localObject1[0]);
          PoseHelper008.valueMap.putkey("getAddress", localObject1[1]);
          PoseHelper008.saveData();
          this.a.a.a();
          localObject1 = PoseHelper008.valueMap.get("getJiZhan");
          localObject3 = PoseHelper008.valueMap.get("gps");
          str1 = PoseHelper008.valueMap.get("location_mode");
          SetMessageActivity.m(this.a.a).setText((CharSequence)localObject1);
          SetMessageActivity.n(this.a.a).setText((CharSequence)localObject3);
          if (!str1.equals("1")) {
            break label971;
          }
          ((RadioButton)SetMessageActivity.l(this.a.a).findViewById(2131361973)).setChecked(true);
          PoseHelper008.saveData();
          if ((StartActivity.h.indexOf("myNet") < 0) || (!SetNetAddressActivity.a())) {
            break label1114;
          }
          this.a.a.d();
          return;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        this.a.a.runOnUiThread(new by(this));
        return;
      }
      Object localObject2 = SimulateDataTest.getSimDataCommon(i);
      continue;
      label883:
      locale.remove("getDeviceId");
      continue;
      label894:
      String str1 = arrayOfString[i];
      if (str1.equals("getRadioVersion")) {}
      for (localObject2 = "getRadioVersion1";; localObject2 = str1)
      {
        String str2 = locale.getStringfrommap(((String)localObject2).toLowerCase());
        localObject3 = str2;
        if (str2 == null) {
          localObject3 = locale.getStringfrommap((String)localObject2);
        }
        if ((localObject3 == null) || (((String)localObject3).trim().length() <= 0)) {
          break label1115;
        }
        PoseHelper008.valueMap.putkey(str1, localObject3);
        break label1115;
        label971:
        if (str1.equals("2"))
        {
          ((RadioButton)SetMessageActivity.l(this.a.a).findViewById(2131361974)).setChecked(true);
          break;
        }
        if (str1.equals("3"))
        {
          ((RadioButton)SetMessageActivity.l(this.a.a).findViewById(2131361975)).setChecked(true);
          break;
        }
        if (str1.equals("4"))
        {
          ((RadioButton)SetMessageActivity.l(this.a.a).findViewById(2131361976)).setChecked(true);
          break;
        }
        ((RadioButton)SetMessageActivity.l(this.a.a).findViewById(2131361977)).setChecked(true);
        break;
      }
      label1114:
      return;
      label1115:
      i += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.bx

 * JD-Core Version:    0.7.0.1

 */