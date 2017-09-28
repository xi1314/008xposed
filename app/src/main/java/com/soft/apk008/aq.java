package com.soft.apk008;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.lishu.b.a.a;
import java.util.ArrayList;
import java.util.HashMap;

final class aq
  implements DialogInterface.OnClickListener
{
  aq(HistoryActivity paramHistoryActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if ((ArrayList)a.a.get(HistoryActivity.a) == null) {
      return;
    }
    a.b(HistoryActivity.a);
    HistoryActivity.a(this.a);
    paramDialogInterface.cancel();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.aq
 * JD-Core Version:    0.7.0.1
 */