package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;

public final class an
  implements bb
{
  public static an a = new an();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    paramap = paramap.j();
    paramObject1 = (Number)paramObject1;
    if (paramObject1 == null)
    {
      if (paramap.b(bl.h))
      {
        paramap.a('0');
        return;
      }
      paramap.a();
      return;
    }
    paramap.a(paramObject1.intValue());
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.an

 * JD-Core Version:    0.7.0.1

 */