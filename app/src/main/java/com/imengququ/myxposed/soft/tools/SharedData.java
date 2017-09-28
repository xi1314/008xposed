package com.imengququ.myxposed.soft.tools;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SharedData
{
  public static String getData(Activity paramActivity, String paramString)
  {
    return paramActivity.getSharedPreferences("data", 0).getString(paramString, "");
  }
  
  public static void setData(Activity paramActivity, String paramString1, String paramString2)
  {
    paramActivity = paramActivity.getSharedPreferences("data", 0).edit();
    paramActivity.putString(paramString1, paramString2);
    paramActivity.commit();
  }
}

