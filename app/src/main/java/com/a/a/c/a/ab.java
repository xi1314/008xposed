package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.runtimeexception;

import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.UnknownHostException;

public final class ab
  implements aq
{
  public static final ab a = new ab();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    paramc = (String)paramc.j();
    if (paramc == null) {
      return null;
    }
    if (paramc.length() == 0) {
      return null;
    }
    try
    {
      paramc = InetAddress.getByName(paramc);
      return paramc;
    }
    catch (UnknownHostException paramc)
    {
      throw new runtimeexception("deserialize error", paramc);
    }
  }
  
  public final int a_()
  {
    return 4;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.c.XhookMethod.ab

 * JD-Core Version:    0.7.0.1

 */