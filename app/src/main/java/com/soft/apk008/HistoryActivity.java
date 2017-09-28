package com.soft.apk008;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.soft.apk008.remain.RecordSelectActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class HistoryActivity
  extends Activity
{
  public static String a = "";
  private ListView b;
  private ArrayList c = new ArrayList();
  private a d;
  private int e = 100;
  private View.OnClickListener f = new ae(this);
  private View.OnClickListener g = new aj(this);
  private View.OnClickListener h = new am(this);
  
  public static void a()
  {
    String[] arrayOfString = com.lishu.b.a.a.b();
    a = PoseHelper008.getFileData("nowFileName");
    int j;
    int i;
    if (a.length() > 0)
    {
      int k = arrayOfString.length;
      j = 0;
      i = 0;
      if (j < k) {}
    }
    for (;;)
    {
      if ((i == 0) && (arrayOfString.length > 0)) {
        a = arrayOfString[0];
      }
      return;
      if (arrayOfString[j].equals(a)) {
        i = 1;
      }
      j += 1;
      break;
      i = 0;
    }
  }
  
  public static String b()
  {
    if (a.equals("")) {
      a();
    }
    return a;
  }
  
  public static boolean c()
  {
    boolean bool = false;
    String str = PoseHelper008.getFileData("historyActivity");
    if (((str == null) || (str.length() != 0)) || (str.equals("true"))) {
      bool = true;
    }
    return bool;
  }
  
  private void d()
  {
    int k = 0;
    this.c.clear();
    Object localObject1 = com.lishu.b.a.a.b();
    a = PoseHelper008.getFileData("nowFileName");
    int j;
    int i;
    if (a.length() > 0)
    {
      int m = localObject1.length;
      j = 0;
      i = 0;
      if (j < m) {}
    }
    for (;;)
    {
      if (i == 0)
      {
        if (localObject1.length <= 0) {
          break label133;
        }
        a = localObject1[0];
      }
      for (;;)
      {
        if (a.length() > 0) {
          getActionBar().setSubtitle(a);
        }
        PoseHelper008.saveDataToFile("nowFileName", a);
        localObject1 = (ArrayList)com.lishu.b.a.a.a.get(a);
        if (localObject1 != null) {
          break label145;
        }
        return;
        if (localObject1[j].equals(a)) {
          i = 1;
        }
        j += 1;
        break;
        label133:
        getActionBar().setSubtitle("暂时无历史");
      }
      label145:
      Object localObject2 = ((ArrayList)localObject1).iterator();
      if (!((Iterator)localObject2).hasNext())
      {
        localObject1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        i = k;
      }
      try
      {
        j = this.c.size();
        if (i < j) {
          break label363;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          String str;
          Object localObject3;
          long l;
          localException.printStackTrace();
        }
      }
      this.d.notifyDataSetChanged();
      return;
      localObject1 = (HashMap)((Iterator)localObject2).next();
      str = (String)((HashMap)localObject1).get("getDeviceId");
      ((HashMap)localObject1).get("getSubscriberId");
      localObject3 = (String)((HashMap)localObject1).get("tagName");
      localObject1 = (String)((HashMap)localObject1).get("time");
      if (localObject1 != null) {
        l = Long.parseLong((String)localObject1);
      }
      for (localObject1 = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(l));; localObject1 = "")
      {
        str = str;
        HashMap localHashMap = new HashMap();
        localHashMap.put("tagName", localObject3);
        localHashMap.put("imei", str);
        localHashMap.put("time", localObject1);
        this.c.add(localHashMap);
        break;
      }
      label363:
      j = i;
      for (;;)
      {
        if (j >= this.c.size())
        {
          i += 1;
          break;
        }
        localObject2 = (HashMap)this.c.get(i);
        localObject3 = (HashMap)this.c.get(j);
        l = ((SimpleDateFormat)localObject1).parse((String)((HashMap)localObject2).get("time")).getTime();
        if (((SimpleDateFormat)localObject1).parse((String)((HashMap)localObject3).get("time")).getTime() > l) {
          Collections.swap(this.c, i, j);
        }
        j += 1;
      }
      i = 0;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramIntent != null))
    {
      paramIntent = paramIntent.getStringExtra("name");
      if (!paramIntent.equals(a))
      {
        a = paramIntent;
        PoseHelper008.saveDataToFile("nowFileName", a);
        d();
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.b = new ListView(this);
    setContentView(this.b);
    this.d = new a((byte)0);
    this.b.setAdapter(this.d);
    d();
    this.b.setOnItemClickListener(new ap(this));
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296256, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362267)
    {
      paramMenuItem = new AlertDialog.Builder(this);
      paramMenuItem.setTitle("注意");
      paramMenuItem.setMessage("是否删除所有数据");
      paramMenuItem.setPositiveButton("确定", new aq(this));
      paramMenuItem.setNegativeButton("取消", new ar(this));
      paramMenuItem.create().show();
    }
    do
    {
      return true;
      if (paramMenuItem.getItemId() == 2131362269)
      {
        paramMenuItem = new Intent();
        paramMenuItem.setClass(this, RecordSelectActivity.class);
        startActivityForResult(paramMenuItem, 1);
        return true;
      }
      if (paramMenuItem.getItemId() == 2131362268)
      {
        if (a.equals(""))
        {
          Toast.makeText(this, "当前无历史记录", 0).show();
          return true;
        }
        com.lishu.c.a.a(this, "是否删除当前分类", new at(this)).create().show();
        return true;
      }
      if (paramMenuItem.getItemId() == 2131362272)
      {
        paramMenuItem = new EditText(this);
        localObject = com.lishu.c.a.a(this, "新建分类", "", new ag(this, paramMenuItem));
        ((AlertDialog.Builder)localObject).setView(paramMenuItem);
        ((AlertDialog.Builder)localObject).create().show();
        return true;
      }
      if (paramMenuItem.getItemId() == 2131362271)
      {
        if (a.equals(""))
        {
          Toast.makeText(this, "当前无历史记录", 0).show();
          return true;
        }
        paramMenuItem = new EditText(this);
        localObject = com.lishu.c.a.a(this, "重命名分类", "", new af(this, paramMenuItem));
        ((AlertDialog.Builder)localObject).setView(paramMenuItem);
        ((AlertDialog.Builder)localObject).create().show();
        return true;
      }
      if (paramMenuItem.getItemId() == 2131362270)
      {
        paramMenuItem = new AlertDialog.Builder(this);
        paramMenuItem.setTitle("当分类中的数据大于设置的数值时，系统将自动删除最早的那条数据");
        localObject = new EditText(this);
        paramMenuItem.setView((View)localObject);
        ((EditText)localObject).setText(PoseHelper008.getFileData("HistoryActivity_maxNum"));
        paramMenuItem.setNegativeButton("确定", new ah(this, (EditText)localObject));
        paramMenuItem.setPositiveButton("取消", new ai(this));
        paramMenuItem = paramMenuItem.create();
        paramMenuItem.setCancelable(false);
        paramMenuItem.show();
        return true;
      }
    } while (paramMenuItem.getItemId() != 2131362273);
    paramMenuItem = new AlertDialog.Builder(this);
    paramMenuItem.setTitle("是否按照日期自动分类");
    Object localObject = new CheckBox(this);
    ((CheckBox)localObject).setText("新增时存放到相应的日期分类中");
    paramMenuItem.setView((View)localObject);
    if (c()) {
      ((CheckBox)localObject).setChecked(true);
    }
    for (;;)
    {
      paramMenuItem.setNegativeButton("确定", new as(this, (CheckBox)localObject));
      paramMenuItem.create().show();
      return true;
      ((CheckBox)localObject).setChecked(false);
    }
  }
  
  private final class a
    extends BaseAdapter
  {
    private a() {}
    
    public final int getCount()
    {
      return HistoryActivity.b(HistoryActivity.this).size();
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
      if (paramView == null) {
        paramViewGroup = (RelativeLayout)((LayoutInflater)HistoryActivity.this.getSystemService("layout_inflater")).inflate(2130903048, null);
      }
      Object localObject2 = (HashMap)HistoryActivity.b(HistoryActivity.this).get(paramInt);
      Object localObject1 = (String)((HashMap)localObject2).get("tagName");
      paramView = (String)((HashMap)localObject2).get("imei");
      localObject2 = (String)((HashMap)localObject2).get("time");
      ((TextView)paramViewGroup.findViewById(2131361827)).setText((CharSequence)localObject1);
      ((TextView)paramViewGroup.findViewById(2131361828)).setText(paramView);
      ((TextView)paramViewGroup.findViewById(2131361831)).setText((CharSequence)localObject2);
      localObject1 = (Button)paramViewGroup.findViewById(2131361830);
      ((Button)localObject1).setOnClickListener(HistoryActivity.c(HistoryActivity.this));
      ((Button)localObject1).setTag(paramView);
      ((Button)localObject1).setText("编辑");
      localObject1 = (Button)paramViewGroup.findViewById(2131361829);
      ((Button)localObject1).setOnClickListener(HistoryActivity.d(HistoryActivity.this));
      ((Button)localObject1).setTag(paramView);
      ((Button)localObject1).setText("删除");
      paramViewGroup.setTag(paramView);
      paramViewGroup.setOnClickListener(HistoryActivity.e(HistoryActivity.this));
      return paramViewGroup;
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.HistoryActivity
 * JD-Core Version:    0.7.0.1
 */