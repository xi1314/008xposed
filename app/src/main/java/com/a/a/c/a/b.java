package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.c.e;
import com.a.a.c.j;
import com.a.a.Map.f;
import com.a.a.runtimeexception;

import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;

public abstract class b
  implements aq
{
  protected a a;
  
  public static x a(j paramj, Class paramClass, f paramf)
  {
    return paramj.a(paramj, paramClass, paramf);
  }
  
  public abstract Object a();
  
  public final boolean a(c paramc, String paramString, Object paramObject, Type paramType, Map paramMap)
  {
    e locale = paramc.k();
    Object localObject2 = this.a.b();
    x localx = (x)((Map)localObject2).get(paramString);
    Object localObject1 = localx;
    if (localx == null)
    {
      localObject2 = ((Map)localObject2).entrySet().iterator();
      do
      {
        localObject1 = localx;
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
        localObject1 = (Map.Entry)((Iterator)localObject2).next();
      } while (!((String)((Map.Entry)localObject1).getKey()).equalsIgnoreCase(paramString));
      localObject1 = (x)((Map.Entry)localObject1).getValue();
    }
    if (localObject1 == null)
    {
      if (!paramc.a(com.a.a.c.d.i)) {
        throw new runtimeexception("setter not found, class " + this.a.getClass() + ", property " + paramString);
      }
      locale.b();
      paramc.j();
      return false;
    }
    locale.b(((x)localObject1).a());
    ((x)localObject1).a(paramc, paramObject, paramType, paramMap);
    return true;
  }
  
  public final a b()
  {
    return this.a;
  }
  
  public final class a
    extends ah
  {
    public final x a(j paramj, Class paramClass, f paramf)
    {
      b localb = this.a;
      return b.a(paramj, paramClass, paramf);
    }
    
    public final boolean a(c paramc, String paramString, Object paramObject, Type paramType, Map paramMap)
    {
      return this.a.a(paramc, paramString, paramObject, paramType, paramMap);
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.Inttolong

 * JD-Core Version:    0.7.0.1

 */