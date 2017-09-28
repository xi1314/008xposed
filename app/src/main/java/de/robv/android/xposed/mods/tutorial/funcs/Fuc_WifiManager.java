package de.robv.android.xposed.mods.tutorial.funcs;

import android.net.DhcpInfo;
import com.data.simulate.SimulateDataTest;
import com.soft.apk008.SettingActivity;

import de.robv.android.xposed.XC_MethodHook;

public class Fuc_WifiManager
  extends XhookMethod
{
  private static final String className = "android.net.wifi.WifiManager";
  
  public Fuc_WifiManager()
  {
    addHookWithOnlyMethodName("android.net.wifi.WifiManager", "getConnectionInfo");
    addHookWithOnlyMethodName("android.net.wifi.WifiManager", "getWifiState");
    addHookWithOnlyMethodName("android.net.wifi.WifiManager", "isWifiEnabled");
    addHookWithOnlyMethodName("android.net.wifi.WifiManager", "getDhcpInfo");
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {

    String str = paramMethodHookParam.method.getName();
    DhcpInfo dhcpInfo;
    if (str.equals("getConnectionInfo")) {

    } else if ((!str.equals("getWifiState")) && (str.equals("isWifiEnabled")) && (str.equals("getDhcpInfo")) && (SettingActivity.a("set_dhcp").equals("true"))) {
      dhcpInfo = (DhcpInfo) paramMethodHookParam.getResult();
      if (paramMethodHookParam != null     ) {
        int i = SimulateDataTest.ipToInt(SimulateDataTest.getRandomIp());
        int j = SimulateDataTest.ipToInt(SimulateDataTest.getRandomIp());
        int k = SimulateDataTest.ipToInt(SimulateDataTest.getRandomIp());
        int m = SimulateDataTest.ipToInt(SimulateDataTest.getRandomIp());
        dhcpInfo.dns1 = i;
        dhcpInfo.dns2 = j;
        dhcpInfo.gateway = k;
        dhcpInfo.serverAddress = m;
      }
    }
  }}