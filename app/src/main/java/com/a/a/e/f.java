package com.a.a.e;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class f
  implements Comparable
{
  private final String a;
  private final Method b;
  private final Field c;
  private final Class d;
  private final Type e;
  private final Class f;
  private boolean g = false;
  
  public f(String paramString, Class paramClass1, Class paramClass2, Type paramType, Field paramField)
  {
    this.a = paramString;
    this.f = paramClass1;
    this.d = paramClass2;
    this.e = paramType;
    this.b = null;
    this.c = paramField;
    if (paramField != null) {
      paramField.setAccessible(true);
    }
  }
  
  public f(String paramString, Method paramMethod, Field paramField)
  {
    this(paramString, paramMethod, paramField, null, null);
  }
  
  public f(String paramString, Method paramMethod, Field paramField, Class paramClass, Type paramType)
  {
    this.a = paramString;
    this.b = paramMethod;
    this.c = paramField;
    if (paramMethod != null) {
      paramMethod.setAccessible(true);
    }
    if (paramField != null) {
      paramField.setAccessible(true);
    }
    if (paramMethod != null) {
      if (paramMethod.getParameterTypes().length == 1)
      {
        paramField = paramMethod.getParameterTypes()[0];
        paramString = paramMethod.getGenericParameterTypes()[0];
        this.f = paramMethod.getDeclaringClass();
        paramMethod = paramField;
      }
    }
    for (;;)
    {
      if ((paramClass == null) || (paramMethod != Object.class) || (!(paramString instanceof TypeVariable))) {
        break label164;
      }
      paramField = a(paramClass, (TypeVariable)paramString);
      if (paramField == null) {
        break label164;
      }
      this.d = k.a(paramField);
      this.e = paramField;
      return;
      paramField = paramMethod.getReturnType();
      paramString = paramMethod.getGenericReturnType();
      this.g = true;
      break;
      paramMethod = paramField.getType();
      paramString = paramField.getGenericType();
      this.f = paramField.getDeclaringClass();
    }
    label164:
    paramField = a(paramClass, paramType, paramString);
    if (paramField != paramString) {
      if ((paramField instanceof ParameterizedType)) {
        paramString = k.a(paramField);
      }
    }
    for (;;)
    {
      this.e = paramField;
      this.d = paramString;
      return;
      if ((paramField instanceof Class)) {
        paramString = k.a(paramField);
      } else {
        paramString = paramMethod;
      }
    }
  }
  
  private static Type a(Class paramClass, Type paramType1, Type paramType2)
  {
    if ((paramClass == null) || (paramType1 == null)) {}
    do
    {
      do
      {
        return paramType2;
      } while (!(paramType1 instanceof ParameterizedType));
      if ((paramType2 instanceof TypeVariable))
      {
        localParameterizedType1 = (ParameterizedType)paramType1;
        localObject = (TypeVariable)paramType2;
        i = 0;
        while (i < paramClass.getTypeParameters().length)
        {
          if (paramClass.getTypeParameters()[i].getName().equals(((TypeVariable)localObject).getName())) {
            return localParameterizedType1.getActualTypeArguments()[i];
          }
          i += 1;
        }
      }
    } while (!(paramType2 instanceof ParameterizedType));
    ParameterizedType localParameterizedType1 = (ParameterizedType)paramType2;
    Object localObject = localParameterizedType1.getActualTypeArguments();
    int j = 0;
    int i = 0;
    label115:
    if (j < localObject.length)
    {
      TypeVariable localTypeVariable = localObject[j];
      if (!(localTypeVariable instanceof TypeVariable)) {
        break label259;
      }
      localTypeVariable = (TypeVariable)localTypeVariable;
      if (!(paramType1 instanceof ParameterizedType)) {
        break label259;
      }
      ParameterizedType localParameterizedType2 = (ParameterizedType)paramType1;
      int k = 0;
      while (k < paramClass.getTypeParameters().length)
      {
        if (paramClass.getTypeParameters()[k].getName().equals(localTypeVariable.getName()))
        {
          localObject[j] = localParameterizedType2.getActualTypeArguments()[k];
          i = 1;
        }
        k += 1;
      }
    }
    label259:
    for (;;)
    {
      j += 1;
      break label115;
      if (i == 0) {
        break;
      }
      return new i((Type[])localObject, localParameterizedType1.getOwnerType(), localParameterizedType1.getRawType());
    }
  }
  
  private static Type a(Class paramClass, TypeVariable paramTypeVariable)
  {
    Object localObject = paramTypeVariable.getGenericDeclaration();
    Type localType;
    do
    {
      localType = paramClass.getGenericSuperclass();
      if (localType == null) {
        return null;
      }
      if ((localType instanceof ParameterizedType))
      {
        paramClass = (ParameterizedType)localType;
        if (paramClass.getRawType() == localObject)
        {
          localObject = ((GenericDeclaration)localObject).getTypeParameters();
          paramClass = paramClass.getActualTypeArguments();
          int i = 0;
          while (i < localObject.length)
          {
            if (localObject[i] == paramTypeVariable) {
              return paramClass[i];
            }
            i += 1;
          }
          return null;
        }
      }
      paramClass = k.a(localType);
    } while (localType != null);
    return null;
  }
  
  public final Class a()
  {
    return this.f;
  }
  
  public final Object a(Object paramObject)
    throws IllegalAccessException, InvocationTargetException
  {
    if (this.b != null) {
      return this.b.invoke(paramObject, new Object[0]);
    }
    return this.c.get(paramObject);
  }
  
  public final Annotation a(Class paramClass)
  {
    Annotation localAnnotation1 = null;
    if (this.b != null) {
      localAnnotation1 = this.b.getAnnotation(paramClass);
    }
    Annotation localAnnotation2 = localAnnotation1;
    if (localAnnotation1 == null)
    {
      localAnnotation2 = localAnnotation1;
      if (this.c != null) {
        localAnnotation2 = this.c.getAnnotation(paramClass);
      }
    }
    return localAnnotation2;
  }
  
  public final void a(Object paramObject1, Object paramObject2)
    throws IllegalAccessException, InvocationTargetException
  {
    if (this.b != null)
    {
      this.b.invoke(paramObject1, new Object[] { paramObject2 });
      return;
    }
    this.c.set(paramObject1, paramObject2);
  }
  
  public final Class b()
  {
    return this.d;
  }
  
  public final Type c()
  {
    return this.e;
  }
  
  public final String d()
  {
    return this.a;
  }
  
  public final Method e()
  {
    return this.b;
  }
  
  public final Field f()
  {
    return this.c;
  }
  
  public final void g()
    throws SecurityException
  {
    if (this.b != null)
    {
      this.b.setAccessible(true);
      return;
    }
    this.c.setAccessible(true);
  }
  
  public final boolean h()
  {
    return this.g;
  }
  
  public String toString()
  {
    return this.a;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.packageinfolist.type

 * JD-Core Version:    0.7.0.1

 */