package com.soft.apk008;

final class bc
  extends Thread
{
  bc(bb parambb) {}
  
  public final void run()
  {
    SetDataActivity.e(bb.a(this.a));
    SetDataActivity.a(bb.a(this.a));
    bb.a(this.a).runOnUiThread(new bd(this));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.bc
 * JD-Core Version:    0.7.0.1
 */