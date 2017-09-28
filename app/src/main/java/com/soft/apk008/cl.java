package com.soft.apk008;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

final class cl
  implements DialogInterface.OnClickListener
{
  cl(SetMessageActivity paramSetMessageActivity, boolean paramBoolean) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    new cm(this).start();
    if (this.b) {
      Toast.makeText(this.a, "添加到历史记录成功", 0).show();
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.cl
 * JD-Core Version:    0.7.0.1
 */