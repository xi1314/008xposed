package de.robv.android.xposed.mods.tutorial.funcs;

import de.robv.android.xposed.XC_MethodHook;

public class Fuc_SignalStrength
  extends XhookMethod
{
  private static final String className = "android.telephony.SignalStrength";
  
  public Fuc_SignalStrength()
  {
    addHookWithOnlyMethodName("android.telephony.SignalStrength", "getCdmaDbm");
    addHookWithOnlyMethodName("android.telephony.SignalStrength", "getCdmaEcio");
    addHookWithOnlyMethodName("android.telephony.SignalStrength", "getEvdoDbm");
    addHookWithOnlyMethodName("android.telephony.SignalStrength", "getEvdoEcio");
    addHookWithOnlyMethodName("android.telephony.SignalStrength", "getEvdoSnr");
    addHookWithOnlyMethodName("android.telephony.SignalStrength", "getGsmBitErrorRate");
    addHookWithOnlyMethodName("android.telephony.SignalStrength", "getGsmSignalStrength");
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    String str = paramMethodHookParam.method.getName();
    if(str.equals("getCdmaDbm")){
      //RSSI Value
      paramMethodHookParam.setResult("");
  }
    else if(str.equals("getEvdoDbm")){
//      This value is the EVDO RSSI value

      paramMethodHookParam.setResult("");
  }
    else if(str.equals("getCdmaEcio")){
      // This value is the Ec/Io
  }
    else if(str.equals("getEvdoEcio")){
     // This value is the EVDO Ec/Io
  }
  else if(str.equals("getEvdoSnr")){
      // Valid values are 0-8.  8 is the highest signal to noise ratio
  }

//      paramMethodHookParam.setResult(Integer.valueOf((int)(-15.0D * Math.random()) + 1));
//

//    paramMethodHookParam.setResult(Integer.valueOf((int)(9.0D * Math.random())));

}}
