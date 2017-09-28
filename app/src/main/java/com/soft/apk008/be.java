package com.soft.apk008;

import com.lishu.c.w;

final class be
  implements w
{
  be(SetDataActivity paramSetDataActivity) {}
  
  public final void a(String paramString)
  {
    this.a.runOnUiThread(new bf(this));
    if ((paramString != null) && (paramString.length() > 0))
    {
      this.a.runOnUiThread(new bg(this, paramString));
      return;
    }
    this.a.runOnUiThread(new bi(this));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.be
 * JD-Core Version:    0.7.0.1
 */