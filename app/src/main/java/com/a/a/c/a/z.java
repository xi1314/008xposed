package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.Map.k;
import java.lang.reflect.Type;

public final class z
  implements aq
{
  public static final z a = new z();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    paramType = paramc.k();
    if (paramType.c() == 2)
    {
      paramc = paramType.i();
      paramType.a(16);
      return Float.valueOf(Float.parseFloat(paramc));
    }
    if (paramType.c() == 3)
    {
      float f = paramType.h();
      paramType.a(16);
      return Float.valueOf(f);
    }
    paramc = paramc.j();
    if (paramc == null) {
      return null;
    }
    return k.g(paramc);
  }
  
  public final int a_()
  {
    return 2;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.z

 * JD-Core Version:    0.7.0.1

 */