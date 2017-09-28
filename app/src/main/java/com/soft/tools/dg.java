package com.soft.tools;

import com.lishu.c.a;

final class dg
  extends Thread
{
  dg(QuickToolActivity paramQuickToolActivity) {}
  
  public final void run()
  {
    if (!RemoteVpnActivity.a(this.a))
    {
      this.a.runOnUiThread(new dh(this));
      return;
    }
    for (;;)
    {
      try
      {
        Thread.sleep(100L);
        if (RemoteVpnActivity.c)
        {
          a.c(this.a, "网络连接断开");
          this.a.runOnUiThread(new di(this));
          return;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
        continue;
      }
      if (!RemoteVpnActivity.e) {}
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.dg
 * JD-Core Version:    0.7.0.1
 */