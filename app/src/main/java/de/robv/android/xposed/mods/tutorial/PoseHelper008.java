package de.robv.android.xposed.mods.tutorial;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.util.DisplayMetrics;

import com.a.a.Map;
import com.soft.apk008.SetMessageActivity;
import com.soft.apk008.aa;
import com.soft.apk008.x;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import de.robv.android.xposed.XC_MethodHook;

public class PoseHelper008
{
  public static int a;
  public static int b;
  static ArrayList c = null;
  public static checktime check;
  public static boolean effect = false;
  public static String finalFolder;
  public static String[] lastImei;
  public static String packageName;
  public static Map valueMap = new Map();
  public static int verCode;
  public static int verCodeOther;
  
  static
  {
    check = new checktime();
    finalFolder = ".system";
    packageName = "com.soft.apk008v";
    lastImei = new String[] { "", "" };
    verCode = 0;
    verCodeOther = 12;
  }
  
  public static void StoreLastImei(String paramString)
  {
    if (!lastImei[0].equals(paramString)) {
      lastImei[0] = paramString;
    }
    while (lastImei[1].equals(paramString)) {
      return;
    }
    lastImei[1] = paramString;
  }
  
  public static boolean checkFileName(String paramString, XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    if (c == null)
    {
      c = new ArrayList();
      String localObject = getMacFile();
      c.add(new String[] { "sys/class/net/wlan0/address", localObject });
      c.add(new String[] { "sys/class/net/eth0/address", localObject });
      c.add(new String[] { "sys/class/net/em0/address", localObject });
    }
    Object localObject = c.iterator();

    if (!((Iterator)localObject).hasNext()) {}
    String[] arrayOfString;


    for (paramString = null;; paramString = arrayOfString[1])
    {
      if (paramString == null) {
        if (paramMethodHookParam.args.length == 1) {
          paramMethodHookParam.args[0] = paramString;
        }
        for (;;)
        {
          return true;
          if (paramMethodHookParam.args.length == 2) {
            if ((paramMethodHookParam.args[0] instanceof File))
            {
              paramMethodHookParam.args[0] = new File("/");
              paramMethodHookParam.args[1] = paramString;
            }
            else
            {
              paramMethodHookParam.args[0] = "/";
              paramMethodHookParam.args[1] = paramString;
            }
          }
        }
      }


      return false;
      arrayOfString = (String[])((Iterator)localObject).next();
      if (!paramString.contains(arrayOfString[0])) {
        break;
      }
    }


  }
  
  public static String execIfConfig(String paramString)
  {
    saveDataToFile("ifconfig", "eth0      Link encap:Ethernet  HWaddr " + valueMap.get("getMacAddress") + "\ninet addr:10.0.2.15  Bcast:10.0.2.255  Mask:255.255.255\ninet6 addr: fe80::a00:27ff:fe5a:b770/64 Scope:Link\n UP BROADCAST RUNNING MULTICAST  MTU:1500  Metric:1\n RX packets:1813 errors:0 dropped:0 overruns:0 frame:0\n TX packets:1231 errors:0 dropped:0 overruns:0 carrier:0\ncollisions:0 txqueuelen:1000RX bytes:118334 (115.5 KiB)  TX bytes:99980 (97.6 KiB)");
    String str = getFilePath("ifconfig");
    return paramString.replace("ifconfig", "cat " + str);
  }
  
