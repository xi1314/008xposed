package com.lishu.c;

import com.lishu.c.a.a;
import com.lishu.c.a.b;
import com.lishu.c.a.c;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public final class n
{
  private static final char[] a = (a.a + c.a + b.a).toCharArray();
  private static final int[] b;
  
  static
  {
    int[] arrayOfInt = new int[256];
    b = arrayOfInt;
    Arrays.fill(arrayOfInt, -1);
    int j = a.length;
    int i = 0;
    for (;;)
    {
      if (i >= j)
      {
        b[61] = 0;
        return;
      }
      b[a[i]] = i;
      i += 1;
    }
  }
  
  private static String a(String paramString)
  {
    try
    {
      paramString = new String(b(paramString), "UTF-8");
      return paramString;
    }
    catch (UnsupportedEncodingException paramString) {}
    return null;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    paramString1 = a(paramString1).split("____008____");
    if ((paramString1.length == 2) && (paramString1[1].equals(paramString2))) {
      return paramString1[0];
    }
    return "";
  }
  
  private static byte[] b(String paramString)
  {
    int i1 = 0;
    int i = paramString.length();
    if (i == 0) {
      return new byte[0];
    }
    int i2 = i - 1;
    int k;
    int j;
    label76:
    int n;
    label81:
    int i3;
    byte[] arrayOfByte;
    int i4;
    int m;
    if (paramString.charAt(i2) == '=') {
      if (paramString.charAt(i2 - 1) == '=')
      {
        k = 2;
        j = i2 + 0 + 1;
        if (i <= 76) {
          break label175;
        }
        if (paramString.charAt(76) != '\r') {
          break label170;
        }
        i = j / 78;
        n = i << 1;
        i3 = ((j - n) * 6 >> 3) - k;
        arrayOfByte = new byte[i3];
        i4 = i3 / 3;
        m = 0;
        i = 0;
        j = 0;
      }
    }
    label136:
    label417:
    label420:
    for (;;)
    {
      label113:
      if (i >= i4 * 3) {
        if (i < i3)
        {
          n = j;
          m = 0;
          j = i1;
          i1 = j;
          if (n <= i2 - k) {
            break label354;
          }
          j = 16;
        }
      }
      for (;;)
      {
        if (i >= i3)
        {
          return arrayOfByte;
          k = 1;
          break;
          k = 0;
          break;
          label170:
          i = 0;
          break label76;
          label175:
          n = 0;
          break label81;
          int[] arrayOfInt = b;
          int i6 = j + 1;
          int i5 = arrayOfInt[paramString.charAt(j)];
          arrayOfInt = b;
          j = i6 + 1;
          i6 = arrayOfInt[paramString.charAt(i6)];
          arrayOfInt = b;
          int i7 = j + 1;
          int i8 = arrayOfInt[paramString.charAt(j)];
          arrayOfInt = b;
          j = i7 + 1;
          i5 = arrayOfInt[paramString.charAt(i7)] | i5 << 18 | i6 << 12 | i8 << 6;
          i6 = i + 1;
          arrayOfByte[i] = ((byte)(i5 >> 16));
          i7 = i6 + 1;
          arrayOfByte[i6] = ((byte)(i5 >> 8));
          i = i7 + 1;
          arrayOfByte[i7] = ((byte)i5);
          if (n <= 0) {
            break label420;
          }
          m += 1;
          if (m != 19) {
            break label417;
          }
          m = 0;
          j += 2;
          break label113;
          label354:
          i4 = b[paramString.charAt(n)];
          j = i1 + 1;
          m = i4 << 18 - i1 * 6 | m;
          n += 1;
          break label136;
        }
        arrayOfByte[i] = ((byte)(m >> j));
        j -= 8;
        i += 1;
      }
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.lishu.c.n
 * JD-Core Version:    0.7.0.1
 */