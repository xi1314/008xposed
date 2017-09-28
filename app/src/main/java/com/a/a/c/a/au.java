package com.a.a.c.a;

import com.a.a.c.c;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

public final class au
  implements aq
{
  public static final au a = new au();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    paramType = (ParameterizedType)paramType;
    paramc = paramc.a(paramType.getActualTypeArguments()[0]);
    paramType = paramType.getRawType();
    if (paramType == AtomicReference.class) {
      return new AtomicReference(paramc);
    }
    if (paramType == WeakReference.class) {
      return new WeakReference(paramc);
    }
    if (paramType == SoftReference.class) {
      return new SoftReference(paramc);
    }
    throw new UnsupportedOperationException(paramType.toString());
  }
  
  public final int a_()
  {
    return 12;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.c.XhookMethod.au

 * JD-Core Version:    0.7.0.1

 */