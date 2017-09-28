package de.robv.android.xposed.mods.tutorial;

import android.content.Context;
import android.provider.Settings;
import android.provider.Settings.System;
import android.util.Log;
import com.lishu.c.v;
import java.util.Date;
import java.util.HashMap;

public final class sysstr
{
  public static HashMap a = new HashMap();
  public static String b = "VFM0RCODhFRUEyM0Y2MEVFRkU=";
  
  public static String a()
  {
    String[] arrayOfString = PoseHelper008.getFileData("008system").trim().split("_");
    try
    {
      if (arrayOfString.length == 3)
      {
        String str = arrayOfString[0];
        long l = Long.parseLong(arrayOfString[1]);
        boolean bool = arrayOfString[2].equals(a(str, l));
        if (bool) {
          return str;
        }
      }
    }
    catch (Exception Exception)
    {
     Exception.printStackTrace();
    }
    return "";
  }
  
  public static String a(Context paramContext)
  {
    Object localObject1 = "";
    Log.d("008 1", System.currentTimeMillis());
    try
    {
      localObject2 = Shell.execCommandWithResult("cat /system/x", true).trim();
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2;
        localException.printStackTrace();
      }
      String str = localObject1[0];
      long l = Long.parseLong(localObject1[1]);
      if (!localObject1[2].equals(a(str, l))) {
        break label188;
      }
      a(paramContext, str);
      return str;
    }
    Log.d("008 over", System.currentTimeMillis());
    localObject2 = ((String)localObject1).split("\n");
    if (localObject2.length > 0) {
      localObject1 = localObject2[0];
    }
    localObject1 = ((String)localObject1).split("_");
    if (localObject1.length != 3)
    {
      localObject2 = b(paramContext);
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((String)localObject2).length() != 0) {}
      }
      else
      {
        localObject2 = a();
        localObject1 = localObject2;
        if (((String)localObject2).length() > 0)
        {
          a(paramContext, (String)localObject2);
          localObject1 = localObject2;
        }
      }
      return localObject1;
    }
    label188:
    return "";
  }
  
  private static String a(String paramString, long paramLong)
  {
    return v.a(paramString + (paramLong / 103L + 1854L));
  }
  
  public static void a(Context paramContext, String paramString)
  {
    long l = new Date().getTime();
    String str = a(paramString, l);
    paramString = paramString + "_" + l + "_" + str;
    Settings.System.putString(paramContext.getContentResolver(), "008system", paramString);
    PoseHelper008.saveDataToFile("008system", paramString);
    Shell.execCommand("mount -o remount rw /system");
    Shell.execCommand("touch /system/x");
    Shell.execCommand("echo " + paramString + " > /system/x");
    Shell.execCommand("mount -o remount,ro /system");
  }
  
  private static String b(Context paramContext)
  {
    String str = Settings.System.getString(paramContext.getContentResolver(), "008system");
    Object localObject = str;
    if (str == null) {
      localObject = "";
    }
    localObject = ((String)localObject).split("_");
    try
    {
      if (localObject.length == 3)
      {
        str = localObject[0];
        long l = Long.parseLong(localObject[1]);
        if (localObject[2].equals(a(str, l)))
        {
          a(paramContext, str);
          return str;
        }
      }
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return "";
  }
}

