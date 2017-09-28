package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public final class v
  implements bb
{
  public static final v a = new v();
  
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
      Object localObject = (Collection)paramObject1;
      bi localbi = paramap.b();
      paramap.a(localbi, paramObject1, paramObject2);
      if (paramap.b(bl.n))
      {
        if (HashSet.class != localObject.getClass()) {
          break label185;
        }
        localbk.a("Set");
      }
      for (;;)
      {
        int j;
        try
        {
          localbk.b('[');
          paramObject1 = ((Collection)localObject).iterator();
          if (paramObject1.hasNext())
          {
            paramObject2 = paramObject1.next();
            j = i + 1;
            if (i != 0) {
              localbk.b(',');
            }
            if (paramObject2 == null)
            {
              localbk.a();
              i = j;
              continue;
              label185:
              if (TreeSet.class != localObject.getClass()) {
                continue;
              }
              localbk.a("TreeSet");
              continue;
            }
            localObject = paramObject2.getClass();
            if (localObject == Integer.class)
            {
              localbk.a(((Integer)paramObject2).intValue());
              i = j;
              continue;
            }
            if (localObject == Long.class)
            {
              localbk.a(((Long)paramObject2).longValue());
              if (localbk.b(bl.n))
              {
                localbk.a('L');
                i = j;
              }
            }
            else
            {
              paramap.a((Class)localObject).a(paramap, paramObject2, Integer.valueOf(j - 1), paramType);
              i = j;
              continue;
            }
          }
          else
          {
            localbk.b(']');
            return;
          }
        }
        finally
        {
          paramap.a(localbi);
        }
        i = j;
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.v

 * JD-Core Version:    0.7.0.1

 */