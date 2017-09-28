package com.soft.tools.yunData;

import android.app.ProgressDialog;

final class ae
  implements Runnable
{
  ae(ad paramad) {}
  
  public final void run()
  {
    YunDataDownLoadActivity.j(this.a.a).setProgress(this.a.a.f + this.a.a.e);
    if (this.a.a.f + this.a.a.e == this.a.a.d) {
      this.a.a.runOnUiThread(new af(this));
    }
    YunDataDownLoadActivity.j(this.a.a).setProgress(this.a.a.f + this.a.a.e);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.yunData.ae
 * JD-Core Version:    0.7.0.1
 */