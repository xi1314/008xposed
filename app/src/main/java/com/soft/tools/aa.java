package com.soft.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.a.a.b;

final class aa
  implements DialogInterface.OnClickListener
{
  aa(DeleteFolderActivity paramDeleteFolderActivity, int paramInt) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    DeleteFolderActivity.a(this.a).remove(this.b);
    DeleteFolderActivity.b(this.a).notifyDataSetChanged();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.aa
 * JD-Core Version:    0.7.0.1
 */