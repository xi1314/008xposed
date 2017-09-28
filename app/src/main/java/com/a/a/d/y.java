package com.a.a.d;

import com.a.a.Map.g;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class y
  implements bb
{
  public static final y a = new y();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    paramObject2 = paramap.j();
    if (paramObject1 == null)
    {
      paramObject2.a();
      return;
    }
    if ((paramObject2.b(bl.n)) && (paramObject1.getClass() != paramType))
    {
      if (paramObject1.getClass() == Date.class)
      {
        paramObject2.write("new Date(");
        paramObject2.a(((Date)paramObject1).getTime(), ')');
        return;
      }
      paramObject2.a('{');
      paramObject2.b(a.a);
      paramap.a(paramObject1.getClass().getName());
      paramObject2.a("val", ((Date)paramObject1).getTime());
      paramObject2.a('}');
      return;
    }
    paramType = (Date)paramObject1;
    if (paramObject2.b(bl.r))
    {
      paramObject1 = paramap.a();
      paramap = paramObject1;
      if (paramObject1 == null) {
        paramap = new SimpleDateFormat(a.c);
      }
      paramObject2.a(paramap.format(paramType));
      return;
    }
    long l = paramType.getTime();
    if (paramap.b(bl.e))
    {
      int i;
      int j;
      int k;
      int m;
      int n;
      int i1;
      if (paramap.b(bl.b))
      {
        paramObject2.b('\'');
        paramObject1 = Calendar.getInstance();
        paramObject1.setTimeInMillis(l);
        i = paramObject1.get(1);
        j = paramObject1.get(2) + 1;
        k = paramObject1.get(5);
        m = paramObject1.get(11);
        n = paramObject1.get(12);
        i1 = paramObject1.get(13);
        int i2 = paramObject1.get(14);
        if (i2 == 0) {
          break label353;
        }
        paramObject1 = "0000-00-00T00:00:00.000".toCharArray();
        g.a(i2, 23, paramObject1);
        g.a(i1, 19, paramObject1);
        g.a(n, 16, paramObject1);
        g.a(m, 13, paramObject1);
        g.a(k, 10, paramObject1);
        g.a(j, 7, paramObject1);
        g.a(i, 4, paramObject1);
      }
      for (;;)
      {
        paramObject2.write(paramObject1);
        if (!paramap.b(bl.b)) {
          break label456;
        }
        paramObject2.b('\'');
        return;
        paramObject2.b('"');
        break;
        label353:
        if ((i1 == 0) && (n == 0) && (m == 0))
        {
          paramObject1 = "0000-00-00".toCharArray();
          g.a(k, 10, paramObject1);
          g.a(j, 7, paramObject1);
          g.a(i, 4, paramObject1);
        }
        else
        {
          paramObject1 = "0000-00-00T00:00:00".toCharArray();
          g.a(i1, 19, paramObject1);
          g.a(n, 16, paramObject1);
          g.a(m, 13, paramObject1);
          g.a(k, 10, paramObject1);
          g.a(j, 7, paramObject1);
          g.a(i, 4, paramObject1);
        }
      }
      label456:
      paramObject2.b('"');
      return;
    }
    paramObject2.a(l);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.y

 * JD-Core Version:    0.7.0.1

 */