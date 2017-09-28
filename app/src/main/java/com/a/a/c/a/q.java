package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.runtimeexception;
import com.a.a.Map.k;
import java.lang.reflect.Type;

public final class q
  implements aq
{
  public static final q a = new q();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    paramc = paramc.k();
    if (paramc.c() == 8)
    {
      paramc.a();
      return null;
    }
    if (paramc.c() != 4) {
      throw new runtimeexception("expect className");
    }
    paramType = paramc.s();
    paramc.a(16);
    return k.a(paramType);
  }
  
  public final int a_()
  {
    return 4;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.q

 * JD-Core Version:    0.7.0.1

 */