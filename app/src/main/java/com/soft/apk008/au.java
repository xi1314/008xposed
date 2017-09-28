package com.soft.apk008;

import android.view.View;
import android.view.View.OnClickListener;

final class au
  implements View.OnClickListener
{
  au(InstallActivity paramInstallActivity) {}
  
  public final void onClick(View paramView)
  {
    if (paramView.equals(InstallActivity.a(this.a))) {
      this.a.a(1, 0);
    }
    do
    {
      return;
      if (paramView.equals(InstallActivity.b(this.a)))
      {
        this.a.a(2, this.a.d);
        return;
      }
      if (paramView.equals(InstallActivity.c(this.a)))
      {
        this.a.a(3, 0);
        return;
      }
    } while ((!paramView.equals(InstallActivity.d(this.a))) || (this.a.a() != 3));
    this.a.b();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.au
 * JD-Core Version:    0.7.0.1
 */