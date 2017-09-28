package com.soft.apk008;

import android.widget.CompoundButton;

import com.soft.toos.findApp.a;

final class ba
  implements CompoundButton.OnCheckedChangeListener
{
  ba(SelectMoreAppActivity.a parama, a parama1) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      SelectMoreAppActivity.b(SelectMoreAppActivity.a.a(this.a)).a(this.b.c, this.b.a);
      return;
    }
    SelectMoreAppActivity.b(SelectMoreAppActivity.a.a(this.a)).remove(this.b.c);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.ba

 * JD-Core Version:    0.7.0.1

 */