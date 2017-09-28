package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.Map.f;
import com.a.a.Map.k;
import java.lang.reflect.Type;
import java.util.Map;

public final class l
  extends x
{
  public l(Class paramClass, f paramf)
  {
    super(paramClass, paramf);
  }
  
  public final int a()
  {
    return 6;
  }
  
  public final void a(c paramc, Object paramObject, Type paramType, Map paramMap)
  {
    boolean bool = true;
    paramType = paramc.k();
    if (paramType.c() == 6)
    {
      paramType.a(16);
      if (paramObject == null) {
        paramMap.put(this.a.d(), Boolean.TRUE);
      }
    }
    do
    {
      do
      {
        return;
        a(paramObject, true);
        return;
        if (paramType.c() == 2)
        {
          int i = paramType.p();
          paramType.a(16);
          if (i == 1) {}
          while (paramObject == null)
          {
            paramMap.put(this.a.d(), Boolean.valueOf(bool));
            return;
            bool = false;
          }
          a(paramObject, bool);
          return;
        }
        if (paramType.c() != 8) {
          break;
        }
        paramType.a(16);
      } while ((d() == Boolean.TYPE) || (paramObject == null));
      a(paramObject, null);
      return;
      if (paramType.c() == 7)
      {
        paramType.a(16);
        if (paramObject == null)
        {
          paramMap.put(this.a.d(), Boolean.FALSE);
          return;
        }
        a(paramObject, false);
        return;
      }
      paramc = k.k(paramc.j());
    } while ((paramc == null) && (d() == Boolean.TYPE));
    if (paramObject == null)
    {
      paramMap.put(this.a.d(), paramc);
      return;
    }
    a(paramObject, paramc);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.l

 * JD-Core Version:    0.7.0.1

 */