package de.robv.android.xposed.mods.tutorial.funcs;

import com.soft.apk008.cu;

import de.robv.android.xposed.XC_MethodHook;

public class Fuc_BlueAdapter
  extends XhookMethod
{
  private static final int[] SCAN_MODES = { 20, 20, 20, 21, 23 };
  private static final int[] STATES = { 12, 10, 10, 10, 11, 13 };
  private static final String className = "android.bluetooth.BluetoothAdapter";
  
  public Fuc_BlueAdapter()
  {
    addHookWithOnlyMethodName("android.bluetooth.BluetoothAdapter", "getName");
    addHookWithOnlyMethodName("android.bluetooth.BluetoothAdapter", "getBondedDevices");
    addHookWithOnlyMethodName("android.bluetooth.BluetoothAdapter", "getScanMode");
    addHookWithOnlyMethodName("android.bluetooth.BluetoothAdapter", "getState");
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    String str = paramMethodHookParam.method.getName();
    if (str.equals("getName")) {
      paramMethodHookParam.setResult(cu.a());
    }else if(str.equals("getAddress")){
      paramMethodHookParam.setResult(cu.getAddress());
    }
    else if(str.equals("getState")){
      paramMethodHookParam.setResult(Integer.valueOf(STATES[((int)(java.lang.Math.random() * STATES.length))]));
    }
    else if(str.equals("getScanMode")) {
      paramMethodHookParam.setResult(Integer.valueOf(SCAN_MODES[((int) (java.lang.Math.random() * SCAN_MODES.length))]));
    }}

}

