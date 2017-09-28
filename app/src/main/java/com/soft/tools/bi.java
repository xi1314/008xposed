package com.soft.tools;

import android.app.ProgressDialog;
import android.widget.EditText;

final class bi
  implements Runnable
{
  bi(bh parambh, String paramString) {}
  
  public final void run()
  {
    GetAllApkActivity.b(bg.a(bh.a(this.a))).cancel();
    GetAllApkActivity.c(bg.a(bh.a(this.a))).setText(this.b);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.bi
 * JD-Core Version:    0.7.0.1
 */