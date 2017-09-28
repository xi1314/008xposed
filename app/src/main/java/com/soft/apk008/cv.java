package com.soft.apk008;

import com.lishu.c.p;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.HashMap;

final class cv
  extends Thread
{
  cv(StartActivity paramStartActivity) {}
  
  public final void run()
  {
    try
    {
      if (InstallActivity.a(this.a) != 3) {
        PoseHelper008.saveDataToFile("008OK", "false");
      }
      Thread.sleep(1000L);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        HashMap localHashMap;
        localInterruptedException.printStackTrace();
      }
    }
    localHashMap = new HashMap();
    localHashMap.putAll(StartActivity.g);
    StartActivity.a(this.a).a(StartActivity.d, localHashMap, this.a);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.cv
 * JD-Core Version:    0.7.0.1
 */