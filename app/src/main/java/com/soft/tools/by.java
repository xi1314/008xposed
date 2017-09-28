package com.soft.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.a.a.b;

final class by
  implements DialogInterface.OnClickListener
{
  by(IpRecordActivity paramIpRecordActivity, int paramInt) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    IpRecordActivity.a(this.a).remove(this.b);
    IpRecordActivity.f(this.a).notifyDataSetChanged();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.by
 * JD-Core Version:    0.7.0.1
 */