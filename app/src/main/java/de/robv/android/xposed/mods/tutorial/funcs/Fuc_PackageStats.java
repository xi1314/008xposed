package de.robv.android.xposed.mods.tutorial.funcs;

import de.robv.android.xposed.XC_MethodHook;

public class Fuc_PackageStats
  extends XhookMethod
{
  private static final String className = "android.content.pm.PackageStats";
  
  public Fuc_PackageStats()
  {
    addHookWithOnlyMethodName("android.content.pm.PackageStats", "cacheSize");
    addHookWithOnlyMethodName("android.content.pm.PackageStats", "codeSize");
    addHookWithOnlyMethodName("android.content.pm.PackageStats", "dataSize");
    addHookWithOnlyMethodName("android.content.pm.PackageStats", "externalCacheSize");
    addHookWithOnlyMethodName("android.content.pm.PackageStats", "externalCodeSize");
    addHookWithOnlyMethodName("android.content.pm.PackageStats", "externalDataSize");
    addHookWithOnlyMethodName("android.content.pm.PackageStats", "externalMediaSize");
    addHookWithOnlyMethodName("android.content.pm.PackageStats", "externalObbSize");
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    Class localClass = paramMethodHookParam.thisObject.getClass();
    try
    {
      changePrivateVariable(localClass.getDeclaredField("cacheSize"), paramMethodHookParam.thisObject, Long.valueOf(Inttolong.inttolong(5)));
      changePrivateVariable(localClass.getDeclaredField("codeSize"), paramMethodHookParam.thisObject, Long.valueOf(Inttolong.inttolong(50)));
      changePrivateVariable(localClass.getDeclaredField("dataSize"), paramMethodHookParam.thisObject, Long.valueOf(Inttolong.inttolong(15)));
      changePrivateVariable(localClass.getDeclaredField("externalCacheSize"), paramMethodHookParam.thisObject, Long.valueOf(Inttolong.inttolong(10)));
      changePrivateVariable(localClass.getDeclaredField("externalCodeSize"), paramMethodHookParam.thisObject, Long.valueOf(Inttolong.inttolong(10)));
      changePrivateVariable(localClass.getDeclaredField("externalDataSize"), paramMethodHookParam.thisObject, Long.valueOf(Inttolong.inttolong(10)));
      changePrivateVariable(localClass.getDeclaredField("externalMediaSize"), paramMethodHookParam.thisObject, Long.valueOf(Inttolong.inttolong(10)));
      changePrivateVariable(localClass.getDeclaredField("externalObbSize"), paramMethodHookParam.thisObject, Long.valueOf(Inttolong.inttolong(10)));
      return;
    }
    catch (Exception paramMethodHookParam)
    {
      paramMethodHookParam.printStackTrace();
    }
  }
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     de.robv.android.xposed.mods.tutorial.funcs.Fuc_PackageStats

 * JD-Core Version:    0.7.0.1

 */