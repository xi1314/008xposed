package com.imengququ.myxposed.soft.tools;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.soft.toos.findApp.QuickFindActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HideProgressActivity
  extends Activity
{
  public static final String fileName = "hideProgess";
  private JSONObject appMap;
  private CheckBox checkBox;
  public HashMap<String, CheckBox> checkMap = new HashMap();
  private JSONObject data;
  private EditText hide_target;
  private ArrayList<PInfo> list;
  private ViewGroup view_con;
  
  public CheckBox addCheckBox(String paramString)
  {
    CheckBox localCheckBox = new CheckBox(this);
    localCheckBox.setText(paramString);
   LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
    this.view_con.addView(localCheckBox, layoutParams);
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
      if (paramInt == 1)
      {
        localObject3 = new PInfo();
        ((PInfo)localObject3).appname = ((PackageInfo)localObject2).applicationInfo.loadLabel(getPackageManager()).toString();
        ((PInfo)localObject3).pname = ((PackageInfo)localObject2).packageName;
        ((PInfo)localObject3).versionName = ((PackageInfo)localObject2).versionName;
        ((PInfo)localObject3).versionCode = ((PackageInfo)localObject2).versionCode;
        localArrayList.add(localObject3);
      }
      for (;;)
      {
        i += 1;
        break;
        if (paramInt == 3)
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
          break label470;
        }
        localArrayList.set(i, localObject2);
        localArrayList.set(paramInt, localPInfo);
      }
      label470:
      i += 1;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent != null)
    {
      paramIntent = paramIntent.getStringExtra("packageName");
      if (paramIntent != null) {
        this.hide_target.setText(paramIntent);
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903074);
    paramBundle = (Button)findViewById(2131230884);
    this.view_con = ((ViewGroup)findViewById(2131230886));
    this.hide_target = ((EditText)findViewById(2131230883));
    this.checkBox = ((CheckBox)findViewById(2131230885));
    paramBundle.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(HideProgressActivity.this, QuickFindActivity.class);
        HideProgressActivity.this.startActivityForResult(paramAnonymousView, 0);
      }
    });
    this.data = JSON.parseObject(PoseHelper008.getFileData("hideProgess"));
    if (this.data == null) {
      this.data = new JSONObject();
    }
    if (this.data.get("appArray") == null)
    {
      this.appMap = new JSONObject();
      this.data.put("appArray", this.appMap);
      this.list = getInstalledApps(2);
      paramBundle = this.list.iterator();
    }
    for (;;)
    {
      if (!paramBundle.hasNext())
      {
        if (this.data.get("hide_target") != null)
        {
          paramBundle = this.data.get("hide_target");
          this.hide_target.setText(paramBundle);
        }
        this.checkBox.setChecked(false);
        if ((this.data.get("ifOpen") != null) && (this.data.get("ifOpen").equals("true"))) {
          this.checkBox.setChecked(true);
        }
        return;
        this.appMap = ((JSONObject)this.data.get("appArray"));
        break;
      }
      PInfo localPInfo = (PInfo)paramBundle.next();
      String str = localPInfo.appname;
      CheckBox localCheckBox = addCheckBox(str);
      localCheckBox.setTag(localPInfo);
      this.checkMap.put(str, localCheckBox);
      if (this.appMap.get(localPInfo.pname) != null) {
        localCheckBox.setChecked(true);
      }
    }
  }
  
  protected void onDestroy()
  {
    Object localObject1 = this.checkMap.entrySet();
    this.data.put("hide_target", this.hide_target.getText());
    if (this.checkBox.isChecked())
    {
      this.data.put("ifOpen", "true");
      this.appMap.clear();
      localObject1 = ((Set)localObject1).iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject1).hasNext())
      {
        PoseHelper008.saveDataToFile("hideProgess", JSON.toJSONString(this.data));
        super.onDestroy();
        return;
        this.data.put("ifOpen", "false");
        break;
      }
      Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
      String str = (String)((Map.Entry)localObject2).getKey();
      localObject2 = (CheckBox)((Map.Entry)localObject2).getValue();
      if (((CheckBox)localObject2).isChecked())
      {
        localObject2 = (PInfo)((CheckBox)localObject2).getTag();
        this.appMap.put(((PInfo)localObject2).pname, ((PInfo)localObject2).appname);
      }
    }
  }
  
  class PInfo
  {
    private String appname = "";
    private Drawable icon;
    private String pname = "";
    private long time;
    private int versionCode = 0;
    private String versionName = "";
    
    PInfo() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     HideProgressActivity

 * JD-Core Version:    0.7.0.1

 */