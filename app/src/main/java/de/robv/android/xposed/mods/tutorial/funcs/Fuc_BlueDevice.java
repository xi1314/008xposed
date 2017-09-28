package de.robv.android.xposed.mods.tutorial.funcs;

import com.soft.apk008.cu;

import de.robv.android.xposed.XC_MethodHook;

public class Fuc_BlueDevice
  extends XhookMethod
{
  private static final String className = "android.bluetooth.BluetoothDevice";
  
  public Fuc_BlueDevice()
  {
    addHookWithOnlyMethodName("android.bluetooth.BluetoothDevice", "getName");
    addHookWithOnlyMethodName("android.bluetooth.BluetoothDevice", "getAddress");
    addHookWithOnlyMethodName("android.bluetooth.BluetoothDevice", "getBondedDevices");
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    String str = paramMethodHookParam.method.getName();
    if (str.equals("getName"))
    {
      paramMethodHookParam.setResult(cu.a());
      return;
    }
    if (str.equals("getAddress"))
    {
      paramMethodHookParam.setResult(cu.getAddress());
      return;
    }
    str.equals("getBondedDevices");
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     de.robv.android.xposed.mods.tutorial.funcs.Fuc_BlueDevice

 * JD-Core Version:    0.7.0.1

 */