package com.soft.apk008;

import com.lishu.c.a;

final class aw
  extends Thread
{
  aw(LoadActivity paramLoadActivity) {}
  
  public final void run()
  {
    try
    {
      Thread.sleep(500L);
      LoadActivity localLoadActivity = this.a;
      if (LoadActivity.a())
      {
        a.b(this.a, "连接服务器失败，请重新，如果还不行，请联系客服或者到官网下载新版本 【" + LoadActivity.c(this.a) + "】");
        return;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        localInterruptedException.printStackTrace();
      }
      this.a.runOnUiThread(new ax(this));
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.aw
 * JD-Core Version:    0.7.0.1
 */