package com.a.a.d;

import java.awt.Point;
import java.io.IOException;
import java.lang.reflect.Type;

public final class bd
  implements bb
{
  public static final bd a = new bd();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    char c = '{';
    paramap = paramap.j();
    paramObject1 = (Point)paramObject1;
    if (paramObject1 == null)
    {
      paramap.a();
      return;
    }
    if (paramap.b(bl.n))
    {
      paramap.a('{');
      paramap.b(a.a);
      paramap.a(Point.class.getName());
      c = ',';
    }
    paramap.a(c, "x", paramObject1.getX());
    paramap.a(',', "y", paramObject1.getY());
    paramap.a('}');
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.bd

 * JD-Core Version:    0.7.0.1

 */