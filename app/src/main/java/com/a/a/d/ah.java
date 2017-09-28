package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;

public final class ah
  implements bb
{
  public static final ah a = new ah();
  
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
    paramObject1 = (float[])paramObject1;
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
      f = paramObject1[i];
      if (Float.isNaN(f)) {
        paramap.a();
      }
      for (;;)
      {
        paramap.b(',');
        i += 1;
        break;
        paramap.a(Float.toString(f));
      }
    }
    float f = paramObject1[j];
    if (Float.isNaN(f)) {
      paramap.a();
    }
    for (;;)
    {
      paramap.b(']');
      return;
      paramap.a(Float.toString(f));
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.ah

 * JD-Core Version:    0.7.0.1

 */