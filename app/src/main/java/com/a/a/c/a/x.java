package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.runtimeexception;
import com.a.a.Map.f;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public abstract class x
{
  protected final f a;
  protected final Class b;
  
  public x(Class paramClass, f paramf)
  {
    this.b = paramClass;
    this.a = paramf;
  }
  
  public int a()
  {
    return 0;
  }
  
  public abstract void a(c paramc, Object paramObject, Type paramType, Map paramMap);
  
  public void a(Object paramObject1, Object paramObject2)
  {
    Object localObject = this.a.e();
    if (localObject != null)
    {
      try
      {
        if (!this.a.h()) {
          break label246;
        }
        if (this.a.b() == AtomicInteger.class)
        {
          paramObject1 = (AtomicInteger)((Method)localObject).invoke(paramObject1, new Object[0]);
          if (paramObject1 == null) {
            return;
          }
          paramObject1.set(((AtomicInteger)paramObject2).get());
          return;
        }
        if (this.a.b() == AtomicLong.class)
        {
          paramObject1 = (AtomicLong)((Method)localObject).invoke(paramObject1, new Object[0]);
          if (paramObject1 == null) {
            return;
          }
          paramObject1.set(((AtomicLong)paramObject2).get());
          return;
        }
      }
      catch (Exception paramObject1)
      {
        throw new runtimeexception("set property error, " + this.a.d(), paramObject1);
      }
      if (this.a.b() == AtomicBoolean.class)
      {
        paramObject1 = (AtomicBoolean)((Method)localObject).invoke(paramObject1, new Object[0]);
        if (paramObject1 != null) {
          paramObject1.set(((AtomicBoolean)paramObject2).get());
        }
      }
      else if (Map.class.isAssignableFrom(((Method)localObject).getReturnType()))
      {
        paramObject1 = (Map)((Method)localObject).invoke(paramObject1, new Object[0]);
        if (paramObject1 != null) {
          paramObject1.putAll((Map)paramObject2);
        }
      }
      else
      {
        paramObject1 = (Collection)((Method)localObject).invoke(paramObject1, new Object[0]);
        if (paramObject1 != null)
        {
          paramObject1.addAll((Collection)paramObject2);
          return;
          label246:
          ((Method)localObject).invoke(paramObject1, new Object[] { paramObject2 });
        }
      }
    }
    else
    {
      localObject = this.a.f();
      if (localObject != null) {
        try
        {
          ((Field)localObject).set(paramObject1, paramObject2);
          return;
        }
        catch (Exception paramObject1)
        {
          throw new runtimeexception("set property error, " + this.a.d(), paramObject1);
        }
      }
    }
  }
  
  public final void a(Object paramObject, boolean paramBoolean)
  {
    a(paramObject, Boolean.valueOf(paramBoolean));
  }
  
  public final Method b()
  {
    return this.a.e();
  }
  
  public final Field c()
  {
    return this.a.f();
  }
  
  public final Class d()
  {
    return this.a.b();
  }
  
  public final Type e()
  {
    return this.a.c();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.x

 * JD-Core Version:    0.7.0.1

 */