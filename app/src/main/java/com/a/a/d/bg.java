package com.a.a.d;

import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Type;

public final class bg
  implements bb
{
  public static final bg a = new bg();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    char c = '{';
    paramap = paramap.j();
    paramObject1 = (Rectangle)paramObject1;
    if (paramObject1 == null)
    {
      paramap.a();
      return;
    }
    if (paramap.b(bl.n))
    {
      paramap.a('{');
      paramap.b(a.a);
      paramap.a(Rectangle.class.getName());
      c = ',';
    }
    paramap.a(c, "x", paramObject1.getX());
    paramap.a(',', "y", paramObject1.getY());
    paramap.a(',', "width", paramObject1.getWidth());
    paramap.a(',', "height", paramObject1.getHeight());
    paramap.a('}');
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.bg

 * JD-Core Version:    0.7.0.1

 */