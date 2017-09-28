package com.soft.apk008;

final class bs
  extends Thread
{
  bs(br parambr) {}
  
  public final void run()
  {
    SetMessageActivity.e(br.a(this.a));
    SetMessageActivity.a(br.a(this.a));
    br.a(this.a).runOnUiThread(new bt(this));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.bs
 * JD-Core Version:    0.7.0.1
 */