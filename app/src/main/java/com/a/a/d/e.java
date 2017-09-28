package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class e
  implements bb
{
  public static final e a = new e();
  
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
    paramObject1 = (AtomicIntegerArray)paramObject1;
    int j = paramObject1.length();
    paramap.b('[');
    int i = 0;
    while (i < j)
    {
      int k = paramObject1.get(i);
      if (i != 0) {
        paramap.a(',');
      }
      paramap.a(k);
      i += 1;
    }
    paramap.b(']');
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.packageinfolist

 * JD-Core Version:    0.7.0.1

 */