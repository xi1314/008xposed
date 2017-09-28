package com.soft.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.a.a.Map;
import com.soft.apk008.StartActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ClearApplicationDataActivity
  extends Activity
{
  public HashMap a = new HashMap();
  ArrayList b;
  View.OnClickListener c = new s(this);
  boolean d = false;
  private LinearLayout e;
  private Button f;
  private Button g;
  private Button h;
  private boolean i = false;
  
  private CheckBox a(String paramString)
  {
    CheckBox localCheckBox = new CheckBox(this);
    localCheckBox.setText(paramString);
    paramString = new LinearLayout.LayoutParams(-1, -2);
    this.e.addView(localCheckBox, paramString);
    return localCheckBox;
  }
  
  private static ArrayList a(Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    List localList = paramContext.getPackageManager().getInstalledPackages(0);
    int j = 0;
    for (;;)
    {
      if (j >= localList.size()) {
        return localArrayList;
      }
      PackageInfo localPackageInfo = (PackageInfo)localList.get(j);
      if ((!localPackageInfo.packageName.equals("com.soft.apk008v")) && (!localPackageInfo.packageName.equals("de.robv.android.xposed.installer")) && (!localPackageInfo.packageName.equals("pro.burgerz.wsm.manager")) && (!localPackageInfo.packageName.equals("com.soft.apk008Tool")) && ((localPackageInfo.applicationInfo.flags & 0x1) == 0))
      {
        a locala = new a();
        a.a(locala, localPackageInfo.applicationInfo.loadLabel(paramContext.getPackageManager()).toString().trim());
        a.b(locala, localPackageInfo.packageName);
        a.c(locala, localPackageInfo.versionName);
        a.a(locala, localPackageInfo.versionCode);
        localArrayList.add(locala);
      }
      j += 1;
    }
  }
  
  public static void a(Context paramContext, String paramString)
  {
    h.a("pm clear " + paramString);
    KillBackGroundActivity.a(paramContext, paramString);
    Toast.makeText(paramContext, "清除完成", 0).show();
  }
  
  public static void a(Context paramContext, String paramString, boolean paramBoolean)
  {
    h.a("pm clear " + paramString, true);
    if (paramBoolean) {
      Toast.makeText(paramContext, "清除完成", 0).show();
    }
  }
  
  public static void a(Context paramContext, boolean paramBoolean)
  {
    Object localObject = a(paramContext);
    Map locale = d();
    localObject = ((ArrayList)localObject).iterator();
    for (;;)
    {
      if (!((Iterator)localObject).hasNext())
      {
        if (paramBoolean) {
          Toast.makeText(paramContext, "清除程序数据完成", 0).show();
        }
        return;
      }
      a locala = (a)((Iterator)localObject).next();
      a.b(locala);
      if (locale.get(a.b(locala)) != null)
      {
        h.a("pm clear " + a.a(locala));
        KillBackGroundActivity.a(paramContext, a.a(locala));
      }
    }
  }
  
  private void c()
  {
    this.b = a(this);
    this.a.clear();
    this.e.removeAllViews();
    Map locale1 = d();
    Map locale2 = ClearApplicationDataWhiteActivity.b();
    Iterator localIterator = this.b.iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      a locala = (a)localIterator.next();
      String str = a.b(locala);
      if (locale2.get(a.a(locala)) == null)
      {
        CheckBox localCheckBox = a(str);
        localCheckBox.setTag(locala);
        this.a.put(str, localCheckBox);
        if (locale1.get(a.b(locala)) != null) {
          localCheckBox.setChecked(true);
        }
      }
    }
  }
  
  private static Map d()
  {
    String str = PoseHelper008.getFileData("ClearApplicationDataActivity");
    if (str.trim().length() == 0) {
      return new Map();
    }
    return e.b(str);
  }
  
  public final void a()
  {
    this.d = true;
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.a.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        PoseHelper008.saveDataToFile("ClearApplicationDataActivity", a.a(localHashMap));
        return;
      }
      Object localObject = (Map.Entry)localIterator.next();
      ((Map.Entry)localObject).getKey();
      localObject = (CheckBox)((Map.Entry)localObject).getValue();
      if (((CheckBox)localObject).isChecked())
      {
        localObject = (a)((CheckBox)localObject).getTag();
        localHashMap.put(a.b((a)localObject), a.b((a)localObject));
      }
    }
  }
  
  public final void b()
  {
    this.a.clear();
    this.e.removeAllViews();
    this.b = a(this);
    Map locale1 = d();
    Map locale2 = ClearApplicationDataWhiteActivity.b();
    Iterator localIterator = this.b.iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      a locala = (a)localIterator.next();
      String str = a.b(locala);
      if ((!StartActivity.f) || (locale2.get(a.a(locala)) == null))
      {
        CheckBox localCheckBox = a(str);
        localCheckBox.setTag(locala);
        this.a.put(str, localCheckBox);
        if (locale1.get(a.a(locala)) != null) {
          localCheckBox.setChecked(true);
        }
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903125);
    this.e = ((LinearLayout)findViewById(2131362036));
    this.f = ((Button)findViewById(2131362037));
    this.g = ((Button)findViewById(2131362039));
    this.h = ((Button)findViewById(2131362038));
    this.f.setOnClickListener(this.c);
    this.h.setOnClickListener(this.c);
    this.g.setOnClickListener(this.c);
    this.g.setText("一键清除数据");
    c();
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296267, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    if (!this.d) {
      a();
    }
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362296)
    {
      if (!StartActivity.f) {
        Toast.makeText(this, "vip才可使用", 0).show();
      }
    }
    else {
      return true;
    }
    paramMenuItem = new Intent();
    paramMenuItem.setClass(this, ClearApplicationDataWhiteActivity.class);
    startActivity(paramMenuItem);
    return true;
  }
  
  protected void onResume()
  {
    if (this.i)
    {
      super.onResume();
      return;
    }
    c();
    super.onResume();
  }
  
  static final class a
  {
    private String a = "";
    private String b = "";
    private String c = "";
    private int d = 0;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.ClearApplicationDataActivity

 * JD-Core Version:    0.7.0.1

 */