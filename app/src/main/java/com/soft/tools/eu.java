package com.soft.tools;

import android.widget.CheckBox;
import android.widget.CompoundButton;

final class eu
  implements CompoundButton.OnCheckedChangeListener
{
  eu(ToolMainActivitySet.a parama, CheckBox paramCheckBox) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (this.b.isChecked())
    {
      ToolMainActivitySet.a().a(this.b.getText().toString(), "true");
      return;
    }
    ToolMainActivitySet.a().a(this.b.getText().toString(), "false");
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.eu

 * JD-Core Version:    0.7.0.1

 */