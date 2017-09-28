package com.a.a.d;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;

public final class af
  implements bb
{
  public static af a = new af();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    paramObject2 = paramap.j();
    if (paramObject1 == null)
    {
      paramObject2.a();
      return;
    }
    paramap.a(((File)paramObject1).getPath());
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.af

 * JD-Core Version:    0.7.0.1

 */