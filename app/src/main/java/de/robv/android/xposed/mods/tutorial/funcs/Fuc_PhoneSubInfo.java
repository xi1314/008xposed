package de.robv.android.xposed.mods.tutorial.funcs;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class Fuc_PhoneSubInfo
  extends XhookMethod {
  private static final String className = "com.android.internal.telephony.PhoneSubInfo";

  public Fuc_PhoneSubInfo() {
    addHookWithOnlyMethodName("com.android.internal.telephony.PhoneSubInfo", "getDeviceId");
    addHookWithOnlyMethodName("com.android.internal.telephony.PhoneSubInfo", "getDeviceSvn");
    addHookWithOnlyMethodName("com.android.internal.telephony.PhoneSubInfo", "getIccSerialNumber");
    addHookWithOnlyMethodName("com.android.internal.telephony.PhoneSubInfo", "getLine1Number");
    addHookWithOnlyMethodName("com.android.internal.telephony.PhoneSubInfo", "getSubscriberId");
  }

  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {
  }

  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {
    String str = paramMethodHookParam.method.getName();
    if (str.equals("getDeviceId")) {
      if ((PoseHelper008.valueMap != null) && (PoseHelper008.valueMap.get("getDeviceId") != null)) {
        paramMethodHookParam.setResult(PoseHelper008.valueMap.get("getDeviceId"));
      }
    } else if (str.equals("getSubscriberId")) {
      if ((PoseHelper008.valueMap != null) && (PoseHelper008.valueMap.get("getSubscriberId") != null)) {
        paramMethodHookParam.setResult(PoseHelper008.valueMap.get("getSubscriberId"));
      }
    } else if (str.equals("getLine1Number")) {
      if ((PoseHelper008.valueMap != null) && (PoseHelper008.valueMap.get("getLine1Number") != null)) {
        paramMethodHookParam.setResult(PoseHelper008.valueMap.get("getLine1Number"));
      }
    } else if (str.equals("getIccSerialNumber")) {
      if ((PoseHelper008.valueMap != null) && (PoseHelper008.valueMap.get("getIccSerialNumber") != null)) {
        paramMethodHookParam.setResult(PoseHelper008.valueMap.get("getIccSerialNumber"));
      } else if (str.equals("getDeviceSvn")) {
        if ((PoseHelper008.valueMap != null) && !(PoseHelper008.valueMap.get("getDeviceSvn") != null)) {
          paramMethodHookParam.setResult(PoseHelper008.valueMap.get("getDeviceSvn"));
        }
      }


    }
  }
}
