package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;

public final class ai
  implements bb
{
  public static ai a = new ai();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    paramType = paramap.j();
    if (paramObject1 == null) {
      if (paramap.b(bl.h)) {
        paramType.a('0');
      }
    }
    do
    {
      return;
      paramType.a();
      return;
      float f = ((Float)paramObject1).floatValue();
      if (Float.isNaN(f))
      {
        paramType.a();
        return;
      }
      if (Float.isInfinite(f))
      {
        paramType.a();
        return;
      }
      paramObject2 = Float.toString(f);
      paramObject1 = paramObject2;
      if (paramObject2.endsWith(".0")) {
        paramObject1 = paramObject2.substring(0, paramObject2.length() - 2);
      }
      paramType.write(paramObject1);
    } while (!paramap.b(bl.n));
    paramType.a('F');
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.ai

 * JD-Core Version:    0.7.0.1

 */