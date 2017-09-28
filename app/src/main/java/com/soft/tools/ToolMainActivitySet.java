package com.soft.tools;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;

import com.a.a.Map;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class ToolMainActivitySet
  extends Activity
{
  private static Map c;
  private ListView a;
  private a b;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = new ListView(this);
    setContentView(this.a);
    this.b = new a();
    this.a.setAdapter(this.b);
    paramBundle = PoseHelper008.getFileData("ToolMainActivitySet");
    try
    {
      c = a.b(paramBundle);
      label61:
      if (c == null) {
        c = new Map();
      }
      setTitle("设置是否可见");
      return;
    }
    catch (Exception paramBundle)
    {
      break label61;
    }
  }
  
  protected void onPause()
  {
    PoseHelper008.saveDataToFile("ToolMainActivitySet", c.a());
    super.onPause();
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return ToolMainActivity.a.size();
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
        paramView = new CheckBox(ToolMainActivitySet.this);
      }
      for (;;)
      {
        paramView = (CheckBox)paramView;
        paramViewGroup = (String)ToolMainActivity.a.get(paramInt);
        paramView.setText(paramViewGroup);
        paramViewGroup = ToolMainActivitySet.a().j(paramViewGroup);
        if ((paramViewGroup == null) || (paramViewGroup.equals("true"))) {
          paramView.setChecked(true);
        }
        for (;;)
        {
          paramView.setOnCheckedChangeListener(new eu(this, paramView));
          return paramView;
          paramView.setChecked(false);
        }
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.ToolMainActivitySet

 * JD-Core Version:    0.7.0.1

 */