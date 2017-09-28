package com.soft.apk008;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.a.a.Map;
import com.data.simulate.SimulateDataTest;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class SettingActivity
  extends Activity
{
  static Boolean islog = null;
  public static Map b;
  private CheckBox A;
  private CheckBox B;
  private CheckBox C;
  private CheckBox D;
  private CheckBox E;
  private Spinner F;
  private CheckBox G;
  private CheckBox H;
  private CheckBox I;
  private EditText c;
  private CheckBox d;
  private CheckBox e;
  private CheckBox f;
  private EditText g;
  private CheckBox h;
  private CheckBox i;
  private CheckBox j;
  private CheckBox k;
  private CheckBox l;
  private CheckBox m;
  private CheckBox n;
  private CheckBox o;
  private CheckBox p;
  private CheckBox q;
  private CheckBox r;
  private CheckBox s;
  private CheckBox t;
  private Spinner u;
  private Spinner v;
  private CheckBox w;
  private String[] x;
  private CheckBox y;
  private CheckBox z;
  
  public static int a()
  {
    String str = a("set_operator_spinner");
    if ((str != null) && (str.length() != 0)) {
      return Integer.parseInt(str);
    }
    return 0;
  }
  
  public static String a(String paramString)
  {
    if (b == null) {}
    try
    {
      b = islog.b(PoseHelper008.getFileData("settings"));
      if (b == null) {
        b = new Map();
      }
      if (b.get(paramString) == null) {
        return "";
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
    return b.get(paramString);
  }
  
  public static boolean islog()
  {
    if (islog == null) {
      if (!"true".equals(a("logCheck"))) {
        break label33;
      }
    }
    label33:
    for (islog = Boolean.valueOf(true);; islog = Boolean.valueOf(false)) {
      return islog.booleanValue();
    }
  }
  
  private void c()
  {
    i2 = 0;
    String str = a("imeiHead");
    this.c.setText(str);
    if (a("imeiCheck").equals("false"))
    {
      this.e.setChecked(false);
      if (!a("logCheck").equals("true")) {
        break label770;
      }
      this.d.setChecked(true);
      label58:
      if (!a("imsiCheck").equals("false")) {
        break label781;
      }
      this.f.setChecked(false);
      label79:
      str = a("imsiHead");
      this.g.setText(str);
      if (!a("modalCheck").equals("false")) {
        break label792;
      }
      this.h.setChecked(false);
      label114:
      str = a("set_operator_spinner");
      if ((str != null) && (str.length() != 0))
      {
        i1 = Integer.parseInt(str);
        this.F.setSelection(i1);
      }
      if (!a("sdkCheck").equals("false")) {
        break label803;
      }
      this.i.setChecked(false);
      label165:
      if (!a("clearAppCheck").equals("false")) {
        break label814;
      }
      this.j.setChecked(false);
      label186:
      if (!a("setCloseCheck").equals("false")) {
        break label825;
      }
      this.k.setChecked(false);
      label207:
      if (!a("setScan").equals("false")) {
        break label836;
      }
      this.m.setChecked(false);
      label228:
      if (!a("setDisplay").equals("false")) {
        break label847;
      }
      this.n.setChecked(false);
      label249:
      if (!a("setImei14").equals("true")) {
        break label858;
      }
      this.o.setChecked(true);
      label270:
      if (!a("setOpenMac").equals("false")) {
        break label869;
      }
      this.p.setChecked(false);
      label291:
      if (!a("setOpenIp").equals("true")) {
        break label880;
      }
      this.C.setChecked(true);
      label312:
      if (!a("setUserAgent").equals("true")) {
        break label891;
      }
      this.z.setChecked(true);
      label333:
      if (!a("Build.TIME").equals("true")) {
        break label902;
      }
      this.A.setChecked(true);
      label354:
      if (!a("setJizhanCheck").equals("false")) {
        break label913;
      }
      this.l.setChecked(false);
      label375:
      if (!a("setCard").equals("true")) {
        break label924;
      }
      this.q.setChecked(true);
      label396:
      if (!StartActivity.f)
      {
        this.q.setEnabled(false);
        this.q.setChecked(false);
      }
      if (a("setDeleteFile").equals("false")) {
        break label935;
      }
      this.r.setChecked(true);
      label439:
      if (a("saveToHistory").equals("false")) {
        break label946;
      }
      this.y.setChecked(true);
      label460:
      if (a("setDeleteSystem").equals("false")) {
        break label957;
      }
      this.s.setChecked(true);
      label481:
      if (!a("setUserMyDB").equals("true")) {
        break label968;
      }
      this.t.setChecked(true);
      label502:
      if (!a("setSdkInt").equals("true")) {
        break label979;
      }
      this.w.setChecked(true);
      label523:
      if (!a("set_getProp").equals("true")) {
        break label990;
      }
      this.B.setChecked(true);
      label544:
      if (!a("set_dhcp").equals("false")) {
        break label1001;
      }
      this.E.setChecked(false);
      label566:
      if (!a("setMockLocation").equals("true")) {
        break label1012;
      }
      this.D.setChecked(true);
      label588:
      if (!a("setVpn").equals("true")) {
        break label1023;
      }
      this.I.setChecked(true);
      label610:
      if (!a("set_sdk_int").equals("true")) {
        break label1034;
      }
      this.H.setChecked(true);
      label632:
      if (!a("Fuc_PhoneSubInfo").equals("false")) {
        break label1045;
      }
      this.G.setChecked(false);
    }
    for (;;)
    {
      try
      {
        str = a("sdkIntSpinnerMin");
        if (str.trim().length() > 0)
        {
          i1 = Integer.parseInt(str);
          this.u.setSelection(i1);
        }
        str = a("sdkIntSpinnerMax");
        i1 = i2;
        if (str.trim().length() > 0)
        {
          i1 = Integer.parseInt(str);
          this.v.setSelection(i1);
          i1 = i2;
        }
      }
      catch (Exception localException)
      {
        label770:
        label781:
        label792:
        label803:
        label814:
        label825:
        label836:
        label847:
        label858:
        label869:
        label880:
        label891:
        label1023:
        localException.printStackTrace();
        label902:
        label913:
        label924:
        label935:
        label946:
        label957:
        label968:
        label979:
        label990:
        label1001:
        label1012:
        i1 = i2;
        label1034:
        label1045:
        continue;
        SetMessageActivity.f.length();
        SetMessageActivity.d.length();
        i1 += 1;
        continue;
      }
      if (i1 < SetMessageActivity.e.length()) {
        continue;
      }
      this.u.setOnItemSelectedListener(new cs(this));
      this.v.setOnItemSelectedListener(new ct(this));
      return;
      this.e.setChecked(true);
      break;
      this.d.setChecked(false);
      break label58;
      this.f.setChecked(true);
      break label79;
      this.h.setChecked(true);
      break label114;
      this.i.setChecked(true);
      break label165;
      this.j.setChecked(true);
      break label186;
      this.k.setChecked(true);
      break label207;
      this.m.setChecked(true);
      break label228;
      this.n.setChecked(true);
      break label249;
      this.o.setChecked(false);
      break label270;
      this.p.setChecked(true);
      break label291;
      this.C.setChecked(false);
      break label312;
      this.z.setChecked(false);
      break label333;
      this.A.setChecked(false);
      break label354;
      this.l.setChecked(true);
      break label375;
      this.q.setChecked(false);
      break label396;
      this.r.setChecked(false);
      break label439;
      this.y.setChecked(false);
      break label460;
      this.s.setChecked(false);
      break label481;
      this.t.setChecked(false);
      break label502;
      this.w.setChecked(false);
      break label523;
      this.B.setChecked(false);
      break label544;
      this.E.setChecked(true);
      break label566;
      this.D.setChecked(false);
      break label588;
      this.I.setChecked(false);
      break label610;
      this.H.setChecked(false);
      break label632;
      this.G.setChecked(true);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903069);
    this.c = ((EditText)findViewById(2131361941));
    this.e = ((CheckBox)findViewById(2131361939));
    this.d = ((CheckBox)findViewById(2131361938));
    this.f = ((CheckBox)findViewById(2131361942));
    this.g = ((EditText)findViewById(2131361943));
    this.h = ((CheckBox)findViewById(2131361944));
    this.i = ((CheckBox)findViewById(2131361946));
    this.F = ((Spinner)findViewById(2131361945));
    this.j = ((CheckBox)findViewById(2131361952));
    this.k = ((CheckBox)findViewById(2131361951));
    this.m = ((CheckBox)findViewById(2131361953));
    this.n = ((CheckBox)findViewById(2131361954));
    this.o = ((CheckBox)findViewById(2131361940));
    this.p = ((CheckBox)findViewById(2131361955));
    this.C = ((CheckBox)findViewById(2131361967));
    this.q = ((CheckBox)findViewById(2131361956));
    this.r = ((CheckBox)findViewById(2131361957));
    this.s = ((CheckBox)findViewById(2131361958));
    this.t = ((CheckBox)findViewById(2131361959));
    this.u = ((Spinner)findViewById(2131361947));
    this.v = ((Spinner)findViewById(2131361948));
    this.w = ((CheckBox)findViewById(2131361949));
    this.A = ((CheckBox)findViewById(2131361964));
    this.y = ((CheckBox)findViewById(2131361960));
    this.z = ((CheckBox)findViewById(2131361963));
    this.B = ((CheckBox)findViewById(2131361965));
    this.D = ((CheckBox)findViewById(2131361969));
    this.l = ((CheckBox)findViewById(2131361950));
    this.I = ((CheckBox)findViewById(2131361970));
    this.H = ((CheckBox)findViewById(2131361971));
    this.E = ((CheckBox)findViewById(2131361961));
    this.x = new String[SimulateDataTest.apiLevelMap.size() + 1];
    this.G = ((CheckBox)findViewById(2131361966));
    this.x[0] = "请选择";
    ((Button)findViewById(2131361968)).setOnClickListener(new cr(this));
    paramBundle = SimulateDataTest.apiLevelMap.iterator();
    int i1 = 1;
    for (;;)
    {
      if (!paramBundle.hasNext())
      {
        paramBundle = new ArrayAdapter(this, 17367048, this.x);
        this.u.setAdapter(paramBundle);
        this.v.setAdapter(paramBundle);
        paramBundle = new ArrayAdapter(this, 17367048, new String[] { "自动", "移动", "联通", "电信" });
        this.F.setAdapter(paramBundle);
        c();
        return;
      }
      Object localObject2 = (String[])paramBundle.next();
      Object localObject1 = localObject2[0];
      localObject2 = localObject2[1];
      localObject1 = localObject1 + "-" + (String)localObject2;
      this.x[i1] = localObject1;
      i1 += 1;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296257, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362274)
    {
      b.clear();
      c();
    }
    return true;
  }
  
  protected void onPause()
  {
    if (this.c.getText().toString().length() >= 15) {
      Toast.makeText(this, "序列号前缀长度不能大于15位", 1).show();
    }
    if (this.g.getText().toString().length() >= 15) {
      Toast.makeText(this, "IMSI前缀长度不能大于15位", 1).show();
    }
    String str = this.c.getText().toString().trim();
    b.putkey("imeiHead", str);
    str = this.g.getText().toString().trim();
    b.putkey("imsiHead", str);
    label156:
    label177:
    label198:
    label250:
    int i1;
    if (this.e.isChecked())
    {
      b.putkey("imeiCheck", "true");
      if (!this.d.isChecked()) {
        break label786;
      }
      b.putkey("logCheck", "true");
      if (!this.f.isChecked()) {
        break label800;
      }
      b.putkey("imsiCheck", "true");
      if (!this.h.isChecked()) {
        break label814;
      }
      b.putkey("modalCheck", "true");
      str = this.F.getSelectedItemPosition();
      b.putkey("set_operator_spinner", str);
      if (!this.i.isChecked()) {
        break label828;
      }
      b.putkey("sdkCheck", "true");
      if (!this.j.isChecked()) {
        break label842;
      }
      b.putkey("clearAppCheck", "true");
      label271:
      if (!this.k.isChecked()) {
        break label856;
      }
      b.putkey("setCloseCheck", "true");
      label292:
      if (!this.y.isChecked()) {
        break label870;
      }
      b.putkey("saveToHistory", "true");
      label313:
      if (!this.m.isChecked()) {
        break label884;
      }
      b.putkey("setScan", "true");
      label334:
      if (!this.n.isChecked()) {
        break label898;
      }
      b.putkey("setDisplay", "true");
      label355:
      if (!this.o.isChecked()) {
        break label912;
      }
      b.putkey("setImei14", "true");
      label376:
      if (!this.p.isChecked()) {
        break label926;
      }
      b.putkey("setOpenMac", "true");
      label397:
      if (!this.l.isChecked()) {
        break label940;
      }
      b.putkey("setJizhanCheck", "true");
      label418:
      if (!this.C.isChecked()) {
        break label954;
      }
      b.putkey("setOpenIp", "true");
      label439:
      if (!this.q.isChecked()) {
        break label968;
      }
      b.putkey("setCard", "true");
      label460:
      if (!this.s.isChecked()) {
        break label982;
      }
      b.putkey("setDeleteSystem", "true");
      label481:
      if (!this.r.isChecked()) {
        break label996;
      }
      b.putkey("setDeleteFile", "true");
      label502:
      if (!this.t.isChecked()) {
        break label1010;
      }
      b.putkey("setUserMyDB", "true");
      label523:
      if (!this.w.isChecked()) {
        break label1024;
      }
      b.putkey("setSdkInt", "true");
      label544:
      i1 = this.u.getSelectedItemPosition();
      if (i1 < 0) {
        break label1038;
      }
      b.putkey("sdkIntSpinnerMin", Integer.valueOf(i1));
      label570:
      i1 = this.v.getSelectedItemPosition();
      if (i1 < 0) {
        break label1055;
      }
      b.putkey("sdkIntSpinnerMax", Integer.valueOf(i1));
      label596:
      if (!this.z.isChecked()) {
        break label1072;
      }
      b.putkey("setUserAgent", "true");
      label617:
      if (!this.A.isChecked()) {
        break label1086;
      }
      b.putkey("Build.TIME", "true");
      label638:
      if (!this.B.isChecked()) {
        break label1100;
      }
      b.putkey("set_getProp", "true");
      label659:
      if (!this.D.isChecked()) {
        break label1114;
      }
      b.putkey("setMockLocation", "true");
      label681:
      if (!this.I.isChecked()) {
        break label1129;
      }
      b.putkey("setVpn", "true");
      label703:
      if (!this.H.isChecked()) {
        break label1144;
      }
      b.putkey("set_sdk_int", "true");
      label725:
      this.l.isChecked();
      if (this.G.isChecked()) {
        break label1159;
      }
      b.putkey("Fuc_PhoneSubInfo", "false");
    }
    for (;;)
    {
      PoseHelper008.saveDataToFile("settings", islog.a(b));
      super.onPause();
      return;
      b.putkey("imeiCheck", "false");
      break;
      label786:
      b.putkey("logCheck", "false");
      break label156;
      label800:
      b.putkey("imsiCheck", "false");
      break label177;
      label814:
      b.putkey("modalCheck", "false");
      break label198;
      label828:
      b.putkey("sdkCheck", "false");
      break label250;
      label842:
      b.putkey("clearAppCheck", "false");
      break label271;
      label856:
      b.putkey("setCloseCheck", "false");
      break label292;
      label870:
      b.putkey("saveToHistory", "false");
      break label313;
      label884:
      b.putkey("setScan", "false");
      break label334;
      label898:
      b.putkey("setDisplay", "false");
      break label355;
      label912:
      b.putkey("setImei14", "false");
      break label376;
      label926:
      b.putkey("setOpenMac", "false");
      break label397;
      label940:
      b.putkey("setJizhanCheck", "false");
      break label418;
      label954:
      b.putkey("setOpenIp", "false");
      break label439;
      label968:
      b.putkey("setCard", "false");
      break label460;
      label982:
      b.putkey("setDeleteSystem", "false");
      break label481;
      label996:
      b.putkey("setDeleteFile", "false");
      break label502;
      label1010:
      b.putkey("setUserMyDB", "false");
      break label523;
      label1024:
      b.putkey("setSdkInt", "false");
      break label544;
      label1038:
      b.putkey("sdkIntSpinnerMin", Integer.valueOf(i1));
      break label570;
      label1055:
      b.putkey("sdkIntSpinnerMax", Integer.valueOf(i1));
      break label596;
      label1072:
      b.putkey("setUserAgent", "false");
      break label617;
      label1086:
      b.putkey("Build.TIME", "false");
      break label638;
      label1100:
      b.putkey("set_getProp", "false");
      break label659;
      label1114:
      b.putkey("setMockLocation", "false");
      break label681;
      label1129:
      b.putkey("setVpn", "false");
      break label703;
      label1144:
      b.putkey("set_sdk_int", "false");
      break label725;
      label1159:
      b.putkey("Fuc_PhoneSubInfo", "true");
    }
  }
}
