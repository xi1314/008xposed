package com.soft.apk008;

import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class ci
  implements Runnable
{
  ci(ch paramch) {}
  
  public final void run()
  {
    ch.a(this.a).b();
    Object localObject1 = (LayoutInflater)ch.a(this.a).getSystemService("layout_inflater");
    SetMessageActivity.a(ch.a(this.a), ((LayoutInflater)localObject1).inflate(2130903070, null));
    Object localObject2 = new LinearLayout.LayoutParams(-1, -1);
    SetMessageActivity.k(ch.a(this.a)).addView(SetMessageActivity.l(ch.a(this.a)), (ViewGroup.LayoutParams)localObject2);
    SetMessageActivity.a(ch.a(this.a), (EditText)SetMessageActivity.l(ch.a(this.a)).findViewById(2131361980));
    SetMessageActivity.b(ch.a(this.a), (EditText)SetMessageActivity.l(ch.a(this.a)).findViewById(2131361978));
    SetMessageActivity.a(ch.a(this.a), (Button)SetMessageActivity.l(ch.a(this.a)).findViewById(2131361979));
    SetMessageActivity.b(ch.a(this.a), (Button)SetMessageActivity.l(ch.a(this.a)).findViewById(2131361981));
    SetMessageActivity.a(ch.a(this.a), (RadioGroup)SetMessageActivity.l(ch.a(this.a)).findViewById(2131361972));
    SetMessageActivity.j(ch.a(this.a)).setEnabled(true);
    SetMessageActivity.j(ch.a(this.a)).setOnClickListener(ch.a(this.a).i);
    SetMessageActivity.i(ch.a(this.a)).setOnClickListener(ch.a(this.a).i);
    localObject2 = PoseHelper008.valueMap.get("getJiZhan");
    SetMessageActivity.m(ch.a(this.a)).setText((CharSequence)localObject2);
    localObject2 = PoseHelper008.valueMap.get("gps");
    SetMessageActivity.n(ch.a(this.a)).setText((CharSequence)localObject2);
    localObject2 = PoseHelper008.valueMap.get("location_mode");
    if (((String)localObject2).equals("1"))
    {
      ((RadioButton)SetMessageActivity.l(ch.a(this.a)).findViewById(2131361973)).setChecked(true);
      SetMessageActivity.b(ch.a(this.a), ((LayoutInflater)localObject1).inflate(2130903073, null));
      localObject1 = new LinearLayout.LayoutParams(-1, -1);
      SetMessageActivity.k(ch.a(this.a)).addView(SetMessageActivity.o(ch.a(this.a)), (ViewGroup.LayoutParams)localObject1);
      SetMessageActivity.b(ch.a(this.a), (RadioGroup)SetMessageActivity.o(ch.a(this.a)).findViewById(2131361991));
      localObject1 = PoseHelper008.valueMap.get("connect_mode");
      if (!StartActivity.f)
      {
        SetMessageActivity.o(ch.a(this.a)).findViewById(2131361992).setEnabled(false);
        SetMessageActivity.o(ch.a(this.a)).findViewById(2131361993).setEnabled(false);
        SetMessageActivity.o(ch.a(this.a)).findViewById(2131361994).setEnabled(false);
        localObject1 = "0";
      }
      if (!((String)localObject1).equals("1")) {
        break label741;
      }
      ((RadioButton)SetMessageActivity.o(ch.a(this.a)).findViewById(2131361992)).setChecked(true);
    }
    for (;;)
    {
      SetMessageActivity.h(ch.a(this.a)).hide();
      return;
      if (((String)localObject2).equals("2"))
      {
        ((RadioButton)SetMessageActivity.l(ch.a(this.a)).findViewById(2131361974)).setChecked(true);
        break;
      }
      if (((String)localObject2).equals("3"))
      {
        ((RadioButton)SetMessageActivity.l(ch.a(this.a)).findViewById(2131361975)).setChecked(true);
        break;
      }
      if (((String)localObject2).equals("4"))
      {
        ((RadioButton)SetMessageActivity.l(ch.a(this.a)).findViewById(2131361976)).setChecked(true);
        break;
      }
      ((RadioButton)SetMessageActivity.l(ch.a(this.a)).findViewById(2131361977)).setChecked(true);
      break;
      label741:
      if (((String)localObject1).equals("2")) {
        ((RadioButton)SetMessageActivity.o(ch.a(this.a)).findViewById(2131361993)).setChecked(true);
      } else {
        ((RadioButton)SetMessageActivity.o(ch.a(this.a)).findViewById(2131361994)).setChecked(true);
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.ci

 * JD-Core Version:    0.7.0.1

 */