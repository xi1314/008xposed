package com.soft.tools;

import android.widget.CompoundButton;

final class ep
  implements CompoundButton.OnCheckedChangeListener
{
  ep(SetSystemValueActivity.a parama, SetSystemValueActivity.b paramb) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    int i = ((Integer)this.b.d.getTag()).intValue();
    paramCompoundButton = SetSystemValueActivity.a.a(this.a).a.a(i);
    if (paramBoolean)
    {
      paramCompoundButton.a("check", "true");
      return;
    }
    paramCompoundButton.a("check", "false");
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.ep

 * JD-Core Version:    0.7.0.1

 */