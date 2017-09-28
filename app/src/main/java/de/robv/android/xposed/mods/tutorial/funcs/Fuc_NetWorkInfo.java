package de.robv.android.xposed.mods.tutorial.funcs;

import android.net.NetworkInfo;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class Fuc_NetWorkInfo
  extends XhookMethod
{
  private static final String className = NetworkInfo.class.getName();
  
  public Fuc_NetWorkInfo()
  {
    addHookWithOnlyMethodName(className, "getSubtypeName");
    addHookWithOnlyMethodName(className, "getSubtype");
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    String str = paramMethodHookParam.method.getName();
    if (str.equals("getSubtype")) {
      if ((PoseHelper008.valueMap != null) && (PoseHelper008.valueMap.get("getNetworkType") != null)) {

        paramMethodHookParam.setResult(Integer.valueOf(Integer.parseInt((String) PoseHelper008.valueMap.get("getNetworkType"))));
      }
    }
    while ((!str.equals("getSubtypeName")) || (PoseHelper008.valueMap == null) || (PoseHelper008.valueMap.get("getSubtypeName") == null)) {
      return;
    }
    paramMethodHookParam.setResult(PoseHelper008.valueMap.get("getSubtypeName"));
  }
}

