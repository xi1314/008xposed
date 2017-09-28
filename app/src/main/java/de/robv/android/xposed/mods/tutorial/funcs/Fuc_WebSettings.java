package de.robv.android.xposed.mods.tutorial.funcs;

import com.data.simulate.SimulateDataTest;
import com.soft.apk008.SettingActivity;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class Fuc_WebSettings
  extends XhookMethod
{
  private static final String className = "android.webkit.WebSettings";
  
  public Fuc_WebSettings()
  {
    addHookWithOnlyMethodName("android.webkit.WebSettings", "getUserAgentString");
    addHookWithOnlyMethodName("android.webkit.WebSettings", "getDefaultUserAgent");
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    String str = paramMethodHookParam.method.getName();
    if (str.equals("getDefaultUserAgent")) {
      if ((PoseHelper008.valueMap != null) && (SettingActivity.a("setUserAgent").equals("true")))
      {
        //str 为要设置的useragent
        str = SimulateDataTest.getUserAgent(1, PoseHelper008.valueMap.getStringfrommap("RELEASE"), PoseHelper008.valueMap.getStringfrommap("MODEL"));
        onLog(str);
        paramMethodHookParam.setResult(str);
      }
    }
    // 不hook 的时候推出
    while ((!str.equals("getUserAgentString")) || (PoseHelper008.valueMap == null) || (!SettingActivity.a("setUserAgent").equals("true"))) {
      return;
    }
    str = SimulateDataTest.getUserAgent(1, PoseHelper008.valueMap.getStringfrommap("RELEASE"), PoseHelper008.valueMap.getStringfrommap("MODEL"));
    onLog(str);
    paramMethodHookParam.setResult(str);
  }
}

