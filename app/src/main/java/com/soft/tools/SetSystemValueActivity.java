package com.soft.tools;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.a.a.Map;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class SetSystemValueActivity
  extends Activity
{
  static boolean c = false;
  static b d = null;
  b a = new b();
  View.OnClickListener b = new ek(this);
  private EditText e;
  private Button f;
  private ListView g;
  private a h;
  private Button i;
  private Button j;
  private CheckBox k;
  
  public static void a(Context paramContext)
  {
    try
    {
      b localb = a.c(PoseHelper008.getFileData("SetSystemValueActivity"));
      if (localb != null)
      {
        int i1 = 0;
        int n;
        for (int m = 0;; m = n)
        {
          if (i1 >= localb.size())
          {
            if (SetSystemValueActivitySet.a()) {
              localb.clear();
            }
            PoseHelper008.saveDataToFile("SetSystemValueActivity", localb.a());
            if (!(paramContext instanceof Activity)) {
              break;
            }
            ((Activity)paramContext).runOnUiThread(new em(paramContext, m));
            return;
          }
          Object localObject = localb.a(i1);
          String str1 = (String)((Map)localObject).get("text_name");
          ((Map)localObject).get("text_handleWay");
          localObject = ((Map)localObject).get("check");
          String str2 = PoseHelper008.getFileData("SetSystemValueActivity_checkAll").trim();
          if (!((String)localObject).equals("true"))
          {
            n = m;
            if (!str2.equals("true")) {}
          }
          else
          {
            n = m + 1;
            Settings.System.putString(paramContext.getContentResolver(), str1, null);
          }
          i1 += 1;
        }
      }
      return;
    }
    catch (Exception paramContext) {}
  }
  
  public static void a(String paramString, boolean paramBoolean, Object paramObject)
  {
    if (d == null) {}
    Object localObject1;
    int m;
    try
    {
      d = (b)a.a(PoseHelper008.getFileData("SetSystemValueActivity"));
      if (d == null) {
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
      localObject1 = null;
      m = 0;
    }
    Object localObject2;
    String str;
    if (m >= d.size())
    {
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new Map();
        d.add(localObject2);
      }
      ((Map)localObject2).putkey("text_name", paramString);
      str = (String)((Map)localObject2).get("text_handleWay");
      if (paramBoolean)
      {
        paramString = "读";
        label107:
        if (str != null) {
          break label229;
        }
        localObject1 = paramString;
        label115:
        if (paramObject != null) {
          ((Map)localObject2).putkey("kind", paramObject.getClass().getName());
        }
        ((Map)localObject2).putkey("value", paramObject);
        ((Map)localObject2).putkey("text_handleWay", localObject1);
        PoseHelper008.saveDataToFile("SetSystemValueActivity", a.a(d));
        c = false;
      }
    }
    else
    {
      localObject2 = (Map)d.get(m);
      if (!((String)((Map)localObject2).get("text_name")).equals(paramString)) {
        break label266;
      }
      localObject1 = localObject2;
    }
    label266:
    for (;;)
    {
      m += 1;
      break;
      paramString = "写";
      break label107;
      label229:
      localObject1 = str;
      if (str.indexOf(paramString) >= 0) {
        break label115;
      }
      localObject1 = str + paramString;
      break label115;
    }
  }
  
  public static String b()
  {
    String str = PoseHelper008.getFileData("SetSystemValueActivity_packAge").trim();
    String[] arrayOfString = str.split("_");
    if (arrayOfString.length == 2)
    {
      int m = str.indexOf("_");
      if (m == -1) {
        return "";
      }
      arrayOfString[1] = str.substring(m + 1);
      return arrayOfString[1];
    }
    return "";
  }
  
  public final void a()
  {
    int m = 0;
    int i1;
    for (int n = 0;; n = i1)
    {
      if (m >= this.a.size())
      {
        Toast.makeText(this, "共清除" + n + "条记录", 0).show();
        return;
      }
      Map locale = this.a.a(m);
      String str = (String)locale.get("text_name");
      locale.get("text_handleWay");
      i1 = n;
      if (locale.get("check").equals("true"))
      {
        i1 = n + 1;
        Settings.System.putString(getContentResolver(), str, null);
      }
      m += 1;
    }
  }
  
  public final void a(int paramInt)
  {
    Object localObject1 = new AlertDialog.Builder(this);
    Object localObject2 = ((LayoutInflater)getSystemService("layout_inflater")).inflate(2130903122, null);
    ((AlertDialog.Builder)localObject1).setView((View)localObject2);
    EditText localEditText = (EditText)((View)localObject2).findViewById(2131362188);
    Button localButton = (Button)((View)localObject2).findViewById(2131362189);
    localObject2 = (Button)((View)localObject2).findViewById(2131362190);
    Object localObject3 = this.a.a(paramInt);
    new StringBuilder().append(((Map)localObject3).get("kind")).toString();
    new StringBuilder().append(((Map)localObject3).get("text_handleWay")).toString();
    localObject3 = ((Map)localObject3).get("text_name");
    String str = Settings.System.getString(getContentResolver(), (String)localObject3);
    if (str == null) {
      localEditText.setText("空");
    }
    for (;;)
    {
      localObject1 = ((AlertDialog.Builder)localObject1).create();
      ((Button)localObject2).setOnClickListener(new en(this, (String)localObject3, (Dialog)localObject1));
      localButton.setOnClickListener(new eo(this, localEditText, (String)localObject3, (Dialog)localObject1));
      ((Dialog)localObject1).show();
      return;
      localEditText.setText(str);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 != 1) || (paramIntent == null)) {
      return;
    }
    paramIntent = paramIntent.getStringExtra("packageName");
    PoseHelper008.saveDataToFile("SetSystemValueActivity_packAge", paramIntent);
    this.e.setText(paramIntent);
    this.a.clear();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903121);
    this.e = ((EditText)findViewById(2131362182));
    this.f = ((Button)findViewById(2131362183));
    this.j = ((Button)findViewById(2131362185));
    this.i = ((Button)findViewById(2131362186));
    this.k = ((CheckBox)findViewById(2131362187));
    this.g = ((ListView)findViewById(2131362184));
    try
    {
      this.a = a.c(PoseHelper008.getFileData("SetSystemValueActivity"));
      label108:
      if (this.a == null) {
        this.a = new b();
      }
      paramBundle = PoseHelper008.getFileData("SetSystemValueActivity_packAge").trim();
      this.e.setText(paramBundle);
      this.h = new a();
      this.g.setAdapter(this.h);
      this.f.setOnClickListener(this.b);
      this.i.setOnClickListener(this.b);
      this.j.setOnClickListener(this.b);
      int m;
      if (PoseHelper008.getFileData("SetSystemValueActivity_checkAll").trim().equals("true"))
      {
        this.k.setChecked(true);
        m = 0;
      }
      for (;;)
      {
        if (m >= this.a.size())
        {
          this.k.setOnCheckedChangeListener(new el(this));
          return;
        }
        this.a.a(m).a("check", "true");
        m += 1;
      }
    }
    catch (Exception paramBundle)
    {
      break label108;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296281, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    String str = this.e.getText().toString();
    PoseHelper008.saveDataToFile("SetSystemValueActivity", a.a(this.a));
    PoseHelper008.saveDataToFile("SetSystemValueActivity_packAge", str);
    if (this.k.isChecked()) {
      PoseHelper008.saveDataToFile("SetSystemValueActivity_checkAll", "true");
    }
    for (;;)
    {
      super.onDestroy();
      return;
      PoseHelper008.saveDataToFile("SetSystemValueActivity_checkAll", "false");
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362318)
    {
      Intent localIntent = new Intent();
      localIntent.setClass(this, SetSystemValueActivitySet.class);
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
      return SetSystemValueActivity.this.a.size();
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
        paramViewGroup = ((LayoutInflater)SetSystemValueActivity.this.getSystemService("layout_inflater")).inflate(2130903123, null);
        paramView = (TextView)paramViewGroup.findViewById(2131362193);
        localObject1 = (TextView)paramViewGroup.findViewById(2131362194);
        localObject2 = (Button)paramViewGroup.findViewById(2131362192);
        localObject3 = (CheckBox)paramViewGroup.findViewById(2131362191);
        SetSystemValueActivity.b localb = new SetSystemValueActivity.b(SetSystemValueActivity.this);
        localb.a = paramView;
        localb.b = ((TextView)localObject1);
        localb.c = ((Button)localObject2);
        localb.d = ((CheckBox)localObject3);
        paramViewGroup.setTag(localb);
      }
      paramView = (SetSystemValueActivity.b)paramViewGroup.getTag();
      Object localObject3 = SetSystemValueActivity.this.a.a(paramInt);
      Object localObject1 = (String)((Map)localObject3).get("text_name");
      Object localObject2 = (String)((Map)localObject3).get("text_handleWay");
      localObject3 = ((Map)localObject3).get("check");
      paramView.a.setText((CharSequence)localObject1);
      paramView.b.setText((CharSequence)localObject2);
      paramView.d.setTag(Integer.valueOf(paramInt));
      if (((String)localObject3).equals("true")) {
        paramView.d.setChecked(true);
      }
      for (;;)
      {
        paramView.d.setOnCheckedChangeListener(new ep(this, paramView));
        paramView.c.setOnClickListener(new eq(this, paramInt));
        return paramViewGroup;
        paramView.d.setChecked(false);
      }
    }
  }
  
  final class b
  {
    TextView a;
    TextView b;
    Button c;
    CheckBox d;
    
    b() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.SetSystemValueActivity

 * JD-Core Version:    0.7.0.1

 */