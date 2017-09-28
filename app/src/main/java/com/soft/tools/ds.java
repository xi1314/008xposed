package com.soft.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class ds
  implements DialogInterface.OnClickListener
{
  ds(RecordAppFileHandler paramRecordAppFileHandler) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.cancel();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.ds
 * JD-Core Version:    0.7.0.1
 */