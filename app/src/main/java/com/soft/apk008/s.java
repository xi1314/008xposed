package com.soft.apk008;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class s
  implements DialogInterface.OnClickListener
{
  s(Apk008Activity paramApk008Activity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.cancel();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.s
 * JD-Core Version:    0.7.0.1
 */