package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;

public final class bn
  implements bb
{
  public static bn a = new bn();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    paramObject2 = paramap.j();
    if ((Number)paramObject1 == null) {
      if (paramObject2.b(bl.h)) {
        paramObject2.a('0');
      }
    }
    do
    {
      return;
      paramObject2.a();
      return;
      paramObject2.a(((Number)paramObject1).shortValue());
    } while (!paramap.b(bl.n));
    paramObject2.a('S');
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.bn

 * JD-Core Version:    0.7.0.1

 */