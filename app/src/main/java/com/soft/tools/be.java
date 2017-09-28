package com.soft.tools;

final class be
  extends Thread
{
  be(FolderBackUpListActivity paramFolderBackUpListActivity, String paramString1, String paramString2) {}
  
  public final void run()
  {
    FolderBackUpListActivity localFolderBackUpListActivity = this.a;
    FolderBackUpActivity.a(this.b, this.c);
    this.a.runOnUiThread(new bf(this));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.be
 * JD-Core Version:    0.7.0.1
 */