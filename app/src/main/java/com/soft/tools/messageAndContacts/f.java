package com.soft.tools.messageAndContacts;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ListView;

final class f
  implements DialogInterface.OnClickListener
{
  f(MessageAndContactsCreateActivity paramMessageAndContactsCreateActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    int i = 0;
    int j = 0;
    paramInt = 0;
    if (MessageAndContactsCreateActivity.h(this.a).getAdapter() == MessageAndContactsCreateActivity.e(this.a))
    {
      i = MessageAndContactsSetActivity.b();
      b.a(this.a);
      if (paramInt >= i)
      {
        MessageAndContactsCreateActivity.a(this.a, MessageAndContactsCreateActivity.d(this.a));
        MessageAndContactsCreateActivity.e(this.a).notifyDataSetChanged();
      }
    }
    do
    {
      return;
      b.b(this.a);
      paramInt += 1;
      break;
      if (MessageAndContactsCreateActivity.h(this.a).getAdapter() == MessageAndContactsCreateActivity.f(this.a))
      {
        j = MessageAndContactsSetActivity.a();
        h.a(this.a);
        paramInt = i;
        for (;;)
        {
          if (paramInt >= j)
          {
            MessageAndContactsCreateActivity.b(this.a, this.a.b());
            MessageAndContactsCreateActivity.f(this.a).notifyDataSetChanged();
            return;
          }
          h.b(this.a);
          paramInt += 1;
        }
      }
    } while (MessageAndContactsCreateActivity.h(this.a).getAdapter() != MessageAndContactsCreateActivity.g(this.a));
    i = MessageAndContactsSetActivity.a();
    a.a(this.a);
    paramInt = j;
    for (;;)
    {
      if (paramInt >= i)
      {
        MessageAndContactsCreateActivity.c(this.a, this.a.a());
        MessageAndContactsCreateActivity.g(this.a).notifyDataSetChanged();
        return;
      }
      a.b(this.a);
      paramInt += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.messageAndContacts.applicationInfolist

 * JD-Core Version:    0.7.0.1

 */