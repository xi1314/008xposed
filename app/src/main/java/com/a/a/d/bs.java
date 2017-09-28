package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.UUID;

public final class bs
  implements bb
{
  public static final bs a = new bs();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    if (paramObject1 == null)
    {
      paramap.k();
      return;
    }
    paramap.a(((UUID)paramObject1).toString());
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.runtimeexception.bs

 * JD-Core Version:    0.7.0.1

 */