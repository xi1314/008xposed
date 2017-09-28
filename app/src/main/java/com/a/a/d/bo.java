package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;

public final class bo
  implements bb
{
  public static bo a = new bo();
  
  public static void a(ap paramap, String paramString)
  {
    paramap = paramap.j();
    if (paramString == null)
    {
      if (paramap.b(bl.g))
      {
        paramap.a("");
        return;
      }
      paramap.a();
      return;
    }
    paramap.a(paramString);
  }
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    a(paramap, (String)paramObject1);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.bo

 * JD-Core Version:    0.7.0.1

 */