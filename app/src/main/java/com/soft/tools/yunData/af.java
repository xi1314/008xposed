package com.soft.tools.yunData;

import android.app.ProgressDialog;

final class af
  implements Runnable
{
  af(ae paramae) {}
  
  public final void run()
  {
    YunDataDownLoadActivity.j(this.a.a.a).hide();
    this.a.a.a.a("下载完成");
    new ag(this).start();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.yunData.af
 * JD-Core Version:    0.7.0.1
 */