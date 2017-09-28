package com.soft.tools;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class cv
  implements DialogInterface.OnClickListener
{
  cv(QuickToolActivity paramQuickToolActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    QuickToolActivity.p(this.a).hide();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.cv
 * JD-Core Version:    0.7.0.1
 */