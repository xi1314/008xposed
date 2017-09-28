package com.soft.tools;

final class de
  extends Thread
{
  de(QuickToolActivity paramQuickToolActivity) {}
  
  public final void run()
  {
    for (;;)
    {
      if (QuickToolActivity.a(this.a))
      {
        this.a.runOnUiThread(new df(this));
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
 * Qualified Name:     com.soft.tools.de
 * JD-Core Version:    0.7.0.1
 */