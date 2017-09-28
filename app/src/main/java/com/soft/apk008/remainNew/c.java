package com.soft.apk008.remainNew;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import com.a.a.Map;
import com.data.simulate.SimulateDataTest;
import com.lishu.c.a;
import com.lishu.c.w;
import com.soft.apk008.LoadActivity;
import com.soft.apk008.SetMessageActivity;
import com.soft.apk008.SettingActivity;
import com.soft.tools.SetNetAddressActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class c
  implements w
{
  c(Context paramContext) {}
  
  public final void a(String paramString)
  {
    Map locale;
    Object localObject;
    int i;
    label527:
    String str1;
    if ((paramString != null) && (paramString.length() > 0))
    {
      String[] arrayOfString;
      for (;;)
      {
        try
        {
          locale = Map.getmap(paramString);
          paramString = locale.getStringfrommap("error");
          if (paramString != null)
          {
            if (!(this.a instanceof Activity)) {
              return;
            }
            a.c((Activity)this.a, paramString);
            return;
          }
          if (!SetNetAddressActivity.b())
          {
            if (SettingActivity.a("setJizhanCheck").equals("false")) {
              locale.remove("getJiZhan");
            }
            paramString = locale.getStringfrommap("getMetrics");
            if (paramString != null) {
              locale.putkey("getMetrics", paramString.subSequence(0, paramString.indexOf(" ")));
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
            paramString = locale.getStringfrommap("getDeviceId");
            if (paramString.length() <= 10) {
              break label527;
            }
            localObject = paramString.substring(0, 9);
            i = SettingActivity.a();
            if (i == 0)
            {
              paramString = SimulateDataTest.getSimData();
              localObject = LoadActivity.getImei(this.a, LoadActivity.a, LoadActivity.b, (String)localObject);
              locale.putkey("getLine1Number", SimulateDataTest.getPhoneNumber(paramString[0]));
              PoseHelper008.valueMap.putkey("getSubscriberId", paramString[0]);
              PoseHelper008.valueMap.putkey("getSimOperator", paramString[1]);
              PoseHelper008.valueMap.putkey("getNetworkOperator", paramString[1]);
              PoseHelper008.valueMap.putkey("getNetworkOperatorName", paramString[2]);
              PoseHelper008.valueMap.putkey("getSimOperatorName", paramString[2]);
              PoseHelper008.valueMap.putkey("getSimSerialNumber", paramString[3]);
              PoseHelper008.valueMap.putkey("getNetworkType", paramString[4]);
              PoseHelper008.valueMap.putkey("getPhoneType", paramString[5]);
              PoseHelper008.valueMap.putkey("getSubtypeName", paramString[6]);
              locale.putkey("getDeviceId", localObject);
            }
          }
          else
          {
            if (locale.get("systemMsg") != null) {
              Toast.makeText(this.a, locale.get("systemMsg"), 0).show();
            }
            arrayOfString = SetMessageActivity.m;
            int j = arrayOfString.length;
            i = 0;
            if (i < j) {
              break;
            }
            PoseHelper008.saveData();
            return;
          }
        }
        catch (Exception paramString)
        {
          paramString.printStackTrace();
          NewReMainActivity.a(NewReMainActivity.a, "自定义网络数据不可用，发生异常");
          return;
        }
        paramString = SimulateDataTest.getSimDataCommon(i);
        continue;
        locale.remove("getDeviceId");
      }
      str1 = arrayOfString[i];
      if (!str1.equals("getRadioVersion")) {
        break label628;
      }
    }
    label628:
    for (paramString = "getRadioVersion1";; paramString = str1)
    {
      String str2 = locale.getStringfrommap(paramString.toLowerCase());
      localObject = str2;
      if (str2 == null) {
        localObject = locale.getStringfrommap(paramString);
      }
      if ((localObject != null) && (((String)localObject).trim().length() > 0)) {
        PoseHelper008.valueMap.putkey(str1, localObject);
      }
      i += 1;
      break;
      NewReMainActivity.a(NewReMainActivity.a, "自定义网络数据不可用，无数据返回");
      return;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.remainNew.saveaccountdatatoFile

 * JD-Core Version:    0.7.0.1

 */