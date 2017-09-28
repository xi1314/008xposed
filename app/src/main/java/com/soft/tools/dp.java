package com.soft.tools;

import de.robv.android.xposed.mods.tutorial.f;

final class dp
  extends Thread
{
  dp(RecordAppFileHandler paramRecordAppFileHandler, String paramString) {}
  
  public final void run()
  {
    long l = f.b(this.b);
    if (l > 102400L) {}
    for (String str = f.c(this.b);; str = f.a(this.b))
    {
      this.a.runOnUiThread(new dq(this, str, l, this.b));
      return;
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.dp
 * JD-Core Version:    0.7.0.1
 */