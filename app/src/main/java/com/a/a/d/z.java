package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;

public final class z
  implements bb
{
  public static final z a = new z();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    paramap = paramap.j();
    if (paramObject1 == null)
    {
      if (paramap.b(bl.f))
      {
        paramap.write("[]");
        return;
      }
      paramap.a();
      return;
    }
    paramObject1 = (double[])paramObject1;
    int j = paramObject1.length - 1;
    if (j == -1)
    {
      paramap.a("[]");
      return;
    }
    paramap.b('[');
    int i = 0;
    if (i < j)
    {
      d = paramObject1[i];
      if (Double.isNaN(d)) {
        paramap.a();
      }
      for (;;)
      {
        paramap.b(',');
        i += 1;
        break;
        paramap.a(Double.toString(d));
      }
    }
    double d = paramObject1[j];
    if (Double.isNaN(d)) {
      paramap.a();
    }
    for (;;)
    {
      paramap.b(']');
      return;
      paramap.a(Double.toString(d));
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.z

 * JD-Core Version:    0.7.0.1

 */