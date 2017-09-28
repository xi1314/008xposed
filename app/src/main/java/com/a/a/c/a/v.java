package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.Map.f;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

public final class v
  extends x
{
  private aq c;
  
  public v(Class paramClass, f paramf)
  {
    super(paramClass, paramf);
  }
  
  public final int a()
  {
    if (this.c != null) {
      return this.c.a_();
    }
    return 2;
  }
  
  public final void a(c paramc, Object paramObject, Type paramType, Map paramMap)
  {
    if (this.c == null) {
      this.c = paramc.c().a(this.a);
    }
    if ((paramType instanceof ParameterizedType)) {
      paramc.f().a(paramType);
    }
    paramType = this.c.a(paramc, e(), this.a.d());
    if (paramc.d() == 1)
    {
      paramObject = paramc.h();
      paramObject.a(this);
      paramObject.a(paramc.f());
      paramc.a(0);
      return;
    }
    if (paramObject == null)
    {
      paramMap.put(this.a.d(), paramType);
      return;
    }
    a(paramObject, paramType);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.v

 * JD-Core Version:    0.7.0.1

 */