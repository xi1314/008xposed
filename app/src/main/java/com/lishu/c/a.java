package com.lishu.c;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;

public final class a
{
  public static AlertDialog.Builder a(Activity paramActivity, String paramString, DialogInterface.OnClickListener paramOnClickListener)
  {
    paramActivity = new AlertDialog.Builder(paramActivity);
    paramActivity.setTitle("注意");
    paramActivity.setMessage(paramString);
    paramActivity.setNegativeButton("确定", paramOnClickListener);
    paramActivity.setPositiveButton("取消", new b());
    return paramActivity;
  }
  
  public static AlertDialog.Builder a(Activity paramActivity, String paramString1, String paramString2, DialogInterface.OnClickListener paramOnClickListener)
  {
    paramActivity = new AlertDialog.Builder(paramActivity);
    paramActivity.setTitle(paramString1);
    if (paramString2.length() > 0) {
      paramActivity.setMessage(paramString2);
    }
    paramActivity.setNegativeButton("确定", paramOnClickListener);
    paramActivity.setPositiveButton("取消", new h());
    return paramActivity;
  }
  
  public static void a(Activity paramActivity, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity);
    localBuilder.setTitle("是否删除该项目");
    localBuilder.setNegativeButton("确定", paramOnClickListener);
    localBuilder.setPositiveButton("取消", new d());
    paramActivity.runOnUiThread(new e(localBuilder));
  }
  
  public static void a(Activity paramActivity, String paramString)
  {
    i locali = new i();
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity);
    localBuilder.setTitle("注意");
    localBuilder.setMessage(paramString);
    localBuilder.setNegativeButton("确定", locali);
    paramActivity.runOnUiThread(new j(localBuilder, paramActivity));
  }
  
  public static void b(Activity paramActivity, String paramString)
  {
    paramActivity.runOnUiThread(new l(a(paramActivity, paramString, new k()), paramActivity));
  }
  
  public static void b(Activity paramActivity, String paramString, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity);
    localBuilder.setTitle(paramString);
    localBuilder.setNegativeButton("确定", paramOnClickListener);
    localBuilder.setPositiveButton("取消", new f());
    paramActivity.runOnUiThread(new g(localBuilder));
  }
  
  public static void c(Activity paramActivity, String paramString)
  {
    paramActivity.runOnUiThread(new c(a(paramActivity, paramString, new m())));
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.lishu.saveaccountdatatoFile.XhookMethod

 * JD-Core Version:    0.7.0.1

 */