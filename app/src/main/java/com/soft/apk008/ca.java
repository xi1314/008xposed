package com.soft.apk008;

import com.lishu.c.w;

final class ca
  implements w
{
  ca(SetMessageActivity paramSetMessageActivity) {}
  
  public final void a(String paramString)
  {
    this.a.runOnUiThread(new cb(this));
    if ((paramString != null) && (paramString.length() > 0))
    {
      this.a.runOnUiThread(new cc(this, paramString));
      return;
    }
    this.a.runOnUiThread(new ce(this));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.ca
 * JD-Core Version:    0.7.0.1
 */