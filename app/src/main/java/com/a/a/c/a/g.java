package com.a.a.c.a;

import com.a.a.b;
import com.a.a.c.c;
import com.a.a.c.e;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicLongArray;

public final class g
  implements aq
{
  public static final g a = new g();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    if (paramc.k().c() == 8)
    {
      paramc.k().a(16);
      return null;
    }
    paramType = new b();
    paramc.b(paramType);
    paramc = new AtomicLongArray(paramType.size());
    int i = 0;
    while (i < paramType.size())
    {
      paramc.set(i, paramType.d(i).longValue());
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

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.g

 * JD-Core Version:    0.7.0.1

 */