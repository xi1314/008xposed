package com.a.a.c.a;

import com.a.a.maputils;
import com.a.a.c.c;
import com.a.a.c.e;
import com.a.a.c.j;
import com.a.a.Map.k;
import com.a.a.runtimeexception;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.HashMap;

public final class az
  extends ah
{
  public az(j paramj, Class paramClass)
  {
    super(paramj, paramClass);
  }
  
  private static Throwable a(String paramString, Throwable paramThrowable, Class paramClass)
    throws Exception
  {
    Object localObject2 = null;
    Object localObject1 = null;
    Constructor[] arrayOfConstructor = paramClass.getConstructors();
    int j = arrayOfConstructor.length;
    int i = 0;
    Object localObject3 = null;
    paramClass = (Class)localObject2;
    if (i < j)
    {
      localObject2 = arrayOfConstructor[i];
      if (((Constructor)localObject2).getParameterTypes().length == 0)
      {
        paramClass = (Class)localObject1;
        localObject1 = localObject2;
      }
    }
    for (;;)
    {
      i += 1;
      localObject2 = localObject1;
      localObject1 = paramClass;
      paramClass = (Class)localObject2;
      break;
      if ((((Constructor)localObject2).getParameterTypes().length == 1) && (localObject2.getParameterTypes()[0] == String.class))
      {
        localObject1 = paramClass;
        paramClass = (Class)localObject2;
      }
      else if ((((Constructor)localObject2).getParameterTypes().length == 2) && (localObject2.getParameterTypes()[0] == String.class) && (localObject2.getParameterTypes()[1] == Throwable.class))
      {
        Class localClass = paramClass;
        localObject3 = localObject2;
        paramClass = (Class)localObject1;
        localObject1 = localClass;
        continue;
        if (localObject3 != null) {
          return (Throwable)localObject3.newInstance(new Object[] { paramString, paramThrowable });
        }
        if (localObject1 != null) {
          return (Throwable)((Constructor)localObject1).newInstance(new Object[] { paramString });
        }
        if (paramClass != null) {
          return (Throwable)paramClass.newInstance(new Object[0]);
        }
        return null;
      }
      else
      {
        localObject2 = paramClass;
        paramClass = (Class)localObject1;
        localObject1 = localObject2;
      }
    }
  }
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    e locale = paramc.k();
    if (locale.c() == 8)
    {
      locale.a();
      paramObject = null;
      return paramObject;
    }
    label38:
    Throwable localThrowable;
    if (paramc.d() == 2)
    {
      paramc.a(0);
      localThrowable = null;
      if ((paramType == null) || (!(paramType instanceof Class))) {
        break label432;
      }
      paramType = (Class)paramType;
      if (!Throwable.class.isAssignableFrom(paramType)) {
        break label432;
      }
    }
    for (;;)
    {
      String str1 = null;
      String str2 = null;
      HashMap localHashMap = new HashMap();
      paramObject = paramType;
      paramType = str2;
      label86:
      str2 = locale.a(paramc.b());
      if (str2 == null) {
        if (locale.c() == 13)
        {
          locale.a(16);
          if (paramObject != null) {
            break label390;
          }
          paramc = new Exception(str1, localThrowable);
        }
      }
      for (;;)
      {
        paramObject = paramc;
        if (paramType == null) {
          break;
        }
        paramc.setStackTrace(paramType);
        return paramc;
        if (locale.c() == 12) {
          break label38;
        }
        throw new runtimeexception("syntax error");
        if ((locale.c() == 16) && (locale.a(com.a.a.c.d.g))) {
          break label86;
        }
        locale.b(4);
        if (maputils.a.equals(str2)) {
          if (locale.c() == 4)
          {
            paramObject = k.a(locale.s());
            locale.a(16);
          }
        }
        for (;;)
        {
          if (locale.c() != 13) {
            break label387;
          }
          locale.a(16);
          break;
          throw new runtimeexception("syntax error");
          if ("message".equals(str2))
          {
            if (locale.c() == 8) {}
            for (str1 = null;; str1 = locale.s())
            {
              locale.a();
              break;
              if (locale.c() != 4) {
                break label311;
              }
            }
            label311:
            throw new runtimeexception("syntax error");
          }
          if ("cause".equals(str2)) {
            localThrowable = (Throwable)a(paramc, null, "cause");
          } else if ("stackTrace".equals(str2)) {
            paramType = (StackTraceElement[])paramc.a([Ljava.lang.StackTraceElement.class);
          } else {
            localHashMap.put(str2, paramc.j());
          }
        }
        label387:
        break label86;
        try
        {
          label390:
          paramObject = a(str1, localThrowable, paramObject);
          paramc = paramObject;
          if (paramObject == null) {
            paramc = new Exception(str1, localThrowable);
          }
        }
        catch (Exception paramc)
        {
          throw new runtimeexception("create instance error", paramc);
        }
      }
      label432:
      paramType = null;
    }
  }
  
  public final int a_()
  {
    return 12;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.az

 * JD-Core Version:    0.7.0.1

 */