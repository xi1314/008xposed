package com.lishu.levitate;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class i
  implements DialogInterface.OnClickListener
{
  i(a parama) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.cancel();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.lishu.levitate.i
 * JD-Core Version:    0.7.0.1
 */