package com.lishu.levitate;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Application;
import android.app.ProgressDialog;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import com.lishu.c.r;
import com.lishu.c.w;
import com.soft.apk008.LoadActivity;
import com.soft.apk008.SettingActivity;
import com.soft.apk008.StartActivity;
import com.soft.tools.SelectManuActivity;
import com.soft.tools.SetNetAddressActivity;
import java.util.ArrayList;
import java.util.HashMap;

public final class a
{
  private static r o = new r();
  AlertDialog a = null;
  AlertDialog b = null;
  String c = StartActivity.b + "/phone/LogicSimpleAction.action";
  private Button d;
  private Button e;
  private Button f;
  private Button g;
  private Application h;
  private com.lishu.c.p i = new com.lishu.c.p();
  private View.OnClickListener j = new b(this);
  private ArrayList k = new ArrayList();
  private Handler l = new g(this);
  private boolean m = false;
  private int n = 0;
  
  public a(Application paramApplication)
  {
    this.h = paramApplication;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramApplication);
    LinearLayout localLinearLayout = (LinearLayout)LayoutInflater.from(paramApplication).inflate(R.layout.install_exposed, null);
    localBuilder.setView(localLinearLayout);
    this.d = ((Button)localLinearLayout.findViewById(2131361802));
    this.e = ((Button)localLinearLayout.findViewById(2131361803));
    this.f = ((Button)localLinearLayout.findViewById(2131361804));
    this.g = ((Button)localLinearLayout.findViewById(2131361805));
    this.d.setOnClickListener(this.j);
    this.e.setOnClickListener(this.j);
    this.f.setOnClickListener(this.j);
    this.g.setOnClickListener(this.j);
    this.b = new ProgressDialog(paramApplication);
    this.b.setMessage("等待数据恢复");
    this.b.getWindow().setType(2003);
    this.b.setCancelable(false);
    this.b.show();
    this.b.hide();
    this.a = localBuilder.create();
    this.a.getWindow().setType(2003);
    this.a.show();
  }
  
  public final void a()
  {
    this.c = (StartActivity.b + "/phone/LogicSimpleAction.action");
    this.n = 0;
    HashMap localHashMap = new HashMap();
    localHashMap.put("action", "netData2");
    int i1 = LoadActivity.a;
    int i2 = LoadActivity.libSign(this.h, i1, LoadActivity.b);
    localHashMap.put("verCode", StartActivity.c(this.h));
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
        k localk;
        localException.printStackTrace();
      }
    }
    localHashMap.putAll(StartActivity.b());
    localHashMap.put("MANUFACTURER", SelectManuActivity.a());
    this.b.show();
    this.c = (StartActivity.b + "/phone/LogicSimpleAction.action");
    localk = new k(this);
    this.i.a(this.c, localHashMap, localk);
  }
  
  public final void a(Runnable paramRunnable)
  {
    this.k.add(paramRunnable);
    this.l.sendEmptyMessage(paramRunnable.hashCode());
  }
  
  public final void a(boolean paramBoolean)
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
      Object localObject = (TelephonyManager)this.h.getSystemService("phone");
      this.c += ((TelephonyManager)localObject).getDeviceId();
      localObject = new p(this, paramBoolean);
      o.a(this.c, localHashMap, (w)localObject);
      return;
    }
  }
}

