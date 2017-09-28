package com.a.a.c.a;

import com.a.a.c.f;
import com.a.a.runtimeexception;

import java.text.ParseException;

public final class av
  extends c
  implements aq
{
  public static final av a = new av();
  
  protected final Object a(com.a.a.c.c paramc, Object paramObject)
  {
    if (paramObject == null) {}
    String str;
    do
    {
      return null;
      if ((paramObject instanceof java.util.Date)) {
        return new java.sql.Date(((java.util.Date)paramObject).getTime());
      }
      if ((paramObject instanceof Number)) {
        return new java.sql.Date(((Number)paramObject).longValue());
      }
      if (!(paramObject instanceof String)) {
        break;
      }
      str = (String)paramObject;
    } while (str.length() == 0);
    paramObject = new f(str);
    try
    {
      long l;
      if (paramObject.z()) {
        l = paramObject.o().getTimeInMillis();
      }
      for (;;)
      {
        return new java.sql.Date(l);
        paramc = paramc.a();
        try
        {
          paramc = new java.sql.Date(paramc.parse(str).getTime());
          return paramc;
        }
        catch (ParseException paramc)
        {
          l = Long.parseLong(str);
        }
      }
      throw new runtimeexception("parse error : " + paramObject);
    }
    finally
    {
      paramObject.close();
    }
  }
  
  public final int a_()
  {
    return 2;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.c.XhookMethod.av

 * JD-Core Version:    0.7.0.1

 */