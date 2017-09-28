package com.soft.tools;

import de.robv.android.xposed.mods.tutorial.Shell;

final class aq
  extends Thread
{
  aq(FolderBackUpActivity paramFolderBackUpActivity) {}
  
  public final void run()
  {
    if (FolderBackUpActivity.b.length() == 0) {
      FolderBackUpActivity.a();
    }
    String str = Shell.execCommandWithResult(FolderBackUpActivity.a + " ls", true);
    if ((str.indexOf("No such file") >= 0) || (str.indexOf("no found") >= 0) || (str.indexOf("not found") >= 0) || (str.trim().length() == 0)) {
      this.a.b();
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.aq

 * JD-Core Version:    0.7.0.1

 */