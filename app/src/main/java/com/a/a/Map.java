package com.a.a;

import com.a.a.c.j;
import com.a.a.e.k;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Map
  extends maputils
  implements c, Serializable, Cloneable, InvocationHandler, java.util.Map
{
  private final java.util.Map e;
  
  public Map()
  {
    this(16, (byte)0);
  }
  
  public Map(int paramInt)
  {
    this(paramInt, (byte)0);
  }
  
  private Map(int paramInt, byte paramByte)
  {
    this.e = new HashMap(paramInt);
  }
  
  public Map(java.util.Map paramMap)
  {
    this.e = paramMap;
  }
  
  public final Object putkey(String paramString, Object paramObject)
  {
    return this.e.put(paramString, paramObject);
  }
  
  public void clear()
  {
    this.e.clear();
  }
  
  public Object clone()
  {
    return new Map(new HashMap(this.e));
  }
  
  public boolean containsKey(Object paramObject)
  {
    return this.e.containsKey(paramObject);
  }
  
  public boolean containsValue(Object paramObject)
  {
    return this.e.containsValue(paramObject);
  }
  
  public final Map getMap(String paramString)
  {
    paramString = this.e.get(paramString);
    if ((paramString instanceof Map)) {
      return (Map)paramString;
    }
    return (Map)a.a(paramString, j.a());
  }
  
  public final b e(String paramString)
  {
    paramString = this.e.get(paramString);
    if ((paramString instanceof b)) {
      return (b)paramString;
    }
    return (b)a.a(paramString, j.a());
  }
  
  public Set entrySet()
  {
    return this.e.entrySet();
  }
  
  public boolean equals(Object paramObject)
  {
    return this.e.equals(paramObject);
  }
  
  public final Boolean f(String paramString)
  {
    paramString = get(paramString);
    if (paramString == null) {
      return null;
    }
    return k.k(paramString);
  }
  
  public final Integer g(String paramString)
  {
    return k.j(get(paramString));
  }
  
  public Object get(Object paramObject)
  {
    return this.e.get(paramObject);
  }
  
  public final int h(String paramString)
  {
    paramString = get(paramString);
    if (paramString == null) {
      return 0;
    }
    return k.j(paramString).intValue();
  }
  
  public int hashCode()
  {
    return this.e.hashCode();
  }
  
  public final long i(String paramString)
  {
    S = get(paramString);
    if (S == null) {
      return 0L;
    }
    return k.i(paramString).longValue();
  }
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    throws Throwable
  {
    paramObject = paramMethod.getParameterTypes();
    if (paramObject.length == 1)
    {
      if (paramMethod.getReturnType() != Void.TYPE) {
        throw new runtimeexception("illegal setter");
      }
      paramObject = (maputils.b)paramMethod.getAnnotation(maputils.b.class);
      if ((paramObject == null) || (paramObject.a().length() == 0)) {
        break label410;
      }
    }
    label405:
    label410:
    for (paramObject = paramObject.a();; paramObject = null)
    {
      Object localObject = paramObject;
      if (paramObject == null)
      {
        paramObject = paramMethod.getName();
        if (!paramObject.startsWith("set")) {
          throw new runtimeexception("illegal setter");
        }
        paramObject = paramObject.substring(3);
        if (paramObject.length() == 0) {
          throw new runtimeexception("illegal setter");
        }
        localObject = Character.toLowerCase(paramObject.charAt(0)) + paramObject.substring(1);
      }
      this.e.put(localObject, paramArrayOfObject[0]);
      return null;
      if (paramObject.length == 0)
      {
        if (paramMethod.getReturnType() == Void.TYPE) {
          throw new runtimeexception("illegal getter");
        }
        paramObject = (maputils.b)paramMethod.getAnnotation(maputils.b.class);
        if ((paramObject == null) || (paramObject.a().length() == 0)) {
          break label405;
        }
      }
      for (paramObject = paramObject.a();; paramObject = null)
      {
        paramArrayOfObject = paramObject;
        if (paramObject == null)
        {
          paramObject = paramMethod.getName();
          if (!paramObject.startsWith("get")) {
            break label318;
          }
          paramObject = paramObject.substring(3);
          if (paramObject.length() == 0) {
            throw new runtimeexception("illegal getter");
          }
        }
        for (paramArrayOfObject = Character.toLowerCase(paramObject.charAt(0)) + paramObject.substring(1);; paramArrayOfObject = Character.toLowerCase(paramObject.charAt(0)) + paramObject.substring(1))
        {
          return k.a(this.e.get(paramArrayOfObject), paramMethod.getGenericReturnType(), j.a());
          label318:
          if (!paramObject.startsWith("is")) {
            break;
          }
          paramObject = paramObject.substring(2);
          if (paramObject.length() == 0) {
            throw new runtimeexception("illegal getter");
          }
        }
        throw new runtimeexception("illegal getter");
        throw new UnsupportedOperationException(paramMethod.toGenericString());
      }
    }
  }
  
  public boolean isEmpty()
  {
    return this.e.isEmpty();
  }
  
  public final String getStringfrommap(String paramname)
  {
   Object paramString = get(paramname);
    if (paramString == null) {
      return null;
    }
    return paramString.toString();
  }

  
  public Set keySet()
  {
    return this.e.keySet();
  }
  
  public void putAll(java.util.Map paramMap)
  {
    this.e.putAll(paramMap);
  }
  
  public Object remove(Object paramObject)
  {
    return this.e.remove(paramObject);
  }
  
  public int size()
  {
    return this.e.size();
  }
  
  public Collection values()
  {
    return this.e.values();
  }
}


