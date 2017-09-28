package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;

public final class q
  implements bb
{
  public static q a = new q();
  
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
    paramap.a(new String((char[])paramObject1));
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.q

 * JD-Core Version:    0.7.0.1

 */