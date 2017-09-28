package com.soft.apk008.remainNew;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.a.a.Map;
import com.a.a.maputils;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class NewReMainSetActivity
  extends Activity
{
  static Map a;
  static b b;
  Dialog c = null;
  private Spinner d;
  private ListView e;
  private Button f;
  private a g;
  private CheckBox h;
  private CheckBox i;
  private CheckBox j;
  private ArrayList k;
  private EditText l;
  private EditText m;
  private Button n;
  private Button o;
  private RadioButton p;
  private RadioButton q;
  
  public static String a()
  {
    i();
    String str2 = a.get("mode");
    String str1 = str2;
    if (str2.equals("null"))
    {
      str1 = "自动";
      a.putkey("mode", "自动");
    }
    return str1;
  }
  
  public static String a(String paramString)
  {
    i();
    return a.get(paramString);
  }
  
  public static void a(Dialog paramDialog)
  {
    try
    {
      Field localField = paramDialog.getClass().getSuperclass().getDeclaredField("mShowing");
      localField.setAccessible(true);
      localField.set(paramDialog, Boolean.valueOf(true));
      paramDialog.cancel();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public static int d(int paramInt)
  {
    i();
    Iterator localIterator = b.iterator();
    Map locale;
    do
    {
      if (!localIterator.hasNext()) {
        return 0;
      }
      locale = (Map)localIterator.next();
    } while (paramInt != locale.h("day"));
    return locale.h("remain");
  }
  
  public static void g()
  {
    PoseHelper008.saveDataToFile("newRemainSet", a.a());
    PoseHelper008.saveDataToFile("NewReMainSetActivity_remain", b.a());
  }
  
  private static ArrayList h()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("自动");
    Iterator localIterator = com.lishu.b.a.a.a.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return localArrayList;
      }
      String str = (String)((Map.Entry)localIterator.next()).getKey();
      Object localObject2 = new SimpleDateFormat("yyyy-MM-dd");
      Object localObject1 = null;
      try
      {
        localObject2 = ((SimpleDateFormat)localObject2).parse(str);
        localObject1 = localObject2;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localException.printStackTrace();
        }
      }
      if (localObject1 != null) {
        localArrayList.add(str);
      }
    }
  }
  
  private static void i()
  {
    if (a == null) {
      a = maputils.getmap(PoseHelper008.getFileData("newRemainSet"));
    }
    if (b == null) {
      b = maputils.c(PoseHelper008.getFileData("NewReMainSetActivity_remain"));
    }
    if (b == null) {
      b = new b();
    }
    if (a == null)
    {
      Map locale = new Map();
      a = locale;
      locale.putkey("mode", "自动");
      g();
    }
  }
  
  public final void a(int paramInt)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("确定");
    localBuilder.setMessage("选择操作");
    localBuilder.setNegativeButton("修改", new z(this, paramInt));
    localBuilder.setPositiveButton("删除", new aa(this, paramInt));
    localBuilder.create().show();
  }
  
  public final void b()
  {
    Object localObject = new AlertDialog.Builder(this);
    ((AlertDialog.Builder)localObject).setTitle("设置新增的最小值和最大值");
    View localView = getLayoutInflater().inflate(2130903064, null);
    EditText localEditText1 = (EditText)localView.findViewById(2131361920);
    EditText localEditText2 = (EditText)localView.findViewById(2131361919);
    ((AlertDialog.Builder)localObject).setView(localView);
    ((AlertDialog.Builder)localObject).setNegativeButton("确定", new x(this, localEditText2, localEditText1));
    ((AlertDialog.Builder)localObject).setPositiveButton("取消", new y(this));
    this.c = ((AlertDialog.Builder)localObject).create();
    this.c.show();
    try
    {
      localObject = this.c.getClass().getSuperclass().getDeclaredField("mShowing");
      ((Field)localObject).setAccessible(true);
      ((Field)localObject).set(this.c, Boolean.valueOf(false));
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public final void b(int paramInt)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("注意");
    localBuilder.setMessage("是否删除");
    localBuilder.setPositiveButton("确定", new ab(this, paramInt));
    localBuilder.setNegativeButton("取消", new l(this));
    localBuilder.create().show();
  }
  
  protected final void c()
  {
    int i1 = 0;
    if (i1 >= b.size())
    {
      this.g.notifyDataSetChanged();
      return;
    }
    Map locale1 = b.a(i1);
    int i2 = i1 + 1;
    for (;;)
    {
      if (i2 >= b.size())
      {
        i1 += 1;
        break;
      }
      Map locale2 = b.a(i2);
      int i3 = locale1.h("day");
      if (locale2.h("day") < i3)
      {
        b.remove(i1);
        b.remove(i2 - 1);
        b.add(i1, locale2);
        b.add(i2, locale1);
      }
      i2 += 1;
    }
  }
  
  public final void c(int paramInt)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("注意");
    EditText localEditText = new EditText(this);
    Map locale = b.a(paramInt);
    localEditText.setText(locale.h("remain"));
    localBuilder.setView(localEditText);
    localBuilder.setPositiveButton("确定", new s(this, localEditText, locale));
    localBuilder.setNegativeButton("取消", new t(this));
    localBuilder.create().show();
  }
  
  protected final void d()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("注意");
    localBuilder.setMessage("是否全部删除");
    localBuilder.setPositiveButton("确定", new m(this));
    localBuilder.setNegativeButton("取消", new n(this));
    localBuilder.create().show();
  }
  
  public final void e()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("注意");
    View localView = LayoutInflater.from(this).inflate(2130903065, null);
    EditText localEditText1 = (EditText)localView.findViewById(2131361921);
    EditText localEditText2 = (EditText)localView.findViewById(2131361922);
    localBuilder.setView(localView);
    localBuilder.setNegativeButton("确定", new o(this, localEditText1, localEditText2));
    localBuilder.setPositiveButton("取消", new p(this));
    localBuilder.create().show();
  }
  
  public final void f()
  {
    Object localObject = new AlertDialog.Builder(this);
    ((AlertDialog.Builder)localObject).setTitle("自动生成留存");
    View localView = LayoutInflater.from(this).inflate(2130903063, null);
    EditText localEditText1 = (EditText)localView.findViewById(2131361915);
    EditText localEditText2 = (EditText)localView.findViewById(2131361916);
    EditText localEditText3 = (EditText)localView.findViewById(2131361917);
    EditText localEditText4 = (EditText)localView.findViewById(2131361918);
    ((AlertDialog.Builder)localObject).setView(localView);
    ((AlertDialog.Builder)localObject).setPositiveButton("确定", new q(this, localEditText1, localEditText2, localEditText3, localEditText4));
    ((AlertDialog.Builder)localObject).setNegativeButton("取消", new r(this));
    this.c = ((AlertDialog.Builder)localObject).create();
    this.c.show();
    try
    {
      localObject = this.c.getClass().getSuperclass().getDeclaredField("mShowing");
      ((Field)localObject).setAccessible(true);
      ((Field)localObject).set(this.c, Boolean.valueOf(false));
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903062);
    this.e = ((ListView)findViewById(2131361910));
    this.f = ((Button)findViewById(2131361911));
    this.n = ((Button)findViewById(2131361912));
    this.o = ((Button)findViewById(2131361913));
    this.m = ((EditText)findViewById(2131361908));
    this.l = ((EditText)findViewById(2131361906));
    this.o.setOnClickListener(new k(this));
    this.n.setOnClickListener(new u(this));
    this.f.setOnClickListener(new v(this));
    ((Button)findViewById(2131361909)).setOnClickListener(new w(this));
    i();
    this.d = ((Spinner)findViewById(2131361900));
    this.k = h();
    paramBundle = new ArrayAdapter(this, 17367048, this.k);
    this.d.setAdapter(paramBundle);
    paramBundle = a();
    Iterator localIterator = this.k.iterator();
    int i1 = 0;
    if (!localIterator.hasNext())
    {
      this.g = new a();
      this.e.setAdapter(this.g);
      this.h = ((CheckBox)findViewById(2131361901));
      this.i = ((CheckBox)findViewById(2131361903));
      this.j = ((CheckBox)findViewById(2131361902));
      this.p = ((RadioButton)findViewById(2131361904));
      this.q = ((RadioButton)findViewById(2131361905));
      this.p.setChecked(true);
      if ((a("radio_dbNet") != null) && (a("radio_dbNet").equals("true"))) {
        this.q.setChecked(true);
      }
      if ((a("check_deleteFile") != null) && (!a("check_deleteFile").equals("false"))) {
        break label538;
      }
      this.h.setChecked(false);
      label398:
      if ((a("check_clearData") != null) && (!a("check_clearData").equals("false"))) {
        break label549;
      }
      this.i.setChecked(false);
      label430:
      if ((a("check_deleteSystem") != null) && (!a("check_deleteSystem").equals("false"))) {
        break label560;
      }
      this.j.setChecked(false);
    }
    for (;;)
    {
      if (a("editAddMin") != null) {
        this.l.setText(a("editAddMin"));
      }
      if (a("editAddMax") != null) {
        this.m.setText(a("editAddMax"));
      }
      return;
      if (paramBundle.equals((String)localIterator.next())) {
        this.d.setSelection(i1);
      }
      i1 += 1;
      break;
      label538:
      this.h.setChecked(true);
      break label398;
      label549:
      this.i.setChecked(true);
      break label430;
      label560:
      this.j.setChecked(true);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.i.isChecked())
    {
      a.putkey("check_clearData", "true");
      if (!this.h.isChecked()) {
        break label190;
      }
      a.putkey("check_deleteFile", "true");
      label50:
      if (!this.j.isChecked()) {
        break label206;
      }
      a.putkey("check_deleteSystem", "true");
      label73:
      if (!this.q.isChecked()) {
        break label222;
      }
      a.putkey("radio_dbNet", "true");
    }
    for (;;)
    {
      a.putkey("editAddMin", this.l.getText().toString());
      a.putkey("editAddMax", this.m.getText().toString());
      int i1 = this.d.getSelectedItemPosition();
      String str = (String)this.k.get(i1);
      a.putkey("mode", str);
      g();
      return;
      a.putkey("check_clearData", "false");
      break;
      label190:
      a.putkey("check_deleteFile", "false");
      break label50;
      label206:
      a.putkey("check_deleteSystem", "false");
      break label73;
      label222:
      a.putkey("radio_dbNet", "false");
    }
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return NewReMainSetActivity.b.size();
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
        paramViewGroup = LayoutInflater.from(NewReMainSetActivity.this).inflate(2130903061, null);
        paramView = new NewReMainSetActivity.b(NewReMainSetActivity.this);
        paramViewGroup.setTag(paramView);
        localObject = (TextView)paramViewGroup.findViewById(2131361896);
        TextView localTextView1 = (TextView)paramViewGroup.findViewById(2131361899);
        TextView localTextView2 = (TextView)paramViewGroup.findViewById(2131361898);
        Button localButton = (Button)paramViewGroup.findViewById(2131361897);
        NewReMainSetActivity.b.a(paramView, (TextView)localObject);
        NewReMainSetActivity.b.b(paramView, localTextView1);
        NewReMainSetActivity.b.a(paramView, localButton);
        NewReMainSetActivity.b.c(paramView, localTextView2);
      }
      paramView = (NewReMainSetActivity.b)paramViewGroup.getTag();
      Object localObject = (Map)NewReMainSetActivity.b.get(paramInt);
      NewReMainSetActivity.b.a(paramView).setText("第" + ((Map)localObject).get("day") + "天");
      NewReMainSetActivity.b.b(paramView).setText("留存:" + ((Map)localObject).get("remain"));
      NewReMainSetActivity.b.c(paramView).setOnClickListener(new ac(this, paramInt));
      return paramViewGroup;
    }
  }
  
  final class b
  {
    private TextView b;
    private TextView c;
    private Button d;
    private TextView e;
    
    b() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.remainNew.NewReMainSetActivity

 * JD-Core Version:    0.7.0.1

 */