package com.soft.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.a.a.b;

final class ar
  implements DialogInterface.OnClickListener
{
  ar(FolderBackUpActivity paramFolderBackUpActivity, int paramInt) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    FolderBackUpActivity.e().remove(this.b);
    FolderBackUpActivity.a(this.a).notifyDataSetChanged();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.ar
 * JD-Core Version:    0.7.0.1
 */