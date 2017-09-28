package com.soft.tools;

import com.a.a.Map;

import de.robv.android.xposed.mods.tutorial.Shell;

final class bn
  extends Thread
{
  bn(InstallActivity paramInstallActivity) {}
  
  public final void run()
  {
    this.a.runOnUiThread(new bo(this));
    InstallActivity.b = InstallActivity.c(this.a).size();
    int i = 0;
    for (;;)
    {
      if (i >= InstallActivity.c(this.a).size())
      {
        this.a.runOnUiThread(new bp(this));
        return;
      }
      String str = (String)((Map)InstallActivity.c(this.a).get(i)).get("fileName");
      Shell.execCommand("pm install " + str);
      i += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.bn

 * JD-Core Version:    0.7.0.1

 */