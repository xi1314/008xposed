package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicLongArray;

public final class g
  implements bb
{
  public static final g a = new g();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    paramap = paramap.j();
    if (paramObject1 == null)
    {
      if (paramap.b(bl.f))
      {
        paramap.write("[]");
        return;
      }
      paramap.a();
      return;
    }
    paramObject1 = (AtomicLongArray)paramObject1;
    int j = paramObject1.length();
    paramap.b('[');
    int i = 0;
    while (i < j)
    {
      long l = paramObject1.get(i);
      if (i != 0) {
        paramap.a(',');
      }
      paramap.a(l);
      i += 1;
    }
    paramap.b(']');
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.g

 * JD-Core Version:    0.7.0.1

 */