package com.soft.apk008;

import android.os.Environment;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.io.File;

public final class x
{
  public static String a = ".system/cpuinfo";
  public static String b = "cpuinfo";
  public static String c = Environment.getExternalStorageDirectory() + File.separator + ".system/cpuinfo";
  
  /* Error */
  public static String a()
  {

  }
  
  public static void a(String paramString)
  {
    String str2 = PoseHelper008.getFileData(b);
    int i = str2.indexOf("Hardware\t:");
    i = "Hardware\t:".length() + i;
    String str1 = str2;
    if (i >= 0)
    {
      int j = str2.indexOf("\n", i);
      str1 = str2;
      if (j >= 0) {
        str1 = str2.replace(str2.substring(i, j).trim(), paramString.trim());
      }
    }
    PoseHelper008.saveDataToFile(b, str1);
  }
}

