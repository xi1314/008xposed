package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;

public final class am
  implements bb
{
  public static am a = new am();
  
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
    paramObject1 = (int[])paramObject1;
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

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.am

 * JD-Core Version:    0.7.0.1

 */