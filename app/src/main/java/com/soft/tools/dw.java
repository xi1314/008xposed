package com.soft.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.a.a.b;

final class dw
  implements DialogInterface.OnClickListener
{
  dw(dv paramdv, int paramInt) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    RecordAppFileHandlerSetting.a.remove(this.b);
    RecordAppFileHandlerSetting.a(RecordAppFileHandlerSetting.a.a(dv.a(this.a))).notifyDataSetChanged();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.dw
 * JD-Core Version:    0.7.0.1
 */