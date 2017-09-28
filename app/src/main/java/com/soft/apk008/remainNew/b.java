package com.soft.apk008.remainNew;

import android.content.Context;
import android.widget.Toast;

import com.a.a.Map;
import com.data.simulate.SimulateDataTest;
import com.lishu.b.a.a;
import com.lishu.c.w;
import com.soft.apk008.LoadActivity;
import com.soft.apk008.SetMessageActivity;
import com.soft.apk008.SettingActivity;
import com.soft.apk008.StartActivity;
import com.soft.tools.SetNetAddressActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.text.SimpleDateFormat;
import java.util.Date;

final class b
  implements w
{
  b(Context paramContext1, Context paramContext2) {}
  
  public final void a(String paramString)
  {
    Map locale;
    Object localObject;
    int i;
    if ((paramString != null) && (paramString.length() > 0)) {
      for (;;)
      {
        try
        {
          locale = Map.getmap(paramString);
          locale.getStringfrommap("error");
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
            paramString = locale.getStringfrommap("getMetrics");
            locale.putkey("getMetrics", paramString.subSequence(0, paramString.indexOf(" ")));
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
              continue;
            }
            localObject = paramString.substring(0, 9);
            i = SettingActivity.a();
            if (i != 0) {
              continue;
            }
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
          if (locale.get("systemMsg") != null) {
            Toast.makeText(this.b, locale.get("systemMsg"), 0).show();
          }
          arrayOfString = SetMessageActivity.m;
          int j = arrayOfString.length;
          i = 0;
          if (i < j) {
            continue;
          }
          PoseHelper008.saveData();
          if ((StartActivity.h.indexOf("myNet") >= 0) && (SetNetAddressActivity.a())) {
            NewReMainActivity.e(this.a);
          }
        }
        catch (Exception paramString)
        {
          String[] arrayOfString;
          label629:
          NewReMainActivity.a(this.a, "获取网络数据发生错误");
          label667:
          continue;
          str1 = arrayOfString[i];
          if (!str1.equals("getRadioVersion")) {
            break label850;
          }
        }
        paramString = NewReMainSetActivity.a();
        if (!paramString.equals("自动")) {
          break label804;
        }
        a.a(new SimpleDateFormat("yyyy-MM-dd").format(new Date()), PoseHelper008.valueMap);
        NewReMainActivity.a(this.b, "生成随机数据成功");
        return;
        paramString = SimulateDataTest.getSimDataCommon(i);
        continue;
        locale.remove("getDeviceId");
      }
    }
    String str1;
    label804:
    label850:
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
      NewReMainActivity.a(this.a, "获取网络数据失败，检查账户是否正常");
      break label629;
      a.a(paramString, PoseHelper008.valueMap);
      localObject = this.b;
      NewReMainToolActivity.a("设置值", paramString, NewReMainActivity.e(), NewReMainActivity.f());
      Widget008BaseProvider.a(this.b, "设置值", paramString, NewReMainActivity.e(), NewReMainActivity.f());
      break label667;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.remainNew.Inttolong

 * JD-Core Version:    0.7.0.1

 */