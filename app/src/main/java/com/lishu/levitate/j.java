package com.lishu.levitate;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.Window;

final class j
  implements Runnable
{
  j(a parama, AlertDialog.Builder paramBuilder) {}
  
  public final void run()
  {
    AlertDialog localAlertDialog = this.b.create();
    localAlertDialog.getWindow().setType(2003);
    localAlertDialog.setCancelable(false);
    localAlertDialog.show();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.lishu.levitate.j
 * JD-Core Version:    0.7.0.1
 */