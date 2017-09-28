package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;

public final class az
  implements bb
{
  public static final az a = new az();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    int i = 0;
    paramType = null;
    bk localbk = paramap.j();
    Object[] arrayOfObject = (Object[])paramObject1;
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
    int k = arrayOfObject.length;
    int j = k - 1;
    if (j == -1)
    {
      localbk.a("[]");
      return;
    }
    bi localbi = paramap.b();
    paramap.a(localbi, paramObject1, paramObject2);
    for (;;)
    {
      Object localObject;
      try
      {
        localbk.b('[');
        if (localbk.b(bl.m))
        {
          paramap.d();
          paramap.f();
          if (i < k)
          {
            if (i != 0)
            {
              localbk.a(',');
              paramap.f();
            }
            paramap.c(arrayOfObject[i]);
            i += 1;
            continue;
          }
          paramap.e();
          paramap.f();
          localbk.a(']');
          return;
        }
        i = 0;
        paramObject2 = null;
        paramObject1 = paramType;
        if (i >= j) {
          break label301;
        }
        localObject = arrayOfObject[i];
        if (localObject == null)
        {
          localbk.a("null,");
        }
        else if (paramap.a(localObject))
        {
          paramap.b(localObject);
          localbk.b(',');
        }
      }
      finally
      {
        paramap.a(localbi);
      }
      paramType = localObject.getClass();
      if (paramType == paramObject1)
      {
        paramObject2.a(paramap, localObject, null, null);
      }
      else
      {
        paramObject2 = paramap.a(paramType);
        paramObject2.a(paramap, localObject, null, null);
        paramObject1 = paramType;
        continue;
        label301:
        paramObject1 = arrayOfObject[j];
        if (paramObject1 == null)
        {
          localbk.a("null]");
          paramap.a(localbi);
          return;
        }
        if (paramap.a(paramObject1)) {
          paramap.b(paramObject1);
        }
        for (;;)
        {
          localbk.b(']');
          break;
          paramap.c(paramObject1);
        }
        i += 1;
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.az

 * JD-Core Version:    0.7.0.1

 */