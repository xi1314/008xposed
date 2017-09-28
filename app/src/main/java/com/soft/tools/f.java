package com.soft.tools;

import android.app.ProgressDialog;
import android.widget.Toast;

final class f
  implements Runnable
{
  f(e parame) {}
  
  public final void run()
  {
    BackupFileActivity.d(d.a(e.a(this.a))).hide();
    d.a(e.a(this.a)).a();
    BackupFileActivity.e(d.a(e.a(this.a))).notifyDataSetChanged();
    Toast.makeText(d.a(e.a(this.a)), "备份成功", 0).show();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.f
 * JD-Core Version:    0.7.0.1
 */