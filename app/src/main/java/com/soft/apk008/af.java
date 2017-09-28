package com.soft.apk008;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.Editable;
import android.widget.EditText;
import com.lishu.b.a.a;

final class af
  implements DialogInterface.OnClickListener
{
  af(HistoryActivity paramHistoryActivity, EditText paramEditText) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = this.b.getText().toString();
    a.a(HistoryActivity.a, paramDialogInterface);
    HistoryActivity.a(this.a);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.af
 * JD-Core Version:    0.7.0.1
 */