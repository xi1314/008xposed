package com.a.a.d;

public final class bi
{
  private final bi a;
  private final Object b;
  private final Object c;
  
  public bi(bi parambi, Object paramObject1, Object paramObject2)
  {
    this.a = parambi;
    this.b = paramObject1;
    this.c = paramObject2;
  }
  
  public final bi a()
  {
    return this.a;
  }
  
  public final Object b()
  {
    return this.b;
  }
  
  public final String c()
  {
    if (this.a == null) {
      return "$";
    }
    if ((this.c instanceof Integer)) {
      return this.a.c() + "[" + this.c + "]";
    }
    return this.a.c() + "." + this.c;
  }
  
  public final String toString()
  {
    return c();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.bi

 * JD-Core Version:    0.7.0.1

 */