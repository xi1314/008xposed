package com.a.a.e;

import java.io.Closeable;

public final class g
{
  static final char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122 };
  static final char[] b = { 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 53, 53, 53, 53, 53, 53, 53, 53, 53, 53, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57 };
  static final char[] c = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
  static final int[] d = { 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 2147483647 };
  
  public static int a(int paramInt)
  {
    int i = 0;
    for (;;)
    {
      if (paramInt <= d[i]) {
        return i + 1;
      }
      i += 1;
    }
  }
  
  public static int a(long paramLong)
  {
    int i = 1;
    long l = 10L;
    while (i < 19)
    {
      if (paramLong < l) {
        return i;
      }
      l *= 10L;
      i += 1;
    }
    return 19;
  }
  
  public static void a(int paramInt1, int paramInt2, char[] paramArrayOfChar)
  {
    int j;
    int i;
    if (paramInt1 < 0)
    {
      j = -paramInt1;
      i = 45;
      paramInt1 = paramInt2;
      paramInt2 = j;
    }
    for (;;)
    {
      int k = paramInt1;
      j = paramInt2;
      if (paramInt2 >= 65536)
      {
        j = paramInt2 / 100;
        paramInt2 -= (j << 6) + (j << 5) + (j << 2);
        paramInt1 -= 1;
        paramArrayOfChar[paramInt1] = c[paramInt2];
        paramInt1 -= 1;
        paramArrayOfChar[paramInt1] = b[paramInt2];
        paramInt2 = j;
      }
      else
      {
        do
        {
          j = paramInt1;
          paramInt1 = 52429 * j >>> 19;
          k -= 1;
          paramArrayOfChar[k] = a[(j - ((paramInt1 << 3) + (paramInt1 << 1)))];
        } while (paramInt1 != 0);
        if (i != 0) {
          paramArrayOfChar[(k - 1)] = i;
        }
        return;
        i = 0;
        j = paramInt1;
        paramInt1 = paramInt2;
        paramInt2 = j;
      }
    }
  }
  
  public static void a(long paramLong, int paramInt, char[] paramArrayOfChar)
  {
    int i;
    if (paramLong < 0L)
    {
      paramLong = -paramLong;
      i = 45;
    }
    for (;;)
    {
      int j;
      if (paramLong > 2147483647L)
      {
        long l = paramLong / 100L;
        j = (int)(paramLong - ((l << 6) + (l << 5) + (l << 2)));
        paramInt -= 1;
        paramArrayOfChar[paramInt] = c[j];
        paramInt -= 1;
        paramArrayOfChar[paramInt] = b[j];
        paramLong = l;
      }
      else
      {
        int m;
        int k;
        for (j = (int)paramLong;; j = k)
        {
          m = paramInt;
          k = j;
          if (j < 65536) {
            break;
          }
          k = j / 100;
          j -= (k << 6) + (k << 5) + (k << 2);
          paramInt -= 1;
          paramArrayOfChar[paramInt] = c[j];
          paramInt -= 1;
          paramArrayOfChar[paramInt] = b[j];
        }
        do
        {
          k = paramInt;
          paramInt = 52429 * k >>> 19;
          m -= 1;
          paramArrayOfChar[m] = a[(k - ((paramInt << 3) + (paramInt << 1)))];
        } while (paramInt != 0);
        if (i != 0) {
          paramArrayOfChar[(m - 1)] = i;
        }
        return;
        i = 0;
      }
    }
  }
  
  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (Exception paramCloseable) {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.Map.g

 * JD-Core Version:    0.7.0.1

 */