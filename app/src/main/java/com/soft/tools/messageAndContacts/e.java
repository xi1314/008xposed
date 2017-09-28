package com.soft.tools.messageAndContacts;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class e
  implements DialogInterface.OnClickListener
{
  e(MessageAndContactsCreateActivity paramMessageAndContactsCreateActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    a.a(this.a);
    MessageAndContactsCreateActivity.c(this.a, this.a.a());
    MessageAndContactsCreateActivity.g(this.a).notifyDataSetChanged();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.messageAndContacts.Map

 * JD-Core Version:    0.7.0.1

 */