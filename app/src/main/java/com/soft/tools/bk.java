package com.soft.tools;

import android.widget.EditText;

final class bk
  implements Runnable
{
  bk(GetAllApkActivity paramGetAllApkActivity) {}
  
  public final void run()
  {
    GetAllApkActivity.c(this.a).setText(this.a.b);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.bk
 * JD-Core Version:    0.7.0.1
 */