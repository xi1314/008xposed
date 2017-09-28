package com.a.a.c.a;

import com.a.a.maputils;
import com.a.a.c.e;
import com.a.a.c.f;
import com.a.a.Map.k;
import com.a.a.runtimeexception;

import java.lang.reflect.Type;

public abstract class c
  implements aq
{
  protected abstract Object a(com.a.a.c.c paramc, Object paramObject);
  
  public final Object a(com.a.a.c.c paramc, Type paramType, Object paramObject)
  {
    Object localObject = paramc.k();
    if (((e)localObject).c() == 2)
    {
      paramType = Long.valueOf(((e)localObject).w());
      ((e)localObject).a(16);
    }
    for (;;)
    {
      return a(paramc, paramType);
      if (((e)localObject).c() == 4)
      {
        paramObject = ((e)localObject).s();
        ((e)localObject).a(16);
        paramType = paramObject;
        if (((e)localObject).a(com.a.a.c.d.f))
        {
          localObject = new f(paramObject);
          paramType = paramObject;
          if (((f)localObject).z()) {
            paramType = ((f)localObject).o().getTime();
          }
          ((f)localObject).close();
        }
      }
      else if (((e)localObject).c() == 8)
      {
        ((e)localObject).a();
        paramType = null;
      }
      else if (((e)localObject).c() == 12)
      {
        ((e)localObject).a();
        if (((e)localObject).c() == 4)
        {
          paramType = ((e)localObject).s();
          if (maputils.a.equals(paramType))
          {
            ((e)localObject).a();
            paramc.b(17);
            k.a(((e)localObject).s());
            paramc.b(4);
            paramc.b(16);
          }
          ((e)localObject).b(2);
          if (((e)localObject).c() == 2)
          {
            long l = ((e)localObject).w();
            ((e)localObject).a();
            paramType = Long.valueOf(l);
            paramc.b(13);
          }
        }
        else
        {
          throw new runtimeexception("syntax error");
        }
        throw new runtimeexception("syntax error : " + ((e)localObject).d());
      }
      else if (paramc.d() == 2)
      {
        paramc.a(0);
        paramc.b(16);
        if (((e)localObject).c() == 4)
        {
          if (!"val".equals(((e)localObject).s())) {
            throw new runtimeexception("syntax error");
          }
          ((e)localObject).a();
          paramc.b(17);
          paramType = paramc.j();
          paramc.b(13);
        }
        else
        {
          throw new runtimeexception("syntax error");
        }
      }
      else
      {
        paramType = paramc.j();
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.saveaccountdatatoFile

 * JD-Core Version:    0.7.0.1

 */