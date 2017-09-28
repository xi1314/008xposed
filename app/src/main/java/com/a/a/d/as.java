package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public final class as
  implements bb
{
  public static final as a = new as();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    int i = 0;
    boolean bool = paramap.b(bl.n);
    bk localbk = paramap.j();
    Object localObject1;
    int j;
    bi localbi;
    label153:
    Object localObject2;
    Object localObject3;
    if ((bool) && ((paramType instanceof ParameterizedType)))
    {
      paramType = ((ParameterizedType)paramType).getActualTypeArguments()[0];
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
      localObject1 = (List)paramObject1;
      int k = ((List)localObject1).size();
      j = k - 1;
      if (j == -1)
      {
        localbk.a("[]");
        return;
      }
      localbi = paramap.b();
      paramap.a(localbi, paramObject1, paramObject2);
      if (k > 1)
      {
        try
        {
          if (!localbk.b(bl.m)) {
            break label299;
          }
          localbk.b('[');
          paramap.d();
          if (i >= k) {
            break label276;
          }
          if (i != 0) {
            localbk.b(',');
          }
          paramap.f();
          localObject2 = ((List)localObject1).get(i);
          if (localObject2 != null) {
            if (paramap.a(localObject2))
            {
              paramap.b(localObject2);
            }
            else
            {
              localObject3 = paramap.a(localObject2.getClass());
              paramap.a(new bi(localbi, paramObject1, paramObject2));
              ((bb)localObject3).a(paramap, localObject2, Integer.valueOf(i), paramType);
            }
          }
        }
        finally
        {
          paramap.a(localbi);
        }
        paramap.j().a();
        break label689;
        label276:
        paramap.e();
        paramap.f();
        localbk.b(']');
        paramap.a(localbi);
        return;
      }
      label299:
      localbk.b('[');
      i = 0;
    }
    for (;;)
    {
      if (i < j)
      {
        localObject2 = ((List)localObject1).get(i);
        if (localObject2 == null)
        {
          localbk.a("null,");
        }
        else
        {
          localObject3 = localObject2.getClass();
          if (localObject3 == Integer.class)
          {
            localbk.a(((Integer)localObject2).intValue(), ',');
          }
          else if (localObject3 == Long.class)
          {
            long l = ((Long)localObject2).longValue();
            if (bool)
            {
              localbk.a(l, 'L');
              localbk.a(',');
            }
            else
            {
              localbk.a(l, ',');
            }
          }
          else
          {
            paramap.a(new bi(localbi, paramObject1, paramObject2));
            if (paramap.a(localObject2)) {
              paramap.b(localObject2);
            }
            for (;;)
            {
              localbk.b(',');
              break;
              paramap.a(localObject2.getClass()).a(paramap, localObject2, Integer.valueOf(i), paramType);
            }
          }
        }
      }
      else
      {
        localObject1 = ((List)localObject1).get(j);
        if (localObject1 == null) {
          localbk.a("null]");
        }
        for (;;)
        {
          paramap.a(localbi);
          return;
          localObject2 = localObject1.getClass();
          if (localObject2 == Integer.class)
          {
            localbk.a(((Integer)localObject1).intValue(), ']');
          }
          else
          {
            if (localObject2 != Long.class) {
              break;
            }
            if (bool)
            {
              localbk.a(((Long)localObject1).longValue(), 'L');
              localbk.a(']');
            }
            else
            {
              localbk.a(((Long)localObject1).longValue(), ']');
            }
          }
        }
        paramap.a(new bi(localbi, paramObject1, paramObject2));
        if (paramap.a(localObject1)) {
          paramap.b(localObject1);
        }
        for (;;)
        {
          localbk.b(']');
          break;
          paramap.a(localObject1.getClass()).a(paramap, localObject1, Integer.valueOf(j), paramType);
        }
        paramType = null;
        break;
        label689:
        i += 1;
        break label153;
      }
      i += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.as

 * JD-Core Version:    0.7.0.1

 */