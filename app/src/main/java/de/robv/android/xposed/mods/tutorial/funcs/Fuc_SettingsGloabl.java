package de.robv.android.xposed.mods.tutorial.funcs;

import de.robv.android.xposed.XC_MethodHook;

public class Fuc_SettingsGloabl
  extends XhookMethod
{
  private static final String className = "android.provider.Settings$Global";
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    paramMethodHookParam.method.getName();
  }
}

