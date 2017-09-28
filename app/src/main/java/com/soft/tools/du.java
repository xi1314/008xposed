package com.soft.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.Editable;
import android.widget.EditText;
import com.a.a.b;

final class du
  implements DialogInterface.OnClickListener
{
  du(RecordAppFileHandlerSetting paramRecordAppFileHandlerSetting, EditText paramEditText) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = this.b.getText().toString();
    if (paramDialogInterface.trim().length() > 0)
    {
      RecordAppFileHandlerSetting.a.add(paramDialogInterface);
      RecordAppFileHandlerSetting.a(this.a).notifyDataSetChanged();
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.du
 * JD-Core Version:    0.7.0.1
 */