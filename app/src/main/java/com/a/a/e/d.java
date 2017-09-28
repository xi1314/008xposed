package com.a.a.e;

import java.util.Arrays;

public final class d
{
  public static final char[] a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
  public static final int[] b;
  
  static
  {
    int[] arrayOfInt = new int[256];
    b = arrayOfInt;
    Arrays.fill(arrayOfInt, -1);
    int j = a.length;
    int i = 0;
    while (i < j)
    {
      b[a[i]] = i;
      i += 1;
    }
    b[61] = 0;
  }
  
  public static final byte[] a(String paramString, int paramInt1, int paramInt2)
  {
    int n = 0;
    if (paramInt2 == 0) {
      return new byte[0];
    }
    int k = paramInt1 + paramInt2 - 1;
    while ((paramInt1 < k) && (b[paramString.charAt(paramInt1)] < 0)) {
      paramInt1 += 1;
    }
    for (;;)
    {
      if ((k > 0) && (b[paramString.charAt(k)] < 0))
      {
        k -= 1;
      }
      else
      {
        int i;
        int j;
        if (paramString.charAt(k) == '=') {
          if (paramString.charAt(k - 1) == '=')
          {
            i = 2;
            j = k - paramInt1 + 1;
            if (paramInt2 <= 76) {
              break label375;
            }
            if (paramString.charAt(76) != '\r') {
              break label370;
            }
            paramInt2 = j / 78;
          }
        }
        label127:
        int i4;
        byte[] arrayOfByte;
        int i1;
        label370:
        label375:
        for (int m = paramInt2 << 1;; m = 0)
        {
          i4 = ((j - m) * 6 >> 3) - i;
          arrayOfByte = new byte[i4];
          int i5 = i4 / 3;
          j = 0;
          paramInt2 = 0;
          while (paramInt2 < i5 * 3)
          {
            int[] arrayOfInt = b;
            int i2 = paramInt1 + 1;
            paramInt1 = arrayOfInt[paramString.charAt(paramInt1)];
            arrayOfInt = b;
            i1 = i2 + 1;
            i2 = arrayOfInt[paramString.charAt(i2)];
            arrayOfInt = b;
            int i3 = i1 + 1;
            int i6 = arrayOfInt[paramString.charAt(i1)];
            arrayOfInt = b;
            i1 = i3 + 1;
            paramInt1 = i6 << 6 | paramInt1 << 18 | i2 << 12 | arrayOfInt[paramString.charAt(i3)];
            i2 = paramInt2 + 1;
            arrayOfByte[paramInt2] = ((byte)(paramInt1 >> 16));
            paramInt2 = i2 + 1;
            arrayOfByte[i2] = ((byte)(paramInt1 >> 8));
            i2 = paramInt2 + 1;
            arrayOfByte[paramInt2] = ((byte)paramInt1);
            paramInt1 = i1;
            paramInt2 = i2;
            if (m > 0)
            {
              i3 = j + 1;
              j = i3;
              paramInt1 = i1;
              paramInt2 = i2;
              if (i3 == 19)
              {
                paramInt1 = i1 + 2;
                j = 0;
                paramInt2 = i2;
              }
            }
          }
          i = 1;
          break;
          i = 0;
          break;
          paramInt2 = 0;
          break label127;
        }
        if (paramInt2 < i4)
        {
          m = paramInt1;
          j = 0;
          paramInt1 = n;
          for (;;)
          {
            n = paramInt1;
            if (m > k - i) {
              break;
            }
            i1 = b[paramString.charAt(m)];
            paramInt1 = n + 1;
            j = i1 << 18 - n * 6 | j;
            m += 1;
          }
          i = 16;
          paramInt1 = paramInt2;
          paramInt2 = i;
          while (paramInt1 < i4)
          {
            arrayOfByte[paramInt1] = ((byte)(j >> paramInt2));
            paramInt2 -= 8;
            paramInt1 += 1;
          }
        }
        return arrayOfByte;
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.packageinfolist.getMap

 * JD-Core Version:    0.7.0.1

 */