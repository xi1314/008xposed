package com.soft.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

import com.a.a.Map;
import com.a.a.b;
import com.data.simulate.SimulateDataTest;
import com.soft.apk008.StartActivity;
import com.soft.apk008.WebMessageActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class PhoneNetWorkActivity
  extends Activity
  implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener
{
  private static Map q = null;
  int a = 0;
  int b = 0;
  int c = 0;
  private Button d;
  private Button e;
  private Button f;
  private SeekBar g;
  private SeekBar h;
  private SeekBar i;
  private TextView j;
  private TextView k;
  private TextView l;
  private RadioButton m;
  private RadioButton n;
  private RadioButton o;
  private CheckBox p;
  
  public static b a(int paramInt)
  {
    String str;
    if (q == null) {
      str = PoseHelper008.getFileData("newWork");
    }
    try
    {
      q = a.b(str);
      label19:
      if (q == null) {
        q = new Map();
      }
      return q.e(paramInt);
    }
    catch (Exception localException)
    {
      break label19;
    }
  }
  
  public static void a(int paramInt, b paramb)
  {
    String str;
    if (q == null) {
      str = PoseHelper008.getFileData("newWork");
    }
    try
    {
      q = a.b(str);
      label19:
      if (q == null) {
        q = new Map();
      }
      q.putkey(paramInt, paramb);
      return;
    }
    catch (Exception localException)
    {
      break label19;
    }
  }
  
  public static String[] a()
  {
    Object localObject1;
    if (q == null) {
      localObject1 = PoseHelper008.getFileData("newWork");
    }
    try
    {
      q = a.b((String)localObject1);
      label21:
      if (q == null) {
        q = new Map();
      }
      if ((q.get("checkBoxOpen") == null) || ("false".equals(q.getStringfrommap("checkBoxOpen")))) {
        return null;
      }
      Object localObject2 = q.g("seekBarDianXin");
      localObject1 = q.g("seekBarLianTong");
      Object localObject3 = q.g("seekBarYidong");
      if ((localObject2 != null) && (localObject1 != null))
      {
        localObject1 = localObject3;
        if (localObject3 != null) {}
      }
      else
      {
        localObject1 = Integer.valueOf(700);
        localObject2 = Integer.valueOf(140);
      }
      int i1 = SimulateDataTest.random.nextInt(1000);
      int i2;
      label168:
      int i4;
      if (i1 <= ((Integer)localObject1).intValue())
      {
        localObject1 = "0";
        localObject2 = a(Integer.parseInt((String)localObject1));
        i1 = 0;
        i2 = 0;
        if (i1 < ((b)localObject2).size()) {
          break label267;
        }
        i4 = SimulateDataTest.random.nextInt(i2);
        i2 = 0;
        i1 = 0;
      }
      for (;;)
      {
        if (i1 >= ((b)localObject2).size()) {}
        label267:
        int i3;
        for (i1 = 1;; i1 = i3)
        {
          localObject2 = PhoneNetWork_NetWorkTypeActivity.a(i1);
          return new String[] { localObject1, i1, localObject2 };
          if (i1 <= ((Integer)localObject1).intValue() + ((Integer)localObject2).intValue())
          {
            localObject1 = "1";
            break;
          }
          localObject1 = "2";
          break;
          i2 += ((b)localObject2).a(i1).h("progress");
          i1 += 1;
          break label168;
          localObject3 = ((b)localObject2).a(i1);
          i3 = ((Map)localObject3).h("value");
          i2 += ((Map)localObject3).h("progress");
          if (i4 > i2) {
            break label324;
          }
        }
        label324:
        i1 += 1;
      }
    }
    catch (Exception localException)
    {
      break label21;
    }
  }
  
