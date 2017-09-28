package com.soft.tools.messageAndContacts;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class c
  implements DialogInterface.OnClickListener
{
  c(MessageAndContactsCreateActivity paramMessageAndContactsCreateActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    b.a(this.a);
    MessageAndContactsCreateActivity.a(this.a, MessageAndContactsCreateActivity.d(this.a));
    MessageAndContactsCreateActivity.e(this.a).notifyDataSetChanged();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.messageAndContacts.c
 * JD-Core Version:    0.7.0.1
 */