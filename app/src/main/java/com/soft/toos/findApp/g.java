package com.soft.toos.findApp;

import a.a.a.a.a;
import a.a.a.a.c;
import a.a.a.a.d;

public final class g
{
  public static String a(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    a.a.a.a.b localb = new a.a.a.a.b();
    localb.a(a.b);
    localb.a(c.b);
    localb.a(d.b);
    int j = arrayOfChar.length;
    paramString = "";
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return paramString;
      }
      try
      {
        Object localObject;
        if (Character.toString(arrayOfChar[i]).matches("[\\u4E00-\\u9FA5]+"))
        {
          localObject = a.a.a.b.a(arrayOfChar[i], localb);
          localObject = paramString + localObject[0];
          paramString = (String)localObject;
        }
        else
        {
          localObject = paramString + Character.toString(arrayOfChar[i]);
          paramString = (String)localObject;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return paramString;
      }
      i += 1;
    }
  }
  
  public static String b(String paramString)
  {
    String str = "";
    int i = 0;
    if (i >= paramString.length()) {
      return str.toUpperCase();
    }
    char c = paramString.charAt(i);
    String[] arrayOfString = a.a.a.b.a(c);
    if (arrayOfString != null) {}
    for (str = str + arrayOfString[0].charAt(0);; str = str + c)
    {
      i += 1;
      break;
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.toos.findApp.g
 * JD-Core Version:    0.7.0.1
 */