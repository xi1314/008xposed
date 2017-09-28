package com.a.a.e;

import com.a.a.maputils.a;
import com.a.a.maputils.b;
import com.a.a.runtimeexception;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class e
{
  private final Class a;
  private Constructor b;
  private Constructor c;
  private Method d;
  private final List e = new ArrayList();
  
  private e(Class paramClass)
  {
    this.a = paramClass;
  }
  
  public static e a(Class paramClass, Type paramType)
  {
    e locale = new e(paramClass);
    Object localObject1;
    label41:
    Object localObject3;
    int j;
    int i;
    Object localObject4;
    Object localObject5;
    Object localObject2;
    if (Modifier.isAbstract(paramClass.getModifiers()))
    {
      localObject1 = null;
      if (localObject1 != null)
      {
        ((Constructor)localObject1).setAccessible(true);
        locale.b = ((Constructor)localObject1);
        localObject3 = paramClass.getMethods();
        j = localObject3.length;
        i = 0;
        for (;;)
        {
          if (i >= j) {
            break label1063;
          }
          localObject4 = localObject3[i];
          localObject5 = ((Method)localObject4).getName();
          if ((((String)localObject5).length() >= 4) && (!Modifier.isStatic(((Method)localObject4).getModifiers())) && ((((Method)localObject4).getReturnType().equals(Void.TYPE)) || (((Method)localObject4).getReturnType().equals(paramClass))) && (((Method)localObject4).getParameterTypes().length == 1))
          {
            localObject2 = (b)((Method)localObject4).getAnnotation(b.class);
            localObject1 = localObject2;
            if (localObject2 == null) {
              localObject1 = k.a(paramClass, (Method)localObject4);
            }
            if (localObject1 == null) {
              break;
            }
            if (((b)localObject1).d())
            {
              if (((b)localObject1).a().length() == 0) {
                break;
              }
              locale.a(new f(((b)localObject1).a(), (Method)localObject4, null, paramClass, paramType));
              ((Method)localObject4).setAccessible(true);
            }
          }
          i += 1;
        }
      }
    }
    else
    {
      localObject1 = paramClass.getDeclaredConstructors();
      j = localObject1.length;
      i = 0;
      label237:
      if (i >= j) {
        break label1475;
      }
      localObject2 = localObject1[i];
      if (((Constructor)localObject2).getParameterTypes().length != 0) {}
    }
    for (;;)
    {
      if ((localObject2 == null) && (paramClass.isMemberClass()) && (!Modifier.isStatic(paramClass.getModifiers())))
      {
        localObject4 = paramClass.getDeclaredConstructors();
        j = localObject4.length;
        i = 0;
        for (;;)
        {
          if (i < j)
          {
            localObject3 = localObject4[i];
            if (((Constructor)localObject3).getParameterTypes().length == 1)
            {
              localObject1 = localObject3;
              if (localObject3.getParameterTypes()[0].equals(paramClass.getDeclaringClass())) {
                break;
              }
            }
            i += 1;
            continue;
            i += 1;
            break label237;
            if ((localObject1 != null) || (paramClass.isInterface()) || (Modifier.isAbstract(paramClass.getModifiers()))) {
              break label41;
            }
            localObject1 = paramClass.getDeclaredConstructors();
            j = localObject1.length;
            i = 0;
            if (i < j)
            {
              paramType = localObject1[i];
              if ((a)paramType.getAnnotation(a.class) == null) {}
            }
            for (;;)
            {
              int k;
              if (paramType != null)
              {
                paramType.setAccessible(true);
                locale.c = paramType;
                i = 0;
                for (;;)
                {
                  if (i >= paramType.getParameterTypes().length) {
                    break label580;
                  }
                  localObject3 = paramType.getParameterAnnotations()[i];
                  localObject2 = null;
                  k = localObject3.length;
                  j = 0;
                  for (;;)
                  {
                    localObject1 = localObject2;
                    if (j < k)
                    {
                      localObject1 = localObject3[j];
                      if ((localObject1 instanceof b)) {
                        localObject1 = (b)localObject1;
                      }
                    }
                    else
                    {
                      if (localObject1 != null) {
                        break label517;
                      }
                      throw new runtimeexception("illegal json creator");
                      i += 1;
                      break;
                    }
                    j += 1;
                  }
                  label517:
                  localObject2 = paramType.getParameterTypes()[i];
                  localObject3 = paramType.getGenericParameterTypes()[i];
                  localObject4 = a(paramClass, ((b)localObject1).a());
                  locale.a(new f(((b)localObject1).a(), paramClass, (Class)localObject2, (Type)localObject3, (Field)localObject4));
                  i += 1;
                }
                label580:
                return locale;
              }
              localObject1 = paramClass.getDeclaredMethods();
              j = localObject1.length;
              i = 0;
              if (i < j)
              {
                paramType = localObject1[i];
                if ((!Modifier.isStatic(paramType.getModifiers())) || (!paramClass.isAssignableFrom(paramType.getReturnType())) || ((a)paramType.getAnnotation(a.class) == null)) {}
              }
              for (;;)
              {
                if (paramType != null)
                {
                  paramType.setAccessible(true);
                  locale.d = paramType;
                  i = 0;
                  for (;;)
                  {
                    if (i >= paramType.getParameterTypes().length) {
                      break label812;
                    }
                    localObject3 = paramType.getParameterAnnotations()[i];
                    localObject2 = null;
                    k = localObject3.length;
                    j = 0;
                    for (;;)
                    {
                      localObject1 = localObject2;
                      if (j < k)
                      {
                        localObject1 = localObject3[j];
                        if ((localObject1 instanceof b)) {
                          localObject1 = (b)localObject1;
                        }
                      }
                      else
                      {
                        if (localObject1 != null) {
                          break label749;
                        }
                        throw new runtimeexception("illegal json creator");
                        i += 1;
                        break;
                      }
                      j += 1;
                    }
                    label749:
                    localObject2 = paramType.getParameterTypes()[i];
                    localObject3 = paramType.getGenericParameterTypes()[i];
                    localObject4 = a(paramClass, ((b)localObject1).a());
                    locale.a(new f(((b)localObject1).a(), paramClass, (Class)localObject2, (Type)localObject3, (Field)localObject4));
                    i += 1;
                  }
                  label812:
                  return locale;
                }
                throw new runtimeexception("default constructor not found. " + paramClass);
                if (!((String)localObject5).startsWith("set")) {
                  break;
                }
                char c1 = ((String)localObject5).charAt(3);
                if (Character.isUpperCase(c1)) {
                  if ((((String)localObject5).length() > 4) && (Character.isUpperCase(((String)localObject5).charAt(4)))) {
                    localObject1 = ((String)localObject5).substring(3);
                  }
                }
                for (;;)
                {
                  localObject2 = a(paramClass, (String)localObject1);
                  if (localObject2 == null) {
                    break label1034;
                  }
                  localObject5 = (b)((Field)localObject2).getAnnotation(b.class);
                  if ((localObject5 == null) || (((b)localObject5).a().length() == 0)) {
                    break label1034;
                  }
                  locale.a(new f(((b)localObject5).a(), (Method)localObject4, (Field)localObject2, paramClass, paramType));
                  break;
                  localObject1 = Character.toLowerCase(((String)localObject5).charAt(3)) + ((String)localObject5).substring(4);
                  continue;
                  if (c1 == '_')
                  {
                    localObject1 = ((String)localObject5).substring(4);
                  }
                  else
                  {
                    if (c1 != 'f') {
                      break;
                    }
                    localObject1 = ((String)localObject5).substring(3);
                  }
                }
                label1034:
                locale.a(new f((String)localObject1, (Method)localObject4, null, paramClass, paramType));
                ((Method)localObject4).setAccessible(true);
                break;
                label1063:
                localObject3 = paramClass.getFields();
                k = localObject3.length;
                i = 0;
                while (i < k)
                {
                  localObject4 = localObject3[i];
                  if (!Modifier.isStatic(((Field)localObject4).getModifiers()))
                  {
                    localObject1 = locale.e.iterator();
                    j = 0;
                    while (((Iterator)localObject1).hasNext()) {
                      if (((f)((Iterator)localObject1).next()).d().equals(((Field)localObject4).getName())) {
                        j = 1;
                      }
                    }
                    if (j == 0)
                    {
                      localObject2 = ((Field)localObject4).getName();
                      localObject5 = (b)((Field)localObject4).getAnnotation(b.class);
                      localObject1 = localObject2;
                      if (localObject5 != null)
                      {
                        localObject1 = localObject2;
                        if (((b)localObject5).a().length() != 0) {
                          localObject1 = ((b)localObject5).a();
                        }
                      }
                      locale.a(new f((String)localObject1, null, (Field)localObject4, paramClass, paramType));
                    }
                  }
                  i += 1;
                }
                localObject1 = paramClass.getMethods();
                j = localObject1.length;
                i = 0;
                while (i < j)
                {
                  localObject2 = localObject1[i];
                  localObject3 = ((Method)localObject2).getName();
                  if ((((String)localObject3).length() >= 4) && (!Modifier.isStatic(((Method)localObject2).getModifiers())) && (((String)localObject3).startsWith("get")) && (Character.isUpperCase(((String)localObject3).charAt(3))) && (((Method)localObject2).getParameterTypes().length == 0) && ((Collection.class.isAssignableFrom(((Method)localObject2).getReturnType())) || (Map.class.isAssignableFrom(((Method)localObject2).getReturnType())) || (AtomicBoolean.class == ((Method)localObject2).getReturnType()) || (AtomicInteger.class == ((Method)localObject2).getReturnType()) || (AtomicLong.class == ((Method)localObject2).getReturnType())))
                  {
                    localObject3 = Character.toLowerCase(((String)localObject3).charAt(3)) + ((String)localObject3).substring(4);
                    if (locale.a((String)localObject3) == null)
                    {
                      locale.a(new f((String)localObject3, (Method)localObject2, null, paramClass, paramType));
                      ((Method)localObject2).setAccessible(true);
                    }
                  }
                  i += 1;
                }
                return locale;
                paramType = null;
              }
              paramType = null;
            }
          }
        }
      }
      localObject1 = localObject2;
      break;
      label1475:
      localObject2 = null;
    }
  }
  
  private f a(String paramString)
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
    {
      f localf = (f)localIterator.next();
      if (localf.d().equals(paramString)) {
        return localf;
      }
    }
    return null;
  }
  
  private static Field a(Class paramClass, String paramString)
  {
    try
    {
      paramClass = paramClass.getDeclaredField(paramString);
      return paramClass;
    }
    catch (Exception paramClass) {}
    return null;
  }
  
  private boolean a(f paramf)
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext()) {
      if (((f)localIterator.next()).d().equals(paramf.d())) {
        return false;
      }
    }
    this.e.add(paramf);
    return true;
  }
  
  public final Constructor a()
  {
    return this.b;
  }
  
  public final Constructor b()
  {
    return this.c;
  }
  
  public final Method c()
  {
    return this.d;
  }
  
  public final Class d()
  {
    return this.a;
  }
  
  public final List e()
  {
    return this.e;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.packageinfolist.packageinfolist

 * JD-Core Version:    0.7.0.1

 */