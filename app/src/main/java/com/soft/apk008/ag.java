package com.soft.apk008;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;
import com.lishu.b.a.a;

final class ag
  implements DialogInterface.OnClickListener
{
  ag(HistoryActivity paramHistoryActivity, EditText paramEditText) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = this.b.getText().toString();
    if (a.a(paramDialogInterface))
    {
      HistoryActivity.a = paramDialogInterface;
      HistoryActivity.a(this.a);
      return;
    }
    Toast.makeText(this.a, "添加失败", 0).show();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.ag
 * JD-Core Version:    0.7.0.1
 */