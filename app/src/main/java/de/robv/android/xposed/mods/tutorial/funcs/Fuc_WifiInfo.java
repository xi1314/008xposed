package de.robv.android.xposed.mods.tutorial.funcs;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class Fuc_WifiInfo
  extends XhookMethod
{
  private static final String className = "android.net.wifi.WifiInfo";
  
  public Fuc_WifiInfo()
  {
    addHookWithOnlyMethodName("android.net.wifi.WifiInfo", "getLinkSpeed");
    addHookWithOnlyMethodName("android.net.wifi.WifiInfo", "getNetworkId");
    addHookWithOnlyMethodName("android.net.wifi.WifiInfo", "getRssi");
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    String str = paramMethodHookParam.method.getName();
    if ((str.equals("getBSSID")) || (str.equals("getMacAddress")) || (str.equals("getSSID"))) {
      if ((PoseHelper008.valueMap != null) && (PoseHelper008.valueMap.containsKey(str))) {
        paramMethodHookParam.setResult(PoseHelper008.valueMap.get(str));
      }
    }
    while ((str.equals("getNetworkId")) || (str.equals("getIpAddress")) || (str.equals("getLinkSpeed"))) {
      return;
    }
    str.equals("getRssi");
  }
}

