package com.a.a.b;

public final class j
{
  public static final j a = new j(0, null, 1443168256, 1);
  public static final j b = new j(1, null, 1509950721, 1);
  public static final j c = new j(2, null, 1124075009, 1);
  public static final j d = new j(3, null, 1107297537, 1);
  public static final j e = new j(4, null, 1392510721, 1);
  public static final j f = new j(5, null, 1224736769, 1);
  public static final j g = new j(6, null, 1174536705, 1);
  public static final j h = new j(7, null, 1241579778, 1);
  public static final j i = new j(8, null, 1141048066, 1);
  private final int j;
  private final char[] k;
  private final int l;
  private final int m;
  
  private j(int paramInt1, char[] paramArrayOfChar, int paramInt2, int paramInt3)
  {
    this.j = paramInt1;
    this.k = paramArrayOfChar;
    this.l = paramInt2;
    this.m = paramInt3;
  }
  
  public static j a(String paramString)
  {
    int n = 1;
    paramString = paramString.toCharArray();
    switch (paramString[0])
    {
    default: 
      n = 1;
    }
    while (paramString[(n + 0)] != ';')
    {
      n += 1;
      continue;
      return a;
      return b;
      return c;
      return d;
      return e;
      return f;
      return g;
      return h;
      return i;
      while (paramString[(n + 0)] == '[') {
        n += 1;
      }
      int i1 = n;
      if (paramString[(n + 0)] == 'L')
      {
        n += 1;
        for (;;)
        {
          i1 = n;
          if (paramString[(n + 0)] == ';') {
            break;
          }
          n += 1;
        }
      }
      return new j(9, paramString, 0, i1 + 1);
    }
    return new j(10, paramString, 1, n - 1);
  }
  
  public static int b(String paramString)
  {
    int i3 = 1;
    int i1 = 1;
    int n = 1;
    int i2 = i1 + 1;
    i1 = paramString.charAt(i1);
    if (i1 == 41)
    {
      i2 = paramString.charAt(i2);
      if (i2 == 86) {
        i1 = 0;
      }
      for (;;)
      {
        return n << 2 | i1;
        if (i2 != 68)
        {
          i1 = i3;
          if (i2 != 74) {}
        }
        else
        {
          i1 = 2;
        }
      }
    }
    if (i1 == 76) {}
    for (;;)
    {
      i1 = i2 + 1;
      if (paramString.charAt(i2) == ';')
      {
        n += 1;
        break;
        if ((i1 == 68) || (i1 == 74))
        {
          n += 2;
          i1 = i2;
          break;
        }
        n += 1;
        i1 = i2;
        break;
      }
      i2 = i1;
    }
  }
  
  public final int a()
  {
    return this.j;
  }
  
  public final String b()
  {
    return new String(this.k, this.l, this.m);
  }
  
  final String c()
  {
    return new String(this.k, this.l, this.m);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.Inttolong.recenttaskinfolist

 * JD-Core Version:    0.7.0.1

 */