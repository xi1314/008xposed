package tutorial;

import android.app.ActivityManager;
import android.app.ActivityManager.RecentTaskInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ContentResolver;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Process;
import android.provider.Settings;
import android.telephony.NeighboringCellInfo;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.util.DisplayMetrics;
import android.view.Display;
import android.webkit.WebView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.soft.apk008.CPUTool;
import com.soft.apk008.SetDataActivity;
import com.soft.apk008.SettingActivity;
import com.soft.tools.SetSystemValueActivity;
import com.soft.tools.WebViewHookActivity;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class Tutorial008
  implements IXposedHookLoadPackage, LogListener
{
  public static CheckCanUse check = new CheckCanUse();
  public static boolean debug = true;
  
  public Tutorial008()
  {
    CheckCanUse.logLis = this;
  }
  
  private void setProductData()
  {
    if (PoseHelper008.valueMap.size() == 0)
    {
      PoseHelper008.initData(null);
      onLog("第一次加载valueMap");
    }
    if (PoseHelper008.valueMap.get("BRAND") != null) {
      XposedHelpers.setStaticObjectField(Build.class, "BRAND", PoseHelper008.valueMap.get("BRAND"));
    }
    if (PoseHelper008.valueMap.get("MODEL") != null) {
      XposedHelpers.setStaticObjectField(Build.class, "MODEL", PoseHelper008.valueMap.get("MODEL"));
    }
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
      XposedHelpers.setStaticObjectField(VERSION.class, "RELEASE", PoseHelper008.valueMap.get("RELEASE"));
    }
    if (PoseHelper008.valueMap.get("SDK") != null) {
      XposedHelpers.setStaticObjectField(VERSION.class, "SDK", PoseHelper008.valueMap.get("SDK"));
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
  }
  
  public void addHook(final String paramString1, final String paramString2, ClassLoader paramClassLoader, final String paramString3, Object... paramVarArgs)
  {
    paramString1 = new XC_MethodHook()
    {
      protected void afterHookedMethod(MethodHookParam paramAnonymousMethodHookParam)
        throws Throwable
      {
        if (paramString2.equals("cn.yqzq.zqb.tools.EncryptHelpr"))
        {
          Tutorial008.this.onLog("yqzq param0" + paramAnonymousMethodHookParam.args[0]);
          Tutorial008.this.onLog("yqzq param1" + paramAnonymousMethodHookParam.args[1]);
        }
        Object localObject1;
        Object localObject2;
        Object localObject3;
        label366:
        int i;
        label669:
        label823:
        int j;
        label781:
        label949:
        do
        {
          Object localObject4;
          do
          {
            do
            {
              do
              {
                return;
                if ("android.app.ApplicationPackageManager".equals(paramString2))
                {
                  localObject1 = JSON.parseObject(PoseHelper008.getFileData("hideProgess"));
                  if ((localObject1 != null) && (((JSONObject)localObject1).get("ifOpen") != null) && (((JSONObject)localObject1).get("ifOpen").equals("true")) && (((JSONObject)localObject1).get("hide_target") != null))
                  {
                    localObject2 = ((JSONObject)localObject1).get("hide_target").split("_");
                    if (localObject2.length != 2)
                    {
                      Tutorial008.this.onLog("获取程序列表参数错误");
                      super.beforeHookedMethod(paramAnonymousMethodHookParam);
                      return;
                    }
                    if (paramString1.equals(localObject2[1]))
                    {
                      Tutorial008.this.onLog("阻止获取程序列表成功");
                      if (!paramString3.equals("getInstalledApplications")) {
                        break label366;
                      }
                      localObject2 = new ArrayList();
                      localObject3 = (ArrayList)paramAnonymousMethodHookParam.getResult();
                      localObject1 = (JSONObject)((JSONObject)localObject1).get("appArray");
                      if (localObject1 != null) {
                        localObject4 = ((ArrayList)localObject3).iterator();
                      }
                    }
                  }
                }
                Object localObject5;
                for (;;)
                {
                  if (!((Iterator)localObject4).hasNext())
                  {
                    ((ArrayList)localObject3).removeAll((Collection)localObject2);
                    paramAnonymousMethodHookParam.setResult(localObject3);
                    if (!ActivityManager.class.getName().equals(paramString2)) {
                      break label669;
                    }
                    localObject1 = JSON.parseObject(PoseHelper008.getFileData("hideProgess"));
                    if (localObject1 != null) {
                      break;
                    }
                    super.beforeHookedMethod(paramAnonymousMethodHookParam);
                    return;
                  }
                  localObject5 = (ApplicationInfo)((Iterator)localObject4).next();
                  if (((JSONObject)localObject1).get(((ApplicationInfo)localObject5).packageName) != null) {
                    ((ArrayList)localObject2).add(localObject5);
                  }
                }
                localObject2 = new ArrayList();
                localObject3 = (ArrayList)paramAnonymousMethodHookParam.getResult();
                localObject1 = (JSONObject)((JSONObject)localObject1).get("appArray");
                if (localObject1 != null) {
                  localObject4 = ((ArrayList)localObject3).iterator();
                }
                for (;;)
                {
                  if (!((Iterator)localObject4).hasNext())
                  {
                    ((ArrayList)localObject3).removeAll((Collection)localObject2);
                    paramAnonymousMethodHookParam.setResult(localObject3);
                    break;
                  }
                  localObject5 = (PackageInfo)((Iterator)localObject4).next();
                  if (((JSONObject)localObject1).get(((PackageInfo)localObject5).packageName) != null) {
                    ((ArrayList)localObject2).add(localObject5);
                  }
                }
                if ((((JSONObject)localObject1).get("ifOpen") != null) && (((JSONObject)localObject1).get("ifOpen").equals("true")) && (((JSONObject)localObject1).get("hide_target") != null))
                {
                  localObject2 = ((JSONObject)localObject1).get("hide_target").split("_");
                  if (localObject2.length != 2)
                  {
                    Tutorial008.this.onLog("获取程序列表参数错误");
                    super.beforeHookedMethod(paramAnonymousMethodHookParam);
                    return;
                  }
                  if (paramString1.equals(localObject2[1]))
                  {
                    if (!paramString3.equals("getRecentTasks")) {
                      break label823;
                    }
                    Tutorial008.this.onLog("阻止getRecentTasks列表成功");
                    localObject2 = (ArrayList)paramAnonymousMethodHookParam.getResult();
                    localObject3 = new ArrayList();
                    localObject1 = (JSONObject)((JSONObject)localObject1).get("appArray");
                    if (localObject1 != null)
                    {
                      localObject4 = ((ArrayList)localObject2).iterator();
                      if (((Iterator)localObject4).hasNext()) {
                        break label781;
                      }
                      ((ArrayList)localObject2).removeAll((Collection)localObject3);
                    }
                    paramAnonymousMethodHookParam.setResult(localObject2);
                  }
                }
                while (!paramString3.equals("getRunningAppProcesses")) {
                  for (;;)
                  {
                    if (!Settings.System.class.getName().equals(paramString2)) {
                      break label1159;
                    }
                    if (!paramString1.equals(SetSystemValueActivity.getSystemValuePackageName())) {
                      break;
                    }
                    if (paramString3.indexOf("put") < 0) {
                      break label949;
                    }
                    Tutorial008.this.onLog("设置系统值" + paramAnonymousMethodHookParam.args[1] + "---" + paramAnonymousMethodHookParam.args[2]);
                    SetSystemValueActivity.addItem(paramAnonymousMethodHookParam.args[1], false, paramAnonymousMethodHookParam.args[2]);
                    return;
                    localObject5 = (RecentTaskInfo)((Iterator)localObject4).next();
                    if (((JSONObject)localObject1).get(((RecentTaskInfo)localObject5).baseIntent.getComponent().getPackageName()) != null) {
                      ((ArrayList)localObject3).add(localObject5);
                    }
                  }
                }
                Tutorial008.this.onLog("阻止getRunningAppProcesses列表成功");
                localObject2 = (ArrayList)paramAnonymousMethodHookParam.getResult();
                localObject3 = new ArrayList();
                localObject1 = (JSONObject)((JSONObject)localObject1).get("appArray");
                if (localObject1 != null) {
                  localObject4 = ((ArrayList)localObject2).iterator();
                }
                for (;;)
                {
                  if (!((Iterator)localObject4).hasNext())
                  {
                    ((ArrayList)localObject2).removeAll((Collection)localObject3);
                    paramAnonymousMethodHookParam.setResult(localObject2);
                    break;
                  }
                  localObject5 = (RunningAppProcessInfo)((Iterator)localObject4).next();
                  if (((JSONObject)localObject1).get(((RunningAppProcessInfo)localObject5).processName) != null) {
                    ((ArrayList)localObject3).add(localObject5);
                  }
                }
              } while (paramAnonymousMethodHookParam.args[1].equals("android_id"));
              if (paramAnonymousMethodHookParam.args.length == 2)
              {
                Tutorial008.this.onLog("获取系统值" + paramAnonymousMethodHookParam.args[1]);
                Tutorial008.this.onLog("值" + paramAnonymousMethodHookParam.getResult());
                SetSystemValueActivity.addItem(paramAnonymousMethodHookParam.args[1], true, paramAnonymousMethodHookParam.getResult());
                return;
              }
            } while (paramAnonymousMethodHookParam.args.length != 3);
            Tutorial008.this.onLog("获取系统值" + paramAnonymousMethodHookParam.args[1] + "---" + paramAnonymousMethodHookParam.args[2]);
            Tutorial008.this.onLog("值" + paramAnonymousMethodHookParam.getResult());
            SetSystemValueActivity.addItem(paramAnonymousMethodHookParam.args[1], true, paramAnonymousMethodHookParam.getResult());
            return;
            if ((!paramString2.equals(Display.class.getName())) || (PoseHelper008.valueMap == null) || (!SettingActivity.getValue("setDisplay").equals("true"))) {
              break;
            }
            paramAnonymousMethodHookParam.getResult();
            localObject1 = (String)PoseHelper008.valueMap.get("getMetrics");
            localObject2 = ((String)localObject1).split("x");
            if (!paramString3.equals("getMetrics")) {
              break label1576;
            }
            localObject3 = (DisplayMetrics)paramAnonymousMethodHookParam.args[0];
            localObject4 = PoseHelper008.getFileData("sourceDisplay").split("_");
          } while (localObject4.length != 2);
          i = Integer.parseInt(localObject4[0]);
          j = Integer.parseInt(localObject4[1]);
        } while ((i != ((DisplayMetrics)localObject3).widthPixels) || (j != ((DisplayMetrics)localObject3).heightPixels));
        label1159:
        if (localObject2.length == 2)
        {
          Tutorial008.this.onLog("模拟分辨率1" + (String)localObject1);
          i = Integer.parseInt(localObject2[0]);
          ((DisplayMetrics)localObject3).heightPixels = Integer.parseInt(localObject2[1]);
          ((DisplayMetrics)localObject3).widthPixels = i;
          if (PoseHelper008.valueMap.get("density") != null) {
            ((DisplayMetrics)localObject3).density = Float.parseFloat((String) PoseHelper008.valueMap.get("density"));
          }
          if (PoseHelper008.valueMap.get("densityDpi") != null) {
            ((DisplayMetrics)localObject3).densityDpi = Integer.parseInt((String) PoseHelper008.valueMap.get("densityDpi"));
          }
          if (PoseHelper008.valueMap.get("scaledDensity") != null) {
            ((DisplayMetrics)localObject3).scaledDensity = Float.parseFloat((String) PoseHelper008.valueMap.get("scaledDensity"));
          }
          if (PoseHelper008.valueMap.get("xdpi") != null) {
            ((DisplayMetrics)localObject3).xdpi = Float.parseFloat((String) PoseHelper008.valueMap.get("xdpi"));
          }
          if (PoseHelper008.valueMap.get("ydpi") != null) {
            ((DisplayMetrics)localObject3).ydpi = Float.parseFloat((String) PoseHelper008.valueMap.get("ydpi"));
          }
          paramAnonymousMethodHookParam.setResult(localObject3);
        }
        for (;;)
        {
          super.afterHookedMethod(paramAnonymousMethodHookParam);
          return;
          label1576:
          if (paramString3.equals("getWidth"))
          {
            if (localObject2.length == 2)
            {
              Tutorial008.this.onLog("模拟分辨率getWidth" + localObject2[0]);
              paramAnonymousMethodHookParam.setResult(Integer.valueOf(Integer.parseInt(localObject2[0])));
            }
          }
          else if ((paramString3.equals("getHeight")) && (localObject2.length == 2))
          {
            Tutorial008.this.onLog("模拟分辨率getHeight" + localObject2[1]);
            paramAnonymousMethodHookParam.setResult(Integer.valueOf(Integer.parseInt(localObject2[1])));
          }
        }
      }
      
      protected void beforeHookedMethod(MethodHookParam paramAnonymousMethodHookParam)
        throws Throwable
      {
        if (Settings.System.class.getName().equals(paramString2)) {
          if ((paramAnonymousMethodHookParam.args.length >= 2) && (paramString3.equals("getString")) && (paramAnonymousMethodHookParam.args[1].equals("android_id")) && (PoseHelper008.valueMap != null) && (PoseHelper008.valueMap.get(paramString3) != null))
          {
            paramAnonymousMethodHookParam.setResult(PoseHelper008.valueMap.get(paramString3));
            Tutorial008.this.onLog("settings.system.  android" + PoseHelper008.valueMap.get(paramString3));
          }
        }
        label570:
        label597:
        label632:
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    return;
                    Object localObject2;
                    try
                    {
                      if (!Environment.getExternalStorageState().equals("mounted"))
                      {
                        Tutorial008.this.onLog("存储卡还未挂载");
                        super.beforeHookedMethod(paramAnonymousMethodHookParam);
                        return;
                      }
                    }
                    catch (Exception localException)
                    {
                      localObject2 = new StringWriter();
                      localException.printStackTrace(new PrintWriter((Writer)localObject2));
                      Tutorial008.this.onLog(localObject2.toString());
                      super.beforeHookedMethod(paramAnonymousMethodHookParam);
                      return;
                    }
                    if (!"android.os.SystemProperties".equals(paramString2))
                    {
                      if (!Tutorial008.check.isCanUse()) {
                        super.beforeHookedMethod(paramAnonymousMethodHookParam);
                      }
                    }
                    else if (paramAnonymousMethodHookParam.args.length >= 1) {
                      if (paramAnonymousMethodHookParam.args[0].equals("gsm.version.baseband"))
                      {
                        if (PoseHelper008.valueMap.get("getRadioVersion") != null)
                        {
                          Tutorial008.this.onLog("gsm.version.baseband " + PoseHelper008.valueMap.get("getRadioVersion"));
                          paramAnonymousMethodHookParam.setResult(PoseHelper008.valueMap.get("getRadioVersion"));
                        }
                      }
                      else
                      {
                        if (!paramAnonymousMethodHookParam.args[0].equals("gsm.sim.state")) {
                          break label570;
                        }
                        if (SettingActivity.getValue("setCard").trim().equals("true")) {
                          paramAnonymousMethodHookParam.setResult("READY");
                        }
                      }
                    }
                    if ((paramString3.equals("hasIccCard")) && (SettingActivity.getValue("setCard").trim().equals("true"))) {
                      paramAnonymousMethodHookParam.setResult(Boolean.valueOf(true));
                    }
                    PoseHelper008.initData(null);
                    Tutorial008.this.setProductData();
                    if ((NetworkInfo.class.getName().equals(paramString2)) && (PoseHelper008.valueMap.getString("connect_mode") != null))
                    {
                      localObject1 = PoseHelper008.valueMap.getString("connect_mode");
                      if (((String)localObject1).equals("1")) {
                        paramAnonymousMethodHookParam.setResult("WIFI");
                      }
                    }
                    else if ((ConnectivityManager.class.getName().equals(paramString2)) && (PoseHelper008.valueMap.getString("connect_mode") != null))
                    {
                      localObject1 = PoseHelper008.valueMap.getString("connect_mode");
                      if ((((String)localObject1).equals("1")) || (((String)localObject1).equals("2")))
                      {
                        if ((NetworkInfo)paramAnonymousMethodHookParam.getResult() != null) {
                          break label597;
                        }
                        if ((paramAnonymousMethodHookParam.args[0].equals(Integer.valueOf(1))) && (((String)localObject1).equals("2"))) {
                          paramAnonymousMethodHookParam.args[0] = Integer.valueOf(0);
                        }
                      }
                    }
                    for (;;)
                    {
                      if (PoseHelper008.valueMap.getString("getDeviceId") != null) {
                        break label632;
                      }
                      super.beforeHookedMethod(paramAnonymousMethodHookParam);
                      return;
                      super.beforeHookedMethod(paramAnonymousMethodHookParam);
                      return;
                      if (!((String)localObject1).equals("2")) {
                        break;
                      }
                      paramAnonymousMethodHookParam.setResult("MOBILE");
                      break;
                      if ((paramAnonymousMethodHookParam.args[0].equals(Integer.valueOf(1))) && (((String)localObject1).equals("1"))) {
                        paramAnonymousMethodHookParam.setResult(null);
                      }
                    }
                    localObject1 = SetDataActivity.getSign(PoseHelper008.valueMap.getString("getDeviceId"));
                    if (!((String)localObject1).trim().equals(PoseHelper008.valueMap.getString("sign").trim()))
                    {
                      Tutorial008.this.onLog("签名错误" + (String)localObject1 + "   sign:" + PoseHelper008.valueMap.getString("sign"));
                      super.beforeHookedMethod(paramAnonymousMethodHookParam);
                      return;
                    }
                    if (PoseHelper008.valueMap == null) {
                      break label2145;
                    }
                    int i;
                    if ((GsmCellLocation.class.getName().equals(paramString2)) || (NeighboringCellInfo.class.getName().equals(paramString2))) {
                      if ((PoseHelper008.valueMap.get("getJiZhan") != null) && (PoseHelper008.valueMap.get("location_mode").equals("1")))
                      {
                        localObject1 = PoseHelper008.valueMap.get("getJiZhan").split("_");
                        if (!paramString3.equals("getLac")) {
                          break label976;
                        }
                        i = Integer.parseInt(localObject1[0]);
                        paramAnonymousMethodHookParam.setResult(Integer.valueOf(i));
                        if (Tutorial008.debug) {
                          Tutorial008.this.onLog("getLac  " + i);
                        }
                      }
                    }
                    do
                    {
                      for (;;)
                      {
                        if (PoseHelper008.valueMap.get(paramString3) == null) {
                          break label2139;
                        }
                        if ((!paramString3.equals("getNetworkType")) && (!paramString3.equals("getPhoneType")) && (!paramString3.equals("getSimState"))) {
                          break label1724;
                        }
                        paramAnonymousMethodHookParam.setResult(Integer.valueOf(Integer.parseInt(PoseHelper008.valueMap.get(paramString3))));
                        return;
                        if (paramString3.equals("getCid"))
                        {
                          i = Integer.parseInt(localObject1[1]);
                          paramAnonymousMethodHookParam.setResult(Integer.valueOf(i));
                          if (Tutorial008.debug)
                          {
                            Tutorial008.this.onLog("getCid  " + i);
                            continue;
                            if (Location.class.getName().equals(paramString2))
                            {
                              if ((PoseHelper008.valueMap.get("gps") != null) && (PoseHelper008.valueMap.get("location_mode").equals("2")))
                              {
                                localObject1 = PoseHelper008.valueMap.get("gps");
                                localObject2 = ((String)localObject1).split("_");
                                if (localObject2.length == 2)
                                {
                                  Tutorial008.this.onLog("gps定位" + (String)localObject1);
                                  double d1 = Double.parseDouble(localObject2[0]);
                                  double d2 = Double.parseDouble(localObject2[1]);
                                  if (paramString3.equals("getLatitude")) {
                                    paramAnonymousMethodHookParam.setResult(Double.valueOf(d1));
                                  } else if (paramString3.equals("getLongitude")) {
                                    paramAnonymousMethodHookParam.setResult(Double.valueOf(d2));
                                  }
                                }
                              }
                            }
                            else if (CdmaCellLocation.class.getName().equals(paramString2))
                            {
                              if ((PoseHelper008.valueMap.get("getJiZhan") != null) && (PoseHelper008.valueMap.get("location_mode").equals("1")))
                              {
                                Tutorial008.this.onLog("基站定位");
                                localObject1 = PoseHelper008.valueMap.get("getJiZhan").split("_");
                                if (paramString3.equals("getNetworkId"))
                                {
                                  i = Integer.parseInt(localObject1[0]);
                                  paramAnonymousMethodHookParam.setResult(Integer.valueOf(i));
                                  if (Tutorial008.debug) {
                                    Tutorial008.this.onLog("getNetworkId  " + i);
                                  }
                                }
                                else if (paramString3.equals("getBaseStationId"))
                                {
                                  i = Integer.parseInt(localObject1[1]);
                                  paramAnonymousMethodHookParam.setResult(Integer.valueOf(i));
                                  if (Tutorial008.debug) {
                                    Tutorial008.this.onLog("getBaseStationId  " + i);
                                  }
                                }
                              }
                            }
                            else
                            {
                              if (!WifiManager.class.getName().equals(paramString2)) {
                                break;
                              }
                              if (SettingActivity.getValue("setScan").equals("true"))
                              {
                                Tutorial008.this.onLog("阻止--获取wifi列表");
                                paramAnonymousMethodHookParam.setResult(new ArrayList());
                              }
                              else
                              {
                                super.beforeHookedMethod(paramAnonymousMethodHookParam);
                              }
                            }
                          }
                        }
                      }
                      if (WebView.class.getName().equals(paramString2))
                      {
                        localObject1 = WebViewHookActivity.getSet();
                        localObject2 = ((JSONObject)localObject1).get("setStr");
                        if (!((JSONObject)localObject1).get("open").trim().equals("true")) {
                          break;
                        }
                        i = ((String)localObject2).indexOf("_");
                        if (i == -1) {
                          break;
                        }
                        localObject1 = ((String)localObject2).substring(i + 1);
                        if (!paramString1.equals(localObject1)) {
                          break;
                        }
                        Tutorial008.this.onLog("webView");
                        WebViewHookActivity.addLog(paramAnonymousMethodHookParam.args[0]);
                        return;
                      }
                    } while (!Runtime.class.getName().equals(paramString2));
                    localObject1 = (String)paramAnonymousMethodHookParam.args[0];
                  } while (((String)localObject1).indexOf("/sys/class/net/wlan0/address") < 0);
                  paramAnonymousMethodHookParam.args[0] = ((String)localObject1).replace("/sys/class/net/wlan0/address", PoseHelper008.getMacFile());
                  return;
                  if (!PackageManager.class.getName().equals(paramString2)) {
                    break;
                  }
                  localObject1 = JSON.parseObject(PoseHelper008.getFileData("hideProgess"));
                } while ((localObject1 == null) || (((JSONObject)localObject1).get("hide_target") == null));
                localObject1 = localObject1.get("hide_target").split("_")[0];
                return;
                if (!ActivityManager.class.getName().equals(paramString2)) {
                  break;
                }
                localObject1 = JSON.parseObject(PoseHelper008.getFileData("hideProgess"));
              } while ((localObject1 == null) || (((JSONObject)localObject1).get("hide_target") == null));
              Object localObject1 = localObject1.get("hide_target").split("_")[0];
              return;
              if (!"android.os.SystemProperties".equals(paramString2)) {
                break;
              }
            } while (paramAnonymousMethodHookParam.args.length <= 1);
            if ((paramAnonymousMethodHookParam.args[0].equals("gsm.version.baseband")) && (paramAnonymousMethodHookParam.args[1].equals("no message")))
            {
              Tutorial008.this.onLog("gsm.version.baseband " + PoseHelper008.valueMap.get(paramString3));
              paramAnonymousMethodHookParam.setResult(PoseHelper008.valueMap.get(paramString3));
              return;
            }
            Tutorial008.this.onLog("android.os.SystemProperties  " + paramAnonymousMethodHookParam.args[0]);
            super.beforeHookedMethod(paramAnonymousMethodHookParam);
            return;
            if (!paramString2.equals(Settings.Secure.class.getName())) {
              break;
            }
          } while (paramAnonymousMethodHookParam.args.length <= 1);
          if (((String)paramAnonymousMethodHookParam.args[1]).equals("android_id"))
          {
            Tutorial008.this.onLog("android_id :" + PoseHelper008.valueMap.get(paramString3));
            paramAnonymousMethodHookParam.setResult(PoseHelper008.valueMap.get(paramString3));
            return;
          }
          super.beforeHookedMethod(paramAnonymousMethodHookParam);
          return;
        } while (paramString2.equals(Display.class.getName()));
        label976:
        paramAnonymousMethodHookParam.setResult(PoseHelper008.valueMap.get(paramString3));
        label1724:
        return;
        label2139:
        super.beforeHookedMethod(paramAnonymousMethodHookParam);
        return;
        label2145:
        super.beforeHookedMethod(paramAnonymousMethodHookParam);
      }
    };
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
  
  public void addHookCon(final String paramString1, final String paramString2, ClassLoader paramClassLoader, Object... paramVarArgs)
  {
    paramString1 = new XC_MethodHook()
    {
      protected void beforeHookedMethod(MethodHookParam paramAnonymousMethodHookParam)
        throws Throwable
      {
        String str = "";
        if (paramString2.equals(File.class.getName())) {
          if (paramAnonymousMethodHookParam.args.length != 1) {}
        }
        label134:
        label300:
        do
        {
          String[] arrayOfString;
          do
          {
            int i;
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        str = paramAnonymousMethodHookParam.args[0];
                        break label134;
                        break label134;
                        break label134;
                        break label134;
                        break label134;
                        break label134;
                        for (;;)
                        {
                          if ((!str.equals("/proc/cpuinfo")) || (!new File(CPUTool.myCpuFile).exists())) {
                            break label300;
                          }
                          Tutorial008.this.onLog("设置cpu信息");
                          if (PoseHelper008.valueMap.get("setCpuName") != null) {
                            CPUTool.setCpuName(PoseHelper008.valueMap.get("setCpuName"));
                          }
                          if (paramAnonymousMethodHookParam.args.length != 1) {
                            break;
                          }
                          paramAnonymousMethodHookParam.args[0] = CPUTool.myCpuFile;
                          return;
                          if (paramAnonymousMethodHookParam.args.length == 2) {
                            if ((paramAnonymousMethodHookParam.args[0] instanceof File)) {
                              str = ((File)paramAnonymousMethodHookParam.args[0]).getAbsolutePath() + File.separator + paramAnonymousMethodHookParam.args[1];
                            } else {
                              str = paramAnonymousMethodHookParam.args[0] + File.separator + paramAnonymousMethodHookParam.args[1];
                            }
                          }
                        }
                      } while (paramAnonymousMethodHookParam.args.length != 2);
                      if ((paramAnonymousMethodHookParam.args[0] instanceof File))
                      {
                        paramAnonymousMethodHookParam.args[0] = Environment.getExternalStorageDirectory();
                        paramAnonymousMethodHookParam.args[1] = CPUTool.file;
                        return;
                      }
                      paramAnonymousMethodHookParam.args[0] = Environment.getExternalStorageDirectory().getAbsolutePath();
                      paramAnonymousMethodHookParam.args[1] = CPUTool.file;
                      return;
                      if (PoseHelper008.valueMap.get("file_hook_package_open").equals("true"))
                      {
                        arrayOfString = PoseHelper008.valueMap.get("file_hook_package").split("_");
                        if ((arrayOfString.length == 2) && (paramString1.equals(arrayOfString[1])) && (str.indexOf(".log") < 0) && (str.indexOf(".system") < 0) && (str.indexOf(MyLog.ExternalStorage) == 0) && (!str.trim().equals(MyLog.ExternalStorage.trim())) && (MyLog.addLogLast(paramString1, str))) {
                          Tutorial008.this.onLog("记录文件操作" + str);
                        }
                      }
                      super.afterHookedMethod(paramAnonymousMethodHookParam);
                      return;
                    } while (!FileReader.class.getName().equals(paramString2));
                    if (!paramAnonymousMethodHookParam.args[0].equals("/proc/cpuinfo")) {
                      break;
                    }
                  } while ((!new File(CPUTool.myCpuFile).exists()) || (PoseHelper008.valueMap.get("setCpuName") == null));
                  Tutorial008.this.onLog("设置cpu信息");
                  CPUTool.setCpuName(PoseHelper008.valueMap.get("setCpuName"));
                  paramAnonymousMethodHookParam.args[0] = CPUTool.myCpuFile;
                  return;
                } while (!(paramAnonymousMethodHookParam.args[0] instanceof String));
                str = PoseHelper008.valueMap.get("file_hook_package");
                arrayOfString = str.split("_");
              } while (arrayOfString.length != 2);
              i = str.indexOf("_");
            } while (i == -1);
            arrayOfString[1] = str.substring(i + 1);
          } while (!paramString1.equals(arrayOfString[1]));
          paramAnonymousMethodHookParam = (String)paramAnonymousMethodHookParam.args[0];
        } while ((paramAnonymousMethodHookParam.indexOf(".log") >= 0) || (paramAnonymousMethodHookParam.indexOf(".system") >= 0) || (paramAnonymousMethodHookParam.indexOf(MyLog.ExternalStorage) != 0) || (paramAnonymousMethodHookParam.trim().equals(MyLog.ExternalStorage.trim())) || (!MyLog.addLogLast(paramString1, paramAnonymousMethodHookParam)));
        Tutorial008.this.onLog("记录文件操作" + paramAnonymousMethodHookParam);
      }
    };
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
    onLog("-----------------------lishu  MyXpose------------ " + paramLoadPackageParam.packageName);
    if ((paramLoadPackageParam.packageName.equals("com.soft.apk008v")) || (paramLoadPackageParam.packageName.equals("com.android.systemui")) || (paramLoadPackageParam.packageName.equals("com.yulong.android.launcher3")) || (paramLoadPackageParam.packageName.equals("com.android.packageinstaller")) || (paramLoadPackageParam.packageName.equals("com.mediatek.op02.plugin"))) {}
    String str;
    do
    {
      return;
      PoseHelper008.saveDataToFile("install", "true");
      if (PoseHelper008.getFileData("008Mode").length() <= 0) {
        break label256;
      }
      str = PoseHelper008.getFileData("008Mode");
      if (str.equals("2"))
      {
        str = PoseHelper008.getFileData("systemProPackAge");
        if (str.equals(paramLoadPackageParam.packageName)) {
          break;
        }
        onLog("当前模式为特定应用" + str);
        return;
      }
      if (str.equals("0"))
      {
        onLog("当前模式为关闭");
        return;
      }
      if (!str.equals("3")) {
        break label238;
      }
      onLog("当前模式为全局（非系统应用）");
    } while (Process.myUid() <= 1000);
    label256:
    for (;;)
    {
      addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "getDeviceId", new Object[0]);
      if (Process.myUid() > 1000) {
        break;
      }
      onLog("系统应用");
      setProductData();
      return;
      label238:
      if (str.equals("1"))
      {
        onLog("当前模式为全局");
        continue;
        PoseHelper008.saveDataToFile("008Mode", "3");
      }
    }
    onLog("非系统应用");
    if (MyLog.ExternalStorage.length() == 0) {
      MyLog.ExternalStorage = Environment.getExternalStorageDirectory().getAbsolutePath();
    }
    addHook(paramLoadPackageParam.packageName, WifiInfo.class.getName(), paramLoadPackageParam.classLoader, "getMacAddress", new Object[0]);
    addHook(paramLoadPackageParam.packageName, WifiInfo.class.getName(), paramLoadPackageParam.classLoader, "getSSID", new Object[0]);
    addHook(paramLoadPackageParam.packageName, WifiInfo.class.getName(), paramLoadPackageParam.classLoader, "getBSSID", new Object[0]);
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
    addHook(paramLoadPackageParam.packageName, Settings.Secure.class.getName(), paramLoadPackageParam.classLoader, "getString", new Object[] { ContentResolver.class.getName(), String.class.getName() });
    addHook(paramLoadPackageParam.packageName, TelephonyManager.class.getName(), paramLoadPackageParam.classLoader, "getSimState", new Object[0]);
    addHook(paramLoadPackageParam.packageName, Build.class.getName(), paramLoadPackageParam.classLoader, "getRadioVersion", new Object[0]);
    addHook(paramLoadPackageParam.packageName, "android.app.ApplicationPackageManager", paramLoadPackageParam.classLoader, "getInstalledPackages", new Object[] { Integer.TYPE.getName() });
    addHook(paramLoadPackageParam.packageName, ActivityManager.class.getName(), paramLoadPackageParam.classLoader, "getRunningAppProcesses", new Object[0]);
    addHook(paramLoadPackageParam.packageName, "android.app.ApplicationPackageManager", paramLoadPackageParam.classLoader, "getInstalledApplications", new Object[] { Integer.TYPE.getName() });
    addHook(paramLoadPackageParam.packageName, ActivityManager.class.getName(), paramLoadPackageParam.classLoader, "getRecentTasks", new Object[] { Integer.TYPE.getName(), Integer.TYPE.getName() });
    addHook(paramLoadPackageParam.packageName, "android.os.SystemProperties", paramLoadPackageParam.classLoader, "get", new Object[] { String.class, String.class });
    addHook(paramLoadPackageParam.packageName, "android.os.SystemProperties", paramLoadPackageParam.classLoader, "get", new Object[] { String.class });
    addHook(paramLoadPackageParam.packageName, GsmCellLocation.class.getName(), paramLoadPackageParam.classLoader, "getLac", new Object[0]);
    addHook(paramLoadPackageParam.packageName, GsmCellLocation.class.getName(), paramLoadPackageParam.classLoader, "getCid", new Object[0]);
    addHook(paramLoadPackageParam.packageName, CdmaCellLocation.class.getName(), paramLoadPackageParam.classLoader, "getNetworkId", new Object[0]);
    addHook(paramLoadPackageParam.packageName, CdmaCellLocation.class.getName(), paramLoadPackageParam.classLoader, "getBaseStationId", new Object[0]);
    addHook(paramLoadPackageParam.packageName, NeighboringCellInfo.class.getName(), paramLoadPackageParam.classLoader, "getLac", new Object[0]);
    addHook(paramLoadPackageParam.packageName, NeighboringCellInfo.class.getName(), paramLoadPackageParam.classLoader, "getCid", new Object[0]);
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
    addHook(paramLoadPackageParam.packageName, Display.class.getName(), paramLoadPackageParam.classLoader, "getMetrics", new Object[] { DisplayMetrics.class.getName() });
    addHook(paramLoadPackageParam.packageName, Display.class.getName(), paramLoadPackageParam.classLoader, "getWidth", new Object[0]);
    addHook(paramLoadPackageParam.packageName, Display.class.getName(), paramLoadPackageParam.classLoader, "getHeight", new Object[0]);
    addHook(paramLoadPackageParam.packageName, Location.class.getName(), paramLoadPackageParam.classLoader, "getLatitude", new Object[0]);
    addHook(paramLoadPackageParam.packageName, Location.class.getName(), paramLoadPackageParam.classLoader, "getLongitude", new Object[0]);
    addHook(paramLoadPackageParam.packageName, WifiManager.class.getName(), paramLoadPackageParam.classLoader, "getScanResults", new Object[0]);
    addHook(paramLoadPackageParam.packageName, NetworkInfo.class.getName(), paramLoadPackageParam.classLoader, "getTypeName", new Object[0]);
    addHook(paramLoadPackageParam.packageName, ConnectivityManager.class.getName(), paramLoadPackageParam.classLoader, "getNetworkInfo", new Object[] { Integer.TYPE.getName() });
    addHook(paramLoadPackageParam.packageName, WebView.class.getName(), paramLoadPackageParam.classLoader, "loadUrl", new Object[] { String.class.getName() });
    addHook(paramLoadPackageParam.packageName, WebView.class.getName(), paramLoadPackageParam.classLoader, "loadUrl", new Object[] { String.class.getName(), Map.class.getName() });
    addHook(paramLoadPackageParam.packageName, Runtime.class.getName(), paramLoadPackageParam.classLoader, "exec", new Object[] { String.class.getName() });
    addHookCon(paramLoadPackageParam.packageName, FileReader.class.getName(), paramLoadPackageParam.classLoader, new Object[] { String.class.getName() });
    addHookCon(paramLoadPackageParam.packageName, File.class.getName(), paramLoadPackageParam.classLoader, new Object[] { String.class.getName(), String.class.getName() });
    addHookCon(paramLoadPackageParam.packageName, File.class.getName(), paramLoadPackageParam.classLoader, new Object[] { File.class.getName(), String.class.getName() });
    addHookCon(paramLoadPackageParam.packageName, File.class.getName(), paramLoadPackageParam.classLoader, new Object[] { String.class.getName() });
  }
  
  public void onLog(String paramString)
  {
    if (SettingActivity.isLog()) {
      XposedBridge.log(paramString);
    }
  }


}

