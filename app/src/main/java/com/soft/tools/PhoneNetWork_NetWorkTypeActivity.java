package com.soft.tools;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.a.a.Map;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneNetWork_NetWorkTypeActivity
  extends Activity
{
  static ArrayList a = new ArrayList();
  HashMap b = new HashMap();
  private ListView c;
  private a d;
  private b e;
  private int f;
  
  public static String a(int paramInt)
  {
    paramInt -= 1;
    if ((a == null) || (a.size() == 0))
    {
      ArrayList localArrayList = new ArrayList();
      a = localArrayList;
      localArrayList.add("GPRS");
      a.add("EDGE");
      a.add("UMTS");
      a.add("CDMA");
      a.add("EVDO_0");
      a.add("EVDO_A");
      a.add("1xRTT");
      a.add("HSDPA");
      a.add("HSUPA");
      a.add("HSPA");
      a.add("IDEN");
      a.add("EVDO_B");
      a.add("LTE");
      a.add("EHRPD");
      a.add("HSPAP");
    }
    if ((paramInt < 0) || (paramInt > a.size())) {
      return "";
    }
    return (String)a.get(paramInt);
  }
  
  public final void a()
  {
    int k = 0;
    int j = 0;
    int i = 0;
    if (j >= this.e.size()) {
      j = k;
    }
    for (;;)
    {
      if (j >= this.e.size())
      {
        this.d.notifyDataSetChanged();
        return;
        i += this.e.a(j).g("progress").intValue();
        j += 1;
        break;
      }
      Map locale = this.e.a(j);
      locale.putkey("precent", Integer.valueOf(locale.g("progress").intValue() * 100 / i));
      j += 1;
    }
  }
  
  public final String b(int paramInt)
  {
    return (String)this.b.get(Integer.valueOf(paramInt));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.c = new ListView(this);
    this.d = new a();
    setContentView(this.c);
    int i = getIntent().getIntExtra("kind", 0);
    this.f = i;
    if (i == 0)
    {
      this.e = PhoneNetWorkActivity.a(i);
      setTitle("设置移动网络数据比例");
    }
    for (;;)
    {
      if (this.e == null) {
        this.e = new b();
      }
      this.c.setAdapter(this.d);
      this.b.put(Integer.valueOf(1), "NETWORK_TYPE_GPRS");
      this.b.put(Integer.valueOf(2), "NETWORK_TYPE_EDGE");
      this.b.put(Integer.valueOf(3), "NETWORK_TYPE_UMTS");
      this.b.put(Integer.valueOf(4), "NETWORK_TYPE_CDMA");
      this.b.put(Integer.valueOf(5), "NETWORK_TYPE_EVDO_0");
      this.b.put(Integer.valueOf(6), "NETWORK_TYPE_EVDO_A");
      this.b.put(Integer.valueOf(7), "NETWORK_TYPE_1xRTT");
      this.b.put(Integer.valueOf(8), "NETWORK_TYPE_HSDPA");
      this.b.put(Integer.valueOf(9), "NETWORK_TYPE_HSUPA");
      this.b.put(Integer.valueOf(10), "NETWORK_TYPE_HSPA");
      this.b.put(Integer.valueOf(11), "NETWORK_TYPE_IDEN");
      this.b.put(Integer.valueOf(12), "NETWORK_TYPE_EVDO_B");
      this.b.put(Integer.valueOf(13), "NETWORK_TYPE_LTE");
      this.b.put(Integer.valueOf(14), "NETWORK_TYPE_EHRPD");
      this.b.put(Integer.valueOf(15), "NETWORK_TYPE_HSPAP");
      a();
      return;
      if (i == 1)
      {
        this.e = PhoneNetWorkActivity.a(i);
        setTitle("设置电信网络数据比例");
      }
      else if (i == 2)
      {
        this.e = PhoneNetWorkActivity.a(i);
        setTitle("设置联通数据网络比例");
      }
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296273, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    AlertDialog.Builder localBuilder;
    Spinner localSpinner;
    ArrayList localArrayList;
    int i;
    if (paramMenuItem.getItemId() == 2131362305)
    {
      localBuilder = new AlertDialog.Builder(this);
      localBuilder.setTitle("添加数据");
      localSpinner = new Spinner(this);
      localBuilder.setView(localSpinner);
      localArrayList = new ArrayList();
      i = 1;
    }
    for (;;)
    {
      if (i > 15)
      {
        localSpinner.setAdapter(new ArrayAdapter(this, 17367048, localArrayList));
        localBuilder.setPositiveButton("确定", new ch(this, localSpinner));
        localBuilder.create().show();
        return super.onOptionsItemSelected(paramMenuItem);
      }
      localArrayList.add((String)this.b.get(Integer.valueOf(i)));
      i += 1;
    }
  }
  
  protected void onPause()
  {
    PhoneNetWorkActivity.a(this.f, this.e);
    super.onPause();
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return PhoneNetWork_NetWorkTypeActivity.a(PhoneNetWork_NetWorkTypeActivity.this).size();
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
      Map locale = PhoneNetWork_NetWorkTypeActivity.a(PhoneNetWork_NetWorkTypeActivity.this).a(paramInt);
      paramInt = locale.h("value");
      int i = locale.h("progress");
      int j = locale.h("precent");
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = PhoneNetWork_NetWorkTypeActivity.this.getLayoutInflater().inflate(2130903105, null);
        paramView = new PhoneNetWork_NetWorkTypeActivity.b(PhoneNetWork_NetWorkTypeActivity.this);
        paramView.a = ((TextView)paramViewGroup.findViewById(2131362118));
        paramView.b = ((TextView)paramViewGroup.findViewById(2131362119));
        paramView.c = ((SeekBar)paramViewGroup.findViewById(2131362120));
        paramViewGroup.setTag(paramView);
      }
      paramView = (PhoneNetWork_NetWorkTypeActivity.b)paramViewGroup.getTag();
      paramView.c.setMax(1000);
      paramView.a.setText(PhoneNetWork_NetWorkTypeActivity.this.b(paramInt));
      paramView.b.setText(j + "%");
      paramView.c.setProgress(i);
      paramView.c.setOnSeekBarChangeListener(new ci(this, locale));
      return paramViewGroup;
    }
  }
  
  final class b
  {
    public TextView a;
    public TextView b;
    public SeekBar c;
    
    b() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.PhoneNetWork_NetWorkTypeActivity

 * JD-Core Version:    0.7.0.1

 */