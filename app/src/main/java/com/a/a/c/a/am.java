package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.c.j;
import com.a.a.Map.f;
import com.a.a.Map.k;
import java.lang.reflect.Type;
import java.util.Map;

public class am
  extends x
{
  private final aq c;
  
  public am(j paramj, Class paramClass, f paramf)
  {
    super(paramClass, paramf);
    this.c = paramj.a(paramf);
  }
  
  public final int a()
  {
    return this.c.a_();
  }
  
  public final void a(c paramc, Object paramObject, Type paramType, Map paramMap)
  {
    paramType = paramc.k();
    long l;
    if (paramType.c() == 2)
    {
      l = paramType.w();
      paramType.a(16);
      if (paramObject == null) {
        paramMap.put(this.a.d(), Long.valueOf(l));
      }
    }
    for (;;)
    {
      return;
      a(paramObject, Long.valueOf(l));
      return;
      if (paramType.c() == 8)
      {
        paramc = null;
        paramType.a(16);
      }
      while ((paramc != null) || (d() != Long.TYPE))
      {
        if (paramObject != null) {
          break label124;
        }
        paramMap.put(this.a.d(), paramc);
        return;
        paramc = k.i(paramc.j());
      }
    }
    label124:
    a(paramObject, paramc);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.am

 * JD-Core Version:    0.7.0.1

 */