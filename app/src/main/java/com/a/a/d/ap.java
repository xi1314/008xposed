package com.a.a.d;

import com.a.a.maputils;
import com.a.a.runtimeexception;
import com.a.a.Map.j;
import com.a.a.f;

import java.io.IOException;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.sql.Clob;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

public class ap
{
  private final bj a;
  private final bk b;
  private List c = null;
  private List d = null;
  private List e = null;
  private List f = null;
  private int g = 0;
  private String h = "\t";
  private String i;
  private DateFormat j;
  private IdentityHashMap k = null;
  private bi l;
  
  public ap()
  {
    this(new bk(), bj.a());
  }
  
  public ap(bk parambk)
  {
    this(parambk, bj.a());
  }
  
  private ap(bk parambk, bj parambj)
  {
    this.b = parambk;
    this.a = parambj;
  }
  
  public final bb a(Class paramClass)
  {
    int n = 0;
    Object localObject4 = (bb)this.a.a(paramClass);
    Object localObject1 = localObject4;
    Object localObject5;
    Type localType;
    Object localObject2;
    if (localObject4 == null) {
      try
      {
        localObject1 = j.a(i.class, Thread.currentThread().getContextClassLoader()).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject4 = (i)((Iterator)localObject1).next();
          if ((localObject4 instanceof i))
          {
            localObject4 = (i)localObject4;
            localObject5 = ((i)localObject4).a().iterator();
            while (((Iterator)localObject5).hasNext())
            {
              localType = (Type)((Iterator)localObject5).next();
              this.a.a(localType, localObject4);
            }
          }
        }
        localObject4 = localObject2;
      }
      catch (ClassCastException localClassCastException1)
      {
        localObject2 = (bb)this.a.a(paramClass);
      }
    }
    if (localObject2 == null)
    {
      localObject5 = maputils.class.getClassLoader();
      localObject4 = localObject2;
      if (localObject5 != Thread.currentThread().getContextClassLoader()) {
        try
        {
          localObject2 = j.a(i.class, (ClassLoader)localObject5).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject4 = (i)((Iterator)localObject2).next();
            if ((localObject4 instanceof i))
            {
              localObject4 = (i)localObject4;
              localObject5 = ((i)localObject4).a().iterator();
              while (((Iterator)localObject5).hasNext())
              {
                localType = (Type)((Iterator)localObject5).next();
                this.a.a(localType, localObject4);
              }
            }
          }
          localObject3 = localObject4;
        }
        catch (ClassCastException localClassCastException2)
        {
          localObject4 = (bb)this.a.a(paramClass);
        }
      }
    }
    if (localObject4 == null)
    {
      if (!Map.class.isAssignableFrom(paramClass)) {
        break label339;
      }
      this.a.a(paramClass, aw.a);
    }
    for (;;)
    {
      localObject3 = (bb)this.a.a(paramClass);
      return localObject3;
      label339:
      if (List.class.isAssignableFrom(paramClass))
      {
        this.a.a(paramClass, as.a);
      }
      else if (Collection.class.isAssignableFrom(paramClass))
      {
        this.a.a(paramClass, v.a);
      }
      else if (Date.class.isAssignableFrom(paramClass))
      {
        this.a.a(paramClass, y.a);
      }
      else if (com.a.a.c.class.isAssignableFrom(paramClass))
      {
        this.a.a(paramClass, ao.a);
      }
      else if (f.class.isAssignableFrom(paramClass))
      {
        this.a.a(paramClass, aq.a);
      }
      else if ((paramClass.isEnum()) || ((paramClass.getSuperclass() != null) && (paramClass.getSuperclass().isEnum())))
      {
        this.a.a(paramClass, ab.a);
      }
      else if (paramClass.isArray())
      {
        localObject3 = paramClass.getComponentType();
        localObject4 = a((Class)localObject3);
        this.a.a(paramClass, new c((Class)localObject3, (bb)localObject4));
      }
      else if (Throwable.class.isAssignableFrom(paramClass))
      {
        this.a.a(paramClass, new ad(paramClass));
      }
      else if (TimeZone.class.isAssignableFrom(paramClass))
      {
        this.a.a(paramClass, bp.a);
      }
      else if (Appendable.class.isAssignableFrom(paramClass))
      {
        this.a.a(paramClass, b.a);
      }
      else if (Charset.class.isAssignableFrom(paramClass))
      {
        this.a.a(paramClass, s.a);
      }
      else if (Enumeration.class.isAssignableFrom(paramClass))
      {
        this.a.a(paramClass, ac.a);
      }
      else if (Calendar.class.isAssignableFrom(paramClass))
      {
        this.a.a(paramClass, p.a);
      }
      else
      {
        if (!Clob.class.isAssignableFrom(paramClass)) {
          break;
        }
        this.a.a(paramClass, u.a);
      }
    }
    Object localObject3 = paramClass.getInterfaces();
    int i1 = localObject3.length;
    int m = 0;
    label728:
    if (m < i1)
    {
      localObject4 = localObject3[m];
      if (((Class)localObject4).getName().equals("net.sf.cglib.proxy.Factory")) {
        m = 1;
      }
    }
    for (;;)
    {
      if ((m != 0) || (n != 0))
      {
        localObject3 = a(paramClass.getSuperclass());
        this.a.a(paramClass, localObject3);
        return localObject3;
        if (((Class)localObject4).getName().equals("javassist.util.proxy.ProxyObject"))
        {
          m = 0;
          n = 1;
          continue;
        }
        m += 1;
        break label728;
      }
      if (Proxy.isProxyClass(paramClass))
      {
        this.a.a(paramClass, this.a.a(paramClass));
        break;
      }
      this.a.a(paramClass, this.a.a(paramClass));
      break;
      m = 0;
    }
  }
  
  public final DateFormat a()
  {
    if ((this.j == null) && (this.i != null)) {
      this.j = new SimpleDateFormat(this.i);
    }
    return this.j;
  }
  
  public final void a(bi parambi)
  {
    this.l = parambi;
  }
  
  public final void a(bi parambi, Object paramObject1, Object paramObject2)
  {
    if (b(bl.o)) {
      return;
    }
    this.l = new bi(parambi, paramObject1, paramObject2);
    if (this.k == null) {
      this.k = new IdentityHashMap();
    }
    this.k.put(paramObject1, this.l);
  }
  
  public final void a(bl parambl)
  {
    this.b.a(parambl);
  }
  
  public final void a(Object paramObject, String paramString)
  {
    if ((paramObject instanceof Date))
    {
      DateFormat localDateFormat = a();
      Object localObject = localDateFormat;
      if (localDateFormat == null) {
        localObject = new SimpleDateFormat(paramString);
      }
      paramObject = ((DateFormat)localObject).format((Date)paramObject);
      this.b.a(paramObject);
      return;
    }
    c(paramObject);
  }
  
  public final void a(String paramString)
  {
    bo localbo = bo.a;
    bo.a(this, paramString);
  }
  
  public final boolean a(Object paramObject)
  {
    if (this.k == null) {
      return false;
    }
    return this.k.containsKey(paramObject);
  }
  
  public final boolean a(Type paramType)
  {
    if (!this.b.b(bl.n)) {}
    for (;;)
    {
      return false;
      if ((paramType == null) && (b(bl.s))) {
        if (this.l.a() != null) {
          break label47;
        }
      }
      label47:
      for (int m = 1; m == 0; m = 0) {
        return true;
      }
    }
  }
  
  public final bi b()
  {
    return this.l;
  }
  
  public final void b(Object paramObject)
  {
    bi localbi2 = this.l;
    if (paramObject == localbi2.b())
    {
      this.b.write("{\"$ref\":\"@\"}");
      return;
    }
    bi localbi3 = localbi2.a();
    bi localbi1 = localbi2;
    if (localbi3 != null)
    {
      localbi1 = localbi2;
      if (paramObject == localbi3.b())
      {
        this.b.write("{\"$ref\":\"..\"}");
        return;
      }
    }
    while (localbi1.a() != null) {
      localbi1 = localbi1.a();
    }
    if (paramObject == localbi1.b())
    {
      this.b.write("{\"$ref\":\"$\"}");
      return;
    }
    if (this.k == null) {}
    for (paramObject = null;; paramObject = (bi)this.k.get(paramObject))
    {
      paramObject = paramObject.c();
      this.b.write("{\"$ref\":\"");
      this.b.write(paramObject);
      this.b.write("\"}");
      return;
    }
  }
  
  public final boolean b(bl parambl)
  {
    return this.b.b(parambl);
  }
  
  public final List c()
  {
    return this.d;
  }
  
  public final void c(Object paramObject)
  {
    if (paramObject == null)
    {
      this.b.a();
      return;
    }
    bb localbb = a(paramObject.getClass());
    try
    {
      localbb.a(this, paramObject, null, null);
      return;
    }
    catch (IOException paramObject)
    {
      throw new runtimeexception(paramObject.getMessage(), paramObject);
    }
  }
  
  public final void d()
  {
    this.g += 1;
  }
  
  public final void e()
  {
    this.g -= 1;
  }
  
  public final void f()
  {
    this.b.a('\n');
    int m = 0;
    while (m < this.g)
    {
      this.b.write(this.h);
      m += 1;
    }
  }
  
  public final List g()
  {
    return this.e;
  }
  
  public final List h()
  {
    return this.f;
  }
  
  public final List i()
  {
    return this.c;
  }
  
  public final bk j()
  {
    return this.b;
  }
  
  public final void k()
  {
    this.b.a();
  }
  
  public String toString()
  {
    return this.b.toString();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.ap

 * JD-Core Version:    0.7.0.1

 */