package com.a.a.c.a;

import com.a.a.runtimeexception;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;

public final class bc
  extends c
  implements aq
{
  public static final bc a = new bc();
  
  protected final Object a(com.a.a.c.c paramc, Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return null;
      if ((paramObject instanceof Date)) {
        return new Timestamp(((Date)paramObject).getTime());
      }
      if ((paramObject instanceof Number)) {
        return new Timestamp(((Number)paramObject).longValue());
      }
      if (!(paramObject instanceof String)) {
        break;
      }
      paramObject = (String)paramObject;
    } while (paramObject.length() == 0);
    paramc = paramc.a();
    try
    {
      paramc = new Timestamp(paramc.parse(paramObject).getTime());
      return paramc;
    }
    catch (ParseException paramc)
    {
      return new Timestamp(Long.parseLong(paramObject));
    }
    throw new runtimeexception("parse error");
  }
  
  public final int a_()
  {
    return 2;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.c.XhookMethod.bc

 * JD-Core Version:    0.7.0.1

 */