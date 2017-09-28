package de.robv.android.xposed.mods.tutorial.funcs;

import de.robv.android.xposed.XC_MethodHook;

public class Fuc_LayoutParams
  extends XhookMethod
{
  private static final String className = "android.view.WindowManager$LayoutParams";
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    try
    {
      changePrivateVariable(paramMethodHookParam.thisObject.getClass().getDeclaredField("screenBrightness"), paramMethodHookParam.thisObject, Float.valueOf((float)(1.0D * Math.random())));
      return;
    }
    catch (NoSuchFieldException nosuchfile)
    {
      nosuchfile.printStackTrace();
      return;
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}


