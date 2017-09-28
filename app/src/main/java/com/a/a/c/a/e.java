package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.c.g;
import com.a.a.c.i;
import com.a.a.Map.f;
import com.a.a.runtimeexception;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class e
  extends x
{
  private final Type c;
  private int d;
  private aq e;
  
  public e(Class paramClass, f paramf)
  {
    super(paramClass, paramf);
    if ((e() instanceof ParameterizedType))
    {
      this.c = ((ParameterizedType)e()).getActualTypeArguments()[0];
      return;
    }
    this.c = Object.class;
  }
  
  private void a(c paramc, Type paramType, Collection paramCollection)
  {
    Object localObject2 = this.c;
    Object localObject3 = this.e;
    Object localObject1 = localObject2;
    TypeVariable localTypeVariable;
    ParameterizedType localParameterizedType;
    if ((localObject2 instanceof TypeVariable))
    {
      localObject1 = localObject2;
      if ((paramType instanceof ParameterizedType))
      {
        localTypeVariable = (TypeVariable)localObject2;
        localParameterizedType = (ParameterizedType)paramType;
        if (!(localParameterizedType.getRawType() instanceof Class)) {
          break label429;
        }
      }
    }
    label429:
    for (localObject1 = (Class)localParameterizedType.getRawType();; localObject1 = null)
    {
      int i;
      if (localObject1 != null)
      {
        int j = ((Class)localObject1).getTypeParameters().length;
        i = 0;
        if (i < j) {
          if (!localObject1.getTypeParameters()[i].getName().equals(localTypeVariable.getName())) {}
        }
      }
      for (;;)
      {
        localObject1 = localObject2;
        if (i != -1)
        {
          localObject2 = localParameterizedType.getActualTypeArguments()[i];
          localObject1 = localObject2;
          if (!localObject2.equals(this.c))
          {
            localObject3 = paramc.c().a((Type)localObject2);
            localObject1 = localObject2;
          }
        }
        for (localObject2 = localObject3;; localObject2 = localObject3)
        {
          localObject3 = paramc.k();
          if (((com.a.a.c.e)localObject3).c() != 14)
          {
            paramCollection = "exepct '[', but " + g.a(((com.a.a.c.e)localObject3).c());
            paramc = paramCollection;
            if (paramType != null) {
              paramc = paramCollection + ", type : " + paramType;
            }
            throw new runtimeexception(paramc);
            i += 1;
            break;
          }
          paramType = (Type)localObject2;
          if (localObject2 == null)
          {
            paramType = paramc.c().a((Type)localObject1);
            this.e = paramType;
            this.d = this.e.a_();
          }
          ((com.a.a.c.e)localObject3).a(this.d);
          i = 0;
          for (;;)
          {
            if (((com.a.a.c.e)localObject3).a(com.a.a.c.d.g)) {
              while (((com.a.a.c.e)localObject3).c() == 16) {
                ((com.a.a.c.e)localObject3).a();
              }
            }
            if (((com.a.a.c.e)localObject3).c() == 15) {
              break;
            }
            paramCollection.add(paramType.a(paramc, (Type)localObject1, Integer.valueOf(i)));
            paramc.a(paramCollection);
            if (((com.a.a.c.e)localObject3).c() == 16) {
              ((com.a.a.c.e)localObject3).a(this.d);
            }
            i += 1;
          }
          ((com.a.a.c.e)localObject3).a(16);
          return;
        }
        i = -1;
      }
    }
  }
  
  public final int a()
  {
    return 14;
  }
  
  public final void a(c paramc, Object paramObject, Type paramType, Map paramMap)
  {
    if (paramc.k().c() == 8)
    {
      a(paramObject, null);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    i locali = paramc.f();
    paramc.a(locali, paramObject, this.a.d());
    a(paramc, paramType, localArrayList);
    paramc.a(locali);
    if (paramObject == null)
    {
      paramMap.put(this.a.d(), localArrayList);
      return;
    }
    a(paramObject, localArrayList);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.packageinfolist

 * JD-Core Version:    0.7.0.1

 */