package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public final class aw
  implements bb
{
  public static aw a = new aw();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    bk localbk = paramap.j();
    if (paramObject1 == null)
    {
      localbk.a();
      return;
    }
    paramType = (Map)paramObject1;
    if ((localbk.b(bl.k)) && (!(paramType instanceof SortedMap)) && (!(paramType instanceof LinkedHashMap))) {}
    for (;;)
    {
      try
      {
        TreeMap localTreeMap = new TreeMap(paramType);
        paramType = localTreeMap;
        if (!paramap.a(paramObject1)) {
          break;
        }
        paramap.b(paramObject1);
        return;
      }
      catch (Exception localException) {}
    }
    bi localbi = paramap.b();
    paramap.a(localbi, paramObject1, paramObject2);
    label646:
    for (;;)
    {
      try
      {
        localbk.a('{');
        paramap.d();
        int i = 1;
        if (localbk.b(bl.n))
        {
          localbk.b(a.a);
          localbk.a(paramObject1.getClass().getName());
          i = 0;
        }
        Iterator localIterator = paramType.entrySet().iterator();
        bb localbb = null;
        Object localObject1 = null;
        if (localIterator.hasNext())
        {
          paramObject2 = (Map.Entry)localIterator.next();
          paramObject1 = paramObject2.getValue();
          Object localObject3 = paramObject2.getKey();
          if ((localObject3 == null) || ((localObject3 instanceof String)))
          {
            Object localObject2 = (String)localObject3;
            paramObject2 = paramap.h();
            if (paramObject2 != null)
            {
              paramObject2 = paramObject2.iterator();
              if (!paramObject2.hasNext()) {
                break label627;
              }
              if (((bf)paramObject2.next()).a()) {
                continue;
              }
              j = 0;
              break label630;
            }
            paramObject2 = paramap.i();
            if (paramObject2 != null)
            {
              paramObject2 = paramObject2.iterator();
              if (!paramObject2.hasNext()) {
                break label621;
              }
              if (((be)paramObject2.next()).a()) {
                continue;
              }
              j = 0;
              break label638;
            }
            Object localObject4 = paramap.g();
            paramObject2 = localObject2;
            if (localObject4 != null)
            {
              localObject4 = ((List)localObject4).iterator();
              paramObject2 = localObject2;
              if (((Iterator)localObject4).hasNext())
              {
                paramObject2 = ((ax)((Iterator)localObject4).next()).a();
                continue;
              }
            }
            localObject2 = paramap.c();
            if (localObject2 == null) {
              break label646;
            }
            localObject2 = ((List)localObject2).iterator();
            if (((Iterator)localObject2).hasNext())
            {
              paramObject1 = ((bt)((Iterator)localObject2).next()).a();
              continue;
            }
            if ((paramObject1 == null) && (!paramap.b(bl.c))) {
              continue;
            }
            if (i == 0) {
              localbk.a(',');
            }
            if (localbk.b(bl.m)) {
              paramap.f();
            }
            localbk.a(paramObject2, true);
            if (paramObject1 == null)
            {
              localbk.a();
              i = 0;
            }
          }
          else
          {
            if (i == 0) {
              localbk.a(',');
            }
            paramap.c(localObject3);
            localbk.a(':');
            continue;
          }
          paramObject2 = paramObject1.getClass();
          if (paramObject2 == localObject1)
          {
            localbb.a(paramap, paramObject1, localObject3, null);
            i = 0;
            continue;
          }
          localbb = paramap.a(paramObject2);
          localbb.a(paramap, paramObject1, localObject3, null);
          i = 0;
          localObject1 = paramObject2;
        }
        else
        {
          paramap.a(localbi);
          paramap.e();
          if ((localbk.b(bl.m)) && (paramType.size() > 0)) {
            paramap.f();
          }
          localbk.a('}');
          return;
        }
      }
      finally
      {
        paramap.a(localbi);
      }
      label621:
      int j = 1;
      break label638;
      label627:
      j = 1;
      label630:
      if (j != 0)
      {
        continue;
        label638:
        if (j != 0) {}
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.aw

 * JD-Core Version:    0.7.0.1

 */