package com.soft.tools.yunData;

import android.app.ProgressDialog;

final class u
  implements Runnable
{
  u(t paramt) {}
  
  public final void run()
  {
    YunDataDownLoadActivity.i(this.a.a).cancel();
    YunDataDownLoadActivity.f(this.a.a).notifyDataSetChanged();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.yunData.u
 * JD-Core Version:    0.7.0.1
 */