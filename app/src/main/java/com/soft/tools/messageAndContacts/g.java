package com.soft.tools.messageAndContacts;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

final class g
  implements View.OnClickListener
{
  g(MessageAndContactsSetActivity paramMessageAndContactsSetActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = MessageAndContactsSetActivity.a(this.a).getText().toString().trim();
    String str1 = MessageAndContactsSetActivity.b(this.a).getText().toString().trim();
    String str2 = MessageAndContactsSetActivity.c(this.a).getText().toString().trim();
    String str3 = MessageAndContactsSetActivity.d(this.a).getText().toString().trim();
    for (;;)
    {
      try
      {
        j = Integer.parseInt(str1);
        k = m;
      }
      catch (Exception paramView)
      {
        try
        {
          k = Integer.parseInt(paramView);
        }
        catch (Exception paramView)
        {
          for (;;)
          {
            int n;
            i = 0;
            k = 0;
            m = j;
            j = k;
          }
        }
        try
        {
          i = Integer.parseInt(str2);
        }
        catch (Exception paramView)
        {
          i = 0;
          m = j;
          j = k;
          break label152;
        }
        try
        {
          m = Integer.parseInt(str3);
          n = k;
          k = j;
          if ((n > 0) && (k > 0) && (m > 0) && (i > 0)) {
            break;
          }
          Toast.makeText(this.a, "信息填写有误", 0).show();
          return;
        }
        catch (Exception paramView)
        {
          m = j;
          j = k;
          break label152;
        }
        paramView = paramView;
        i = 0;
        m = 0;
        j = 0;
      }
      label152:
      m = 0;
      n = j;
    }
    paramView = this.a;
    MessageAndContactsSetActivity.a(n, k);
    paramView = this.a;
    MessageAndContactsSetActivity.b(i, m);
    Toast.makeText(this.a, "保存成功", 0).show();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.messageAndContacts.g
 * JD-Core Version:    0.7.0.1
 */