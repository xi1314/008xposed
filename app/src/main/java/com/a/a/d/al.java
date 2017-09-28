package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.InetSocketAddress;

public final class al
  implements bb
{
  public static al a = new al();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    if (paramObject1 == null)
    {
      paramap.k();
      return;
    }
    paramObject2 = paramap.j();
    paramObject1 = (InetSocketAddress)paramObject1;
    paramType = paramObject1.getAddress();
    paramObject2.a('{');
    if (paramType != null)
    {
      paramObject2.b("address");
      paramap.c(paramType);
      paramObject2.a(',');
    }
    paramObject2.b("port");
    paramObject2.a(paramObject1.getPort());
    paramObject2.a('}');
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.al

 * JD-Core Version:    0.7.0.1

 */