package com.soft.tools.messageAndContacts;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class d
  implements DialogInterface.OnClickListener
{
  d(MessageAndContactsCreateActivity paramMessageAndContactsCreateActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    h.a(this.a);
    MessageAndContactsCreateActivity.b(this.a, this.a.b());
    MessageAndContactsCreateActivity.f(this.a).notifyDataSetChanged();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.messageAndContacts.getMap

 * JD-Core Version:    0.7.0.1

 */