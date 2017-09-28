package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;

public final class av
  implements bb
{
  public static av a = new av();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    paramObject2 = paramap.j();
    if (paramObject1 == null) {
      if (paramObject2.b(bl.h)) {
        paramObject2.a('0');
      }
    }
    long l;
    do
    {
      return;
      paramObject2.a();
      return;
      l = ((Long)paramObject1).longValue();
      paramObject2.a(l);
    } while ((!paramap.b(bl.n)) || (l > 2147483647L) || (l < -2147483648L) || (paramType == Long.class));
    paramObject2.a('L');
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.av

 * JD-Core Version:    0.7.0.1

 */