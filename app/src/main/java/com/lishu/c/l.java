package com.lishu.c;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;

final class l
  implements Runnable
{
  l(AlertDialog.Builder paramBuilder, Activity paramActivity) {}
  
  public final void run()
  {
    AlertDialog localAlertDialog = this.a.create();
    localAlertDialog.setCancelable(false);
    if (!this.b.isFinishing()) {
      localAlertDialog.show();
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.lishu.c.l
 * JD-Core Version:    0.7.0.1
 */