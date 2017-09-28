package com.a.a.c.a;

import com.a.a.b;
import com.a.a.c.c;
import com.a.a.Map.k;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public final class aj
  extends x
{
  private final int c;
  private final List d;
  private final c e;
  
  public aj(c paramc, List paramList, int paramInt)
  {
    super(null, null);
    this.e = paramc;
    this.c = paramInt;
    this.d = paramList;
  }
  
  public final void a(c paramc, Object paramObject, Type paramType, Map paramMap) {}
  
  public final void a(Object paramObject1, Object paramObject2)
  {
    this.d.set(this.c, paramObject2);
    if ((this.d instanceof b))
    {
      b localb = (b)this.d;
      Object localObject = localb.b();
      if ((localObject != null) && (Array.getLength(localObject) > this.c))
      {
        paramObject1 = paramObject2;
        if (localb.c() != null) {
          paramObject1 = k.a(paramObject2, localb.c(), this.e.c());
        }
        Array.set(localObject, this.c, paramObject1);
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.aj

 * JD-Core Version:    0.7.0.1

 */