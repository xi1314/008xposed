package com.soft.tools.accountSim;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.a.a.b;

final class h
  implements DialogInterface.OnClickListener
{
  h(g paramg, int paramInt) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AccountSimSetActivity.d().remove(this.b);
    AccountSimSetActivity.a(AccountSimSetActivity.a.a(g.a(this.a))).notifyDataSetChanged();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.accountSim.h
 * JD-Core Version:    0.7.0.1
 */