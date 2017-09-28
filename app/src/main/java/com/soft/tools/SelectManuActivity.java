package com.soft.tools;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;

import com.a.a.Map;
import com.a.a.b;
import com.a.a.maputils;
import com.lishu.c.p;
import com.lishu.c.w;
import com.soft.apk008.StartActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class SelectManuActivity
  extends Activity
  implements w
{
  static Map c = null;
  private static String e = "SelectManuActivity";
  String a = StartActivity.b + "/phone/LogicSimpleAction.action";
  b b = null;
  private ListView d;
  private p f = new p();
  private a g;
  
  public static String a()
  {
    if (c == null) {
      b();
    }
    Object localObject = c.entrySet();
    if (((Set)localObject).size() == 0) {
      return "";
    }
    String[] arrayOfString = new String[((Set)localObject).size()];
    localObject = ((Set)localObject).iterator();
    int i = 0;
    for (;;)
    {
      if (!((Iterator)localObject).hasNext()) {
        return arrayOfString[com.data.simulate.SimulateDataTest.random.nextInt(arrayOfString.length)];
      }
      arrayOfString[i] = ((String)((Map.Entry)((Iterator)localObject).next()).getKey());
      i += 1;
    }
  }
  
  private static void b()
  {
    String str = PoseHelper008.getFileData(e);
    if (str.length() > 0) {
      try
      {
        c = maputils.getmap(str);
        return;
      }
      catch (Exception localException) {}
    }
    c = new Map();
  }
  
  public final void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.lishu.c.a.c(this, "获取数据失败，请重试");
      return;
    }
    this.b = maputils.c(paramString);
    runOnUiThread(new eh(this));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903118);
    b();
    this.d = ((ListView)findViewById(2131362175));
    this.b = new b();
    this.g = new a();
    this.d.setAdapter(this.g);
    paramBundle = new HashMap();
    paramBundle.put("action", "getMANUFACTURERList");
    paramBundle.putAll(StartActivity.b());
    new p().a(this.a, paramBundle, this);
  }
  
  protected void onPause()
  {
    super.onPause();
    PoseHelper008.saveDataToFile(e, c.a());
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return SelectManuActivity.this.b.size();
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
        paramView = new CheckBox(SelectManuActivity.this);
      }
      for (;;)
      {
        paramView = (CheckBox)paramView;
        paramViewGroup = SelectManuActivity.this.b.e(paramInt);
        paramView.setText(paramViewGroup);
        if (SelectManuActivity.c.containsKey(paramViewGroup)) {
          paramView.setChecked(true);
        }
        for (;;)
        {
          paramView.setOnCheckedChangeListener(new ei(this));
          return paramView;
          paramView.setChecked(false);
        }
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.SelectManuActivity

 * JD-Core Version:    0.7.0.1

 */