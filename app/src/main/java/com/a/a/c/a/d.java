package com.a.a.c.a;

import com.a.a.b;
import com.a.a.c.c;
import com.a.a.c.e;
import com.a.a.Map.k;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

public final class d
  implements aq
{
  public static final d a = new d();
  
  private Object a(c paramc, Class paramClass, b paramb)
  {
    if (paramb == null) {
      return null;
    }
    int m = paramb.size();
    Object localObject3 = Array.newInstance(paramClass, m);
    int i = 0;
    Object localObject2;
    while (i < m)
    {
      localObject2 = paramb.get(i);
      if (localObject2 == paramb)
      {
        Array.set(localObject3, i, localObject3);
        i += 1;
      }
      else
      {
        if (paramClass.isArray())
        {
          if (paramClass.isInstance(localObject2)) {}
          for (localObject1 = localObject2;; localObject1 = a(paramc, paramClass, (b)localObject2))
          {
            Array.set(localObject3, i, localObject1);
            break;
          }
        }
        if (!(localObject2 instanceof b)) {
          break label236;
        }
        localObject1 = (b)localObject2;
        int n = ((b)localObject1).size();
        int j = 0;
        int k = 0;
        while (j < n)
        {
          if (((b)localObject1).get(j) == paramb)
          {
            ((b)localObject1).set(i, localObject3);
            k = 1;
          }
          j += 1;
        }
        if (k == 0) {
          break label236;
        }
      }
    }
    label236:
    for (Object localObject1 = ((b)localObject1).toArray();; localObject1 = null)
    {
      if (localObject1 == null) {
        localObject1 = k.a(localObject2, paramClass, paramc.c());
      }
      for (;;)
      {
        Array.set(localObject3, i, localObject1);
        break;
        paramb.b(localObject3);
        paramb.a(paramClass);
        return localObject3;
      }
    }
  }
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    Object localObject = paramc.k();
    if (((e)localObject).c() == 8)
    {
      ((e)localObject).a(16);
      return null;
    }
    if (((e)localObject).c() == 4)
    {
      paramc = ((e)localObject).q();
      ((e)localObject).a(16);
      return paramc;
    }
    if ((paramType instanceof GenericArrayType))
    {
      paramType = ((GenericArrayType)paramType).getGenericComponentType();
      if ((paramType instanceof TypeVariable))
      {
        localObject = (TypeVariable)paramType;
        paramType = paramc.f().a();
        if ((paramType instanceof ParameterizedType))
        {
          ParameterizedType localParameterizedType = (ParameterizedType)paramType;
          paramType = localParameterizedType.getRawType();
          if (!(paramType instanceof Class)) {
            break label249;
          }
          TypeVariable[] arrayOfTypeVariable = ((Class)paramType).getTypeParameters();
          paramType = null;
          int i = 0;
          while (i < arrayOfTypeVariable.length)
          {
            if (arrayOfTypeVariable[i].getName().equals(((TypeVariable)localObject).getName())) {
              paramType = localParameterizedType.getActualTypeArguments()[i];
            }
            i += 1;
          }
        }
      }
    }
    for (;;)
    {
      if ((paramType instanceof Class)) {
        paramType = (Class)paramType;
      }
      for (;;)
      {
        localObject = new b();
        paramc.a(paramType, (Collection)localObject, paramObject);
        return a(paramc, paramType, (b)localObject);
        paramType = Object.class;
        continue;
        paramType = Object.class;
        continue;
        paramType = (Class)paramType;
        continue;
        paramType = ((Class)paramType).getComponentType();
      }
      label249:
      paramType = null;
    }
  }
  
  public final int a_()
  {
    return 14;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.getMap

 * JD-Core Version:    0.7.0.1

 */