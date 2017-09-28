package com.soft.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

final class ak
  implements DialogInterface.OnClickListener
{
  ak(FolderBackUpActivity paramFolderBackUpActivity, EditText paramEditText) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.b.setText("/data/data/");
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.ak
 * JD-Core Version:    0.7.0.1
 */