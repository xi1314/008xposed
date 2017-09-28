package com.soft.tools;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class e
  extends Thread
{
  e(d paramd, String[] paramArrayOfString) {}
  
  public final void run()
  {
    String str = System.currentTimeMillis() + "__" + PoseHelper008.valueMap.getStringfrommap("getDeviceId");
    String[] arrayOfString = this.b;
    int j = arrayOfString.length;
    int i = 0;
    for (;;)
    {
      if (i >= j)
      {
        d.a(this.a).runOnUiThread(new f(this));
        return;
      }
      BackupFileActivity.a(arrayOfString[i], str);
      i += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.Map

 * JD-Core Version:    0.7.0.1

 */