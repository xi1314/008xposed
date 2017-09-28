package de.robv.android.xposed.mods.tutorial;

import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Point;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.security.KeyChain;
import android.telephony.NeighboringCellInfo;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.webkit.WebView;

import com.a.a.maputils;
import com.lishu.c.p;
import com.lishu.c.v;
import com.soft.apk008.SettingActivity;
import com.soft.apk008.StartActivity;
import com.soft.tools.RecordAppFileHandler;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.mods.tutorial.funcs.XhookMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Tutorial008
  implements IXposedHookLoadPackage, onlog
{
  public static String a;
  public static String c;
  public static checktime check;
  public static boolean debug = true;
  public static String f;
  public static String k;
  private static long lastTime;
  public static onlog logLis;
  private static long time;
  public static String u = "";
  public static String y;
  private int errorTime = 0;
  private String iTag = "";
  private boolean lastStatus = true;
  p net = new p();
  private com.lishu.d.a propCreator;
  
  static
  {
    check = new checktime();
   time = System.currentTimeMillis();
    lastTime = 0L;
    f = "小偷可耻";
    a = "fuck you";
    c = "";
    k = "";
    y = "";
  }
  
  public Tutorial008()
  {
    onLog("-----------------------lishu  MyXpose------------ init----ok-----");
    checktime.onlog = this;
  }
  
  private String getTime(String paramString)
  {
   String[] arraylist = paramString.split("_");
    if (arraylist.length != 2) {
      return "0";
    }
    if (v.a(arraylist[0] + "lidashu").equals(arraylist[1])) {
      return arraylist[0];
    }
    return "0";
  }
  
  public static boolean isSystemApplication(String paramString, ApplicationInfo paramApplicationInfo)
  {
    if (new File("/data/app/" + paramApplicationInfo.packageName + ".apk").exists()) {
      while ((paramApplicationInfo.flags & 0x1) != 0) {
        return true;
      }
    }

    return false;
  }
  
  private void setProductData()
  {
    if (PoseHelper008.valueMap.size() == 0)
    {
      PoseHelper008.initData(null);
      onLog("第一次加载valueMap");
    }
    //版本是否存在
    if (PoseHelper008.valueMap.get("BRAND") != null) {
      XposedHelpers.setStaticObjectField(Build.class, "BRAND", PoseHelper008.valueMap.get("BRAND"));
    }
    //机型是否存在
    if (PoseHelper008.valueMap.get("MODEL") != null) {
      XposedHelpers.setStaticObjectField(Build.class, "MODEL", PoseHelper008.valueMap.get("MODEL"));
    }
    //
    if (PoseHelper008.valueMap.get("PRODUCT") != null) {
      XposedHelpers.setStaticObjectField(Build.class, "PRODUCT", PoseHelper008.valueMap.get("PRODUCT"));
    }
    if (PoseHelper008.valueMap.get("MANUFACTURER") != null) {
      XposedHelpers.setStaticObjectField(Build.class, "MANUFACTURER", PoseHelper008.valueMap.get("MANUFACTURER"));
    }
    if (PoseHelper008.valueMap.get("DEVICE") != null) {
      XposedHelpers.setStaticObjectField(Build.class, "DEVICE", PoseHelper008.valueMap.get("DEVICE"));
    }
    if (PoseHelper008.valueMap.get("RELEASE") != null) {
      XposedHelpers.setStaticObjectField(Build.VERSION.class, "RELEASE", PoseHelper008.valueMap.get("RELEASE"));
    }
    if (PoseHelper008.valueMap.get("SDK") != null)
    {
      XposedHelpers.setStaticObjectField(Build.VERSION.class, "SDK", PoseHelper008.valueMap.get("SDK"));
      if (!SettingActivity.a("set_sdk_int").equals("true")) {}
    }
    try
    {
      readThread = Integer.parseInt(PoseHelper008.valueMap.get("SDK"));
      if (readThread != -1) {
        XposedHelpers.setStaticObjectField(Build.VERSION.class, "SDK_INT", Integer.valueOf(readThread));
      }
      if (PoseHelper008.valueMap.get("ARCH") != null)
      {
        String[] arrayOfString = PoseHelper008.valueMap.get("ARCH").split("_");
        if (arrayOfString.length == 2)
        {
          XposedHelpers.setStaticObjectField(Build.class, "CPU_ABI", arrayOfString[0]);
          XposedHelpers.setStaticObjectField(Build.class, "CPU_ABI2", arrayOfString[1]);
        }
      }
      if (PoseHelper008.valueMap.get("FINGERPRINT") != null) {
        XposedHelpers.setStaticObjectField(Build.class, "FINGERPRINT", PoseHelper008.valueMap.get("FINGERPRINT"));
      }
      if (PoseHelper008.valueMap.get("HARDWARE") != null) {
        XposedHelpers.setStaticObjectField(Build.class, "HARDWARE", PoseHelper008.valueMap.get("setCpuName"));
      }
      if (PoseHelper008.valueMap.get("SERIAL") != null) {
        XposedHelpers.setStaticObjectField(Build.class, "SERIAL", PoseHelper008.valueMap.get("SERIAL"));
      }
      if (PoseHelper008.valueMap.get("ID") != null) {
        XposedHelpers.setStaticObjectField(Build.class, "ID", PoseHelper008.valueMap.get("ID"));
      }
      if (PoseHelper008.valueMap.get("DISPLAY") != null) {
        XposedHelpers.setStaticObjectField(Build.class, "DISPLAY", PoseHelper008.valueMap.get("DISPLAY"));
      }
      if (PoseHelper008.valueMap.get("HOST") != null) {
        XposedHelpers.setStaticObjectField(Build.class, "HOST", PoseHelper008.valueMap.get("HOST"));
      }
      if (PoseHelper008.valueMap.get("USER") != null) {
        XposedHelpers.setStaticObjectField(Build.class, "USER", PoseHelper008.valueMap.get("HOST"));
      }
      if (PoseHelper008.valueMap.get("TAGS") != null) {
        XposedHelpers.setStaticObjectField(Build.class, "TAGS", PoseHelper008.valueMap.get("HOST"));
      }
      if (PoseHelper008.valueMap.get("TYPE") != null) {
        XposedHelpers.setStaticObjectField(Build.class, "TYPE", PoseHelper008.valueMap.get("HOST"));
      }
      if (SettingActivity.a("Build.TIME").equals("true")) {
        XposedHelpers.setStaticObjectField(Build.class, "TIME", Long.valueOf(time));
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int i = -1;
      }
    }
  }
  
  private void setTime()
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = lastTime;
    arrayOfString[1] = v.a(arrayOfString[0] + "lidashu");
    PoseHelper008.saveDataToFile("lastUseTime", arrayOfString[0] + "_" + arrayOfString[1]);
  }
  
  private void writeToFile(String paramString)
  {
    try
    {
      if (!new File(Environment.getExternalStorageDirectory() + File.separator + ".system/log.txt").exists()) {
        new File(Environment.getExternalStorageDirectory() + File.separator + ".system/log.txt").createNewFile();
      }
      RandomAccessFile localRandomAccessFile = new RandomAccessFile(new File(Environment.getExternalStorageDirectory() + File.separator + ".system/log.txt"), "rw");
      localRandomAccessFile.seek(localRandomAccessFile.length());
      localRandomAccessFile.write((paramString + "\n").getBytes());
      return;
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  public void addHook(String paramString1, String paramString2, ClassLoader paramClassLoader, String paramString3, Object... paramVarArgs)
  {
    paramString1 = new Tutorial008.1(this, paramString2, paramString3, paramClassLoader, paramString1);
    Object[] arrayOfObject = new Object[paramVarArgs.length + 1];
    int i = 0;
    for (;;)
    {
      if (i >= paramVarArgs.length)
      {
        arrayOfObject[paramVarArgs.length] = paramString1;
        XposedHelpers.findAndHookMethod(paramString2, paramClassLoader, paramString3, arrayOfObject);
        return;
      }
      arrayOfObject[i] = paramVarArgs[i];
      i += 1;
    }
  }
  
  public void addHookCon(String paramString1, String paramString2, ClassLoader paramClassLoader, Object... paramVarArgs)
  {
    paramString1 = new Tutorial008.2(this, paramString2, paramString1);
    Object[] arrayOfObject = new Object[paramVarArgs.length + 1];
    int i = 0;
    for (;;)
    {
      if (i >= paramVarArgs.length)
      {
        arrayOfObject[paramVarArgs.length] = paramString1;
        XposedHelpers.findAndHookConstructor(paramString2, paramClassLoader, arrayOfObject);
        return;
      }
      arrayOfObject[i] = paramVarArgs[i];
      i += 1;
    }
  }
  
  public void handleLoadPackage(XC_LoadPackage.LoadPackageParam paramLoadPackageParam)
    throws Throwable
  {
    handleLoadPackageTrue(paramLoadPackageParam);
  }
  
  public void handleLoadPackageTrue(XC_LoadPackage.LoadPackageParam paramLoadPackageParam)
    throws Throwable
  {
    f.a = paramLoadPackageParam.packageName;
    onLog("-----------------------lishu  MyXpose------------ " + paramLoadPackageParam.packageName);
    if (((!paramLoadPackageParam.packageName.equals(PoseHelper008.packageName)) && (!paramLoadPackageParam.packageName.equals("com.android.systemui")) && (!paramLoadPackageParam.packageName.equals("com.yulong.android.launcher3")) && (!paramLoadPackageParam.packageName.equals("com.android.packageinstaller")) && (!paramLoadPackageParam.packageName.equals("com.mediatek.op02.plugin")) && (!paramLoadPackageParam.packageName.equals("com.lbe.security.miui")) && (!paramLoadPackageParam.packageName.equals("com.android.externalstorage"))) || (paramLoadPackageParam.packageName.equals(PoseHelper008.packageName))) {}
    try
    {
      Class.forName("de.robv.android.xposed.mods.tutorial.PoseHelper008", false, paramLoadPackageParam.classLoader).getDeclaredField("effect").set(null, Boolean.valueOf(true));
      do
      {
        for (;;)
        {
          try
          {
            Class.forName("de.robv.android.xposed.mods.tutorial.PoseHelper008", false, paramLoadPackageParam.classLoader).getDeclaredField("verCode").set(null, Integer.valueOf(PoseHelper008.verCodeOther));
            return;
          }
          catch (Exception paramLoadPackageParam)
          {
            Object localObject1;
            Object localObject2;
            return;
          }
          StartActivity.a();
          try
          {
            if ((Environment.getExternalStorageState() == null) || (!Environment.getExternalStorageState().equals("mounted")))
            {
              onLog("存储卡还未挂载");
              return;
            }
          }
          catch (Exception paramLoadPackageParam)
          {
            return;
          }
          PoseHelper008.saveDataToFile("install", "true");
          if (PoseHelper008.getFileData("008Mode").length() > 0)
          {
            localObject1 = PoseHelper008.getFileData("008Mode");
            if (((String)localObject1).equals("2"))
            {
              localObject1 = PoseHelper008.getFileData("systemProPackAge");
              if (!((String)localObject1).equals(paramLoadPackageParam.packageName)) {
                onLog("当前模式为特定应用" + (String)localObject1);
              }
            }
            else
            {
              if (((String)localObject1).equals("0"))
              {
                onLog("当前模式为关闭");
                return;
              }
              if (((String)localObject1).equals("3"))
              {
                onLog("当前模式为全局（非系统应用）");
                if (Process.myUid() <= 1000)
                {
                  onLog("系统应用");
                  return;
                }
                if (isSystemApplication(paramLoadPackageParam.packageName, paramLoadPackageParam.appInfo)) {
                  onLog("系统应用");
                }
              }
              else if (((String)localObject1).equals("1"))
              {
                onLog("当前模式为全局");
                if (Process.myUid() <= 1000)
                {
                  onLog("系统应用");
                  addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "getDeviceId", new Object[0]);
                  setProductData();
                  return;
                }
                if (isSystemApplication(paramLoadPackageParam.packageName, paramLoadPackageParam.appInfo))
                {
                  onLog("系统应用");
                  addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "getDeviceId", new Object[0]);
                  setProductData();
                }
              }
              else
              {
                if (!((String)localObject1).equals("4")) {
                  continue;
                }
                onLog("当前为多个应用模式-选中的生效");
                localObject1 = PoseHelper008.getFileData("select_more_app");
                if ((localObject1 == null) || (((String)localObject1).length() == 0))
                {
                  onLog("设置的内容为空");
                  return;
                }
                try
                {
                  localObject1 = com.a.a.Map.getmap((String)localObject1);
                  if (localObject1 != null) {
                    continue;
                  }
                  onLog("解析数据select_more_app错误");
                  return;
                }
                catch (Exception localException1) {}
              }
            }
            localObject2 = PoseHelper008.getFileData("008cheng");
            addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "getDeviceId", new Object[0]);
            if (PoseHelper008.getFileData("008Mode").length() == 0) {
              continue;
            }
            onLog("非系统应用");
            if (f.b.length() == 0) {
              f.b = Environment.getExternalStorageDirectory().getAbsolutePath();
            }
            onLog("非系统应用1");
          }
          try
          {
            XhookMethod.addHooks(paramLoadPackageParam.packageName, paramLoadPackageParam.classLoader);
            onLog("1");
            addHook(paramLoadPackageParam.packageName, WifiInfo.class.getName(), paramLoadPackageParam.classLoader, "getMacAddress", new Object[0]);
            addHook(paramLoadPackageParam.packageName, WifiInfo.class.getName(), paramLoadPackageParam.classLoader, "getSSID", new Object[0]);
            addHook(paramLoadPackageParam.packageName, WifiInfo.class.getName(), paramLoadPackageParam.classLoader, "getBSSID", new Object[0]);
            addHook(paramLoadPackageParam.packageName, WifiInfo.class.getName(), paramLoadPackageParam.classLoader, "getIpAddress", new Object[0]);
            onLog("2");
            addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "getSimSerialNumber", new Object[0]);
            addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "getSubscriberId", new Object[0]);
            addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "getLine1Number", new Object[0]);
            addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "getSimCountryIso", new Object[0]);
            addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "getSimOperator", new Object[0]);
            addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "getSimOperatorName", new Object[0]);
            addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "getNetworkCountryIso", new Object[0]);
            addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "getNetworkOperator", new Object[0]);
            addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "getNetworkOperatorName", new Object[0]);
            addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "getNetworkType", new Object[0]);
            addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "getPhoneType", new Object[0]);
            addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "hasIccCard", new Object[0]);
            addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "getCellLocation", new Object[0]);
            onLog("3");
            if (((String)localObject2).equals("1"))
            {
              onLog("--------------------008true1---------------");
              return;
              if (!((com.a.a.Map)localObject2).containsKey(paramLoadPackageParam.packageName)) {
                continue;
              }
              onLog("多个应用" + paramLoadPackageParam.packageName);
              continue;
              if (!((String)localObject2).equals("5")) {
                continue;
              }
              onLog("当前为多个应用模式-没有选中的生效");
              localObject2 = PoseHelper008.getFileData("select_more_app");
              if ((localObject2 == null) || (((String)localObject2).length() == 0))
              {
                onLog("设置的内容为空");
                return;
              }
            }
            try
            {
              localObject2 = com.a.a.Map.getmap((String)localObject2);
              if (localObject2 == null)
              {
                onLog("解析数据select_more_app错误");
                return;
              }
              if (((com.a.a.Map)localObject2).containsKey(paramLoadPackageParam.packageName)) {
                continue;
              }
              onLog("多个应用-未选择生效" + paramLoadPackageParam.packageName);
            }
            catch (Exception localException3) {}
            PoseHelper008.saveDataToFile("008Mode", "3");
          }
          catch (Exception localException4)
          {
            localException4.printStackTrace();
            continue;
            addHook(paramLoadPackageParam.packageName, Settings.Secure.class.getName(), paramLoadPackageParam.classLoader, "getString", new Object[] { ContentResolver.class.getName(), String.class.getName() });
            addHook(paramLoadPackageParam.packageName, Settings.Secure.class.getName(), paramLoadPackageParam.classLoader, "getLong", new Object[] { ContentResolver.class.getName(), String.class.getName() });
            addHook(paramLoadPackageParam.packageName, Settings.Secure.class.getName(), paramLoadPackageParam.classLoader, "getLong", new Object[] { ContentResolver.class.getName(), String.class.getName(), Long.TYPE.getName() });
            addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "getSimState", new Object[0]);
            addHook(paramLoadPackageParam.packageName, Build.class.getName(), paramLoadPackageParam.classLoader, "getRadioVersion", new Object[0]);
            if (((String)localObject2).equals("2"))
            {
              onLog("--------------------008true1---------------");
              return;
            }
            addHook(paramLoadPackageParam.packageName, "android.app.ApplicationPackageManager", paramLoadPackageParam.classLoader, "getInstalledPackages", new Object[] { Integer.TYPE.getName() });
            addHook(paramLoadPackageParam.packageName, ActivityManager.class.getName(), paramLoadPackageParam.classLoader, "getRunningAppProcesses", new Object[0]);
            addHook(paramLoadPackageParam.packageName, "android.app.ApplicationPackageManager", paramLoadPackageParam.classLoader, "getInstalledApplications", new Object[] { Integer.TYPE.getName() });
            addHook(paramLoadPackageParam.packageName, ActivityManager.class.getName(), paramLoadPackageParam.classLoader, "getRecentTasks", new Object[] { Integer.TYPE.getName(), Integer.TYPE.getName() });
            if (((String)localObject2).equals("3"))
            {
              onLog("--------------------008true1---------------");
              return;
            }
            addHook(paramLoadPackageParam.packageName, "android.os.SystemProperties", paramLoadPackageParam.classLoader, "get", new Object[] { String.class, String.class });
            addHook(paramLoadPackageParam.packageName, "android.os.SystemProperties", paramLoadPackageParam.classLoader, "get", new Object[] { String.class });
            addHook(paramLoadPackageParam.packageName, GsmCellLocation.class.getName(), paramLoadPackageParam.classLoader, "getLac", new Object[0]);
            addHook(paramLoadPackageParam.packageName, GsmCellLocation.class.getName(), paramLoadPackageParam.classLoader, "getCid", new Object[0]);
            addHook(paramLoadPackageParam.packageName, CdmaCellLocation.class.getName(), paramLoadPackageParam.classLoader, "getNetworkId", new Object[0]);
            addHook(paramLoadPackageParam.packageName, CdmaCellLocation.class.getName(), paramLoadPackageParam.classLoader, "getBaseStationId", new Object[0]);
            addHook(paramLoadPackageParam.packageName, NeighboringCellInfo.class.getName(), paramLoadPackageParam.classLoader, "getLac", new Object[0]);
            addHook(paramLoadPackageParam.packageName, NeighboringCellInfo.class.getName(), paramLoadPackageParam.classLoader, "getCid", new Object[0]);
            if (((String)localObject2).equals("4"))
            {
              onLog("--------------------008true1---------------");
              return;
            }
            addHook(paramLoadPackageParam.packageName, Settings.System.class.getName(), paramLoadPackageParam.classLoader, "putFloat", new Object[] { ContentResolver.class.getName(), String.class.getName(), Float.TYPE.getName() });
            addHook(paramLoadPackageParam.packageName, Settings.System.class.getName(), paramLoadPackageParam.classLoader, "putInt", new Object[] { ContentResolver.class.getName(), String.class.getName(), Integer.TYPE.getName() });
            addHook(paramLoadPackageParam.packageName, Settings.System.class.getName(), paramLoadPackageParam.classLoader, "putLong", new Object[] { ContentResolver.class.getName(), String.class.getName(), Long.TYPE.getName() });
            addHook(paramLoadPackageParam.packageName, Settings.System.class.getName(), paramLoadPackageParam.classLoader, "putString", new Object[] { ContentResolver.class.getName(), String.class.getName(), String.class.getName() });
            addHook(paramLoadPackageParam.packageName, Settings.System.class.getName(), paramLoadPackageParam.classLoader, "getFloat", new Object[] { ContentResolver.class.getName(), String.class.getName() });
            addHook(paramLoadPackageParam.packageName, Settings.System.class.getName(), paramLoadPackageParam.classLoader, "getInt", new Object[] { ContentResolver.class.getName(), String.class.getName() });
            addHook(paramLoadPackageParam.packageName, Settings.System.class.getName(), paramLoadPackageParam.classLoader, "getLong", new Object[] { ContentResolver.class.getName(), String.class.getName() });
            addHook(paramLoadPackageParam.packageName, Settings.System.class.getName(), paramLoadPackageParam.classLoader, "getString", new Object[] { ContentResolver.class.getName(), String.class.getName() });
            addHook(paramLoadPackageParam.packageName, Settings.System.class.getName(), paramLoadPackageParam.classLoader, "getFloat", new Object[] { ContentResolver.class.getName(), String.class.getName(), Float.TYPE.getName() });
            addHook(paramLoadPackageParam.packageName, Settings.System.class.getName(), paramLoadPackageParam.classLoader, "getInt", new Object[] { ContentResolver.class.getName(), String.class.getName(), Integer.TYPE.getName() });
            addHook(paramLoadPackageParam.packageName, Settings.System.class.getName(), paramLoadPackageParam.classLoader, "getLong", new Object[] { ContentResolver.class.getName(), String.class.getName(), Long.TYPE.getName() });
            if (((String)localObject2).equals("5"))
            {
              onLog("--------------------008true1---------------");
              return;
            }
            addHook(paramLoadPackageParam.packageName, Display.class.getName(), paramLoadPackageParam.classLoader, "getMetrics", new Object[] { DisplayMetrics.class.getName() });
            addHook(paramLoadPackageParam.packageName, Display.class.getName(), paramLoadPackageParam.classLoader, "getWidth", new Object[0]);
            addHook(paramLoadPackageParam.packageName, Display.class.getName(), paramLoadPackageParam.classLoader, "getHeight", new Object[0]);
            if ((Build.VERSION.SDK_INT >= 14) && (Build.VERSION.SDK_INT < 17))
            {
              addHook(paramLoadPackageParam.packageName, Display.class.getName(), paramLoadPackageParam.classLoader, "getRawWidth", new Object[0]);
              addHook(paramLoadPackageParam.packageName, Display.class.getName(), paramLoadPackageParam.classLoader, "getRawHeight", new Object[0]);
              if (((String)localObject2).equals("6")) {
                onLog("--------------------008true1---------------");
              }
            }
            else
            {
              if (Build.VERSION.SDK_INT < 17) {
                continue;
              }
              onLog("sdk <17  " + Build.VERSION.SDK_INT);
              addHook(paramLoadPackageParam.packageName, Display.class.getName(), paramLoadPackageParam.classLoader, "getRealSize", new Object[] { Point.class.getName() });
              continue;
            }
            addHook(paramLoadPackageParam.packageName, Location.class.getName(), paramLoadPackageParam.classLoader, "getLatitude", new Object[0]);
            addHook(paramLoadPackageParam.packageName, Location.class.getName(), paramLoadPackageParam.classLoader, "getLongitude", new Object[0]);
            if (((String)localObject2).equals("7"))
            {
              onLog("--------------------008true1---------------");
              return;
            }
            addHook(paramLoadPackageParam.packageName, WifiManager.class.getName(), paramLoadPackageParam.classLoader, "getScanResults", new Object[0]);
            addHook(paramLoadPackageParam.packageName, NetworkInfo.class.getName(), paramLoadPackageParam.classLoader, "getTypeName", new Object[0]);
            addHook(paramLoadPackageParam.packageName, ConnectivityManager.class.getName(), paramLoadPackageParam.classLoader, "getNetworkInfo", new Object[] { Integer.TYPE.getName() });
            addHook(paramLoadPackageParam.packageName, WebView.class.getName(), paramLoadPackageParam.classLoader, "loadUrl", new Object[] { String.class.getName() });
            addHook(paramLoadPackageParam.packageName, WebView.class.getName(), paramLoadPackageParam.classLoader, "loadUrl", new Object[] { String.class.getName(), Map.class.getName() });
            addHook(paramLoadPackageParam.packageName, URLConnection.class.getName(), ClassLoader.getSystemClassLoader(), "getInputStream", new Object[0]);
            addHook(paramLoadPackageParam.packageName, HttpURLConnection.class.getName(), paramLoadPackageParam.classLoader, "getResponseCode", new Object[0]);
            if (((String)localObject2).equals("8"))
            {
              onLog("--------------------008true1---------------");
              return;
            }
            addHook(paramLoadPackageParam.packageName, KeyChain.class.getName(), paramLoadPackageParam.classLoader, "getPrivateKey", new Object[] { Context.class.getName(), String.class.getName() });
            addHook(paramLoadPackageParam.packageName, KeyChain.class.getName(), paramLoadPackageParam.classLoader, "getCertificateChain", new Object[] { Context.class.getName(), String.class.getName() });
            addHook(paramLoadPackageParam.packageName, BluetoothAdapter.class.getName(), paramLoadPackageParam.classLoader, "getAddress", new Object[0]);
            if (((String)localObject2).equals("9"))
            {
              onLog("--------------------008true1---------------");
              return;
            }
            addHook(paramLoadPackageParam.packageName, Runtime.class.getName(), paramLoadPackageParam.classLoader, "exec", new Object[] { String.class.getName() });
            if (((String)localObject2).equals("10"))
            {
              onLog("--------------------008true1---------------");
              return;
            }
            if (!((String)localObject2).equals("11")) {
              addHookCon(paramLoadPackageParam.packageName, FileReader.class.getName(), paramLoadPackageParam.classLoader, new Object[] { String.class.getName() });
            }
            if (!((String)localObject2).equals("12")) {
              addHookCon(paramLoadPackageParam.packageName, File.class.getName(), paramLoadPackageParam.classLoader, new Object[] { String.class.getName(), String.class.getName() });
            }
            if (!((String)localObject2).equals("13")) {
              addHookCon(paramLoadPackageParam.packageName, File.class.getName(), paramLoadPackageParam.classLoader, new Object[] { File.class.getName(), String.class.getName() });
            }
            if ((!((String)localObject2).equals("14")) && (Build.VERSION.SDK_INT <= 22)) {
              addHookCon(paramLoadPackageParam.packageName, File.class.getName(), paramLoadPackageParam.classLoader, new Object[] { String.class.getName() });
            }
            if (!((String)localObject2).equals("15")) {
              addHookCon(paramLoadPackageParam.packageName, RandomAccessFile.class.getName(), paramLoadPackageParam.classLoader, new Object[] { File.class.getName(), String.class.getName() });
            }
            if (!((String)localObject2).equals("16")) {
              addHookCon(paramLoadPackageParam.packageName, RandomAccessFile.class.getName(), paramLoadPackageParam.classLoader, new Object[] { String.class.getName(), String.class.getName() });
            }
          }
        }
      } while (((String)localObject2).equals("17"));
      addHookCon(paramLoadPackageParam.packageName, FileInputStream.class.getName(), paramLoadPackageParam.classLoader, new Object[] { String.class.getName() });
      return;
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
  }
  
  public boolean logMsg()
  {
    String str;
    if (lastTime == 0L)
    {
      str = getTime(PoseHelper008.getFileData("lastUseTime").trim());
      lastTime = new Date().getTime();
      if (str.length() <= 0) {}
    }
    try
    {
      lastTime = Long.parseLong(str);
      label49:
      long l = new Date().getTime();
      if (l - lastTime > 60000L)
      {
        netCheck();
        lastTime = l;
        setTime();
      }
      if (PoseHelper008.getFileData("fresh").trim().equals("true"))
      {
        PoseHelper008.saveDataToFile("fresh", "false");
        lastTime = l;
        netCheck();
        if (logLis != null) {
          logLis.onLog("状态变化");
        }
      }
      str = PoseHelper008.getFileData("checkError").trim();
      if ((str.length() > 0) && (Integer.parseInt(str) > 3)) {
        this.lastStatus = false;
      }
      return this.lastStatus;
    }
    catch (Exception localException)
    {
      break label49;
    }
  }
  
  public void netCheck()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(this.iTag + "imei", sysstr.a());
    localHashMap.put(this.iTag + "action", this.iTag + "checkTime");
  }
  
  public void netReceive1(String paramString)
  {
    if (logLis != null) {
      logLis.onLog("netReceive " + paramString);
    }
    if ((paramString == null) || (paramString.length() == 0))
    {
      this.errorTime += 1;
      PoseHelper008.saveDataToFile("checkError", this.errorTime);
      return;
    }
    for (;;)
    {
      try
      {
        paramString = maputils.getmap(paramString);
        if (paramString == null) {
          break;
        }
        if (!paramString.get("status").equals("true")) {
          break label141;
        }
        this.lastStatus = true;
        this.errorTime = 0;
      }
      catch (Exception paramString)
      {
        this.errorTime += 1;
      }
      break;
      label141:
      this.lastStatus = false;
    }
  }
  
  public void onLog(String paramString)
  {
    Log.e("008log", paramString);
    if (SettingActivity.islog())
    {
      writeToFile(paramString);
      XposedBridge.log(paramString);
    }
  }
  
  public void recordFile(String paramString1, String paramString2)
  {
    if (paramString1.length() == 0) {}
    label7:
    String[] arrayOfString;
    do
    {
      String str;
      int i;
      do
      {
        do
        {
          do
          {
            do
            {
              break label7;
              break label7;
              break label7;
              do
              {
                return;
              } while ((paramString1.indexOf(".logwerdfsdfga") >= 0) || (paramString1.indexOf(".system") >= 0));
              if ((paramString1.indexOf(f.b) == 0) || (paramString1.indexOf("sdcard") >= 0)) {
                break;
              }
            } while ((paramString1.contains("usbotg")) || (paramString1.contains("stat")) || (paramString1.contains("/storage/usbdisk")));
            onLog("访问非内存目录:" + paramString1);
            return;
            if (paramString1.indexOf(f.b + File.separator + "Android/data/" + paramString2) == 0)
            {
              onLog("访问data目录:" + paramString1 + "  " + paramString2);
              return;
            }
          } while (!"true".equals(RecordAppFileHandler.d()));
          str = RecordAppFileHandler.c();
          arrayOfString = str.split("_");
        } while (arrayOfString.length != 2);
        i = str.indexOf("_");
      } while (i == -1);
      arrayOfString[1] = str.substring(i + 1);
    } while ((!paramString2.equals(arrayOfString[1])) || (paramString1.trim().equals(f.b.trim())) || (!f.b(paramString2, paramString1)));
    onLog("记录文件操作" + paramString1);
  }



}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     de.robv.android.xposed.mods.tutorial.Tutorial008

 * JD-Core Version:    0.7.0.1

 */