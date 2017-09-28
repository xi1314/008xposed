package com.imengququ.myxposed.soft.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.lishu.jifen.db.FileHelper;
import com.lishu.net.AlertDialogHelper;
import com.lishu.net.LishuNet;
import com.lishu.net.NetReceiver;
import com.soft.apk008.HistoryActivity;
import com.soft.apk008.SetDataActivity;
import com.soft.apk008.StartActivity;
import com.soft.apk008.WebMessageActivity;
import com.soft.toos.findApp.QuickFindActivity;
import com.umeng.analytics.MobclickAgent;
import de.robv.android.xposed.mods.tutorial.CheckCanUse;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import de.robv.android.xposed.mods.tutorial.TeleData;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class QuickToolActivity
  extends Activity
{
  private Button button_changeIp;
  private Button button_clear;
  private Button button_clearSystem;
  private Button button_delete_file;
  private Button button_enter;
  private Button button_itemChange;
  private Button button_one_button;
  private Button button_productValue;
  private String c = "";
  private Spinner changeIpSpinner;
  private CheckBox check_changeIp;
  private CheckBox check_clear;
  private CheckBox check_clearSystem;
  private CheckBox check_delete;
  private CheckBox check_enterApp;
  private CheckBox check_productValue;
  private ProgressDialog dialog;
  private EditText edit_ip;
  public View.OnClickListener listener = new View.OnClickListener()
  {
    public void onClick(View View)
    {
      QuickToolActivity.this.c.length();
      if (View.equals(QuickToolActivity.this.button_changeIp))
      {
        QuickToolActivity.this.c.length();
        if (QuickToolActivity.this.changeIpSpinner.getSelectedItemPosition() == 0) {
          QuickToolActivity.this.changeMobileIp();
        }
      }
      label56:
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
                  break label56;
                  break label56;
                  break label56;
                  break label56;
                  do
                  {
                    return;
                  } while (QuickToolActivity.this.changeIpSpinner.getSelectedItemPosition() != 1);
                  QuickToolActivity.this.changeRemoteVpnIp();
                  return;
                  if (!View.equals(QuickToolActivity.this.button_clear)) {
                    break;
                  }
                  View = QuickToolActivity.this.edit_ip.getText().toString().split("_");
                } while (paramAnonymousView.length != 2);
                paramAnonymousView = paramAnonymousView[1];
                ClearApplicationDataActivity.clearData(QuickToolActivity.this, paramAnonymousView);
               Intent localObject = new Intent();
                ((Intent)localObject).setAction("com.soft.nowClear");
                ((Intent)localObject).putExtra("name", paramAnonymousView);
                QuickToolActivity.this.sendBroadcast((Intent)localObject);
                return;
                if (!View.equals(QuickToolActivity.this.button_clearSystem)) {
                  break;
                }
                paramAnonymousView = QuickToolActivity.this.edit_ip.getText().toString().split("_");
              } while (paramAnonymousView.length != 2);
              paramAnonymousView = paramAnonymousView[1];
              SetSystemValueActivity.deleteSelect(QuickToolActivity.this, paramAnonymousView);
              return;
              if (!View.equals(QuickToolActivity.this.button_delete_file)) {
                break;
              }
              paramAnonymousView = QuickToolActivity.this.edit_ip.getText().toString().split("_");
            } while (paramAnonymousView.length != 2);
            paramAnonymousView = paramAnonymousView[1];
            RecordAppFileHandler.deleteData(QuickToolActivity.this, paramAnonymousView);
            return;
            if (View.equals(QuickToolActivity.this.button_itemChange))
            {
              paramAnonymousView = new Intent();
              paramAnonymousView.setClass(QuickToolActivity.this, QuickFindActivity.class);
              QuickToolActivity.this.startActivityForResult(paramAnonymousView, 1);
              return;
            }
            if (View.equals(QuickToolActivity.this.button_one_button))
            {
              QuickToolActivity.this.oneButtonAction();
              return;
            }
            if (!View.equals(QuickToolActivity.this.button_productValue)) {
              break;
            }
            SetDataActivity.changeData(QuickToolActivity.this);
            if (QuickToolActivity.this.tool_quick_tool_getFromNet.isChecked()) {
              QuickToolActivity.this.getFromNet();
            }
          } while (!QuickToolActivity.this.tool_quick_tool_saveToHis.isChecked());
          HistoryActivity.getFristName();
          FileHelper.addOrUpdateItem(HistoryActivity.nowFileName, PoseHelper008.valueMap);
          return;
          if (!View.equals(QuickToolActivity.this.button_enter)) {
            break;
          }
          paramAnonymousView = QuickToolActivity.this.edit_ip.getText().toString().split("_");
        } while (paramAnonymousView.length != 2);
        paramAnonymousView = paramAnonymousView[1];
        Object localObject = QuickToolActivity.this.getPackageManager();
        new Intent();
        try
        {
          paramAnonymousView = ((PackageManager)localObject).getLaunchIntentForPackage(paramAnonymousView);
          QuickToolActivity.this.startActivity(intent);
          return;
        }
        catch (Exception e)
        {
          Toast.makeText(QuickToolActivity.this, "未找到该应用", 0).show();
          return;
        }
      } while (!View.equals(QuickToolActivity.this.tool_quick_tool_help));
    Intent  intent = new Intent();
     intent.setClass(QuickToolActivity.this, WebMessageActivity.class);
      intent.putExtra("url", StartActivity.baseUrl + "/phone/ContentAction.action?action=simple_quick_help");
      QuickToolActivity.this.startActivity(intent);
    }
  };
  private LishuNet net = new LishuNet();
  String netUrl = StartActivity.baseUrl + "/phone/LogicSimpleAction.action";
  private CheckBox tool_quick_tool_getFromNet;
  private Button tool_quick_tool_help;
  private CheckBox tool_quick_tool_saveToHis;
  String url = StartActivity.baseUrl + "/phone/LogicSimpleAction.action";
  private boolean wait = false;
  
  public static boolean isConnect(Context paramContext)
  {
    try
    {
     ConnectivityManager connectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (connectivityManager != null)
      {
       NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if ((networkInfo != null) && (connectivityManager.isConnected()))
        {
          paramContext = connectivityManager.getState();
          State localState = State.CONNECTED;
          if (paramContext == localState) {
            return true;
          }
        }
      }
    }
    catch (Exception e) {}
    return false;
  }
  
  private void oneButtonAction()
  {
    this.wait = false;
    Object localObject;
    if (this.check_clear.isChecked())
    {
      ClearApplicationDataActivity.clearData(this);
      localObject = this.edit_ip.getText().toString().split("_");
      if (localObject.length == 2)
      {
        localObject = localObject[1];
        ClearApplicationDataActivity.clearData(this, (String)localObject);
        Intent localIntent = new Intent();
        localIntent.setAction("com.soft.nowClear");
        localIntent.putExtra("name", (String)localObject);
        sendBroadcast(localIntent);
      }
    }
    if (this.check_clearSystem.isChecked())
    {
      localObject = this.edit_ip.getText().toString().split("_");
      if (localObject.length == 2) {
        SetSystemValueActivity.deleteSelect(this, localObject[1]);
      }
    }
    if (this.check_delete.isChecked())
    {
      localObject = this.edit_ip.getText().toString().split("_");
      if (localObject.length == 2) {
        RecordAppFileHandler.deleteData(this, localObject[1]);
      }
    }
    boolean bool;
    if (this.check_productValue.isChecked())
    {
      SetDataActivity.changeData(this);
      bool = this.tool_quick_tool_saveToHis.isChecked();
      if (this.tool_quick_tool_getFromNet.isChecked()) {
        getFromNet();
      }
      if (bool)
      {
        HistoryActivity.getFristName();
        FileHelper.addOrUpdateItem(HistoryActivity.nowFileName, PoseHelper008.valueMap);
      }
    }
    if (this.check_changeIp.isChecked())
    {
      this.dialog.show();
      this.wait = true;
      if (this.changeIpSpinner.getSelectedItemPosition() != 0) {
        break label354;
      }
      setMobileDataStatus(this, false);
      localObject = ((ConnectivityManager)getSystemService("connectivity")).getActiveNetworkInfo();
    }
    for (;;)
    {
      if (!isConnect(this))
      {
        setMobileDataStatus(this, true);
        new Thread()
        {
          public void run()
          {
            for (;;)
            {
              if (QuickToolActivity.isConnect(QuickToolActivity.this))
              {
                QuickToolActivity.this.wait = false;
                QuickToolActivity.this.runOnUiThread(new Runnable()
                {
                  public void run()
                  {
                    QuickToolActivity.this.dialog.hide();
                  }
                });
                return;
              }
              try
              {
                Thread.sleep(100L);
              }
              catch (InterruptedException localInterruptedException)
              {
                localInterruptedException.printStackTrace();
              }
            }
          }
        }.start();
        if (!this.check_enterApp.isChecked()) {}
      }
      try
      {
        Thread.sleep(1500L);
        new Thread()
        {
          public void run()
          {
            while (QuickToolActivity.this.wait) {}
            QuickToolActivity.this.runOnUiThread(new Runnable()
            {
              public void run()
              {
                Object localObject = QuickToolActivity.this.edit_ip.getText().toString().split("_");
                PackageManager localPackageManager;
                if (localObject.length == 2)
                {
                  localObject = localObject[1];
                  localPackageManager = QuickToolActivity.this.getPackageManager();
                  new Intent();
                }
                try
                {
                  localObject = localPackageManager.getLaunchIntentForPackage((String)localObject);
                  QuickToolActivity.this.startActivity((Intent)localObject);
                  return;
                }
                catch (Exception localException)
                {
                  Toast.makeText(QuickToolActivity.this, "未找到该应用", 0).show();
                }
              }
            });
          }
        }.start();
        return;
        try
        {
          Thread.sleep(100L);
          bool = ((NetworkInfo)localObject).getTypeName().toLowerCase().equals("wifi");
          if (!bool) {
            continue;
          }
        }
        catch (InterruptedException localInterruptedException2)
        {
          localInterruptedException2.printStackTrace();
        }
        continue;
        label354:
        new Thread()
        {
          public void run()
          {
            if (RemoteVpnActivity.changeNet(QuickToolActivity.this)) {
              for (;;)
              {
                if (RemoteVpnActivity.ok)
                {
                  QuickToolActivity.this.runOnUiThread(new Runnable()
                  {
                    public void run()
                    {
                      QuickToolActivity.this.dialog.hide();
                    }
                  });
                  QuickToolActivity.this.wait = false;
                  return;
                }
                try
                {
                  Thread.sleep(100L);
                  if (RemoteVpnActivity.error) {
                    AlertDialogHelper.showMessageDialog(QuickToolActivity.this, "连接已经断开");
                  }
                }
                catch (InterruptedException localInterruptedException)
                {
                  for (;;)
                  {
                    localInterruptedException.printStackTrace();
                  }
                }
              }
            }
            QuickToolActivity.this.runOnUiThread(new Runnable()
            {
              public void run()
              {
                QuickToolActivity.this.dialog.hide();
              }
            });
          }
        }.start();
      }
      catch (InterruptedException localInterruptedException1)
      {
        for (;;)
        {
          localInterruptedException1.printStackTrace();
        }
      }
    }
  }
  
  protected void changeMobileIp()
  {
    this.dialog.show();
    setMobileDataStatus(this, false);
    try
    {
      Thread.sleep(2000L);
      setMobileDataStatus(this, true);
      new Thread()
      {
        public void run()
        {
          for (;;)
          {
            if (QuickToolActivity.isConnect(QuickToolActivity.this))
            {
              QuickToolActivity.this.runOnUiThread(new Runnable()
              {
                public void run()
                {
                  QuickToolActivity.this.dialog.hide();
                }
              });
              return;
            }
            try
            {
              Thread.sleep(100L);
            }
            catch (InterruptedException localInterruptedException)
            {
              localInterruptedException.printStackTrace();
            }
          }
        }
      }.start();
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
  
  protected void changeRemoteVpnIp()
  {
    this.dialog.show();
    new Thread()
    {
      public void run()
      {
        if (!RemoteVpnActivity.changeNet(QuickToolActivity.this))
        {
          QuickToolActivity.this.runOnUiThread(new Runnable()
          {
            public void run()
            {
              QuickToolActivity.this.dialog.hide();
            }
          });
          return;
        }
        for (;;)
        {
          try
          {
            Thread.sleep(100L);
            if (RemoteVpnActivity.error)
            {
              AlertDialogHelper.showMessageDialog(QuickToolActivity.this, "网络连接断开");
              QuickToolActivity.this.runOnUiThread(new Runnable()
              {
                public void run()
                {
                  QuickToolActivity.this.dialog.hide();
                }
              });
              return;
            }
          }
          catch (InterruptedException localInterruptedException)
          {
            localInterruptedException.printStackTrace();
            continue;
          }
          if (!RemoteVpnActivity.ok) {}
        }
      }
    }.start();
  }
  
  public void getFromNet()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("action", "netData");
    localHashMap.putAll(StartActivity.getBaseData());
    this.dialog.show();
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
          QuickToolActivity.this.runOnUiThread(new Runnable()
          {
            public void run()
            {
              QuickToolActivity.this.dialog.hide();
            }
          });
          if ((paramAnonymousString != null) && (paramAnonymousString.length() > 0))
          {
            QuickToolActivity.this.runOnUiThread(new Runnable()
            {
              public void run()
              {
                int i = 0;
                SetDataActivity.changeData(QuickToolActivity.this);
                try
                {
                  JSONObject localJSONObject = JSONObject.parseObject(paramAnonymousString);
                  if (localJSONObject.get("systemMsg") != null) {
                    Toast.makeText(QuickToolActivity.this, localJSONObject.get("systemMsg"), 0).show();
                  }
                  String[] arrayOfString = SetDataActivity.valueArrAll;
                  int j = arrayOfString.length;
                  for (;;)
                  {
                    if (i >= j)
                    {
                      PoseHelper008.saveData();
                      return;
                    }
                    String str1 = arrayOfString[i];
                    if (localJSONObject.get(str1) != null)
                    {
                      String str2 = localJSONObject.get(str1);
                      PoseHelper008.valueMap.put(str1, str2);
                    }
                    i += 1;
                  }
                  return;
                }
                catch (Exception localException)
                {
                  QuickToolActivity.this.runOnUiThread(new Runnable()
                  {
                    public void run()
                    {
                      Toast.makeText(QuickToolActivity.this, "当前不可用", 0).show();
                    }
                  });
                }
              }
            });
            return;
          }
          QuickToolActivity.this.runOnUiThread(new Runnable()
          {
            public void run()
            {
              Toast.makeText(QuickToolActivity.this, "当前不可用", 0).show();
            }
          });
        }
      });
      return;
    }
  }
  
  public void init()
  {
    Object localObject = PoseHelper008.getFileData("QuickToolActivity_check");
    if (((String)localObject).trim().length() == 0) {}
    for (;;)
    {
      return;
      try
      {
        localObject = JSONObject.parseObject((String)localObject);
        if ("true".equals(((JSONObject)localObject).get("check_clear"))) {
          this.check_clear.setChecked(true);
        }
        if ("true".equals(((JSONObject)localObject).get("check_clearSystem"))) {
          this.check_clearSystem.setChecked(true);
        }
        if ("true".equals(((JSONObject)localObject).get("check_delete"))) {
          this.check_delete.setChecked(true);
        }
        if ("true".equals(((JSONObject)localObject).get("check_productValue"))) {
          this.check_productValue.setChecked(true);
        }
        if ("true".equals(((JSONObject)localObject).get("check_changeIp"))) {
          this.check_changeIp.setChecked(true);
        }
        if ("true".equals(((JSONObject)localObject).get("check_enterApp"))) {
          this.check_enterApp.setChecked(true);
        }
        if ("true".equals(((JSONObject)localObject).get("tool_quick_tool_saveToHis"))) {
          this.tool_quick_tool_saveToHis.setChecked(true);
        }
        if ("true".equals(((JSONObject)localObject).get("tool_quick_tool_getFromNet"))) {
          this.tool_quick_tool_getFromNet.setChecked(true);
        }
        if (((JSONObject)localObject).get("tool_quick_tool_ip_spinner") != null)
        {
          this.changeIpSpinner.setSelection(((JSONObject)localObject).getIntValue("tool_quick_tool_ip_spinner"));
          return;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 != 1) || (paramIntent == null)) {
      return;
    }
    paramIntent = paramIntent.getStringExtra("packageName");
    PoseHelper008.saveDataToFile("quickToolActivity", paramIntent);
    this.edit_ip.setText(paramIntent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903079);
    this.button_changeIp = ((Button)findViewById(2131230905));
    this.button_clear = ((Button)findViewById(2131230896));
    this.button_clearSystem = ((Button)findViewById(2131230900));
    this.button_delete_file = ((Button)findViewById(2131230898));
    this.button_one_button = ((Button)findViewById(2131230910));
    this.button_productValue = ((Button)findViewById(2131230903));
    this.button_itemChange = ((Button)findViewById(2131230894));
    this.button_enter = ((Button)findViewById(2131230909));
    this.edit_ip = ((EditText)findViewById(2131230893));
    this.check_changeIp = ((CheckBox)findViewById(2131230904));
    this.changeIpSpinner = ((Spinner)findViewById(2131230906));
    this.check_clear = ((CheckBox)findViewById(2131230895));
    this.check_clearSystem = ((CheckBox)findViewById(2131230899));
    this.check_delete = ((CheckBox)findViewById(2131230897));
    this.check_productValue = ((CheckBox)findViewById(2131230902));
    this.check_enterApp = ((CheckBox)findViewById(2131230908));
    this.tool_quick_tool_help = ((Button)findViewById(2131230913));
    this.tool_quick_tool_saveToHis = ((CheckBox)findViewById(2131230911));
    this.tool_quick_tool_getFromNet = ((CheckBox)findViewById(2131230912));
    this.button_delete_file.setOnClickListener(this.listener);
    this.button_changeIp.setOnClickListener(this.listener);
    this.button_clear.setOnClickListener(this.listener);
    this.button_clearSystem.setOnClickListener(this.listener);
    this.button_one_button.setOnClickListener(this.listener);
    this.button_productValue.setOnClickListener(this.listener);
    this.button_itemChange.setOnClickListener(this.listener);
    this.button_enter.setOnClickListener(this.listener);
    this.tool_quick_tool_help.setOnClickListener(this.listener);
    paramBundle = PoseHelper008.getFileData("quickToolActivity");
    this.edit_ip.setText(paramBundle);
    this.edit_ip.clearFocus();
    this.dialog = new ProgressDialog(this);
    this.dialog.setMessage("等待数据恢复");
    this.dialog.setCancelable(false);
    this.dialog.show();
    this.dialog.hide();
    this.dialog.setButton("取消", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        QuickToolActivity.this.dialog.hide();
      }
    });
    int i = 0;
    for (;;)
    {
      if (i >= CheckCanUse.c.length())
      {
        Object localObject = new String[2];
        localObject[0] = "切换数据流量ip";
        localObject[1] = "切换远程vpn";
        this.changeIpSpinner.setAdapter(new ArrayAdapter(this, 17367048, (Object[])localObject));
        init();
        this.button_changeIp.setText(localObject[this.changeIpSpinner.getSelectedItemPosition()]);
        this.changeIpSpinner.setOnItemSelectedListener(new OnItemSelectedListener()
        {
          public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            QuickToolActivity.this.button_changeIp.setText(this.val$data[QuickToolActivity.this.changeIpSpinner.getSelectedItemPosition()]);
          }
          
          public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView) {}
        });
        localObject = new HashMap();
        ((HashMap)localObject).put("app", paramBundle);
        ((HashMap)localObject).put("imei", TeleData.getImeiSystemFile(this));
        MobclickAgent.onEvent(this, "quick_tool", (Map)localObject);
        return;
      }
      this.c += SetDataActivity.u.length();
      i += 1;
    }
  }
  
  protected void onDestroy()
  {
    JSONObject localJSONObject = new JSONObject();
    if (this.check_clear.isChecked())
    {
      localJSONObject.put("check_clear", "true");
      if (!this.check_clearSystem.isChecked()) {
        break label223;
      }
      localJSONObject.put("check_clearSystem", "true");
      label50:
      if (!this.check_delete.isChecked()) {
        break label237;
      }
      localJSONObject.put("check_delete", "true");
      label71:
      if (!this.check_productValue.isChecked()) {
        break label251;
      }
      localJSONObject.put("check_productValue", "true");
      label92:
      if (!this.check_changeIp.isChecked()) {
        break label265;
      }
      localJSONObject.put("check_changeIp", "true");
      label113:
      if (!this.check_enterApp.isChecked()) {
        break label279;
      }
      localJSONObject.put("check_enterApp", "true");
      label134:
      if (!this.tool_quick_tool_saveToHis.isChecked()) {
        break label293;
      }
      localJSONObject.put("tool_quick_tool_saveToHis", "true");
    }
    for (;;)
    {
      if (this.tool_quick_tool_getFromNet.isChecked()) {
        localJSONObject.put("tool_quick_tool_getFromNet", "true");
      }
      localJSONObject.put("tool_quick_tool_ip_spinner", Integer.valueOf(this.changeIpSpinner.getSelectedItemPosition()));
      PoseHelper008.saveDataToFile("QuickToolActivity_check", localJSONObject.toJSONString());
      super.onDestroy();
      return;
      localJSONObject.put("check_clear", "false");
      break;
      label223:
      localJSONObject.put("check_clearSystem", "false");
      break label50;
      label237:
      localJSONObject.put("check_delete", "false");
      break label71;
      label251:
      localJSONObject.put("check_productValue", "false");
      break label92;
      label265:
      localJSONObject.put("check_changeIp", "false");
      break label113;
      label279:
      localJSONObject.put("check_enterApp", "false");
      break label134;
      label293:
      localJSONObject.put("tool_quick_tool_saveToHis", "false");
    }
  }
  
  protected void onPause()
  {
    MobclickAgent.onPause(this);
    super.onPause();
  }
  
  protected void onResume()
  {
    MobclickAgent.onResume(this);
    super.onResume();
  }
  
  public void setMobileDataStatus(Context paramContext, boolean paramBoolean)
  {
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    try
    {
      Object localObject = Class.forName(paramContext.getClass().getName()).getDeclaredField("mService");
      ((Field)localObject).setAccessible(true);
      paramContext = ((Field)localObject).get(paramContext);
      localObject = Class.forName(paramContext.getClass().getName()).getDeclaredMethod("setMobileDataEnabled", new Class[] { Boolean.TYPE });
      ((Method)localObject).setAccessible(true);
      ((Method)localObject).invoke(paramContext, new Object[] { Boolean.valueOf(paramBoolean) });
      return;
    }
    catch (ClassNotFoundException paramContext)
    {
      paramContext.printStackTrace();
      return;
    }
    catch (NoSuchFieldException paramContext)
    {
      paramContext.printStackTrace();
      return;
    }
    catch (SecurityException paramContext)
    {
      paramContext.printStackTrace();
      return;
    }
    catch (NoSuchMethodException paramContext)
    {
      paramContext.printStackTrace();
      return;
    }
    catch (IllegalArgumentException paramContext)
    {
      paramContext.printStackTrace();
      return;
    }
    catch (IllegalAccessException paramContext)
    {
      paramContext.printStackTrace();
      return;
    }
    catch (InvocationTargetException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     QuickToolActivity

 * JD-Core Version:    0.7.0.1

 */