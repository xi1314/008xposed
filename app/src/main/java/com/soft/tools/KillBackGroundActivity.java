package com.soft.tools;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import com.a.a.Map;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class KillBackGroundActivity
  extends Activity
{
  public HashMap a = new HashMap();
  int b = 0;
  public View.OnClickListener c = new cd(this);
  private LinearLayout d;
  private Button e;
  private Button f;
  private List g;
  private Button h;
  
  private static ArrayList a(Activity paramActivity)
  {
    ArrayList localArrayList = new ArrayList();
    List localList = paramActivity.getPackageManager().getInstalledPackages(0);
    int i = 0;
    for (;;)
    {
      if (i >= localList.size()) {
        return localArrayList;
      }
      PackageInfo localPackageInfo = (PackageInfo)localList.get(i);
      if ((localPackageInfo.applicationInfo.flags & 0x1) == 0)
      {
        a locala = new a();
        a.a(locala, localPackageInfo.applicationInfo.loadLabel(paramActivity.getPackageManager()).toString());
        a.b(locala, localPackageInfo.packageName);
        a.c(locala, localPackageInfo.versionName);
        a.a(locala, localPackageInfo.versionCode);
        localArrayList.add(locala);
      }
      i += 1;
    }
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    Object localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    ArrayList localArrayList = new ArrayList();
    new HashMap();
    localObject = ((List)localObject).iterator();
    for (;;)
    {
      if (!((Iterator)localObject).hasNext()) {
        return false;
      }
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
      if (localRunningAppProcessInfo.uid > 1000)
      {
        localArrayList.add(localRunningAppProcessInfo);
        String[] arrayOfString = localRunningAppProcessInfo.pkgList;
        int j = arrayOfString.length;
        int i = 0;
        while (i < j)
        {
          if (arrayOfString[i].equals(paramString))
          {
            h.a("kill " + localRunningAppProcessInfo.pid);
            ((ActivityManager)paramContext.getSystemService("activity")).killBackgroundProcesses(paramString);
            return true;
          }
          i += 1;
        }
      }
    }
  }
  
  private List b()
  {
    Object localObject1 = ((ActivityManager)getSystemService("activity")).getRunningAppProcesses();
    ArrayList localArrayList = new ArrayList();
    HashMap localHashMap = new HashMap();
    localObject1 = ((List)localObject1).iterator();
    if (!((Iterator)localObject1).hasNext())
    {
      localObject1 = a(this);
      localArrayList = new ArrayList();
      localObject1 = ((ArrayList)localObject1).iterator();
    }
    for (;;)
    {
      Object localObject3;
      int i;
      if (!((Iterator)localObject1).hasNext())
      {
        return localArrayList;
        localObject2 = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject1).next();
        if (((ActivityManager.RunningAppProcessInfo)localObject2).uid <= 1000) {
          break;
        }
        localArrayList.add(localObject2);
        localObject3 = ((ActivityManager.RunningAppProcessInfo)localObject2).pkgList;
        int j = localObject3.length;
        i = 0;
        while (i < j)
        {
          localHashMap.put(localObject3[i], localObject2);
          i += 1;
        }
        break;
      }
      Object localObject2 = (a)((Iterator)localObject1).next();
      if (localHashMap.containsKey(a.a((a)localObject2)))
      {
        i = ((ActivityManager.RunningAppProcessInfo)localHashMap.get(a.a((a)localObject2))).pid;
        localObject3 = ((ActivityManager.RunningAppProcessInfo)localHashMap.get(a.a((a)localObject2))).processName;
        localObject3 = new b();
        ((b)localObject3).b = a.b((a)localObject2);
        ((b)localObject3).a = a.a((a)localObject2);
        ((b)localObject3).c = i;
        localArrayList.add(localObject3);
      }
    }
  }
  
  public final CheckBox a(String paramString)
  {
    CheckBox localCheckBox = new CheckBox(this);
    localCheckBox.setText(paramString);
    paramString = new LinearLayout.LayoutParams(-1, -2);
    this.d.addView(localCheckBox, paramString);
    return localCheckBox;
  }
  
  public final void a()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.a.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        PoseHelper008.saveDataToFile("KillBackGroundActivity", a.a(localHashMap));
        return;
      }
      Object localObject = (Map.Entry)localIterator.next();
      ((Map.Entry)localObject).getKey();
      localObject = (CheckBox)((Map.Entry)localObject).getValue();
      if (((CheckBox)localObject).isChecked())
      {
        localObject = (b)((CheckBox)localObject).getTag();
        localHashMap.put(((b)localObject).b, ((b)localObject).a);
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903101);
    this.d = ((LinearLayout)findViewById(2131362036));
    this.e = ((Button)findViewById(2131362037));
    this.f = ((Button)findViewById(2131362039));
    this.h = ((Button)findViewById(2131362099));
    this.e.setOnClickListener(this.c);
    this.f.setOnClickListener(this.c);
    this.f.setText("一键关闭");
    this.h.setOnClickListener(this.c);
    this.g = b();
    paramBundle = PoseHelper008.getFileData("KillBackGroundActivity");
    Iterator localIterator;
    if (paramBundle.trim().length() == 0)
    {
      paramBundle = new Map();
      localIterator = this.g.iterator();
    }
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        return;
        paramBundle = e.b(paramBundle);
        break;
      }
      b localb = (b)localIterator.next();
      String str = localb.b;
      CheckBox localCheckBox = a(str);
      localCheckBox.setTag(localb);
      this.a.put(str, localCheckBox);
      if (paramBundle.get(localb.b) != null) {
        localCheckBox.setChecked(true);
      }
    }
  }
  
  static final class a
  {
    private String a = "";
    private String b = "";
    private String c = "";
    private int d = 0;
  }
  
  static final class b
  {
    public String a;
    public String b;
    public String c;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.KillBackGroundActivity

 * JD-Core Version:    0.7.0.1

 */