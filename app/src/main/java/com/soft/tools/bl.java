package com.soft.tools;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.soft.toos.findApp.QuickFindActivity;

final class bl
  implements View.OnClickListener
{
  bl(HideProgressActivity paramHideProgressActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = new Intent();
    paramView.setClass(this.a, QuickFindActivity.class);
    this.a.startActivityForResult(paramView, 0);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.bl
 * JD-Core Version:    0.7.0.1
 */