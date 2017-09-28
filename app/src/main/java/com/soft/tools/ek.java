package com.soft.tools;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.a.a.b;
import com.soft.toos.findApp.QuickFindActivity;

final class ek
  implements View.OnClickListener
{
  ek(SetSystemValueActivity paramSetSystemValueActivity) {}
  
  public final void onClick(View paramView)
  {
    if (SetSystemValueActivity.a(this.a).equals(paramView))
    {
      paramView = new Intent();
      paramView.setClass(this.a, QuickFindActivity.class);
      this.a.startActivityForResult(paramView, 1);
    }
    do
    {
      return;
      if (SetSystemValueActivity.b(this.a).equals(paramView))
      {
        this.a.a.clear();
        SetSystemValueActivity.c(this.a).notifyDataSetChanged();
        return;
      }
    } while (!SetSystemValueActivity.d(this.a).equals(paramView));
    this.a.a();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.ek
 * JD-Core Version:    0.7.0.1
 */