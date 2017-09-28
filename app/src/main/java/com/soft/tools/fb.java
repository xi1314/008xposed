package com.soft.tools;

import android.content.Intent;
import android.text.ClipboardManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.soft.toos.findApp.QuickFindActivity;

final class fb
  implements View.OnClickListener
{
  fb(WebViewHookActivity paramWebViewHookActivity) {}
  
  public final void onClick(View paramView)
  {
    if (paramView.equals(WebViewHookActivity.a(this.a)))
    {
      paramView = new Intent();
      paramView.setClass(this.a, QuickFindActivity.class);
      this.a.startActivityForResult(paramView, 1);
    }
    do
    {
      return;
      if (paramView.equals(WebViewHookActivity.b(this.a)))
      {
        WebViewHookActivity.c(this.a).setText("");
        WebViewHookActivity.b();
        return;
      }
    } while (!paramView.equals(WebViewHookActivity.d(this.a)));
    ((ClipboardManager)this.a.getSystemService("clipboard")).setText(WebViewHookActivity.c(this.a).getText());
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.fb
 * JD-Core Version:    0.7.0.1
 */