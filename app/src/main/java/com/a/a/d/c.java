package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;

public final class c
  implements bb
{
  private final Class a;
  private final bb b;
  
  public c(Class paramClass, bb parambb)
  {
    this.a = paramClass;
    this.b = parambb;
  }
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
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
    Object[] arrayOfObject = (Object[])paramObject1;
    int j = arrayOfObject.length;
    paramType = paramap.b();
    paramap.a(paramType, paramObject1, paramObject2);
    for (;;)
    {
      int i;
      try
      {
        localbk.b('[');
        i = 0;
        if (i >= j) {
          break label176;
        }
        if (i != 0) {
          localbk.b(',');
        }
        paramObject1 = arrayOfObject[i];
        if (paramObject1 == null) {
          localbk.a("null");
        } else if (paramObject1.getClass() == this.a) {
          this.b.a(paramap, paramObject1, Integer.valueOf(i), null);
        }
      }
      finally
      {
        paramap.a(paramType);
      }
      paramap.a(paramObject1.getClass()).a(paramap, paramObject1, Integer.valueOf(i), null);
      break label191;
      label176:
      localbk.b(']');
      paramap.a(paramType);
      return;
      label191:
      i += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.saveaccountdatatoFile

 * JD-Core Version:    0.7.0.1

 */