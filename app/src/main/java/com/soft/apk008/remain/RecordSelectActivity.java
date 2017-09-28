package com.soft.apk008.remain;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.lishu.b.a.a;
import java.util.ArrayList;
import java.util.HashMap;

public class RecordSelectActivity
  extends Activity
{
  private ListView a;
  private ArrayList b = new ArrayList();
  private a c;
  
  private void a()
  {
    String[] arrayOfString = a.b();
    this.b.clear();
    int j = arrayOfString.length;
    int i = 0;
    for (;;)
    {
      if (i >= j)
      {
        this.c.notifyDataSetChanged();
        return;
      }
      String str = arrayOfString[i];
      ArrayList localArrayList = (ArrayList)a.a.get(str);
      if (localArrayList != null)
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("name", str);
        localHashMap.put("count", localArrayList.size() + "个");
        this.b.add(localHashMap);
      }
      i += 1;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903057);
    this.a = ((ListView)findViewById(2131361883));
    this.c = new a();
    this.a.setAdapter(this.c);
    a();
    this.a.setOnItemClickListener(new g(this));
    this.a.setOnItemLongClickListener(new h(this));
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296278, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362314)
    {
      paramMenuItem = new AlertDialog.Builder(this);
      paramMenuItem.setTitle("注意");
      paramMenuItem.setMessage("是否删除本机所有分类");
      paramMenuItem.setPositiveButton("确定", new m(this));
      paramMenuItem.create().show();
    }
    return true;
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return RecordSelectActivity.a(RecordSelectActivity.this).size();
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
        paramViewGroup = LayoutInflater.from(RecordSelectActivity.this).inflate(2130903058, null);
        paramView = new RecordSelectActivity.b(RecordSelectActivity.this);
        paramViewGroup.setTag(paramView);
        paramView.a = ((TextView)paramViewGroup.findViewById(2131361884));
        paramView.b = ((TextView)paramViewGroup.findViewById(2131361885));
      }
      paramView = (RecordSelectActivity.b)paramViewGroup.getTag();
      Object localObject = (HashMap)RecordSelectActivity.a(RecordSelectActivity.this).get(paramInt);
      String str = (String)((HashMap)localObject).get("name");
      localObject = (String)((HashMap)localObject).get("count");
      paramView.b.setText((CharSequence)localObject);
      paramView.a.setText(str);
      return paramViewGroup;
    }
  }
  
  final class b
  {
    public TextView a;
    public TextView b;
    
    b() {}
  }
}

