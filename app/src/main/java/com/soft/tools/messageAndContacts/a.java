package com.soft.tools.messageAndContacts;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.provider.CallLog.Calls;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public final class a
{
  static long a = 0L;
  public static long b = 0L;
  private static final int[] c = { 1, 1, 2, 2, 3 };
  
  public static long a()
  {
    if (a == 0L)
    {
      Calendar localCalendar = Calendar.getInstance();
      localCalendar.add(2, -1);
      a = localCalendar.getTime().getTime() / 1000L;
      b = System.currentTimeMillis() / 1000L - a;
    }
    return a;
  }
  
  public static void a(Context paramContext)
  {
    paramContext.getContentResolver().delete(CallLog.Calls.CONTENT_URI, null, null);
  }
  
  public static void b(Context paramContext)
  {
    int i = (int)(10.0D * Math.random());
    Object localObject = new Random();
    if (i + 5 <= 0) {
      return;
    }
    int j = (int)(2.0D * Math.random());
    String str1 = b.c[((int)(Math.random() * b.c.length))];
    i = 0;
    for (;;)
    {
      if (i >= j + 1)
      {
        localObject = b.b[((int)(Math.random() * b.b.length))] + (10000000 + (int)(89999999.0D * Math.random()));
        String str2 = a() + (int)(b * Math.random()) + String.valueOf("000");
        i = (int)(1800.0D * Math.random());
        j = c[((int)(Math.random() * c.length))];
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("number", (String)localObject);
        localContentValues.put("date", str2);
        localContentValues.put("duration", String.valueOf(i + 30));
        localContentValues.put("type", String.valueOf(j));
        localContentValues.put("new", String.valueOf(0));
        localContentValues.put("name", str1);
        paramContext.getContentResolver().insert(CallLog.Calls.CONTENT_URI, localContentValues);
        return;
      }
      str1 = str1 + b.a.charAt(((Random)localObject).nextInt(b.a.length()));
      i += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.messageAndContacts.XhookMethod

 * JD-Core Version:    0.7.0.1

 */