package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.Map.k;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicLong;

public final class al
  implements aq
{
  public static final al a = new al();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    paramObject = paramc.k();
    long l;
    if (paramObject.c() == 2)
    {
      l = paramObject.w();
      paramObject.a(16);
    }
    for (paramc = Long.valueOf(l);; paramc = k.i(paramc))
    {
      paramObject = paramc;
      if (paramType == AtomicLong.class) {
        paramObject = new AtomicLong(paramc.longValue());
      }
      return paramObject;
      paramc = paramc.j();
      if (paramc == null) {
        return null;
      }
    }
  }
  
  public final int a_()
  {
    return 2;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.al

 * JD-Core Version:    0.7.0.1

 */