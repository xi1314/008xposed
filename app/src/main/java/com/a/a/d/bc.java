package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.regex.Pattern;

public final class bc
  implements bb
{
  public static final bc a = new bc();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    if (paramObject1 == null)
    {
      paramap.k();
      return;
    }
    paramap.a(((Pattern)paramObject1).pattern());
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.bc

 * JD-Core Version:    0.7.0.1

 */