package com.soft.apk008;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.lishu.b.a.a;

final class an
  implements DialogInterface.OnClickListener
{
  an(am paramam, String paramString) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    a.c(HistoryActivity.a, this.b);
    paramDialogInterface.cancel();
    HistoryActivity.a(am.a(this.a));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.an
 * JD-Core Version:    0.7.0.1
 */