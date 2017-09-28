package com.a.a.e;

import com.a.a.maputils.b;
import com.a.a.maputils.c;
import com.a.a.c.a.x;
import com.a.a.c.j;
import com.a.a.runtimeexception;
import com.a.a.Map;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class k
{
  private static ConcurrentMap a;
  
  static
  {
    ConcurrentHashMap localConcurrentHashMap = new ConcurrentHashMap();
    a = localConcurrentHashMap;
    localConcurrentHashMap.put("byte", Byte.TYPE);
    a.put("short", Short.TYPE);
    a.put("int", Integer.TYPE);
    a.put("long", Long.TYPE);
    a.put("float", Float.TYPE);
    a.put("double", Double.TYPE);
    a.put("boolean", Boolean.TYPE);
    a.put("char", Character.TYPE);
    a.put("[byte", [B.class);
    a.put("[short", [S.class);
    a.put("[int", [I.class);
    a.put("[long", [J.class);
    a.put("[float", [F.class);
    a.put("[double", [D.class);
    a.put("[boolean", [Z.class);
    a.put("[char", [C.class);
    a.put(HashMap.class.getName(), HashMap.class);
  }
  
  public static b a(Class paramClass, Method paramMethod)
  {
    paramClass = paramClass.getInterfaces();
    int m = paramClass.length;
    int i = 0;
    int j;
    label32:
    Object localObject;
    if (i < m)
    {
      Method[] arrayOfMethod = paramClass[i].getMethods();
      int n = arrayOfMethod.length;
      j = 0;
      if (j < n)
      {
        localObject = arrayOfMethod[j];
        if ((((Method)localObject).getName().equals(paramMethod.getName())) && (((Method)localObject).getParameterTypes().length == paramMethod.getParameterTypes().length))
        {
          k = 0;
          label76:
          if (k >= ((Method)localObject).getParameterTypes().length) {
            break label161;
          }
          if (localObject.getParameterTypes()[k].equals(paramMethod.getParameterTypes()[k])) {}
        }
      }
    }
    label161:
    for (int k = 0;; k = 1)
    {
      if (k != 0)
      {
        localObject = (b)((Method)localObject).getAnnotation(b.class);
        if (localObject != null)
        {
          return localObject;
          k += 1;
          break label76;
        }
      }
      j += 1;
      break label32;
      i += 1;
      break;
      return null;
    }
  }
  
  public static Class a(String paramString)
  {
    Class localClass1;
    for (String str = paramString;; str = str.substring(1, str.length() - 1))
    {
      if ((str == null) || (str.length() == 0)) {
        paramString = null;
      }
      do
      {
        return paramString;
        localClass1 = (Class)a.get(str);
        paramString = localClass1;
      } while (localClass1 != null);
      if (str.charAt(0) == '[') {
        return Array.newInstance(a(str.substring(1)), 0).getClass();
      }
      if ((!str.startsWith("L")) || (!str.endsWith(";"))) {
        break;
      }
    }
    paramString = localClass1;
    try
    {
      localClass1 = Thread.currentThread().getContextClassLoader().loadClass(str);
      paramString = localClass1;
      a(str, localClass1);
      return localClass1;
    }
    catch (Throwable localThrowable2)
    {
      try
      {
        Class localClass2 = Class.forName(str);
        paramString = localClass2;
        a(str, localClass2);
        return localClass2;
      }
      catch (Throwable localThrowable1) {}
    }
    return paramString;
  }
  
  public static Class a(Type paramType)
  {
    for (;;)
    {
      if (paramType.getClass() == Class.class) {
        return (Class)paramType;
      }
      if (!(paramType instanceof ParameterizedType)) {
        break;
      }
      paramType = ((ParameterizedType)paramType).getRawType();
    }
    return Object.class;
  }
  
  public static final Object a(Object paramObject, Class paramClass)
  {
    return a(paramObject, paramClass, j.a());
  }
  
  public static final Object a(Object paramObject, Class paramClass, j paramj)
  {
    Object localObject;
    if (paramObject == null) {
      localObject = null;
    }
    do
    {
      java.util.Map localMap;
      do
      {
        do
        {
          do
          {
            return localObject;
            if (paramClass == null) {
              throw new IllegalArgumentException("clazz is null");
            }
            localObject = paramObject;
          } while (paramClass == paramObject.getClass());
          if (!(paramObject instanceof java.util.Map)) {
            break;
          }
          localObject = paramObject;
        } while (paramClass == java.util.Map.class);
        localMap = (java.util.Map)paramObject;
        if (paramClass != Object.class) {
          break;
        }
        localObject = paramObject;
      } while (!localMap.containsKey(a.a));
      return a((java.util.Map)paramObject, paramClass, paramj);
      if ((paramClass.isArray()) && ((paramObject instanceof Collection)))
      {
        localObject = (Collection)paramObject;
        int i = 0;
        paramObject = Array.newInstance(paramClass.getComponentType(), ((Collection)localObject).size());
        localObject = ((Collection)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          Array.set(paramObject, i, a(((Iterator)localObject).next(), paramClass.getComponentType(), paramj));
          i += 1;
        }
        return paramObject;
      }
      localObject = paramObject;
    } while (paramClass.isAssignableFrom(paramObject.getClass()));
    if ((paramClass == Boolean.TYPE) || (paramClass == Boolean.class)) {
      return k(paramObject);
    }
    if ((paramClass == Byte.TYPE) || (paramClass == Byte.class)) {
      return b(paramObject);
    }
    if ((paramClass == Short.TYPE) || (paramClass == Short.class)) {
      return d(paramObject);
    }
    if ((paramClass == Integer.TYPE) || (paramClass == Integer.class)) {
      return j(paramObject);
    }
    if ((paramClass == Long.TYPE) || (paramClass == Long.class)) {
      return i(paramObject);
    }
    if ((paramClass == Float.TYPE) || (paramClass == Float.class)) {
      return g(paramObject);
    }
    if ((paramClass == Double.TYPE) || (paramClass == Double.class)) {
      return h(paramObject);
    }
    if (paramClass == String.class) {
      return a(paramObject);
    }
    if (paramClass == BigDecimal.class) {
      return e(paramObject);
    }
    if (paramClass == BigInteger.class) {
      return f(paramObject);
    }
    if (paramClass == java.util.Date.class) {
      return l(paramObject);
    }
    if (paramClass == java.sql.Date.class)
    {
      if (paramObject == null) {
        return null;
      }
      if ((paramObject instanceof Calendar)) {
        return new java.sql.Date(((Calendar)paramObject).getTimeInMillis());
      }
      if ((paramObject instanceof java.sql.Date)) {
        return (java.sql.Date)paramObject;
      }
      if ((paramObject instanceof java.util.Date)) {
        return new java.sql.Date(((java.util.Date)paramObject).getTime());
      }
      if (!(paramObject instanceof Number)) {
        break label809;
      }
    }
    label803:
    label809:
    for (long l = ((Number)paramObject).longValue();; l = 0L)
    {
      if ((paramObject instanceof String))
      {
        paramClass = (String)paramObject;
        if (paramClass.length() == 0) {
          return null;
        }
        l = Long.parseLong(paramClass);
      }
      if (l <= 0L) {
        throw new runtimeexception("can not cast to Date, value : " + paramObject);
      }
      return new java.sql.Date(l);
      if (paramClass == Timestamp.class)
      {
        if (paramObject == null) {
          return null;
        }
        if ((paramObject instanceof Calendar)) {
          return new Timestamp(((Calendar)paramObject).getTimeInMillis());
        }
        if ((paramObject instanceof Timestamp)) {
          return (Timestamp)paramObject;
        }
        if ((paramObject instanceof java.util.Date)) {
          return new Timestamp(((java.util.Date)paramObject).getTime());
        }
        if (!(paramObject instanceof Number)) {
          break label803;
        }
      }
      for (l = ((Number)paramObject).longValue();; l = 0L)
      {
        if ((paramObject instanceof String))
        {
          paramClass = (String)paramObject;
          if (paramClass.length() == 0) {
            return null;
          }
          l = Long.parseLong(paramClass);
        }
        if (l <= 0L) {
          throw new runtimeexception("can not cast to Date, value : " + paramObject);
        }
        return new Timestamp(l);
        if (paramClass.isEnum()) {
          return b(paramObject, paramClass);
        }
        if (Calendar.class.isAssignableFrom(paramClass))
        {
          paramj = l(paramObject);
          if (paramClass == Calendar.class) {
            paramObject = Calendar.getInstance();
          }
          for (;;)
          {
            paramObject.setTime(paramj);
            return paramObject;
            try
            {
              paramObject = (Calendar)paramClass.newInstance();
            }
            catch (Exception paramObject)
            {
              throw new runtimeexception("can not cast to : " + paramClass.getName(), paramObject);
            }
          }
        }
        if (((paramObject instanceof String)) && (((String)paramObject).length() == 0)) {
          return null;
        }
        throw new runtimeexception("can not cast to : " + paramClass.getName());
      }
    }
  }
  
  public static final Object a(Object paramObject, Type paramType, j paramj)
  {
    if (paramObject == null) {
      paramObject = null;
    }
    do
    {
      return paramObject;
      if ((paramType instanceof Class)) {
        return a(paramObject, (Class)paramType, paramj);
      }
      if ((paramType instanceof ParameterizedType))
      {
        Object localObject = (ParameterizedType)paramType;
        paramType = ((ParameterizedType)localObject).getRawType();
        Type localType1;
        if ((paramType == List.class) || (paramType == ArrayList.class))
        {
          localType1 = localObject.getActualTypeArguments()[0];
          if ((paramObject instanceof Iterable))
          {
            paramType = new ArrayList();
            paramObject = ((Iterable)paramObject).iterator();
            while (paramObject.hasNext()) {
              paramType.add(a(paramObject.next(), localType1, paramj));
            }
            return paramType;
          }
        }
        if ((paramType == java.util.Map.class) || (paramType == HashMap.class))
        {
          localType1 = localObject.getActualTypeArguments()[0];
          Type localType2 = localObject.getActualTypeArguments()[1];
          if ((paramObject instanceof java.util.Map))
          {
            paramType = new HashMap();
            paramObject = ((java.util.Map)paramObject).entrySet().iterator();
            while (paramObject.hasNext())
            {
              localObject = (java.util.Map.Entry)paramObject.next();
              paramType.put(a(((java.util.Map.Entry)localObject).getKey(), localType1, paramj), a(((java.util.Map.Entry)localObject).getValue(), localType2, paramj));
            }
            return paramType;
          }
        }
        if (((paramObject instanceof String)) && (((String)paramObject).length() == 0)) {
          return null;
        }
        if ((((ParameterizedType)localObject).getActualTypeArguments().length == 1) && ((localObject.getActualTypeArguments()[0] instanceof WildcardType))) {
          break;
        }
        throw new runtimeexception("can not cast to : " + localObject);
      }
      if (((paramObject instanceof String)) && (((String)paramObject).length() == 0)) {
        return null;
      }
    } while ((paramType instanceof TypeVariable));
    throw new runtimeexception("can not cast to : " + paramType);
  }
  
  private static Object a(java.util.Map paramMap, Class paramClass, j paramj)
  {
    int i = 0;
    if (paramClass == StackTraceElement.class) {}
    Object localObject2;
    try
    {
      paramClass = (String)paramMap.get("className");
      paramj = (String)paramMap.get("methodName");
      localObject1 = (String)paramMap.get("fileName");
      paramMap = (Number)paramMap.get("lineNumber");
      if (paramMap == null) {}
      for (;;)
      {
        return new StackTraceElement(paramClass, paramj, (String)localObject1, i);
        i = paramMap.intValue();
      }
      localObject1 = paramMap.get(a.a);
      if (!(localObject1 instanceof String)) {
        break label185;
      }
      localObject1 = (String)localObject1;
      localObject2 = a((String)localObject1);
      if (localObject2 == null) {
        throw new ClassNotFoundException((String)localObject1 + " not found");
      }
    }
    catch (Exception paramMap)
    {
      throw new runtimeexception(paramMap.getMessage(), paramMap);
    }
    if (!localObject2.equals(paramClass)) {
      return a(paramMap, (Class)localObject2, paramj);
    }
    label185:
    if (paramClass.isInterface())
    {
      if ((paramMap instanceof Map)) {}
      for (paramMap = (Map)paramMap;; paramMap = new Map(paramMap)) {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[] { paramClass }, paramMap);
      }
    }
    Object localObject1 = paramj;
    if (paramj == null) {
      localObject1 = j.a();
    }
    paramj = ((j)localObject1).b(paramClass);
    paramClass = paramClass.getDeclaredConstructor(new Class[0]);
    if (!paramClass.isAccessible()) {
      paramClass.setAccessible(true);
    }
    paramClass = paramClass.newInstance(new Object[0]);
    paramj = paramj.entrySet().iterator();
    while (paramj.hasNext())
    {
      localObject2 = (java.util.Map.Entry)paramj.next();
      Object localObject3 = (String)((java.util.Map.Entry)localObject2).getKey();
      localObject2 = (x)((java.util.Map.Entry)localObject2).getValue();
      if (paramMap.containsKey(localObject3))
      {
        localObject3 = paramMap.get(localObject3);
        Method localMethod = ((x)localObject2).b();
        if (localMethod != null)
        {
          localMethod.invoke(paramClass, new Object[] { a(localObject3, localMethod.getGenericParameterTypes()[0], (j)localObject1) });
        }
        else
        {
          localObject2 = ((x)localObject2).c();
          ((Field)localObject2).set(paramClass, a(localObject3, ((Field)localObject2).getGenericType(), (j)localObject1));
        }
      }
    }
    return paramClass;
  }
  
  public static final String a(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    return paramObject.toString();
  }
  
  public static List a(Class paramClass)
  {
    return a(paramClass, true);
  }
  
  public static List a(Class paramClass, boolean paramBoolean)
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    Object localObject4 = paramClass.getMethods();
    int j = localObject4.length;
    int i = 0;
    Method localMethod;
    Object localObject5;
    Object localObject2;
    Object localObject1;
    label211:
    char c;
    if (i < j)
    {
      localMethod = localObject4[i];
      localObject5 = localMethod.getName();
      if ((!Modifier.isStatic(localMethod.getModifiers())) && (!localMethod.getReturnType().equals(Void.TYPE)) && (localMethod.getParameterTypes().length == 0) && (localMethod.getReturnType() != ClassLoader.class) && ((!localMethod.getName().equals("getMetaClass")) || (!localMethod.getReturnType().getName().equals("groovy.lang.MetaClass"))))
      {
        localObject2 = (b)localMethod.getAnnotation(b.class);
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = a(paramClass, localMethod);
        }
        if (localObject1 == null) {
          break label211;
        }
        if (((b)localObject1).c())
        {
          if (((b)localObject1).a().length() == 0) {
            break label211;
          }
          localObject1 = ((b)localObject1).a();
          localLinkedHashMap.put(localObject1, new f((String)localObject1, localMethod, null));
        }
      }
      do
      {
        i += 1;
        break;
        if (!((String)localObject5).startsWith("get")) {
          break label404;
        }
      } while ((((String)localObject5).length() < 4) || (((String)localObject5).equals("getClass")));
      c = ((String)localObject5).charAt(3);
      if (Character.isUpperCase(c)) {
        if ((((String)localObject5).length() > 4) && (Character.isUpperCase(((String)localObject5).charAt(4))))
        {
          localObject1 = ((String)localObject5).substring(3);
          label285:
          if (a(paramClass, (String)localObject1)) {
            break label639;
          }
          localObject2 = j.a(paramClass, (String)localObject1);
          if (localObject2 != null) {
            break label1002;
          }
          localObject2 = j.a(paramClass, (String)localObject1);
        }
      }
    }
    label404:
    label933:
    label999:
    label1002:
    for (;;)
    {
      Object localObject3 = localObject1;
      if (localObject2 != null)
      {
        b localb = (b)((Field)localObject2).getAnnotation(b.class);
        localObject3 = localObject1;
        if (localb != null)
        {
          if (!localb.c()) {
            break;
          }
          localObject3 = localObject1;
          if (localb.a().length() != 0) {
            localObject3 = localb.a();
          }
        }
      }
      localLinkedHashMap.put(localObject3, new f((String)localObject3, localMethod, (Field)localObject2));
      if ((!((String)localObject5).startsWith("is")) || (((String)localObject5).length() < 3)) {
        break;
      }
      c = ((String)localObject5).charAt(2);
      if (Character.isUpperCase(c)) {
        localObject1 = Character.toLowerCase(((String)localObject5).charAt(2)) + ((String)localObject5).substring(3);
      }
      for (;;)
      {
        localObject3 = j.a(paramClass, (String)localObject1);
        localObject2 = localObject1;
        if (localObject3 != null)
        {
          localObject5 = (b)((Field)localObject3).getAnnotation(b.class);
          localObject2 = localObject1;
          if (localObject5 != null)
          {
            if (!((b)localObject5).c()) {
              break;
            }
            localObject2 = localObject1;
            if (((b)localObject5).a().length() != 0) {
              localObject2 = ((b)localObject5).a();
            }
          }
        }
        localLinkedHashMap.put(localObject2, new f((String)localObject2, localMethod, (Field)localObject3));
        break;
        localObject1 = Character.toLowerCase(((String)localObject5).charAt(3)) + ((String)localObject5).substring(4);
        break label285;
        if (c == '_')
        {
          localObject1 = ((String)localObject5).substring(4);
          break label285;
        }
        if (c != 'f') {
          break;
        }
        localObject1 = ((String)localObject5).substring(3);
        break label285;
        label639:
        break;
        if (c == '_')
        {
          localObject1 = ((String)localObject5).substring(3);
        }
        else
        {
          if (c != 'f') {
            break;
          }
          localObject1 = ((String)localObject5).substring(2);
        }
      }
      localObject2 = paramClass.getFields();
      j = localObject2.length;
      i = 0;
      if (i < j)
      {
        localObject3 = localObject2[i];
        if (!Modifier.isStatic(((Field)localObject3).getModifiers()))
        {
          localObject4 = (b)((Field)localObject3).getAnnotation(b.class);
          localObject1 = ((Field)localObject3).getName();
          if (localObject4 == null) {
            break label999;
          }
          if (((b)localObject4).c())
          {
            if (((b)localObject4).a().length() == 0) {
              break label999;
            }
            localObject1 = ((b)localObject4).a();
          }
        }
      }
      for (;;)
      {
        if (!localLinkedHashMap.containsKey(localObject1)) {
          localLinkedHashMap.put(localObject1, new f((String)localObject1, null, (Field)localObject3));
        }
        i += 1;
        break;
        localObject1 = new ArrayList();
        paramClass = (c)paramClass.getAnnotation(c.class);
        if (paramClass != null)
        {
          paramClass = paramClass.b();
          if ((paramClass != null) && (paramClass.length == localLinkedHashMap.size()))
          {
            j = paramClass.length;
            i = 0;
            while (i < j)
            {
              if (!localLinkedHashMap.containsKey(paramClass[i])) {
                break label933;
              }
              i += 1;
            }
            i = 1;
          }
        }
        for (;;)
        {
          if (i != 0)
          {
            j = paramClass.length;
            i = 0;
            while (i < j)
            {
              ((List)localObject1).add((f)localLinkedHashMap.get(paramClass[i]));
              i += 1;
            }
            i = 0;
          }
          else
          {
            paramClass = localLinkedHashMap.values().iterator();
            while (paramClass.hasNext()) {
              ((List)localObject1).add((f)paramClass.next());
            }
            if (paramBoolean) {
              Collections.sort((List)localObject1);
            }
            return localObject1;
            i = 0;
            paramClass = null;
          }
        }
      }
    }
  }
  
  private static void a(String paramString, Class paramClass)
  {
    String str = paramString;
    if (paramString == null) {
      str = paramClass.getName();
    }
    a.put(str, paramClass);
  }
  
  private static boolean a(Class paramClass, String paramString)
  {
    Object localObject = (c)paramClass.getAnnotation(c.class);
    if ((localObject != null) && (((c)localObject).c() != null))
    {
      localObject = ((c)localObject).c();
      int j = localObject.length;
      int i = 0;
      while (i < j)
      {
        if (paramString.equalsIgnoreCase(localObject[i])) {
          return true;
        }
        i += 1;
      }
    }
    return (paramClass.getSuperclass() != Object.class) && (paramClass.getSuperclass() != null) && (a(paramClass.getSuperclass(), paramString));
  }
  
  public static final Byte b(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return null;
      if ((paramObject instanceof Number)) {
        return Byte.valueOf(((Number)paramObject).byteValue());
      }
      if (!(paramObject instanceof String)) {
        break;
      }
      paramObject = (String)paramObject;
    } while (paramObject.length() == 0);
    return Byte.valueOf(Byte.parseByte(paramObject));
    throw new runtimeexception("can not cast to byte, value : " + paramObject);
  }
  
  private static Object b(Object paramObject, Class paramClass)
  {
    int i = 0;
    Enum localEnum;
    try
    {
      if ((paramObject instanceof String))
      {
        paramObject = (String)paramObject;
        if (paramObject.length() == 0) {
          return null;
        }
        return Enum.valueOf(paramClass, paramObject);
      }
      if ((paramObject instanceof Number))
      {
        int j = ((Number)paramObject).intValue();
        paramObject = (Object[])paramClass.getMethod("values", new Class[0]).invoke(null, new Object[0]);
        int k = paramObject.length;
        while (i < k)
        {
          localEnum = (Enum)paramObject[i];
          int m = localEnum.ordinal();
          if (m == j) {
            break label163;
          }
          i += 1;
        }
      }
      throw new runtimeexception("can not cast to : " + paramClass.getName());
    }
    catch (Exception paramObject)
    {
      throw new runtimeexception("can not cast to : " + paramClass.getName(), paramObject);
    }
    label163:
    return localEnum;
  }
  
  public static final Character c(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof Character)) {
      return (Character)paramObject;
    }
    if ((paramObject instanceof String))
    {
      String str = (String)paramObject;
      if (str.length() == 0) {
        return null;
      }
      if (str.length() != 1) {
        throw new runtimeexception("can not cast to byte, value : " + paramObject);
      }
      return Character.valueOf(str.charAt(0));
    }
    throw new runtimeexception("can not cast to byte, value : " + paramObject);
  }
  
  public static final Short d(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return null;
      if ((paramObject instanceof Number)) {
        return Short.valueOf(((Number)paramObject).shortValue());
      }
      if (!(paramObject instanceof String)) {
        break;
      }
      paramObject = (String)paramObject;
    } while (paramObject.length() == 0);
    return Short.valueOf(Short.parseShort(paramObject));
    throw new runtimeexception("can not cast to short, value : " + paramObject);
  }
  
  public static final BigDecimal e(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof BigDecimal)) {
      return (BigDecimal)paramObject;
    }
    if ((paramObject instanceof BigInteger)) {
      return new BigDecimal((BigInteger)paramObject);
    }
    paramObject = paramObject.toString();
    if (paramObject.length() == 0) {
      return null;
    }
    return new BigDecimal(paramObject);
  }
  
  public static final BigInteger f(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof BigInteger)) {
      return (BigInteger)paramObject;
    }
    if (((paramObject instanceof Float)) || ((paramObject instanceof Double))) {
      return BigInteger.valueOf(((Number)paramObject).longValue());
    }
    paramObject = paramObject.toString();
    if (paramObject.length() == 0) {
      return null;
    }
    return new BigInteger(paramObject);
  }
  
  public static final Float g(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return null;
      if ((paramObject instanceof Number)) {
        return Float.valueOf(((Number)paramObject).floatValue());
      }
      if (!(paramObject instanceof String)) {
        break;
      }
      paramObject = paramObject.toString();
    } while (paramObject.length() == 0);
    return Float.valueOf(Float.parseFloat(paramObject));
    throw new runtimeexception("can not cast to float, value : " + paramObject);
  }
  
  public static final Double h(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return null;
      if ((paramObject instanceof Number)) {
        return Double.valueOf(((Number)paramObject).doubleValue());
      }
      if (!(paramObject instanceof String)) {
        break;
      }
      paramObject = paramObject.toString();
    } while (paramObject.length() == 0);
    return Double.valueOf(Double.parseDouble(paramObject));
    throw new runtimeexception("can not cast to double, value : " + paramObject);
  }
  
  public static final Long i(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return null;
      if ((paramObject instanceof Number)) {
        return Long.valueOf(((Number)paramObject).longValue());
      }
      if (!(paramObject instanceof String)) {
        break;
      }
      localObject = (String)paramObject;
    } while (((String)localObject).length() == 0);
    com.a.a.c.f localf;
    try
    {
      long l = Long.parseLong((String)localObject);
      return Long.valueOf(l);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      localf = new com.a.a.c.f((String)localObject);
      if (!localf.b(false)) {}
    }
    for (Object localObject = localf.o();; localObject = null)
    {
      localf.close();
      if (localObject != null) {
        return Long.valueOf(((Calendar)localObject).getTimeInMillis());
      }
      throw new runtimeexception("can not cast to long, value : " + paramObject);
    }
  }
  
  public static final Integer j(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof Integer)) {
      return (Integer)paramObject;
    }
    if ((paramObject instanceof Number)) {
      return Integer.valueOf(((Number)paramObject).intValue());
    }
    if ((paramObject instanceof String))
    {
      paramObject = (String)paramObject;
      if (paramObject.length() == 0) {
        return null;
      }
      return Integer.valueOf(Integer.parseInt(paramObject));
    }
    throw new runtimeexception("can not cast to int, value : " + paramObject);
  }
  
  public static final Boolean k(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof Boolean)) {
      return (Boolean)paramObject;
    }
    if ((paramObject instanceof Number))
    {
      if (((Number)paramObject).intValue() == 1) {}
      for (;;)
      {
        return Boolean.valueOf(bool);
        bool = false;
      }
    }
    if ((paramObject instanceof String))
    {
      String str = (String)paramObject;
      if (str.length() == 0) {
        return null;
      }
      if ("true".equals(str)) {
        return Boolean.TRUE;
      }
      if ("false".equals(str)) {
        return Boolean.FALSE;
      }
      if ("1".equals(str)) {
        return Boolean.TRUE;
      }
    }
    throw new runtimeexception("can not cast to int, value : " + paramObject);
  }
  
  private static java.util.Date l(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof Calendar)) {
      return ((Calendar)paramObject).getTime();
    }
    if ((paramObject instanceof java.util.Date)) {
      return (java.util.Date)paramObject;
    }
    long l = -1L;
    if ((paramObject instanceof Number)) {
      l = ((Number)paramObject).longValue();
    }
    if ((paramObject instanceof String))
    {
      String str = (String)paramObject;
      if (str.indexOf('-') != -1)
      {
        if (str.length() == a.c.length()) {
          paramObject = a.c;
        }
        for (;;)
        {
          paramObject = new SimpleDateFormat(paramObject);
          try
          {
            paramObject = paramObject.parse(str);
            return paramObject;
          }
          catch (ParseException paramObject)
          {
            throw new runtimeexception("can not cast to Date, value : " + str);
          }
          if (str.length() == 10) {
            paramObject = "yyyy-MM-dd";
          } else if (str.length() == 19) {
            paramObject = "yyyy-MM-dd HH:mm:ss";
          } else {
            paramObject = "yyyy-MM-dd HH:mm:ss.SSS";
          }
        }
      }
      if (str.length() == 0) {
        return null;
      }
      l = Long.parseLong(str);
    }
    if (l < 0L) {
      throw new runtimeexception("can not cast to Date, value : " + paramObject);
    }
    return new java.util.Date(l);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.packageinfolist.k

 * JD-Core Version:    0.7.0.1

 */