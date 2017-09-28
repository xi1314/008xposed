package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;

public final class b
  implements bb
{
  public static final b a = new b();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    if (paramObject1 == null)
    {
      paramap = paramap.j();
      if (paramap.b(bl.g))
      {
        paramap.a("");
        return;
      }
      paramap.a();
      return;
    }
    paramap.a(paramObject1.toString());
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.Inttolong

 * JD-Core Version:    0.7.0.1

 */