  public static void getAllData(Activity paramActivity)
  {
    Object localObject1 = (TelephonyManager)paramActivity.getSystemService(Context.TELEPHONY_SERVICE);
    valueMap.putkey("getDeviceId", ((TelephonyManager)localObject1).getDeviceId());
    valueMap.putkey("getLine1Number", ((TelephonyManager)localObject1).getLine1Number());
    valueMap.putkey("getSimSerialNumber", ((TelephonyManager)localObject1).getSimSerialNumber());
    valueMap.putkey("getSubscriberId", ((TelephonyManager)localObject1).getSubscriberId());
    valueMap.putkey("getSimCountryIso", ((TelephonyManager)localObject1).getSimCountryIso());
    valueMap.putkey("getSimOperator", ((TelephonyManager)localObject1).getSimOperator());
    valueMap.putkey("getSimOperatorName", ((TelephonyManager)localObject1).getSimOperatorName());
    valueMap.putkey("getNetworkCountryIso", ((TelephonyManager)localObject1).getNetworkCountryIso());
    valueMap.putkey("getNetworkOperator", ((TelephonyManager)localObject1).getNetworkOperator());
    valueMap.putkey("getNetworkOperatorName", ((TelephonyManager)localObject1).getNetworkOperatorName());
    valueMap.putkey("getNetworkType", Integer.valueOf(((TelephonyManager)localObject1).getNetworkType()));
    valueMap.putkey("getPhoneType", Integer.valueOf(((TelephonyManager)localObject1).getPhoneType()));
    valueMap.putkey("GL_RENDERER", aa.a());
    valueMap.putkey("GL_VENDOR", aa.b());
    valueMap.putkey("getSimState", Integer.valueOf(((TelephonyManager)localObject1).getSimState()));
    valueMap.putkey("getRadioVersion", Build.getRadioVersion());
    Object localObject2 = (WifiManager)paramActivity.getSystemService("wifi");
    valueMap.putkey("getMacAddress", ((WifiManager)localObject2).getConnectionInfo().getMacAddress());
    valueMap.putkey("getSSID", ((WifiManager)localObject2).getConnectionInfo().getSSID());
    valueMap.putkey("getBSSID", ((WifiManager)localObject2).getConnectionInfo().getBSSID());
    localObject2 = Settings.Secure.getString(paramActivity.getContentResolver(), "android_id");
    valueMap.putkey("getString", localObject2);
    try
    {
      localObject2 = Class.forName("android.os.SystemProperties");
      Object localObject3 = ((Class)localObject2).newInstance();
      localObject2 = ((Class)localObject2).getMethod("get", new Class[] { String.class, String.class }).invoke(localObject3, new Object[] { "gsm.version.baseband", "no message" });
      valueMap.putkey("get", localObject2);
      localObject2 = ((TelephonyManager)localObject1).getCellLocation();
      int i;
      int j;
      if ((localObject2 instanceof GsmCellLocation))
      {
        localObject1 = (GsmCellLocation)localObject2;
        i = ((GsmCellLocation)localObject1).getLac();
        j = ((GsmCellLocation)localObject1).getCid();
        localObject1 = i + "_" + j;
      }
      for (;;)
      {
        valueMap.putkey("getJiZhan", localObject1);
        valueMap.putkey("HARDWARE", Build.HARDWARE);
        valueMap.putkey("RELEASE", Build.VERSION.RELEASE);
        valueMap.putkey("SDK", Build.VERSION.SDK);
        valueMap.putkey("BRAND", Build.BRAND);
        valueMap.putkey("ID", Build.ID);
        valueMap.putkey("DISPLAY", Build.DISPLAY);
        valueMap.putkey("MODEL", Build.MODEL);
        valueMap.putkey("PRODUCT", Build.PRODUCT);
        valueMap.putkey("MANUFACTURER", Build.MANUFACTURER);
        valueMap.putkey("DEVICE", Build.DEVICE);
        valueMap.putkey("ARCH", Build.CPU_ABI + "_" + Build.CPU_ABI2);
        valueMap.putkey("FINGERPRINT", Build.FINGERPRINT);
        valueMap.putkey("setCpuName", x.a());
        valueMap.putkey("SERIAL", Build.SERIAL);
        try
        {
          localObject1 = BluetoothAdapter.getDefaultAdapter().getAddress();
          valueMap.putkey("getAddress", localObject1);
          try
          {
            label675:
            localObject1 = Class.forName("android.os.SystemProperties");
            ((Class)localObject1).getMethod("get", new Class[] { String.class }).invoke(localObject1, new Object[] { "ro.serialno" });
            label713:
            localObject1 = new DisplayMetrics();
            paramActivity.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
            valueMap.putkey("getMetrics", ((DisplayMetrics)localObject1).widthPixels + "x" + ((DisplayMetrics)localObject1).heightPixels);
            return;
            if ((localObject2 instanceof CdmaCellLocation))
            {
              localObject1 = (CdmaCellLocation)((TelephonyManager)localObject1).getCellLocation();
              i = ((CdmaCellLocation)localObject1).getNetworkId();
              j = ((CdmaCellLocation)localObject1).getBaseStationId();
              localObject1 = i + "_" + j;
            }
          }
          catch (Exception localException1)
          {
            break label713;
          }
        }
        catch (Exception localException2)
        {
          break label675;
        }
      }
    }
    catch (Exception localException3)
    {
      for (;;)
      {
        continue;
        String str = "";
      }
    }
  }
  
  public static String getExternalStorageDirectory()
  {
    if (Process.myUid() == 1000) {
      return "/mnt/sdcard";
    }
    return Environment.getExternalStorageDirectory().getAbsolutePath();
  }
  
