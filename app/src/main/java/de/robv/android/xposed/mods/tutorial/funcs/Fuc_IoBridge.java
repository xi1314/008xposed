package de.robv.android.xposed.mods.tutorial.funcs;

import com.soft.apk008.x;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class Fuc_IoBridge
  extends XhookMethod
{
  private static final String className = "libcore.io.IoBridge";
  
  public Fuc_IoBridge()
  {
    addHookWithOnlyMethodName("libcore.io.IoBridge", "open");
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {



    String str;
    if (paramMethodHookParam.method.getName().equals("open"))
    {
      String str = paramMethodHookParam.args[0];
      if (str.contains("/proc/version"){

      paramMethodHookParam.args[0] = PoseHelper008.getProcVersion();
    }
    else if(str.contains("/sys/class/net/wlan0/address")){
      paramMethodHookParam.args[0] = PoseHelper008.getMacFile();
    }
    else if(str.contains("/proc/cpuinfo")){
      if (PoseHelper008.valueMap.get("setCpuName") != null) {
       if(paramMethodHookParam.args.length = 1){
         paramMethodHookParam.args[0] = x.c;
       }

      }else{
        x.a(PoseHelper008.valueMap.get("setCpuName"));
      }
    }
    else if(){

    }
    }
    label56:
    do
    {
      do
      {
        return;

        if (!str.contains("/proc/cpuinfo")) {
          break;
        }
        if (PoseHelper008.valueMap.get("setCpuName") != null) {
          x.a(PoseHelper008.valueMap.get("setCpuName"));
        }

      } while
              (paramMethodHookParam.args.length != 1);
      paramMethodHookParam.args[0] = x.c;
      return;
    } while ((!str.contains("sys/class/net/wlan0/address")) && (!str.contains("sys/class/net/eth0/address")) && (!str.contains("sys/class/net/em0/address")));

  }
}

