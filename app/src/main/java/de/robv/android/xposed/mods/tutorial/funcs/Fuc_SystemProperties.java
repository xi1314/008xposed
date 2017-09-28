package de.robv.android.xposed.mods.tutorial.funcs;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class Fuc_SystemProperties
  extends XhookMethod
{
  private static final String className = "android.os.SystemProperties";
  private com.lishu.d.a propCreator;
  
  public Fuc_SystemProperties()
  {
    addHookWithOnlyMethodName("android.os.SystemProperties", "set");
    addHookWithOnlyMethodName("android.os.SystemProperties", "get");
    this.propCreator = new com.lishu.d.a();
    com.lishu.d.a locala = this.propCreator;
    com.lishu.d.a.b();
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    String str;
    if (paramMethodHookParam.method.getName().equals("get"))
    {
      str = (String) paramMethodHookParam.args[0];
      if (PoseHelper008.valueMap != null)
      {
        if (!PoseHelper008.valueMap.containsKey(str)) {
          paramMethodHookParam.setResult(PoseHelper008.valueMap.get(str));
        }
        else if(PoseHelper008.valueMap.containsKey(str)){
        do
        {
          return;
          com.lishu.d.a locala = this.propCreator;
          str = com.lishu.d.a.a(str);
        } while (str.equals("null"));
        paramMethodHookParam.setResult(str);
      }
      }
    }


  }
}

