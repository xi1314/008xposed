package com.soft.apk008;

import com.lishu.c.w;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class m
  implements w
{
  m(Apk008Activity paramApk008Activity) {}
  
  public final void a(String paramString)
  {
    int i = paramString.indexOf("sdk_level_");
    int j = "sdk_level_".length();
    int k = paramString.indexOf("_sdk_level");
    try
    {
      paramString = paramString.substring(j + i, k);
      if (paramString.length() > 0) {
        PoseHelper008.saveDataToFile("sdklevel", paramString.replace("&quot;", "\""));
      }
      return;
    }
    catch (Exception paramString) {}
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.m
 * JD-Core Version:    0.7.0.1
 */