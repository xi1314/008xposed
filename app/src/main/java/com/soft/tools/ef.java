package com.soft.tools;

import android.app.Activity;
import com.lishu.c.b.a;

final class ef
  extends Thread
{
  ef(Activity paramActivity) {}
  
  public final void run()
  {
    boolean bool = RemoteVpnActivity.a.a();
    try
    {
      Thread.sleep(2000L);
      this.a.runOnUiThread(new eg(this, bool, this.a));
      return;
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


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.ef
 * JD-Core Version:    0.7.0.1
 */