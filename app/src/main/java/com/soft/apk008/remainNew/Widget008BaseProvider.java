package com.soft.apk008.remainNew;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;

public class Widget008BaseProvider
  extends AppWidgetProvider
{
  protected static RemoteViews a;
  
  public static void a(Context paramContext)
  {
    AppWidgetManager localAppWidgetManager = AppWidgetManager.getInstance(paramContext);
    a = new RemoteViews(paramContext.getPackageName(), 2130903067);
    localAppWidgetManager.updateAppWidget(new ComponentName(paramContext.getPackageName(), Widget008Provider.class.getName()), a);
    a = new RemoteViews(paramContext.getPackageName(), 2130903068);
    localAppWidgetManager.updateAppWidget(new ComponentName(paramContext.getPackageName(), Widget008ProviderSmall.class.getName()), a);
  }
  
  public static void a(Context paramContext, String paramString)
  {
    try
    {
      Widget008Provider.b(paramContext, paramString);
      Widget008ProviderSmall.b(paramContext, paramString);
      return;
    }
    catch (Exception paramContext) {}
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    try
    {
      Widget008Provider.b(paramContext, paramString1, paramString2, paramInt1, paramInt2);
      Widget008ProviderSmall.b(paramContext, paramString1, paramString2, paramInt1, paramInt2);
      return;
    }
    catch (Exception paramContext) {}
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    super.onReceive(paramContext, paramIntent);
    if (a != null) {
      if (!(this instanceof Widget008Provider)) {
        break label89;
      }
    }
    label89:
    for (a = new RemoteViews(paramContext.getPackageName(), 2130903067);; a = new RemoteViews(paramContext.getPackageName(), 2130903068))
    {
      if (paramIntent.hasCategory("android.intent.category.ALTERNATIVE")) {}
      switch (Integer.parseInt(paramIntent.getData().getSchemeSpecificPart()))
      {
      default: 
        return;
      }
    }
    NewReMainActivity.c(paramContext);
    return;
    NewReMainActivity.b(paramContext);
    return;
    NewReMainActivity.d(paramContext);
    return;
    paramIntent = new Intent();
    paramIntent.setClass(paramContext, NewReMainActivity.class);
    paramIntent.addFlags(268435456);
    paramContext.startActivity(paramIntent);
    return;
    NewReMainActivity.a(paramContext);
  }
  
  public void onUpdate(Context paramContext, AppWidgetManager paramAppWidgetManager, int[] paramArrayOfInt)
  {
    int j = paramArrayOfInt.length;
    int i = 0;
    if (i >= j) {
      return;
    }
    int k = paramArrayOfInt[i];
    if ((this instanceof Widget008Provider)) {
      Widget008Provider.a(paramContext, paramAppWidgetManager, k);
    }
    for (;;)
    {
      i += 1;
      break;
      Widget008ProviderSmall.a(paramContext, paramAppWidgetManager, k);
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.remainNew.Widget008BaseProvider
 * JD-Core Version:    0.7.0.1
 */