package com.lishu.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

public final class a
{
  static String[] a = { "getDeviceId", "SDK", "RELEASE", "ARCH", "getMetrics", "getRadioVersion", "BRAND", "MODEL", "PRODUCT", "MANUFACTURER", "setCpuName", "FINGERPRINT", "DEVICE", "HARDWARE" };
  private static a d;
  public ArrayList b = new ArrayList();
  SQLiteDatabase c;
  private Context e;
  private final String f = Environment.getExternalStorageDirectory().getAbsolutePath() + "/";
  private String g = "008.db";
  
  private a(Context paramContext)
  {
    this.e = paramContext;
    a();
  }
  
  public static a a(Context paramContext)
  {
    if (d == null) {
      d = new a(paramContext);
    }
    return d;
  }
  
  private void a()
  {
    b();
    Cursor localCursor = this.c.rawQuery("select * from phoneData", null);
    if (!localCursor.moveToNext())
    {
      this.c.close();
      return;
    }
    HashMap localHashMap = new HashMap();
    String[] arrayOfString = a;
    int k = arrayOfString.length;
    int i = 0;
    int j = 0;
    for (;;)
    {
      if (i >= k)
      {
        this.b.add(localHashMap);
        break;
      }
      localHashMap.put(arrayOfString[i], localCursor.getString(j));
      j += 1;
      i += 1;
    }
  }
  
  private SQLiteDatabase b()
  {
    try
    {
      String str = this.f + "/" + this.g;
      Object localObject = new File(this.f);
      if (!((File)localObject).exists()) {
        ((File)localObject).mkdir();
      }
      FileOutputStream localFileOutputStream;
      byte[] arrayOfByte;
      if (!new File(str).exists())
      {
        localObject = this.e.getAssets().open("008.db");
        localFileOutputStream = new FileOutputStream(str);
        arrayOfByte = new byte[8192];
      }
      for (;;)
      {
        int i = ((InputStream)localObject).read(arrayOfByte);
        if (i <= 0)
        {
          localFileOutputStream.close();
          ((InputStream)localObject).close();
          this.c = SQLiteDatabase.openOrCreateDatabase(str, null);
          return this.c;
        }
        localFileOutputStream.write(arrayOfByte, 0, i);
      }
      return null;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}

