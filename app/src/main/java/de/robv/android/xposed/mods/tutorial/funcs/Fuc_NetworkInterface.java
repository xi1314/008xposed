package de.robv.android.xposed.mods.tutorial.funcs;

import com.data.simulate.SimulateDataTest;
import com.soft.apk008.SettingActivity;

import de.robv.android.xposed.XC_MethodHook;

public class Fuc_NetworkInterface
  extends XhookMethod
{
  private static final String className = "java.net.NetworkInterface";
  
  public Fuc_NetworkInterface()
  {
    addHookWithOnlyMethodName("java.net.NetworkInterface", "getNetworkInterfaces");
    addHookWithOnlyMethodName("java.net.NetworkInterface", "getName");
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    if (paramMethodHookParam.method.getName().equals("getName"))
    {
      String str1 = (String) paramMethodHookParam.getResult();
      String str2 = SettingActivity.a("setVpn");
      onLog("-----------getName-----------" + str2);
      if (("true".equals(str2)) && ((str1.equals("tun0")) || (str1.equals("ppp0")))) {
        paramMethodHookParam.setResult(SimulateDataTest.getRandData(3, 5));
      }
    }
  }
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    paramMethodHookParam.method.getName();
  }
}

