package com.a.a.b;

final class i
  implements h
{
  i a;
  final c b;
  int c;
  int[] d;
  private int e;
  private final int f;
  private final int g;
  private b h = new b();
  private int i;
  private int j;
  
  i(c paramc, String paramString1, String paramString2, String[] paramArrayOfString)
  {
    if (paramc.m == null) {
      paramc.m = this;
    }
    for (;;)
    {
      paramc.n = this;
      this.b = paramc;
      this.e = 1;
      this.f = paramc.a(paramString1);
      this.g = paramc.a(paramString2);
      if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0)) {
        break;
      }
      this.c = paramArrayOfString.length;
      this.d = new int[this.c];
      int k = 0;
      while (k < this.c)
      {
        this.d[k] = paramc.c(paramArrayOfString[k]);
        k += 1;
      }
      paramc.n.a = this;
    }
  }
  
  final int a()
  {
    int k = 8;
    if (this.h.b > 0)
    {
      this.b.a("Code");
      k = this.h.b + 18 + 0 + 8;
    }
    int m = k;
    if (this.c > 0)
    {
      this.b.a("Exceptions");
      m = k + (this.c * 2 + 8);
    }
    return m;
  }
  
  public final void a(int paramInt)
  {
    this.h.a(paramInt);
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.h.a(paramInt1, paramInt2);
  }
  
  public final void a(int paramInt, g paramg)
  {
    if (((paramg.a & 0x2) != 0) && (paramg.b - this.h.b < -32768)) {
      throw new UnsupportedOperationException();
    }
    this.h.a(paramInt);
    paramg.a(this.h, this.h.b - 1);
  }
  
  public final void a(int paramInt, String paramString)
  {
    paramString = this.b.b(paramString);
    this.h.b(paramInt, paramString.a);
  }
  
  public final void a(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    paramString1 = this.b.a(paramString1, paramString2, paramString3);
    this.h.b(paramInt, paramString1.a);
  }
  
  final void a(b paramb)
  {
    int n = 0;
    paramb.b(((0x60000 | (this.e & 0x40000) / 64) ^ 0xFFFFFFFF) & this.e).b(this.f).b(this.g);
    if (this.h.b > 0) {}
    for (int k = 1;; k = 0)
    {
      int m = k;
      if (this.c > 0) {
        m = k + 1;
      }
      paramb.b(m);
      if (this.h.b > 0)
      {
        k = this.h.b;
        paramb.b(this.b.a("Code")).c(k + 12 + 0);
        paramb.b(this.i).b(this.j);
        paramb.c(this.h.b).a(this.h.a, this.h.b);
        paramb.b(0);
        paramb.b(0);
      }
      if (this.c > 0)
      {
        paramb.b(this.b.a("Exceptions")).c(this.c * 2 + 2);
        paramb.b(this.c);
        k = n;
        while (k < this.c)
        {
          paramb.b(this.d[k]);
          k += 1;
        }
      }
      return;
    }
  }
  
  public final void a(g paramg)
  {
    paramg.a(this.h.b, this.h.a);
  }
  
  public final void a(Object paramObject)
  {
    paramObject = this.b.a(paramObject);
    int k = paramObject.a;
    if ((paramObject.b == 5) || (paramObject.b == 6))
    {
      this.h.b(20, k);
      return;
    }
    if (k >= 256)
    {
      this.h.b(19, k);
      return;
    }
    this.h.a(18, k);
  }
  
  public final void b(int paramInt)
  {
    this.h.a(132).a(paramInt, 1);
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    if ((paramInt2 < 4) && (paramInt1 != 169))
    {
      if (paramInt1 < 54) {}
      for (paramInt1 = (paramInt1 - 21 << 2) + 26 + paramInt2;; paramInt1 = (paramInt1 - 54 << 2) + 59 + paramInt2)
      {
        this.h.a(paramInt1);
        return;
      }
    }
    if (paramInt2 >= 256)
    {
      this.h.a(196).b(paramInt1, paramInt2);
      return;
    }
    this.h.a(paramInt1, paramInt2);
  }
  
  public final void b(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    boolean bool;
    int k;
    if (paramInt == 185)
    {
      bool = true;
      paramString1 = this.b.a(paramString1, paramString2, paramString3, bool);
      k = paramString1.c;
      if (!bool) {
        break label80;
      }
      if (k != 0) {
        break label94;
      }
      paramInt = j.b(paramString3);
      paramString1.c = paramInt;
    }
    for (;;)
    {
      this.h.b(185, paramString1.a).a(paramInt >> 2, 0);
      return;
      bool = false;
      break;
      label80:
      this.h.b(paramInt, paramString1.a);
      return;
      label94:
      paramInt = k;
    }
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    this.i = paramInt1;
    this.j = paramInt2;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.Inttolong.runningtaskinfolist

 * JD-Core Version:    0.7.0.1

 */