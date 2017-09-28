package com.soft.apk008.remainNew;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.a.a.b;

final class m
  implements DialogInterface.OnClickListener
{
  m(NewReMainSetActivity paramNewReMainSetActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    NewReMainSetActivity.b.clear();
    NewReMainSetActivity.c(this.a).notifyDataSetChanged();
    NewReMainSetActivity.g();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.remainNew.m
 * JD-Core Version:    0.7.0.1
 */