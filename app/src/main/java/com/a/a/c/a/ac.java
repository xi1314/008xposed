package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.runtimeexception;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public final class ac
  implements aq
{
  public static final ac a = new ac();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    paramType = null;
    paramObject = paramc.k();
    if (paramObject.c() == 8)
    {
      paramObject.a();
      return null;
    }
    paramc.b(12);
    int i = 0;
    String str = paramObject.s();
    paramObject.a(17);
    if (str.equals("address"))
    {
      paramc.b(17);
      paramType = (InetAddress)paramc.a(InetAddress.class);
    }
    for (;;)
    {
      if (paramObject.c() != 16) {
        break label146;
      }
      paramObject.a();
      break;
      if (str.equals("port"))
      {
        paramc.b(17);
        if (paramObject.c() != 2) {
          throw new runtimeexception("port is not int");
        }
        i = paramObject.p();
        paramObject.a();
      }
      else
      {
        paramc.b(17);
        paramc.j();
      }
    }
    label146:
    paramc.b(13);
    return new InetSocketAddress(paramType, i);
  }
  
  public final int a_()
  {
    return 12;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.ac

 * JD-Core Version:    0.7.0.1

 */