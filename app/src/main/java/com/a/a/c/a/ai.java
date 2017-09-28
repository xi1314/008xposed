package com.a.a.c.a;

import com.a.a.c.c;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

public final class ai
  implements aq
{
  public static final ai a = new ai();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    if ((paramType instanceof GenericArrayType))
    {
      paramObject = ((GenericArrayType)paramType).getGenericComponentType();
      paramType = paramObject;
      if ((paramObject instanceof TypeVariable)) {
        paramType = ((TypeVariable)paramObject).getBounds()[0];
      }
      paramObject = new ArrayList();
      paramc.a(paramType, paramObject);
      if ((paramType instanceof Class))
      {
        paramc = (Object[])Array.newInstance((Class)paramType, paramObject.size());
        paramObject.toArray(paramc);
        return paramc;
      }
      return paramObject.toArray();
    }
    return paramc.a(paramObject);
  }
  
  public final int a_()
  {
    return 12;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.c.XhookMethod.ai

 * JD-Core Version:    0.7.0.1

 */