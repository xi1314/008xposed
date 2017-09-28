package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.runtimeexception;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;

public final class be
  implements aq
{
  public static final be a = new be();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    paramc = (String)paramc.j();
    if (paramc == null) {
      return null;
    }
    try
    {
      paramc = new URL(paramc);
      return paramc;
    }
    catch (MalformedURLException paramc)
    {
      throw new runtimeexception("create url error", paramc);
    }
  }
  
  public final int a_()
  {
    return 4;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.c.XhookMethod.be

 * JD-Core Version:    0.7.0.1

 */