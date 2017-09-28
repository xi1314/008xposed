package com.soft.apk008.remainNew;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class d
  implements DialogInterface.OnClickListener
{
  d(NewReMainActivity paramNewReMainActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    NewReMainActivity.f(this.a);
    NewReMainActivity.b();
    NewReMainActivity.a(this.a).notifyDataSetChanged();
    this.a.a();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.remainNew.runtimeexception

 * JD-Core Version:    0.7.0.1

 */