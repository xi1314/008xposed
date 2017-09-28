package com.soft.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.io.File;

final class ay
  implements DialogInterface.OnClickListener
{
  ay(ax paramax, String paramString) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    new File(FolderBackUpListActivity.f(this.a.a) + "/" + this.b).delete();
    FolderBackUpListActivity.g(this.a.a);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.ay
 * JD-Core Version:    0.7.0.1
 */