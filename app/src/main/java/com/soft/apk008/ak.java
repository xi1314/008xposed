package com.soft.apk008;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.Editable;
import android.widget.EditText;
import com.lishu.b.a.a;

final class ak
  implements DialogInterface.OnClickListener
{
  ak(aj paramaj, EditText paramEditText, String paramString) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str = this.b.getText().toString();
    if (str.length() > 0)
    {
      a.a(HistoryActivity.a, this.c, str);
      HistoryActivity.a(aj.a(this.a));
      paramDialogInterface.cancel();
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.ak
 * JD-Core Version:    0.7.0.1
 */