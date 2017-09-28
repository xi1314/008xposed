package de.robv.android.xposed.mods.tutorial;

import com.a.a.maputils;

final class savedataThread
  extends Thread
{
  public final void run()
  {
    PoseHelper008.saveDataToFile("xposeDevice.txt", maputils.creatmap(PoseHelper008.valueMap));
  }
}

