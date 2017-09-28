package com.soft.tools;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import com.a.a.Map;
import com.a.a.maputils;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ClearApplicationDataWhiteActivity
  extends Activity
{
  public HashMap a = new HashMap();
  ArrayList b;
  View.OnClickListener c = new w(this);
  boolean d = false;
  private LinearLayout e;
  private Button f;
  private Button g;
  private Button h;
  
  public static Map b()
  {
    String str = PoseHelper008.getFileData("ClearApplicationDataWhiteActivity");
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
        PoseHelper008.saveDataToFile("ClearApplicationDataWhiteActivity", maputils.creatmap(localHashMap));
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
    setContentView(2130903126);
    this.e = ((LinearLayout)findViewById(2131362036));
    this.f = ((Button)findViewById(2131362037));
    this.g = ((Button)findViewById(2131362039));
    this.h = ((Button)findViewById(2131362038));
    this.f.setOnClickListener(this.c);
    this.g.setOnClickListener(this.c);
    this.g.setVisibility(8);
    this.h.setOnClickListener(this.c);
    paramBundle = new ArrayList();
    Object localObject1 = getPackageManager().getInstalledPackages(0);
    int i = 0;
    if (i >= ((List)localObject1).size())
    {
      localObject1 = paramBundle.iterator();
      i = 0;
      if (((Iterator)localObject1).hasNext()) {
        break label337;
      }
      this.b = paramBundle;
      paramBundle = b();
      localObject1 = this.b.iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject1).hasNext())
      {
        return;
        localObject2 = (PackageInfo)((List)localObject1).get(i);
        if ((!((PackageInfo)localObject2).packageName.equals("com.soft.apk008v")) && (!((PackageInfo)localObject2).packageName.equals("de.robv.android.xposed.installer")) && (!((PackageInfo)localObject2).packageName.equals("pro.burgerz.wsm.manager")) && (!((PackageInfo)localObject2).packageName.equals("com.soft.apk008Tool")) && ((((PackageInfo)localObject2).applicationInfo.flags & 0x1) == 0))
        {
          localObject3 = new a();
          a.a((a)localObject3, ((PackageInfo)localObject2).applicationInfo.loadLabel(getPackageManager()).toString());
          a.b((a)localObject3, ((PackageInfo)localObject2).packageName);
          a.c((a)localObject3, ((PackageInfo)localObject2).versionName);
          a.a((a)localObject3, ((PackageInfo)localObject2).versionCode);
          paramBundle.add(localObject3);
        }
        i += 1;
        break;
        label337:
        localObject2 = (a)((Iterator)localObject1).next();
        long l2;
        int j;
        if (a.a.j(a.a((a)localObject2)) != null)
        {
          l2 = Long.parseLong(a.a.j(a.a((a)localObject2)));
          localObject3 = paramBundle.iterator();
          j = 0;
        }
        for (;;)
        {
          if (!((Iterator)localObject3).hasNext()) {}
          for (;;)
          {
            i += 1;
            break;
            localObject4 = (a)((Iterator)localObject3).next();
            long l1 = 0L;
            if (a.a.j(a.a((a)localObject4)) != null) {
              l1 = Long.parseLong(a.a.j(a.a((a)localObject4)));
            }
            if (l2 <= l1) {
              break label476;
            }
            paramBundle.set(j, localObject2);
            paramBundle.set(i, localObject4);
          }
          label476:
          j += 1;
        }
      }
      Object localObject2 = (a)((Iterator)localObject1).next();
      Object localObject3 = a.b((a)localObject2);
      Object localObject4 = new CheckBox(this);
      ((CheckBox)localObject4).setText((CharSequence)localObject3);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
      this.e.addView((View)localObject4, localLayoutParams);
      ((CheckBox)localObject4).setTag(localObject2);
      this.a.put(localObject3, localObject4);
      if (paramBundle.get(a.a((a)localObject2)) != null) {
        ((CheckBox)localObject4).setChecked(true);
      }
    }
  }
  
  protected void onPause()
  {
    if (!this.d) {
      a();
    }
    super.onDestroy();
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

 * Qualified Name:     com.soft.tools.ClearApplicationDataWhiteActivity

 * JD-Core Version:    0.7.0.1

 */