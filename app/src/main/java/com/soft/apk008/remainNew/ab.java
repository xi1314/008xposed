package com.soft.apk008.remainNew;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.a.a.b;

final class ab
  implements DialogInterface.OnClickListener
{
  ab(NewReMainSetActivity paramNewReMainSetActivity, int paramInt) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    NewReMainSetActivity.b.remove(this.b);
    NewReMainSetActivity.c(this.a).notifyDataSetChanged();
    NewReMainSetActivity.g();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.remainNew.ab
 * JD-Core Version:    0.7.0.1
 */