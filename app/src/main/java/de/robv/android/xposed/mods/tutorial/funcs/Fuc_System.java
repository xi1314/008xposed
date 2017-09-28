package de.robv.android.xposed.mods.tutorial.funcs;

import com.data.simulate.SimulateDataTest;
import com.soft.apk008.SettingActivity;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class Fuc_System
  extends XhookMethod
{
  private static final String className = "java.lang.System";
  private com.lishu.d.a creator = null;
  
  public Fuc_System()
  {
    addHookWithOnlyMethodName("java.lang.System", "getProperty");
    this.creator = new com.lishu.d.a();
    com.lishu.d.a locala = this.creator;
    com.lishu.d.a.b();
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    String str = paramMethodHookParam.method.getName();
    onLog("java.lang.System  " + str + "  " + paramMethodHookParam.args[0]);
    if (str.equals("getProperty"))
    {
      str = paramMethodHookParam.args[0];
      if (!str.equals("os.arch")) {
        break label105;
      }
      if (PoseHelper008.valueMap != null)
      {
        str = PoseHelper008.valueMap.getStringfrommap(str);
        if (str != null) {
          paramMethodHookParam.setResult(str);
        }
      }
    }
    label105:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              if (!str.equals("os.version")) {
                break;
              }
            } while (PoseHelper008.valueMap == null);
            str = PoseHelper008.valueMap.getStringfrommap(str);
          } while (str == null);
          paramMethodHookParam.setResult(str);
          return;
          if (!str.equals("user.name")) {
            break;
          }
        } while (PoseHelper008.valueMap == null);
        str = PoseHelper008.valueMap.getStringfrommap(str);
      } while (str == null);
      paramMethodHookParam.setResult(str);
      return;
      if (str.equals("http.agent"))
      {
        str = SettingActivity.a("setUserAgent");
        if (str.equals("true"))
        {
          paramMethodHookParam.setResult(SimulateDataTest.getUserAgent(2, PoseHelper008.valueMap.getStringfrommap("RELEASE"), PoseHelper008.valueMap.getStringfrommap("MODEL")));
          onLog("false---");
          return;
        }
        onLog("ok--" + str);
        return;
      }
      if (str.equals("java.class.path"))
      {
        paramMethodHookParam.setResult(paramMethodHookParam.getResult().replaceAll("XposedBridge.jar", ""));
        return;
      }
      if (this.creator == null)
      {
        this.creator = new com.lishu.d.a();
        locala = this.creator;
        com.lishu.d.a.b();
      }
      com.lishu.d.a locala = this.creator;
      str = com.lishu.d.a.a(str);
    } while (str.equals("null"));
    paramMethodHookParam.setResult(str);
  }
}

