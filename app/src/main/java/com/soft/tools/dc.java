package com.soft.tools;

final class dc
  extends Thread
{
  dc(QuickToolActivity paramQuickToolActivity) {}
  
  public final void run()
  {
    while (QuickToolActivity.r(this.a)) {}
    while (QuickToolActivity.s(this.a) != 2)
    {
      if (QuickToolActivity.s(this.a) == 1) {
        return;
      }
      try
      {
        Thread.sleep(500L);
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
      }
    }
    this.a.runOnUiThread(new dd(this));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.dc
 * JD-Core Version:    0.7.0.1
 */