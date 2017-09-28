package com.soft.tools.packageSim;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import com.a.a.Map;
import com.a.a.b;
import com.a.a.maputils;
import com.soft.apk008.StartActivity;
import com.soft.apk008.WebMessageActivity;
import com.soft.apk008.cu;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PackAgeSimActivity
  extends Activity
{
  public static Map a = null;
  private static b f;
  private ListView b;
  private Button c;
  private CheckBox d;
  private a e;
  
  public static PackageInfo getpackageinfo(String paramString)
  {
    if (!getpackageinfo()) {
      return null;
    }
    Iterator localIterator = packageinfolist().iterator();
    PackageInfo localPackageInfo;
    do
    {
      if (!localIterator.hasNext()) {
        return null;
      }
      localPackageInfo = (PackageInfo)localIterator.next();
    } while (!localPackageInfo.packageName.equals(paramString));
    return localPackageInfo;
  }
  
  public static void getpackageinfo(int paramInt1, int paramInt2)
  {
    if (a == null) {}
    try
    {
      a = e.b(PoseHelper008.getFileData("packagesimset"));
      label17:
      if (a == null) {
        a = new Map();
      }
      a.putkey("packageCount", paramInt1);
      a.putkey("packageFloat", paramInt2);
      PoseHelper008.saveDataToFile("packagesimset", a.a());
      return;
    }
    catch (Exception localException)
    {
      break label17;
    }
  }
  
  public static boolean getpackageinfo()
  {
    if (a == null) {}
    try
    {
      a = e.b(PoseHelper008.getFileData("packagesimset"));
      label17:
      if (a == null) {
        a = new Map();
      }
      return "true".equals(a.get("open"));
    }
    catch (Exception localException)
    {
      break label17;
    }
  }
  
  public static ApplicationInfo createdapplicationinfo(String paramString)
  {
    if (!getpackageinfo()) {
      return null;
    }
    Iterator localIterator = applicationInfolist().iterator();
    ApplicationInfo localApplicationInfo;
    do
    {
      if (!localIterator.hasNext()) {
        return null;
      }
      localApplicationInfo = (ApplicationInfo)localIterator.next();
    } while (!localApplicationInfo.packageName.equals(paramString));
    return localApplicationInfo;
  }
  
  public static boolean createdapplicationinfo()
  {
    if (a == null) {}
    try
    {
      a = e.b(PoseHelper008.getFileData("packagesimset"));
      label17:
      if (a == null) {
        a = new Map();
      }
      return "true".equals(a.get("checkBoxAuto"));
    }
    catch (Exception localException)
    {
      break label17;
    }
  }
  
  public static String[] c()
  {
    if (a == null) {}
    try
    {
      a = e.b(PoseHelper008.getFileData("packagesimset"));
      label17:
      if (a == null) {
        a = new Map();
      }
      String str1 = a.get("packageCount");
      String str2 = a.get("packageFloat");
      i = 20;
      k = 10;
      try
      {
        j = Integer.parseInt(str1);
        i = j;
        int m = Integer.parseInt(str2);
        i = m;
        k = j;
        j = i;
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          int j = k;
          k = i;
        }
      }
      return new String[] { k, j };
    }
    catch (Exception localException2)
    {
      int i;
      int k;
      break label17;
    }
  }
  
  public static void d()
  {
    if (!getpackageinfo()) {
      return;
    }
    int j = packagesimset();
    Object localObject = (ArrayList)PackAgeDBActivity.a().clone();
    int i;
    if (j < ((ArrayList)localObject).size()) {
      i = 0;
    }
    for (;;)
    {
      if (i >= ((ArrayList)localObject).size() - j)
      {
        localObject = maputils.creatmap(localObject);
        f = maputils.c((String)localObject);
        PoseHelper008.saveDataToFile("packagesimFile", (String)localObject);
        return;
      }
      ((ArrayList)localObject).remove(PackAgeDBActivity.a.nextInt(((ArrayList)localObject).size()));
      i += 1;
    }
  }
  
  public static List packageinfolist()
  {
    if (!getpackageinfo()) {}
    for (;;)
    {
      return null;
      Object localObject;
      if (f == null) {
        localObject = PoseHelper008.getFileData("packagesimFile");
      }
      try
      {
        f = maputils.c((String)localObject);
        label27:
        if (f == null) {
          continue;
        }
        localObject = new ArrayList();
        int i = 0;
        for (;;)
        {
          if (i >= f.size()) {
            return localObject;
          }
          ((ArrayList)localObject).add((PackageInfo)f.a(i, PackageInfo.class));
          i += 1;
        }
      }
      catch (Exception localException)
      {
        break label27;
      }
    }
  }
  
  public static List applicationInfolist()
  {
    if (!getpackageinfo()) {}
    for (;;)
    {
      return null;
      Object localObject;
      if (f == null) {
        localObject = PoseHelper008.getFileData("packagesimFile");
      }
      try
      {
        f = maputils.c((String)localObject);
        label27:
        if (f == null) {
          continue;
        }
        localObject = new ArrayList();
        int i = 0;
        for (;;)
        {
          if (i >= f.size()) {
            return localObject;
          }
          ((ArrayList)localObject).add(((PackageInfo)f.a(i, PackageInfo.class)).applicationInfo);
          i += 1;
        }
      }
      catch (Exception localException)
      {
        break label27;
      }
    }
  }
  
  public static List runningappprocessinfolist()
  {
    if (!getpackageinfo()) {}
    for (;;)
    {
      return null;
      Object localObject;
      if (f == null) {
        localObject = PoseHelper008.getFileData("packagesimFile");
      }
      try
      {
        f = maputils.c((String)localObject);
        label27:
        if (f == null) {
          continue;
        }
        localObject = new ArrayList();
        int i = 0;
        for (;;)
        {
          if (i >= f.size()) {
            return localObject;
          }
          ((ArrayList)localObject).add(new ActivityManager.RunningAppProcessInfo(((PackageInfo)f.a(i, PackageInfo.class)).packageName, cu.a.nextInt(10000) + 1000, new String[] { "" }));
          i += 1;
        }
      }
      catch (Exception localException)
      {
        break label27;
      }
    }
  }
  
  public static List runningserviceinfolist()
  {
    if (!getpackageinfo()) {}
    for (;;)
    {
      return null;
      Object localObject;
      if (f == null) {
        localObject = PoseHelper008.getFileData("packagesimFile");
      }
      try
      {
        f = maputils.c((String)localObject);
        label27:
        if (f == null) {
          continue;
        }
        localObject = new ArrayList();
        int i = 0;
        for (;;)
        {
          if (i >= f.size()) {
            return localObject;
          }
          Map locale = f.a(i);
          ActivityManager.RunningServiceInfo localRunningServiceInfo = new ActivityManager.RunningServiceInfo();
          String str = locale.getStringfrommap("packageName");
          localRunningServiceInfo.clientPackage = locale.getStringfrommap(str);
          localRunningServiceInfo.service = new ComponentName(str, str);
          localRunningServiceInfo.pid = (cu.a.nextInt(10000) + 1000);
          localRunningServiceInfo.process = str;
          localRunningServiceInfo.uid = locale.getMap("applicationInfo").h("uid");
          ((ArrayList)localObject).add(localRunningServiceInfo);
          i += 1;
        }
      }
      catch (Exception localException)
      {
        break label27;
      }
    }
  }
  
  public static List runningtaskinfolist()
  {
    if (!getpackageinfo()) {}
    for (;;)
    {
      return null;
      Object localObject;
      if (f == null) {
        localObject = PoseHelper008.getFileData("packagesimFile");
      }
      try
      {
        f = maputils.c((String)localObject);
        label27:
        if (f == null) {
          continue;
        }
        localObject = new ArrayList();
        int i = 0;
        for (;;)
        {
          if (i >= f.size()) {
            return localObject;
          }
          Map locale = f.a(i);
          ActivityManager.RunningTaskInfo localRunningTaskInfo = new ActivityManager.RunningTaskInfo();
          localRunningTaskInfo.baseActivity = new ComponentName(locale.getStringfrommap("packageName"), locale.getStringfrommap("packageName"));
          localRunningTaskInfo.id = (cu.a.nextInt(10000) + 100);
          ((ArrayList)localObject).add(localRunningTaskInfo);
          i += 1;
        }
      }
      catch (Exception localException)
      {
        break label27;
      }
    }
  }
  
  public static List recenttaskinfolist()
  {
    if (!getpackageinfo()) {}
    for (;;)
    {
      return null;
      Object localObject;
      if (f == null) {
        localObject = PoseHelper008.getFileData("packagesimFile");
      }
      try
      {
        f = maputils.c((String)localObject);
        label27:
        if (f == null) {
          continue;
        }
        localObject = new ArrayList();
        int i = 0;
        for (;;)
        {
          if (i >= f.size()) {
            return localObject;
          }
          Map locale = f.a(i);
          ActivityManager.RecentTaskInfo localRecentTaskInfo = new ActivityManager.RecentTaskInfo();
          localRecentTaskInfo.baseIntent = new Intent();
          localRecentTaskInfo.baseIntent.setClassName(locale.getStringfrommap("packageName"), locale.getStringfrommap("packageName"));
          localRecentTaskInfo.id = (cu.a.nextInt(10000) + 100);
          ((ArrayList)localObject).add(localRecentTaskInfo);
          i += 1;
        }
      }
      catch (Exception localException)
      {
        break label27;
      }
    }
  }
  
  private static int packagesimset()
  {
    if (a == null) {}
    try
    {
      a = e.b(PoseHelper008.getFileData("packagesimset"));
      label17:
      if (a == null) {
        a = new Map();
      }
      String str1 = a.get("packageCount");
      String str2 = a.get("packageFloat");
      int i = 20;
      int k = 10;
      try
      {
        j = Integer.parseInt(str1);
        i = j;
        int m = Integer.parseInt(str2);
        k = m;
        i = j;
      }
      catch (Exception localException1)
      {
        int j;
        label103:
        break label103;
      }
      if (com.data.simulate.a.b.nextInt(1) == 0) {}
      for (j = -com.data.simulate.a.b.nextInt(k);; j = com.data.simulate.a.b.nextInt(k)) {
        return j + i;
      }
    }
    catch (Exception localException2)
    {
      break label17;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903134);
    this.b = ((ListView)findViewById(2131362226));
    this.c = ((Button)findViewById(2131362227));
    this.d = ((CheckBox)findViewById(2131362228));
    try
    {
      f = maputils.c(PoseHelper008.getFileData("packagesimFile"));
      label65:
      if (f == null) {
        f = new b();
      }
      if (a == null) {}
      try
      {
        a = e.b(PoseHelper008.getFileData("packagesimset"));
        label98:
        if (a == null) {
          a = new Map();
        }
        this.c.setOnClickListener(new i(this));
        this.e = new a();
        this.b.setAdapter(this.e);
        this.d.setOnClickListener(new j(this));
        if ("true".equals(a.getStringfrommap("open"))) {
          this.d.setChecked(true);
        }
        PackAgeDBActivity.a(this);
        return;
      }
      catch (Exception paramBundle)
      {
        break label98;
      }
    }
    catch (Exception paramBundle)
    {
      break label65;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296276, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    PoseHelper008.saveDataToFile("packagesimset", a.a());
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    Intent localIntent;
    if (paramMenuItem.getItemId() == 2131362309)
    {
      localIntent = new Intent();
      localIntent.setClass(this, PackAgeDBActivity.class);
      startActivity(localIntent);
    }
    for (;;)
    {
      return super.onOptionsItemSelected(paramMenuItem);
      if (paramMenuItem.getItemId() == 2131362310)
      {
        localIntent = new Intent();
        localIntent.setClass(this, PackAgeSetActivity.class);
        startActivity(localIntent);
      }
      else if (paramMenuItem.getItemId() == 2131362311)
      {
        localIntent = new Intent();
        localIntent.setClass(this, WebMessageActivity.class);
        localIntent.putExtra("url", StartActivity.b + "/phone/ContentAction.action?action=packAgeSimHelp");
        startActivity(localIntent);
      }
    }
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return PackAgeSimActivity.k().size();
    }
    
    public final Object getItem(int paramInt)
    {
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null) {
        paramView = new TextView(PackAgeSimActivity.this);
      }
      for (;;)
      {
        paramView = (TextView)paramView;
        Object localObject2 = PackAgeSimActivity.k().a(paramInt);
        Object localObject1 = ((Map)localObject2).getMap("applicationInfo");
        paramViewGroup = ((Map)localObject2).getStringfrommap("packageName");
        new StringBuilder().append(((Map)localObject2).get("versionCode")).toString();
        localObject2 = ((Map)localObject2).get("versionName");
        localObject1 = ((Map)localObject1).get("name");
        paramView.setText("应用名：" + (String)localObject1 + ",包名：" + paramViewGroup + ",版本名：" + (String)localObject2);
        return paramView;
      }
    }
  }
}

