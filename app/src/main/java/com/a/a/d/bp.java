package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.TimeZone;

public final class bp
  implements bb
{
  public static final bp a = new bp();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    if (paramObject1 == null)
    {
      paramap.k();
      return;
    }
    paramap.a(((TimeZone)paramObject1).getID());
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.bp

 * JD-Core Version:    0.7.0.1

 */