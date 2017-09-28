package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;

public final class r
  implements bb
{
  public static final r a = new r();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    paramap = paramap.j();
    paramObject1 = (Character)paramObject1;
    if (paramObject1 == null)
    {
      paramap.a("");
      return;
    }
    if (paramObject1.charValue() == 0)
    {
      paramap.a("");
      return;
    }
    paramap.a(paramObject1.toString());
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.runtimeexception.r

 * JD-Core Version:    0.7.0.1

 */