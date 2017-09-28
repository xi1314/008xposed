package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Enumeration;

public final class ac
  implements bb
{
  public static ac a = new ac();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    int i = 0;
    bk localbk = paramap.j();
    if (paramObject1 == null)
    {
      if (localbk.b(bl.f))
      {
        localbk.write("[]");
        return;
      }
      localbk.a();
      return;
    }
    if ((paramap.b(bl.n)) && ((paramType instanceof ParameterizedType))) {}
    for (paramType = ((ParameterizedType)paramType).getActualTypeArguments()[0];; paramType = null)
    {
      Enumeration localEnumeration = (Enumeration)paramObject1;
      bi localbi = paramap.b();
      paramap.a(localbi, paramObject1, paramObject2);
      try
      {
        localbk.b('[');
        while (localEnumeration.hasMoreElements())
        {
          paramObject1 = localEnumeration.nextElement();
          int j = i + 1;
          if (i != 0) {
            localbk.b(',');
          }
          if (paramObject1 == null)
          {
            localbk.a();
            i = j;
          }
          else
          {
            paramap.a(paramObject1.getClass()).a(paramap, paramObject1, Integer.valueOf(j - 1), paramType);
            i = j;
          }
        }
        localbk.b(']');
        return;
      }
      finally
      {
        paramap.a(localbi);
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.ac

 * JD-Core Version:    0.7.0.1

 */