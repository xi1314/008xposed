package com.soft.tools;

import android.widget.CheckBox;
import android.widget.CompoundButton;

final class af
  implements CompoundButton.OnCheckedChangeListener
{
  af(DepthSetActivity.a parama, CheckBox paramCheckBox) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    paramCompoundButton = this.b.getText().toString();
    if (this.b.isChecked())
    {
      DepthSetActivity.isexistkey().a(paramCompoundButton, "");
      return;
    }
    DepthSetActivity.isexistkey().remove(paramCompoundButton);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.af

 * JD-Core Version:    0.7.0.1

 */