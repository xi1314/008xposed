package com.soft.apk008;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.ImageView;

import com.data.simulate.SimulateDataTest;
import com.lishu.c.o;
import com.lishu.c.p;
import com.lishu.c.w;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.HashMap;

public class StartActivity
  extends Activity
  implements w
{
  public static String a = "http://api2.apk008.com/lishu008AppManager";
  public static String b = "http://api2.apk008.com/lishu008AppManager";
  public static String c;
  public static String d = b + "/phone/SystemConSimpleUserAction.action";
  public static String e = "";
  public static boolean f = false;
  public static HashMap g = new HashMap();
  public static String h = "";
  public static String i = "";
  public static String j = "";
  public static String k = "小偷可耻";
  public static String l = "fuck you";
  public static String m = "";
  public static String n = "";
  public static String o = "";
  public static String p = "";
  private static long s = 0L;
  private static String v = b + "/phone/LogicSimpleAction.action";
  o q = new o();
  private p r = new p();
  private int t = 0;
  private boolean u = true;
  private String w = "";
  
  public static String a(Context paramContext, String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer("");

      try
      {BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(paramContext.getResources().getAssets().open(paramString)));

       While((sbufferedReader.readLine()!=null)
        {
        String string = bufferedReader.readLine();
        localStringBuffer.append(string + "\n");
        }
        return localStringBuffer.toString();
      }
      catch (Exception e)
      {
        e.printStackTrace();

      }



  }
  
  public static void a()
  {
    String str = PoseHelper008.getFileData("008network");
    if ((str != null) && (str.trim().length() > 0)) {
      b = a.replace("api2", str);
    }
  }
  
  public static void a(Context paramContext)
  {
    b(paramContext);
    try
    {
      paramContext = e;
      int i1 = e.indexOf("154");
      paramContext = e.substring("154".length() + i1, e.length());
      g.put("signData", paramContext);
      return;
    }
    catch (Exception paramContext) {}
  }
  
  public static HashMap b()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("imei", (String)g.get("imei"));
    localHashMap.put("verName", (String)g.get("verName"));
    localHashMap.put("verCode", (String)g.get("verCode"));
    return localHashMap;
  }
  
  public static HashMap b(Context paramContext)
  {
    if ((g != null) && (g.size() > 0)) {
      return g;
    }
    Object localObject1 = System.currentTimeMillis();
    g.put("phoneTime", localObject1);
    try
    {
      localObject2 = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      localObject1 = null;
      if (localObject2 != null) {
        localObject1 = ((ApplicationInfo)localObject2).metaData;
      }
      if (localObject1 != null) {
        g.put("parentId", "8");
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
    g.put("appid", "zhuan");
    g.put("product", Build.PRODUCT);
    g.put("model", Build.MODEL);
    g.put("osversion", Build.VERSION.SDK);
    localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    localObject1 = localTelephonyManager.getCallState();
    g.put("callState", localObject1);
    localObject2 = j.a(paramContext);
    localObject1 = localObject2;
    if (((String)localObject2).length() == 0)
    {
      localObject1 = SimulateDataTest.getRandData(1, 15);
      j.a(paramContext, (String)localObject1);
    }
    localObject2 = localObject1;
    if (((String)localObject1).equals("000000000000000"))
    {
      localObject2 = SimulateDataTest.getRandData(1, 15);
      j.a(paramContext, (String)localObject2);
    }
    if ((localObject2 != null) && (!((String)localObject2).equals("null")))
    {
      localObject1 = localObject2;
      if (((String)localObject2).trim().length() >= 14) {}
    }
    else
    {
      localObject1 = SimulateDataTest.getRandData(1, 15);
      j.a(paramContext, (String)localObject1);
    }
    g.put("imei", localObject1);
    localObject1 = localTelephonyManager.getDeviceSoftwareVersion();
    g.put("SoftwareVersion", localObject1);
    localObject1 = localTelephonyManager.getNetworkCountryIso();
    g.put("NetworkCountryIso", localObject1);
    localObject1 = localTelephonyManager.getNetworkOperator();
    g.put("NetworkOperator", localObject1);
    localObject1 = localTelephonyManager.getNetworkOperatorName();
    g.put("NetworkOperatorName", localObject1);
    localObject1 = localTelephonyManager.getNetworkType();
    g.put("NetworkType", localObject1);
    localObject1 = localTelephonyManager.getPhoneType();
    g.put("PhoneType", localObject1);
    LoadActivity.a(paramContext);
    localObject1 = localTelephonyManager.getSimCountryIso();
    g.put("SimCountryIso", localObject1);
    localObject1 = localTelephonyManager.getSimOperator();
    g.put("SimOperator", localObject1);
    localObject1 = localTelephonyManager.getSimOperatorName();
    g.put("SimOperatorName", localObject1);
    localObject1 = localTelephonyManager.getSimSerialNumber();
    g.put("SimSerialNumber", localObject1);
    localObject1 = localTelephonyManager.getSimState();
    g.put("SimState", localObject1);
    localObject1 = localTelephonyManager.getSubscriberId();
    g.put("SubscriberId", localObject1);
    localObject1 = localTelephonyManager.getVoiceMailAlphaTag();
    g.put("VoiceMailAlphaTag", localObject1);
    localObject1 = localTelephonyManager.getVoiceMailNumber();
    g.put("VoiceMailNumber", localObject1);
    localObject1 = localTelephonyManager.hasIccCard();
    g.put("hasIccCard", localObject1);
    localObject1 = localTelephonyManager.isNetworkRoaming();
    g.put("NetworkRoaming", localObject1);
    localObject1 = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
    g.put("mac", localObject1);
    localObject1 = d(paramContext);
    g.put("verName", localObject1);
    localObject1 = c(paramContext);
    g.put("verCode", localObject1);
    localObject1 = a(paramContext, "parentId");
    g.put("parentId", localObject1);
    paramContext = a(paramContext, "sellId");
    g.put("sellId", paramContext);
    return g;
  }
  
  public static int c(Context paramContext)
  {
    try
    {
      int i1 = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      return i1;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.e("版本号获取异常", paramContext.getMessage());
    }
    return -1;
  }
  
  private static String d(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.e("版本名称获取异常", paramContext.getMessage());
    }
    return "";
  }
  
  public final void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      runOnUiThread(new cw(this));
      return;
    }
    for (;;)
    {
      try
      {
        paramString = e.b(paramString);
        i = paramString.get("promoteUrl");
        j = paramString.get("sellUrl");
        if (paramString.get("systemMsg") != null) {
          c = paramString.get("systemMsg");
        }
        if ("true".equals(paramString.get("vip")))
        {
          f = true;
          if (paramString.get("functionStr") != null) {
            h = paramString.j("functionStr");
          }
          paramString = new Intent();
          paramString.setClass(this, Apk008Activity.class);
          startActivity(paramString);
          finish();
          return;
        }
      }
      catch (Exception e)
      {
        runOnUiThread(new cx(this));
        return;
      }
      f = false;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    i2 = 0;
    a();
    d = b + "/phone/SystemConSimpleUserAction.action";
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    requestWindowFeature(1);
    i1 = i2;
    if (!LoadActivity.d)
    {
      finish();
      i1 = i2;
    }
    for (;;)
    {
      if (i1 >= SetMessageActivity.e.length())
      {
        setContentView(2130903075);
      ImageView  im = (ImageView)findViewById(2131362002);
        if (!LoadActivity.c) {
         im.setImageResource(2130837591);
        }
        if (a(this, "head").trim().equals("1258")) {
          f = true;
        }
        SimulateDataTest.init(this);
       StringBuilder stringBuilder = new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(new StringBuilder("BOARD: ").append(Build.BOARD).toString())).append(", BOOTLOADER: ").append(Build.BOOTLOADER).append("\n").toString())).append(", BRAND: ").append(Build.BRAND).append("\n").toString())).append(", CPU_ABI: ").append(Build.CPU_ABI).append("\n").toString())).append(", CPU_ABI2: ").append(Build.CPU_ABI2).append("\n").toString())).append(", DEVICE: ").append(Build.DEVICE).append("\n").toString())).append(", DISPLAY: ").append(Build.DISPLAY).append("\n").toString())).append(", FINGERPRINT: ").append(Build.FINGERPRINT).append("\n").toString())).append(", HARDWARE: ").append(Build.HARDWARE).append("\n").toString())).append(", HOST: ").append(Build.HOST).append("\n").toString())).append(", ID: ").append(Build.ID).append("\n").toString())).append(", MANUFACTURER: ").append(Build.MANUFACTURER).append("\n").toString())).append(", MODEL: ").append(Build.MODEL).append("\n").toString())).append(", PRODUCT: ").append(Build.PRODUCT).append("\n").toString())).append(", RADIO: ").append(Build.RADIO).append("\n").toString())).append(", RADITAGSO: ").append(Build.TAGS).append("\n").toString())).append(", TIME: ").append(Build.TIME).append("\n").toString())).append(", TYPE: ").append(Build.TYPE).append("\n").toString())).append(", USER: ").append(Build.USER).append("\n").toString())).append(", VERSION.RELEASE: ").append(Build.VERSION.RELEASE).append("\n").toString())).append(", VERSION.CODENAME: ").append(Build.VERSION.CODENAME).append("\n").toString())).append(", VERSION.INCREMENTAL: ").append(Build.VERSION.INCREMENTAL).append("\n").toString())).append(", VERSION.SDK: ").append(Build.VERSION.SDK).append("\n").toString() + ", VERSION.SDK_INT: " + Build.VERSION.SDK_INT + "\n";
      }
      try
      {
          Class clazz = Class.forName("android.os.SystemProperties");
       Object localObject3 = clazz.newInstance();
       Object localObject1 = clazz.getMethod("get", new Class[] { String.class, String.class }).invoke(localObject3, new Object[] { "gsm.version.baseband", "no message" });
        localObject1 = paramBundle + localObject1 + "\n";
        paramBundle = (Bundle)localObject1;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject1;
          Object localObject3;
          CellLocation localCellLocation;
          continue;
          Object localObject2 = paramBundle;
          if ((localCellLocation instanceof CdmaCellLocation))
          {
            localObject2 = (CdmaCellLocation)((TelephonyManager)localObject3).getCellLocation();
            i1 = ((CdmaCellLocation)localObject2).getNetworkId();
            i2 = ((CdmaCellLocation)localObject2).getBaseStationId();
            localObject2 = paramBundle + " MCC = 0\t MNC = 0\t LAC = " + i1 + "\t CID = " + i2 + "\n";
          }
        }
      }
      localObject3 = (TelephonyManager)getSystemService("phone");
      ((TelephonyManager)localObject3).getNetworkOperator();
      localCellLocation = ((TelephonyManager)localObject3).getCellLocation();
      if (!(localCellLocation instanceof GsmCellLocation)) {
        break;
      }
      localObject1 = (GsmCellLocation)localCellLocation;
      i1 = ((GsmCellLocation)localObject1).getLac();
      i2 = ((GsmCellLocation)localObject1).getCid();
      localObject1 = paramBundle + " MCC = 0\t MNC = 0\t LAC = " + i1 + "\t CID = " + i2 + "\n";
      paramBundle = Settings.Secure.getString(getContentResolver(), "android_id") + "\n";
      paramBundle = localObject1 + paramBundle + "\n";
      localObject1 = new DisplayMetrics();
      getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
      new StringBuilder(String.valueOf(paramBundle)).append(((DisplayMetrics)localObject1).widthPixels).append("x").append(((DisplayMetrics)localObject1).heightPixels).toString();
      getSystemService("wifi");
      a(this);
      new cv(this).start();
      paramBundle = new File(Environment.getExternalStorageDirectory() + File.separator + ".system");
      if (!paramBundle.exists()) {
        paramBundle.mkdir();
      }
      new File(x.c);
      InstallActivity.a(this, "cpuinfo", x.c);
      PoseHelper008.initData(this);
      SetMessageActivity.f.length();
      return;
      SetMessageActivity.f.length();
      i1 += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.StartActivity

 * JD-Core Version:    0.7.0.1

 */