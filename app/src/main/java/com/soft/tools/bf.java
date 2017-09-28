package com.soft.tools;

import android.app.ProgressDialog;
import android.widget.Toast;

final class bf
  implements Runnable
{
  bf(be parambe) {}
  
  public final void run()
  {
    FolderBackUpListActivity.h(be.a(this.a)).hide();
    Toast.makeText(be.a(this.a), "备份完成", 0).show();
    FolderBackUpListActivity.g(be.a(this.a));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.bf
 * JD-Core Version:    0.7.0.1
 */