package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

public final class s
  implements bb
{
  public static final s a = new s();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    if (paramObject1 == null)
    {
      paramap.k();
      return;
    }
    paramap.a(((Charset)paramObject1).toString());
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.s

 * JD-Core Version:    0.7.0.1

 */