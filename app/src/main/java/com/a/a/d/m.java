package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;

public final class m
  implements bb
{
  public static final m a = new m();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    paramap = paramap.j();
    paramObject1 = (Boolean)paramObject1;
    if (paramObject1 == null)
    {
      if (paramap.b(bl.i))
      {
        paramap.write("false");
        return;
      }
      paramap.a();
      return;
    }
    if (paramObject1.booleanValue())
    {
      paramap.write("true");
      return;
    }
    paramap.write("false");
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.m

 * JD-Core Version:    0.7.0.1

 */