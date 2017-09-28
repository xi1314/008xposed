package com.soft.tools.yunData;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.Editable;
import android.widget.EditText;

final class q
  implements DialogInterface.OnClickListener
{
  q(YunDataActivity paramYunDataActivity, EditText paramEditText) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    YunDataActivity.a = this.b.getText().toString();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.yunData.q
 * JD-Core Version:    0.7.0.1
 */