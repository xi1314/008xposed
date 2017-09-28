package com.lishu.c;

import com.soft.apk008.StartActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.HashMap;

public final class o
{
  public static String b;
  public static String c;
  public static String d = "";
  public static String e = "小偷可耻";
  public static String f = "fuck you";
  public static String g = "";
  public static String h = "";
  public static String i = "";
  public static String j = "";
  private static long k = 0L;
  private static String n = StartActivity.b + "/phone/LogicSimpleAction.action";
  public HashMap a = new HashMap();
  private int l = 0;
  private boolean m = true;
  private String o = "";
  
  public o()
  {
    if ((c == null) || (c.length() == 0))
    {
      String str = PoseHelper008.getFileData("JSESSIONID");
      c = str;
      b = str;
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.lishu.c.o
 * JD-Core Version:    0.7.0.1
 */