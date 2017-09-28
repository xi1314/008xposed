package com.a.a.c.a;

import com.a.a.c.f;
import com.a.a.runtimeexception;

import java.text.ParseException;
import java.util.Date;

public final class t
  extends c
  implements aq
{
  public static final t a = new t();
  
  protected final Object a(com.a.a.c.c paramc, Object paramObject)
  {
    Object localObject;
    if (paramObject == null) {
      localObject = null;
    }
    do
    {
      return localObject;
      localObject = paramObject;
    } while ((paramObject instanceof Date));
    if ((paramObject instanceof Number)) {
      return new Date(((Number)paramObject).longValue());
    }
    if ((paramObject instanceof String))
    {
      paramObject = (String)paramObject;
      if (paramObject.length() == 0) {
        return null;
      }
      localObject = new f(paramObject);
      try
      {
        if (((f)localObject).b(false))
        {
          paramc = ((f)localObject).o().getTime();
          ((f)localObject).close();
          return paramc;
        }
        ((f)localObject).close();
        paramc = paramc.a();
        throw new runtimeexception("parse error");
      }
      finally
      {
        try
        {
          paramc = paramc.parse(paramObject);
          return paramc;
        }
        catch (ParseException paramc)
        {
          return new Date(Long.parseLong(paramObject));
        }
        paramc = finally;
        ((f)localObject).close();
      }
    }
  }
  
  public final int a_()
  {
    return 2;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.c.XhookMethod.t

 * JD-Core Version:    0.7.0.1

 */