package com.soft.tools.packageSim;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
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

public class PackAgeSetActivity
  extends Activity
{
  private static String i = "PackAgeSetActivity_white";
  private static com.a.a.b j;
  private EditText a;
  private EditText b;
  private View c;
  private CheckBox d;
  private ListView e;
  private Button f;
  private Button g;
  private a h;
  
  protected final void a()
  {
    Object localObject = this.a.getText().toString();
    String str = this.b.getText().toString();
    label95:
    for (;;)
    {
      try
      {
        k = Integer.parseInt((String)localObject);
        m = 0;
      }
      catch (Exception localException1)
      {
        try
        {
          m = Integer.parseInt(str);
          if ((k > 0) && (m > 0)) {
            break;
          }
          localObject = new AlertDialog.Builder(this);
          ((AlertDialog.Builder)localObject).setTitle("注意");
          ((AlertDialog.Builder)localObject).setMessage("输入的信息不合法");
          ((AlertDialog.Builder)localObject).setNegativeButton("确定", new f(this));
          ((AlertDialog.Builder)localObject).create().show();
          return;
        }
        catch (Exception localException2)
        {
          int k;
          int m;
          break label95;
        }
        localException1 = localException1;
        k = 0;
      }
    }
    PackAgeSimActivity.getpackageinfo(k, m);
    Toast.makeText(this, "保存成功", 0).show();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903135);
    this.a = ((EditText)findViewById(2131362229));
    this.b = ((EditText)findViewById(2131362230));
    this.c = findViewById(2131362231);
    this.d = ((CheckBox)findViewById(2131362232));
    paramBundle = PackAgeSimActivity.c();
    this.a.setText(paramBundle[0]);
    this.b.setText(paramBundle[1]);
    if (PackAgeSimActivity.createdapplicationinfo()) {
      this.d.setChecked(true);
    }
    this.c.setOnClickListener(new a(this));
    this.e = ((ListView)findViewById(2131362233));
    this.f = ((Button)findViewById(2131362234));
    this.g = ((Button)findViewById(2131362235));
    this.f.setOnClickListener(new b(this));
    this.g.setOnClickListener(new c(this));
    paramBundle = PoseHelper008.getFileData(i);
    try
    {
      j = com.a.a.b.c(paramBundle);
      label196:
      if (j == null) {
        j = new com.a.a.b();
      }
      this.h = new a();
      this.e.setAdapter(this.h);
      return;
    }
    catch (Exception paramBundle)
    {
      break label196;
    }
  }
  
  protected void onPause()
  {
    if (PackAgeSimActivity.a == null) {}
    try
    {
      PackAgeSimActivity.a = e.b(PoseHelper008.getFileData("packagesimset"));
      label17:
      if (PackAgeSimActivity.a == null) {
        PackAgeSimActivity.a = new Map();
      }
      String str = "false";
      if (this.d.isChecked()) {
        str = "true";
      }
      PackAgeSimActivity.a.putkey("checkBoxAuto", str);
      PoseHelper008.saveDataToFile("packagesimset", PackAgeSimActivity.a.a());
      PoseHelper008.saveDataToFile(i, j.a());
      super.onDestroy();
      return;
    }
    catch (Exception localException)
    {
      break label17;
    }
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return PackAgeSetActivity.b().size();
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
        paramView = new TextView(PackAgeSetActivity.this);
      }
      for (;;)
      {
        paramView = (TextView)paramView;
        paramView.setText(PackAgeSetActivity.b().e(paramInt));
        paramView.setOnClickListener(new g(this, paramInt));
        return paramView;
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.packageSim.PackAgeSetActivity

 * JD-Core Version:    0.7.0.1

 */