package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.Map.f;
import com.a.a.Map.k;
import java.lang.reflect.Type;
import java.util.Map;

public class ae
  extends x
{
  public ae(Class paramClass, f paramf)
  {
    super(paramClass, paramf);
  }
  
  public final int a()
  {
    return 2;
  }
  
  public final void a(c paramc, Object paramObject, Type paramType, Map paramMap)
  {
    paramType = paramc.k();
    int i;
    if (paramType.c() == 2)
    {
      i = paramType.p();
      paramType.a(16);
      if (paramObject == null) {
        paramMap.put(this.a.d(), Integer.valueOf(i));
      }
    }
    for (;;)
    {
      return;
      a(paramObject, Integer.valueOf(i));
      return;
      if (paramType.c() == 8)
      {
        paramc = null;
        paramType.a(16);
      }
      while ((paramc != null) || (d() != Integer.TYPE))
      {
        if (paramObject != null) {
          break label124;
        }
        paramMap.put(this.a.d(), paramc);
        return;
        paramc = k.j(paramc.j());
      }
    }
    label124:
    a(paramObject, paramc);
  }
}


