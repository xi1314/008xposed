package com.soft.tools;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public final class er
{
  public static String a(Context paramContext, String paramString)
  {
    return paramContext.getSharedPreferences("data", 0).getString(paramString, "");
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    paramContext = paramContext.getSharedPreferences("data", 0).edit();
    paramContext.putString(paramString1, paramString2);
    paramContext.commit();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.er
 * JD-Core Version:    0.7.0.1
 */