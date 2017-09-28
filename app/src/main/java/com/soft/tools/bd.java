package com.soft.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

final class bd
  implements DialogInterface.OnClickListener
{
  bd(FolderBackUpListActivity paramFolderBackUpListActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = FolderBackUpListActivity.e(this.a).iterator();
    for (;;)
    {
      if (!paramDialogInterface.hasNext())
      {
        FolderBackUpListActivity.g(this.a);
        return;
      }
      String str = (String)paramDialogInterface.next();
      new File(FolderBackUpListActivity.f(this.a) + "/" + str).delete();
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.bd
 * JD-Core Version:    0.7.0.1
 */