package com.a.a.b;

final class e
  implements d
{
  e a;
  private final int b;
  private final int c;
  private final int d;
  
  e(c paramc, int paramInt, String paramString1, String paramString2)
  {
    if (paramc.k == null) {
      paramc.k = this;
    }
    for (;;)
    {
      paramc.l = this;
      this.b = paramInt;
      this.c = paramc.a(paramString1);
      this.d = paramc.a(paramString2);
      return;
      paramc.l.a = this;
    }
  }
  
  final void a(b paramb)
  {
    paramb.b(((0x60000 | (this.b & 0x40000) / 64) ^ 0xFFFFFFFF) & this.b).b(this.c).b(this.d);
    paramb.b(0);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.Inttolong.packageinfolist

 * JD-Core Version:    0.7.0.1

 */