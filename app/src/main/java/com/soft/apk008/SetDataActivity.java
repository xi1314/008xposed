package com.soft.apk008;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.a.a.Map;
import com.a.a.maputils;
import com.data.simulate.SimulateDataTest;
import com.lishu.c.p;
import com.lishu.c.w;
import com.soft.apk008.remain.ReMainActivity;
import com.soft.tools.RecordAppFileHandler;
import com.soft.tools.SetNetAddressActivity;
import com.soft.tools.SetSystemValueActivity;
import com.soft.tools.er;
import com.soft.toos.findApp.QuickFindActivity;
import com.umeng.analytics.MobclickAgent;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class SetDataActivity
  extends Activity
  implements w
{
  private static p E = new p();
  public static String[] a = { "getDeviceId", "getString", "getLine1Number", "getSimSerialNumber", "getSubscriberId", "getSimCountryIso", "getSimOperator", "getSimOperatorName", "getNetworkCountryIso", "getNetworkOperator", "getNetworkOperatorName", "getNetworkType", "getPhoneType", "getSimState", "getMacAddress", "getSSID", "getBSSID", "RELEASE", "SDK", "ARCH", "getMetrics", "getRadioVersion", "BRAND", "MODEL", "PRODUCT", "MANUFACTURER", "setCpuName", "HARDWARE", "FINGERPRINT" };
  public static String[] b = { "序列号", "android_id", "手机号码", "手机卡序列号", "IMSI", "手机卡国家", "运营商", "运营商名字", "国家iso代码", "网络类型", "网络类型名", "网络类型", "手机类型", "手机卡状态", "mac地址", "无线路由器名", "无线路由器地址", "系统版本", "系统版本值", "系统架构（请保留下划线，下划线隔开的为两个数据）", "屏幕分辨率", "固件版本", "品牌", "型号", "产品名", "制造商", "cpu型号", "硬件", "指纹", "基站位置（需要手动更改）" };
  public static String c = "小偷可耻";
  public static String d = "fuck you";
  public static String e = "";
  public static String f = "";
  public static String g = "";
  public static String h = "";
  static String l = StartActivity.b + "/phone/LogicSimpleAction.action";
  public static String[] m = { "getDeviceId", "getString", "getLine1Number", "getSimSerialNumber", "getSubscriberId", "getSimCountryIso", "getSimOperator", "getSimOperatorName", "getNetworkCountryIso", "getNetworkOperator", "getNetworkOperatorName", "getNetworkType", "getPhoneType", "getSimState", "getMacAddress", "getSSID", "getBSSID", "RELEASE", "SDK", "HARDWARE", "FINGERPRINT", "getMetrics", "getRadioVersion", "BRAND", "MODEL", "PRODUCT", "MANUFACTURER", "setCpuName", "getJiZhan", "gps", "location_mode" };
  private View A;
  private RadioGroup B;
  private View C;
  private TextView D;
  private boolean F = false;
  View.OnClickListener i = new bb(this);
  String j;
  String k = StartActivity.b + "/phone/LogicSimpleAction.action";
  private LinearLayout n;
  private HashMap o = new HashMap();
  private Button p;
  private Button q;
  private Button r;
  private String[] s;
  private Button t;
  private ProgressDialog u;
  private EditText v;
  private EditText w;
  private Button x;
  private Button y;
  private RadioGroup z;
  
  public static void a(Context paramContext)
  {
    Object localObject = "a";
    int i1 = 0;
    String[] arrayOfString;
    int i2;
    if (i1 >= e.length())
    {
      if ((PoseHelper008.valueMap == null) || (PoseHelper008.valueMap.size() == 0)) {
        PoseHelper008.initData(null);
      }
      arrayOfString = SimulateDataTest.getSimData();
      if (SettingActivity.a("imsiHead").length() > 0)
      {
        arrayOfString[0] = SimulateDataTest.getRandData(SettingActivity.a("imsiHead"), 15, 1);
        arrayOfString[1] = arrayOfString[0].substring(0, 5);
      }
      i1 = LoadActivity.a;
      i2 = LoadActivity.b;
      if (arrayOfString[2].indexOf("电信") < 0) {
        break label558;
      }
    }
    label558:
    for (boolean bool = true;; bool = false)
    {
      String str = LoadActivity.getData(paramContext, i1, i2, bool).datagogo;
      i1 = 15;
      localObject = str;
      if (SettingActivity.a("setImei14").equals("true"))
      {
        localObject = str.substring(0, 14);
        i1 = 14;
      }
      if (SettingActivity.a("imeiHead").length() > 0) {
        localObject = SimulateDataTest.getRandData(SettingActivity.a("imeiHead"), i1, 3);
      }
      if (!SettingActivity.a("imeiCheck").equals("false")) {
        PoseHelper008.valueMap.putkey("getDeviceId", localObject);
      }
      if (!SettingActivity.a("setOpenMac").equals("false")) {
        PoseHelper008.valueMap.putkey("getMacAddress", SimulateDataTest.getMac());
      }
      if (!SettingActivity.a("imsiCheck").equals("false"))
      {
        PoseHelper008.valueMap.putkey("getSubscriberId", arrayOfString[0]);
        PoseHelper008.valueMap.putkey("getSimOperator", arrayOfString[1]);
        PoseHelper008.valueMap.putkey("getNetworkOperatorName", arrayOfString[2]);
        PoseHelper008.valueMap.putkey("getSimSerialNumber", arrayOfString[3]);
        PoseHelper008.valueMap.putkey("getNetworkType", arrayOfString[4]);
      }
      PoseHelper008.valueMap.putkey("getLine1Number", SimulateDataTest.getPhoneNumber(arrayOfString[0]));
      PoseHelper008.valueMap.putkey("getBSSID", SimulateDataTest.getMac());
      PoseHelper008.valueMap.putkey("getString", SimulateDataTest.getRandData(3, 16));
      PoseHelper008.valueMap.putkey("getSSID", SimulateDataTest.getRandData(3, 10));
      PoseHelper008.valueMap.putkey("sign", b((String)localObject));
      if (!SettingActivity.a("modalCheck").equals("false"))
      {
        PoseHelper008.valueMap.putkey("BRAND", SimulateDataTest.getPhoneName());
        PoseHelper008.valueMap.putkey("MODEL", SimulateDataTest.getModal());
        PoseHelper008.valueMap.putkey("PRODUCT", SimulateDataTest.getProductName());
        PoseHelper008.valueMap.putkey("DEVICE", SimulateDataTest.getModal());
        PoseHelper008.valueMap.putkey("MANUFACTURER", SimulateDataTest.getPhoneName());
        PoseHelper008.valueMap.putkey("getMetrics", SimulateDataTest.getDisplay());
      }
      localObject = SimulateDataTest.getSdkLevel();
      if (!SettingActivity.a("sdkCheck").equals("false"))
      {
        PoseHelper008.valueMap.putkey("RELEASE", localObject[1]);
        PoseHelper008.valueMap.putkey("SDK", localObject[0]);
      }
      c(paramContext);
      PoseHelper008.saveData();
      return;
      localObject = localObject + d.c.length();
      i1 += 1;
      break;
    }
  }
  
  private static String b(String paramString)
  {
    return v.a(paramString + 1666561 + 'm' + 'i');
  }
  
  /* Error */
  public static void b(Context paramContext)
  {
    // Byte code:
    //   0: new 55	java/lang/String
    //   3: dup
    //   4: getstatic 407	com/soft/apk008/LoadActivity:packageinfolist	Ljava/lang/String;
    //   7: invokevirtual 411	java/lang/String:getBytes	()[B
    //   10: iconst_0
    //   11: invokestatic 417	android/util/Base64:decode	([BI)[B
    //   14: ldc_w 419
    //   17: invokespecial 422	java/lang/String:<init>	([BLjava/lang/String;)V
    //   20: astore_3
    //   21: aload_3
    //   22: ldc_w 330
    //   25: invokevirtual 324	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   28: ifeq +15 -> 43
    //   31: return
    //   32: astore_3
    //   33: aload_3
    //   34: invokevirtual 425	java/lang/Exception:printStackTrace	()V
    //   37: ldc 185
    //   39: astore_3
    //   40: goto -19 -> 21
    //   43: aload_0
    //   44: invokevirtual 431	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   47: aload_0
    //   48: invokevirtual 434	android/content/Context:getPackageName	()Ljava/lang/String;
    //   51: bipush 64
    //   53: invokevirtual 440	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   56: getfield 446	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   59: astore_3
    //   60: ldc_w 448
    //   63: invokestatic 454	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   66: astore 4
    //   68: aload_3
    //   69: arraylength
    //   70: istore_2
    //   71: ldc 185
    //   73: astore_0
    //   74: iconst_0
    //   75: istore_1
    //   76: iload_1
    //   77: iload_2
    //   78: if_icmplt +81 -> 159
    //   81: aload_0
    //   82: invokestatic 402	com/lishu/saveaccountdatatoFile/v:XhookMethod	(Ljava/lang/String;)Ljava/lang/String;
    //   85: astore_0
    //   86: invokestatic 457	com/data/simulate/SimulateDataTest:getBaseSign	()Ljava/lang/String;
    //   89: aload_0
    //   90: invokevirtual 324	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   93: ifne -62 -> 31
    //   96: ldc_w 459
    //   99: invokevirtual 411	java/lang/String:getBytes	()[B
    //   102: iconst_0
    //   103: invokestatic 417	android/util/Base64:decode	([BI)[B
    //   106: astore_0
    //   107: new 55	java/lang/String
    //   110: dup
    //   111: aload_0
    //   112: ldc_w 419
    //   115: invokespecial 422	java/lang/String:<init>	([BLjava/lang/String;)V
    //   118: astore_0
    //   119: aload_0
    //   120: invokestatic 462	de/robv/android/xposed/mods/tutorial/runningserviceinfolist:XhookMethod	(Ljava/lang/String;)Ljava/lang/String;
    //   123: pop
    //   124: ldc_w 464
    //   127: invokevirtual 411	java/lang/String:getBytes	()[B
    //   130: iconst_0
    //   131: invokestatic 417	android/util/Base64:decode	([BI)[B
    //   134: astore_0
    //   135: new 55	java/lang/String
    //   138: dup
    //   139: aload_0
    //   140: ldc_w 419
    //   143: invokespecial 422	java/lang/String:<init>	([BLjava/lang/String;)V
    //   146: astore_0
    //   147: aload_0
    //   148: invokestatic 462	de/robv/android/xposed/mods/tutorial/runningserviceinfolist:XhookMethod	(Ljava/lang/String;)Ljava/lang/String;
    //   151: pop
    //   152: return
    //   153: astore_0
    //   154: aload_0
    //   155: invokevirtual 425	java/lang/Exception:printStackTrace	()V
    //   158: return
    //   159: aload_3
    //   160: iload_1
    //   161: aaload
    //   162: astore 5
    //   164: aload 4
    //   166: ldc_w 466
    //   169: iconst_0
    //   170: anewarray 450	java/lang/Class
    //   173: invokevirtual 470	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   176: astore 6
    //   178: new 202	java/lang/StringBuilder
    //   181: dup
    //   182: aload_0
    //   183: invokestatic 210	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   186: invokespecial 213	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   189: aload 6
    //   191: aload 5
    //   193: iconst_0
    //   194: anewarray 472	java/lang/Object
    //   197: invokevirtual 478	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   200: invokevirtual 481	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   203: ldc_w 483
    //   206: invokevirtual 219	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: invokevirtual 223	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   212: astore_0
    //   213: iload_1
    //   214: iconst_1
    //   215: iadd
    //   216: istore_1
    //   217: goto -141 -> 76
    //   220: astore_0
    //   221: aload_0
    //   222: invokevirtual 484	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   225: ldc 185
    //   227: astore_0
    //   228: goto -109 -> 119
    //   231: astore_0
    //   232: aload_0
    //   233: invokevirtual 484	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   236: ldc 185
    //   238: astore_0
    //   239: goto -92 -> 147
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	242	0	paramContext	Context
    //   75	142	1	i1	int
    //   70	9	2	i2	int
    //   20	2	3	str	String
    //   32	2	3	localException	Exception
    //   39	121	3	localObject1	Object
    //   66	99	4	localClass	Class
    //   162	30	5	localObject2	Object
    //   176	14	6	localMethod	java.lang.reflect.Method
    // Exception table:
    //   from	to	target	type
    //   0	21	32	java/lang/Exception
    //   43	71	153	java/lang/Exception
    //   81	107	153	java/lang/Exception
    //   107	119	153	java/lang/Exception
    //   119	135	153	java/lang/Exception
    //   135	147	153	java/lang/Exception
    //   147	152	153	java/lang/Exception
    //   164	213	153	java/lang/Exception
    //   221	225	153	java/lang/Exception
    //   232	236	153	java/lang/Exception
    //   107	119	220	java/io/UnsupportedEncodingException
    //   135	147	231	java/io/UnsupportedEncodingException
  }
  
  private static void c(Context paramContext)
  {
    Object localObject1;
    Iterator localIterator;
    if (SettingActivity.a("setUserMyDB").equals("true"))
    {
      localObject1 = com.lishu.a.a.a(paramContext);
      int i1 = ((com.lishu.a.a)localObject1).b.size();
      if (i1 > 0)
      {
        i1 = SimulateDataTest.random.nextInt(i1);
        localIterator = ((HashMap)((com.lishu.a.a)localObject1).b.get(i1)).entrySet().iterator();
      }
    }
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      localObject1 = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject1).getKey();
      Object localObject2 = (String)((Map.Entry)localObject1).getValue();
      localObject1 = localObject2;
      if (str.equals("getDeviceId"))
      {
        if (((String)localObject2).length() > 10)
        {
          localObject1 = ((String)localObject2).substring(0, 9);
          localObject2 = SimulateDataTest.getSimData();
          localObject1 = LoadActivity.getImei(paramContext, LoadActivity.a, LoadActivity.b, (String)localObject1);
          PoseHelper008.valueMap.putkey("getSubscriberId", localObject2[0]);
          PoseHelper008.valueMap.putkey("getSimOperator", localObject2[1]);
          PoseHelper008.valueMap.putkey("getNetworkOperatorName", localObject2[2]);
          PoseHelper008.valueMap.putkey("getSimSerialNumber", localObject2[3]);
        }
      }
      else if ((localObject1 != null) && (((String)localObject1).trim().length() > 0)) {
        PoseHelper008.valueMap.putkey(str, localObject1);
      }
    }
  }
  
  private void d()
  {
    int i2 = 2;
    Object localObject1 = this.o.entrySet().iterator();
    int i1;
    if (!((Iterator)localObject1).hasNext())
    {
      PoseHelper008.valueMap.putkey("getJiZhan", this.v.getText().toString());
      PoseHelper008.valueMap.putkey("gps", this.w.getText().toString());
      i1 = this.z.getCheckedRadioButtonId();
      if (i1 != 2131361973) {
        break label570;
      }
      i1 = 1;
    }
    for (;;)
    {
      label85:
      PoseHelper008.valueMap.putkey("location_mode", i1);
      int i3 = this.B.getCheckedRadioButtonId();
      if (i3 == 2131361992) {
        i1 = 1;
      }
      for (;;)
      {
        PoseHelper008.valueMap.putkey("connect_mode", i1);
        PoseHelper008.valueMap.putkey("sign", b(PoseHelper008.valueMap.get("getDeviceId")));
        localObject1 = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
        PoseHelper008.valueMap.putkey("density", ((DisplayMetrics)localObject1).density);
        PoseHelper008.valueMap.putkey("densityDpi", ((DisplayMetrics)localObject1).densityDpi);
        PoseHelper008.valueMap.putkey("scaledDensity", ((DisplayMetrics)localObject1).scaledDensity);
        PoseHelper008.valueMap.putkey("xdpi", ((DisplayMetrics)localObject1).xdpi);
        PoseHelper008.valueMap.putkey("ydpi", ((DisplayMetrics)localObject1).ydpi);
        PoseHelper008.saveData();
        if (!this.F) {
          new bn(this).start();
        }
        Toast.makeText(this, "保存成功", 0).show();
        localObject1 = LoadActivity.getProPackAge(this, LoadActivity.a, LoadActivity.b);
        if (PoseHelper008.getFileData("008Mode").equals("2"))
        {
          if (!SettingActivity.a("setCloseCheck").equals("false")) {
            ((ActivityManager)getSystemService("activity")).killBackgroundProcesses((String)localObject1);
          }
          if (!SettingActivity.a("clearAppCheck").equals("false")) {
            h.a("pm clear " + (String)localObject1);
          }
          if (!SettingActivity.a("setDeleteSystem").equals("false")) {
            SetSystemValueActivity.a(this);
          }
          if (!SettingActivity.a("setDeleteFile").equals("false")) {
            RecordAppFileHandler.a(this, true);
          }
        }
        return;
        Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
        String str = (String)((Map.Entry)localObject2).getKey();
        localObject2 = ((EditText)((Map.Entry)localObject2).getValue()).getText().toString();
        PoseHelper008.valueMap.putkey(str, localObject2);
        break;
        label570:
        if (i1 == 2131361977)
        {
          i1 = 0;
          break label85;
        }
        if (i1 != 2131361974) {
          break label608;
        }
        i1 = 2;
        break label85;
        i1 = i2;
        if (i3 != 2131361993) {
          i1 = 0;
        }
      }
      label608:
      i1 = 0;
    }
  }
  
  public final void a()
  {
    String str = PoseHelper008.valueMap.get("getJiZhan");
    this.v.setText(str);
    int i1 = 0;
    for (;;)
    {
      if (i1 >= a.length) {
        return;
      }
      str = a[i1];
      EditText localEditText = (EditText)this.o.get(a[i1]);
      if (localEditText != null) {
        localEditText.setText(PoseHelper008.valueMap.get(str));
      }
      i1 += 1;
    }
  }
  
  public final void a(int paramInt)
  {
    Object localObject2 = (ArrayList)com.lishu.b.a.a.a.get(HistoryActivity.a);
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new ArrayList();
    }
    localObject1 = (HashMap)((ArrayList)localObject1).get(paramInt);
    if (localObject1 != null) {
      localObject1 = ((HashMap)localObject1).entrySet().iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject1).hasNext()) {
        return;
      }
      Object localObject3 = (Map.Entry)((Iterator)localObject1).next();
      localObject2 = (String)((Map.Entry)localObject3).getKey();
      localObject3 = (String)((Map.Entry)localObject3).getValue();
      localObject2 = (EditText)this.o.get(localObject2);
      if (localObject2 != null) {
        ((EditText)localObject2).setText((CharSequence)localObject3);
      }
    }
  }
  
  public final void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    for (;;)
    {
      return;
      try
      {
        Object localObject = maputils.getmap(paramString);
        paramString = ((Map)localObject).get("time");
        new StringBuilder().append(((Map)localObject).get("id")).toString();
        localObject = ((Map)localObject).get("overTime");
        if (!paramString.equals("null"))
        {
          long l1 = Long.parseLong(paramString);
          new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(l1));
          runOnUiThread(new bj(this, (String)localObject));
          return;
        }
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
      }
    }
  }
  
  public final void b()
  {
    int i1 = 0;
    for (;;)
    {
      if (i1 >= a.length) {
        return;
      }
      String str = a[i1];
      Object localObject1 = b[i1];
      Object localObject2 = b;
      localObject2 = new TextView(this);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
      this.n.addView((View)localObject2, localLayoutParams);
      ((TextView)localObject2).setTextSize(10.0F);
      ((TextView)localObject2).setText((CharSequence)localObject1);
      localObject1 = new EditText(this);
      localObject2 = new LinearLayout.LayoutParams(-1, -2);
      this.n.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
      ((EditText)localObject1).setText(PoseHelper008.valueMap.get(str));
      this.o.put(a[i1], localObject1);
      i1 += 1;
    }
  }
  
  public final void c()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("action", "netData2");
    int i1 = LoadActivity.a;
    int i2 = LoadActivity.libSign(this, i1, LoadActivity.b);
    localHashMap.put("verCode", StartActivity.c(this));
    localHashMap.put("a", i1);
    localHashMap.put("b", i2);
    localHashMap.putAll(StartActivity.b());
    this.u.show();
    if ((StartActivity.h.indexOf("myNet") >= 0) && (SetNetAddressActivity.a()))
    {
      localHashMap.clear();
      l = SetNetAddressActivity.c();
      i1 = 0;
      if (l.indexOf("?") > 0) {
        i1 = 1;
      }
      if (i1 != 0) {
        break label246;
      }
    }
    label246:
    for (l += "?imei=";; l += "&imei=")
    {
      TelephonyManager localTelephonyManager = (TelephonyManager)getSystemService("phone");
      l += localTelephonyManager.getDeviceId();
      E.a(l, localHashMap, new be(this));
      return;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent == null) {}
    Object localObject2;
    Object localObject3;
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
                do
                {
                  do
                  {
                    do
                    {
                      return;
                      if (paramInt1 != 1) {
                        break;
                      }
                      this.F = false;
                      paramIntent = paramIntent.getStringExtra("getDeviceId");
                    } while (paramIntent == null);
                    paramIntent = com.lishu.b.a.a.b(HistoryActivity.a, paramIntent);
                  } while (paramIntent == null);
                  localObject1 = paramIntent.entrySet().iterator();
                  for (;;)
                  {
                    if (!((Iterator)localObject1).hasNext())
                    {
                      localObject1 = (String)paramIntent.get("getJiZhan");
                      localObject2 = (String)paramIntent.get("gps");
                      paramIntent = (String)paramIntent.get("location_mode");
                      this.v.setText((CharSequence)localObject1);
                      this.w.setText((CharSequence)localObject2);
                      if (!paramIntent.equals("1")) {
                        break;
                      }
                      ((RadioButton)this.C.findViewById(2131361973)).setChecked(true);
                      return;
                    }
                    localObject3 = (Map.Entry)((Iterator)localObject1).next();
                    localObject2 = (String)((Map.Entry)localObject3).getKey();
                    localObject3 = (String)((Map.Entry)localObject3).getValue();
                    localObject2 = (EditText)this.o.get(localObject2);
                    if (localObject2 != null) {
                      ((EditText)localObject2).setText((CharSequence)localObject3);
                    }
                  }
                  if (paramIntent.equals("2"))
                  {
                    ((RadioButton)this.C.findViewById(2131361974)).setChecked(true);
                    return;
                  }
                  ((RadioButton)this.C.findViewById(2131361977)).setChecked(true);
                  return;
                  if (paramInt1 != 2) {
                    break;
                  }
                  paramIntent = paramIntent.getStringExtra("packageName");
                } while (paramIntent == null);
                paramInt1 = paramIntent.indexOf("_");
              } while (paramInt1 == -1);
              localObject1 = paramIntent.substring(paramInt1 + 1);
              PoseHelper008.saveDataToFile("systemProPackAge", (String)localObject1);
              PoseHelper008.saveDataToFile("008Mode", "2");
              this.s[2] = localObject1;
              this.t.setText(this.s[2]);
              RecordAppFileHandler.a(paramIntent);
              PoseHelper008.saveDataToFile("SetSystemValueActivity_packAge", paramIntent);
              PoseHelper008.saveDataToFile("quickToolActivity", paramIntent);
              ((ActivityManager)getSystemService("activity")).killBackgroundProcesses((String)localObject1);
              return;
              if (paramInt2 != 3) {
                break;
              }
              paramIntent = paramIntent.getStringExtra("gps");
            } while (paramIntent == null);
            PoseHelper008.valueMap.putkey("gps", paramIntent);
            Toast.makeText(this, "保存成功", 0).show();
            this.w.setText(paramIntent);
            return;
            if (paramInt2 != 4) {
              break;
            }
            paramIntent = paramIntent.getStringExtra("jizhanPos");
          } while (paramIntent == null);
          PoseHelper008.valueMap.putkey("getJiZhan", paramIntent);
          Toast.makeText(this, "保存成功", 0).show();
          this.v.setText(paramIntent);
          return;
        } while (paramInt1 != 5);
        this.F = true;
        localObject1 = paramIntent.getStringExtra("name");
        paramIntent = paramIntent.getStringExtra("progress");
      } while (localObject1 == null);
      localObject1 = (ArrayList)com.lishu.b.a.a.a.get(localObject1);
      if (localObject1 == null)
      {
        Toast.makeText(this, "请检查历史记录是否已经被重命名，如果重命名请删除留存控制中的相关项", 1).show();
        return;
      }
      paramIntent = (HashMap)((ArrayList)localObject1).get(Integer.parseInt(paramIntent) - 1);
    } while (paramIntent == null);
    Object localObject1 = paramIntent.entrySet().iterator();
    for (;;)
    {
      if (!((Iterator)localObject1).hasNext())
      {
        localObject1 = (String)paramIntent.get("getJiZhan");
        localObject2 = (String)paramIntent.get("gps");
        paramIntent = (String)paramIntent.get("location_mode");
        this.v.setText((CharSequence)localObject1);
        this.w.setText((CharSequence)localObject2);
        if (!paramIntent.equals("1")) {
          break;
        }
        ((RadioButton)this.C.findViewById(2131361973)).setChecked(true);
        return;
      }
      localObject3 = (Map.Entry)((Iterator)localObject1).next();
      localObject2 = (String)((Map.Entry)localObject3).getKey();
      localObject3 = (String)((Map.Entry)localObject3).getValue();
      localObject2 = (EditText)this.o.get(localObject2);
      if (localObject2 != null) {
        ((EditText)localObject2).setText((CharSequence)localObject3);
      }
    }
    if (paramIntent.equals("2"))
    {
      ((RadioButton)this.C.findViewById(2131361974)).setChecked(true);
      return;
    }
    ((RadioButton)this.C.findViewById(2131361977)).setChecked(true);
  }
  
  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    int i1 = paramMenuItem.getItemId();
    if (i1 == 0)
    {
      PoseHelper008.saveDataToFile("008Mode", "0");
      this.t.setText(this.s[0]);
    }
    do
    {
      return true;
      if (i1 == 1)
      {
        PoseHelper008.saveDataToFile("008Mode", "1");
        this.t.setText(this.s[1]);
        return true;
      }
      if (i1 == 2)
      {
        paramMenuItem = new Intent();
        paramMenuItem.setClass(this, QuickFindActivity.class);
        startActivityForResult(paramMenuItem, 2);
        return true;
      }
    } while (i1 != 3);
    PoseHelper008.saveDataToFile("008Mode", "3");
    this.t.setText(this.s[3]);
    return true;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    HistoryActivity.a();
    SimulateDataTest.init(this);
    setContentView(2130903072);
    this.n = ((LinearLayout)findViewById(2131361988));
    paramBundle = LoadActivity.getProPackAge(this, LoadActivity.a, LoadActivity.b);
    if (paramBundle.length() > 0) {
      this.s[2] = paramBundle;
    }
    this.t = ((Button)findViewById(2131361984));
    this.t.setOnClickListener(new bk(this));
    registerForContextMenu(this.t);
    Object localObject = PoseHelper008.getFileData("008Mode");
    if (((String)localObject).length() > 0)
    {
      int i1 = Integer.parseInt((String)localObject);
      this.t.setText(this.s[i1]);
      if (i1 == 2)
      {
        localObject = new HashMap();
        ((HashMap)localObject).put("package", paramBundle);
        ((HashMap)localObject).put("imei", j.a(this));
        MobclickAgent.a(this, "mode_app", (HashMap)localObject);
      }
    }
    this.r.setOnClickListener(this.i);
    this.p.setOnClickListener(this.i);
    this.D.setOnClickListener(this.i);
    if (!StartActivity.f) {
      this.D.setVisibility(8);
    }
    this.u = new ProgressDialog(this);
    this.u.setMessage("正在加载数据，请稍候");
    this.u.show();
    this.u.setCancelable(false);
    new bl(this).start();
    try
    {
      paramBundle = ViewConfiguration.get(this);
      localObject = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
      if (localObject != null)
      {
        ((Field)localObject).setAccessible(true);
        ((Field)localObject).setBoolean(paramBundle, false);
      }
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        paramBundle.printStackTrace();
      }
    }
    d.b.equals(c);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    paramContextMenu.setHeaderTitle("选择模式");
    paramContextMenu.add(0, 0, 0, "关闭");
    paramContextMenu.add(0, 1, 0, "全局");
    paramContextMenu.add(0, 2, 0, "单个应用");
    paramContextMenu.add(0, 3, 0, "全局（不包括系统，推荐！）");
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296261, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    d();
    this.u.dismiss();
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362283)
    {
      PoseHelper008.getAllData(this);
      PoseHelper008.valueMap.putkey("sign", b(PoseHelper008.valueMap.get("getDeviceId")));
      a();
    }
    do
    {
      return true;
      if (paramMenuItem.getItemId() == 2131362284)
      {
        paramMenuItem = new Intent();
        paramMenuItem.setClass(this, SettingActivity.class);
        startActivity(paramMenuItem);
        return true;
      }
      if (paramMenuItem.getItemId() == 2131362281)
      {
        String str = "nowHistoryIndex" + HistoryActivity.a;
        this.j = er.a(this, str);
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
        localBuilder.setTitle("历史记录轮询");
        ArrayList localArrayList;
        if (this.j.trim().length() == 0)
        {
          localArrayList = (ArrayList)com.lishu.b.a.a.a.get(HistoryActivity.a);
          paramMenuItem = localArrayList;
          if (localArrayList == null) {
            paramMenuItem = new ArrayList();
          }
          localBuilder.setMessage("当前还未开始，请点击下一步/总共" + paramMenuItem.size() + "条数据");
          this.j = "0";
        }
        for (;;)
        {
          localArrayList = (ArrayList)com.lishu.b.a.a.a.get(HistoryActivity.a);
          paramMenuItem = localArrayList;
          if (localArrayList == null) {
            paramMenuItem = new ArrayList();
          }
          if (paramMenuItem.size() != 0) {
            break;
          }
          Toast.makeText(this, "当前没有历史记录", 0).show();
          return true;
          int i1 = Integer.parseInt(this.j);
          localArrayList = (ArrayList)com.lishu.b.a.a.a.get(HistoryActivity.a);
          paramMenuItem = localArrayList;
          if (localArrayList == null) {
            paramMenuItem = new ArrayList();
          }
          localBuilder.setMessage("当前为" + (i1 + 1) + "/总共" + paramMenuItem.size() + "条数据");
        }
        if (Integer.parseInt(this.j) >= paramMenuItem.size()) {
          this.j = "0";
        }
        localBuilder.setNegativeButton("上一条", new bo(this, str));
        localBuilder.setPositiveButton("下一条", new bp(this, str));
        localBuilder.setNeutralButton("第一条", new bq(this, str));
        localBuilder.create().show();
        return true;
      }
    } while (paramMenuItem.getItemId() != 2131362282);
    if (!StartActivity.f)
    {
      Toast.makeText(this, "vip才可使用", 0).show();
      return true;
    }
    paramMenuItem = new Intent();
    paramMenuItem.setClass(this, ReMainActivity.class);
    startActivityForResult(paramMenuItem, 5);
    return true;
  }
  
  protected void onPause()
  {
    super.onPause();
    MobclickAgent.a(this);
  }
  
  protected void onResume()
  {
    super.onResume();
    if (StartActivity.g.size() == 0)
    {
      localObject = new Intent();
      ((Intent)localObject).setClass(this, LoadActivity.class);
      startActivity((Intent)localObject);
      finish();
      return;
    }
    Object localObject = new HashMap();
    ((HashMap)localObject).put("action", "status");
    ((HashMap)localObject).putAll(StartActivity.b());
    E.a(this.k, (HashMap)localObject, this);
    MobclickAgent.b(this);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.SetDataActivity

 * JD-Core Version:    0.7.0.1

 */