package com.soft.apk008.remainNew;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;

public class Widget008ProviderSmall
  extends Widget008BaseProvider
{
  public static void a(Context paramContext, AppWidgetManager paramAppWidgetManager, int paramInt)
  {
    a = new RemoteViews(paramContext.getPackageName(), 2130903068);
    int[] arrayOfInt = new int[5];
    int[] tmp23_21 = arrayOfInt;
    tmp23_21[0] = 2131361934;
    int[] tmp28_23 = tmp23_21;
    tmp28_23[1] = 2131361933;
    int[] tmp33_28 = tmp28_23;
    tmp33_28[2] = 2131361935;
    int[] tmp38_33 = tmp33_28;
    tmp38_33[3] = 2131361936;
    int[] tmp43_38 = tmp38_33;
    tmp43_38[4] = 2131361937;
    tmp43_38;
    int j = arrayOfInt.length;
    int i = 0;
    for (;;)
    {
      if (i >= j)
      {
        paramAppWidgetManager.updateAppWidget(paramInt, a);
        return;
      }
      int k = arrayOfInt[i];
      Object localObject = new Intent();
      ((Intent)localObject).setClass(paramContext, Widget008ProviderSmall.class);
      ((Intent)localObject).addCategory("android.intent.category.ALTERNATIVE");
      ((Intent)localObject).setData(Uri.parse("custom:" + k));
      localObject = PendingIntent.getBroadcast(paramContext, 0, (Intent)localObject, 0);
      a.setOnClickPendingIntent(k, (PendingIntent)localObject);
      i += 1;
    }
  }
  
  public static void b(Context paramContext, String paramString)
  {
    AppWidgetManager localAppWidgetManager = AppWidgetManager.getInstance(paramContext);
    RemoteViews localRemoteViews = new RemoteViews(paramContext.getPackageName(), 2130903068);
    a = localRemoteViews;
    localRemoteViews.setTextViewText(2131361931, paramString);
    localAppWidgetManager.updateAppWidget(new ComponentName(paramContext.getPackageName(), Widget008ProviderSmall.class.getName()), a);
  }
  
  public static void b(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppWidgetManager localAppWidgetManager = AppWidgetManager.getInstance(paramContext);
    a = new RemoteViews(paramContext.getPackageName(), 2130903068);
    paramString1 = "模式：" + paramString1 + "，当前分类：" + paramString2;
    a.setTextViewText(2131361931, paramString1);
    a.setProgressBar(2131361932, paramInt2, paramInt1, false);
    localAppWidgetManager.updateAppWidget(new ComponentName(paramContext.getPackageName(), Widget008ProviderSmall.class.getName()), a);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.remainNew.Widget008ProviderSmall
 * JD-Core Version:    0.7.0.1
 */