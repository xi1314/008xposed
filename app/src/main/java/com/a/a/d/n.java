package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;

public final class n
  implements bb
{
  public static n a = new n();
  
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
    paramap.a((byte[])paramObject1);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.n

 * JD-Core Version:    0.7.0.1

 */