package com.soft.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;
import de.robv.android.xposed.mods.tutorial.f;

final class dr
  implements DialogInterface.OnClickListener
{
  dr(RecordAppFileHandler paramRecordAppFileHandler) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = RecordAppFileHandler.e(this.a).getText().toString();
    if (paramDialogInterface.trim().length() > 0)
    {
      paramDialogInterface = paramDialogInterface.split("_")[1];
      f.d(paramDialogInterface);
      paramDialogInterface = f.a(paramDialogInterface);
      RecordAppFileHandler.d(this.a).setText(paramDialogInterface);
      Toast.makeText(this.a, "清除成功", 0).show();
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.dr
 * JD-Core Version:    0.7.0.1
 */