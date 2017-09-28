package com.soft.tools;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.a.a.Map;
import com.a.a.maputils;
import com.lishu.c.p;
import com.lishu.c.x;
import com.soft.apk008.StartActivity;
import com.soft.apk008.WebMessageActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class IpRecordActivity
  extends Activity
{
  final String a = "ip_record";
  ProgressDialog b;
  String c = StartActivity.b + "/phone/LogicSimpleAction.action";
  p d = new p();
  x e = new x();
  private Button f;
  private TextView g;
  private ListView h;
  private a i;
  private b j;
  private TextView k;
  private Map l;
  private String m = StartActivity.b + "/phone/ContentAction.action?action=ipRecordHelp";
  
  private void a()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(StartActivity.b());
    localHashMap.put("action", "getIp");
    this.d.a(this.c, localHashMap, new bt(this));
  }
  
  public final void a(int paramInt)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("注意");
    localBuilder.setMessage("是否删除本条记录？");
    localBuilder.setNegativeButton("确定", new by(this, paramInt));
    localBuilder.setPositiveButton("取消", new bz(this));
    localBuilder.create().show();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903098);
    this.f = ((Button)findViewById(2131362091));
    this.g = ((TextView)findViewById(2131362090));
    this.h = ((ListView)findViewById(2131362093));
    this.k = ((TextView)findViewById(2131362092));
    this.b = new ProgressDialog(this);
    this.b.setMessage("加载中，请稍候");
    this.b.show();
    a();
    paramBundle = PoseHelper008.getFileData("ip_record");
    this.j = null;
    try
    {
      this.j = maputils.c(paramBundle);
      label115:
      if (this.j == null) {
        this.j = new b();
      }
      this.i = new a();
      this.h.setAdapter(this.i);
      this.f.setOnClickListener(new br(this));
      this.h.setOnItemLongClickListener(new bs(this));
      try
      {
        paramBundle = ViewConfiguration.get(this);
        Field localField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
        if (localField != null)
        {
          localField.setAccessible(true);
          localField.setBoolean(paramBundle, false);
        }
        return;
      }
      catch (Exception paramBundle)
      {
        paramBundle.printStackTrace();
        return;
      }
    }
    catch (Exception paramBundle)
    {
      break label115;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296268, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    PoseHelper008.saveDataToFile("ip_record", this.j.a());
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362297)
    {
      this.j.clear();
      this.i.notifyDataSetChanged();
    }
    for (;;)
    {
      return true;
      if (paramMenuItem.getItemId() == 2131362300)
      {
        paramMenuItem = new Intent();
        paramMenuItem.setClass(this, WebMessageActivity.class);
        paramMenuItem.putExtra("url", "");
        startActivity(paramMenuItem);
      }
      else if (paramMenuItem.getItemId() == 2131362298)
      {
        a();
      }
      else if (paramMenuItem.getItemId() == 2131362299)
      {
        if (this.l != null) {
          break;
        }
        com.lishu.c.a.c(this, "请先点击刷新，获取数据");
      }
    }
    paramMenuItem = this.l.getStringfrommap("forwarded_ip");
    Object localObject3 = this.l.getStringfrommap("proxy_ip");
    Object localObject2 = this.l.getStringfrommap("WLProxy_ip");
    Object localObject1 = this.l.getStringfrommap("remoteIp");
    String str = this.l.getStringfrommap("ipStr");
    if ((paramMenuItem == null) || (paramMenuItem.equals("null")))
    {
      paramMenuItem = "" + "forwarded_ip: 空";
      label218:
      if ((localObject3 != null) && (!((String)localObject3).equals("null"))) {
        break label555;
      }
      paramMenuItem = paramMenuItem + "\nproxy_ip: 空";
      label255:
      if ((localObject2 != null) && (!((String)localObject2).equals("null"))) {
        break label584;
      }
      paramMenuItem = paramMenuItem + "\nWLProxy_ip: 空";
      label292:
      if ((localObject1 != null) && (!((String)localObject1).equals("null"))) {
        break label613;
      }
      paramMenuItem = paramMenuItem + "\nremoteIp: 空";
      label327:
      if ((localObject1 != null) && (!((String)localObject1).equals("null"))) {
        break label641;
      }
    }
    label641:
    for (paramMenuItem = paramMenuItem + "\n系统判定的真实ip为: 空";; paramMenuItem = paramMenuItem + "\n系统判定的真实ip为: " + str)
    {
      localObject2 = new AlertDialog.Builder(this);
      ((AlertDialog.Builder)localObject2).setTitle("注意");
      localObject3 = LayoutInflater.from(this).inflate(2130903099, null);
      ((AlertDialog.Builder)localObject2).setView((View)localObject3);
      TextView localTextView = (TextView)((View)localObject3).findViewById(2131362094);
      localObject1 = (TextView)((View)localObject3).findViewById(2131362096);
      localTextView.setText(paramMenuItem);
      paramMenuItem = (ProgressBar)((View)localObject3).findViewById(2131362095);
      ((TextView)localObject1).setVisibility(8);
      ((AlertDialog.Builder)localObject2).setPositiveButton("确定", new ca(this));
      ((AlertDialog.Builder)localObject2).create().show();
      localObject2 = this.e;
      str = "http://ip.taobao.com/service/getIpInfo.php?ip=" + str;
      new HashMap();
      ((x)localObject2).a(str, new cb(this, paramMenuItem, (TextView)localObject1));
      break;
      paramMenuItem = "" + "forwarded_ip: " + paramMenuItem;
      break label218;
      label555:
      paramMenuItem = paramMenuItem + "\nproxy_ip: " + (String)localObject3;
      break label255;
      label584:
      paramMenuItem = paramMenuItem + "\nWLProxy_ip: " + (String)localObject2;
      break label292;
      label613:
      paramMenuItem = paramMenuItem + "\nremoteIp: " + (String)localObject1;
      break label327;
    }
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return IpRecordActivity.a(IpRecordActivity.this).size();
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
      if (paramView == null)
      {
        paramView = LayoutInflater.from(IpRecordActivity.this).inflate(2130903100, null);
        paramViewGroup = new IpRecordActivity.b(IpRecordActivity.this);
        paramView.setTag(paramViewGroup);
        paramViewGroup.a = ((TextView)paramView.findViewById(2131362097));
        paramViewGroup.b = ((TextView)paramView.findViewById(2131362098));
      }
      for (;;)
      {
        Object localObject = IpRecordActivity.a(IpRecordActivity.this).a(paramInt);
        String str = ((Map)localObject).getStringfrommap("ip");
        long l = ((Map)localObject).i("time");
        localObject = new SimpleDateFormat("yy/MM/dd HH:mm").format(new Date(l));
        paramViewGroup.a.setText(str);
        paramViewGroup.b.setText((CharSequence)localObject);
        return paramView;
        paramViewGroup = (IpRecordActivity.b)paramView.getTag();
      }
    }
  }
  
  final class b
  {
    public TextView a;
    public TextView b;
    
    b() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.IpRecordActivity

 * JD-Core Version:    0.7.0.1

 */