package com.soft.tools;

import com.lishu.c.a;

final class cz
  extends Thread
{
  cz(QuickToolActivity paramQuickToolActivity) {}
  
  public final void run()
  {
    if (RemoteVpnActivity.a(this.a)) {
      for (;;)
      {
        if (RemoteVpnActivity.e)
        {
          this.a.runOnUiThread(new da(this));
          QuickToolActivity.q(this.a);
          return;
        }
        try
        {
          Thread.sleep(100L);
          if (RemoteVpnActivity.c) {
            a.c(this.a, "连接已经断开");
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          for (;;)
          {
            localInterruptedException.printStackTrace();
          }
        }
      }
    }
    this.a.runOnUiThread(new db(this));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.cz
 * JD-Core Version:    0.7.0.1
 */