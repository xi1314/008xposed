package com.a.a.c.a;

import com.a.a.b;
import com.a.a.c.c;
import com.a.a.c.e;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class f
  implements aq
{
  public static final f a = new f();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    if (paramc.k().c() == 8)
    {
      paramc.k().a(16);
      return null;
    }
    paramType = new b();
    paramc.b(paramType);
    paramc = new AtomicIntegerArray(paramType.size());
    int i = 0;
    while (i < paramType.size())
    {
      paramc.set(i, paramType.c(i).intValue());
      i += 1;
    }
    return paramc;
  }
  
  public final int a_()
  {
    return 14;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.f

 * JD-Core Version:    0.7.0.1

 */