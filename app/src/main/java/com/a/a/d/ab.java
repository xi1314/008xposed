package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;

public final class ab
  implements bb
{
  public static final ab a = new ab();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    paramObject2 = paramap.j();
    if (paramObject1 == null)
    {
      paramap.j().a();
      return;
    }
    if (paramap.b(bl.d))
    {
      paramap.a(((Enum)paramObject1).name());
      return;
    }
    paramObject2.a(((Enum)paramObject1).ordinal());
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.ab

 * JD-Core Version:    0.7.0.1

 */