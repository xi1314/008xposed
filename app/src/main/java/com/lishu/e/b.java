package com.lishu.e;

import b.a.a.a.a;

public final class b
{
  private static final char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  private static final char[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  private final String c;
  
  private static int a(char paramChar, int paramInt)
    throws a
  {
    int i = Character.digit(paramChar, 16);
    if (i == -1) {
      throw new a("Illegal hexadecimal character " + paramChar + " at index " + paramInt);
    }
    return i;
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    return new String(b(paramArrayOfByte));
  }
  
  public static byte[] a(char[] paramArrayOfChar)
    throws a
  {
    int j = 0;
    int k = paramArrayOfChar.length;
    if ((k & 0x1) != 0) {
      throw new a("Odd number of characters.");
    }
    byte[] arrayOfByte = new byte[k >> 1];
    int i = 0;
    for (;;)
    {
      if (j >= k) {
        return arrayOfByte;
      }
      int m = a(paramArrayOfChar[j], j);
      j += 1;
      int n = a(paramArrayOfChar[j], j);
      j += 1;
      arrayOfByte[i] = ((byte)((m << 4 | n) & 0xFF));
      i += 1;
    }
  }
  
  private static char[] b(byte[] paramArrayOfByte)
  {
    int j = 0;
    char[] arrayOfChar1 = a;
    int k = paramArrayOfByte.length;
    char[] arrayOfChar2 = new char[k << 1];
    int i = 0;
    for (;;)
    {
      if (i >= k) {
        return arrayOfChar2;
      }
      int m = j + 1;
      arrayOfChar2[j] = arrayOfChar1[((paramArrayOfByte[i] & 0xF0) >>> 4)];
      j = m + 1;
      arrayOfChar2[m] = arrayOfChar1[(paramArrayOfByte[i] & 0xF)];
      i += 1;
    }
  }
  
  public final String toString()
  {
    return super.toString() + "[charsetName=" + this.c + "]";
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.lishu.packageinfolist.Inttolong

 * JD-Core Version:    0.7.0.1

 */