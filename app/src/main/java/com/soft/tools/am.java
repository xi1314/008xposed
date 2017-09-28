package com.soft.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class am
  implements DialogInterface.OnClickListener
{
  am(FolderBackUpActivity paramFolderBackUpActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = this.a;
    FolderBackUpActivity.a(FolderBackUpActivity.b(this.a));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.am
 * JD-Core Version:    0.7.0.1
 */