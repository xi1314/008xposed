package com.soft.tools;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;

import com.a.a.Map;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.ArrayList;

public class BackUp_SelectMoreAppActivity
  extends Activity
{
  private View a;
  private View b;
  private View c;
  private View d;
  private ListView e;
  private Map f;
  private ArrayList g = new ArrayList();
  private a h = new a();
  private View.OnClickListener i = new b(this);
  
  protected void onCreate(Bundle paramBundle)
  {
    int j = 0;
    super.onCreate(paramBundle);
    setContentView(2130903083);
    this.a = findViewById(2131362025);
    this.b = findViewById(2131362026);
    this.c = findViewById(2131362028);
    this.d = findViewById(2131362027);
    this.e = ((ListView)findViewById(2131362024));
    this.a.setOnClickListener(this.i);
    this.b.setOnClickListener(this.i);
    this.c.setOnClickListener(this.i);
    this.d.setOnClickListener(this.i);
    paramBundle = PoseHelper008.getFileData("backup_select_more_app");
    if ((paramBundle != null) && (paramBundle.length() != 0)) {}
    try
    {
      this.f = e.b(paramBundle);
      if (this.f == null) {
        this.f = new Map();
      }
      paramBundle = getPackageManager().getInstalledPackages(0);
      if (j >= paramBundle.size())
      {
        this.e.setAdapter(this.h);
        return;
      }
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        paramBundle.printStackTrace();
        continue;
        PackageInfo localPackageInfo = (PackageInfo)paramBundle.get(j);
        if ((localPackageInfo.applicationInfo.flags & 0x1) == 0)
        {
          a locala = new a();
          locala.a = localPackageInfo.applicationInfo.loadLabel(getPackageManager()).toString();
          locala.c = localPackageInfo.packageName.trim();
          this.g.add(locala);
        }
        j += 1;
      }
    }
  }
  
  protected void onDestroy()
  {
    PoseHelper008.saveDataToFile("backup_select_more_app", this.f.a());
    super.onDestroy();
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return BackUp_SelectMoreAppActivity.g(BackUp_SelectMoreAppActivity.this).size();
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
        paramView = new CheckBox(BackUp_SelectMoreAppActivity.this);
      }
      for (;;)
      {
        paramViewGroup = (a)BackUp_SelectMoreAppActivity.g(BackUp_SelectMoreAppActivity.this).get(paramInt);
        CheckBox localCheckBox = (CheckBox)paramView;
        localCheckBox.setOnCheckedChangeListener(null);
        localCheckBox.setText(paramViewGroup.a);
        if (BackUp_SelectMoreAppActivity.b(BackUp_SelectMoreAppActivity.this).containsKey(paramViewGroup.c)) {
          localCheckBox.setChecked(true);
        }
        for (;;)
        {
          localCheckBox.setOnCheckedChangeListener(new c(this, paramViewGroup));
          return paramView;
          localCheckBox.setChecked(false);
        }
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.BackUp_SelectMoreAppActivity

 * JD-Core Version:    0.7.0.1

 */