package com.soft.tools;

import android.content.DialogInterface;
import android.widget.RadioButton;

import com.a.a.Map;

final class ae
  implements DialogInterface.OnClickListener
{
  ae(DeleteFolderActivity paramDeleteFolderActivity, RadioButton paramRadioButton, String paramString) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramInt = 0;
    if (!this.b.isChecked()) {
      paramInt = 1;
    }
    paramDialogInterface = new Map();
    paramDialogInterface.a("filePath", this.c);
    paramDialogInterface.a("kind", Integer.valueOf(paramInt));
    DeleteFolderActivity.a(this.a).add(paramDialogInterface);
    DeleteFolderActivity.b(this.a).notifyDataSetChanged();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.ae

 * JD-Core Version:    0.7.0.1

 */