package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d
  implements bb
{
  public static final d a = new d();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    paramap = paramap.j();
    if (((AtomicBoolean)paramObject1).get())
    {
      paramap.a("true");
      return;
    }
    paramap.a("false");
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.getMap

 * JD-Core Version:    0.7.0.1

 */