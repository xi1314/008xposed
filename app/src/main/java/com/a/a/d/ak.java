package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.InetAddress;

public final class ak
  implements bb
{
  public static ak a = new ak();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    if (paramObject1 == null)
    {
      paramap.k();
      return;
    }
    paramap.a(((InetAddress)paramObject1).getHostAddress());
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.ak

 * JD-Core Version:    0.7.0.1

 */