package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.c.f;
import com.a.a.runtimeexception;

import java.lang.reflect.Type;
import java.sql.Time;

public final class ba
  implements aq
{
  public static final ba a = new ba();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    paramType = paramc.k();
    long l;
    if (paramType.c() == 16)
    {
      paramType.a(4);
      if (paramType.c() != 4) {
        throw new runtimeexception("syntax error");
      }
      paramType.b(2);
      if (paramType.c() != 2) {
        throw new runtimeexception("syntax error");
      }
      l = paramType.w();
      paramType.a(13);
      if (paramType.c() != 13) {
        throw new runtimeexception("syntax error");
      }
      paramType.a(16);
      paramc = new Time(l);
    }
    do
    {
      return paramc;
      paramType = paramc.j();
      if (paramType == null) {
        return null;
      }
      paramc = paramType;
    } while ((paramType instanceof Time));
    if ((paramType instanceof Number)) {
      return new Time(((Number)paramType).longValue());
    }
    if ((paramType instanceof String))
    {
      paramc = (String)paramType;
      if (paramc.length() == 0) {
        return null;
      }
      paramType = new f(paramc);
      if (paramType.z()) {}
      for (l = paramType.o().getTimeInMillis();; l = Long.parseLong(paramc))
      {
        paramType.close();
        return new Time(l);
      }
    }
    throw new runtimeexception("parse error");
  }
  
  public final int a_()
  {
    return 2;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.ba

 * JD-Core Version:    0.7.0.1

 */