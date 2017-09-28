package com.a.a.b;

public final class c
{
  static final byte[] a;
  int b;
  int c = 1;
  final b d = new b();
  f[] e = new f[256];
  int f = (int)(0.75D * this.e.length);
  final f g = new f();
  final f h = new f();
  final f i = new f();
  String j;
  e k;
  e l;
  i m;
  i n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int[] s;
  
  static
  {
    byte[] arrayOfByte = new byte['Ü'];
    int i1 = 0;
    while (i1 < arrayOfByte.length)
    {
      arrayOfByte[i1] = ((byte)("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHHFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII".charAt(i1) - 'A'));
      i1 += 1;
    }
    a = arrayOfByte;
  }
  
  public c()
  {
    this((byte)0);
  }
  
  private c(byte paramByte) {}
  
  private int a(String paramString1, String paramString2)
  {
    this.h.a(12, paramString1, paramString2, null);
    f localf2 = a(this.h);
    f localf1 = localf2;
    if (localf2 == null)
    {
      a(12, a(paramString1), a(paramString2));
      int i1 = this.c;
      this.c = (i1 + 1);
      localf1 = new f(i1, this.h);
      b(localf1);
    }
    return localf1.a;
  }
  
  private f a(f paramf)
  {
    f localf = this.e[(paramf.h % this.e.length)];
    if (localf != null)
    {
      boolean bool;
      if (localf.b == paramf.b) {
        switch (paramf.b)
        {
        case 2: 
        case 9: 
        case 10: 
        case 11: 
        case 14: 
        default: 
          if ((localf.e.equals(paramf.e)) && (localf.f.equals(paramf.f)) && (localf.g.equals(paramf.g))) {
            bool = true;
          }
          break;
        }
      }
      for (;;)
      {
        if (bool) {
          return localf;
        }
        localf = localf.i;
        break;
        bool = localf.e.equals(paramf.e);
        continue;
        if (localf.d == paramf.d)
        {
          bool = true;
        }
        else
        {
          bool = false;
          continue;
          if (localf.c == paramf.c)
          {
            bool = true;
          }
          else
          {
            bool = false;
            continue;
            if ((localf.e.equals(paramf.e)) && (localf.f.equals(paramf.f)))
            {
              bool = true;
            }
            else
            {
              bool = false;
              continue;
              bool = false;
            }
          }
        }
      }
    }
    return localf;
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.d.b(paramInt1, paramInt2).b(paramInt3);
  }
  
  private void b(f paramf)
  {
    if (this.c > this.f)
    {
      i1 = this.e.length;
      int i2 = i1 * 2 + 1;
      f[] arrayOff = new f[i2];
      i1 -= 1;
      while (i1 >= 0)
      {
        f localf;
        for (Object localObject = this.e[i1]; localObject != null; localObject = localf)
        {
          int i3 = ((f)localObject).h % arrayOff.length;
          localf = ((f)localObject).i;
          ((f)localObject).i = arrayOff[i3];
          arrayOff[i3] = localObject;
        }
        i1 -= 1;
      }
      this.e = arrayOff;
      this.f = ((int)(i2 * 0.75D));
    }
    int i1 = paramf.h % this.e.length;
    paramf.i = this.e[i1];
    this.e[i1] = paramf;
  }
  
  public final int a(String paramString)
  {
    this.g.a(1, paramString, null, null);
    f localf2 = a(this.g);
    f localf1 = localf2;
    if (localf2 == null)
    {
      this.d.a(1).a(paramString);
      int i1 = this.c;
      this.c = (i1 + 1);
      localf1 = new f(i1, this.g);
      b(localf1);
    }
    return localf1.a;
  }
  
  public final d a(int paramInt, String paramString1, String paramString2)
  {
    return new e(this, paramInt, paramString1, paramString2);
  }
  
