package com.soft.tools;

import com.lishu.c.w;

final class cq
  implements w
{
  cq(QuickToolActivity paramQuickToolActivity, boolean paramBoolean) {}
  
  public final void a(String paramString)
  {
    this.a.runOnUiThread(new cr(this));
    if ((paramString != null) && (paramString.length() > 0))
    {
      this.a.runOnUiThread(new cs(this, paramString, this.b));
      return;
    }
    this.a.runOnUiThread(new cu(this));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.cq
 * JD-Core Version:    0.7.0.1
 */