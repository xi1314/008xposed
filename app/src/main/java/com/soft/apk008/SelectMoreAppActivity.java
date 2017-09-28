package com.soft.apk008;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioButton;

import com.a.a.Map;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.ArrayList;

public class SelectMoreAppActivity
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
  private RadioButton i;
  private RadioButton j;
  private View.OnClickListener k = new az(this);
  
  protected void onCreate(Bundle paramBundle)
  {
    int m = 0;
    super.onCreate(paramBundle);
    setContentView(2130903074);
    this.a = findViewById(2131361996);
    this.b = findViewById(2131361997);
    this.c = findViewById(2131361999);
    this.d = findViewById(2131361998);
    this.e = ((ListView)findViewById(2131361995));
    this.a.setOnClickListener(this.k);
    this.b.setOnClickListener(this.k);
    this.c.setOnClickListener(this.k);
    this.d.setOnClickListener(this.k);
    this.i = ((RadioButton)findViewById(2131362000));
    this.j = ((RadioButton)findViewById(2131362001));
    this.i.setChecked(true);
    paramBundle = PoseHelper008.getFileData("select_more_app");
    if ((paramBundle != null) && (paramBundle.length() != 0)) {}
    try
    {
      this.f = e.b(paramBundle);
      if (this.f == null) {
        this.f = new Map();
      }
      paramBundle = getPackageManager().getInstalledPackages(0);
      if (m >= paramBundle.size())
      {
        this.e.setAdapter(this.h);
        if (PoseHelper008.getFileData("008Mode").equals("5")) {
          this.j.setChecked(true);
        }
        return;
      }
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        paramBundle.printStackTrace();
        continue;
        PackageInfo localPackageInfo = (PackageInfo)paramBundle.get(m);
        if ((localPackageInfo.applicationInfo.flags & 0x1) == 0)
        {
          a locala = new a();
          locala.a = localPackageInfo.applicationInfo.loadLabel(getPackageManager()).toString();
          locala.c = localPackageInfo.packageName.trim();
          this.g.add(locala);
        }
        m += 1;
      }
    }
  }
  
  protected void onDestroy()
  {
    PoseHelper008.saveDataToFile("select_more_app", this.f.a());
    super.onDestroy();
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return SelectMoreAppActivity.h(SelectMoreAppActivity.this).size();
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
        paramView = new CheckBox(SelectMoreAppActivity.this);
      }
      for (;;)
      {
        paramViewGroup = (a)SelectMoreAppActivity.h(SelectMoreAppActivity.this).get(paramInt);
        CheckBox localCheckBox = (CheckBox)paramView;
        localCheckBox.setOnCheckedChangeListener(null);
        localCheckBox.setText(paramViewGroup.a);
        if (SelectMoreAppActivity.b(SelectMoreAppActivity.this).containsKey(paramViewGroup.c)) {
          localCheckBox.setChecked(true);
        }
        for (;;)
        {
          localCheckBox.setOnCheckedChangeListener(new ba(this, paramViewGroup));
          return paramView;
          localCheckBox.setChecked(false);
        }
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.SelectMoreAppActivity

 * JD-Core Version:    0.7.0.1

 */