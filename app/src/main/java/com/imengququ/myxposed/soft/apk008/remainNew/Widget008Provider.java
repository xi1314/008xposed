package com.imengququ.myxposed.soft.apk008.remainNew;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;

public class Widget008Provider
  extends AppWidgetProvider
{
  private static RemoteViews rv;
  
  private void onClick(Context paramContext, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 2131230825: 
      NewReMainActivity.NextHistory(paramContext);
      return;
    case 2131230824: 
      NewReMainActivity.PreHistory(paramContext);
      return;
    case 2131230826: 
      NewReMainActivity.SimulateData(paramContext);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(paramContext, NewReMainActivity.class);
    localIntent.addFlags(268435456);
    paramContext.startActivity(localIntent);
  }
  
  public static void setModeAndKindName(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppWidgetManager localAppWidgetManager = AppWidgetManager.getInstance(paramContext);
    rv = new RemoteViews(paramContext.getPackageName(), 2130903061);
    paramString1 = "模式：" + paramString1 + "，当前分类：" + paramString2;
    rv.setTextViewText(2131230822, paramString1);
    rv.setProgressBar(2131230823, paramInt2, paramInt1, false);
    localAppWidgetManager.updateAppWidget(new ComponentName(paramContext.getPackageName(), Widget008Provider.class.getName()), rv);
  }
  
  public static void updateAppWidget(Context paramContext, AppWidgetManager paramAppWidgetManager, int paramInt)
  {
    rv = new RemoteViews(paramContext.getPackageName(), 2130903061);
    int[] arrayOfInt = new int[4];
    int[] tmp23_21 = arrayOfInt;
    tmp23_21[0] = 2131230825;
    int[] tmp28_23 = tmp23_21;
    tmp28_23[1] = 2131230824;
    int[] tmp33_28 = tmp28_23;
    tmp33_28[2] = 2131230826;
    int[] tmp38_33 = tmp33_28;
    tmp38_33[3] = 2131230827;
    tmp38_33;
    int j = arrayOfInt.length;
    int i = 0;
    for (;;)
    {
      if (i >= j)
      {
        paramAppWidgetManager.updateAppWidget(paramInt, rv);
        return;
      }
      int k = arrayOfInt[i];
      Object localObject = new Intent();
      ((Intent)localObject).setClass(paramContext, Widget008Provider.class);
      ((Intent)localObject).addCategory("android.intent.category.ALTERNATIVE");
      ((Intent)localObject).setData(Uri.parse("custom:" + k));
      localObject = PendingIntent.getBroadcast(paramContext, 0, (Intent)localObject, 0);
      rv.setOnClickPendingIntent(k, (PendingIntent)localObject);
      i += 1;
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    super.onReceive(paramContext, paramIntent);
    if (rv == null) {
      rv = new RemoteViews(paramContext.getPackageName(), 2130903061);
    }
    if (paramIntent.hasCategory("android.intent.category.ALTERNATIVE")) {
      onClick(paramContext, Integer.parseInt(paramIntent.getData().getSchemeSpecificPart()));
    }
  }
  
  public void onUpdate(Context paramContext, AppWidgetManager paramAppWidgetManager, int[] paramArrayOfInt)
  {
    int j = paramArrayOfInt.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      updateAppWidget(paramContext, paramAppWidgetManager, paramArrayOfInt[i]);
      i += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     Widget008Provider

 * JD-Core Version:    0.7.0.1

 */