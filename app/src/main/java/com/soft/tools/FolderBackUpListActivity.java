package com.soft.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;

public class FolderBackUpListActivity
  extends Activity
{
  View.OnClickListener a = new av(this);
  private ListView b;
  private Button c;
  private Button d;
  private String e = "/sdcard/008FolderBackUp";
  private a f;
  private ArrayList g;
  private ProgressDialog h;
  
  private void a()
  {
    this.g.clear();
    Object localObject1 = new File(this.e);
    int j;
    int i;
    if (((File)localObject1).exists())
    {
      localObject1 = ((File)localObject1).list();
      j = localObject1.length;
      i = 0;
    }
    for (;;)
    {
      if (i >= j)
      {
        this.f.notifyDataSetChanged();
        return;
      }
      Object localObject2 = localObject1[i];
      if (localObject2.endsWith(".tar")) {
        this.g.add(localObject2);
      }
      i += 1;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903093);
    this.b = ((ListView)findViewById(2131362075));
    this.c = ((Button)findViewById(2131362077));
    this.d = ((Button)findViewById(2131362076));
    this.c.setOnClickListener(this.a);
    this.d.setOnClickListener(this.a);
    this.g = new ArrayList();
    this.f = new a();
    this.b.setAdapter(this.f);
    this.b.setOnItemClickListener(new aw(this));
    a();
    this.h = new ProgressDialog(this);
    this.h.setMessage("操作进行中");
    this.h.setCancelable(false);
    this.h.show();
    this.h.hide();
  }
  
  protected void onResume()
  {
    a();
    super.onResume();
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return FolderBackUpListActivity.e(FolderBackUpListActivity.this).size();
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
        paramView = new TextView(FolderBackUpListActivity.this);
      }
      for (;;)
      {
        ((TextView)paramView).setText((CharSequence)FolderBackUpListActivity.e(FolderBackUpListActivity.this).get(paramInt));
        return paramView;
      }
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.FolderBackUpListActivity
 * JD-Core Version:    0.7.0.1
 */