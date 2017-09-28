package com.lishu.c;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;

public class p
{
  public static String a;
  static String[] b = { "a", "p", "k", "0", "0", "8", ".", "saveaccountdatatoFile", "o", "m" };
  static String c = null;
  public static String d = "";
  
  public static String a(String paramString)
  {
    int i = paramString.indexOf("http://");
    return paramString.substring(i + 7, paramString.indexOf("/", i + 7));
  }
  
  public static void a()
  {
    int i = 0;
    String[] arrayOfString = new String[6];
    arrayOfString[0] = "java.";
    arrayOfString[1] = "la";
    arrayOfString[2] = "ng";
    arrayOfString[3] = ".";
    arrayOfString[4] = "Sys";
    arrayOfString[5] = "tem";
    Object localObject = "";
    int j = arrayOfString.length;
    for (;;)
    {
      if (i >= j) {}
      try
      {
        localObject = Class.forName((String)localObject);
        ((Class)localObject).getMethod("exit", new Class[] { Integer.TYPE }).invoke(localObject, new Object[] { Integer.valueOf(0) });
        System.exit(0);
        return;
      }
      catch (Exception localException) {}
      String str = arrayOfString[i];
      localObject = localObject + str;
      i += 1;
    }
  }
  
  private static String b(URL paramURL)
  {
    try
    {
      Field localField = URL.class.getDeclaredField("host");
      localField.setAccessible(true);
      paramURL = (String)localField.get(paramURL);
      return paramURL;
    }
    catch (Exception paramURL)
    {
      paramURL.printStackTrace();
    }
    return "";
  }
  
  public static boolean b(String paramString)
  {
    String[] arrayOfString;
    int j;
    int i;
    if (c == null)
    {
      c = "";
      arrayOfString = b;
      j = arrayOfString.length;
      i = 0;
      if (i < j) {}
    }
    else
    {
      if (paramString.endsWith(c)) {
        break label195;
      }
      arrayOfString = new String[6];
      arrayOfString[0] = "java.";
      arrayOfString[1] = "la";
      arrayOfString[2] = "ng";
      arrayOfString[3] = ".";
      arrayOfString[4] = "Sys";
      arrayOfString[5] = "tem";
      j = arrayOfString.length;
      paramString = "";
      i = 0;
    }
    for (;;)
    {
      if (i >= j) {}
      try
      {
        paramString = Class.forName(paramString);
        paramString.getMethod("exit", new Class[] { Integer.TYPE }).invoke(paramString, new Object[] { Integer.valueOf(0) });
        System.exit(0);
        return false;
      }
      catch (Exception paramString) {}
      String str = arrayOfString[i];
      c += str;
      i += 1;
      break;
      str = arrayOfString[i];
      paramString = paramString + str;
      i += 1;
    }
    label195:
    return true;
    return false;
  }
  
  public void a(String paramString, HashMap paramHashMap, w paramw)
  {
    new q(this, paramHashMap, paramString, paramw).start();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.lishu.saveaccountdatatoFile.p

 * JD-Core Version:    0.7.0.1

 */