package com.soft.tools.accountSim;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class b
  implements CompoundButton.OnCheckedChangeListener
{
  b(AccountSimActivity paramAccountSimActivity) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (AccountSimActivity.a(this.a).isChecked())
    {
      AccountSimSetActivity.a(Boolean.valueOf(true));
      return;
    }
    AccountSimSetActivity.a(Boolean.valueOf(false));
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.accountSim.Inttolong

 * JD-Core Version:    0.7.0.1

 */