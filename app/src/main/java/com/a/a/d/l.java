package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;

public final class l
  implements bb
{
  public static l a = new l();
  
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
    paramObject1 = (boolean[])paramObject1;
    paramap.a('[');
    int i = 0;
    while (i < paramObject1.length)
    {
      if (i != 0) {
        paramap.a(',');
      }
      paramap.a(paramObject1[i]);
      i += 1;
    }
    paramap.a(']');
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.l

 * JD-Core Version:    0.7.0.1

 */