package de.robv.android.xposed.mods.tutorial;

import android.app.ActivityManager;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Environment;
import android.provider.Settings;
import android.security.KeyChain;
import android.telephony.NeighboringCellInfo;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.util.DisplayMetrics;
import android.view.Display;
import android.webkit.WebView;

import com.a.a.Map;
import com.a.a.maputils;
import com.data.simulate.SimulateDataTest;
import com.soft.apk008.SettingActivity;
import com.soft.tools.SetSystemValueActivity;
import com.soft.tools.WebViewHookActivity;
import de.robv.android.xposed.XC_MethodHook;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Tutorial008$1
  extends XC_MethodHook
{
  Tutorial008$1(Tutorial008 paramTutorial008, String paramString1, String paramString2, ClassLoader paramClassLoader, String paramString3) {}
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
    throws Throwable
  {
    if (this.b.equals("cn.yqzq.zqb.tools.EncryptHelpr"))
    {
      this.a.onLog("yqzq param0" + paramMethodHookParam.args[0]);
      this.a.onLog("yqzq param1" + paramMethodHookParam.args[1]);
    }
    Object localObject1;
    Object localObject2;
    Object localObject3;
    label330:
    label366:
    int i;
    label793:
    label835:
    int j;
    label961:
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
            if ("android.app.ApplicationPackageManager".equals(this.b))
            {
              localObject1 = maputils.getmap(PoseHelper008.getFileData("hideProgess"));
              if ((localObject1 != null) && (((Map)localObject1).get("ifOpen") != null) && (((Map)localObject1).get("ifOpen").equals("true")) && (((Map)localObject1).get("hide_target") != null))
              {
                localObject2 = ((Map)localObject1).get("hide_target").split("_");
                if (localObject2.length != 2)
                {
                  this.a.onLog("获取程序列表参数错误");
                  super.beforeHookedMethod(paramMethodHookParam);
                  return;
                }
                if (this.e.equals(localObject2[1]))
                {
                  this.a.onLog("阻止获取程序列表成功");
                  if (!this.c.equals("getInstalledApplications")) {
                    break label366;
                  }
                  localObject2 = new ArrayList();
                  localObject3 = (ArrayList)paramMethodHookParam.getResult();
                  localObject1 = (Map)((Map)localObject1).get("appArray");
                  if (localObject1 != null)
                  {
                    localObject4 = ((ArrayList)localObject3).iterator();
                    if (((Iterator)localObject4).hasNext()) {
                      break label330;
                    }
                    ((ArrayList)localObject3).removeAll((Collection)localObject2);
                  }
                  paramMethodHookParam.setResult(localObject3);
                }
              }
            }
            Object localObject5;
            for (;;)
            {
              if (ActivityManager.class.getName().equals(this.b))
              {
                localObject1 = maputils.getmap(PoseHelper008.getFileData("hideProgess"));
                if (localObject1 == null)
                {
                  super.beforeHookedMethod(paramMethodHookParam);
                  return;
                  localObject5 = (ApplicationInfo)((Iterator)localObject4).next();
                  if (((Map)localObject1).get(((ApplicationInfo)localObject5).packageName) == null) {
                    break;
                  }
                  ((ArrayList)localObject2).add(localObject5);
                  break;
                  if (!this.c.equals("getInstalledPackages")) {
                    continue;
                  }
                  localObject2 = new ArrayList();
                  localObject3 = (ArrayList)paramMethodHookParam.getResult();
                  localObject1 = (Map)((Map)localObject1).get("appArray");
                  if (localObject1 != null) {
                    localObject4 = ((ArrayList)localObject3).iterator();
                  }
                  for (;;)
                  {
                    if (!((Iterator)localObject4).hasNext())
                    {
                      ((ArrayList)localObject3).removeAll((Collection)localObject2);
                      paramMethodHookParam.setResult(localObject3);
                      break;
                    }
                    localObject5 = (PackageInfo)((Iterator)localObject4).next();
                    if (((Map)localObject1).get(((PackageInfo)localObject5).packageName) != null) {
                      ((ArrayList)localObject2).add(localObject5);
                    }
                  }
                }
                if ((((Map)localObject1).get("ifOpen") != null) && (((Map)localObject1).get("ifOpen").equals("true")) && (((Map)localObject1).get("hide_target") != null))
                {
                  localObject2 = ((Map)localObject1).get("hide_target").split("_");
                  if (localObject2.length != 2)
                  {
                    this.a.onLog("获取程序列表参数错误");
                    super.beforeHookedMethod(paramMethodHookParam);
                    return;
                  }
                  if (this.e.equals(localObject2[1]))
                  {
                    if (!this.c.equals("getRecentTasks")) {
                      break label835;
                    }
                    this.a.onLog("阻止getRecentTasks列表成功");
                    localObject2 = (ArrayList)paramMethodHookParam.getResult();
                    localObject3 = new ArrayList();
                    localObject1 = (Map)((Map)localObject1).get("appArray");
                    if (localObject1 != null)
                    {
                      localObject4 = ((ArrayList)localObject2).iterator();
                      if (((Iterator)localObject4).hasNext()) {
                        break label793;
                      }
                      ((ArrayList)localObject2).removeAll((Collection)localObject3);
                    }
                    paramMethodHookParam.setResult(localObject2);
                  }
                }
              }
            }
            while (!this.c.equals("getRunningAppProcesses")) {
              for (;;)
              {
                if (!Settings.System.class.getName().equals(this.b)) {
                  break label1171;
                }
                if (!this.e.equals(SetSystemValueActivity.b())) {
                  break;
                }
                if (this.c.indexOf("put") < 0) {
                  break label961;
                }
                this.a.onLog("设置系统值" + paramMethodHookParam.args[1] + "---" + paramMethodHookParam.args[2]);
                SetSystemValueActivity.a(paramMethodHookParam.args[1], false, paramMethodHookParam.args[2]);
                return;
                localObject5 = (ActivityManager.RecentTaskInfo)((Iterator)localObject4).next();
                if (((Map)localObject1).get(((ActivityManager.RecentTaskInfo)localObject5).baseIntent.getComponent().getPackageName()) != null) {
                  ((ArrayList)localObject3).add(localObject5);
                }
              }
            }
            this.a.onLog("阻止getRunningAppProcesses列表成功");
            localObject2 = (ArrayList)paramMethodHookParam.getResult();
            localObject3 = new ArrayList();
            localObject1 = (Map)((Map)localObject1).get("appArray");
            if (localObject1 != null) {
              localObject4 = ((ArrayList)localObject2).iterator();
            }
            for (;;)
            {
              if (!((Iterator)localObject4).hasNext())
              {
                ((ArrayList)localObject2).removeAll((Collection)localObject3);
                paramMethodHookParam.setResult(localObject2);
                break;
              }
              localObject5 = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject4).next();
              if (((Map)localObject1).get(((ActivityManager.RunningAppProcessInfo)localObject5).processName) != null) {
                ((ArrayList)localObject3).add(localObject5);
              }
            }
          } while (paramMethodHookParam.args[1].equals("android_id"));
          if (paramMethodHookParam.args.length == 2)
          {
            this.a.onLog("获取系统值" + paramMethodHookParam.args[1]);
            this.a.onLog("值" + paramMethodHookParam.getResult());
            SetSystemValueActivity.a(paramMethodHookParam.args[1], true, paramMethodHookParam.getResult());
            return;
          }
        } while (paramMethodHookParam.args.length != 3);
        this.a.onLog("获取系统值" + paramMethodHookParam.args[1] + "---" + paramMethodHookParam.args[2]);
        this.a.onLog("值" + paramMethodHookParam.getResult());
        SetSystemValueActivity.a(paramMethodHookParam.args[1], true, paramMethodHookParam.getResult());
        return;
        if ((!this.b.equals(Display.class.getName())) || (PoseHelper008.valueMap == null) || (!SettingActivity.a("setDisplay").equals("true"))) {
          break;
        }
        paramMethodHookParam.getResult();
        localObject2 = (String)PoseHelper008.valueMap.get("getMetrics");
        localObject1 = ((String)localObject2).split("x");
        if (!this.c.equals("getMetrics")) {
          break label1601;
        }
        localObject3 = (DisplayMetrics)paramMethodHookParam.args[0];
        localObject4 = PoseHelper008.getFileData("sourceDisplay").split("_");
      } while (localObject4.length != 2);
      readThread = Integer.parseInt(localObject4[0]);
      sysstr = Integer.parseInt(localObject4[1]);
    } while ((readThread != ((DisplayMetrics)localObject3).widthPixels) || (sysstr != ((DisplayMetrics)localObject3).heightPixels));
    label1171:
    if (localObject1.length == 2)
    {
      this.a.onLog("模拟分辨率1" + (String)localObject2);
      readThread = Integer.parseInt(localObject1[0]);
      ((DisplayMetrics)localObject3).heightPixels = Integer.parseInt(localObject1[1]);
      ((DisplayMetrics)localObject3).widthPixels = readThread;
      if (PoseHelper008.valueMap.get("density") != null) {
        ((DisplayMetrics)localObject3).density = Float.parseFloat(PoseHelper008.valueMap.get("density"));
      }
      if (PoseHelper008.valueMap.get("densityDpi") != null) {
        ((DisplayMetrics)localObject3).densityDpi = Integer.parseInt(PoseHelper008.valueMap.get("densityDpi"));
      }
      if (PoseHelper008.valueMap.get("scaledDensity") != null) {
        ((DisplayMetrics)localObject3).scaledDensity = Float.parseFloat(PoseHelper008.valueMap.get("scaledDensity"));
      }
      if (PoseHelper008.valueMap.get("xdpi") != null) {
        ((DisplayMetrics)localObject3).xdpi = Float.parseFloat(PoseHelper008.valueMap.get("xdpi"));
      }
      if (PoseHelper008.valueMap.get("ydpi") != null) {
        ((DisplayMetrics)localObject3).ydpi = Float.parseFloat(PoseHelper008.valueMap.get("ydpi"));
      }
      paramMethodHookParam.setResult(localObject3);
    }
    for (;;)
    {
      super.afterHookedMethod(paramMethodHookParam);
      return;
      label1601:
      if (this.c.equals("getWidth"))
      {
        if (localObject1.length == 2)
        {
          this.a.onLog("模拟分辨率getWidth" + localObject1[0]);
          paramMethodHookParam.setResult(Integer.valueOf(Integer.parseInt(localObject1[0])));
        }
      }
      else if (this.c.equals("getHeight"))
      {
        if (localObject1.length == 2)
        {
          this.a.onLog("模拟分辨率getHeight" + localObject1[1]);
          paramMethodHookParam.setResult(Integer.valueOf(Integer.parseInt(localObject1[1])));
        }
      }
      else if (this.c.equals("getRealSize"))
      {
        if (localObject1.length == 2)
        {
          this.a.onLog("-----getRealSize----");
          localObject2 = (Point)paramMethodHookParam.args[0];
          ((Point)localObject2).x = Integer.parseInt(localObject1[0]);
          ((Point)localObject2).y = Integer.parseInt(localObject1[1]);
        }
      }
      else if (this.c.equals("getRawWidth"))
      {
        if (localObject1.length == 2) {
          paramMethodHookParam.setResult(Integer.valueOf(Integer.parseInt(localObject1[0])));
        }
      }
      else if ((this.c.equals("getRawHeight")) && (localObject1.length == 2)) {
        paramMethodHookParam.setResult(Integer.valueOf(Integer.parseInt(localObject1[1])));
      }
    }
  }
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
    throws Throwable
  {
    Object localObject2;
    try
    {
      if (Settings.System.class.getName().equals(this.b))
      {
        if ((paramMethodHookParam.args.length < 2) || (!this.c.equals("getString")) || (!paramMethodHookParam.args[1].equals("android_id")) || (PoseHelper008.valueMap == null) || (PoseHelper008.valueMap.get(this.c) == null)) {
          break label3858;
        }
        paramMethodHookParam.setResult(PoseHelper008.valueMap.get(this.c));
        this.a.onLog("settings.system.  android" + PoseHelper008.valueMap.get(this.c));
        return;
      }
      if (Class.class.getName().equals(this.b))
      {
        String str = (String)paramMethodHookParam.args[0];
        this.a.onLog("Class.forName  " + str);
        paramMethodHookParam.setResult(Class.forName(str, true, this.d));
        return;
      }
    }
    catch (Exception localException1)
    {
      localObject2 = new StringWriter();
      localException1.printStackTrace(new PrintWriter((Writer)localObject2));
      this.a.onLog(localObject2.toString());
      super.beforeHookedMethod(paramMethodHookParam);
      return;
    }
    if (KeyChain.class.getName().equals(this.b))
    {
      this.a.onLog("KeyChain   " + paramMethodHookParam.args[1]);
      return;
    }
    if (!Environment.getExternalStorageState().equals("mounted"))
    {
      this.a.onLog("存储卡还未挂载");
      super.beforeHookedMethod(paramMethodHookParam);
      return;
    }
    Object localObject1;
    if (!"android.os.SystemProperties".equals(this.b))
    {
      if (!Tutorial008.check.savecheckerror()) {
        super.beforeHookedMethod(paramMethodHookParam);
      }
    }
    else
    {
      if (paramMethodHookParam.args.length <= 0) {
        break label3858;
      }
      if (paramMethodHookParam.args[0].equals("gsm.version.baseband"))
      {
        if (PoseHelper008.valueMap.get("getRadioVersion") == null) {
          break label3858;
        }
        this.a.onLog("gsm.version.baseband " + PoseHelper008.valueMap.get("getRadioVersion"));
        paramMethodHookParam.setResult(PoseHelper008.valueMap.get("getRadioVersion"));
        return;
      }
      if (paramMethodHookParam.args[0].equals("gsm.sim.state"))
      {
        if (!SettingActivity.a("setCard").trim().equals("true")) {
          break label3858;
        }
        paramMethodHookParam.setResult("READY");
        return;
      }
      if (paramMethodHookParam.args[0].equals("ro.serialno"))
      {
        this.a.onLog("ro.serialno " + PoseHelper008.valueMap.get("SERIAL"));
        paramMethodHookParam.setResult(PoseHelper008.valueMap.get("SERIAL"));
        return;
      }
      if (paramMethodHookParam.args[0].length() > 0)
      {
        if (Tutorial008.access$0(this.a) == null) {
          Tutorial008.access$1(this.a, new com.lishu.d.a());
        }
        Tutorial008.access$0(this.a);
        com.lishu.d.a.b();
        Tutorial008.access$0(this.a);
        new StringBuilder().append(paramMethodHookParam.args[0]).toString();
        localObject1 = com.lishu.d.a.d();
        if (localObject1 == null)
        {
          this.a.onLog("android.os.SystemProperties  " + paramMethodHookParam.args[0]);
          super.beforeHookedMethod(paramMethodHookParam);
          return;
        }
        paramMethodHookParam.setResult(localObject1);
        this.a.onLog("android.os.SystemProperties  " + paramMethodHookParam.args[0]);
        return;
      }
      this.a.onLog("android.os.SystemProperties  " + paramMethodHookParam.args[0]);
      super.beforeHookedMethod(paramMethodHookParam);
      return;
    }
    if ((this.c.equals("hasIccCard")) && (SettingActivity.a("setCard").trim().equals("true"))) {
      paramMethodHookParam.setResult(Boolean.valueOf(true));
    }
    PoseHelper008.initData(null);
    Tutorial008.access$2(this.a);
    if ((NetworkInfo.class.getName().equals(this.b)) && (PoseHelper008.valueMap.getStringfrommap("connect_mode") != null))
    {
      localObject1 = PoseHelper008.valueMap.getStringfrommap("connect_mode");
      if (((String)localObject1).equals("1")) {
        paramMethodHookParam.setResult("WIFI");
      }
    }
    else if ((ConnectivityManager.class.getName().equals(this.b)) && (PoseHelper008.valueMap.getStringfrommap("connect_mode") != null))
    {
      localObject1 = PoseHelper008.valueMap.getStringfrommap("connect_mode");
      if ((((String)localObject1).equals("1")) || (((String)localObject1).equals("2")))
      {
        if ((NetworkInfo)paramMethodHookParam.getResult() != null) {
          break label981;
        }
        if ((paramMethodHookParam.args[0].equals(Integer.valueOf(1))) && (((String)localObject1).equals("2"))) {
          paramMethodHookParam.args[0] = Integer.valueOf(0);
        }
      }
    }
    for (;;)
    {
      if (PoseHelper008.valueMap.getStringfrommap("getDeviceId") != null) {
        break label1016;
      }
      super.beforeHookedMethod(paramMethodHookParam);
      return;
      if (!((String)localObject1).equals("2")) {
        break;
      }
      paramMethodHookParam.setResult("MOBILE");
      break;
      label981:
      if ((paramMethodHookParam.args[0].equals(Integer.valueOf(1))) && (((String)localObject1).equals("1"))) {
        paramMethodHookParam.setResult(null);
      }
    }
    label1016:
    int i;
    if (PoseHelper008.valueMap != null)
    {
      if (this.c.equals("getCellLocation"))
      {
        localObject1 = PoseHelper008.valueMap.get("location_mode");
        if ((((String)localObject1).equals("3")) || (((String)localObject1).equals("4"))) {
          paramMethodHookParam.setResult(null);
        }
      }
      else
      {
        if ((!GsmCellLocation.class.getName().equals(this.b)) && (!NeighboringCellInfo.class.getName().equals(this.b))) {
          break label1499;
        }
        if (PoseHelper008.valueMap.get("getJiZhan") != null)
        {
          localObject1 = PoseHelper008.valueMap.get("location_mode");
          if (!((String)localObject1).equals("1")) {
            break label1408;
          }
          localObject1 = PoseHelper008.valueMap.get("getJiZhan").split("_");
          if (!this.c.equals("getLac")) {
            break label1343;
          }
          readThread = Integer.parseInt(localObject1[0]);
          paramMethodHookParam.setResult(Integer.valueOf(readThread));
          if (Tutorial008.debug) {
            this.a.onLog("getLac  " + readThread);
          }
        }
      }
      for (;;)
      {
        if (PoseHelper008.valueMap.get(this.c) != null) {
          if ((this.c.equals("getNetworkType")) || (this.c.equals("getPhoneType")) || (this.c.equals("getSimState")))
          {
            paramMethodHookParam.setResult(Integer.valueOf(Integer.parseInt(PoseHelper008.valueMap.get(this.c))));
            return;
            label1343:
            if (this.c.equals("getCid"))
            {
              readThread = Integer.parseInt(localObject1[1]);
              paramMethodHookParam.setResult(Integer.valueOf(readThread));
              if (Tutorial008.debug)
              {
                this.a.onLog("getCid  " + readThread);
                continue;
                if (((String)localObject1).equals("3")) {
                  if (this.c.equals("getLac"))
                  {
                    paramMethodHookParam.setResult(Integer.valueOf(-1));
                    if (Tutorial008.debug) {
                      this.a.onLog("getLac0");
                    }
                  }
                  else if (this.c.equals("getCid"))
                  {
                    paramMethodHookParam.setResult(Integer.valueOf(-1));
                    label3020:
                    if (Tutorial008.debug)
                    {
                      this.a.onLog("getCid0");
                      continue;
                      label1499:
                      if (Location.class.getName().equals(this.b))
                      {
                        if (PoseHelper008.valueMap.get("gps") != null)
                        {
                          localObject1 = PoseHelper008.valueMap.get("location_mode");
                          if ((((String)localObject1).equals("2")) || (((String)localObject1).equals("3")))
                          {
                            localObject1 = PoseHelper008.valueMap.get("gps");
                            localObject2 = ((String)localObject1).split("_");
                            if (localObject2.length == 2)
                            {
                              this.a.onLog("gps定位" + (String)localObject1);
                              double d1 = Double.parseDouble(localObject2[0]);
                              double d2 = Double.parseDouble(localObject2[1]);
                              if (this.c.equals("getLatitude")) {
                                paramMethodHookParam.setResult(Double.valueOf(d1));
                              } else if (this.c.equals("getLongitude")) {
                                paramMethodHookParam.setResult(Double.valueOf(d2));
                              }
                            }
                          }
                        }
                      }
                      else if (LocationManager.class.getName().equals(this.b))
                      {
                        if (PoseHelper008.valueMap.get("gps") != null)
                        {
                          localObject1 = PoseHelper008.valueMap.get("location_mode");
                          if ((((String)localObject1).equals("2")) || (((String)localObject1).equals("3")))
                          {
                            if (paramMethodHookParam.method.getName().equals("requestLocationUpdates")) {
                              if (paramMethodHookParam.args[1] != null) {
                                GpsListener.gpslistener().a((LocationListener)paramMethodHookParam.args[1]);
                              }
                            }
                            for (;;)
                            {
                              this.a.onLog("gps定位: LocationManager");
                              break;
                              localObject1 = "requestLocationUpdates 1null";
                              if (paramMethodHookParam.args[2] == null) {
                                localObject1 = "requestLocationUpdates 1null" + "param[2] null";
                              }
                              for (;;)
                              {
                                this.a.onLog((String)localObject1);
                                break;
                                if (paramMethodHookParam.args[3] == null) {
                                  localObject1 = "requestLocationUpdates 1null" + "param[3] null";
                                }
                              }
                              if (paramMethodHookParam.method.getName().equals("addGpsStatusListener"))
                              {
                                GpsListener.gpslistener().a((LocationManager)paramMethodHookParam.thisObject);
                                GpsListener.gpslistener().a((GpsStatus.Listener)paramMethodHookParam.args[0]);
                              }
                            }
                          }
                        }
                      }
                      else if (CdmaCellLocation.class.getName().equals(this.b))
                      {
                        if (PoseHelper008.valueMap.get("getJiZhan") != null)
                        {
                          localObject1 = PoseHelper008.valueMap.get("location_mode");
                          if (((String)localObject1).equals("1"))
                          {
                            this.a.onLog("基站定位");
                            localObject1 = PoseHelper008.valueMap.get("getJiZhan").split("_");
                            if (this.c.equals("getNetworkId"))
                            {
                              readThread = Integer.parseInt(localObject1[0]);
                              paramMethodHookParam.setResult(Integer.valueOf(readThread));
                              if (Tutorial008.debug) {
                                this.a.onLog("getNetworkId  " + readThread);
                              }
                            }
                            else if (this.c.equals("getBaseStationId"))
                            {
                              readThread = Integer.parseInt(localObject1[1]);
                              paramMethodHookParam.setResult(Integer.valueOf(readThread));
                              if (Tutorial008.debug) {
                                this.a.onLog("getBaseStationId  " + readThread);
                              }
                            }
                          }
                          else if (((String)localObject1).equals("3"))
                          {
                            if (this.c.equals("getNetworkId"))
                            {
                              paramMethodHookParam.setResult(Integer.valueOf(-1));
                              if (Tutorial008.debug) {
                                this.a.onLog("getNetworkId0");
                              }
                            }
                            else if (this.c.equals("getBaseStationId"))
                            {
                              paramMethodHookParam.setResult(Integer.valueOf(-1));
                              if (Tutorial008.debug) {
                                this.a.onLog("getBaseStationId0");
                              }
                            }
                          }
                        }
                      }
                      else if (WifiManager.class.getName().equals(this.b))
                      {
                        if (SettingActivity.a("setScan").equals("true"))
                        {
                          this.a.onLog("阻止--获取wifi列表");
                          paramMethodHookParam.setResult(new ArrayList());
                        }
                        else
                        {
                          super.beforeHookedMethod(paramMethodHookParam);
                        }
                      }
                      else
                      {
                        if (WebView.class.getName().equals(this.b))
                        {
                          if (SettingActivity.a("setUserAgent").equals("true"))
                          {
                            localObject1 = (WebView)paramMethodHookParam.thisObject;
                            localObject2 = SimulateDataTest.getUserAgent(1, PoseHelper008.valueMap.getStringfrommap("RELEASE"), PoseHelper008.valueMap.getStringfrommap("MODEL"));
                            this.a.onLog((String)localObject2);
                            ((WebView)localObject1).getSettings().setUserAgentString((String)localObject2);
                          }
                          localObject1 = WebViewHookActivity.a();
                          localObject2 = ((Map)localObject1).get("setStr");
                          if (!((Map)localObject1).get("open").trim().equals("true")) {
                            break label3858;
                          }
                          readThread = ((String)localObject2).indexOf("_");
                          if (readThread == -1) {
                            break label3858;
                          }
                          localObject1 = ((String)localObject2).substring(readThread + 1);
                          if (!this.e.equals(localObject1)) {
                            break label3858;
                          }
                          this.a.onLog("webView");
                          WebViewHookActivity.a(paramMethodHookParam.args[0]);
                          return;
                        }
                        if ((URLConnection.class.getName().equals(this.b)) || (HttpURLConnection.class.getName().equals(this.b)))
                        {
                          if (SettingActivity.a("setUserAgent").equals("true"))
                          {
                            localObject1 = (URLConnection)paramMethodHookParam.thisObject;
                            localObject2 = SimulateDataTest.getUserAgent(2, PoseHelper008.valueMap.getStringfrommap("RELEASE"), PoseHelper008.valueMap.getStringfrommap("MODEL"));
                            this.a.onLog("URLConnection" + (String)localObject2);
                            ((URLConnection)localObject1).setRequestProperty("User-Agent", (String)localObject2);
                          }
                          this.a.onLog("URLConnection getInputStream");
                          return;
                        }
                        if (Runtime.class.getName().equals(this.b))
                        {
                          localObject2 = (String)paramMethodHookParam.args[0];
                          if (((String)localObject2).indexOf("sys/class/net/wlan0/address") >= 0)
                          {
                            paramMethodHookParam.args[0] = ((String)localObject2).replace("sys/class/net/wlan0/address", PoseHelper008.getMacFile());
                            if (((String)localObject2).indexOf("getprop") < 0) {
                              break label3100;
                            }
                            if (!SettingActivity.a("set_getProp").equals("true")) {
                              break label3858;
                            }
                            localObject2 = ((String)localObject2).trim();
                            if (Tutorial008.access$0(this.a) == null) {
                              Tutorial008.access$1(this.a, new com.lishu.d.a());
                            }
                            if (!((String)localObject2).equals("getprop")) {
                              break label3020;
                            }
                            Tutorial008.access$0(this.a);
                            com.lishu.d.a.b();
                            Tutorial008.access$0(this.a);
                            localObject1 = com.lishu.d.a.a();
                            paramMethodHookParam.args[0] = ("cat  " + (String)localObject1);
                            localObject1 = localObject2;
                          }
                          for (;;)
                          {
                            this.a.onLog("runtime  " + (String)localObject1 + "  " + paramMethodHookParam.args[0]);
                            return;
                            if (((String)localObject2).indexOf("sys/class/net/eth0/address") >= 0)
                            {
                              paramMethodHookParam.args[0] = ((String)localObject2).replace("sys/class/net/eth0/address", PoseHelper008.getMacFile());
                              break;
                            }
                            if (!((String)localObject2).contains("sys/class/net/em0/address")) {
                              break;
                            }
                            paramMethodHookParam.args[0] = ((String)localObject2).replace("sys/class/net/eth0/address", PoseHelper008.getMacFile());
                            break;
                            String[] arrayOfString = ((String)localObject2).split(" ");
                            localObject1 = localObject2;
                            if (arrayOfString.length == 2)
                            {
                              Tutorial008.access$0(this.a);
                              com.lishu.d.a.b();
                              Tutorial008.access$0(this.a);
                              localObject1 = com.lishu.d.a.a(arrayOfString[1]);
                              paramMethodHookParam.args[0] = ("echo " + (String)localObject1);
                              localObject1 = localObject2;
                              continue;
                              localObject1 = localObject2;
                              if (((String)localObject2).contains("ifconfig"))
                              {
                                localObject1 = PoseHelper008.execIfConfig((String)localObject2);
                                paramMethodHookParam.args[0] = localObject1;
                                localObject1 = localObject2;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          else
          {
            label1408:
            label3100:
            if (PackageManager.class.getName().equals(this.b))
            {
              localObject1 = maputils.getmap(PoseHelper008.getFileData("hideProgess"));
              if ((localObject1 == null) || (((Map)localObject1).get("hide_target") == null)) {
                break label3858;
              }
              ((Map)localObject1).get("hide_target").split("_");
              return;
            }
            if (ActivityManager.class.getName().equals(this.b))
            {
              localObject1 = maputils.getmap(PoseHelper008.getFileData("hideProgess"));
              if ((localObject1 == null) || (((Map)localObject1).get("hide_target") == null)) {
                break label3858;
              }
              ((Map)localObject1).get("hide_target").split("_");
              return;
            }
            if ("android.os.SystemProperties".equals(this.b))
            {
              if (paramMethodHookParam.args.length <= 0) {
                break label3858;
              }
              if (paramMethodHookParam.args[0].equals("gsm.version.baseband"))
              {
                this.a.onLog("gsm.version.baseband " + PoseHelper008.valueMap.get(this.c));
                paramMethodHookParam.setResult(PoseHelper008.valueMap.get(this.c));
                return;
              }
              if (paramMethodHookParam.args[0].equals("ro.serialno"))
              {
                this.a.onLog("ro.serialno " + PoseHelper008.valueMap.get("SERIAL"));
                paramMethodHookParam.setResult(PoseHelper008.valueMap.get("SERIAL"));
                return;
              }
              this.a.onLog("android.os.SystemProperties  " + paramMethodHookParam.args[0]);
              super.beforeHookedMethod(paramMethodHookParam);
              return;
            }
            if (this.b.equals(Settings.Secure.class.getName()))
            {
              if (paramMethodHookParam.args.length <= 1) {
                break label3858;
              }
              localObject1 = (String)paramMethodHookParam.args[1];
              if ((this.c.equals("getString")) && (((String)localObject1).equals("android_id")))
              {
                this.a.onLog("android_id :" + PoseHelper008.valueMap.get(this.c));
                paramMethodHookParam.setResult(PoseHelper008.valueMap.get(this.c));
                return;
              }
              if ((this.c.equals("getLong")) && (((String)localObject1).equals("mock_location")))
              {
                if (!SettingActivity.a("setMockLocation").trim().equals("true")) {
                  break label3858;
                }
                paramMethodHookParam.setResult(Integer.valueOf(0));
                this.a.onLog("settings.system.  getLong ALLOW_MOCK_LOCATION ");
                return;
              }
              if ((this.c.equals("getString")) && (((String)localObject1).equals("mock_location")))
              {
                if (!SettingActivity.a("setMockLocation").trim().equals("true")) {
                  break label3858;
                }
                paramMethodHookParam.setResult("0");
                this.a.onLog("settings.system.  getLong ALLOW_MOCK_LOCATION ");
                return;
              }
              this.a.onLog("Secure: " + (String)localObject1 + ": " + this.c);
              super.beforeHookedMethod(paramMethodHookParam);
              return;
            }
            if (this.b.equals(Display.class.getName())) {
              break label3858;
            }
            if (this.c.equals("getIpAddress"))
            {
              boolean bool = SettingActivity.a("setOpenIp").equals("true");
              if (!bool) {
                break label3858;
              }
            }
          }
        }
      }
    }
    try
    {
      readThread = SimulateDataTest.ipToInt(PoseHelper008.valueMap.get(this.c));
      paramMethodHookParam.setResult(Integer.valueOf(readThread));
      return;
      paramMethodHookParam.setResult(PoseHelper008.valueMap.get(this.c));
      return;
      super.beforeHookedMethod(paramMethodHookParam);
      return;
      super.beforeHookedMethod(paramMethodHookParam);
      label3858:
      return;
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        readThread = 0;
      }
    }
  }
}
