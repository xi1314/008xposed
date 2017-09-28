package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;

public final class j
  implements bb
{
  public static final j a = new j();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    paramap = paramap.j();
    if (paramObject1 == null) {
      if (paramap.b(bl.h)) {
        paramap.a('0');
      }
    }
    do
    {
      return;
      paramap.a();
      return;
      paramObject1 = (BigDecimal)paramObject1;
      paramap.write(paramObject1.toString());
    } while ((!paramap.b(bl.n)) || (paramType == BigDecimal.class) || (paramObject1.scale() != 0));
    paramap.a('.');
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.recenttaskinfolist

 * JD-Core Version:    0.7.0.1

 */