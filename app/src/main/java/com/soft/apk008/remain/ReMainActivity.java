package com.soft.apk008.remain;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.a.a.Map;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.ArrayList;
import java.util.Iterator;

public class ReMainActivity
  extends Activity
{
  com.a.a.b a = new com.a.a.b();
  View.OnClickListener b = new a(this);
  private Button c;
  private ListView d;
  private Button e;
  private ProgressBar f;
  private a g;
  private TextView h;
  private Button i;
  private Dialog j;
  
  public final void a()
  {
    Iterator localIterator = this.a.iterator();
    int k = 0;
    int m = 0;
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        n = (int)(m * 100 / k);
        this.h.setText("当前：" + m + ",总共:" + k + "  进度为：" + n + "%");
        this.f.setMax(k);
        this.f.setProgress(m);
        return;
      }
      Map locale = (Map)localIterator.next();
      m += locale.h("nowProgess");
      k += locale.h("count");
      int n = (int)(locale.h("nowProgess") * 100 / k);
      locale.putkey("statusText", "当前为：" + locale.h("nowProgess") + "个，进度为" + n + "%");
    }
  }
  
  public final void a(int paramInt)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("注意");
    localBuilder.setMessage("是否删除当前留存");
    localBuilder.setNegativeButton("确定", new c(this, paramInt));
    localBuilder.setPositiveButton("取消", new d(this));
    this.j = localBuilder.create();
    this.j.show();
  }
  
  public final void a(int paramInt, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("name", paramString);
    localIntent.putExtra("progress", paramInt);
    setResult(1, localIntent);
    finish();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramIntent != null))
    {
      paramIntent = paramIntent.getStringExtra("name");
      ArrayList localArrayList = (ArrayList)com.lishu.b.a.a.a.get(paramIntent);
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
      Object localObject = LayoutInflater.from(this).inflate(2130903055, null);
      localBuilder.setView((View)localObject);
      localBuilder.setTitle("设置留存");
      TextView localTextView1 = (TextView)((View)localObject).findViewById(2131361875);
      TextView localTextView2 = (TextView)((View)localObject).findViewById(2131361878);
      localObject = (EditText)((View)localObject).findViewById(2131361877);
      localTextView1.setText("请输入：");
      localTextView2.setText("留存为1-100以内的数值");
      localBuilder.setNegativeButton("确定", new e(this, (EditText)localObject, localArrayList, paramIntent));
      localBuilder.setPositiveButton("取消", new f(this));
      localBuilder.create().show();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903054);
    this.d = ((ListView)findViewById(2131361869));
    this.c = ((Button)findViewById(2131361872));
    this.e = ((Button)findViewById(2131361873));
    this.f = ((ProgressBar)findViewById(2131361870));
    this.h = ((TextView)findViewById(2131361871));
    this.i = ((Button)findViewById(2131361874));
    this.a = com.a.a.b.c(PoseHelper008.getFileData("ReMainActivity"));
    if (this.a == null) {
      this.a = new com.a.a.b();
    }
    paramBundle = new com.a.a.b();
    Object localObject1 = com.lishu.b.a.a.b();
    Iterator localIterator = this.a.iterator();
    if (!localIterator.hasNext()) {
      paramBundle = paramBundle.iterator();
    }
    for (;;)
    {
      if (!paramBundle.hasNext())
      {
        a();
        this.g = new a();
        this.d.setAdapter(this.g);
        this.e.setOnClickListener(this.b);
        this.c.setOnClickListener(this.b);
        this.i.setOnClickListener(this.b);
        this.d.setOnItemLongClickListener(new b(this));
        return;
        Object localObject2 = localIterator.next();
        String str = ((Map)localObject2).getStringfrommap("titleText");
        int m = localObject1.length;
        int k = 0;
        for (;;)
        {
          if (k >= m) {}
          for (k = 0;; k = 1)
          {
            if (k != 0) {
              break label313;
            }
            paramBundle.add(localObject2);
            break;
            if (!str.equals(localObject1[k])) {
              break label315;
            }
          }
          label313:
          break;
          label315:
          k += 1;
        }
      }
      localObject1 = paramBundle.next();
      this.a.remove(localObject1);
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296258, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    PoseHelper008.saveDataToFile("ReMainActivity", this.a.a());
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362275)
    {
      paramMenuItem = new Intent();
      paramMenuItem.setClass(this, RecordSelectActivity.class);
      startActivityForResult(paramMenuItem, 1);
    }
    return true;
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return ReMainActivity.this.a.size();
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
        paramViewGroup = LayoutInflater.from(ReMainActivity.this).inflate(2130903056, null);
        paramView = new ReMainActivity.b(ReMainActivity.this);
        paramViewGroup.setTag(paramView);
        paramView.a = ((TextView)paramViewGroup.findViewById(2131361880));
        paramView.b = ((ProgressBar)paramViewGroup.findViewById(2131361881));
        paramView.c = ((TextView)paramViewGroup.findViewById(2131361882));
        paramView.d = ((TextView)paramViewGroup.findViewById(2131361879));
      }
      paramView = (ReMainActivity.b)paramViewGroup.getTag();
      Map locale = (Map)ReMainActivity.this.a.get(paramInt);
      paramView.a.setText(locale.getStringfrommap("askText"));
      paramView.c.setText(locale.getStringfrommap("statusText"));
      paramView.d.setText(locale.getStringfrommap("titleText"));
      paramInt = Integer.parseInt(locale.getStringfrommap("nowProgess"));
      int i = Integer.parseInt(locale.getStringfrommap("count"));
      paramView.b.setMax(i);
      paramView.b.setProgress(paramInt);
      return paramViewGroup;
    }
  }
  
  final class b
  {
    public TextView a;
    public ProgressBar b;
    public TextView c;
    public TextView d;
    
    b() {}
  }
}


