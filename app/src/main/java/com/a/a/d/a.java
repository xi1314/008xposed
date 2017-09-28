package com.a.a.d;

import com.a.a.maputils;
import com.a.a.maputils.b;
import com.a.a.b.g;
import com.a.a.b.h;
import com.a.a.b.j;
import com.a.a.runtimeexception;
import com.a.a.Map.f;
import com.a.a.Map.k;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class a
{
  private com.a.a.Map.a a = new com.a.a.Map.a();
  private final AtomicLong b = new AtomicLong();
  
  private static void a(h paramh, g paramg)
  {
    paramh.b(25, 1);
    paramh.b(25, 2);
    paramh.b(25, 5);
    paramh.b(184, com.a.a.Map.c.b(ag.class), "applyName", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;)Z");
    paramh.a(153, paramg);
  }
  
  private static void a(h paramh, a parama)
  {
    paramh.b(16, 44);
    paramh.b(54, parama.a("seperator"));
  }
  
  private static void a(h paramh, a parama, f paramf)
  {
    Method localMethod = paramf.e();
    if (localMethod != null)
    {
      paramh.b(25, parama.a("entity"));
      paramh.b(182, com.a.a.Map.c.b(localMethod.getDeclaringClass()), localMethod.getName(), com.a.a.Map.c.a(localMethod));
      return;
    }
    paramh.b(25, parama.a("entity"));
    paramh.a(180, com.a.a.Map.c.b(paramf.a()), paramf.f().getName(), com.a.a.Map.c.a(paramf.b()));
  }
  
  private static void a(h paramh, f paramf, a parama)
  {
    int j = 0;
    Object localObject = (b)paramf.a(b.class);
    if (localObject != null)
    {
      localObject = ((b)localObject).e();
      int m = localObject.length;
      int i = 0;
      for (;;)
      {
        k = i;
        if (j >= m) {
          break;
        }
        if (localObject[j] == bl.d) {
          i = 1;
        }
        j += 1;
      }
    }
    int k = 0;
    localObject = new g();
    g localg1 = new g();
    g localg2 = new g();
    a(paramh, localg2);
    a(paramh, parama, paramf);
    paramh.a(192, com.a.a.Map.c.b(Enum.class));
    paramh.b(58, parama.a("enum"));
    a(paramh, paramf, parama, localg2);
    paramh.b(25, parama.a("enum"));
    paramh.a(199, (g)localObject);
    b(paramh, paramf, parama);
    paramh.a(167, localg1);
    paramh.a((g)localObject);
    paramh.b(25, parama.a("out"));
    paramh.b(21, parama.a("seperator"));
    paramh.b(25, 5);
    paramh.b(25, parama.a("enum"));
    if (k != 0)
    {
      paramh.b(182, com.a.a.Map.c.b(Object.class), "toString", "()Ljava/lang/String;");
      paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldValue", "(CLjava/lang/String;Ljava/lang/String;)V");
    }
    for (;;)
    {
      a(paramh, parama);
      paramh.a(localg1);
      paramh.a(localg2);
      return;
      paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldValue", "(CLjava/lang/String;L" + com.a.a.Map.c.b(Enum.class) + ";)V");
    }
  }
  
  private static void a(h paramh, f paramf, a parama, g paramg)
  {
    if ((paramf.f() != null) && (Modifier.isTransient(paramf.f().getModifiers())))
    {
      paramh.b(25, parama.a("out"));
      paramh.a(178, com.a.a.Map.c.b(bl.class), "SkipTransientField", "L" + com.a.a.Map.c.b(bl.class) + ";");
      paramh.b(182, com.a.a.Map.c.b(bk.class), "isEnabled", "(L" + com.a.a.Map.c.b(bl.class) + ";)Z");
      paramh.a(154, paramg);
    }
    Object localObject = paramf.b();
    paramh.b(25, 1);
    paramh.b(25, 2);
    paramh.b(25, 5);
    label282:
    Class localClass;
    if (localObject == Byte.TYPE)
    {
      paramh.b(21, parama.a("byte"));
      paramh.b(184, com.a.a.Map.c.b(ag.class), "apply", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;B)Z");
      paramh.a(153, paramg);
      localObject = paramf.b();
      paramh.b(25, 1);
      paramh.b(25, 2);
      paramh.b(25, 5);
      if (localObject != Byte.TYPE) {
        break label997;
      }
      paramh.b(21, parama.a("byte"));
      paramh.b(184, com.a.a.Map.c.b(ag.class), "processKey", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;B)Ljava/lang/String;");
      paramh.b(58, 5);
      localObject = new g();
      localClass = paramf.b();
      paramh.b(25, 1);
      paramh.b(25, 2);
      paramh.b(25, 5);
      if (localClass != Byte.TYPE) {
        break label1523;
      }
      paramh.b(21, parama.a("byte"));
      paramh.b(184, com.a.a.Map.c.b(Byte.class), "valueOf", "(B)Ljava/lang/Byte;");
    }
    for (;;)
    {
      paramh.b(58, 6);
      paramh.b(25, 6);
      paramh.b(184, com.a.a.Map.c.b(ag.class), "processValue", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;");
      paramh.b(58, 7);
      paramh.b(25, 6);
      paramh.b(25, 7);
      paramh.a(165, (g)localObject);
      b(paramh, paramf, parama, paramg);
      paramh.a(167, paramg);
      paramh.a((g)localObject);
      return;
      if (localObject == Short.TYPE)
      {
        paramh.b(21, parama.a("short"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "apply", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;S)Z");
        break;
      }
      if (localObject == Integer.TYPE)
      {
        paramh.b(21, parama.a("int"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "apply", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;I)Z");
        break;
      }
      if (localObject == Character.TYPE)
      {
        paramh.b(21, parama.a("char"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "apply", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;C)Z");
        break;
      }
      if (localObject == Long.TYPE)
      {
        paramh.b(22, parama.b("long"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "apply", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;J)Z");
        break;
      }
      if (localObject == Float.TYPE)
      {
        paramh.b(23, parama.a("float"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "apply", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;F)Z");
        break;
      }
      if (localObject == Double.TYPE)
      {
        paramh.b(24, parama.b("double"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "apply", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;D)Z");
        break;
      }
      if (localObject == Boolean.TYPE)
      {
        paramh.b(21, parama.a("boolean"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "apply", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;B)Z");
        break;
      }
      if (localObject == BigDecimal.class)
      {
        paramh.b(25, parama.a("decimal"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "apply", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z");
        break;
      }
      if (localObject == String.class)
      {
        paramh.b(25, parama.a("string"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "apply", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z");
        break;
      }
      if (((Class)localObject).isEnum())
      {
        paramh.b(25, parama.a("enum"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "apply", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z");
        break;
      }
      if (List.class.isAssignableFrom((Class)localObject))
      {
        paramh.b(25, parama.a("list"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "apply", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z");
        break;
      }
      paramh.b(25, parama.a("object"));
      paramh.b(184, com.a.a.Map.c.b(ag.class), "apply", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z");
      break;
      label997:
      if (localObject == Short.TYPE)
      {
        paramh.b(21, parama.a("short"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "processKey", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;S)Ljava/lang/String;");
        break label282;
      }
      if (localObject == Integer.TYPE)
      {
        paramh.b(21, parama.a("int"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "processKey", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/String;");
        break label282;
      }
      if (localObject == Character.TYPE)
      {
        paramh.b(21, parama.a("char"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "processKey", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;C)Ljava/lang/String;");
        break label282;
      }
      if (localObject == Long.TYPE)
      {
        paramh.b(22, parama.b("long"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "processKey", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;J)Ljava/lang/String;");
        break label282;
      }
      if (localObject == Float.TYPE)
      {
        paramh.b(23, parama.a("float"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "processKey", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;F)Ljava/lang/String;");
        break label282;
      }
      if (localObject == Double.TYPE)
      {
        paramh.b(24, parama.b("double"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "processKey", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;D)Ljava/lang/String;");
        break label282;
      }
      if (localObject == Boolean.TYPE)
      {
        paramh.b(21, parama.a("boolean"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "processKey", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;Z)Ljava/lang/String;");
        break label282;
      }
      if (localObject == BigDecimal.class)
      {
        paramh.b(25, parama.a("decimal"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "processKey", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;");
        break label282;
      }
      if (localObject == String.class)
      {
        paramh.b(25, parama.a("string"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "processKey", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;");
        break label282;
      }
      if (((Class)localObject).isEnum())
      {
        paramh.b(25, parama.a("enum"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "processKey", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;");
        break label282;
      }
      if (List.class.isAssignableFrom((Class)localObject))
      {
        paramh.b(25, parama.a("list"));
        paramh.b(184, com.a.a.Map.c.b(ag.class), "processKey", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;");
        break label282;
      }
      paramh.b(25, parama.a("object"));
      paramh.b(184, com.a.a.Map.c.b(ag.class), "processKey", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;");
      break label282;
      label1523:
      if (localClass == Short.TYPE)
      {
        paramh.b(21, parama.a("short"));
        paramh.b(184, com.a.a.Map.c.b(Short.class), "valueOf", "(S)Ljava/lang/Short;");
      }
      else if (localClass == Integer.TYPE)
      {
        paramh.b(21, parama.a("int"));
        paramh.b(184, com.a.a.Map.c.b(Integer.class), "valueOf", "(I)Ljava/lang/Integer;");
      }
      else if (localClass == Character.TYPE)
      {
        paramh.b(21, parama.a("char"));
        paramh.b(184, com.a.a.Map.c.b(Character.class), "valueOf", "(C)Ljava/lang/Character;");
      }
      else if (localClass == Long.TYPE)
      {
        paramh.b(22, parama.b("long"));
        paramh.b(184, com.a.a.Map.c.b(Long.class), "valueOf", "(J)Ljava/lang/Long;");
      }
      else if (localClass == Float.TYPE)
      {
        paramh.b(23, parama.a("float"));
        paramh.b(184, com.a.a.Map.c.b(Float.class), "valueOf", "(F)Ljava/lang/Float;");
      }
      else if (localClass == Double.TYPE)
      {
        paramh.b(24, parama.b("double"));
        paramh.b(184, com.a.a.Map.c.b(Double.class), "valueOf", "(D)Ljava/lang/Double;");
      }
      else if (localClass == Boolean.TYPE)
      {
        paramh.b(21, parama.a("boolean"));
        paramh.b(184, com.a.a.Map.c.b(Boolean.class), "valueOf", "(Z)Ljava/lang/Boolean;");
      }
      else if (localClass == BigDecimal.class)
      {
        paramh.b(25, parama.a("decimal"));
      }
      else if (localClass == String.class)
      {
        paramh.b(25, parama.a("string"));
      }
      else if (localClass.isEnum())
      {
        paramh.b(25, parama.a("enum"));
      }
      else if (List.class.isAssignableFrom(localClass))
      {
        paramh.b(25, parama.a("list"));
      }
      else
      {
        paramh.b(25, parama.a("object"));
      }
    }
  }
  
  private static void a(Class paramClass, h paramh, a parama)
  {
    paramh.b(25, 0);
    paramh.a(187, com.a.a.Map.c.b(ar.class));
    paramh.a(89);
    paramh.a(j.a(com.a.a.Map.c.a(paramClass)));
    paramh.b(183, com.a.a.Map.c.b(ar.class), "<init>", "(" + com.a.a.Map.c.a(Class.class) + ")V");
    paramh.a(181, parama.a(), "nature", com.a.a.Map.c.a(ar.class));
  }
  
  private void a(Class paramClass, h paramh, List paramList, a parama)
    throws Exception
  {
    g localg1 = new g();
    int j = paramList.size();
    Object localObject1 = new g();
    Object localObject2 = new g();
    paramh.b(25, parama.a("out"));
    paramh.a(178, com.a.a.Map.c.b(bl.class), "PrettyFormat", "L" + com.a.a.Map.c.b(bl.class) + ";");
    paramh.b(182, com.a.a.Map.c.b(bk.class), "isEnabled", "(L" + com.a.a.Map.c.b(bl.class) + ";)Z");
    paramh.a(153, (g)localObject1);
    paramh.b(25, 0);
    paramh.a(180, parama.a(), "nature", com.a.a.Map.c.a(ar.class));
    paramh.a(199, (g)localObject2);
    a(paramClass, paramh, parama);
    paramh.a((g)localObject2);
    paramh.b(25, 0);
    paramh.a(180, parama.a(), "nature", com.a.a.Map.c.a(ar.class));
    paramh.b(25, 1);
    paramh.b(25, 2);
    paramh.b(25, 3);
    paramh.b(25, 4);
    paramh.b(182, com.a.a.Map.c.b(ar.class), "write", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V");
    paramh.a(177);
    paramh.a((g)localObject1);
    localObject1 = new g();
    localObject2 = new g();
    paramh.b(25, 1);
    paramh.b(25, 2);
    paramh.b(182, com.a.a.Map.c.b(ap.class), "containsReference", "(Ljava/lang/Object;)Z");
    paramh.a(153, (g)localObject1);
    paramh.b(25, 0);
    paramh.a(180, parama.a(), "nature", com.a.a.Map.c.a(ar.class));
    paramh.a(199, (g)localObject2);
    a(paramClass, paramh, parama);
    paramh.a((g)localObject2);
    paramh.b(25, 0);
    paramh.a(180, parama.a(), "nature", com.a.a.Map.c.a(ar.class));
    paramh.b(25, 1);
    paramh.b(25, 2);
    paramh.b(182, com.a.a.Map.c.b(ar.class), "writeReference", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;)V");
    paramh.a(177);
    paramh.a((g)localObject1);
    paramh.b(25, 1);
    paramh.b(182, com.a.a.Map.c.b(ap.class), "getContext", "()Lcom/alibaba/fastjson/serializer/SerialContext;");
    paramh.b(58, parama.a("parent"));
    paramh.b(25, 1);
    paramh.b(25, parama.a("parent"));
    paramh.b(25, 2);
    paramh.b(25, 3);
    paramh.b(182, com.a.a.Map.c.b(ap.class), "setContext", "(Lcom/alibaba/fastjson/serializer/SerialContext;Ljava/lang/Object;Ljava/lang/Object;)V");
    localObject1 = new g();
    localObject2 = new g();
    g localg2 = new g();
    paramh.b(25, 1);
    paramh.b(25, 4);
    paramh.b(25, 2);
    paramh.b(182, com.a.a.Map.c.b(ap.class), "isWriteClassName", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z");
    paramh.a(153, (g)localObject2);
    paramh.b(25, 4);
    paramh.b(25, 2);
    paramh.b(182, com.a.a.Map.c.b(Object.class), "getClass", "()Ljava/lang/Class;");
    paramh.a(165, (g)localObject2);
    paramh.a(localg2);
    paramh.b(25, parama.a("out"));
    paramh.a("{\"" + maputils.a + "\":\"" + paramClass.getName() + "\"");
    paramh.b(182, com.a.a.Map.c.b(bk.class), "write", "(Ljava/lang/String;)V");
    paramh.b(16, 44);
    paramh.a(167, (g)localObject1);
    paramh.a((g)localObject2);
    paramh.b(16, 123);
    paramh.a((g)localObject1);
    paramh.b(54, parama.a("seperator"));
    int i = 0;
    if (i < j)
    {
      localObject2 = (f)paramList.get(i);
      paramClass = ((f)localObject2).b();
      paramh.a(((f)localObject2).d());
      paramh.b(58, 5);
      if (paramClass == Byte.TYPE)
      {
        paramClass = new g();
        a(paramh, paramClass);
        a(paramh, parama, (f)localObject2);
        paramh.b(54, parama.a("byte"));
        a(paramh, (f)localObject2, parama, paramClass);
        paramh.b(25, parama.a("out"));
        paramh.b(21, parama.a("seperator"));
        paramh.b(25, 5);
        paramh.b(21, parama.a("byte"));
        paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldValue", "(CLjava/lang/String;I)V");
        a(paramh, parama);
        paramh.a(paramClass);
      }
      for (;;)
      {
        i += 1;
        break;
        if (paramClass == Short.TYPE)
        {
          paramClass = new g();
          a(paramh, paramClass);
          a(paramh, parama, (f)localObject2);
          paramh.b(54, parama.a("short"));
          a(paramh, (f)localObject2, parama, paramClass);
          paramh.b(25, parama.a("out"));
          paramh.b(21, parama.a("seperator"));
          paramh.b(25, 5);
          paramh.b(21, parama.a("short"));
          paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldValue", "(CLjava/lang/String;I)V");
          a(paramh, parama);
          paramh.a(paramClass);
        }
        else if (paramClass == Integer.TYPE)
        {
          paramClass = new g();
          a(paramh, paramClass);
          a(paramh, parama, (f)localObject2);
          paramh.b(54, parama.a("int"));
          a(paramh, (f)localObject2, parama, paramClass);
          paramh.b(25, parama.a("out"));
          paramh.b(21, parama.a("seperator"));
          paramh.b(25, 5);
          paramh.b(21, parama.a("int"));
          paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldValue", "(CLjava/lang/String;I)V");
          a(paramh, parama);
          paramh.a(paramClass);
        }
        else if (paramClass == Long.TYPE)
        {
          paramClass = new g();
          a(paramh, paramClass);
          a(paramh, parama, (f)localObject2);
          paramh.b(55, parama.b("long"));
          a(paramh, (f)localObject2, parama, paramClass);
          paramh.b(25, parama.a("out"));
          paramh.b(21, parama.a("seperator"));
          paramh.b(25, 5);
          paramh.b(22, parama.b("long"));
          paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldValue", "(CLjava/lang/String;J)V");
          a(paramh, parama);
          paramh.a(paramClass);
        }
        else if (paramClass == Float.TYPE)
        {
          paramClass = new g();
          a(paramh, paramClass);
          a(paramh, parama, (f)localObject2);
          paramh.b(56, parama.a("float"));
          a(paramh, (f)localObject2, parama, paramClass);
          paramh.b(25, parama.a("out"));
          paramh.b(21, parama.a("seperator"));
          paramh.b(25, 5);
          paramh.b(23, parama.a("float"));
          paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldValue", "(CLjava/lang/String;F)V");
          a(paramh, parama);
          paramh.a(paramClass);
        }
        else if (paramClass == Double.TYPE)
        {
          paramClass = new g();
          a(paramh, paramClass);
          a(paramh, parama, (f)localObject2);
          paramh.b(57, parama.b("double"));
          a(paramh, (f)localObject2, parama, paramClass);
          paramh.b(25, parama.a("out"));
          paramh.b(21, parama.a("seperator"));
          paramh.b(25, 5);
          paramh.b(24, parama.b("double"));
          paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldValue", "(CLjava/lang/String;D)V");
          a(paramh, parama);
          paramh.a(paramClass);
        }
        else if (paramClass == Boolean.TYPE)
        {
          paramClass = new g();
          a(paramh, paramClass);
          a(paramh, parama, (f)localObject2);
          paramh.b(54, parama.a("boolean"));
          a(paramh, (f)localObject2, parama, paramClass);
          paramh.b(25, parama.a("out"));
          paramh.b(21, parama.a("seperator"));
          paramh.b(25, 5);
          paramh.b(21, parama.a("boolean"));
          paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldValue", "(CLjava/lang/String;Z)V");
          a(paramh, parama);
          paramh.a(paramClass);
        }
        else if (paramClass == Character.TYPE)
        {
          paramClass = new g();
          a(paramh, paramClass);
          a(paramh, parama, (f)localObject2);
          paramh.b(54, parama.a("char"));
          a(paramh, (f)localObject2, parama, paramClass);
          paramh.b(25, parama.a("out"));
          paramh.b(21, parama.a("seperator"));
          paramh.b(25, 5);
          paramh.b(21, parama.a("char"));
          paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldValue", "(CLjava/lang/String;C)V");
          a(paramh, parama);
          paramh.a(paramClass);
        }
        else if (paramClass == String.class)
        {
          paramClass = new g();
          a(paramh, paramClass);
          a(paramh, parama, (f)localObject2);
          paramh.b(58, parama.a("string"));
          a(paramh, (f)localObject2, parama, paramClass);
          localObject1 = new g();
          localg2 = new g();
          paramh.b(25, parama.a("string"));
          paramh.a(199, (g)localObject1);
          b(paramh, (f)localObject2, parama);
          paramh.a(167, localg2);
          paramh.a((g)localObject1);
          paramh.b(25, parama.a("out"));
          paramh.b(21, parama.a("seperator"));
          paramh.b(25, 5);
          paramh.b(25, parama.a("string"));
          paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldValue", "(CLjava/lang/String;Ljava/lang/String;)V");
          a(paramh, parama);
          paramh.a(localg2);
          paramh.a(paramClass);
        }
        else
        {
          g localg3;
          if (paramClass == BigDecimal.class)
          {
            paramClass = new g();
            a(paramh, paramClass);
            a(paramh, parama, (f)localObject2);
            paramh.b(58, parama.a("decimal"));
            a(paramh, (f)localObject2, parama, paramClass);
            localObject1 = new g();
            localg2 = new g();
            localg3 = new g();
            paramh.a((g)localObject1);
            paramh.b(25, parama.a("decimal"));
            paramh.a(199, localg2);
            b(paramh, (f)localObject2, parama);
            paramh.a(167, localg3);
            paramh.a(localg2);
            paramh.b(25, parama.a("out"));
            paramh.b(21, parama.a("seperator"));
            paramh.b(25, 5);
            paramh.b(25, parama.a("decimal"));
            paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldValue", "(CLjava/lang/String;Ljava/math/BigDecimal;)V");
            a(paramh, parama);
            paramh.a(167, localg3);
            paramh.a(localg3);
            paramh.a(paramClass);
          }
          else
          {
            if (List.class.isAssignableFrom(paramClass))
            {
              paramClass = ((f)localObject2).c();
              if ((paramClass instanceof Class)) {}
              for (paramClass = Object.class;; paramClass = ((java.lang.reflect.ParameterizedType)paramClass).getActualTypeArguments()[0])
              {
                localObject1 = null;
                if ((paramClass instanceof Class)) {
                  localObject1 = (Class)paramClass;
                }
                localg2 = new g();
                g localg4 = new g();
                g localg5 = new g();
                localg3 = new g();
                paramh.a(localg4);
                a(paramh, localg2);
                a(paramh, parama, (f)localObject2);
                paramh.a(192, com.a.a.Map.c.b(List.class));
                paramh.b(58, parama.a("list"));
                a(paramh, (f)localObject2, parama, localg2);
                paramh.b(25, parama.a("list"));
                paramh.a(199, localg5);
                b(paramh, (f)localObject2, parama);
                paramh.a(167, localg3);
                paramh.a(localg5);
                paramh.b(25, parama.a("out"));
                paramh.b(21, parama.a("seperator"));
                paramh.b(182, com.a.a.Map.c.b(bk.class), "write", "(C)V");
                paramh.b(25, parama.a("out"));
                paramh.b(25, 5);
                paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldName", "(Ljava/lang/String;)V");
                paramh.b(25, parama.a("list"));
                paramh.b(185, com.a.a.Map.c.b(List.class), "size", "()I");
                paramh.b(54, parama.a("int"));
                localg4 = new g();
                localg5 = new g();
                localObject2 = new g();
                paramh.a(localg4);
                paramh.b(21, parama.a("int"));
                paramh.a(3);
                paramh.a(160, localg5);
                paramh.b(25, parama.a("out"));
                paramh.a("[]");
                paramh.b(182, com.a.a.Map.c.b(bk.class), "write", "(Ljava/lang/String;)V");
                paramh.a(167, (g)localObject2);
                paramh.a(localg5);
                paramh.b(25, 1);
                paramh.b(25, parama.a("list"));
                paramh.b(25, 5);
                paramh.b(182, com.a.a.Map.c.b(ap.class), "setContext", "(Ljava/lang/Object;Ljava/lang/Object;)V");
                paramh.b(25, parama.a("out"));
                paramh.b(16, 91);
                paramh.b(182, com.a.a.Map.c.b(bk.class), "write", "(C)V");
                paramh.a(1);
                paramh.a(192, com.a.a.Map.c.b(bb.class));
                paramh.b(58, parama.a("list_ser"));
                localg4 = new g();
                localg5 = new g();
                paramh.a(3);
                paramh.b(54, parama.a("runningtaskinfolist"));
                paramh.a(localg4);
                paramh.b(21, parama.a("runningtaskinfolist"));
                paramh.b(21, parama.a("int"));
                paramh.a(4);
                paramh.a(100);
                paramh.a(162, localg5);
                if (paramClass != String.class) {
                  break label3652;
                }
                paramh.b(25, parama.a("out"));
                paramh.b(25, parama.a("list"));
                paramh.b(21, parama.a("runningtaskinfolist"));
                paramh.b(185, com.a.a.Map.c.b(List.class), "get", "(I)Ljava/lang/Object;");
                paramh.a(192, com.a.a.Map.c.b(String.class));
                paramh.b(16, 44);
                paramh.b(182, com.a.a.Map.c.b(bk.class), "writeString", "(Ljava/lang/String;C)V");
                paramh.b(parama.a("runningtaskinfolist"));
                paramh.a(167, localg4);
                paramh.a(localg5);
                if (paramClass != String.class) {
                  break label3874;
                }
                paramh.b(25, parama.a("out"));
                paramh.b(25, parama.a("list"));
                paramh.b(21, parama.a("int"));
                paramh.a(4);
                paramh.a(100);
                paramh.b(185, com.a.a.Map.c.b(List.class), "get", "(I)Ljava/lang/Object;");
                paramh.a(192, com.a.a.Map.c.b(String.class));
                paramh.b(16, 93);
                paramh.b(182, com.a.a.Map.c.b(bk.class), "writeString", "(Ljava/lang/String;C)V");
                paramh.b(25, 1);
                paramh.b(182, com.a.a.Map.c.b(ap.class), "popContext", "()V");
                paramh.a((g)localObject2);
                a(paramh, parama);
                paramh.a(localg3);
                paramh.a(localg2);
                break;
              }
              label3652:
              paramh.b(25, 1);
              paramh.b(25, parama.a("list"));
              paramh.b(21, parama.a("runningtaskinfolist"));
              paramh.b(185, com.a.a.Map.c.b(List.class), "get", "(I)Ljava/lang/Object;");
              paramh.b(21, parama.a("runningtaskinfolist"));
              paramh.b(184, com.a.a.Map.c.b(Integer.class), "valueOf", "(I)Ljava/lang/Integer;");
              if ((localObject1 != null) && (Modifier.isPublic(((Class)localObject1).getModifiers())))
              {
                paramh.a(j.a(com.a.a.Map.c.a((Class)paramClass)));
                paramh.b(182, com.a.a.Map.c.b(ap.class), "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V");
              }
              for (;;)
              {
                paramh.b(25, parama.a("out"));
                paramh.b(16, 44);
                paramh.b(182, com.a.a.Map.c.b(bk.class), "write", "(C)V");
                break;
                paramh.b(182, com.a.a.Map.c.b(ap.class), "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;)V");
              }
              label3874:
              paramh.b(25, 1);
              paramh.b(25, parama.a("list"));
              paramh.b(21, parama.a("runningtaskinfolist"));
              paramh.b(185, com.a.a.Map.c.b(List.class), "get", "(I)Ljava/lang/Object;");
              paramh.b(21, parama.a("runningtaskinfolist"));
              paramh.b(184, com.a.a.Map.c.b(Integer.class), "valueOf", "(I)Ljava/lang/Integer;");
              if ((localObject1 != null) && (Modifier.isPublic(((Class)localObject1).getModifiers())))
              {
                paramh.a(j.a(com.a.a.Map.c.a((Class)paramClass)));
                paramh.b(182, com.a.a.Map.c.b(ap.class), "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V");
              }
              for (;;)
              {
                paramh.b(25, parama.a("out"));
                paramh.b(16, 93);
                paramh.b(182, com.a.a.Map.c.b(bk.class), "write", "(C)V");
                break;
                paramh.b(182, com.a.a.Map.c.b(ap.class), "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;)V");
              }
            }
            if (paramClass.isEnum())
            {
              a(paramh, (f)localObject2, parama);
            }
            else
            {
              paramClass = new g();
              a(paramh, paramClass);
              a(paramh, parama, (f)localObject2);
              paramh.b(58, parama.a("object"));
              a(paramh, (f)localObject2, parama, paramClass);
              b(paramh, (f)localObject2, parama, paramClass);
              paramh.a(paramClass);
            }
          }
        }
      }
    }
    paramClass = new g();
    paramList = new g();
    localObject1 = new g();
    paramh.a(paramClass);
    paramh.b(21, parama.a("seperator"));
    paramh.a(16, 123);
    paramh.a(160, paramList);
    paramh.b(25, parama.a("out"));
    paramh.a("{}");
    paramh.b(182, com.a.a.Map.c.b(bk.class), "write", "(Ljava/lang/String;)V");
    paramh.a(167, (g)localObject1);
    paramh.a(paramList);
    paramh.b(25, parama.a("out"));
    paramh.b(16, 125);
    paramh.b(182, com.a.a.Map.c.b(bk.class), "write", "(C)V");
    paramh.a((g)localObject1);
    paramh.a(localg1);
    paramh.b(25, 1);
    paramh.b(25, parama.a("parent"));
    paramh.b(182, com.a.a.Map.c.b(ap.class), "setContext", "(Lcom/alibaba/fastjson/serializer/SerialContext;)V");
  }
  
  private static void b(h paramh, f paramf, a parama)
  {
    Class localClass = paramf.b();
    g localg4 = new g();
    g localg1 = new g();
    g localg2 = new g();
    g localg3 = new g();
    paramh.a(localg4);
    paramf = (b)paramf.a(b.class);
    int i6;
    int i5;
    int i4;
    int i3;
    int i2;
    if (paramf != null)
    {
      paramf = paramf.e();
      int i7 = paramf.length;
      int n = 0;
      int m = 0;
      int k = 0;
      int j = 0;
      int i = 0;
      int i1 = 0;
      i6 = n;
      i5 = m;
      i4 = k;
      i3 = j;
      i2 = i;
      if (i1 < i7)
      {
        localg4 = paramf[i1];
        if (localg4 == bl.c)
        {
          i5 = 1;
          i4 = j;
          i3 = k;
          i2 = m;
        }
        for (;;)
        {
          i1 += 1;
          m = i2;
          k = i3;
          j = i4;
          i = i5;
          break;
          if (localg4 == bl.h)
          {
            i4 = 1;
            i2 = m;
            i3 = k;
            i5 = i;
          }
          else if (localg4 == bl.g)
          {
            i3 = 1;
            i2 = m;
            i4 = j;
            i5 = i;
          }
          else if (localg4 == bl.i)
          {
            i2 = 1;
            i3 = k;
            i4 = j;
            i5 = i;
          }
          else
          {
            i2 = m;
            i3 = k;
            i4 = j;
            i5 = i;
            if (localg4 == bl.f)
            {
              n = 1;
              i2 = m;
              i3 = k;
              i4 = j;
              i5 = i;
            }
          }
        }
      }
    }
    else
    {
      i6 = 0;
      i5 = 0;
      i4 = 0;
      i3 = 0;
      i2 = 0;
    }
    if (i2 == 0)
    {
      paramh.b(25, parama.a("out"));
      paramh.a(178, com.a.a.Map.c.b(bl.class), "WriteMapNullValue", "L" + com.a.a.Map.c.b(bl.class) + ";");
      paramh.b(182, com.a.a.Map.c.b(bk.class), "isEnabled", "(L" + com.a.a.Map.c.b(bl.class) + ";)Z");
      paramh.a(153, localg1);
    }
    paramh.a(localg2);
    paramh.b(25, parama.a("out"));
    paramh.b(21, parama.a("seperator"));
    paramh.b(25, 5);
    if ((localClass == String.class) || (localClass == Character.class)) {
      if (i4 != 0)
      {
        paramh.a("");
        paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldValue", "(CLjava/lang/String;Ljava/lang/String;)V");
      }
    }
    for (;;)
    {
      a(paramh, parama);
      paramh.a(167, localg3);
      paramh.a(localg1);
      paramh.a(localg3);
      return;
      paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldNullString", "(CLjava/lang/String;)V");
      continue;
      if (Number.class.isAssignableFrom(localClass))
      {
        if (i3 != 0)
        {
          paramh.a(3);
          paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldValue", "(CLjava/lang/String;I)V");
        }
        else
        {
          paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldNullNumber", "(CLjava/lang/String;)V");
        }
      }
      else if (localClass == Boolean.class)
      {
        if (i5 != 0)
        {
          paramh.a(3);
          paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldValue", "(CLjava/lang/String;Z)V");
        }
        else
        {
          paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldNullBoolean", "(CLjava/lang/String;)V");
        }
      }
      else if ((Collection.class.isAssignableFrom(localClass)) || (localClass.isArray()))
      {
        if (i6 != 0) {
          paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldEmptyList", "(CLjava/lang/String;)V");
        } else {
          paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldNullList", "(CLjava/lang/String;)V");
        }
      }
      else {
        paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldNull", "(CLjava/lang/String;)V");
      }
    }
  }
  
  private static void b(h paramh, f paramf, a parama, g paramg)
  {
    Object localObject1 = (b)paramf.a(b.class);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = ((b)localObject1).b();
      localObject1 = localObject2;
      if (((String)localObject2).trim().length() != 0) {}
    }
    for (localObject1 = null;; localObject1 = null)
    {
      localObject2 = new g();
      paramh.b(25, 7);
      paramh.a(199, (g)localObject2);
      b(paramh, paramf, parama);
      paramh.a(167, paramg);
      paramh.a((g)localObject2);
      paramh.b(25, parama.a("out"));
      paramh.b(21, parama.a("seperator"));
      paramh.b(182, com.a.a.Map.c.b(bk.class), "write", "(C)V");
      paramh.b(25, parama.a("out"));
      paramh.b(25, 5);
      paramh.b(182, com.a.a.Map.c.b(bk.class), "writeFieldName", "(Ljava/lang/String;)V");
      paramh.b(25, 1);
      paramh.b(25, 7);
      if (localObject1 != null)
      {
        paramh.a(localObject1);
        paramh.b(182, com.a.a.Map.c.b(ap.class), "writeWithFormat", "(Ljava/lang/Object;Ljava/lang/String;)V");
      }
      for (;;)
      {
        a(paramh, parama);
        return;
        paramh.b(25, 5);
        if (((paramf.c() instanceof Class)) && (((Class)paramf.c()).isPrimitive()))
        {
          paramh.b(182, com.a.a.Map.c.b(ap.class), "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;)V");
        }
        else
        {
          paramh.b(25, 0);
          paramh.a(180, parama.a(), paramf.d() + "_asm_fieldType", "Ljava/lang/reflect/Type;");
          paramh.b(182, com.a.a.Map.c.b(ap.class), "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V");
        }
      }
    }
  }
  
  public final bb a(Class paramClass)
    throws Exception
  {
    if (paramClass.isPrimitive()) {
      throw new runtimeexception("unsupportd class " + paramClass.getName());
    }
    List localList = k.a(paramClass, false);
    String str = "Serializer_" + this.b.incrementAndGet();
    com.a.a.b.c localc = new com.a.a.b.c();
    localc.a(str, "java/lang/Object", new String[] { "com/alibaba/fastjson/serializer/ObjectSerializer" });
    localc.a(2, "nature", com.a.a.Map.c.a(ar.class));
    Object localObject1 = localList.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (f)((Iterator)localObject1).next();
      localc.a(1, ((f)localObject2).d() + "_asm_fieldPrefix", "Ljava/lang/reflect/Type;");
      localc.a(1, ((f)localObject2).d() + "_asm_fieldType", "Ljava/lang/reflect/Type;");
    }
    localObject1 = localc.b("<init>", "()V", null);
    ((h)localObject1).b(25, 0);
    ((h)localObject1).b(183, "java/lang/Object", "<init>", "()V");
    Object localObject2 = localList.iterator();
    if (((Iterator)localObject2).hasNext())
    {
      localObject3 = (f)((Iterator)localObject2).next();
      ((h)localObject1).b(25, 0);
      ((h)localObject1).a(j.a(com.a.a.Map.c.a(((f)localObject3).a())));
      if (((f)localObject3).e() != null)
      {
        ((h)localObject1).a(((f)localObject3).e().getName());
        ((h)localObject1).b(184, com.a.a.Map.c.b(com.a.a.Map.c.class), "getMethodType", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Type;");
      }
      for (;;)
      {
        ((h)localObject1).a(181, str, ((f)localObject3).d() + "_asm_fieldType", "Ljava/lang/reflect/Type;");
        break;
        ((h)localObject1).a(((f)localObject3).f().getName());
        ((h)localObject1).b(184, com.a.a.Map.c.b(com.a.a.Map.c.class), "getFieldType", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Type;");
      }
    }
    ((h)localObject1).a(177);
    ((h)localObject1).c(4, 4);
    localObject1 = new a(str);
    localObject2 = localc.b("write", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V", new String[] { "java/io/IOException" });
    ((h)localObject2).b(25, 1);
    ((h)localObject2).b(182, com.a.a.Map.c.b(ap.class), "getWriter", "()" + com.a.a.Map.c.a(bk.class));
    ((h)localObject2).b(58, ((a)localObject1).a("out"));
    Object localObject3 = (maputils.c)paramClass.getAnnotation(maputils.c.class);
    if ((localObject3 == null) || (((maputils.c)localObject3).d()))
    {
      localObject3 = new g();
      ((h)localObject2).b(25, ((a)localObject1).a("out"));
      ((h)localObject2).a(178, com.a.a.Map.c.b(bl.class), "SortField", "L" + com.a.a.Map.c.b(bl.class) + ";");
      ((h)localObject2).b(182, com.a.a.Map.c.b(bk.class), "isEnabled", "(L" + com.a.a.Map.c.b(bl.class) + ";)Z");
      ((h)localObject2).a(153, (g)localObject3);
      ((h)localObject2).b(25, 0);
      ((h)localObject2).b(25, 1);
      ((h)localObject2).b(25, 2);
      ((h)localObject2).b(25, 3);
      ((h)localObject2).b(25, 4);
      ((h)localObject2).b(182, str, "write1", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V");
      ((h)localObject2).a(177);
      ((h)localObject2).a((g)localObject3);
    }
    ((h)localObject2).b(25, 2);
    ((h)localObject2).a(192, com.a.a.Map.c.b(paramClass));
    ((h)localObject2).b(58, ((a)localObject1).a("entity"));
    a(paramClass, (h)localObject2, localList, (a)localObject1);
    ((h)localObject2).a(177);
    ((h)localObject2).c(5, ((a)localObject1).b() + 1);
    localList = k.a(paramClass, true);
    localObject1 = new a(str);
    localObject2 = localc.b("write1", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V", new String[] { "java/io/IOException" });
    ((h)localObject2).b(25, 1);
    ((h)localObject2).b(182, com.a.a.Map.c.b(ap.class), "getWriter", "()" + com.a.a.Map.c.a(bk.class));
    ((h)localObject2).b(58, ((a)localObject1).a("out"));
    ((h)localObject2).b(25, 2);
    ((h)localObject2).a(192, com.a.a.Map.c.b(paramClass));
    ((h)localObject2).b(58, ((a)localObject1).a("entity"));
    a(paramClass, (h)localObject2, localList, (a)localObject1);
    ((h)localObject2).a(177);
    ((h)localObject2).c(5, ((a)localObject1).b() + 1);
    paramClass = localc.a();
    return (bb)this.a.a(str, paramClass, paramClass.length).newInstance();
  }
  
  public final boolean b(Class paramClass)
  {
    return this.a.a(paramClass);
  }
  
  static final class a
  {
    private final String a;
    private int b = 8;
    private Map c = new HashMap();
    
    public a(String paramString)
    {
      this.a = paramString;
    }
    
    public final int a(String paramString)
    {
      if ((Integer)this.c.get(paramString) == null)
      {
        Map localMap = this.c;
        int i = this.b;
        this.b = (i + 1);
        localMap.put(paramString, Integer.valueOf(i));
      }
      return ((Integer)this.c.get(paramString)).intValue();
    }
    
    public final String a()
    {
      return this.a;
    }
    
    public final int b()
    {
      return this.b;
    }
    
    public final int b(String paramString)
    {
      if ((Integer)this.c.get(paramString) == null)
      {
        this.c.put(paramString, Integer.valueOf(this.b));
        this.b += 2;
      }
      return ((Integer)this.c.get(paramString)).intValue();
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.XhookMethod

 * JD-Core Version:    0.7.0.1

 */