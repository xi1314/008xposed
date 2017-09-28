package com.soft.tools;

import android.app.ProgressDialog;

final class di
  implements Runnable
{
  di(dg paramdg) {}
  
  public final void run()
  {
    QuickToolActivity.p(dg.a(this.a)).hide();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.di
 * JD-Core Version:    0.7.0.1
 */