  private void b()
  {
    float f1 = this.g.getProgress() / 10.0F;
    float f2 = this.h.getProgress() / 10.0F;
    float f3 = this.i.getProgress() / 10.0F;
    this.j.setText("当前概率：" + f1);
    this.k.setText("当前概率：" + f2);
    this.l.setText("当前概率：" + f3);
  }
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramCompoundButton == this.m)
    {
      if (paramBoolean)
      {
        this.n.setChecked(false);
        this.o.setChecked(false);
      }
      this.i.setEnabled(true);
      this.h.setEnabled(true);
      this.g.setEnabled(false);
    }
    do
    {
      return;
      if (paramCompoundButton == this.n)
      {
        if (paramBoolean)
        {
          this.m.setChecked(false);
          this.o.setChecked(false);
        }
        this.i.setEnabled(true);
        this.h.setEnabled(false);
        this.g.setEnabled(true);
        return;
      }
    } while (paramCompoundButton != this.o);
    if (paramBoolean)
    {
      this.m.setChecked(false);
      this.n.setChecked(false);
    }
    this.i.setEnabled(false);
    this.h.setEnabled(true);
    this.g.setEnabled(true);
  }
  
  public void onClick(View paramView)
  {
    if (paramView.equals(this.f))
    {
      paramView = new Intent();
      paramView.setClass(this, PhoneNetWork_NetWorkTypeActivity.class);
      paramView.putExtra("kind", 1);
      startActivity(paramView);
    }
    do
    {
      return;
      if (paramView.equals(this.e))
      {
        paramView = new Intent();
        paramView.setClass(this, PhoneNetWork_NetWorkTypeActivity.class);
        paramView.putExtra("kind", 2);
        startActivity(paramView);
        return;
      }
    } while (!paramView.equals(this.d));
    paramView = new Intent();
    paramView.setClass(this, PhoneNetWork_NetWorkTypeActivity.class);
    paramView.putExtra("kind", 0);
    startActivity(paramView);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903104);
    this.d = ((Button)findViewById(2131362105));
    this.e = ((Button)findViewById(2131362113));
    this.f = ((Button)findViewById(2131362109));
    this.g = ((SeekBar)findViewById(2131362106));
    this.h = ((SeekBar)findViewById(2131362114));
    this.i = ((SeekBar)findViewById(2131362110));
    this.j = ((TextView)findViewById(2131362107));
    this.k = ((TextView)findViewById(2131362115));
    this.l = ((TextView)findViewById(2131362111));
    this.m = ((RadioButton)findViewById(2131362108));
    this.n = ((RadioButton)findViewById(2131362116));
    this.o = ((RadioButton)findViewById(2131362112));
    this.m.setOnCheckedChangeListener(this);
    this.n.setOnCheckedChangeListener(this);
    this.o.setOnCheckedChangeListener(this);
    this.f.setOnClickListener(this);
    this.e.setOnClickListener(this);
    this.d.setOnClickListener(this);
    this.n.setChecked(true);
    paramBundle = PoseHelper008.getFileData("newWork");
    try
    {
      q = a.b(paramBundle);
      label247:
      if (q == null) {
        q = new Map();
      }
      this.i.setMax(1000);
      this.h.setMax(1000);
      this.g.setMax(1000);
      Integer localInteger1 = q.g("seekBarDianXin");
      Object localObject = q.g("seekBarLianTong");
      Integer localInteger2 = q.g("seekBarYidong");
      if ((localInteger1 != null) && (localObject != null))
      {
        paramBundle = localInteger2;
        if (localInteger2 != null) {}
      }
      else
      {
        paramBundle = Integer.valueOf(700);
        localObject = Integer.valueOf(160);
        localInteger1 = Integer.valueOf(140);
      }
      this.i.setProgress(localInteger1.intValue());
      this.h.setProgress(((Integer)localObject).intValue());
      this.g.setProgress(paramBundle.intValue());
      this.a = paramBundle.intValue();
      this.b = localInteger1.intValue();
      this.c = ((Integer)localObject).intValue();
      this.g.setOnSeekBarChangeListener(this);
      this.h.setOnSeekBarChangeListener(this);
      this.i.setOnSeekBarChangeListener(this);
      this.p = ((CheckBox)findViewById(2131362117));
      if ((q.getStringfrommap("checkBoxOpen") != null) && (q.getStringfrommap("checkBoxOpen").equals("true"))) {
        this.p.setChecked(true);
      }
      b();
      paramBundle = a(0);
      if ((paramBundle == null) || (paramBundle.size() == 0))
      {
        paramBundle = new b();
        a(0, paramBundle);
        localObject = new Map();
        ((Map)localObject).putkey("precent", Integer.valueOf(0));
        ((Map)localObject).putkey("progress", Integer.valueOf(200));
        ((Map)localObject).putkey("value", Integer.valueOf(13));
        paramBundle.add(localObject);
        localObject = new Map();
        ((Map)localObject).putkey("precent", Integer.valueOf(0));
        ((Map)localObject).putkey("progress", Integer.valueOf(100));
        ((Map)localObject).putkey("value", Integer.valueOf(8));
        paramBundle.add(localObject);
        localObject = new Map();
        ((Map)localObject).putkey("precent", Integer.valueOf(0));
        ((Map)localObject).putkey("progress", Integer.valueOf(60));
        ((Map)localObject).putkey("value", Integer.valueOf(1));
        paramBundle.add(localObject);
        localObject = new Map();
        ((Map)localObject).putkey("precent", Integer.valueOf(0));
        ((Map)localObject).putkey("progress", Integer.valueOf(60));
        ((Map)localObject).putkey("value", Integer.valueOf(2));
        paramBundle.add(localObject);
      }
      paramBundle = a(1);
      if ((paramBundle == null) || (paramBundle.size() == 0))
      {
        paramBundle = new b();
        a(1, paramBundle);
        localObject = new Map();
        ((Map)localObject).putkey("precent", Integer.valueOf(0));
        ((Map)localObject).putkey("progress", Integer.valueOf(200));
        ((Map)localObject).putkey("value", Integer.valueOf(13));
        paramBundle.add(localObject);
        localObject = new Map();
        ((Map)localObject).putkey("precent", Integer.valueOf(0));
        ((Map)localObject).putkey("progress", Integer.valueOf(100));
        ((Map)localObject).putkey("value", Integer.valueOf(5));
        paramBundle.add(localObject);
        localObject = new Map();
        ((Map)localObject).putkey("precent", Integer.valueOf(0));
        ((Map)localObject).putkey("progress", Integer.valueOf(120));
        ((Map)localObject).putkey("value", Integer.valueOf(4));
        paramBundle.add(localObject);
      }
      paramBundle = a(2);
      if ((paramBundle == null) || (paramBundle.size() == 0))
      {
        paramBundle = new b();
        a(2, paramBundle);
        localObject = new Map();
        ((Map)localObject).putkey("precent", Integer.valueOf(0));
        ((Map)localObject).putkey("progress", Integer.valueOf(200));
        ((Map)localObject).putkey("value", Integer.valueOf(13));
        paramBundle.add(localObject);
        localObject = new Map();
        ((Map)localObject).putkey("precent", Integer.valueOf(0));
        ((Map)localObject).putkey("progress", Integer.valueOf(50));
        ((Map)localObject).putkey("value", Integer.valueOf(3));
        paramBundle.add(localObject);
        localObject = new Map();
        ((Map)localObject).putkey("precent", Integer.valueOf(0));
        ((Map)localObject).putkey("progress", Integer.valueOf(50));
        ((Map)localObject).putkey("value", Integer.valueOf(8));
        paramBundle.add(localObject);
        localObject = new Map();
        ((Map)localObject).putkey("precent", Integer.valueOf(0));
        ((Map)localObject).putkey("progress", Integer.valueOf(60));
        ((Map)localObject).putkey("value", Integer.valueOf(1));
        paramBundle.add(localObject);
        localObject = new Map();
        ((Map)localObject).putkey("precent", Integer.valueOf(0));
        ((Map)localObject).putkey("progress", Integer.valueOf(60));
        ((Map)localObject).putkey("value", Integer.valueOf(2));
        paramBundle.add(localObject);
      }
      return;
    }
    catch (Exception paramBundle)
    {
      break label247;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296272, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362304)
    {
      Intent localIntent = new Intent();
      localIntent.setClass(this, WebMessageActivity.class);
      localIntent.putExtra("url", StartActivity.b + "/phone/ContentAction.action?action=net_work");
      startActivity(localIntent);
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  protected void onPause()
  {
    int i1 = this.i.getProgress();
    int i2 = this.g.getProgress();
    int i3 = this.h.getProgress();
    q.putkey("seekBarDianXin", Integer.valueOf(i1));
    q.putkey("seekBarYidong", Integer.valueOf(i2));
    q.putkey("seekBarLianTong", Integer.valueOf(i3));
    if (this.p.isChecked()) {
      q.putkey("checkBoxOpen", "true");
    }
    for (;;)
    {
      PoseHelper008.saveDataToFile("newWork", q.a());
      super.onPause();
      return;
      q.putkey("checkBoxOpen", "false");
    }
  }
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    Object localObject2 = null;
    Object localObject1;
    if ((this.i != paramSeekBar) && (!this.i.isEnabled())) {
      localObject1 = this.i;
    }
    for (;;)
    {
      if (localObject1 == null) {}
      for (int i1 = 0;; i1 = ((SeekBar)localObject1).getProgress())
      {
        i1 = 1000 - paramInt - i1;
        if (i1 >= 0) {
          break label127;
        }
        paramSeekBar.setProgress(paramInt + i1);
        b();
        return;
        if ((this.h != paramSeekBar) && (!this.h.isEnabled()))
        {
          localObject1 = this.h;
          break;
        }
        if ((this.g == paramSeekBar) || (this.g.isEnabled())) {
          break label228;
        }
        localObject1 = this.g;
        break;
      }
      label127:
      paramSeekBar.setProgress(paramInt);
      if ((this.i != paramSeekBar) && (this.i.isEnabled())) {
        localObject1 = this.i;
      }
      for (;;)
      {
        ((SeekBar)localObject1).setProgress(i1);
        break;
        if ((this.h != paramSeekBar) && (this.h.isEnabled()))
        {
          localObject1 = this.h;
        }
        else
        {
          localObject1 = localObject2;
          if (this.g != paramSeekBar)
          {
            localObject1 = localObject2;
            if (this.g.isEnabled()) {
              localObject1 = this.g;
            }
          }
        }
      }
      label228:
      localObject1 = null;
    }
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public void onStopTrackingTouch(SeekBar paramSeekBar) {}
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.PhoneNetWorkActivity

 * JD-Core Version:    0.7.0.1

 */