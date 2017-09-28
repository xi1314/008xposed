package com.soft.tools.otherSystemValue;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.a.a.Map;
import com.a.a.maputils;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class OtherSystemValueActivity
  extends Activity
{
  private static b c;
  private ListView a;
  private a b;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903106);
    this.a = ((ListView)findViewById(2131362121));
    this.b = new a();
    if (c == null) {
      paramBundle = PoseHelper008.getFileData("otherSystemValue");
    }
    try
    {
      c = maputils.c(paramBundle);
      label55:
      if (c == null) {
        c = new b();
      }
      return;
    }
    catch (Exception paramBundle)
    {
      break label55;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296275, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    PoseHelper008.saveDataToFile("otherSystemValue", c.a());
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362307)
    {
      Intent localIntent = new Intent();
      localIntent.setClass(this, SystemItemAddActivity.class);
      startActivity(localIntent);
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return OtherSystemValueActivity.a().size();
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
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = LayoutInflater.from(OtherSystemValueActivity.this).inflate(2130903108, null);
        paramView = new OtherSystemValueActivity.b(OtherSystemValueActivity.this);
        paramView.a = ((TextView)paramViewGroup.findViewById(2131362123));
        paramView.b = ((TextView)paramViewGroup.findViewById(2131362124));
        paramView.c = ((Button)paramViewGroup.findViewById(2131362125));
        paramViewGroup.setTag(paramView);
      }
      paramView = (OtherSystemValueActivity.b)paramViewGroup.getTag();
      Map locale = OtherSystemValueActivity.a().a(paramInt);
      String str1 = locale.get("name");
      String str2 = locale.get("value");
      String str3 = locale.get("status");
      paramView.a.setText(str1);
      paramView.b.setText(str2);
      if (str3.equals("1")) {
        paramView.c.setText("模式：设置值");
      }
      for (;;)
      {
        paramView.c.setOnClickListener(new a(this, locale));
        return paramViewGroup;
        if (str3.equals("2")) {
          paramView.c.setText("模式：随机值");
        } else if (str3.equals("3")) {
          paramView.c.setText("模式：随机设置值");
        }
      }
    }
  }
  
  final class b
  {
    TextView a;
    TextView b;
    Button c;
    
    b() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.otherSystemValue.OtherSystemValueActivity

 * JD-Core Version:    0.7.0.1

 */