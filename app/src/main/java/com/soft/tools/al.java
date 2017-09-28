package com.soft.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.Editable;
import android.widget.EditText;
import com.a.a.b;

final class al
  implements DialogInterface.OnClickListener
{
  al(FolderBackUpActivity paramFolderBackUpActivity, EditText paramEditText) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    int i = 0;
    paramDialogInterface = this.a;
    FolderBackUpActivity.a(FolderBackUpActivity.b(this.a));
    paramDialogInterface = this.b.getText().toString();
    paramInt = 0;
    for (;;)
    {
      if (paramInt >= FolderBackUpActivity.e().size()) {}
      for (paramInt = i;; paramInt = 1)
      {
        if (paramInt == 0) {
          FolderBackUpActivity.e().add(paramDialogInterface);
        }
        this.a.c();
        return;
        if (!FolderBackUpActivity.e().e(paramInt).equals(paramDialogInterface)) {
          break;
        }
      }
      paramInt += 1;
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.al
 * JD-Core Version:    0.7.0.1
 */