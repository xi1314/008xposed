package de.robv.android.xposed.mods.tutorial.funcs;

import de.robv.android.xposed.XC_MethodHook;

public class Fuc_Process
  extends XhookMethod
{
  private static final String className = "android.os.Process";
  
  public Fuc_Process()
  {
    addHookWithOnlyMethodName("android.os.Process", "myUid");
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    if (paramMethodHookParam.method.getName().equals("myUid")) {
      paramMethodHookParam.setResult(Integer.valueOf(com.data.simulate.a.b.nextInt(1000) + 1000));
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     de.robv.android.xposed.mods.tutorial.funcs.Fuc_Process

 * JD-Core Version:    0.7.0.1

 */