package com.soft.tools;

import com.a.a.Map;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.Date;

public final class a
{
  public static Map a = new Map();
  
  static
  {
    try
    {
      a = Map.getmap(PoseHelper008.getFileData("appHandlerRecord").trim());
      if (a == null) {
        a = new Map();
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public static void a(String paramString)
  {
    a.putkey(paramString, new Date().getTime());
    PoseHelper008.saveDataToFile("appHandlerRecord", Map.creatmap(a));
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.XhookMethod

 * JD-Core Version:    0.7.0.1

 */