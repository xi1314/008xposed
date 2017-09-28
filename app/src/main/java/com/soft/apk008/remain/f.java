package com.soft.apk008.remain;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class f
  implements DialogInterface.OnClickListener
{
  f(ReMainActivity paramReMainActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.cancel();
  }
}

