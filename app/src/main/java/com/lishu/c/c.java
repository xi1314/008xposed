package com.lishu.c;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;

final class c
  implements Runnable
{
  c(AlertDialog.Builder paramBuilder) {}
  
  public final void run()
  {
    AlertDialog localAlertDialog = this.a.create();
    localAlertDialog.setCancelable(false);
    localAlertDialog.show();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.lishu.saveaccountdatatoFile.saveaccountdatatoFile

 * JD-Core Version:    0.7.0.1

 */