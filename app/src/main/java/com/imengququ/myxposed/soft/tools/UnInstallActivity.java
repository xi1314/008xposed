package com.imengququ.myxposed.soft.tools;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.soft.apk008.SetDataActivity;
import com.soft.apk008.StartActivity;
import de.robv.android.xposed.mods.tutorial.CheckCanUse;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import de.robv.android.xposed.mods.tutorial.Shell;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UnInstallActivity
  extends Activity
{
  public static final String fileName = "UnInstallActivity";
  private Button buttonSelectClear;
  private Button buttonSelectOther;
  private Button buttonUninstallAll;
  public HashMap<String, CheckBox> checkMap = new HashMap();
  ArrayList<PInfo> list;
  OnClickListener listener = new OnClickListener()
  {
    public void onClick(View View)
    {
      if (UnInstallActivity.this.buttonSelectOther.equals(View))
      {
        paramAnonymousView = UnInstallActivity.this.checkMap.entrySet().iterator();
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
          if (!UnInstallActivity.this.buttonSelectClear.equals(paramAnonymousView)) {
            break label169;
          }
          paramAnonymousView = UnInstallActivity.this.checkMap.entrySet().iterator();
          while (paramAnonymousView.hasNext())
          {
            localObject = (Map.Entry)paramAnonymousView.next();
            str = (String)((Map.Entry)localObject).getKey();
            ((CheckBox)((Map.Entry)localObject).getValue()).setChecked(false);
          }
        }
      } while (!UnInstallActivity.this.buttonUninstallAll.equals(paramAnonymousView));
      new Thread()
      {
        public void run()
        {
          UnInstallActivity.this.saveChecked();
          Iterator localIterator = UnInstallActivity.this.checkMap.entrySet().iterator();
          do
          {
            if (!localIterator.hasNext())
            {
              UnInstallActivity.this.runOnUiThread(new Runnable()
              {
                public void run()
                {
                  UnInstallActivity.this.onResume();
                  Toast.makeText(UnInstallActivity.this, "卸载完成", 0).show();
                }
              });
              return;
            }
            localObject1 = (Map.Entry)localIterator.next();
            localObject2 = (String)((Map.Entry)localObject1).getKey();
            localObject1 = (CheckBox)((Map.Entry)localObject1).getValue();
          } while (!((CheckBox)localObject1).isChecked());
          Object localObject1 = (PInfo)((CheckBox)localObject1).getTag();
          Shell.execCommand("pm uninstall " + PInfo.access$0((PInfo)localObject1), true, false);
          Object localObject2 = UnInstallActivity.this.getPackageManager();
          for (;;)
          {
            try
            {
              ApplicationInfo localApplicationInfo = ((PackageManager)localObject2).getApplicationInfo(PInfo.access$0((PInfo)localObject1), 128);
              if (localApplicationInfo != null) {
                continue;
              }
            }
            catch (NameNotFoundException localNameNotFoundException)
            {
              localNameNotFoundException.printStackTrace();
              continue;
            }
            catch (InterruptedException localInterruptedException)
            {
              localInterruptedException.printStackTrace();
              continue;
            }
            localObject2 = PInfo.access$1((PInfo)localObject1);
            AppHandlerRecord.addAppHandler(PInfo.access$0((PInfo)localObject1));
            UnInstallActivity.this.runOnUiThread(new Runnable()
            {
              public void run()
              {
                Toast.makeText(UnInstallActivity.this, "卸载" + this.val$apName + "成功", 0).show();
              }
            });
            break;
            Thread.sleep(300L);
          }
        }
      }.start();
    }
  };
  boolean saved = false;
  private LinearLayout view_con;
  
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
    String str = PoseHelper008.getFileData("UnInstallActivity");
    if (str.trim().length() == 0) {
      return new JSONObject();
    }
    return JSONObject.parseObject(str);
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
    setContentView(2130903086);
    this.view_con = ((LinearLayout)findViewById(2131230876));
    this.buttonSelectOther = ((Button)findViewById(2131230877));
    this.buttonUninstallAll = ((Button)findViewById(2131230879));
    this.buttonSelectClear = ((Button)findViewById(2131230878));
    this.buttonSelectOther.setOnClickListener(this.listener);
    this.buttonUninstallAll.setOnClickListener(this.listener);
    this.buttonSelectClear.setOnClickListener(this.listener);
    paramBundle = "a";
    int i = 0;
    for (;;)
    {
      if (i >= SetDataActivity.c.length()) {
        return;
      }
      paramBundle = paramBundle + CheckCanUse.a.length();
      i += 1;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131165189, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    if (!this.saved) {
      saveChecked();
    }
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131230981)
    {
      if (!StartActivity.isVip) {
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
    this.checkMap.clear();
    this.view_con.removeAllViews();
    this.list = getInstalledApps(2);
    JSONObject localJSONObject1 = getChecked();
    JSONObject localJSONObject2 = UnInstallWhiteActivity.getChecked();
    Iterator localIterator = this.list.iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        super.onResume();
        return;
      }
      PInfo localPInfo = (PInfo)localIterator.next();
      String str = localPInfo.appname;
      if ((!StartActivity.isVip) || (localJSONObject2.get(localPInfo.pname) == null))
      {
        CheckBox localCheckBox = addCheckBox(str);
        localCheckBox.setTag(localPInfo);
        this.checkMap.put(str, localCheckBox);
        if (localJSONObject1.get(localPInfo.pname) != null) {
          localCheckBox.setChecked(true);
        }
      }
    }
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
        PoseHelper008.saveDataToFile("UnInstallActivity", JSON.toJSONString(localHashMap));
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

