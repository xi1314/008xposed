package com.soft.apk008;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class ar
  implements DialogInterface.OnClickListener
{
  ar(HistoryActivity paramHistoryActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.cancel();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.ar
 * JD-Core Version:    0.7.0.1
 */