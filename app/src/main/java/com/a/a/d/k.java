package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigInteger;

public final class k
  implements bb
{
  public static final k a = new k();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    paramap = paramap.j();
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
    paramap.write(((BigInteger)paramObject1).toString());
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.k

 * JD-Core Version:    0.7.0.1

 */