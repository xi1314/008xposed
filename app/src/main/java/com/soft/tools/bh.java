package com.soft.tools;

final class bh
  extends Thread
{
  bh(bg parambg) {}
  
  public final void run()
  {
    String str = bg.a(this.a).a();
    bg.a(this.a).runOnUiThread(new bi(this, str));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.bh
 * JD-Core Version:    0.7.0.1
 */