package com.soft.tools;

import android.view.View;
import android.view.View.OnClickListener;

final class bm
  implements View.OnClickListener
{
  bm(InstallActivity paramInstallActivity) {}
  
  public final void onClick(View paramView)
  {
    if (InstallActivity.a(this.a).equals(paramView)) {
      this.a.a();
    }
    while (!InstallActivity.b(this.a).equals(paramView)) {
      return;
    }
    this.a.b();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.bm
 * JD-Core Version:    0.7.0.1
 */