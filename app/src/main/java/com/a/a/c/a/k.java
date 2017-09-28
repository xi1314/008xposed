package com.a.a.c.a;

import com.a.a.Map;
import com.a.a.c.c;

import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;

public final class k
  implements aq
{
  public static final k a = new k();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    paramObject = paramc.k();
    if (paramObject.c() == 6)
    {
      paramObject.a(16);
      paramc = Boolean.TRUE;
    }
    for (;;)
    {
      paramObject = paramc;
      if (paramType == AtomicBoolean.class) {
        paramObject = new AtomicBoolean(paramc.booleanValue());
      }
      return paramObject;
      if (paramObject.c() == 7)
      {
        paramObject.a(16);
        paramc = Boolean.FALSE;
      }
      else if (paramObject.c() == 2)
      {
        int i = paramObject.p();
        paramObject.a(16);
        if (i == 1) {
          paramc = Boolean.TRUE;
        } else {
          paramc = Boolean.FALSE;
        }
      }
      else
      {
        paramc = paramc.j();
        if (paramc == null) {
          return null;
        }
        paramc = Map.k.k(paramc);
      }
    }
  }
  
  public final int a_()
  {
    return 6;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.k

 * JD-Core Version:    0.7.0.1

 */