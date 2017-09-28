package de.robv.android.xposed.mods.tutorial.funcs;

import android.telephony.TelephonyManager;
import com.soft.apk008.cu;

import de.robv.android.xposed.XC_MethodHook;

public class Fuc_TelephonyManagerMore
  extends XhookMethod
{
  private static final String className = TelephonyManager.class.getName();
  
  public Fuc_TelephonyManagerMore()
  {
    addHookWithOnlyMethodName(className, "getVoiceMailAlphaTag");
    addHookWithOnlyMethodName(className, "getMmsUserAgent");
    addHookWithOnlyMethodName(className, "getMmsUAProfUrl");
    addHookWithOnlyMethodName(className, "getVoiceMailNumber");
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    String str = paramMethodHookParam.method.getName();
    if (str.equals("getVoiceMailAlphaTag"))
    {
      paramMethodHookParam.setResult(cu.a());
      return;
    }
    if (str.equals("getMmsUserAgent"))
    {
      paramMethodHookParam.setResult(cu.a());
      return;
    }
    if (str.equals("getMmsUAProfUrl"))
    {
      paramMethodHookParam.setResult(cu.a());
      return;
    }
    str.equals("getVoiceMailNumber");
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     de.robv.android.xposed.mods.tutorial.funcs.Fuc_TelephonyManagerMore

 * JD-Core Version:    0.7.0.1

 */