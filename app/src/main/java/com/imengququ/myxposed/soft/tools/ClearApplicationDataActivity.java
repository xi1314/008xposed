package com.imengququ.myxposed.soft.tools;

import android.app.Activity;
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

public class ClearApplicationDataActivity
  extends Activity
{
  public static final String fileName = "ClearApplicationDataActivity";
  private Button buttonSelectClear;
  private Button buttonSelectOther;
  private Button buttonUninstallAll;
  public HashMap<String, CheckBox> checkMap = new HashMap();
  ArrayList<PInfo> list;
  OnClickListener listener = new OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (ClearApplicationDataActivity.this.buttonSelectOther.equals(paramAnonymousView))
      {
        Iterator iterator = ClearApplicationDataActivity.this.checkMap.entrySet().iterator();
        if (iterator.hasNext()) {}
      }
      label169:
      do
      {
        for (;;)
        {
          return;
          Object localObject = (Map.Entry)iterator.next();
          String str = (String)((Map.Entry)localObject).getKey();
          localObject = (CheckBox)((Map.Entry)localObject).getValue();
          if (((CheckBox)localObject).isChecked()) {}
          for (boolean bool = false;; bool = true)
          {
            ((CheckBox)localObject).setChecked(bool);
            break;
          }
          if (!ClearApplicationDataActivity.this.buttonSelectClear.equals(paramAnonymousView)) {
            break label169;
          }
          paramAnonymousView = ClearApplicationDataActivity.this.checkMap.entrySet().iterator();
          while (paramAnonymousView.hasNext())
          {
            localObject = (Map.Entry)paramAnonymousView.next();
            str = (String)((Map.Entry)localObject).getKey();
            ((CheckBox)((Map.Entry)localObject).getValue()).setChecked(false);
          }
        }
      } while (!ClearApplicationDataActivity.this.buttonUninstallAll.equals(paramAnonymousView));
      new Thread()
      {
        public void run()
        {
          ClearApplicationDataActivity.this.saveChecked();
          Iterator localIterator = ClearApplicationDataActivity.this.checkMap.entrySet().iterator();
          for (;;)
          {
            if (!localIterator.hasNext())
            {
              ClearApplicationDataActivity.this.runOnUiThread(new Runnable()
              {
                public void run()
                {
                  ClearApplicationDataActivity.this.view_con.removeAllViews();
                  ClearApplicationDataActivity.this.checkMap.clear();
                  ClearApplicationDataActivity.this.list = ClearApplicationDataActivity.getInstalledApps(ClearApplicationDataActivity.this, 2);
                  Iterator localIterator = ClearApplicationDataActivity.this.list.iterator();
                  for (;;)
                  {
                    if (!localIterator.hasNext())
                    {
                      Toast.makeText(ClearApplicationDataActivity.this, "清除完成", 0).show();
                      return;
                    }
                    PInfo localPInfo = (PInfo)localIterator.next();
                    String str = PInfo.access$1(localPInfo);
                    CheckBox localCheckBox = ClearApplicationDataActivity.this.addCheckBox(str);
                    localCheckBox.setTag(localPInfo);
                    ClearApplicationDataActivity.this.checkMap.put(str, localCheckBox);
                  }
                }
              });
              return;
            }
            Object localObject = (Map.Entry)localIterator.next();
            final String str = (String)((Map.Entry)localObject).getKey();
            localObject = (CheckBox)((Map.Entry)localObject).getValue();
            if (!((CheckBox)localObject).isChecked()) {
              continue;
            }
            localObject = (PInfo)((CheckBox)localObject).getTag();
            Shell.execCommand("pm clear " + PInfo.access$0((PInfo)localObject), true, false);
            KillBackGroundActivity.killAppByPackAgeName(ClearApplicationDataActivity.this, PInfo.access$0((PInfo)localObject));
            try
            {
              Thread.sleep(300L);
              str = PInfo.access$1((PInfo)localObject);
              AppHandlerRecord.addAppHandler(PInfo.access$0((PInfo)localObject));
              ClearApplicationDataActivity.this.runOnUiThread(new Runnable()
              {
                public void run()
                {
                  Toast.makeText(ClearApplicationDataActivity.this, "清除" + str + "数据成功", 0).show();
                }
              });
            }
            catch (InterruptedException localInterruptedException)
            {
              for (;;)
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
  
  public static void clearData(Activity paramActivity)
  {
    Object localObject = getInstalledApps(paramActivity, 2);
    JSONObject localJSONObject = getChecked();
    localObject = ((ArrayList)localObject).iterator();
    for (;;)
    {
      if (!((Iterator)localObject).hasNext())
      {
        Toast.makeText(paramActivity, "清除完成", 0).show();
        return;
      }
      PInfo localPInfo = (PInfo)((Iterator)localObject).next();
      if (localJSONObject.get(localPInfo.appname) != null)
      {
        Shell.execCommand("pm clear " + localPInfo.pname, true, false);
        KillBackGroundActivity.killAppByPackAgeName(paramActivity, localPInfo.pname);
      }
    }
  }
  
  public static void clearData(Context paramContext, String paramString)
  {
    Shell.execCommand("pm clear " + paramString, true, false);
    KillBackGroundActivity.killAppByPackAgeName(paramContext, paramString);
    Toast.makeText(paramContext, "清除完成", 0).show();
  }
  
  public static JSONObject getChecked()
  {
    String str = PoseHelper008.getFileData("ClearApplicationDataActivity");
    if (str.trim().length() == 0) {
      return new JSONObject();
    }
    return JSONObject.parseObject(str);
  }
  
  public static ArrayList<PInfo> getInstalledApps(Activity paramActivity, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = paramActivity.getPackageManager().getInstalledPackages(0);
    int i = 0;
    Object localObject2;
    PInfo localPInfo;
    if (i >= ((List)localObject1).size())
    {
      paramInt = 0;
      paramActivity = localArrayList.iterator();
      if (!paramActivity.hasNext()) {
        return localArrayList;
      }
    }
    else
    {
      localObject2 = (PackageInfo)((List)localObject1).get(i);
      if ((((PackageInfo)localObject2).packageName.equals("com.soft.apk008v")) || (((PackageInfo)localObject2).packageName.equals("de.robv.android.xposed.installer")) || (((PackageInfo)localObject2).packageName.equals("pro.burgerz.wsm.manager"))) {}
      for (;;)
      {
        i += 1;
        break;
        if (paramInt == 1)
        {
          localPInfo = new PInfo();
          localPInfo.appname = ((PackageInfo)localObject2).applicationInfo.loadLabel(paramActivity.getPackageManager()).toString();
          localPInfo.pname = ((PackageInfo)localObject2).packageName;
          localPInfo.versionName = ((PackageInfo)localObject2).versionName;
          localPInfo.versionCode = ((PackageInfo)localObject2).versionCode;
          localArrayList.add(localPInfo);
        }
        else if (paramInt == 3)
        {
          if ((((PackageInfo)localObject2).applicationInfo.flags & 0x1) != 0)
          {
            localPInfo = new PInfo();
            localPInfo.appname = ((PackageInfo)localObject2).applicationInfo.loadLabel(paramActivity.getPackageManager()).toString();
            localPInfo.pname = ((PackageInfo)localObject2).packageName;
            localPInfo.versionName = ((PackageInfo)localObject2).versionName;
            localPInfo.versionCode = ((PackageInfo)localObject2).versionCode;
            localArrayList.add(localPInfo);
          }
        }
        else if ((paramInt == 2) && ((((PackageInfo)localObject2).applicationInfo.flags & 0x1) == 0))
        {
          localPInfo = new PInfo();
          localPInfo.appname = ((PackageInfo)localObject2).applicationInfo.loadLabel(paramActivity.getPackageManager()).toString();
          localPInfo.pname = ((PackageInfo)localObject2).packageName;
          localPInfo.versionName = ((PackageInfo)localObject2).versionName;
          localPInfo.versionCode = ((PackageInfo)localObject2).versionCode;
          localArrayList.add(localPInfo);
        }
      }
    }
    localObject1 = (PInfo)paramActivity.next();
    long l2;
    if (AppHandlerRecord.dataList.getString(((PInfo)localObject1).pname) != null)
    {
      l2 = Long.parseLong(AppHandlerRecord.dataList.getString(((PInfo)localObject1).pname));
      i = 0;
      localObject2 = localArrayList.iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject2).hasNext()) {}
      for (;;)
      {
        paramInt += 1;
        break;
        localPInfo = (PInfo)((Iterator)localObject2).next();
        long l1 = 0L;
        if (AppHandlerRecord.dataList.getString(localPInfo.pname) != null) {
          l1 = Long.parseLong(AppHandlerRecord.dataList.getString(localPInfo.pname));
        }
        if (l2 <= l1) {
          break label506;
        }
        localArrayList.set(i, localObject1);
        localArrayList.set(paramInt, localPInfo);
      }
      label506:
      i += 1;
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
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903086);
    this.view_con = ((LinearLayout)findViewById(2131230876));
    this.buttonSelectOther = ((Button)findViewById(2131230877));
    this.buttonUninstallAll = ((Button)findViewById(2131230879));
    this.buttonSelectClear = ((Button)findViewById(2131230878));
    this.buttonSelectOther.setOnClickListener(this.listener);
    this.buttonSelectClear.setOnClickListener(this.listener);
    this.buttonUninstallAll.setOnClickListener(this.listener);
    this.buttonUninstallAll.setText("一键清除数据");
    this.list = getInstalledApps(this, 2);
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
      if (paramBundle.get(localPInfo.appname) != null) {
        localCheckBox.setChecked(true);
      }
    }
  }
  
  protected void onDestroy()
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
        PoseHelper008.saveDataToFile("ClearApplicationDataActivity", JSON.toJSONString(localHashMap));
        return;
      }
      Object localObject = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = (CheckBox)((Map.Entry)localObject).getValue();
      if (((CheckBox)localObject).isChecked())
      {
        localObject = (PInfo)((CheckBox)localObject).getTag();
        localHashMap.put(((PInfo)localObject).appname, ((PInfo)localObject).appname);
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
}


