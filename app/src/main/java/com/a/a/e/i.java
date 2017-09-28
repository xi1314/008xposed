package com.a.a.e;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class i
  implements ParameterizedType
{
  private final Type[] a;
  private final Type b;
  private final Type c;
  
  public i(Type[] paramArrayOfType, Type paramType1, Type paramType2)
  {
    this.a = paramArrayOfType;
    this.b = paramType1;
    this.c = paramType2;
  }
  
  public final Type[] getActualTypeArguments()
  {
    return this.a;
  }
  
  public final Type getOwnerType()
  {
    return this.b;
  }
  
  public final Type getRawType()
  {
    return this.c;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.packageinfolist.runningtaskinfolist

 * JD-Core Version:    0.7.0.1

 */