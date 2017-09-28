package com.soft.tools;

import com.lishu.c.w;

final class cl
  implements w
{
  cl(QuickToolActivity paramQuickToolActivity, boolean paramBoolean) {}
  
  public final void a(String paramString)
  {
    this.a.runOnUiThread(new cm(this));
    if ((paramString != null) && (paramString.length() > 0))
    {
      this.a.runOnUiThread(new cn(this, paramString, this.b));
      return;
    }
    this.a.runOnUiThread(new cp(this));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.cl
 * JD-Core Version:    0.7.0.1
 */