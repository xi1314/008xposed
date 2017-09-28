package com.imengququ.myxposed.soft.tools;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import de.robv.android.xposed.mods.tutorial.Shell;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class KillBackGroundActivity
  extends Activity
{
  public static final String fileName = "KillBackGroundActivity";
  private Button buttonSelectOther;
  private Button buttonUninstallAll;
  private Button buttonUpdate;
  public HashMap<String, CheckBox> checkMap = new HashMap();
  private List<RunningAppInfo> list;
  public OnClickListener listener = new OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (KillBackGroundActivity.this.buttonSelectOther.equals(paramAnonymousView))
      {
        paramAnonymousView = KillBackGroundActivity.this.checkMap.entrySet().iterator();
        if (paramAnonymousView.hasNext()) {}
      }
      for (;;)
      {
        return;
        Object localObject = (Map.Entry)paramAnonymousView.next();
        String str = (String)((Map.Entry)localObject).getKey();
        localObject = (CheckBox)((Map.Entry)localObject).getValue();
        if (((CheckBox)localObject).isChecked()) {}
        for (boolean bool = false;; bool = true)
        {
          ((CheckBox)localObject).setChecked(bool);
          break;
        }
        if (KillBackGroundActivity.this.buttonUninstallAll.equals(paramAnonymousView))
        {
          new Thread()
          {
            public void run()
            {
              KillBackGroundActivity.this.times = 0;
              Object localObject1 = KillBackGroundActivity.this.checkMap.entrySet();
              KillBackGroundActivity.this.saveChecked();
              localObject1 = ((Set)localObject1).iterator();
              for (;;)
              {
                if (!((Iterator)localObject1).hasNext())
                {
                  KillBackGroundActivity.this.runOnUiThread(new Runnable()
                  {
                    public void run()
                    {
                      KillBackGroundActivity.this.view_con.removeAllViews();
                      KillBackGroundActivity.this.checkMap.clear();
                      KillBackGroundActivity.this.list = KillBackGroundActivity.this.getBackGroundApp();
                      Iterator localIterator = KillBackGroundActivity.this.list.iterator();
                      for (;;)
                      {
                        if (!localIterator.hasNext())
                        {
                          Toast.makeText(KillBackGroundActivity.this, "一共杀死" + KillBackGroundActivity.this.times + "个进程", 0).show();
                          return;
                        }
                        RunningAppInfo localRunningAppInfo = (RunningAppInfo)localIterator.next();
                        String str = localRunningAppInfo.name;
                        CheckBox localCheckBox = KillBackGroundActivity.this.addCheckBox(str);
                        localCheckBox.setTag(localRunningAppInfo);
                        KillBackGroundActivity.this.checkMap.put(str, localCheckBox);
                      }
                    }
                  });
                  return;
                }
                Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
                Object localObject3 = (String)((Map.Entry)localObject2).getKey();
                localObject2 = (CheckBox)((Map.Entry)localObject2).getValue();
                if (((CheckBox)localObject2).isChecked())
                {
                  localObject2 = (RunningAppInfo)((CheckBox)localObject2).getTag();
                  localObject3 = (ActivityManager)KillBackGroundActivity.this.getSystemService("activity");
                  Shell.execCommand("kill " + ((RunningAppInfo)localObject2).pid, true, false);
                  localObject2 = KillBackGroundActivity.this;
                  ((KillBackGroundActivity)localObject2).times += 1;
                }
              }
            }
          }.start();
          return;
        }
        if (KillBackGroundActivity.this.buttonUpdate.equals(paramAnonymousView))
        {
          KillBackGroundActivity.this.view_con.removeAllViews();
          KillBackGroundActivity.this.checkMap.clear();
          KillBackGroundActivity.this.list = KillBackGroundActivity.this.getBackGroundApp();
          paramAnonymousView = KillBackGroundActivity.this.list.iterator();
          while (paramAnonymousView.hasNext())
          {
            localObject = (RunningAppInfo)paramAnonymousView.next();
            str = ((RunningAppInfo)localObject).name;
            CheckBox localCheckBox = KillBackGroundActivity.this.addCheckBox(str);
            localCheckBox.setTag(localObject);
            KillBackGroundActivity.this.checkMap.put(str, localCheckBox);
          }
        }
      }
    }
  };
  int times = 0;
  private LinearLayout view_con;
  
  private List<RunningAppInfo> getBackGroundApp()
  {
    Object localObject1 = ((ActivityManager)getSystemService("activity")).getRunningAppProcesses();
    ArrayList localArrayList = new ArrayList();
    HashMap localHashMap = new HashMap();
    localObject1 = ((List)localObject1).iterator();
    if (!((Iterator)localObject1).hasNext())
    {
      localObject1 = getInstalledApps(this, 2);
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
        localObject2 = (RunningAppProcessInfo)((Iterator)localObject1).next();
        if (((RunningAppProcessInfo)localObject2).uid <= 1000) {
          break;
        }
        localArrayList.add(localObject2);
        localObject3 = ((RunningAppProcessInfo)localObject2).pkgList;
        int j = localObject3.length;
        i = 0;
        while (i < j)
        {
          localHashMap.put(localObject3[i], localObject2);
          i += 1;
        }
        break;
      }
      Object localObject2 = (PInfo)((Iterator)localObject1).next();
      if (localHashMap.containsKey(((PInfo)localObject2).pname))
      {
        i = ((RunningAppProcessInfo)localHashMap.get(((PInfo)localObject2).pname)).pid;
        localObject3 = ((RunningAppProcessInfo)localHashMap.get(((PInfo)localObject2).pname)).processName;
        localObject3 = new RunningAppInfo();
        ((RunningAppInfo)localObject3).name = ((PInfo)localObject2).appname;
        ((RunningAppInfo)localObject3).packAgeName = ((PInfo)localObject2).pname;
        ((RunningAppInfo)localObject3).pid = i;
        localArrayList.add(localObject3);
      }
    }
  }
  
  public static ArrayList<PInfo> getInstalledApps(Activity paramActivity, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    List localList = paramActivity.getPackageManager().getInstalledPackages(0);
    int i = 0;
    if (i >= localList.size()) {
      return localArrayList;
    }
    PackageInfo localPackageInfo = (PackageInfo)localList.get(i);
    PInfo localPInfo;
    if (paramInt == 1)
    {
      localPInfo = new PInfo();
      localPInfo.appname = localPackageInfo.applicationInfo.loadLabel(paramActivity.getPackageManager()).toString();
      localPInfo.pname = localPackageInfo.packageName;
      localPInfo.versionName = localPackageInfo.versionName;
      localPInfo.versionCode = localPackageInfo.versionCode;
      localArrayList.add(localPInfo);
    }
    for (;;)
    {
      i += 1;
      break;
      if (paramInt == 3)
      {
        if ((localPackageInfo.applicationInfo.flags & 0x1) != 0)
        {
          localPInfo = new PInfo();
          localPInfo.appname = localPackageInfo.applicationInfo.loadLabel(paramActivity.getPackageManager()).toString();
          localPInfo.pname = localPackageInfo.packageName;
          localPInfo.versionName = localPackageInfo.versionName;
          localPInfo.versionCode = localPackageInfo.versionCode;
          localArrayList.add(localPInfo);
        }
      }
      else if ((paramInt == 2) && ((localPackageInfo.applicationInfo.flags & 0x1) == 0))
      {
        localPInfo = new PInfo();
        localPInfo.appname = localPackageInfo.applicationInfo.loadLabel(paramActivity.getPackageManager()).toString();
        localPInfo.pname = localPackageInfo.packageName;
        localPInfo.versionName = localPackageInfo.versionName;
        localPInfo.versionCode = localPackageInfo.versionCode;
        localArrayList.add(localPInfo);
      }
    }
  }
  
  public static boolean killAppByPackAgeName(Context paramContext, String paramString)
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
      RunningAppProcessInfo localRunningAppProcessInfo = (RunningAppProcessInfo)((Iterator)localObject).next();
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
            Shell.execCommand("kill " + localRunningAppProcessInfo.pid, true, false);
            ((ActivityManager)paramContext.getSystemService("activity")).killBackgroundProcesses(paramString);
            return true;
          }
          i += 1;
        }
      }
    }
  }
  
  public CheckBox addCheckBox(String paramString)
  {
    CheckBox localCheckBox = new CheckBox(this);
    localCheckBox.setText(paramString);
    paramString = new LayoutParams(-1, -2);
    this.view_con.addView(localCheckBox, paramString);
    return localCheckBox;
  }
  
  public JSONObject getChecked()
  {
    String str = PoseHelper008.getFileData("KillBackGroundActivity");
    if (str.trim().length() == 0) {
      return new JSONObject();
    }
    return JSONObject.parseObject(str);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903077);
    this.view_con = ((LinearLayout)findViewById(2131230876));
    this.buttonSelectOther = ((Button)findViewById(2131230877));
    this.buttonUninstallAll = ((Button)findViewById(2131230879));
    this.buttonUpdate = ((Button)findViewById(2131230892));
    this.buttonSelectOther.setOnClickListener(this.listener);
    this.buttonUninstallAll.setOnClickListener(this.listener);
    this.buttonUninstallAll.setText("一键关闭");
    this.buttonUpdate.setOnClickListener(this.listener);
    this.list = getBackGroundApp();
    paramBundle = getChecked();
    Iterator localIterator = this.list.iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      RunningAppInfo localRunningAppInfo = (RunningAppInfo)localIterator.next();
      String str = localRunningAppInfo.name;
      CheckBox localCheckBox = addCheckBox(str);
      localCheckBox.setTag(localRunningAppInfo);
      this.checkMap.put(str, localCheckBox);
      if (paramBundle.get(localRunningAppInfo.name) != null) {
        localCheckBox.setChecked(true);
      }
    }
  }
  
  public void saveChecked()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.checkMap.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        PoseHelper008.saveDataToFile("KillBackGroundActivity", JSON.toJSONString(localHashMap));
        return;
      }
      Object localObject = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = (CheckBox)((Map.Entry)localObject).getValue();
      if (((CheckBox)localObject).isChecked())
      {
        localObject = (RunningAppInfo)((CheckBox)localObject).getTag();
        localHashMap.put(((RunningAppInfo)localObject).name, ((RunningAppInfo)localObject).packAgeName);
      }
    }
  }
  
  static class PInfo
  {
    private String appname = "";
    private Drawable icon;
    private String pname = "";
    private long time;
    private int versionCode = 0;
    private String versionName = "";
  }
  
  static class RunningAppInfo
  {
    public String name;
    public String packAgeName;
    public String pid;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     KillBackGroundActivity

 * JD-Core Version:    0.7.0.1

 */