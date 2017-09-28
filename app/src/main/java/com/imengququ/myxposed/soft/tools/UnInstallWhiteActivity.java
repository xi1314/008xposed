package com.imengququ.myxposed.soft.tools;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import de.robv.android.xposed.mods.tutorial.Shell;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UnInstallWhiteActivity
  extends Activity
{
  public static final String fileName = "UnInstallWhiteActivity";
  private Button buttonSelectClear;
  private Button buttonSelectOther;
  private Button buttonUninstallAll;
  public HashMap<String, CheckBox> checkMap = new HashMap();
  ArrayList<PInfo> list;
  OnClickListener listener = new OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (UnInstallWhiteActivity.this.buttonSelectOther.equals(paramAnonymousView))
      {
        paramAnonymousView = UnInstallWhiteActivity.this.checkMap.entrySet().iterator();
        if (paramAnonymousView.hasNext()) {}
      }
      label169:
      do
      {
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
          if (!UnInstallWhiteActivity.this.buttonSelectClear.equals(paramAnonymousView)) {
            break label169;
          }
          paramAnonymousView = UnInstallWhiteActivity.this.checkMap.entrySet().iterator();
          while (paramAnonymousView.hasNext())
          {
            localObject = (Map.Entry)paramAnonymousView.next();
            str = (String)((Map.Entry)localObject).getKey();
            ((CheckBox)((Map.Entry)localObject).getValue()).setChecked(false);
          }
        }
      } while (!UnInstallWhiteActivity.this.buttonUninstallAll.equals(paramAnonymousView));
      new Thread()
      {
        public void run()
        {
          UnInstallWhiteActivity.this.saveChecked();
          Iterator localIterator = UnInstallWhiteActivity.this.checkMap.entrySet().iterator();
          for (;;)
          {
            if (!localIterator.hasNext()) {
              return;
            }
            Object localObject1 = (Map.Entry)localIterator.next();
            Object localObject2 = (String)((Map.Entry)localObject1).getKey();
            localObject1 = (CheckBox)((Map.Entry)localObject1).getValue();
            if (((CheckBox)localObject1).isChecked())
            {
              localObject1 = (PInfo)((CheckBox)localObject1).getTag();
              Shell.execCommand("pm uninstall " + PInfo.access$0((PInfo)localObject1), true, false);
              localObject2 = UnInstallWhiteActivity.this.getPackageManager();
              try
              {
                while (((PackageManager)localObject2).getApplicationInfo(PInfo.access$0((PInfo)localObject1), 128) != null) {
                  Thread.sleep(300L);
                }
              }
              catch (NameNotFoundException localNameNotFoundException)
              {
                localNameNotFoundException.printStackTrace();
              }
              catch (InterruptedException localInterruptedException)
              {
                localInterruptedException.printStackTrace();
              }
            }
          }
        }
      }.start();
    }
  };
  boolean saved = false;
  private LinearLayout view_con;
  
  public static JSONObject getChecked()
  {
    String str = PoseHelper008.getFileData("UnInstallWhiteActivity");
    if (str.trim().length() == 0) {
      return new JSONObject();
    }
    return JSONObject.parseObject(str);
  }
  
  public CheckBox addCheckBox(String paramString)
  {
    CheckBox localCheckBox = new CheckBox(this);
    localCheckBox.setText(paramString);
    paramString = new LayoutParams(-1, -2);
    this.view_con.addView(localCheckBox, paramString);
    return localCheckBox;
  }
  
  public ArrayList<PInfo> getInstalledApps(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = getPackageManager().getInstalledPackages(0);
    int i = 0;
    Object localObject3;
    if (i >= ((List)localObject1).size())
    {
      paramInt = 0;
      localObject1 = localArrayList.iterator();
      if (!((Iterator)localObject1).hasNext()) {
        return localArrayList;
      }
    }
    else
    {
      localObject2 = (PackageInfo)((List)localObject1).get(i);
      if ((((PackageInfo)localObject2).packageName.equals("com.soft.apk008v")) || (((PackageInfo)localObject2).packageName.equals("de.robv.android.xposed.installer")) || (((PackageInfo)localObject2).packageName.equals("pro.burgerz.wsm.manager")) || (((PackageInfo)localObject2).packageName.equals("com.soft.apk008Tool"))) {}
      for (;;)
      {
        i += 1;
        break;
        if (paramInt == 1)
        {
          localObject3 = new PInfo();
          ((PInfo)localObject3).appname = ((PackageInfo)localObject2).applicationInfo.loadLabel(getPackageManager()).toString();
          ((PInfo)localObject3).pname = ((PackageInfo)localObject2).packageName;
          ((PInfo)localObject3).versionName = ((PackageInfo)localObject2).versionName;
          ((PInfo)localObject3).versionCode = ((PackageInfo)localObject2).versionCode;
          localArrayList.add(localObject3);
        }
        else if (paramInt == 3)
        {
          if ((((PackageInfo)localObject2).applicationInfo.flags & 0x1) != 0)
          {
            localObject3 = new PInfo();
            ((PInfo)localObject3).appname = ((PackageInfo)localObject2).applicationInfo.loadLabel(getPackageManager()).toString();
            ((PInfo)localObject3).pname = ((PackageInfo)localObject2).packageName;
            ((PInfo)localObject3).versionName = ((PackageInfo)localObject2).versionName;
            ((PInfo)localObject3).versionCode = ((PackageInfo)localObject2).versionCode;
            localArrayList.add(localObject3);
          }
        }
        else if ((paramInt == 2) && ((((PackageInfo)localObject2).applicationInfo.flags & 0x1) == 0))
        {
          localObject3 = new PInfo();
          ((PInfo)localObject3).appname = ((PackageInfo)localObject2).applicationInfo.loadLabel(getPackageManager()).toString();
          ((PInfo)localObject3).pname = ((PackageInfo)localObject2).packageName;
          ((PInfo)localObject3).versionName = ((PackageInfo)localObject2).versionName;
          ((PInfo)localObject3).versionCode = ((PackageInfo)localObject2).versionCode;
          localArrayList.add(localObject3);
        }
      }
    }
    Object localObject2 = (PInfo)((Iterator)localObject1).next();
    long l2;
    if (AppHandlerRecord.dataList.getString(((PInfo)localObject2).pname) != null)
    {
      l2 = Long.parseLong(AppHandlerRecord.dataList.getString(((PInfo)localObject2).pname));
      i = 0;
      localObject3 = localArrayList.iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject3).hasNext()) {}
      for (;;)
      {
        paramInt += 1;
        break;
        PInfo localPInfo = (PInfo)((Iterator)localObject3).next();
        long l1 = 0L;
        if (AppHandlerRecord.dataList.getString(localPInfo.pname) != null) {
          l1 = Long.parseLong(AppHandlerRecord.dataList.getString(localPInfo.pname));
        }
        if (l2 <= l1) {
          break label525;
        }
        localArrayList.set(i, localObject2);
        localArrayList.set(paramInt, localPInfo);
      }
      label525:
      i += 1;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903087);
    this.view_con = ((LinearLayout)findViewById(2131230876));
    this.buttonSelectOther = ((Button)findViewById(2131230877));
    this.buttonUninstallAll = ((Button)findViewById(2131230879));
    this.buttonSelectClear = ((Button)findViewById(2131230878));
    this.buttonSelectOther.setOnClickListener(this.listener);
    this.buttonUninstallAll.setOnClickListener(this.listener);
    this.buttonUninstallAll.setVisibility(8);
    this.buttonSelectClear.setOnClickListener(this.listener);
    this.list = getInstalledApps(2);
    paramBundle = getChecked();
    Iterator localIterator = this.list.iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      PInfo localPInfo = (PInfo)localIterator.next();
      String str = localPInfo.appname;
      CheckBox localCheckBox = addCheckBox(str);
      localCheckBox.setTag(localPInfo);
      this.checkMap.put(str, localCheckBox);
      if (paramBundle.get(localPInfo.pname) != null) {
        localCheckBox.setChecked(true);
      }
    }
  }
  
  protected void onPause()
  {
    if (!this.saved) {
      saveChecked();
    }
    super.onDestroy();
  }
  
  public void saveChecked()
  {
    this.saved = true;
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.checkMap.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        PoseHelper008.saveDataToFile("UnInstallWhiteActivity", JSON.toJSONString(localHashMap));
        return;
      }
      Object localObject = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = (CheckBox)((Map.Entry)localObject).getValue();
      if (((CheckBox)localObject).isChecked())
      {
        localObject = (PInfo)((CheckBox)localObject).getTag();
        localHashMap.put(((PInfo)localObject).pname, ((PInfo)localObject).appname);
      }
    }
  }
  
  class PInfo
  {
    private String appname = "";
    private Drawable icon;
    private String pname = "";
    private long time = 0L;
    private int versionCode = 0;
    private String versionName = "";
    
    PInfo() {}
  }
}
