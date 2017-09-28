package com.a.a.d;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;

public final class x
  implements bb
{
  public static final x a = new x();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    paramObject2 = paramap.j();
    if (paramObject1 == null)
    {
      paramObject2.a();
      return;
    }
    String str = ((SimpleDateFormat)paramObject1).toPattern();
    if ((paramObject2.b(bl.n)) && (paramObject1.getClass() != paramType))
    {
      paramObject2.a('{');
      paramObject2.b(a.a);
      paramap.a(paramObject1.getClass().getName());
      paramObject2.a(',', "val", str);
      paramObject2.a('}');
      return;
    }
    paramObject2.a(str);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.x

 * JD-Core Version:    0.7.0.1

 */