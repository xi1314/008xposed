package com.soft.apk008;

import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class bm
  implements Runnable
{
  bm(bl parambl) {}
  
  public final void run()
  {
    bl.a(this.a).b();
    Object localObject1 = (LayoutInflater)bl.a(this.a).getSystemService("layout_inflater");
    SetDataActivity.a(bl.a(this.a), ((LayoutInflater)localObject1).inflate(2130903070, null));
    Object localObject2 = new LinearLayout.LayoutParams(-1, -1);
    SetDataActivity.j(bl.a(this.a)).addView(SetDataActivity.k(bl.a(this.a)), (ViewGroup.LayoutParams)localObject2);
    SetDataActivity.a(bl.a(this.a), (EditText)SetDataActivity.k(bl.a(this.a)).findViewById(2131361980));
    SetDataActivity.b(bl.a(this.a), (EditText)SetDataActivity.k(bl.a(this.a)).findViewById(2131361978));
    SetDataActivity.a(bl.a(this.a), (Button)SetDataActivity.k(bl.a(this.a)).findViewById(2131361979));
    SetDataActivity.b(bl.a(this.a), (Button)SetDataActivity.k(bl.a(this.a)).findViewById(2131361981));
    SetDataActivity.a(bl.a(this.a), (RadioGroup)SetDataActivity.k(bl.a(this.a)).findViewById(2131361972));
    SetDataActivity.i(bl.a(this.a)).setEnabled(true);
    SetDataActivity.i(bl.a(this.a)).setOnClickListener(bl.a(this.a).i);
    SetDataActivity.h(bl.a(this.a)).setOnClickListener(bl.a(this.a).i);
    localObject2 = PoseHelper008.valueMap.get("getJiZhan");
    SetDataActivity.l(bl.a(this.a)).setText((CharSequence)localObject2);
    localObject2 = PoseHelper008.valueMap.get("gps");
    SetDataActivity.m(bl.a(this.a)).setText((CharSequence)localObject2);
    localObject2 = PoseHelper008.valueMap.get("location_mode");
    if (((String)localObject2).equals("1"))
    {
      ((RadioButton)SetDataActivity.k(bl.a(this.a)).findViewById(2131361973)).setChecked(true);
      SetDataActivity.b(bl.a(this.a), ((LayoutInflater)localObject1).inflate(2130903073, null));
      localObject1 = new LinearLayout.LayoutParams(-1, -1);
      SetDataActivity.j(bl.a(this.a)).addView(SetDataActivity.n(bl.a(this.a)), (ViewGroup.LayoutParams)localObject1);
      SetDataActivity.b(bl.a(this.a), (RadioGroup)SetDataActivity.n(bl.a(this.a)).findViewById(2131361991));
      localObject1 = PoseHelper008.valueMap.get("connect_mode");
      if (!StartActivity.f)
      {
        SetDataActivity.n(bl.a(this.a)).findViewById(2131361992).setEnabled(false);
        SetDataActivity.n(bl.a(this.a)).findViewById(2131361993).setEnabled(false);
        SetDataActivity.n(bl.a(this.a)).findViewById(2131361994).setEnabled(false);
        localObject1 = "0";
      }
      if (!((String)localObject1).equals("1")) {
        break label673;
      }
      ((RadioButton)SetDataActivity.n(bl.a(this.a)).findViewById(2131361992)).setChecked(true);
    }
    for (;;)
    {
      SetDataActivity.g(bl.a(this.a)).hide();
      return;
      if (((String)localObject2).equals("2"))
      {
        ((RadioButton)SetDataActivity.k(bl.a(this.a)).findViewById(2131361974)).setChecked(true);
        break;
      }
      ((RadioButton)SetDataActivity.k(bl.a(this.a)).findViewById(2131361977)).setChecked(true);
      break;
      label673:
      if (((String)localObject1).equals("2")) {
        ((RadioButton)SetDataActivity.n(bl.a(this.a)).findViewById(2131361993)).setChecked(true);
      } else {
        ((RadioButton)SetDataActivity.n(bl.a(this.a)).findViewById(2131361994)).setChecked(true);
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.bm

 * JD-Core Version:    0.7.0.1

 */