  public static String getFileData(String paramString)
  {
    for (;;)
    {
      try
      {
        localObject = new File(getExternalStorageDirectory(), finalFolder);
        if (!((File)localObject).exists()) {
          ((File)localObject).mkdir();
        }
        paramString = new File(getExternalStorageDirectory(), finalFolder + File.separator + paramString);
        boolean bool = paramString.exists();
        if (bool) {}
      }
      catch (Exception paramString)
      {
        Object localObject;
        long l;
        paramString = "";
        continue;
      }
      try
      {
        paramString.createNewFile();
        l = paramString.length();
        if (l == 0L)
        {
          paramString = "";
          return paramString.trim();
        }
      }
      catch (IOException paramString)
      {
        return "";
      }
      localObject = new FileInputStream(paramString);
      paramString = new byte[(int)l];
      paramString = new String(paramString, 0, ((FileInputStream)localObject).read(paramString), "utf-8");
      try
      {
        ((FileInputStream)localObject).close();
      }
      catch (Exception localException) {}
    }
  }
  
  /* Error */
  public static String getFileData(String paramString1, String paramString2)
  {

  }
  
  public static String getFilePath(String paramString)
  {
    try
    {
      File localFile = new File(getExternalStorageDirectory(), finalFolder);
      if (!localFile.exists()) {
        localFile.mkdir();
      }
      paramString = new File(getExternalStorageDirectory(), finalFolder + File.separator + paramString);
      boolean bool = paramString.exists();
      if (!bool) {}
      try
      {
        paramString.createNewFile();
        paramString = paramString.getAbsolutePath();
        return paramString;
      }
      catch (IOException paramString)
      {
        return "";
      }
      return "";
    }
    catch (Exception paramString) {}
  }
  
  public static String getMacFile()
  {
    saveDataToFile("macFile", valueMap.get("getMacAddress"));
    return new File(getExternalStorageDirectory(), finalFolder + File.separator + "macFile").getAbsolutePath();
  }
  
  public static String getProcVersion()
  {
    valueMap.get("/proc/version");
    return "/proc/version";
  }
  
  public static void initData(Activity paramActivity)
  {
    try
    {
      valueMap = a.b(getFileData("xposeDevice.txt"));
      label12:
      if ((valueMap == null) || (valueMap.size() == 0))
      {
        valueMap = new Map();
        if (paramActivity != null) {
          getAllData(paramActivity);
        }
      }
      else
      {
        return;
      }
      valueMap = new Map();
      return;
    }
    catch (Exception localException)
    {
      break label12;
    }
  }
  
  public static void saveData()
  {
    SetMessageActivity.e();
    new savedataThread().start();
  }
  
  public static String saveDataToFile(String paramString1, String paramString2)
  {
    Object localObject2 = "";
    if ((Environment.getExternalStorageState() == null) || (!Environment.getExternalStorageState().equals("mounted"))) {
      return "";
    }
    Object localObject1 = localObject2;
    try
    {
      File localFile = new File(getExternalStorageDirectory(), finalFolder);
      localObject1 = localObject2;
      if (!localFile.exists())
      {
        localObject1 = localObject2;
        localFile.mkdir();
      }
      localObject1 = localObject2;
      localFile = new File(getExternalStorageDirectory(), finalFolder + File.separator + paramString1);
      localObject1 = localObject2;
      boolean bool = localFile.exists();
      if (!bool) {
        localObject1 = localObject2;
      }
      return "";
    }
    catch (Exception paramString1)
    {
      try
      {
        localFile.createNewFile();
        localObject1 = localObject2;
        paramString1 = "/sdcard/" + finalFolder + File.separator + paramString1;
        localObject1 = paramString1;
        localObject2 = new FileOutputStream(localFile);
        localObject1 = paramString1;
        ((FileOutputStream)localObject2).write(paramString2.getBytes("UTF-8"));
        localObject1 = paramString1;
        ((FileOutputStream)localObject2).flush();
        localObject1 = paramString1;
        ((FileOutputStream)localObject2).close();
        return paramString1;
      }
      catch (IOException paramString1) {}
      paramString1 = paramString1;
      paramString1.printStackTrace();
      return localObject1;
    }
  }
  
  public static void saveDataToFile(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      File localFile = new File(getExternalStorageDirectory(), paramString1);
      if (!localFile.exists()) {
        localFile.mkdirs();
      }
      paramString1 = new File(getExternalStorageDirectory(), paramString1 + File.separator + paramString2);
      boolean bool = paramString1.exists();
      if (!bool) {}
      try
      {
        paramString1.createNewFile();
        paramString1 = new FileOutputStream(paramString1);
        paramString1.write(paramString3.getBytes("UTF-8"));
        paramString1.close();
        return;
      }
      catch (IOException paramString2)
      {
        for (;;)
        {
          paramString2.printStackTrace();
        }
      }
      return;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     de.robv.android.xposed.mods.tutorial.PoseHelper008

 * JD-Core Version:    0.7.0.1

 */