package com.soft.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.a.a.b;

final class at
  implements DialogInterface.OnClickListener
{
  at(FolderBackUpActivity paramFolderBackUpActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    FolderBackUpActivity.e().clear();
    FolderBackUpActivity.a(this.a).notifyDataSetChanged();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.at
 * JD-Core Version:    0.7.0.1
 */