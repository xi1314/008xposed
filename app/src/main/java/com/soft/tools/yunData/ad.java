package com.soft.tools.yunData;

import android.app.ProgressDialog;

final class ad
  implements c
{
  ad(YunDataDownLoadActivity paramYunDataDownLoadActivity) {}
  
  public final void a()
  {
    YunDataDownLoadActivity localYunDataDownLoadActivity = this.a;
    localYunDataDownLoadActivity.e += 1;
    if (this.a.f + this.a.e == this.a.d) {
      this.a.runOnUiThread(new ah(this));
    }
    YunDataDownLoadActivity.j(this.a).setProgress(this.a.f + this.a.e);
  }
  
  public final void b()
  {
    YunDataDownLoadActivity localYunDataDownLoadActivity = this.a;
    localYunDataDownLoadActivity.f += 1;
    this.a.runOnUiThread(new ae(this));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.yunData.ad
 * JD-Core Version:    0.7.0.1
 */