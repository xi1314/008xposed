package tutorial;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.util.DisplayMetrics;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.soft.apk008.CPUTool;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;

public class PoseHelper008
{
//  public static CheckCanUse check = new CheckCanUse();
  public static String finalFolder = ".system";
  public static JSONObject valueMap = new JSONObject();

  public static void getAllData(Activity paramActivity)
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)paramActivity.getApplicationContext().getSystemService(Context.TELEPHONY_SERVICE);
    valueMap.put("getDeviceId", localTelephonyManager.getDeviceId());
    valueMap.put("getLine1Number", localTelephonyManager.getLine1Number());
    valueMap.put("getSimSerialNumber", localTelephonyManager.getSimSerialNumber());
    valueMap.put("getSubscriberId", localTelephonyManager.getSubscriberId());
    valueMap.put("getSimCountryIso", localTelephonyManager.getSimCountryIso());
    valueMap.put("getSimOperator", localTelephonyManager.getSimOperator());
    valueMap.put("getSimOperatorName", localTelephonyManager.getSimOperatorName());
    valueMap.put("getNetworkCountryIso", localTelephonyManager.getNetworkCountryIso());
    valueMap.put("getNetworkOperator", localTelephonyManager.getNetworkOperator());
    valueMap.put("getNetworkOperatorName", localTelephonyManager.getNetworkOperatorName());
    valueMap.put("getNetworkType", Integer.valueOf(localTelephonyManager.getNetworkType()));
    valueMap.put("getPhoneType", Integer.valueOf(localTelephonyManager.getPhoneType()));
    valueMap.put("getSimState", Integer.valueOf(localTelephonyManager.getSimState()));
    valueMap.put("getRadioVersion", Build.getRadioVersion());
    Object wifiManager = (WifiManager)paramActivity.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
    String macaddress= wifiManager.getConnectionInfo().getMacAddress();
    String ssid=wifiManager.getConnectionInfo().getSSID();
    String bssid=wifiManager.getConnectionInfo().getBSSID();
    valueMap.put("getMacAddress",macaddress);
    valueMap.put("getSSID",ssid );
    valueMap.put("getBSSID", bssid);
   String  androidid = Settings.Secure.getString(paramActivity.getContentResolver(), "android_id");
    valueMap.put("getString", androidid);
    try
    {
     Object localObject1 = Class.forName("android.os.SystemProperties");
      Object localObject2 = ((Class)localObject1).newInstance();
      Object methodget = ((Class)localObject1).getMethod("get", new Class[] { String.class, String.class }).invoke(localObject2, new Object[] { "gsm.version.baseband", "no message" });
      valueMap.put("get", methodget);
      label354:
      localObject2 = localTelephonyManager.getCellLocation();
      localObject1 = "";
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
        valueMap.put("getJiZhan", localObject1);
        valueMap.put("HARDWARE", Build.HARDWARE);
        valueMap.put("RELEASE", VERSION.RELEASE);
        valueMap.put("SDK", VERSION.SDK);
        valueMap.put("BRAND", Build.BRAND);
        valueMap.put("MODEL", Build.MODEL);
        valueMap.put("PRODUCT", Build.PRODUCT);
        valueMap.put("MANUFACTURER", Build.MANUFACTURER);
        valueMap.put("DEVICE", Build.DEVICE);
        valueMap.put("ARCH", Build.CPU_ABI + "_" + Build.CPU_ABI2);
        valueMap.put("FINGERPRINT", Build.FINGERPRINT);
        valueMap.put("setCpuName", CPUTool.getCpuName());
        localObject1 = new DisplayMetrics();
        paramActivity.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
        valueMap.put("getMetrics", ((DisplayMetrics)localObject1).widthPixels + "x" + ((DisplayMetrics)localObject1).heightPixels);
        return;
        if ((localObject2 instanceof CdmaCellLocation))
        {
          localObject1 = (CdmaCellLocation)localTelephonyManager.getCellLocation();
          i = ((CdmaCellLocation)localObject1).getNetworkId();
          j = ((CdmaCellLocation)localObject1).getBaseStationId();
          localObject1 = i + "_" + j;
        }
      }
    }
    catch (Exception localException)
    {
      break label354;
    }
  }

  public static String getFileData(String filename)
  {
    str2 = "";
    str1 = str2;
    for (;;)
    {
      try
      {
        localObject = new File(Environment.getExternalStorageDirectory(), finalFolder);
        str1 = str2;
        if (!((File)localObject).exists())
        {
          str1 = str2;
          ((File)localObject).mkdir();
        }
        str1 = str2;
        filename = new File(Environment.getExternalStorageDirectory(), finalFolder + File.separator + filename);
        str1 = str2;
        boolean bool = filename.exists();
        if (!bool) {
          str1 = str2;
        }
      }
      catch (Exception e)
      {
        Object localObject;
        e.printStackTrace();
        paramString = str1;
        continue;
        str1 = paramString;
        paramString = paramString + str2 + "\n";
        continue;
      }
      try
      {
        filename.createNewFile();
        str1 = str2;
        localObject = new BufferedReader(new FileReader(filename));
        filename = str2;
        str1 = filename;
        str2 = ((BufferedReader)localObject).readLine();
        if (str2 == null)
        {
          str1 = filename;
          ((BufferedReader)localObject).close();
          return filename.trim();
        }
      }
      catch (IOException localIOException)
      {
        str1 = str2;
        localIOException.printStackTrace();
      }
    }
  }

  public static String getFileData(String dirname, String paramString2)
  {
    str2 = "";
    str1 = str2;
    for (;;)
    {
      try
      {
        File localFile = new File(Environment.getExternalStorageDirectory(), dirname);
        str1 = str2;
        if (!localFile.exists())
        {
          str1 = str2;
          localFile.mkdirs();
        }
        str1 = str2;
       File file = new File(Environment.getExternalStorageDirectory(), dirname + File.separator + paramString2);
        str1 = str2;
        boolean bool = file.exists();
        if (!bool) {
          str1 = str2;
        }
      }
      catch (Exception paramString1)
      {
        paramString1.printStackTrace();
        paramString1 = str1;
        continue;
        str1 = paramString1;
        paramString1 = paramString1 + str2 + "\n";
        continue;
      }
      try
      {
        file.createNewFile();
        str1 = str2;
       BufferedReader bufferedReader = new BufferedReader(new FileReader(paramString1));
        paramString1 = str2;
        str1 = paramString1;
        str2 = bufferedReader.readLine();
        if (str2 == null)
        {
          str1 = paramString1;
          bufferedReader.close();
          return paramString1.trim();
        }
      }
      catch (IOException ioexception)
      {
        str1 = str2;
        ioexception.printStackTrace();
      }
    }
  }
  
  public static String getMacFile()
  {
    saveDataToFile("macFile",(String) valueMap.get("getMacAddress"));
    return new File(Environment.getExternalStorageDirectory(), finalFolder + File.separator + "macFile").getAbsolutePath();
  }
  
  public static void initData(Activity paramActivity)
  {
    try
    {
      valueMap = JSON.parseObject(getFileData("xposeDevice.txt"));
      label12:
      if ((valueMap == null) || (valueMap.size() == 0))
      {
        valueMap = new JSONObject();
        if (paramActivity != null) {
          getAllData(paramActivity);
        }
      }
      else
      {
        return;
      }
      valueMap = new JSONObject();
      return;
    }
    catch (Exception localException)
    {
      break label12;
    }
  }
  
  public static void saveData()
  {
    new Thread()
    {
      public void run()
      {
        PoseHelper008.saveDataToFile("xposeDevice.txt", JSON.toJSONString(PoseHelper008.valueMap));
      }
    }.start();
  }
  
  public static void saveDataToFile(String filename, String str)
  {
    try
    {
      File localFile = new File(Environment.getExternalStorageDirectory(), finalFolder);
      if (!localFile.exists()) {
        localFile.mkdir();
      }
      File file = new File(Environment.getExternalStorageDirectory(), finalFolder + File.separator + filename);
      boolean bool = file.exists();
      if (!bool) {

      }
      try
      {
        file.createNewFile();
        FileOutputStream  fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(str.getBytes("UTF-8"));
        fileOutputStream.close();
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          localIOException.printStackTrace();
        }
      }
      return;
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }

  
  public static void saveDataToFile(String filename, String houzui, String conString)
  {
    try
    {
      File localFile = new File(Environment.getExternalStorageDirectory(), filename);
      if (!localFile.exists()) {
        localFile.mkdirs();
      }
      File file = new File(Environment.getExternalStorageDirectory(), filename + File.separator + houzui);
      boolean bool = file.exists();
      if (!bool) {}
      try
      {
        file.createNewFile();
       FileOutputStream fileOutputStream = new FileOutputStream(filename);
        fileOutputStream.write(conString.getBytes("UTF-8"));
        fileOutputStream.close();
        return;
      }
      catch (IOException e)
      {
           e.printStackTrace();
        }
      return;
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}

