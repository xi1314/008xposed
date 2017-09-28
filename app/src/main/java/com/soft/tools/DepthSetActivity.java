package com.soft.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;

import com.a.a.Map;
import com.soft.apk008.SetMessageActivity;
import com.soft.apk008.StartActivity;
import com.soft.apk008.WebMessageActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.ArrayList;

public class DepthSetActivity
  extends Activity
{
  private static Map dmap;
  ArrayList a = null;
  private ListView b;
  private a c;
  
  public static boolean isexistkey(String paramString)
  {
    String str;
    if (dmap == null) {
      str = PoseHelper008.getFileData("DepthSetActivity");
    }
    try
    {
      dmap = Map.getmap(str);
      label19:
      if (dmap == null) {
        dmap = new Map();
      }
      return dmap.containsKey(paramString);
    }
    catch (Exception localException)
    {
      break label19;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.b = new ListView(this);
    setContentView(this.b);
    this.c = new a();
    this.a = new ArrayList();
    this.a.add("Fuc_ActivityManager");
    this.a.add("Fuc_PackageManager");
    this.a.add("Fuc_PackageStats");
    this.a.add("Fuc_Process");
    SetMessageActivity.a(this);
    this.b.setAdapter(this.c);
    String  paramstr = PoseHelper008.getFileData("DepthSetActivity");
    try
    {
      dmap = Map.getmap(paramstr);
      label116:
      if (dmap == null) {
        dmap = new Map();
      }
      return;
    }
    catch (Exception e)
    {
      break label116;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296265, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362293)
    {
      Intent localIntent = new Intent();
      localIntent.setClass(this, WebMessageActivity.class);
      localIntent.putExtra("url", StartActivity.b + "/phone/ContentAction.action?action=depthSetHelp");
      startActivity(localIntent);
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  protected void onPause()
  {
    PoseHelper008.saveDataToFile("DepthSetActivity", dmap.a());
    super.onPause();
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return DepthSetActivity.this.a.size();
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
        paramView = new CheckBox(DepthSetActivity.this);
      }
      for (;;)
      {
        paramView = (CheckBox)paramView;
        paramViewGroup = (String)DepthSetActivity.this.a.get(paramInt);
        paramView.setText(paramViewGroup);
        if (DepthSetActivity.isexistkey().get(paramViewGroup) != null) {
          paramView.setChecked(true);
        }
        for (;;)
        {
          paramView.setOnCheckedChangeListener(new af(this, paramView));
          return paramView;
          paramView.setChecked(false);
        }
      }
    }
  }
}

