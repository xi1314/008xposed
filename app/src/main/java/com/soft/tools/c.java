package com.soft.tools;

import android.widget.CompoundButton;

import com.soft.toos.findApp.a;

final class c
  implements CompoundButton.OnCheckedChangeListener
{
  c(BackUp_SelectMoreAppActivity.a parama, a parama1) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      BackUp_SelectMoreAppActivity.b(BackUp_SelectMoreAppActivity.a.a(this.a)).a(this.b.c, this.b.a);
      return;
    }
    BackUp_SelectMoreAppActivity.b(BackUp_SelectMoreAppActivity.a.a(this.a)).remove(this.b.c);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.saveaccountdatatoFile

 * JD-Core Version:    0.7.0.1

 */