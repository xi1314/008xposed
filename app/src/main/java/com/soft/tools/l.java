package com.soft.tools;

import android.app.ProgressDialog;
import android.widget.Toast;

final class l
  implements Runnable
{
  l(k paramk) {}
  
  public final void run()
  {
    BackupFileActivity.d(j.a(k.a(this.a))).hide();
    Toast.makeText(j.a(k.a(this.a)), "还原成功", 0).show();
    j.a(k.a(this.a)).a();
    BackupFileActivity.e(j.a(k.a(this.a))).notifyDataSetChanged();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.l
 * JD-Core Version:    0.7.0.1
 */