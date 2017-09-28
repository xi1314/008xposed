package com.soft.tools;

import android.app.Activity;
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
import com.a.a.maputils;
import com.soft.apk008.SetMessageActivity;
import com.soft.apk008.StartActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class UnInstallActivity
  extends Activity
{
  public HashMap a = new HashMap();
  ArrayList b;
  View.OnClickListener c = new ev(this);
  boolean d = false;
  private LinearLayout e;
  private Button f;
  private Button g;
  private Button h;
  private boolean i = false;
  
  public final void a()
  {
    this.d = true;
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.a.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        PoseHelper008.saveDataToFile("UnInstallActivity", maputils.creatmap(localHashMap));
        return;
      }
      Object localObject = (Map.Entry)localIterator.next();
      ((Map.Entry)localObject).getKey();
      localObject = (CheckBox)((Map.Entry)localObject).getValue();
      if (((CheckBox)localObject).isChecked())
      {
        localObject = (a)((CheckBox)localObject).getTag();
        localHashMap.put(a.a((a)localObject), a.b((a)localObject));
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
    this.g.setOnClickListener(this.c);
    this.h.setOnClickListener(this.c);
    paramBundle = "a";
    int j = 0;
    for (;;)
    {
      if (j >= SetMessageActivity.e.length()) {
        return;
      }
      paramBundle = paramBundle + d.c.length();
      j += 1;
    }
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
    paramMenuItem.setClass(this, UnInstallWhiteActivity.class);
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
    this.a.clear();
    this.e.removeAllViews();
    Object localObject1 = new ArrayList();
    Object localObject2 = getPackageManager().getInstalledPackages(0);
    int j = 0;
    label110:
    Object localObject3;
    if (j >= ((List)localObject2).size())
    {
      localObject2 = ((ArrayList)localObject1).iterator();
      j = 0;
      if (((Iterator)localObject2).hasNext()) {
        break label298;
      }
      this.b = ((ArrayList)localObject1);
      localObject1 = PoseHelper008.getFileData("UnInstallActivity");
      if (((String)localObject1).trim().length() != 0) {
        break label444;
      }
      localObject1 = new Map();
      localObject2 = UnInstallWhiteActivity.b();
      localObject3 = this.b.iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject3).hasNext())
      {
        super.onResume();
        return;
        localObject3 = (PackageInfo)((List)localObject2).get(j);
        if ((!((PackageInfo)localObject3).packageName.equals("com.soft.apk008v")) && (!((PackageInfo)localObject3).packageName.equals("de.robv.android.xposed.installer")) && (!((PackageInfo)localObject3).packageName.equals("pro.burgerz.wsm.manager")) && (!((PackageInfo)localObject3).packageName.equals("com.soft.apk008Tool")) && ((((PackageInfo)localObject3).applicationInfo.flags & 0x1) == 0))
        {
          localObject4 = new a();
          a.a((a)localObject4, ((PackageInfo)localObject3).applicationInfo.loadLabel(getPackageManager()).toString());
          a.b((a)localObject4, ((PackageInfo)localObject3).packageName);
          a.c((a)localObject4, ((PackageInfo)localObject3).versionName);
          a.a((a)localObject4, ((PackageInfo)localObject3).versionCode);
          ((ArrayList)localObject1).add(localObject4);
        }
        j += 1;
        break;
        label298:
        localObject3 = (a)((Iterator)localObject2).next();
        long l2;
        int k;
        if (a.a.j(a.a((a)localObject3)) != null)
        {
          l2 = Long.parseLong(a.a.j(a.a((a)localObject3)));
          localObject4 = ((ArrayList)localObject1).iterator();
          k = 0;
        }
        for (;;)
        {
          if (!((Iterator)localObject4).hasNext()) {}
          for (;;)
          {
            j += 1;
            break;
            localObject5 = (a)((Iterator)localObject4).next();
            long l1 = 0L;
            if (a.a.j(a.a((a)localObject5)) != null) {
              l1 = Long.parseLong(a.a.j(a.a((a)localObject5)));
            }
            if (l2 <= l1) {
              break label437;
            }
            ((ArrayList)localObject1).set(k, localObject3);
            ((ArrayList)localObject1).set(j, localObject5);
          }
          label437:
          k += 1;
        }
        label444:
        localObject1 = e.b((String)localObject1);
        break label110;
      }
      Object localObject4 = (a)((Iterator)localObject3).next();
      Object localObject5 = a.b((a)localObject4);
      if ((!StartActivity.f) || (((Map)localObject2).get(a.a((a)localObject4)) == null))
      {
        CheckBox localCheckBox = new CheckBox(this);
        localCheckBox.setText((CharSequence)localObject5);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.e.addView(localCheckBox, localLayoutParams);
        localCheckBox.setTag(localObject4);
        this.a.put(localObject5, localCheckBox);
        if (((Map)localObject1).get(a.a((a)localObject4)) != null) {
          localCheckBox.setChecked(true);
        }
      }
    }
  }
  
  final class a
  {
    private String b = "";
    private String c = "";
    private String d = "";
    private int e = 0;
    private long f = 0L;
    
    a() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.UnInstallActivity

 * JD-Core Version:    0.7.0.1

 */