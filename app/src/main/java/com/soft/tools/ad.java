package com.soft.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class ad
  implements DialogInterface.OnClickListener
{
  ad(DeleteFolderActivity paramDeleteFolderActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.cancel();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.ad
 * JD-Core Version:    0.7.0.1
 */