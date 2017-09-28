package com.imengququ.myxposed.soft.apk008;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.data.simulate.SimulateDataTemp;
import com.lishu.db008.DB008;
import com.lishu.jifen.db.FileHelper;
import com.lishu.net.AlertDialogHelper;
import com.lishu.net.LishuNet;
import com.lishu.net.MD5Util;
import com.lishu.net.NetReceiver;
import com.soft.apk008.remain.ReMainActivity;
import com.soft.tools.RecordAppFileHandler;
import com.soft.tools.SetNetAddressActivity;
import com.soft.tools.SetSystemValueActivity;
import com.soft.tools.SharedData;
import com.soft.toos.findApp.QuickFindActivity;
import com.umeng.analytics.MobclickAgent;
import de.robv.android.xposed.mods.tutorial.CheckCanUse;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import de.robv.android.xposed.mods.tutorial.Shell;
import de.robv.android.xposed.mods.tutorial.TeleData;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SetDataActivity
  extends Activity
  implements NetReceiver
{
  public static String a;
  public static String c;
  public static String f;
  public static String k;
  public static String u = "";
  public static String[] valueArr = { "getDeviceId", "getString", "getLine1Number", "getSimSerialNumber", "getSubscriberId", "getSimCountryIso", "getSimOperator", "getSimOperatorName", "getNetworkCountryIso", "getNetworkOperator", "getNetworkOperatorName", "getNetworkType", "getPhoneType", "getSimState", "getMacAddress", "getSSID", "getBSSID", "RELEASE", "SDK", "ARCH", "getMetrics", "getRadioVersion", "BRAND", "MODEL", "PRODUCT", "MANUFACTURER", "setCpuName", "HARDWARE", "FINGERPRINT" };
  public static String[] valueArrAll = { "getDeviceId", "getString", "getLine1Number", "getSimSerialNumber", "getSubscriberId", "getSimCountryIso", "getSimOperator", "getSimOperatorName", "getNetworkCountryIso", "getNetworkOperator", "getNetworkOperatorName", "getNetworkType", "getPhoneType", "getSimState", "getMacAddress", "getSSID", "getBSSID", "RELEASE", "SDK", "HARDWARE", "FINGERPRINT", "getMetrics", "getRadioVersion", "BRAND", "MODEL", "PRODUCT", "MANUFACTURER", "setCpuName", "getJiZhan", "gps", "location_mode" };
  public static String[] valueArrName = { "序列号", "android_id", "手机号码", "手机卡序列号", "IMSI", "手机卡国家", "运营商", "运营商名字", "国家iso代码", "网络类型", "网络类型名", "网络类型", "手机类型", "手机卡状态", "mac地址", "无线路由器名", "无线路由器地址", "系统版本", "系统版本值", "系统架构（请保留下划线，下划线隔开的为两个数据）", "屏幕分辨率", "固件版本", "品牌", "型号", "产品名", "制造商", "cpu型号", "硬件", "指纹", "基站位置（需要手动更改）" };
  public static String y;
  private MyAdapter adater;
  private TextView button_getFromNet;
  private Button button_history;
  private Button button_random;
  private Button button_restore;
  private Button button_setGps;
  private Button button_setJiZhan;
  private RadioGroup connectRadioGroup;
  private HashMap<String, EditText> data = new HashMap();
  private EditText edit_Gps;
  private EditText edit_JiZhan;
  private View layout;
  private View layout_connect;
  View.OnClickListener listener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView.equals(SetDataActivity.this.button_history))
      {
       Intent intent = new Intent();
        intent.setClass(SetDataActivity.this, HistoryActivity.class);
        SetDataActivity.this.startActivityForResult(intent, 1);
      }
      do
      {
        return;
        if (paramAnonymousView.equals(SetDataActivity.this.button_restore))
        {
          SetDataActivity.this.saveMessage();
          return;
        }
        if (paramAnonymousView.equals(SetDataActivity.this.button_getFromNet))
        {
          SetDataActivity.this.nowRemain = false;
          SetDataActivity.this.getFromNet2();
          return;
        }
        if (paramAnonymousView.equals(SetDataActivity.this.button_random))
        {
          SetDataActivity.this.progress.show();
          SetDataActivity.this.progress.show();
          new Thread()
          {
            public void run()
            {
              SetDataActivity.this.nowRemain = false;
              SetDataActivity.changeDataInner(SetDataActivity.this);
              SetDataActivity.this.runOnUiThread(new Runnable()
              {
                public void run()
                {
                  SetDataActivity.this.updateView();
                  SetDataActivity.this.progress.hide();
                }
              });
            }
          }.start();
          return;
        }
        if (paramAnonymousView.equals(SetDataActivity.this.button_setGps)) {
          try
          {
            Intent intent = new Intent("android.intent.action.getMap");
            intent.putExtra("android.intent.extra.EMAIL", "hello haozi");
            SetDataActivity.this.startActivityForResult(intent, 3);
            return;
          }
          catch (Exception e)
          {
            Toast.makeText(SetDataActivity.this, "008神器工具箱未安装", 1000).show();
            InstallActivity.installAssets(SetDataActivity.this, "Apk008Tool.apk");
            return;
          }
        }
      } while (!paramAnonymousView.equals(SetDataActivity.this.button_setJiZhan));
      try
      {
       Intent intent = new Intent("android.intent.action.getJiZhan");
        SetDataActivity.this.startActivityForResult(intent, 4);
        return;
      }
      catch (Exception e)
      {
        Toast.makeText(SetDataActivity.this, "008神器工具箱未安装", 1000).show();
        InstallActivity.installAssets(SetDataActivity.this, "Apk008Tool.apk");
      }
    }
  };
  private RadioGroup locationRadioGroup;
  private Button modalButton;
  private LishuNet net = new LishuNet();
  String netUrl = StartActivity.baseUrl + "/phone/LogicSimpleAction.action";
  String nowIndex;
  private boolean nowRemain = false;
  private ProgressDialog progress;
  private String[] spinnerData;
  String url = StartActivity.baseUrl + "/phone/LogicSimpleAction.action";
  private LinearLayout view_con;
  
  static
  {
    f = "小偷可耻";
    a = "fuck you";
    c = "";
    k = "";
    y = "";
  }
  
  private EditText addEditView()
  {
    EditText localEditText = new EditText(this);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    this.view_con.addView(localEditText, localLayoutParams);
    return localEditText;
  }
  
  private TextView addTextView(String paramString1, String paramString2)
  {
    TextView  textView = new TextView(this);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    this.view_con.addView(textView, localLayoutParams);
    textView.setTextSize(10.0F);
    textView.setText(paramString1);
    return textView;
  }
  
  public static void changeData(Context paramContext)
  {
    String[] arrayOfString = SimulateDataTemp.getSimData();
    if (SettingActivity.getValue("imsiHead").length() > 0)
    {
      arrayOfString[0] = SimulateDataTemp.getRandData(SettingActivity.getValue("imsiHead"), 15, 1);
      arrayOfString[1] = arrayOfString[0].substring(0, 5);
    }
    int i = LoadActivity.a;
    int j = LoadActivity.b;
    if (arrayOfString[2].indexOf("电信") >= 0) {}
    for (boolean bool = true;; bool = false)
    {
      String str = LoadActivity.getData(paramContext, i, j, bool).datagogo;
      i = 15;
      Object localObject = str;
      if (SettingActivity.getValue("setImei14").equals("true"))
      {
        i = 14;
        localObject = str.substring(0, 14);
      }
      if (SettingActivity.getValue("imeiHead").length() > 0) {
        localObject = SimulateDataTemp.getRandData(SettingActivity.getValue("imeiHead"), i, 3);
      }
      if (!SettingActivity.getValue("imeiCheck").equals("false")) {
        PoseHelper008.valueMap.put("getDeviceId", localObject);
      }
      if (!SettingActivity.getValue("setOpenMac").equals("false")) {
        PoseHelper008.valueMap.put("getMacAddress", SimulateDataTemp.getMac());
      }
      if (!SettingActivity.getValue("imsiCheck").equals("false"))
      {
        PoseHelper008.valueMap.put("getSubscriberId", arrayOfString[0]);
        PoseHelper008.valueMap.put("getSimOperator", arrayOfString[1]);
        PoseHelper008.valueMap.put("getNetworkOperatorName", arrayOfString[2]);
        PoseHelper008.valueMap.put("getSimSerialNumber", arrayOfString[3]);
      }
      PoseHelper008.valueMap.put("getLine1Number", SimulateDataTemp.getPhoneNumber(arrayOfString[0]));
      PoseHelper008.valueMap.put("getBSSID", SimulateDataTemp.getMac());
      PoseHelper008.valueMap.put("getString", SimulateDataTemp.getRandData(3, 16));
      PoseHelper008.valueMap.put("getSSID", SimulateDataTemp.getRandData(3, 10));
      PoseHelper008.valueMap.put("sign", getSign((String)localObject));
      if (!SettingActivity.getValue("modalCheck").equals("false"))
      {
        PoseHelper008.valueMap.put("BRAND", SimulateDataTemp.getPhoneName());
        PoseHelper008.valueMap.put("MODEL", SimulateDataTemp.getModal());
        PoseHelper008.valueMap.put("PRODUCT", SimulateDataTemp.getProductName());
        PoseHelper008.valueMap.put("DEVICE", SimulateDataTemp.getModal());
        PoseHelper008.valueMap.put("MANUFACTURER", SimulateDataTemp.getPhoneName());
        PoseHelper008.valueMap.put("getMetrics", SimulateDataTemp.getDisplay());
      }
      localObject = SimulateDataTemp.getSdkLevel();
      if (!SettingActivity.getValue("sdkCheck").equals("false"))
      {
        PoseHelper008.valueMap.put("RELEASE", localObject[1]);
        PoseHelper008.valueMap.put("SDK", localObject[0]);
      }
      getPhoneDataFromDB(paramContext);
      PoseHelper008.saveData();
      if ((paramContext instanceof Activity)) {
        ((Activity)paramContext).runOnUiThread(new Runnable()
        {
          public void run()
          {
            Toast.makeText(SetDataActivity.this, "生成随机成功", 0).show();
          }
        });
      }
      return;
    }
  }
  
  public static void changeDataInner(Context paramContext)
  {
    Object localObject = "a";
    int i = 0;
    String[] arrayOfString;
    int j;
    if (i >= c.length())
    {
      if ((PoseHelper008.valueMap == null) || (PoseHelper008.valueMap.size() == 0)) {
        PoseHelper008.initData(null);
      }
      arrayOfString = SimulateDataTemp.getSimData();
      if (SettingActivity.getValue("imsiHead").length() > 0)
      {
        arrayOfString[0] = SimulateDataTemp.getRandData(SettingActivity.getValue("imsiHead"), 15, 1);
        arrayOfString[1] = arrayOfString[0].substring(0, 5);
      }
      i = LoadActivity.a;
      j = LoadActivity.b;
      if (arrayOfString[2].indexOf("电信") < 0) {
        break label545;
      }
    }
    label545:
    for (boolean bool = true;; bool = false)
    {
      String str = LoadActivity.getData(paramContext, i, j, bool).datagogo;
      i = 15;
      localObject = str;
      if (SettingActivity.getValue("setImei14").equals("true"))
      {
        i = 14;
        localObject = str.substring(0, 14);
      }
      if (SettingActivity.getValue("imeiHead").length() > 0) {
        localObject = SimulateDataTemp.getRandData(SettingActivity.getValue("imeiHead"), i, 3);
      }
      if (!SettingActivity.getValue("imeiCheck").equals("false")) {
        PoseHelper008.valueMap.put("getDeviceId", localObject);
      }
      if (!SettingActivity.getValue("setOpenMac").equals("false")) {
        PoseHelper008.valueMap.put("getMacAddress", SimulateDataTemp.getMac());
      }
      if (!SettingActivity.getValue("imsiCheck").equals("false"))
      {
        PoseHelper008.valueMap.put("getSubscriberId", arrayOfString[0]);
        PoseHelper008.valueMap.put("getSimOperator", arrayOfString[1]);
        PoseHelper008.valueMap.put("getNetworkOperatorName", arrayOfString[2]);
        PoseHelper008.valueMap.put("getSimSerialNumber", arrayOfString[3]);
      }
      PoseHelper008.valueMap.put("getLine1Number", SimulateDataTemp.getPhoneNumber(arrayOfString[0]));
      PoseHelper008.valueMap.put("getBSSID", SimulateDataTemp.getMac());
      PoseHelper008.valueMap.put("getString", SimulateDataTemp.getRandData(3, 16));
      PoseHelper008.valueMap.put("getSSID", SimulateDataTemp.getRandData(3, 10));
      PoseHelper008.valueMap.put("sign", getSign((String)localObject));
      if (!SettingActivity.getValue("modalCheck").equals("false"))
      {
        PoseHelper008.valueMap.put("BRAND", SimulateDataTemp.getPhoneName());
        PoseHelper008.valueMap.put("MODEL", SimulateDataTemp.getModal());
        PoseHelper008.valueMap.put("PRODUCT", SimulateDataTemp.getProductName());
        PoseHelper008.valueMap.put("DEVICE", SimulateDataTemp.getModal());
        PoseHelper008.valueMap.put("MANUFACTURER", SimulateDataTemp.getPhoneName());
        PoseHelper008.valueMap.put("getMetrics", SimulateDataTemp.getDisplay());
      }
      localObject = SimulateDataTemp.getSdkLevel();
      if (!SettingActivity.getValue("sdkCheck").equals("false"))
      {
        PoseHelper008.valueMap.put("RELEASE", localObject[1]);
        PoseHelper008.valueMap.put("SDK", localObject[0]);
      }
      getPhoneDataFromDB(paramContext);
      PoseHelper008.saveData();
      return;
      localObject = localObject + CheckCanUse.a.length();
      i += 1;
      break;
    }
  }
  
  private void getOverflowMenu()
  {
    try
    {
      ViewConfiguration localViewConfiguration = ViewConfiguration.get(this);
      Field localField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
      if (localField != null)
      {
        localField.setAccessible(true);
        localField.setBoolean(localViewConfiguration, false);
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static void getPhoneDataFromDB(Context paramContext)
  {
    Object localObject;
    Iterator localIterator;
    if (SettingActivity.getValue("setUserMyDB").equals("true"))
    {
      localObject = DB008.getInstance(paramContext);
      int i = ((DB008)localObject).dataList.size();
      if (i > 0)
      {
        i = SimulateDataTemp.r.nextInt(i);
        localIterator = ((HashMap)((DB008)localObject).dataList.get(i)).entrySet().iterator();
      }
    }
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      localObject = (Entry)localIterator.next();
      String str2 = (String)((Entry)localObject).getKey();
      String str1 = (String)((Entry)localObject).getValue();
      localObject = str1;
      if (str2.equals("getDeviceId"))
      {
        if (str1.length() > 10)
        {
          str1 = str1.substring(0, 9);
          localObject = SimulateDataTemp.getSimData(false);
          if (str1.toUpperCase().startsWith("A")) {
            localObject = SimulateDataTemp.getSimData(true);
          }
          str1 = LoadActivity.getImei(paramContext, LoadActivity.a, LoadActivity.b, str1);
          PoseHelper008.valueMap.put("getSubscriberId", localObject[0]);
          PoseHelper008.valueMap.put("getSimOperator", localObject[1]);
          PoseHelper008.valueMap.put("getNetworkOperatorName", localObject[2]);
          PoseHelper008.valueMap.put("getSimSerialNumber", localObject[3]);
          localObject = str1;
        }
      }
      else if ((localObject != null) && (((String)localObject).trim().length() > 0)) {
        PoseHelper008.valueMap.put(str2, localObject);
      }
    }
  }
  
  public static String getSign(String paramString)
  {
    return MD5Util.MD5(paramString + 1666561 + 'm' + 'i');
  }
  
  private void saveMessage()
  {
    Object localObject1 = this.data.entrySet().iterator();
    int j;
    int i;
    if (!((Iterator)localObject1).hasNext())
    {
      PoseHelper008.valueMap.put("getJiZhan", this.edit_JiZhan.getText().toString());
      PoseHelper008.valueMap.put("gps", this.edit_Gps.getText().toString());
      j = this.locationRadioGroup.getCheckedRadioButtonId();
      i = 0;
      if (j != 2131230846) {
        break label562;
      }
      i = 1;
      label83:
      PoseHelper008.valueMap.put("location_mode", i);
      j = this.connectRadioGroup.getCheckedRadioButtonId();
      i = 0;
      if (j != 2131230862) {
        break label586;
      }
      i = 1;
    }
    for (;;)
    {
      PoseHelper008.valueMap.put("connect_mode", i);
      PoseHelper008.valueMap.put("sign", getSign(PoseHelper008.valueMap.get("getDeviceId")));
      localObject1 = new DisplayMetrics();
      getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
      PoseHelper008.valueMap.put("density", ((DisplayMetrics)localObject1).density);
      PoseHelper008.valueMap.put("densityDpi", ((DisplayMetrics)localObject1).densityDpi);
      PoseHelper008.valueMap.put("scaledDensity", ((DisplayMetrics)localObject1).scaledDensity);
      PoseHelper008.valueMap.put("xdpi", ((DisplayMetrics)localObject1).xdpi);
      PoseHelper008.valueMap.put("ydpi", ((DisplayMetrics)localObject1).ydpi);
      PoseHelper008.saveData();
      if (!this.nowRemain) {
        new Thread()
        {
          public void run()
          {
            FileHelper.addOrUpdateItem(HistoryActivity.nowFileName, PoseHelper008.valueMap);
          }
        }.start();
      }
      Toast.makeText(this, "保存成功", 0).show();
      localObject1 = LoadActivity.getProPackAge(this, LoadActivity.a, LoadActivity.b);
      if (PoseHelper008.getFileData("008Mode").equals("2"))
      {
        if (!SettingActivity.getValue("setCloseCheck").equals("false")) {
          ((ActivityManager)getSystemService("activity")).killBackgroundProcesses((String)localObject1);
        }
        if (!SettingActivity.getValue("clearAppCheck").equals("false")) {
          Shell.execCommand("pm clear " + (String)localObject1, true, false);
        }
        if (!SettingActivity.getValue("setDeleteSystem").equals("false")) {
          SetSystemValueActivity.deleteSelect(this, (String)localObject1);
        }
        if (!SettingActivity.getValue("setDeleteFile").equals("false")) {
          RecordAppFileHandler.deleteData(this, (String)localObject1);
        }
      }
      return;
      Object localObject2 = (Entry)((Iterator)localObject1).next();
      String str = (String)((Entry)localObject2).getKey();
      localObject2 = ((EditText)((Entry)localObject2).getValue()).getText().toString();
      PoseHelper008.valueMap.put(str, localObject2);
      break;
      label562:
      if (j == 2131230848)
      {
        i = 0;
        break label83;
      }
      if (j != 2131230847) {
        break label83;
      }
      i = 2;
      break label83;
      label586:
      if (j == 2131230863) {
        i = 2;
      }
    }
  }
  
  public static void setListViewHeightBasedOnChildren(ListView paramListView)
  {
    if (paramListView == null) {}
    ListAdapter localListAdapter;
    do
    {
      return;
      localListAdapter = paramListView.getAdapter();
    } while (localListAdapter == null);
    int j = 0;
    int i = 0;
    for (;;)
    {
      if (i >= localListAdapter.getCount())
      {
        localObject = paramListView.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = ((paramListView.getDividerHeight() + 1) * (localListAdapter.getCount() - 1) + j);
        paramListView.setLayoutParams((ViewGroup.LayoutParams)localObject);
        return;
      }
      Object localObject = localListAdapter.getView(i, null, paramListView);
      ((View)localObject).measure(0, 0);
      j += ((View)localObject).getMeasuredHeight();
      i += 1;
    }
  }
  
  public void chooseData(int paramInt)
  {
    Object localObject2 = (ArrayList)FileHelper.AllItemList.get(HistoryActivity.nowFileName);
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
      Object localObject3 = (Entry)((Iterator)localObject1).next();
      localObject2 = (String)((Entry)localObject3).getKey();
      localObject3 = (String)((Entry)localObject3).getValue();
      localObject2 = (EditText)this.data.get(localObject2);
      if (localObject2 != null) {
        ((EditText)localObject2).setText((CharSequence)localObject3);
      }
    }
  }
  
  public void getFromNet()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("action", "netData");
    localHashMap.putAll(StartActivity.getBaseData());
    this.progress.show();
    if ((StartActivity.functionStr.indexOf("myNet") >= 0) && (SetNetAddressActivity.isMyNetOpen()))
    {
      localHashMap.clear();
      this.netUrl = SetNetAddressActivity.getMyAddress();
      int i = 0;
      if (this.netUrl.indexOf("?") > 0) {
        i = 1;
      }
      if (i != 0) {
        break label170;
      }
    }
    label170:
    for (this.netUrl += "?imei=";; this.netUrl += "&imei=")
    {
      TelephonyManager localTelephonyManager = (TelephonyManager)getSystemService("phone");
      this.netUrl += localTelephonyManager.getDeviceId();
      this.net.postMessage(this.netUrl, localHashMap, new NetReceiver()
      {
        public void netReceive(final String paramAnonymousString)
        {
          SetDataActivity.this.runOnUiThread(new Runnable()
          {
            public void run()
            {
              SetDataActivity.this.progress.hide();
            }
          });
          if ((paramAnonymousString != null) && (paramAnonymousString.length() > 0)) {
            SetDataActivity.this.runOnUiThread(new Runnable()
            {
              public void run()
              {
                int i = 0;
                SetDataActivity.changeDataInner(SetDataActivity.this);
                for (;;)
                {
                  try
                  {
                    Object localObject1 = JSONObject.parseObject(paramAnonymousString);
                    if (((JSONObject)localObject1).get("systemMsg") != null) {
                      Toast.makeText(SetDataActivity.this, ((JSONObject)localObject1).get("systemMsg"), 0).show();
                    }
                    Object localObject2 = SetDataActivity.valueArrAll;
                    int j = localObject2.length;
                    String str1;
                    if (i >= j)
                    {
                      PoseHelper008.saveData();
                      SetDataActivity.this.updateView();
                      localObject1 = PoseHelper008.valueMap.get("getJiZhan");
                      localObject2 = PoseHelper008.valueMap.get("gps");
                      str1 = PoseHelper008.valueMap.get("location_mode");
                      SetDataActivity.this.edit_JiZhan.setText((CharSequence)localObject1);
                      SetDataActivity.this.edit_Gps.setText((CharSequence)localObject2);
                      if (str1.equals("1"))
                      {
                        ((RadioButton)SetDataActivity.this.layout.findViewById(2131230846)).setChecked(true);
                        PoseHelper008.saveData();
                      }
                    }
                    else
                    {
                      str1 = localObject2[i];
                      if (((JSONObject)localObject1).get(str1) == null) {
                        break label352;
                      }
                      String str2 = ((JSONObject)localObject1).get(str1);
                      PoseHelper008.valueMap.put(str1, str2);
                      break label352;
                    }
                    if (str1.equals("2"))
                    {
                      ((RadioButton)SetDataActivity.this.layout.findViewById(2131230847)).setChecked(true);
                      continue;
                    }
                    ((RadioButton)SetDataActivity.this.layout.findViewById(2131230848)).setChecked(true);
                  }
                  catch (Exception localException)
                  {
                    SetDataActivity.this.runOnUiThread(new Runnable()
                    {
                      public void run()
                      {
                        Toast.makeText(SetDataActivity.this, "当前不可用", 0).show();
                      }
                    });
                    return;
                  }
                  continue;
                  label352:
                  i += 1;
                }
              }
            });
          }
        }
      });
      return;
    }
  }
  
  public void getFromNet2()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("action", "netData2");
    int i = LoadActivity.a;
    int j = LoadActivity.libSign(this, i, LoadActivity.b);
    localHashMap.put("a", i);
    localHashMap.put("b", j);
    localHashMap.putAll(StartActivity.getBaseData());
    this.progress.show();
    if ((StartActivity.functionStr.indexOf("myNet") >= 0) && (SetNetAddressActivity.isMyNetOpen()))
    {
      localHashMap.clear();
      this.netUrl = SetNetAddressActivity.getMyAddress();
      i = 0;
      if (this.netUrl.indexOf("?") > 0) {
        i = 1;
      }
      if (i != 0) {
        break label229;
      }
    }
    label229:
    for (this.netUrl += "?imei=";; this.netUrl += "&imei=")
    {
      TelephonyManager localTelephonyManager = (TelephonyManager)getSystemService("phone");
      this.netUrl += localTelephonyManager.getDeviceId();
      this.net.postMessage(this.netUrl, localHashMap, new NetReceiver()
      {
        public void netReceive(final String paramAnonymousString)
        {
          SetDataActivity.this.runOnUiThread(new Runnable()
          {
            public void run()
            {
              SetDataActivity.this.progress.hide();
            }
          });
          if ((paramAnonymousString != null) && (paramAnonymousString.length() > 0))
          {
            SetDataActivity.this.runOnUiThread(new Runnable()
            {
              public void run()
              {
                SetDataActivity.changeDataInner(SetDataActivity.this);
                for (;;)
                {
                  Object localObject3;
                  String str;
                  int i;
                  try
                  {
                    localObject3 = JSONObject.parseObject(paramAnonymousString);
                    ((JSONObject)localObject3).remove("getString");
                    ((JSONObject)localObject3).remove("getString2");
                    ((JSONObject)localObject3).remove("getLine1Number");
                    ((JSONObject)localObject3).remove("getSimSerialNumber");
                    ((JSONObject)localObject3).remove("getSubscriberId");
                    ((JSONObject)localObject3).remove("getSimCountryIso");
                    ((JSONObject)localObject3).remove("getSimOperator");
                    ((JSONObject)localObject3).remove("getSimOperatorName");
                    ((JSONObject)localObject3).remove("getNetworkCountryIso");
                    ((JSONObject)localObject3).remove("getNetworkOperator");
                    ((JSONObject)localObject3).remove("getNetworkOperatorName");
                    ((JSONObject)localObject3).remove("getNetworkType");
                    ((JSONObject)localObject3).remove("getPhoneType");
                    ((JSONObject)localObject3).remove("getSimState");
                    ((JSONObject)localObject3).remove("getMacAddress");
                    ((JSONObject)localObject3).remove("getSSID");
                    ((JSONObject)localObject3).remove("getBSSID");
                    Object localObject1 = ((JSONObject)localObject3).getString("getMetrics");
                    ((JSONObject)localObject3).put("getMetrics", ((String)localObject1).subSequence(0, ((String)localObject1).indexOf(" ")));
                    localObject1 = ((JSONObject)localObject3).getString("getDeviceId");
                    String[] arrayOfString;
                    if (((String)localObject1).length() > 10)
                    {
                      str = ((String)localObject1).substring(0, 9);
                      localObject1 = SimulateDataTemp.getSimData(false);
                      if (str.toUpperCase().startsWith("A")) {
                        localObject1 = SimulateDataTemp.getSimData(true);
                      }
                      str = LoadActivity.getImei(SetDataActivity.this, LoadActivity.a, LoadActivity.b, str);
                      ((JSONObject)localObject3).put("getSubscriberId", localObject1[0]);
                      ((JSONObject)localObject3).put("getSimOperator", localObject1[1]);
                      ((JSONObject)localObject3).put("getNetworkOperatorName", localObject1[2]);
                      ((JSONObject)localObject3).put("getSimSerialNumber", localObject1[3]);
                      ((JSONObject)localObject3).put("getDeviceId", str);
                      if (((JSONObject)localObject3).get("systemMsg") != null) {
                        Toast.makeText(SetDataActivity.this, ((JSONObject)localObject3).get("systemMsg"), 0).show();
                      }
                      arrayOfString = SetDataActivity.valueArrAll;
                      int j = arrayOfString.length;
                      i = 0;
                      if (i >= j)
                      {
                        PoseHelper008.saveData();
                        SetDataActivity.this.updateView();
                        localObject1 = PoseHelper008.valueMap.get("getJiZhan");
                        str = PoseHelper008.valueMap.get("gps");
                        localObject3 = PoseHelper008.valueMap.get("location_mode");
                        SetDataActivity.this.edit_JiZhan.setText((CharSequence)localObject1);
                        SetDataActivity.this.edit_Gps.setText(str);
                        if (!((String)localObject3).equals("1")) {
                          break label622;
                        }
                        ((RadioButton)SetDataActivity.this.layout.findViewById(2131230846)).setChecked(true);
                        PoseHelper008.saveData();
                      }
                    }
                    else
                    {
                      ((JSONObject)localObject3).remove("getDeviceId");
                      continue;
                    }
                    str = arrayOfString[i];
                  }
                  catch (Exception localException)
                  {
                    SetDataActivity.this.runOnUiThread(new Runnable()
                    {
                      public void run()
                      {
                        AlertDialogHelper.showMessageDialog(SetDataActivity.this, "当前不可用");
                      }
                    });
                    return;
                  }
                  Object localObject2 = str;
                  if (str.equals("getRadioVersion")) {
                    localObject2 = "getRadioVersion1";
                  }
                  if (((String)localObject2).toUpperCase().equals(localObject2)) {
                    localObject2 = ((JSONObject)localObject3).getString(((String)localObject2).toLowerCase());
                  }
                  for (;;)
                  {
                    if ((localObject2 != null) && (((String)localObject2).trim().length() > 0))
                    {
                      PoseHelper008.valueMap.put(str, localObject2);
                      break label682;
                      localObject2 = ((JSONObject)localObject3).getString((String)localObject2);
                      continue;
                      label622:
                      if (((String)localObject3).equals("2"))
                      {
                        ((RadioButton)SetDataActivity.this.layout.findViewById(2131230847)).setChecked(true);
                        break;
                      }
                      ((RadioButton)SetDataActivity.this.layout.findViewById(2131230848)).setChecked(true);
                      break;
                    }
                  }
                  label682:
                  i += 1;
                }
              }
            });
            return;
          }
          SetDataActivity.this.runOnUiThread(new Runnable()
          {
            public void run()
            {
              AlertDialogHelper.showMessageDialog(SetDataActivity.this, "当前不可用");
            }
          });
        }
      });
      return;
    }
  }
  
  public void initView()
  {
    int i = 0;
    for (;;)
    {
      if (i >= valueArr.length) {
        return;
      }
      String str = valueArr[i];
      addTextView(valueArrName[i], valueArrName[i]);
      EditText localEditText = addEditView();
      localEditText.setText(PoseHelper008.valueMap.get(str));
      this.data.put(valueArr[i], localEditText);
      i += 1;
    }
  }
  
  public void netReceive(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    for (;;)
    {
      return;
      try
      {
        paramString = JSON.parseObject(paramString);
        new StringBuilder().append(paramString.get("time")).toString();
        new StringBuilder().append(paramString.get("id")).toString();
        new StringBuilder().append(paramString.get("overTime")).toString();
        if (!"5421254540993".equals("null"))
        {
          long l = Long.parseLong("5421254540993");
          new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(l));
          runOnUiThread(new Runnable()
          {
            public void run()
            {
              if (this.val$overTime.equals("true")) {
                SetDataActivity.this.finish();
              }
            }
          });
          return;
        }
      }
      catch (Exception E)
      {
        E.printStackTrace();
      }
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
                      this.nowRemain = false;
                      paramIntent = paramIntent.getStringExtra("getDeviceId");
                    } while (paramIntent == null);
                    paramIntent = FileHelper.getItem(HistoryActivity.nowFileName, paramIntent);
                  } while (paramIntent == null);
                  localObject1 = paramIntent.entrySet().iterator();
                  for (;;)
                  {
                    if (!((Iterator)localObject1).hasNext())
                    {
                      localObject1 = (String)paramIntent.get("getJiZhan");
                      localObject2 = (String)paramIntent.get("gps");
                      paramIntent = (String)paramIntent.get("location_mode");
                      this.edit_JiZhan.setText((CharSequence)localObject1);
                      this.edit_Gps.setText((CharSequence)localObject2);
                      if (!paramIntent.equals("1")) {
                        break;
                      }
                      ((RadioButton)this.layout.findViewById(2131230846)).setChecked(true);
                      return;
                    }
                    localObject3 = (Entry)((Iterator)localObject1).next();
                    localObject2 = (String)((Entry)localObject3).getKey();
                    localObject3 = (String)((Entry)localObject3).getValue();
                    localObject2 = (EditText)this.data.get(localObject2);
                    if (localObject2 != null) {
                      ((EditText)localObject2).setText((CharSequence)localObject3);
                    }
                  }
                  if (paramIntent.equals("2"))
                  {
                    ((RadioButton)this.layout.findViewById(2131230847)).setChecked(true);
                    return;
                  }
                  ((RadioButton)this.layout.findViewById(2131230848)).setChecked(true);
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
              this.spinnerData[2] = localObject1;
              this.modalButton.setText(this.spinnerData[2]);
              PoseHelper008.valueMap.put("file_hook_package", paramIntent);
              PoseHelper008.saveDataToFile("SetSystemValueActivity_packAge", paramIntent);
              PoseHelper008.saveDataToFile("quickToolActivity", paramIntent);
              ((ActivityManager)getSystemService("activity")).killBackgroundProcesses((String)localObject1);
              return;
              if (paramInt2 != 3) {
                break;
              }
              paramIntent = paramIntent.getStringExtra("gps");
            } while (paramIntent == null);
            PoseHelper008.valueMap.put("gps", paramIntent);
            Toast.makeText(this, "保存成功", 0).show();
            this.edit_Gps.setText(paramIntent);
            return;
            if (paramInt2 != 4) {
              break;
            }
            paramIntent = paramIntent.getStringExtra("jizhanPos");
          } while (paramIntent == null);
          PoseHelper008.valueMap.put("getJiZhan", paramIntent);
          Toast.makeText(this, "保存成功", 0).show();
          this.edit_JiZhan.setText(paramIntent);
          return;
        } while (paramInt1 != 5);
        this.nowRemain = true;
        localObject1 = paramIntent.getStringExtra("name");
        paramIntent = paramIntent.getStringExtra("progress");
      } while (localObject1 == null);
      localObject1 = (ArrayList)FileHelper.AllItemList.get(localObject1);
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
        this.edit_JiZhan.setText((CharSequence)localObject1);
        this.edit_Gps.setText((CharSequence)localObject2);
        if (!paramIntent.equals("1")) {
          break;
        }
        ((RadioButton)this.layout.findViewById(2131230846)).setChecked(true);
        return;
      }
      localObject3 = (Entry)((Iterator)localObject1).next();
      localObject2 = (String)((Entry)localObject3).getKey();
      localObject3 = (String)((Entry)localObject3).getValue();
      localObject2 = (EditText)this.data.get(localObject2);
      if (localObject2 != null) {
        ((EditText)localObject2).setText((CharSequence)localObject3);
      }
    }
    if (paramIntent.equals("2"))
    {
      ((RadioButton)this.layout.findViewById(2131230847)).setChecked(true);
      return;
    }
    ((RadioButton)this.layout.findViewById(2131230848)).setChecked(true);
  }
  
  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    if (i == 0)
    {
      PoseHelper008.saveDataToFile("008Mode", "0");
      this.modalButton.setText(this.spinnerData[0]);
    }
    do
    {
      return true;
      if (i == 1)
      {
        PoseHelper008.saveDataToFile("008Mode", "1");
        this.modalButton.setText(this.spinnerData[1]);
        return true;
      }
      if (i == 2)
      {
        paramMenuItem = new Intent();
        paramMenuItem.setClass(this, QuickFindActivity.class);
        startActivityForResult(paramMenuItem, 2);
        return true;
      }
    } while (i != 3);
    PoseHelper008.saveDataToFile("008Mode", "3");
    this.modalButton.setText(this.spinnerData[3]);
    return true;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    HistoryActivity.getFristName();
    SimulateDataTemp.init(this);
    setContentView(2130903065);
    this.view_con = ((LinearLayout)findViewById(2131230860));
    this.button_restore = ((Button)findViewById(2131230856));
    this.button_random = ((Button)findViewById(2131230857));
    this.button_history = ((Button)findViewById(2131230858));
    this.button_getFromNet = ((TextView)findViewById(2131230859));
    this.spinnerData = new String[] { "关闭", "全局", "特定应用", "全局（不包括系统，推荐！）" };
    paramBundle = LoadActivity.getProPackAge(this, LoadActivity.a, LoadActivity.b);
    if (paramBundle.length() > 0) {
      this.spinnerData[2] = paramBundle;
    }
    this.modalButton = ((Button)findViewById(2131230855));
    this.modalButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        paramAnonymousView.showContextMenu();
      }
    });
    registerForContextMenu(this.modalButton);
    Object localObject = PoseHelper008.getFileData("008Mode");
    if (((String)localObject).length() > 0)
    {
      int i = Integer.parseInt((String)localObject);
      this.modalButton.setText(this.spinnerData[i]);
      if (i == 2)
      {
        localObject = new HashMap();
        ((HashMap)localObject).put("package", paramBundle);
        ((HashMap)localObject).put("imei", TeleData.getImeiSystemFile(this));
        MobclickAgent.onEvent(this, "mode_app", (Map)localObject);
      }
    }
    this.button_history.setOnClickListener(this.listener);
    this.button_restore.setOnClickListener(this.listener);
    this.button_random.setOnClickListener(this.listener);
    this.button_getFromNet.setOnClickListener(this.listener);
    if (!StartActivity.isVip) {
      this.button_getFromNet.setVisibility(8);
    }
    this.progress = new ProgressDialog(this);
    this.progress.setMessage("正在加载数据，请稍候");
    this.progress.show();
    this.progress.setCancelable(false);
    new Thread()
    {
      public void run()
      {
        try
        {
          Thread.sleep(100L);
          PoseHelper008.initData(SetDataActivity.this);
          SetDataActivity.this.runOnUiThread(new Runnable()
          {
            public void run()
            {
              SetDataActivity.this.initView();
              Object localObject1 = (LayoutInflater)SetDataActivity.this.getSystemService("layout_inflater");
              SetDataActivity.this.layout = ((LayoutInflater)localObject1).inflate(2130903063, null);
              Object localObject2 = new LinearLayout.LayoutParams(-1, -1);
              SetDataActivity.this.view_con.addView(SetDataActivity.this.layout, (ViewGroup.LayoutParams)localObject2);
              SetDataActivity.this.edit_Gps = ((EditText)SetDataActivity.this.layout.findViewById(2131230851));
              SetDataActivity.this.edit_JiZhan = ((EditText)SetDataActivity.this.layout.findViewById(2131230849));
              SetDataActivity.this.button_setJiZhan = ((Button)SetDataActivity.this.layout.findViewById(2131230850));
              SetDataActivity.this.button_setGps = ((Button)SetDataActivity.this.layout.findViewById(2131230852));
              SetDataActivity.this.locationRadioGroup = ((RadioGroup)SetDataActivity.this.layout.findViewById(2131230845));
              SetDataActivity.this.button_setJiZhan.setEnabled(true);
              SetDataActivity.this.button_setJiZhan.setOnClickListener(SetDataActivity.this.listener);
              SetDataActivity.this.button_setGps.setOnClickListener(SetDataActivity.this.listener);
              localObject2 = PoseHelper008.valueMap.get("getJiZhan");
              SetDataActivity.this.edit_JiZhan.setText((CharSequence)localObject2);
              localObject2 = PoseHelper008.valueMap.get("gps");
              SetDataActivity.this.edit_Gps.setText((CharSequence)localObject2);
              localObject2 = PoseHelper008.valueMap.get("location_mode");
              if (((String)localObject2).equals("1"))
              {
                ((RadioButton)SetDataActivity.this.layout.findViewById(2131230846)).setChecked(true);
                SetDataActivity.this.layout_connect = ((LayoutInflater)localObject1).inflate(2130903066, null);
                localObject1 = new LinearLayout.LayoutParams(-1, -1);
                SetDataActivity.this.view_con.addView(SetDataActivity.this.layout_connect, (ViewGroup.LayoutParams)localObject1);
                SetDataActivity.this.connectRadioGroup = ((RadioGroup)SetDataActivity.this.layout_connect.findViewById(2131230861));
                localObject1 = PoseHelper008.valueMap.get("connect_mode");
                if (!StartActivity.isVip)
                {
                  SetDataActivity.this.layout_connect.findViewById(2131230862).setEnabled(false);
                  SetDataActivity.this.layout_connect.findViewById(2131230863).setEnabled(false);
                  SetDataActivity.this.layout_connect.findViewById(2131230864).setEnabled(false);
                  localObject1 = "0";
                }
                if (!((String)localObject1).equals("1")) {
                  break label673;
                }
                ((RadioButton)SetDataActivity.this.layout_connect.findViewById(2131230862)).setChecked(true);
              }
              for (;;)
              {
                SetDataActivity.this.progress.hide();
                return;
                if (((String)localObject2).equals("2"))
                {
                  ((RadioButton)SetDataActivity.this.layout.findViewById(2131230847)).setChecked(true);
                  break;
                }
                ((RadioButton)SetDataActivity.this.layout.findViewById(2131230848)).setChecked(true);
                break;
                label673:
                if (((String)localObject1).equals("2")) {
                  ((RadioButton)SetDataActivity.this.layout_connect.findViewById(2131230863)).setChecked(true);
                } else {
                  ((RadioButton)SetDataActivity.this.layout_connect.findViewById(2131230864)).setChecked(true);
                }
              }
            }
          });
          return;
        }
        catch (InterruptedException localInterruptedException)
        {
          for (;;)
          {
            localInterruptedException.printStackTrace();
          }
        }
      }
    }.start();
    getOverflowMenu();
    CheckCanUse.f.equals(f);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenuInfo paramContextMenuInfo)
  {
    paramContextMenu.setHeaderTitle("选择模式");
    paramContextMenu.add(0, 0, 0, "关闭");
    paramContextMenu.add(0, 1, 0, "全局");
    paramContextMenu.add(0, 2, 0, "单个应用");
    paramContextMenu.add(0, 3, 0, "全局（不包括系统，推荐！）");
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131165187, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    saveMessage();
    this.progress.dismiss();
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131230977)
    {
      PoseHelper008.getAllData(this);
      PoseHelper008.valueMap.put("sign", getSign(PoseHelper008.valueMap.get("getDeviceId")));
      updateView();
    }
    do
    {
      return true;
      if (paramMenuItem.getItemId() == 2131230978)
      {
        Intent I = new Intent();
        I.setClass(this, SettingActivity.class);
        startActivity(I);
        return true;
      }
      if (paramMenuItem.getItemId() == 2131230975)
      {
        showValueChooseDialog();
        return true;
      }
    } while (paramMenuItem.getItemId() != 2131230976);
    if (!StartActivity.isVip)
    {
      Toast.makeText(this, "vip才可使用", 0).show();
      return true;
    }
    Intent I  = new Intent();
    I.setClass(this, ReMainActivity.class);
    startActivityForResult(I, 5);
    return true;
  }
  
  protected void onPause()
  {
    super.onPause();
//    MobclickAgent.onPause(this);
  }
  
  protected void onResume()
  {
    super.onResume();
    if (StartActivity.systemData.size() == 0)
    {
      Intent I = new Intent();
      I.setClass(this, LoadActivity.class);
      startActivity(I);
      finish();
      return;
    }
    Object localObject = new HashMap();
    ((HashMap)localObject).put("action", "status");
    ((HashMap)localObject).putAll(StartActivity.getBaseData());
    this.net.postMessage(this.url, (HashMap)localObject, this);
    MobclickAgent.onResume(this);
  }
  
  public void showValueChooseDialog()
  {
    final String str = "nowHistoryIndex" + HistoryActivity.nowFileName;
    this.nowIndex = SharedData.getData(this, str);
    Builder localBuilder = new Builder(this);
    localBuilder.setTitle("历史记录轮询");
    ArrayList localArrayList2;
    ArrayList localArrayList1;
    if (this.nowIndex.trim().length() == 0)
    {
      localArrayList2 = (ArrayList)FileHelper.AllItemList.get(HistoryActivity.nowFileName);
      localArrayList1 = localArrayList2;
      if (localArrayList2 == null) {
        localArrayList1 = new ArrayList();
      }
      localBuilder.setMessage("当前还未开始，请点击下一步/总共" + localArrayList1.size() + "条数据");
      this.nowIndex = "0";
    }
    for (;;)
    {
      localArrayList2 = (ArrayList)FileHelper.AllItemList.get(HistoryActivity.nowFileName);
      localArrayList1 = localArrayList2;
      if (localArrayList2 == null) {
        localArrayList1 = new ArrayList();
      }
      if (localArrayList1.size() != 0) {
        break;
      }
      Toast.makeText(this, "当前没有历史记录", 0).show();
      return;
      int i = Integer.parseInt(this.nowIndex);
      localArrayList2 = (ArrayList)FileHelper.AllItemList.get(HistoryActivity.nowFileName);
      localArrayList1 = localArrayList2;
      if (localArrayList2 == null) {
        localArrayList1 = new ArrayList();
      }
      localBuilder.setMessage("当前为" + (i + 1) + "/总共" + localArrayList1.size() + "条数据");
    }
    if (Integer.parseInt(this.nowIndex) >= localArrayList1.size()) {
      this.nowIndex = "0";
    }
    localBuilder.setNegativeButton("上一条", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousInt = Integer.parseInt(SetDataActivity.this.nowIndex);
        if (paramAnonymousInt == 0)
        {
          Toast.makeText(SetDataActivity.this, "已经到了第一条", 0).show();
          return;
        }
        paramAnonymousInt -= 1;
        SharedData.setData(SetDataActivity.this, str, paramAnonymousInt);
        SetDataActivity.this.chooseData(paramAnonymousInt);
      }
    });
    localBuilder.setPositiveButton("下一条", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousInt = Integer.parseInt(SetDataActivity.this.nowIndex);
        ArrayList localArrayList = (ArrayList)FileHelper.AllItemList.get(HistoryActivity.nowFileName);
        paramAnonymousDialogInterface = localArrayList;
        if (localArrayList == null) {
          paramAnonymousDialogInterface = new ArrayList();
        }
        if (paramAnonymousInt == paramAnonymousDialogInterface.size() - 1)
        {
          Toast.makeText(SetDataActivity.this, "已经到了最后一条", 0).show();
          return;
        }
        paramAnonymousInt += 1;
        SharedData.setData(SetDataActivity.this, str, paramAnonymousInt);
        SetDataActivity.this.chooseData(paramAnonymousInt);
      }
    });
    localBuilder.setNeutralButton("第一条", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        SharedData.setData(SetDataActivity.this, str, "0");
        SetDataActivity.this.chooseData(0);
      }
    });
    localBuilder.create().show();
  }
  
  public void updateView()
  {
    String str = PoseHelper008.valueMap.get("getJiZhan");
    this.edit_JiZhan.setText(str);
    int i = 0;
    for (;;)
    {
      if (i >= valueArr.length) {
        return;
      }
      str = valueArr[i];
      EditText localEditText = (EditText)this.data.get(valueArr[i]);
      if (localEditText != null) {
        localEditText.setText(PoseHelper008.valueMap.get(str));
      }
      i += 1;
    }
  }
  
  class MyAdapter
    extends BaseAdapter
  {
    MyAdapter() {}
    
    public int getCount()
    {
      return SetDataActivity.valueArr.length;
    }
    
    public Object getItem(int paramInt)
    {
      return null;
    }
    
    public long getItemId(int paramInt)
    {
      return 0L;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = LayoutInflater.from(SetDataActivity.this).inflate(2130903064, null);
        paramView = (EditText)paramViewGroup.findViewById(2131230854);
        localObject = (TextView)paramViewGroup.findViewById(2131230853);
        ((TextView)localObject).setTextSize(10.0F);
        ViewHolder localViewHolder = new ViewHolder(SetDataActivity.this);
        localViewHolder.edit = paramView;
        localViewHolder.title = ((TextView)localObject);
        paramViewGroup.setTag(localViewHolder);
      }
      paramView = (ViewHolder)paramViewGroup.getTag();
      Object localObject = SetDataActivity.valueArr[paramInt];
      paramView.title.setText(SetDataActivity.valueArrName[paramInt]);
      paramView.edit.setText(PoseHelper008.valueMap.get(localObject));
      SetDataActivity.this.data.put(SetDataActivity.valueArr[paramInt], paramView.edit);
      return paramViewGroup;
    }
  }
  
  class ViewHolder
  {
    EditText edit;
    TextView title;
    
    ViewHolder() {}
  }
}

