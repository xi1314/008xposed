package com.soft.tools;

final class cx
  extends Thread
{
  cx(QuickToolActivity paramQuickToolActivity) {}
  
  public final void run()
  {
    for (;;)
    {
      if (QuickToolActivity.a(this.a))
      {
        QuickToolActivity.q(this.a);
        this.a.runOnUiThread(new cy(this));
        return;
      }
      try
      {
        Thread.sleep(100L);
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
      }
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.cx
 * JD-Core Version:    0.7.0.1
 */