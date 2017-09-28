package com.a.a.d;

import java.awt.Font;
import java.io.IOException;
import java.lang.reflect.Type;

public final class aj
  implements bb
{
  public static final aj a = new aj();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    char c = '{';
    paramap = paramap.j();
    paramObject1 = (Font)paramObject1;
    if (paramObject1 == null)
    {
      paramap.a();
      return;
    }
    if (paramap.b(bl.n))
    {
      paramap.a('{');
      paramap.b(a.a);
      paramap.a(Font.class.getName());
      c = ',';
    }
    paramap.a(c, "name", paramObject1.getName());
    paramap.a(',', "style", paramObject1.getStyle());
    paramap.a(',', "size", paramObject1.getSize());
    paramap.a('}');
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.aj

 * JD-Core Version:    0.7.0.1

 */