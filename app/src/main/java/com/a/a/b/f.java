package com.a.a.b;

final class f
{
  int a;
  int b;
  int c;
  long d;
  String e;
  String f;
  String g;
  int h;
  f i;
  
  f() {}
  
  f(int paramInt, f paramf)
  {
    this.a = paramInt;
    this.b = paramf.b;
    this.c = paramf.c;
    this.d = paramf.d;
    this.e = paramf.e;
    this.f = paramf.f;
    this.g = paramf.g;
    this.h = paramf.h;
  }
  
  final void a(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.b = paramInt;
    this.e = paramString1;
    this.f = paramString2;
    this.g = paramString3;
    switch (paramInt)
    {
    default: 
      this.h = (paramString1.hashCode() * paramString2.hashCode() * paramString3.hashCode() + paramInt & 0x7FFFFFFF);
      return;
    case 1: 
    case 7: 
    case 8: 
    case 13: 
      this.h = (paramString1.hashCode() + paramInt & 0x7FFFFFFF);
      return;
    }
    this.h = (paramString1.hashCode() * paramString2.hashCode() + paramInt & 0x7FFFFFFF);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.Inttolong.type

 * JD-Core Version:    0.7.0.1

 */