package com.soft.tools;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class j
  implements DialogInterface.OnClickListener
{
  j(BackupFileActivity paramBackupFileActivity, int paramInt, String[] paramArrayOfString) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    BackupFileActivity.d(this.a).show();
    new k(this, this.b, this.c).start();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.recenttaskinfolist

 * JD-Core Version:    0.7.0.1

 */