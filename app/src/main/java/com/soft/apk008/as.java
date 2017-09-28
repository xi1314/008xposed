package com.soft.apk008;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class as
  implements DialogInterface.OnClickListener
{
  as(HistoryActivity paramHistoryActivity, CheckBox paramCheckBox) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.b.isChecked())
    {
      PoseHelper008.saveDataToFile("historyActivity", "true");
      return;
    }
    PoseHelper008.saveDataToFile("historyActivity", "false");
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.as
 * JD-Core Version:    0.7.0.1
 */