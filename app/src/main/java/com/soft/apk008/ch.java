package com.soft.apk008;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class ch
  extends Thread
{
  ch(SetMessageActivity paramSetMessageActivity) {}
  
  public final void run()
  {
    try
    {
      Thread.sleep(300L);
      PoseHelper008.initData(this.a);
      this.a.runOnUiThread(new ci(this));
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
 * Qualified Name:     com.soft.apk008.ch
 * JD-Core Version:    0.7.0.1
 */