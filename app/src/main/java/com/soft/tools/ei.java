package com.soft.tools;

import android.widget.CompoundButton;

final class ei
  implements CompoundButton.OnCheckedChangeListener
{
  ei(SelectManuActivity.a parama) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    paramCompoundButton = paramCompoundButton.getText().toString();
    if (paramBoolean)
    {
      SelectManuActivity.c.putkey(paramCompoundButton, paramCompoundButton);
      return;
    }
    SelectManuActivity.c.remove(paramCompoundButton);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.ei

 * JD-Core Version:    0.7.0.1

 */