package com.a.a.d;

import java.awt.Color;
import java.io.IOException;
import java.lang.reflect.Type;

public final class w
  implements bb
{
  public static final w a = new w();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    char c = '{';
    paramap = paramap.j();
    paramObject1 = (Color)paramObject1;
    if (paramObject1 == null)
    {
      paramap.a();
      return;
    }
    if (paramap.b(bl.n))
    {
      paramap.a('{');
      paramap.b(a.a);
      paramap.a(Color.class.getName());
      c = ',';
    }
    paramap.a(c, "r", paramObject1.getRed());
    paramap.a(',', "runningappprocessinfolist", paramObject1.getGreen());
    paramap.a(',', "b", paramObject1.getBlue());
    if (paramObject1.getAlpha() > 0) {
      paramap.a(',', "alpha", paramObject1.getAlpha());
    }
    paramap.a('}');
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.w

 * JD-Core Version:    0.7.0.1

 */