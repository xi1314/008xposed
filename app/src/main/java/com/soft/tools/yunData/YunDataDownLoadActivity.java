package com.soft.tools.yunData;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.a.a.Map;
import com.a.a.maputils;
import com.soft.apk008.remain.RecordSelectActivity;
import com.soft.tools.FolderBackUpActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class YunDataDownLoadActivity
  extends Activity
{
  View.OnClickListener a = new s(this);
  Map b = null;
  int c = 0;
  int d = 0;
  int e = 0;
  int f = 0;
  private Button g;
  private Button h;
  private ExpandableListView i;
  private d j = new d();
  private a k;
  private ProgressDialog l;
  private String[] m = new String[0];
  private Map n = new Map();
  private Map o = new Map();
  private Button p;
  private ProgressDialog q;
  private Button r;
  
  public final void a()
  {
    this.l.show();
    HashMap localHashMap = new HashMap();
    this.j.a(YunDataActivity.a + "/getData", localHashMap, new t(this));
  }
  
  public final void a(Map parame, int paramInt)
  {
    Object localObject1 = this.o.entrySet();
    a locala = new a();
    this.d = 0;
    Object localObject2 = ((Set)localObject1).iterator();
    if (!((Iterator)localObject2).hasNext())
    {
      if (parame.size() > 0) {
        this.d += paramInt;
      }
      this.e = 0;
      this.f = 0;
      this.q.show();
      this.q.setMessage("下载中，请稍后");
      this.q.setMax(this.d);
      this.q.setProgress(0);
      locala.a(new ad(this));
      localObject1 = ((Set)localObject1).iterator();
    }
    do
    {
      if (!((Iterator)localObject1).hasNext())
      {
        return;
        if (((String)((Map.Entry)((Iterator)localObject2).next()).getKey()).contains("GROUP")) {
          break;
        }
        this.d += 1;
        break;
      }
      localObject2 = (String)((Map.Entry)((Iterator)localObject1).next()).getKey();
    } while (((String)localObject2).contains("GROUP"));
    localObject2 = ((String)localObject2).split("=_=");
    Object localObject3 = localObject2[0];
    String str1 = localObject2[1];
    Object localObject4 = new File(new File(Environment.getExternalStorageDirectory(), "kind"), localObject2[0] + "_" + localObject2[1]);
    locala.a(YunDataActivity.a + "/downLoadItem?deviceName=" + (String)localObject3 + "&kindName=" + str1, (File)localObject4, "");
    localObject3 = parame.entrySet().iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (Map.Entry)((Iterator)localObject3).next();
      str1 = (String)((Map.Entry)localObject4).getKey();
      localObject4 = (b)((Map.Entry)localObject4).getValue();
      paramInt = 0;
      while (paramInt < ((b)localObject4).size())
      {
        String str2 = ((b)localObject4).e(paramInt);
        Object localObject5 = str2.substring(0, str2.lastIndexOf("_"));
        localObject5 = new File(FolderBackUpActivity.d(), localObject2[0] + "_" + (String)localObject5);
        locala.a(YunDataActivity.a + "/DownTarFile?deviceName=" + str1 + "&tarFileName=" + str2, (File)localObject5, "");
        paramInt += 1;
      }
    }
  }
  
  public final void a(String paramString)
  {
    runOnUiThread(new al(this, paramString));
  }
  
  public final void b()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("请设置日期");
    DatePicker localDatePicker = new DatePicker(this);
    localBuilder.setView(localDatePicker);
    localBuilder.setPositiveButton("确定", new v(this, localDatePicker));
    localBuilder.setNegativeButton("取消", new y(this));
    localBuilder.create().show();
  }
  
  public final void c()
  {
    Object localObject1 = this.o.entrySet();
    String str = YunDataActivity.a + "/GetTarListByKindName";
    HashMap localHashMap = new HashMap();
    localObject1 = ((Set)localObject1).iterator();
    for (;;)
    {
      if (!((Iterator)localObject1).hasNext())
      {
        localObject1 = new HashMap();
        ((HashMap)localObject1).put("dataList", maputils.creatmap(localHashMap));
        this.j.a(str, (HashMap)localObject1, new z(this));
        return;
      }
      Object localObject2 = (String)((Map.Entry)((Iterator)localObject1).next()).getKey();
      if (!((String)localObject2).contains("GROUP"))
      {
        localObject2 = ((String)localObject2).split("=_=");
        localHashMap.put(localObject2[0], localObject2[1]);
      }
    }
  }
  
  public final void d()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("select", this.o.a());
    this.j.a(YunDataActivity.a + "/deleteItem", localHashMap, new aj(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903129);
    this.g = ((Button)findViewById(2131362214));
    this.r = ((Button)findViewById(2131362215));
    this.h = ((Button)findViewById(2131362216));
    this.p = ((Button)findViewById(2131362217));
    this.i = ((ExpandableListView)findViewById(2131362213));
    this.g.setOnClickListener(this.a);
    this.r.setOnClickListener(this.a);
    this.h.setOnClickListener(this.a);
    this.p.setOnClickListener(this.a);
    this.k = new a((byte)0);
    this.i.setAdapter(this.k);
    this.l = new ProgressDialog(this);
    this.l.setMessage("正在读取列表中");
    this.q = new ProgressDialog(this);
    this.q.setCanceledOnTouchOutside(false);
    this.q.setProgressStyle(1);
    paramBundle = PoseHelper008.getFileData("YunDataDownLoadActivity");
    if ((paramBundle != null) && (paramBundle.length() > 0)) {}
    try
    {
      this.o = maputils.getmap(paramBundle);
      label226:
      if (this.o == null) {
        this.o = new Map();
      }
      return;
    }
    catch (Exception paramBundle)
    {
      break label226;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296271, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    PoseHelper008.saveDataToFile("YunDataDownLoadActivity", this.o.a());
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362303) {
      a();
    }
    while (paramMenuItem.getItemId() != 2131362302) {
      return true;
    }
    paramMenuItem = new Intent();
    paramMenuItem.setClass(this, RecordSelectActivity.class);
    startActivityForResult(paramMenuItem, 1);
    return true;
  }
  
  protected void onResume()
  {
    super.onResume();
    a();
  }
  
  private final class a
    extends BaseExpandableListAdapter
  {
    private a() {}
    
    public final Object getChild(int paramInt1, int paramInt2)
    {
      return null;
    }
    
    public final long getChildId(int paramInt1, int paramInt2)
    {
      return 0L;
    }
    
    public final View getChildView(int paramInt1, int paramInt2, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
    {
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = YunDataDownLoadActivity.this.getLayoutInflater().inflate(2130903130, null);
        paramView = new YunDataDownLoadActivity.b(YunDataDownLoadActivity.this, (byte)0);
        paramView.a = ((TextView)paramViewGroup.findViewById(2131362219));
        paramView.b = ((CheckBox)paramViewGroup.findViewById(2131362218));
        paramView.c = ((TextView)paramViewGroup.findViewById(2131362220));
        paramViewGroup.setTag(paramView);
      }
      paramView = (YunDataDownLoadActivity.b)paramViewGroup.getTag();
      String str = YunDataDownLoadActivity.g(YunDataDownLoadActivity.this)[paramInt1];
      Object localObject = YunDataDownLoadActivity.b(YunDataDownLoadActivity.h(YunDataDownLoadActivity.this).e(str).e(paramInt2));
      CharSequence localCharSequence = localObject[0];
      paramView.a.setText(localCharSequence);
      localObject = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(Long.parseLong(localObject[1])));
      paramView.c.setText((CharSequence)localObject);
      str = str + "=_=" + localCharSequence;
      paramView.b.setOnCheckedChangeListener(null);
      if (YunDataDownLoadActivity.e(YunDataDownLoadActivity.this).containsKey(str)) {
        paramView.b.setChecked(true);
      }
      for (;;)
      {
        paramView.b.setOnClickListener(new am(this, str));
        return paramViewGroup;
        paramView.b.setChecked(false);
      }
    }
    
    public final int getChildrenCount(int paramInt)
    {
      String str = YunDataDownLoadActivity.g(YunDataDownLoadActivity.this)[paramInt];
      return YunDataDownLoadActivity.h(YunDataDownLoadActivity.this).e(str).size();
    }
    
    public final Object getGroup(int paramInt)
    {
      return null;
    }
    
    public final int getGroupCount()
    {
      return YunDataDownLoadActivity.g(YunDataDownLoadActivity.this).length;
    }
    
    public final long getGroupId(int paramInt)
    {
      return 0L;
    }
    
    public final View getGroupView(int paramInt, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
    {
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = YunDataDownLoadActivity.this.getLayoutInflater().inflate(2130903130, null);
        paramView = new YunDataDownLoadActivity.b(YunDataDownLoadActivity.this, (byte)0);
        paramView.a = ((TextView)paramViewGroup.findViewById(2131362219));
        paramView.b = ((CheckBox)paramViewGroup.findViewById(2131362218));
        paramView.c = ((TextView)paramViewGroup.findViewById(2131362220));
        paramView.c.setVisibility(8);
        paramViewGroup.setTag(paramView);
      }
      paramView = (YunDataDownLoadActivity.b)paramViewGroup.getTag();
      String str1 = YunDataDownLoadActivity.g(YunDataDownLoadActivity.this)[paramInt];
      paramView.a.setText(str1);
      String str2 = "GROUP" + str1;
      paramView.b.setOnCheckedChangeListener(null);
      if (YunDataDownLoadActivity.e(YunDataDownLoadActivity.this).containsKey(str2)) {
        paramView.b.setChecked(true);
      }
      for (;;)
      {
        paramView.b.setOnClickListener(new an(this, str2, str1));
        return paramViewGroup;
        paramView.b.setChecked(false);
      }
    }
    
    public final boolean hasStableIds()
    {
      return false;
    }
    
    public final boolean isChildSelectable(int paramInt1, int paramInt2)
    {
      return false;
    }
  }
  
  private final class b
  {
    public TextView a;
    public CheckBox b;
    public TextView c;
    
    private b() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.yunData.YunDataDownLoadActivity

 * JD-Core Version:    0.7.0.1

 */