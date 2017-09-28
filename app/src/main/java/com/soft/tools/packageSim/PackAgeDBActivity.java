package com.soft.tools.packageSim;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;

public class PackAgeDBActivity
  extends Activity
{
  static Random a = new Random(System.currentTimeMillis());
  public static ArrayList b = null;
  private ListView c;
  private a d;
  
  public static ArrayList a()
  {
    String[] arrayOfString1;
    int j;
    int i;
    if (b == null)
    {
      b = new ArrayList();
      arrayOfString1 = PoseHelper008.getFileData("packAgeDbFile").split("\n+");
      j = arrayOfString1.length;
      i = 0;
    }
    for (;;)
    {
      if (i >= j) {
        return b;
      }
      String[] arrayOfString2 = arrayOfString1[i].split("\\s+");
      PackageInfo localPackageInfo;
      if (arrayOfString2.length >= 4)
      {
        localPackageInfo = new PackageInfo();
        localPackageInfo.firstInstallTime = System.currentTimeMillis();
        localPackageInfo.activities = new ActivityInfo[0];
        localPackageInfo.applicationInfo = new ApplicationInfo();
        localPackageInfo.applicationInfo.name = arrayOfString2[0];
        localPackageInfo.applicationInfo.uid = (a.nextInt(10000) + 10000);
        localPackageInfo.applicationInfo.backupAgentName = "";
        localPackageInfo.applicationInfo.className = "";
        localPackageInfo.applicationInfo.dataDir = "";
        localPackageInfo.applicationInfo.manageSpaceActivityName = "";
        localPackageInfo.applicationInfo.metaData = new Bundle();
        localPackageInfo.applicationInfo.packageName = arrayOfString2[1];
        localPackageInfo.applicationInfo.permission = "";
        localPackageInfo.applicationInfo.processName = "";
        localPackageInfo.gids = new int[1];
        localPackageInfo.gids[0] = (a.nextInt(100000) + 1000);
        localPackageInfo.packageName = arrayOfString2[1];
        localPackageInfo.configPreferences = new ConfigurationInfo[0];
        localPackageInfo.lastUpdateTime = System.currentTimeMillis();
      }
      try
      {
        localPackageInfo.versionCode = Integer.parseInt(arrayOfString2[2]);
        label275:
        localPackageInfo.versionName = arrayOfString2[3];
        b.add(localPackageInfo);
        i += 1;
      }
      catch (Exception localException)
      {
        break label275;
      }
    }
  }
  
  public static void a(Context paramContext)
  {
    if (PoseHelper008.getFileData("packAgeDbFile").length() > 0) {
      return;
    }
    for (;;)
    {
      FileOutputStream localFileOutputStream;
      byte[] arrayOfByte;
      int i;
      try
      {
        paramContext = paramContext.getAssets().open("package.txt");
        localFileOutputStream = new FileOutputStream(PoseHelper008.getFilePath("packAgeDbFile"));
        arrayOfByte = new byte[8192];
        i = paramContext.read(arrayOfByte);
        if (i <= 0)
        {
          localFileOutputStream.close();
          paramContext.close();
          return;
        }
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
        return;
      }
      localFileOutputStream.write(arrayOfByte, 0, i);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.c = new ListView(this);
    setContentView(this.c);
    a();
    this.d = new a();
    this.c.setAdapter(this.d);
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return PackAgeDBActivity.b.size();
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
        paramView = new TextView(PackAgeDBActivity.this);
      }
      for (;;)
      {
        paramView = (TextView)paramView;
        Object localObject = (PackageInfo)PackAgeDBActivity.b.get(paramInt);
        paramViewGroup = ((PackageInfo)localObject).applicationInfo.name;
        String str1 = ((PackageInfo)localObject).packageName;
        String str2 = ((PackageInfo)localObject).versionCode;
        localObject = ((PackageInfo)localObject).versionName;
        paramView.setText("应用名：" + paramViewGroup + "，包名：" + str1 + ",版本号：" + str2 + "，版本名:" + (String)localObject);
        return paramView;
      }
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.packageSim.PackAgeDBActivity
 * JD-Core Version:    0.7.0.1
 */