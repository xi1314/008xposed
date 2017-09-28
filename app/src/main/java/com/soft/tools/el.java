package com.soft.tools;

import android.widget.CompoundButton;

final class el
  implements CompoundButton.OnCheckedChangeListener
{
  el(SetSystemValueActivity paramSetSystemValueActivity) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      i = j;
      for (;;)
      {
        try
        {
          j = this.a.a.size();
          if (i < j) {
            continue;
          }
        }
        catch (Exception paramCompoundButton)
        {
          continue;
        }
        SetSystemValueActivity.c(this.a).notifyDataSetChanged();
        return;
        this.a.a.a(i).a("check", "true");
        i += 1;
      }
    }
    while (i < this.a.a.size())
    {
      this.a.a.a(i).a("check", "false");
      i += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.el

 * JD-Core Version:    0.7.0.1

 */