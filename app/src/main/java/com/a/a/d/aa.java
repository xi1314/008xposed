package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

public final class aa
  implements bb
{
  public static final aa a = new aa();
  private DecimalFormat b = null;
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    paramType = paramap.j();
    if (paramObject1 == null)
    {
      if (paramap.b(bl.h))
      {
        paramType.a('0');
        return;
      }
      paramType.a();
      return;
    }
    double d = ((Double)paramObject1).doubleValue();
    if (Double.isNaN(d))
    {
      paramType.a();
      return;
    }
    if (Double.isInfinite(d))
    {
      paramType.a();
      return;
    }
    if (this.b == null)
    {
      paramObject2 = Double.toString(d);
      paramObject1 = paramObject2;
      if (!paramObject2.endsWith(".0")) {}
    }
    for (paramObject1 = paramObject2.substring(0, paramObject2.length() - 2);; paramObject1 = this.b.format(d))
    {
      paramType.a(paramObject1);
      if (!paramap.b(bl.n)) {
        break;
      }
      paramType.a('D');
      return;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.aa

 * JD-Core Version:    0.7.0.1

 */