  final f a(Object paramObject)
  {
    f localf;
    if ((paramObject instanceof Integer))
    {
      i1 = ((Integer)paramObject).intValue();
      paramObject = this.g;
      paramObject.b = 3;
      paramObject.c = i1;
      paramObject.h = (0x7FFFFFFF & paramObject.b + i1);
      localf = a(this.g);
      paramObject = localf;
      if (localf == null)
      {
        this.d.a(3).c(i1);
        i1 = this.c;
        this.c = (i1 + 1);
        paramObject = new f(i1, this.g);
        b(paramObject);
      }
    }
    String str;
    do
    {
      return paramObject;
      if (!(paramObject instanceof String)) {
        break;
      }
      str = (String)paramObject;
      this.h.a(8, str, null, null);
      localf = a(this.h);
      paramObject = localf;
    } while (localf != null);
    this.d.b(8, a(str));
    int i1 = this.c;
    this.c = (i1 + 1);
    paramObject = new f(i1, this.h);
    b(paramObject);
    return paramObject;
    if ((paramObject instanceof j))
    {
      paramObject = (j)paramObject;
      if (paramObject.a() == 10) {}
      for (paramObject = paramObject.b();; paramObject = paramObject.c()) {
        return b(paramObject);
      }
    }
    throw new IllegalArgumentException("value " + paramObject);
  }
  
  final f a(String paramString1, String paramString2, String paramString3)
  {
    this.i.a(9, paramString1, paramString2, paramString3);
    f localf2 = a(this.i);
    f localf1 = localf2;
    if (localf2 == null)
    {
      a(9, c(paramString1), a(paramString2, paramString3));
      int i1 = this.c;
      this.c = (i1 + 1);
      localf1 = new f(i1, this.i);
      b(localf1);
    }
    return localf1;
  }
  
  final f a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    if (paramBoolean) {}
    f localf;
    for (int i1 = 11;; i1 = 10)
    {
      this.i.a(i1, paramString1, paramString2, paramString3);
      localf = a(this.i);
      if (localf != null) {
        break;
      }
      a(i1, c(paramString1), a(paramString2, paramString3));
      i1 = this.c;
      this.c = (i1 + 1);
      paramString1 = new f(i1, this.i);
      b(paramString1);
      return paramString1;
    }
    return localf;
  }
  
  public final void a(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    int i2 = 0;
    this.b = 49;
    this.o = 33;
    this.p = c(paramString1);
    this.j = paramString1;
    if (paramString2 == null) {}
    for (int i1 = 0;; i1 = c(paramString2))
    {
      this.q = i1;
      if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0)) {
        break;
      }
      this.r = paramArrayOfString.length;
      this.s = new int[this.r];
      i1 = i2;
      while (i1 < this.r)
      {
        this.s[i1] = c(paramArrayOfString[i1]);
        i1 += 1;
      }
    }
  }
  
  public final byte[] a()
  {
    int i1 = this.r * 2 + 24;
    Object localObject = this.k;
    int i2 = 0;
    while (localObject != null)
    {
      i1 += 8;
      localObject = ((e)localObject).a;
      i2 += 1;
    }
    localObject = this.m;
    int i4 = 0;
    int i3 = i1;
    i1 = i4;
    while (localObject != null)
    {
      i3 += ((i)localObject).a();
      localObject = ((i)localObject).a;
      i1 += 1;
    }
    b localb = new b(this.d.b + i3);
    localb.c(-889275714).c(this.b);
    localb.b(this.c).a(this.d.a, this.d.b);
    localb.b(((0x60000 | (this.o & 0x40000) / 64) ^ 0xFFFFFFFF) & this.o).b(this.p).b(this.q);
    localb.b(this.r);
    i3 = 0;
    while (i3 < this.r)
    {
      localb.b(this.s[i3]);
      i3 += 1;
    }
    localb.b(i2);
    for (localObject = this.k; localObject != null; localObject = ((e)localObject).a) {
      ((e)localObject).a(localb);
    }
    localb.b(i1);
    for (localObject = this.m; localObject != null; localObject = ((i)localObject).a) {
      ((i)localObject).a(localb);
    }
    localb.b(0);
    return localb.a;
  }
  
  final f b(String paramString)
  {
    this.h.a(7, paramString, null, null);
    f localf2 = a(this.h);
    f localf1 = localf2;
    if (localf2 == null)
    {
      this.d.b(7, a(paramString));
      int i1 = this.c;
      this.c = (i1 + 1);
      localf1 = new f(i1, this.h);
      b(localf1);
    }
    return localf1;
  }
  
  public final h b(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    return new i(this, paramString1, paramString2, paramArrayOfString);
  }
  
  public final int c(String paramString)
  {
    return b(paramString).a;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.Inttolong.saveaccountdatatoFile

 * JD-Core Version:    0.7.0.1

 */