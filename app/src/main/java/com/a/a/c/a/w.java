package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.runtimeexception;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public final class w
  implements aq
{
  private final Class a;
  private final Map b = new HashMap();
  private final Map c = new HashMap();
  
  public w(Class paramClass)
  {
    this.a = paramClass;
    try
    {
      Object[] arrayOfObject = (Object[])paramClass.getMethod("values", new Class[0]).invoke(null, new Object[0]);
      int j = arrayOfObject.length;
      int i = 0;
      while (i < j)
      {
        Enum localEnum = (Enum)arrayOfObject[i];
        this.b.put(Integer.valueOf(localEnum.ordinal()), localEnum);
        this.c.put(localEnum.name(), localEnum);
        i += 1;
      }
      return;
    }
    catch (Exception localException)
    {
      throw new runtimeexception("init enum values error, " + paramClass.getName());
    }
  }
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    try
    {
      paramType = paramc.k();
      if (paramType.c() == 2)
      {
        paramc = Integer.valueOf(paramType.p());
        paramType.a(16);
        paramType = this.b.get(paramc);
        if (paramType != null) {
          return paramType;
        }
        throw new runtimeexception("parse enum " + this.a.getName() + " error, value : " + paramc);
      }
    }
    catch (runtimeexception paramc)
    {
      throw paramc;
      if (paramType.c() == 4)
      {
        paramc = paramType.s();
        paramType.a(16);
        if (paramc.length() == 0) {
          return null;
        }
        this.c.get(paramc);
        return Enum.valueOf(this.a, paramc);
      }
      if (paramType.c() == 8)
      {
        paramType.a(16);
        return null;
      }
    }
    catch (Throwable paramc)
    {
      throw new runtimeexception(paramc.getMessage(), paramc);
    }
    paramc = paramc.j();
    throw new runtimeexception("parse enum " + this.a.getName() + " error, value : " + paramc);
    return paramType;
  }
  
  public final int a_()
  {
    return 2;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.w

 * JD-Core Version:    0.7.0.1

 */