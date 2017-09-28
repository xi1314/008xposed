package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.c.j;
import com.a.a.Map.f;
import java.lang.reflect.Type;
import java.util.Map;

public class ay
  extends x
{
  private final aq c;
  
  public ay(j paramj, Class paramClass, f paramf)
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
    if (paramType.c() == 4)
    {
      paramc = paramType.s();
      paramType.a(16);
    }
    while (paramObject == null)
    {
      paramMap.put(this.a.d(), paramc);
      return;
      paramc = paramc.j();
      if (paramc == null) {
        paramc = null;
      } else {
        paramc = paramc.toString();
      }
    }
    a(paramObject, paramc);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.ay

 * JD-Core Version:    0.7.0.1

 */