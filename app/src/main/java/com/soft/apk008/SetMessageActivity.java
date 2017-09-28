package com.soft.apk008;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.KeyEvent;
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
import com.lishu.c.r;
import com.lishu.c.w;
import com.soft.apk008.remain.ReMainActivity;
import com.soft.tools.BackupFileActivity;
import com.soft.tools.FolderBackUpActivity;
import com.soft.tools.MyWifiNameActivity;
import com.soft.tools.RecordAppFileHandler;
import com.soft.tools.SelectManuActivity;
import com.soft.tools.SetNetAddressActivity;
import com.soft.tools.SetSystemValueActivity;
import com.soft.tools.accountSim.AccountSimActivity;
import com.soft.tools.er;
import com.soft.tools.messageAndContacts.MessageAndContactsCreateActivity;
import com.soft.tools.packageSim.PackAgeSimActivity;
import com.soft.toos.findApp.QuickFindActivity;
import com.umeng.analytics.MobclickAgent;
import com.umeng.fb.FeedbackAgent;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class SetMessageActivity
  extends Activity
  implements w
{
  private static p F;
  private static r H = new r();
  private static String I = StartActivity.b + "/phone/LogicSimpleAction.action";
  public static String[] a = { "getDeviceId", "getString", "getLine1Number", "getSimSerialNumber", "getSubscriberId", "getSimCountryIso", "getSimOperator", "getSimOperatorName", "getNetworkCountryIso", "getNetworkOperator", "getNetworkOperatorName", "getNetworkType", "getPhoneType", "getSimState", "getMacAddress", "getSSID", "getBSSID", "RELEASE", "SDK", "ARCH", "getMetrics", "getRadioVersion", "BRAND", "MODEL", "ID", "DISPLAY", "PRODUCT", "MANUFACTURER", "DEVICE", "setCpuName", "HARDWARE", "FINGERPRINT", "SERIAL", "getAddress", "GL_RENDERER", "GL_VENDOR", "getIpAddress" };
  public static String[] b = { "序列号", "android_id", "手机号码", "手机卡序列号", "IMSI", "手机卡国家", "运营商", "运营商名字", "国家iso代码", "网络运营商类型", "网络类型名", "网络类型", "手机类型", "手机卡状态", "mac地址", "无线路由器名", "无线路由器地址", "系统版本", "系统版本值", "系统架构（请保留下划线，下划线隔开的为两个数据）", "屏幕分辨率", "固件版本", "品牌", "型号", "ID", "DISPLAY", "产品名", "制造商", "设备名", "cpu型号", "硬件", "指纹", "串口序列号", "蓝牙地址", "GPU", "GPU厂商", "内网ip（wifi可用）", "基站位置（需要手动更改）" };
  public static String c = "小偷可耻";
  public static String d = "fuck you";
  public static String e = "";
  public static String f = "";
  public static String g = "";
  public static String h = "";
  static String l;
  public static String[] m;
  private View A;
  private RadioGroup B;
  private View C;
  private TextView D;
  private TextView E;
  private boolean G = false;
  View.OnClickListener i = new br(this);
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
  
  static
  {
    F = new p();
    l = StartActivity.b + "/phone/LogicSimpleAction.action";
    m = new String[] { "getDeviceId", "getString", "getLine1Number", "getSimSerialNumber", "getSubscriberId", "getSimCountryIso", "getSimOperator", "getSimOperatorName", "getNetworkCountryIso", "getNetworkOperator", "getNetworkOperatorName", "getNetworkType", "getPhoneType", "getSimState", "getMacAddress", "getSSID", "getBSSID", "RELEASE", "SDK", "HARDWARE", "FINGERPRINT", "getMetrics", "getRadioVersion", "BRAND", "DISPLAY", "MODEL", "PRODUCT", "MANUFACTURER", "DEVICE", "setCpuName", "getJiZhan", "gps", "location_mode", "GL_RENDERER", "GL_VENDOR", "ID", "ARCH", "SERIAL", "getAddress", "getIpAddress", "connect_mode" };
  }
  
  public static void a(Activity paramActivity)
  {
    try
    {
      paramActivity = ViewConfiguration.get(paramActivity);
      Field localField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
      if (localField != null)
      {
        localField.setAccessible(true);
        localField.setBoolean(paramActivity, false);
      }
      return;
    }
    catch (Exception paramActivity)
    {
      paramActivity.printStackTrace();
    }
  }
  
  public static void a(Context paramContext)
  {
    if ((PoseHelper008.valueMap == null) || (PoseHelper008.valueMap.size() == 0)) {
      PoseHelper008.initData(null);
    }
    int i1 = SettingActivity.a();
    String[] arrayOfString;
    int i2;
    if (i1 == 0)
    {
      arrayOfString = SimulateDataTest.getSimData();
      if (SettingActivity.a("imsiHead").length() > 0)
      {
        arrayOfString[0] = SimulateDataTest.getRandData(SettingActivity.a("imsiHead"), 15, 1);
        arrayOfString[1] = arrayOfString[0].substring(0, 5);
      }
      i1 = LoadActivity.a;
      i2 = LoadActivity.b;
      if (arrayOfString[2].indexOf("电信") < 0) {
        break label844;
      }
    }
    label844:
    for (boolean bool = true;; bool = false)
    {
      String str = LoadActivity.getData(paramContext, i1, i2, bool).datagogo;
      i1 = 15;
      Object localObject = str;
      if (SettingActivity.a("setImei14").equals("true"))
      {
        i1 = 14;
        localObject = str.substring(0, 14);
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
      PoseHelper008.valueMap.putkey("getAddress", SimulateDataTest.getMac());
      if (SettingActivity.a("setOpenIp").equals("true")) {
        PoseHelper008.valueMap.putkey("getIpAddress", SimulateDataTest.getRandomIp());
      }
      if (!SettingActivity.a("imsiCheck").equals("false"))
      {
        PoseHelper008.valueMap.putkey("getSubscriberId", arrayOfString[0]);
        PoseHelper008.valueMap.putkey("getSimOperator", arrayOfString[1]);
        PoseHelper008.valueMap.putkey("getNetworkOperator", arrayOfString[1]);
        PoseHelper008.valueMap.putkey("getNetworkOperatorName", arrayOfString[2]);
        PoseHelper008.valueMap.putkey("getSimOperatorName", arrayOfString[2]);
        PoseHelper008.valueMap.putkey("getSimSerialNumber", arrayOfString[3]);
        PoseHelper008.valueMap.putkey("getNetworkType", arrayOfString[4]);
        PoseHelper008.valueMap.putkey("getPhoneType", arrayOfString[5]);
        PoseHelper008.valueMap.putkey("getSubtypeName", arrayOfString[6]);
      }
      PoseHelper008.valueMap.putkey("getSimCountryIso", "cn");
      PoseHelper008.valueMap.putkey("getNetworkCountryIso", "cn");
      PoseHelper008.valueMap.putkey("getLine1Number", SimulateDataTest.getPhoneNumber(arrayOfString[0]));
      PoseHelper008.valueMap.putkey("SERIAL", SimulateDataTest.getRandData(3, 8));
      PoseHelper008.valueMap.putkey("getBSSID", SimulateDataTest.getMac());
      PoseHelper008.valueMap.putkey("ID", SimulateDataTest.getRandData(3, 12));
      PoseHelper008.valueMap.putkey("HOST", SimulateDataTest.getRandData(3, 12));
      PoseHelper008.valueMap.putkey("USER", SimulateDataTest.getRandData(3, 12));
      PoseHelper008.valueMap.putkey("TAGS", SimulateDataTest.getRandData(3, 12));
      PoseHelper008.valueMap.putkey("TYPE", SimulateDataTest.getRandData(3, 12));
      PoseHelper008.valueMap.putkey("getString", SimulateDataTest.getRandData(3, 16));
      PoseHelper008.valueMap.putkey("getSSID", "\"" + SimulateDataTest.getRandData(3, 10) + "\"");
      if (MyWifiNameActivity.c()) {
        PoseHelper008.valueMap.putkey("getSSID", "\"" + MyWifiNameActivity.b() + "\"");
      }
      PoseHelper008.valueMap.putkey("sign", b((String)localObject));
      if (!SettingActivity.a("modalCheck").equals("false"))
      {
        PoseHelper008.valueMap.putkey("BRAND", SimulateDataTest.getPhoneName());
        PoseHelper008.valueMap.putkey("MODEL", SimulateDataTest.getModal());
        PoseHelper008.valueMap.putkey("PRODUCT", SimulateDataTest.getProductName());
        PoseHelper008.valueMap.putkey("DEVICE", SimulateDataTest.getModal());
        PoseHelper008.valueMap.putkey("MANUFACTURER", SimulateDataTest.getPhoneName());
        PoseHelper008.valueMap.putkey("getMetrics", SimulateDataTest.getDisplay());
        PoseHelper008.valueMap.putkey("DISPLAY", SimulateDataTest.getRandData(3, 12));
      }
      localObject = SimulateDataTest.getSdkLevel();
      if (!SettingActivity.a("sdkCheck").equals("false"))
      {
        PoseHelper008.valueMap.putkey("RELEASE", localObject[1]);
        PoseHelper008.valueMap.putkey("SDK", localObject[0]);
      }
      b(paramContext);
      PoseHelper008.saveData();
      if ((paramContext instanceof Activity)) {
        ((Activity)paramContext).runOnUiThread(new bu(paramContext));
      }
      AccountSimActivity.saveaccountdatatoFile();
      MessageAndContactsCreateActivity.a(paramContext);
      PackAgeSimActivity.d();
      return;
      arrayOfString = SimulateDataTest.getSimDataCommon(i1);
      break;
    }
  }
  
  public static String b(String paramString)
  {
    return v.a(paramString + 1666561 + 'm' + 'i');
  }
  
  private static void b(Context paramContext)
  {
    Iterator localIterator;
    if (SettingActivity.a("setUserMyDB").equals("true"))
    {
      localObject = com.lishu.a.a.a(paramContext);
      i1 = ((com.lishu.a.a)localObject).b.size();
      if (i1 > 0)
      {
        i1 = SimulateDataTest.random.nextInt(i1);
        localIterator = ((HashMap)((com.lishu.a.a)localObject).b.get(i1)).entrySet().iterator();
      }
    }
    String str2;
    do
    {
      if (!localIterator.hasNext()) {
        return;
      }
      localObject = (Map.Entry)localIterator.next();
      str2 = (String)((Map.Entry)localObject).getKey();
      str1 = (String)((Map.Entry)localObject).getValue();
      localObject = str1;
      if (!str2.equals("getDeviceId")) {
        break;
      }
    } while (str1.length() <= 10);
    String str1 = str1.substring(0, 9);
    int i1 = SettingActivity.a();
    if (i1 == 0) {}
    for (Object localObject = SimulateDataTest.getSimData();; localObject = SimulateDataTest.getSimDataCommon(i1))
    {
      str1 = LoadActivity.getImei(paramContext, LoadActivity.a, LoadActivity.b, str1);
      PoseHelper008.valueMap.putkey("getLine1Number", SimulateDataTest.getPhoneNumber(localObject[0]));
      PoseHelper008.valueMap.putkey("getSubscriberId", localObject[0]);
      PoseHelper008.valueMap.putkey("getSimOperator", localObject[1]);
      PoseHelper008.valueMap.putkey("getNetworkOperatorName", localObject[2]);
      PoseHelper008.valueMap.putkey("getSimSerialNumber", localObject[3]);
      PoseHelper008.valueMap.putkey("getNetworkType", localObject[4]);
      PoseHelper008.valueMap.putkey("getPhoneType", localObject[5]);
      PoseHelper008.valueMap.putkey("getSubtypeName", localObject[6]);
      localObject = str1;
      if ((localObject == null) || (((String)localObject).trim().length() <= 0)) {
        break;
      }
      PoseHelper008.valueMap.putkey(str2, localObject);
      break;
    }
  }
  
  public static void e()
  {
    if (SettingActivity.a("set_getProp").equals("true"))
    {
      new com.lishu.d.a();
      com.lishu.d.a.c();
    }
  }
  
  private void f()
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
        break label582;
      }
      i1 = 1;
    }
    for (;;)
    {
      label87:
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
        if ((!this.G) && (!SettingActivity.a("saveToHistory").equals("false"))) {
          a(false);
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
        label582:
        if (i1 == 2131361977)
        {
          i1 = 0;
          break label87;
        }
        if (i1 == 2131361974)
        {
          i1 = 2;
          break label87;
        }
        if (i1 == 2131361975)
        {
          i1 = 3;
          break label87;
        }
        if (i1 != 2131361976) {
          break label644;
        }
        i1 = 4;
        break label87;
        i1 = i2;
        if (i3 != 2131361993) {
          i1 = 0;
        }
      }
      label644:
      i1 = 0;
    }
  }
  
  public final void a()
  {
    Object localObject1 = PoseHelper008.valueMap.get("getJiZhan");
    this.v.setText((CharSequence)localObject1);
    int i1 = 0;
    for (;;)
    {
      if (i1 >= a.length) {
        return;
      }
      localObject1 = a[i1];
      EditText localEditText = (EditText)this.o.get(a[i1]);
      if (localEditText != null)
      {
        Object localObject2 = PoseHelper008.valueMap.get(localObject1);
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = "";
        }
        localEditText.setText(localObject1);
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
    if ((paramString == null) || (paramString.length() == 0)) {
      com.lishu.c.a.b(this, "获取数据失败，请重试");
    }
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
          runOnUiThread(new cf(this, (String)localObject));
          return;
        }
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (HistoryActivity.c())
    {
      String str = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
      if (!str.equals(HistoryActivity.a))
      {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
        localBuilder.setTitle("提示");
        localBuilder.setMessage("你勾选了根据日期自动建立分类，是否将当前数据保存到今日日期分类中，并将分类切换为今日日期分类");
        localBuilder.setNegativeButton("确定", new cj(this, str, paramBoolean));
        localBuilder.setPositiveButton("取消", new cl(this, paramBoolean));
        localBuilder.create().show();
      }
    }
    new cn(this).start();
    if (paramBoolean) {
      Toast.makeText(this, "添加到历史记录成功", 0).show();
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
    if (SettingActivity.a("setSdkInt").equals("true")) {}
    try
    {
      i1 = Integer.parseInt(SettingActivity.a("sdkIntSpinnerMin")) - 1;
      i2 = Integer.parseInt(SettingActivity.a("sdkIntSpinnerMax")) - 1;
      if ((i1 >= 0) && (i2 > i1))
      {
        localHashMap.put("min", i1);
        localHashMap.put("max", i2);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bv localbv;
        localException.printStackTrace();
      }
    }
    localHashMap.putAll(StartActivity.b());
    localHashMap.put("MANUFACTURER", SelectManuActivity.a());
    this.u.show();
    l = StartActivity.b + "/phone/LogicSimpleAction.action";
    localbv = new bv(this);
    F.a(l, localHashMap, localbv);
  }
  
  public final void d()
  {
    HashMap localHashMap = new HashMap();
    l = SetNetAddressActivity.c();
    int i1 = 0;
    if (l.indexOf("?") > 0) {
      i1 = 1;
    }
    if (i1 == 0) {}
    for (l += "?imei=";; l += "&imei=")
    {
      Object localObject = (TelephonyManager)getSystemService("phone");
      l += ((TelephonyManager)localObject).getDeviceId();
      localObject = new ca(this);
      H.a(l, localHashMap, (w)localObject);
      return;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent == null) {}
    do
    {
      do
      {
        Object localObject1;
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
                        return;
                        if (paramInt1 != 1) {
                          break;
                        }
                        this.G = false;
                        paramIntent = paramIntent.getStringExtra("getDeviceId");
                      } while (paramIntent == null);
                      paramIntent = com.lishu.b.a.a.b(HistoryActivity.a, paramIntent);
                    } while (paramIntent == null);
                    localObject1 = (String)paramIntent.get("getDeviceId");
                    FolderBackUpActivity.b(HistoryActivity.b(), (String)localObject1);
                    BackupFileActivity.a(this);
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
                    if (paramIntent.equals("3"))
                    {
                      ((RadioButton)this.C.findViewById(2131361975)).setChecked(true);
                      return;
                    }
                    if (paramIntent.equals("4"))
                    {
                      ((RadioButton)this.C.findViewById(2131361976)).setChecked(true);
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
            if (paramInt1 != 5) {
              break;
            }
            this.G = true;
            localObject1 = paramIntent.getStringExtra("name");
            paramIntent = paramIntent.getStringExtra("progress");
          } while (localObject1 == null);
          localObject2 = (ArrayList)com.lishu.b.a.a.a.get(localObject1);
          if (localObject2 == null)
          {
            Toast.makeText(this, "请检查历史记录是否已经被重命名，如果重命名请删除留存控制中的相关项", 1).show();
            return;
          }
          paramIntent = (HashMap)((ArrayList)localObject2).get(Integer.parseInt(paramIntent) - 1);
        } while (paramIntent == null);
        Object localObject2 = paramIntent.entrySet().iterator();
        for (;;)
        {
          if (!((Iterator)localObject2).hasNext())
          {
            FolderBackUpActivity.b((String)localObject1, (String)paramIntent.get("getDeviceId"));
            localObject1 = (String)paramIntent.get("getJiZhan");
            localObject2 = (String)paramIntent.get("gps");
            paramIntent = (String)paramIntent.get("location_mode");
            this.v.setText((CharSequence)localObject1);
            this.w.setText((CharSequence)localObject2);
            if (!"1".equals(paramIntent)) {
              break;
            }
            ((RadioButton)this.C.findViewById(2131361973)).setChecked(true);
            return;
          }
          Object localObject4 = (Map.Entry)((Iterator)localObject2).next();
          localObject3 = (String)((Map.Entry)localObject4).getKey();
          localObject4 = (String)((Map.Entry)localObject4).getValue();
          localObject3 = (EditText)this.o.get(localObject3);
          if (localObject3 != null) {
            ((EditText)localObject3).setText((CharSequence)localObject4);
          }
        }
        if ("2".equals(paramIntent))
        {
          ((RadioButton)this.C.findViewById(2131361974)).setChecked(true);
          return;
        }
        if ("3".equals(paramIntent))
        {
          ((RadioButton)this.C.findViewById(2131361975)).setChecked(true);
          return;
        }
        if ("4".equals(paramIntent))
        {
          ((RadioButton)this.C.findViewById(2131361976)).setChecked(true);
          return;
        }
        ((RadioButton)this.C.findViewById(2131361977)).setChecked(true);
        return;
        if (paramInt1 == 6)
        {
          if (paramIntent.getStringExtra("selectKind").equals("select")) {
            PoseHelper008.saveDataToFile("008Mode", "4");
          }
          for (;;)
          {
            this.t.setText(this.s[4]);
            return;
            PoseHelper008.saveDataToFile("008Mode", "5");
          }
        }
      } while (paramInt1 != 7);
      paramIntent = paramIntent.getStringExtra("jizhanPos");
    } while (paramIntent == null);
    PoseHelper008.valueMap.putkey("getJiZhan", paramIntent);
    Toast.makeText(this, "保存成功", 0).show();
    this.v.setText(paramIntent);
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
      if (i1 == 3)
      {
        PoseHelper008.saveDataToFile("008Mode", "3");
        this.t.setText(this.s[3]);
        return true;
      }
    } while (i1 != 4);
    paramMenuItem = new Intent();
    paramMenuItem.setClass(this, SelectMoreAppActivity.class);
    startActivityForResult(paramMenuItem, 6);
    return true;
  }
  
  /* Error */
  protected void onCreate(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 1056	android/app/Activity:onCreate	(Landroid/os/Bundle;)V
    //   5: aload_0
    //   6: invokevirtual 1061	android/content/Context:getPackageCodePath	()Ljava/lang/String;
    //   9: astore_1
    //   10: new 236	java/lang/StringBuilder
    //   13: dup
    //   14: new 1063	java/util/zip/ZipFile
    //   17: dup
    //   18: aload_1
    //   19: invokespecial 1064	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   22: ldc_w 1066
    //   25: invokestatic 1067	com/soft/apk008/LoadActivity:Inttolong	(Ljava/lang/String;)Ljava/lang/String;
    //   28: invokevirtual 1071	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   31: invokevirtual 1077	java/util/zip/ZipEntry:getCrc	()J
    //   34: invokestatic 1080	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   37: invokespecial 247	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   40: invokevirtual 257	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   43: invokestatic 519	com/lishu/saveaccountdatatoFile/v:XhookMethod	(Ljava/lang/String;)Ljava/lang/String;
    //   46: astore_1
    //   47: aload_0
    //   48: ldc_w 1082
    //   51: invokestatic 1085	com/soft/apk008/StartActivity:XhookMethod	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   54: astore 5
    //   56: aload_1
    //   57: invokevirtual 579	java/lang/String:trim	()Ljava/lang/String;
    //   60: aload 5
    //   62: invokevirtual 579	java/lang/String:trim	()Ljava/lang/String;
    //   65: invokevirtual 396	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   68: istore 4
    //   70: iload 4
    //   72: ifne +6 -> 78
    //   75: invokestatic 1087	com/soft/apk008/LoadActivity:Inttolong	()V
    //   78: aload_0
    //   79: invokestatic 1090	com/soft/apk008/SetDataActivity:Inttolong	(Landroid/content/Context;)V
    //   82: invokestatic 1092	com/soft/apk008/HistoryActivity:XhookMethod	()V
    //   85: aload_0
    //   86: invokestatic 1095	com/data/simulate/SimulateDataTest:init	(Landroid/content/Context;)V
    //   89: aload_0
    //   90: ldc_w 1096
    //   93: invokevirtual 1099	com/soft/apk008/SetMessageActivity:setContentView	(I)V
    //   96: aload_0
    //   97: aload_0
    //   98: ldc_w 1100
    //   101: invokevirtual 1101	com/soft/apk008/SetMessageActivity:findViewById	(I)Landroid/view/View;
    //   104: checkcast 865	android/widget/LinearLayout
    //   107: putfield 738	com/soft/apk008/SetMessageActivity:n	Landroid/widget/LinearLayout;
    //   110: aload_0
    //   111: aload_0
    //   112: ldc_w 1102
    //   115: invokevirtual 1101	com/soft/apk008/SetMessageActivity:findViewById	(I)Landroid/view/View;
    //   118: checkcast 1007	android/widget/Button
    //   121: putfield 509	com/soft/apk008/SetMessageActivity:p	Landroid/widget/Button;
    //   124: aload_0
    //   125: aload_0
    //   126: ldc_w 1103
    //   129: invokevirtual 1101	com/soft/apk008/SetMessageActivity:findViewById	(I)Landroid/view/View;
    //   132: checkcast 1007	android/widget/Button
    //   135: putfield 732	com/soft/apk008/SetMessageActivity:q	Landroid/widget/Button;
    //   138: aload_0
    //   139: aload_0
    //   140: ldc_w 1104
    //   143: invokevirtual 1101	com/soft/apk008/SetMessageActivity:findViewById	(I)Landroid/view/View;
    //   146: checkcast 1007	android/widget/Button
    //   149: putfield 297	com/soft/apk008/SetMessageActivity:r	Landroid/widget/Button;
    //   152: aload_0
    //   153: aload_0
    //   154: ldc_w 1105
    //   157: invokevirtual 1101	com/soft/apk008/SetMessageActivity:findViewById	(I)Landroid/view/View;
    //   160: checkcast 857	android/widget/TextView
    //   163: putfield 592	com/soft/apk008/SetMessageActivity:D	Landroid/widget/TextView;
    //   166: aload_0
    //   167: aload_0
    //   168: ldc_w 1106
    //   171: invokevirtual 1101	com/soft/apk008/SetMessageActivity:findViewById	(I)Landroid/view/View;
    //   174: checkcast 857	android/widget/TextView
    //   177: putfield 600	com/soft/apk008/SetMessageActivity:E	Landroid/widget/TextView;
    //   180: aload_0
    //   181: iconst_5
    //   182: anewarray 59	java/lang/String
    //   185: dup
    //   186: iconst_0
    //   187: ldc_w 1108
    //   190: aastore
    //   191: dup
    //   192: iconst_1
    //   193: ldc_w 1110
    //   196: aastore
    //   197: dup
    //   198: iconst_2
    //   199: ldc_w 1112
    //   202: aastore
    //   203: dup
    //   204: iconst_3
    //   205: ldc_w 1114
    //   208: aastore
    //   209: dup
    //   210: iconst_4
    //   211: ldc_w 1116
    //   214: aastore
    //   215: putfield 1003	com/soft/apk008/SetMessageActivity:s	[Ljava/lang/String;
    //   218: aload_0
    //   219: getstatic 373	com/soft/apk008/LoadActivity:XhookMethod	I
    //   222: getstatic 375	com/soft/apk008/LoadActivity:Inttolong	I
    //   225: invokestatic 686	com/soft/apk008/LoadActivity:getProPackAge	(Landroid/content/Context;II)Ljava/lang/String;
    //   228: astore_1
    //   229: aload_1
    //   230: invokevirtual 361	java/lang/String:length	()I
    //   233: ifle +10 -> 243
    //   236: aload_0
    //   237: getfield 1003	com/soft/apk008/SetMessageActivity:s	[Ljava/lang/String;
    //   240: iconst_2
    //   241: aload_1
    //   242: aastore
    //   243: aload_0
    //   244: aload_0
    //   245: ldc_w 1117
    //   248: invokevirtual 1101	com/soft/apk008/SetMessageActivity:findViewById	(I)Landroid/view/View;
    //   251: checkcast 1007	android/widget/Button
    //   254: putfield 1005	com/soft/apk008/SetMessageActivity:t	Landroid/widget/Button;
    //   257: aload_0
    //   258: getfield 1005	com/soft/apk008/SetMessageActivity:t	Landroid/widget/Button;
    //   261: new 1119	com/soft/apk008/cg
    //   264: dup
    //   265: aload_0
    //   266: invokespecial 1120	com/soft/apk008/cg:<init>	(Lcom/soft/apk008/SetMessageActivity;)V
    //   269: invokevirtual 1124	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   272: aload_0
    //   273: aload_0
    //   274: getfield 1005	com/soft/apk008/SetMessageActivity:t	Landroid/widget/Button;
    //   277: invokevirtual 1128	com/soft/apk008/SetMessageActivity:registerForContextMenu	(Landroid/view/View;)V
    //   280: ldc_w 688
    //   283: invokestatic 691	de/robv/android/xposed/mods/tutorial/PoseHelper008:getFileData	(Ljava/lang/String;)Ljava/lang/String;
    //   286: astore 5
    //   288: aload 5
    //   290: invokevirtual 361	java/lang/String:length	()I
    //   293: ifle +77 -> 370
    //   296: aload 5
    //   298: invokestatic 904	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   301: istore_3
    //   302: iload_3
    //   303: istore_2
    //   304: iload_3
    //   305: iconst_4
    //   306: if_icmplt +5 -> 311
    //   309: iconst_4
    //   310: istore_2
    //   311: aload_0
    //   312: getfield 1005	com/soft/apk008/SetMessageActivity:t	Landroid/widget/Button;
    //   315: aload_0
    //   316: getfield 1003	com/soft/apk008/SetMessageActivity:s	[Ljava/lang/String;
    //   319: iload_2
    //   320: aaload
    //   321: invokevirtual 1008	android/widget/Button:setText	(Ljava/lang/CharSequence;)V
    //   324: iload_2
    //   325: iconst_2
    //   326: if_icmpne +44 -> 370
    //   329: new 280	java/util/HashMap
    //   332: dup
    //   333: invokespecial 281	java/util/HashMap:<init>	()V
    //   336: astore 5
    //   338: aload 5
    //   340: ldc_w 1130
    //   343: aload_1
    //   344: invokevirtual 880	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   347: pop
    //   348: aload 5
    //   350: ldc_w 1132
    //   353: aload_0
    //   354: invokestatic 1137	de/robv/android/xposed/mods/tutorial/recenttaskinfolist:XhookMethod	(Landroid/content/Context;)Ljava/lang/String;
    //   357: invokevirtual 880	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   360: pop
    //   361: aload_0
    //   362: ldc_w 1139
    //   365: aload 5
    //   367: invokestatic 1144	com/umeng/analytics/MobclickAgent:XhookMethod	(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;)V
    //   370: aload_0
    //   371: getfield 297	com/soft/apk008/SetMessageActivity:r	Landroid/widget/Button;
    //   374: aload_0
    //   375: getfield 290	com/soft/apk008/SetMessageActivity:runningtaskinfolist	Landroid/view/View$OnClickListener;
    //   378: invokevirtual 1124	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   381: aload_0
    //   382: getfield 509	com/soft/apk008/SetMessageActivity:p	Landroid/widget/Button;
    //   385: aload_0
    //   386: getfield 290	com/soft/apk008/SetMessageActivity:runningtaskinfolist	Landroid/view/View$OnClickListener;
    //   389: invokevirtual 1124	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   392: aload_0
    //   393: getfield 732	com/soft/apk008/SetMessageActivity:q	Landroid/widget/Button;
    //   396: aload_0
    //   397: getfield 290	com/soft/apk008/SetMessageActivity:runningtaskinfolist	Landroid/view/View$OnClickListener;
    //   400: invokevirtual 1124	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   403: aload_0
    //   404: getfield 592	com/soft/apk008/SetMessageActivity:D	Landroid/widget/TextView;
    //   407: aload_0
    //   408: getfield 290	com/soft/apk008/SetMessageActivity:runningtaskinfolist	Landroid/view/View$OnClickListener;
    //   411: invokevirtual 1145	android/widget/TextView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   414: aload_0
    //   415: getfield 600	com/soft/apk008/SetMessageActivity:E	Landroid/widget/TextView;
    //   418: aload_0
    //   419: getfield 290	com/soft/apk008/SetMessageActivity:runningtaskinfolist	Landroid/view/View$OnClickListener;
    //   422: invokevirtual 1145	android/widget/TextView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   425: getstatic 1147	com/soft/apk008/StartActivity:applicationInfolist	Z
    //   428: ifne +12 -> 440
    //   431: aload_0
    //   432: getfield 592	com/soft/apk008/SetMessageActivity:D	Landroid/widget/TextView;
    //   435: bipush 8
    //   437: invokevirtual 1150	android/widget/TextView:setVisibility	(I)V
    //   440: aload_0
    //   441: new 923	android/app/ProgressDialog
    //   444: dup
    //   445: aload_0
    //   446: invokespecial 1151	android/app/ProgressDialog:<init>	(Landroid/content/Context;)V
    //   449: putfield 735	com/soft/apk008/SetMessageActivity:u	Landroid/app/ProgressDialog;
    //   452: aload_0
    //   453: getfield 735	com/soft/apk008/SetMessageActivity:u	Landroid/app/ProgressDialog;
    //   456: ldc_w 1153
    //   459: invokevirtual 1155	android/app/ProgressDialog:setMessage	(Ljava/lang/CharSequence;)V
    //   462: aload_0
    //   463: getfield 735	com/soft/apk008/SetMessageActivity:u	Landroid/app/ProgressDialog;
    //   466: invokevirtual 924	android/app/ProgressDialog:show	()V
    //   469: aload_0
    //   470: getfield 735	com/soft/apk008/SetMessageActivity:u	Landroid/app/ProgressDialog;
    //   473: iconst_0
    //   474: invokevirtual 1158	android/app/ProgressDialog:setCancelable	(Z)V
    //   477: new 1160	com/soft/apk008/ch
    //   480: dup
    //   481: aload_0
    //   482: invokespecial 1161	com/soft/apk008/ch:<init>	(Lcom/soft/apk008/SetMessageActivity;)V
    //   485: invokevirtual 1162	com/soft/apk008/ch:start	()V
    //   488: aload_0
    //   489: invokestatic 1163	com/soft/apk008/SetMessageActivity:XhookMethod	(Landroid/app/Activity;)V
    //   492: getstatic 1166	de/robv/android/xposed/mods/tutorial/getMap:Inttolong	Ljava/lang/String;
    //   495: getstatic 213	com/soft/apk008/SetMessageActivity:saveaccountdatatoFile	Ljava/lang/String;
    //   498: invokevirtual 396	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   501: pop
    //   502: ldc_w 1168
    //   505: ldc_w 392
    //   508: invokestatic 1001	de/robv/android/xposed/mods/tutorial/PoseHelper008:saveDataToFile	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   511: pop
    //   512: return
    //   513: astore_1
    //   514: aload_1
    //   515: invokevirtual 1169	java/io/IOException:printStackTrace	()V
    //   518: goto -440 -> 78
    //   521: astore_1
    //   522: goto -444 -> 78
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	525	0	this	SetMessageActivity
    //   0	525	1	paramBundle	android.os.Bundle
    //   303	24	2	i1	int
    //   301	6	3	i2	int
    //   68	3	4	bool	boolean
    //   54	312	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   10	70	513	java/io/IOException
    //   75	78	513	java/io/IOException
    //   75	78	521	java/lang/Exception
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    paramContextMenu.setHeaderTitle("选择模式");
    paramContextMenu.add(0, 0, 0, "关闭");
    paramContextMenu.add(0, 1, 0, "全局");
    paramContextMenu.add(0, 2, 0, "单个应用");
    paramContextMenu.add(0, 3, 0, "全局（不包括系统，推荐！）");
    paramContextMenu.add(0, 4, 0, "多个应用");
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296261, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    f();
    this.u.dismiss();
    super.onDestroy();
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    return super.onKeyUp(paramInt, paramKeyEvent);
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
        localBuilder.setNegativeButton("上一条", new co(this, str));
        localBuilder.setPositiveButton("下一条", new cp(this, str));
        localBuilder.setNeutralButton("第一条", new cq(this, str));
        localBuilder.create().show();
        return true;
      }
      if (paramMenuItem.getItemId() == 2131362282)
      {
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
    } while (paramMenuItem.getItemId() != 2131362285);
    new FeedbackAgent(this).d();
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
    F.a(this.k, (HashMap)localObject, this);
    if (SettingActivity.a("saveToHistory").equals("false")) {
      this.E.setVisibility(0);
    }
    for (;;)
    {
      MobclickAgent.b(this);
      return;
      this.E.setVisibility(8);
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.SetMessageActivity

 * JD-Core Version:    0.7.0.1

 */