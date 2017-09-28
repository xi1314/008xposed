package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.Map.k;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicInteger;

public final class ad
  implements aq
{
  public static final ad a = new ad();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    paramObject = paramc.k();
    if (paramObject.c() == 8)
    {
      paramObject.a(16);
      paramObject = null;
      return paramObject;
    }
    if (paramObject.c() == 2)
    {
      int i = paramObject.p();
      paramObject.a(16);
      paramc = Integer.valueOf(i);
    }
    for (;;)
    {
      paramObject = paramc;
      if (paramType != AtomicInteger.class) {
        break;
      }
      return new AtomicInteger(paramc.intValue());
      if (paramObject.c() == 3)
      {
        paramc = paramObject.x();
        paramObject.a(16);
        paramc = Integer.valueOf(paramc.intValue());
      }
      else
      {
        paramc = k.j(paramc.j());
      }
    }
  }
  
  public final int a_()
  {
    return 2;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.ad

 * JD-Core Version:    0.7.0.1

 */