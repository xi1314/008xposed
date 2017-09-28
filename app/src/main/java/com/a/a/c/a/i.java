package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.Map.k;
import java.lang.reflect.Type;
import java.math.BigDecimal;

public final class i
  implements aq
{
  public static final i a = new i();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    paramType = paramc.k();
    if (paramType.c() == 2)
    {
      long l = paramType.w();
      paramType.a(16);
      return new BigDecimal(l);
    }
    if (paramType.c() == 3)
    {
      paramc = paramType.x();
      paramType.a(16);
      return paramc;
    }
    paramc = paramc.j();
    if (paramc == null) {
      return null;
    }
    return k.e(paramc);
  }
  
  public final int a_()
  {
    return 2;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.runningtaskinfolist

 * JD-Core Version:    0.7.0.1

 */