package com.a.a.c;

import java.lang.reflect.Type;

public class i
{
  private Object a;
  private final i b;
  private final Object c;
  private Type d;
  
  public i(i parami, Object paramObject1, Object paramObject2)
  {
    this.b = parami;
    this.a = paramObject1;
    this.c = paramObject2;
  }
  
  public final Type a()
  {
    return this.d;
  }
  
  public final void a(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public final void a(Type paramType)
  {
    this.d = paramType;
  }
  
  public final Object b()
  {
    return this.a;
  }
  
  public final i c()
  {
    return this.b;
  }
  
  public final String d()
  {
    if (this.b == null) {
      return "$";
    }
    if ((this.c instanceof Integer)) {
      return this.b.d() + "[" + this.c + "]";
    }
    return this.b.d() + "." + this.c;
  }
  
  public String toString()
  {
    return d();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.runningtaskinfolist

 * JD-Core Version:    0.7.0.1

 */