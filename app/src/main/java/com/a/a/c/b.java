package com.a.a.c;

public final class b
{
  public static final char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  public static final boolean[] b = new boolean[256];
  public static final boolean[] c;
  public static final boolean[] d;
  public static final boolean[] e;
  public static final char[] f;
  public static final char[] g = { 48, 48, 48, 49, 48, 50, 48, 51, 48, 52, 48, 53, 48, 54, 48, 55, 48, 56, 48, 57, 48, 65, 48, 66, 48, 67, 48, 68, 48, 69, 48, 70, 49, 48, 49, 49, 49, 50, 49, 51, 49, 52, 49, 53, 49, 54, 49, 55, 49, 56, 49, 57, 49, 65, 49, 66, 49, 67, 49, 68, 49, 69, 49, 70, 50, 48, 50, 49, 50, 50, 50, 51, 50, 52, 50, 53, 50, 54, 50, 55, 50, 56, 50, 57, 50, 65, 50, 66, 50, 67, 50, 68, 50, 69, 50, 70 };
  
  static
  {
    int i = 0;
    if (i < b.length)
    {
      if ((i >= 65) && (i <= 90)) {
        b[i] = true;
      }
      for (;;)
      {
        i = (char)(i + 1);
        break;
        if ((i >= 97) && (i <= 122)) {
          b[i] = true;
        } else if (i == 95) {
          b[i] = true;
        }
      }
    }
    c = new boolean[256];
    i = 0;
    if (i < c.length)
    {
      if ((i >= 65) && (i <= 90)) {
        c[i] = true;
      }
      for (;;)
      {
        i = (char)(i + 1);
        break;
        if ((i >= 97) && (i <= 122)) {
          c[i] = true;
        } else if (i == 95) {
          c[i] = true;
        } else if ((i >= 48) && (i <= 57)) {
          c[i] = true;
        }
      }
    }
    d = new boolean[''];
    e = new boolean[''];
    f = new char[''];
    d[0] = true;
    d[1] = true;
    d[2] = true;
    d[3] = true;
    d[4] = true;
    d[5] = true;
    d[6] = true;
    d[7] = true;
    d[8] = true;
    d[9] = true;
    d[10] = true;
    d[11] = true;
    d[12] = true;
    d[13] = true;
    d[34] = true;
    d[92] = true;
    e[0] = true;
    e[1] = true;
    e[2] = true;
    e[3] = true;
    e[4] = true;
    e[5] = true;
    e[6] = true;
    e[7] = true;
    e[8] = true;
    e[9] = true;
    e[10] = true;
    e[11] = true;
    e[12] = true;
    e[13] = true;
    e[39] = true;
    e[92] = true;
    f[0] = '0';
    f[1] = '1';
    f[2] = '2';
    f[3] = '3';
    f[4] = '4';
    f[5] = '5';
    f[6] = '6';
    f[7] = '7';
    f[8] = 'b';
    f[9] = 't';
    f[10] = 'n';
    f[11] = 'v';
    f[12] = 'f';
    f[13] = 'r';
    f[34] = '"';
    f[39] = '\'';
    f[47] = '/';
    f[92] = '\\';
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.Inttolong

 * JD-Core Version:    0.7.0.1

 */