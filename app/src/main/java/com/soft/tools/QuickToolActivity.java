package com.soft.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.a.a.Map;
import com.lishu.c.p;
import com.lishu.c.r;
import com.lishu.c.w;
import com.soft.apk008.HistoryActivity;
import com.soft.apk008.LoadActivity;
import com.soft.apk008.SetMessageActivity;
import com.soft.apk008.SettingActivity;
import com.soft.apk008.StartActivity;
import com.umeng.analytics.MobclickAgent;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class QuickToolActivity
  extends Activity
{
  private static r C = new r();
  private boolean A = false;
  private int B = 0;
  public View.OnClickListener a = new ck(this);
  String b = StartActivity.b + "/phone/LogicSimpleAction.action";
  String c = StartActivity.b + "/phone/LogicSimpleAction.action";
  private Button d;
  private Button e;
  private Button f;
  private Button g;
  private Button h;
  private Button i;
  private Button j;
  private EditText k;
  private Button l;
  private ProgressDialog m;
  private CheckBox n;
  private CheckBox o;
  private CheckBox p;
  private CheckBox q;
  private CheckBox r;
  private CheckBox s;
  private Button t;
  private CheckBox u;
  private CheckBox v;
  private p w = new p();
  private Spinner x;
  private String y = "";
  private dj z;
  
  private static void a(Context paramContext, boolean paramBoolean)
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
  
  public static boolean a(Context paramContext)
  {
    try
    {
      paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (paramContext != null)
      {
        paramContext = paramContext.getActiveNetworkInfo();
        if ((paramContext != null) && (paramContext.isConnected()))
        {
          paramContext = paramContext.getState();
          NetworkInfo.State localState = NetworkInfo.State.CONNECTED;
          if (paramContext == localState) {
            return true;
          }
        }
      }
    }
    catch (Exception paramContext) {}
    return false;
  }
  
  protected final void a()
  {
    this.m.show();
    a(this, false);
    try
    {
      Thread.sleep(2000L);
      a(this, true);
      new de(this).start();
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
  
  public final void a(boolean paramBoolean)
  {
    this.c = (StartActivity.b + "/phone/LogicSimpleAction.action");
    this.B = 0;
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
        cl localcl;
        localException.printStackTrace();
      }
    }
    localHashMap.putAll(StartActivity.b());
    localHashMap.put("MANUFACTURER", SelectManuActivity.a());
    this.m.show();
    this.c = (StartActivity.b + "/phone/LogicSimpleAction.action");
    localcl = new cl(this, paramBoolean);
    this.w.a(this.c, localHashMap, localcl);
  }
  
  protected final void b()
  {
    this.m.show();
    new dg(this).start();
  }
  
  public final void b(boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    this.c = SetNetAddressActivity.c();
    int i1 = 0;
    if (this.c.indexOf("?") > 0) {
      i1 = 1;
    }
    if (i1 == 0) {}
    for (this.c += "?imei=";; this.c += "&imei=")
    {
      Object localObject = (TelephonyManager)getSystemService("phone");
      this.c += ((TelephonyManager)localObject).getDeviceId();
      localObject = new cq(this, paramBoolean);
      C.a(this.c, localHashMap, (w)localObject);
      return;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1) {
      if (paramIntent != null) {}
    }
    Object localObject1;
    Object localObject2;
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
                localObject1 = paramIntent.getStringExtra("packageName");
                PoseHelper008.saveDataToFile("quickToolActivity", (String)localObject1);
                this.k.setText((CharSequence)localObject1);
                localObject1 = this.z;
              } while (paramIntent == null);
              if (paramInt1 != 2) {
                break;
              }
              paramIntent = paramIntent.getStringExtra("getDeviceId");
            } while (paramIntent == null);
            paramIntent = a.b(HistoryActivity.a, paramIntent);
          } while (paramIntent == null);
          paramIntent = paramIntent.entrySet().iterator();
          for (;;)
          {
            if (!paramIntent.hasNext())
            {
              PoseHelper008.saveData();
              Toast.makeText(this, "设置数据:" + PoseHelper008.valueMap.getStringfrommap("getDeviceId") + "成功", 0).show();
              return;
            }
            localObject2 = (Map.Entry)paramIntent.next();
            localObject1 = (String)((Map.Entry)localObject2).getKey();
            localObject2 = (String)((Map.Entry)localObject2).getValue();
            PoseHelper008.valueMap.putkey((String)localObject1, localObject2);
          }
        } while (paramInt1 != 3);
        localObject1 = paramIntent.getStringExtra("name");
        paramIntent = paramIntent.getStringExtra("progress");
      } while (localObject1 == null);
      localObject1 = (ArrayList)a.a.get(localObject1);
      if (localObject1 == null)
      {
        Toast.makeText(this, "请检查历史记录是否已经被重命名，如果重命名请删除留存控制中的相关项", 1).show();
        return;
      }
      paramIntent = (HashMap)((ArrayList)localObject1).get(Integer.parseInt(paramIntent) - 1);
    } while (paramIntent == null);
    paramIntent = paramIntent.entrySet().iterator();
    for (;;)
    {
      if (!paramIntent.hasNext())
      {
        PoseHelper008.saveData();
        Toast.makeText(this, "设置数据:" + PoseHelper008.valueMap.getStringfrommap("getDeviceId") + "成功", 0).show();
        return;
      }
      localObject2 = (Map.Entry)paramIntent.next();
      localObject1 = (String)((Map.Entry)localObject2).getKey();
      localObject2 = (String)((Map.Entry)localObject2).getValue();
      PoseHelper008.valueMap.putkey((String)localObject1, localObject2);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903111);
    this.d = ((Button)findViewById(2131362143));
    this.e = ((Button)findViewById(2131362135));
    this.f = ((Button)findViewById(2131362139));
    this.g = ((Button)findViewById(2131362137));
    this.h = ((Button)findViewById(2131362148));
    this.i = ((Button)findViewById(2131362141));
    this.j = ((Button)findViewById(2131362133));
    this.l = ((Button)findViewById(2131362147));
    this.k = ((EditText)findViewById(2131362132));
    this.z = new dj();
    this.z.a(this);
    this.n = ((CheckBox)findViewById(2131362142));
    this.x = ((Spinner)findViewById(2131362144));
    this.o = ((CheckBox)findViewById(2131362134));
    this.p = ((CheckBox)findViewById(2131362138));
    this.q = ((CheckBox)findViewById(2131362136));
    this.r = ((CheckBox)findViewById(2131362140));
    this.s = ((CheckBox)findViewById(2131362146));
    this.t = ((Button)findViewById(2131362157));
    this.u = ((CheckBox)findViewById(2131362155));
    this.v = ((CheckBox)findViewById(2131362156));
    this.g.setOnClickListener(this.a);
    this.d.setOnClickListener(this.a);
    this.e.setOnClickListener(this.a);
    this.f.setOnClickListener(this.a);
    this.h.setOnClickListener(this.a);
    this.i.setOnClickListener(this.a);
    this.j.setOnClickListener(this.a);
    this.l.setOnClickListener(this.a);
    this.t.setOnClickListener(this.a);
    paramBundle = PoseHelper008.getFileData("quickToolActivity");
    this.k.setText(paramBundle);
    this.k.clearFocus();
    this.m = new ProgressDialog(this);
    this.m.setMessage("等待数据恢复");
    this.m.setCancelable(false);
    this.m.show();
    this.m.hide();
    this.m.setButton("取消", new cv(this));
    int i1 = 0;
    for (;;)
    {
      Object localObject2;
      if (i1 >= d.d.length())
      {
        localObject1 = new String[2];
        localObject1[0] = "切换数据流量ip";
        localObject1[1] = "切换远程vpn";
        this.x.setAdapter(new ArrayAdapter(this, 17367048, (Object[])localObject1));
        localObject2 = PoseHelper008.getFileData("QuickToolActivity_check");
        if (((String)localObject2).trim().length() == 0) {}
      }
      try
      {
        localObject2 = e.b((String)localObject2);
        if ("true".equals(((Map)localObject2).get("check_clear"))) {
          this.o.setChecked(true);
        }
        if ("true".equals(((Map)localObject2).get("check_clearSystem"))) {
          this.p.setChecked(true);
        }
        if ("true".equals(((Map)localObject2).get("check_delete"))) {
          this.q.setChecked(true);
        }
        if ("true".equals(((Map)localObject2).get("check_productValue"))) {
          this.r.setChecked(true);
        }
        if ("true".equals(((Map)localObject2).get("check_changeIp"))) {
          this.n.setChecked(true);
        }
        if ("true".equals(((Map)localObject2).get("check_enterApp"))) {
          this.s.setChecked(true);
        }
        if ("true".equals(((Map)localObject2).get("tool_quick_tool_saveToHis"))) {
          this.u.setChecked(true);
        }
        if ("true".equals(((Map)localObject2).get("tool_quick_tool_getFromNet"))) {
          this.v.setChecked(true);
        }
        if (((Map)localObject2).get("tool_quick_tool_ip_spinner") != null) {
          this.x.setSelection(((Map)localObject2).h("tool_quick_tool_ip_spinner"));
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localException.printStackTrace();
        }
      }
      this.d.setText(localObject1[this.x.getSelectedItemPosition()]);
      this.x.setOnItemSelectedListener(new cw(this, (String[])localObject1));
      Object localObject1 = new HashMap();
      ((HashMap)localObject1).put("app", paramBundle);
      ((HashMap)localObject1).put("imei", (String)StartActivity.g.get("imei"));
      MobclickAgent.a(this, "quick_tool", (HashMap)localObject1);
      return;
      this.y += SetMessageActivity.h.length();
      i1 += 1;
    }
  }
  
  protected void onDestroy()
  {
    Map locale = new Map();
    if (this.o.isChecked())
    {
      locale.putkey("check_clear", "true");
      if (!this.p.isChecked()) {
        break label224;
      }
      locale.putkey("check_clearSystem", "true");
      label50:
      if (!this.q.isChecked()) {
        break label238;
      }
      locale.putkey("check_delete", "true");
      label71:
      if (!this.r.isChecked()) {
        break label252;
      }
      locale.putkey("check_productValue", "true");
      label92:
      if (!this.n.isChecked()) {
        break label266;
      }
      locale.putkey("check_changeIp", "true");
      label113:
      if (!this.s.isChecked()) {
        break label280;
      }
      locale.putkey("check_enterApp", "true");
      label134:
      if (!this.u.isChecked()) {
        break label294;
      }
      locale.putkey("tool_quick_tool_saveToHis", "true");
    }
    for (;;)
    {
      if (this.v.isChecked()) {
        locale.putkey("tool_quick_tool_getFromNet", "true");
      }
      locale.putkey("tool_quick_tool_ip_spinner", Integer.valueOf(this.x.getSelectedItemPosition()));
      PoseHelper008.saveDataToFile("QuickToolActivity_check", locale.a());
      super.onDestroy();
      return;
      locale.putkey("check_clear", "false");
      break;
      label224:
      locale.putkey("check_clearSystem", "false");
      break label50;
      label238:
      locale.putkey("check_delete", "false");
      break label71;
      label252:
      locale.putkey("check_productValue", "false");
      break label92;
      label266:
      locale.putkey("check_changeIp", "false");
      break label113;
      label280:
      locale.putkey("check_enterApp", "false");
      break label134;
      label294:
      locale.putkey("tool_quick_tool_saveToHis", "false");
    }
  }
  
  protected void onPause()
  {
    MobclickAgent.a(this);
    super.onPause();
  }
  
  protected void onResume()
  {
    MobclickAgent.b(this);
    super.onResume();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.QuickToolActivity

 * JD-Core Version:    0.7.0.1

 */