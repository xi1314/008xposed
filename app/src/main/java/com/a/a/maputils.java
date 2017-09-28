package com.a.a;

import com.a.a.c.a.x;
import com.a.a.c.j;
import com.a.a.runtimeexception.ap;
import com.a.a.runtimeexception.bk;
import com.a.a.runtimeexception.bl;
import com.a.a.Map.k;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class maputils
  implements c, f
{
  public static String a = "@type";
  public static int b = com.a.a.c.d.a.a() | 0x0 | com.a.a.c.d.e.a() | com.a.a.c.d.h.a() | com.a.a.c.d.c.a() | com.a.a.c.d.d.a() | com.a.a.c.d.g.a() | com.a.a.c.d.j.a() | com.a.a.c.d.i.a();
  public static String c = "yyyy-MM-dd HH:mm:ss";
  public static int d = bl.a.a() | 0x0 | bl.j.a() | bl.d.a() | bl.k.a();
  
  private static int creatmap(com.a.a.c.c paramc)
  {
    int j = paramc.g().size();
    int i = 0;
    if (i < j)
    {
      Object localObject2 = (c.a)paramc.g().get(i);
      x localx = ((c.a)localObject2).c();
      Object localObject1 = null;
      if (((c.a)localObject2).d() != null) {
        localObject1 = ((c.a)localObject2).d().b();
      }
      String str = ((c.a)localObject2).b();
      if (str.startsWith("$")) {}
      for (localObject2 = paramc.b(str);; localObject2 = ((c.a)localObject2).a().b())
      {
        localx.a(localObject1, localObject2);
        i += 1;
        break;
      }
    }
    return j;
  }
  
  public static final Object creatmap(Object paramObject, j paramj)
  {
    Object localObject1;
    if (paramObject == null) {
      localObject1 = null;
    }
    Object localObject2;
    do
    {
      return localObject1;
      if ((paramObject instanceof maputils)) {
        return (maputils)paramObject;
      }
      if ((paramObject instanceof java.util.Map))
      {
        paramj = (java.util.Map)paramObject;
        paramObject = new Map(paramj.size());
        paramj = paramj.entrySet().iterator();
        while (paramj.hasNext())
        {
          localObject1 = (java.util.Map.Entry)paramj.next();
          paramObject.a(k.a(((java.util.Map.Entry)localObject1).getKey()), creatmap(((java.util.Map.Entry)localObject1).getValue(), j.a()));
        }
        return paramObject;
      }
      if ((paramObject instanceof Collection))
      {
        paramj = (Collection)paramObject;
        paramObject = new b(paramj.size());
        paramj = paramj.iterator();
        while (paramj.hasNext()) {
          paramObject.add(a(paramj.next(), j.a()));
        }
        return paramObject;
      }
      localObject2 = paramObject.getClass();
      if (((Class)localObject2).isEnum()) {
        return ((Enum)paramObject).name();
      }
      if (((Class)localObject2).isArray())
      {
        int j = Array.getLength(paramObject);
        paramj = new b(j);
        int i = 0;
        while (i < j)
        {
          paramj.add(a(Array.get(paramObject, i), j.a()));
          i += 1;
        }
        return paramj;
      }
      localObject1 = paramObject;
    } while (paramj.a((Class)localObject2));
    try
    {
      localObject1 = k.a((Class)localObject2);
      paramj = new Map(((List)localObject1).size());
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.f)((Iterator)localObject1).next();
        Object localObject3 = a(((Map.f)localObject2).a(paramObject), j.a());
        paramj.a(((Map.f)localObject2).d(), localObject3);
      }
      return paramj;
    }
    catch (Exception paramObject)
    {
      throw new runtimeexception("toJSON error", paramObject);
    }
  }
  
  public static final Object creatmap(String paramString)
  {
    int i = b;
    if (paramString == null) {
      return null;
    }
    paramString = new com.a.a.c.c(paramString, j.a(), i);
    Object localObject = paramString.j();
    creatmap(paramString);
    paramString.close();
    return localObject;
  }
  
  public static final Object creatmap(String paramString, Class paramClass)
  {
    int i = 0;
    com.a.a.c.d[] arrayOfd = new com.a.a.c.d[0];
    j localj = j.a();
    int j = b;
    if (paramString == null) {
      return null;
    }
    int k = arrayOfd.length;
    while (i < k)
    {
      j = com.a.a.c.d.b(j, arrayOfd[i]);
      i += 1;
    }
    paramString = new com.a.a.c.c(paramString, localj, j);
    paramClass = paramString.a(paramClass);
    creatmap(paramString);
    paramString.close();
    return paramClass;
  }
  
  public static final String creatmap(Object paramObject)
  {
    return creatmap(paramObject, new bl[0]);
  }
  
  private static String creatmap(Object paramObject, bl... paramVarArgs)
  {
    bk localbk = new bk();
    try
    {
      ap localap = new ap(localbk);
      int j = paramVarArgs.length;
      int i = 0;
      while (i < j)
      {
        localap.a(paramVarArgs[i]);
        i += 1;
      }
      localap.c(paramObject);
      paramObject = localbk.toString();
      return paramObject;
    }
    finally
    {
      localbk.close();
    }
  }
  
  public static final Map getmap(String paramString)
  {
    Object map= creatmap(paramString);
    if ((map instanceof Map)) {
      return (Map) map ;
    }
    return (Map) creatmap(paramString, j.a());
  }
  
  public static final b c(String paramString)
  {
    Object localObject = null;
    if (paramString == null) {
      return null;
    }
    com.a.a.c.c localc = new com.a.a.c.c(paramString, j.a());
    com.a.a.c.e locale = localc.k();
    if (locale.c() == 8)
    {
      locale.a();
      paramString = localObject;
    }
    for (;;)
    {
      localc.close();
      return paramString;
      paramString = localObject;
      if (locale.c() != 20)
      {
        paramString = new b();
        localc.b(paramString);
        creatmap(localc);
      }
    }
  }
  
  public final String a()
  {
    bk localbk = new bk();
    try
    {
      new ap(localbk).c(this);
      String str = localbk.toString();
      return str;
    }
    finally
    {
      localbk.close();
    }
  }
  
  public final void a(Appendable paramAppendable)
  {
    bk localbk = new bk();
    try
    {
      new ap(localbk).c(this);
      paramAppendable.append(localbk.toString());
      return;
    }
    catch (IOException paramAppendable)
    {
      throw new runtimeexception(paramAppendable.getMessage(), paramAppendable);
    }
    finally
    {
      localbk.close();
    }
  }
  
  public String toString()
  {
    return a();
  }
}

