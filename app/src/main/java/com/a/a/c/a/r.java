package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.runtimeexception;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public final class r
  implements aq
{
  public static final r a = new r();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    if (paramc.k().c() == 8)
    {
      paramc.k().a(16);
      return null;
    }
    Object localObject = paramType;
    Class localClass;
    if ((localObject instanceof Class))
    {
      localClass = (Class)localObject;
      if (localClass != AbstractCollection.class) {
        break label120;
      }
      localObject = new ArrayList();
      label57:
      if (!(paramType instanceof ParameterizedType)) {
        break label250;
      }
    }
    label120:
    label250:
    for (paramType = ((ParameterizedType)paramType).getActualTypeArguments()[0];; paramType = Object.class) {
      for (;;)
      {
        paramc.a(paramType, (Collection)localObject, paramObject);
        return localObject;
        if ((localObject instanceof ParameterizedType))
        {
          localObject = ((ParameterizedType)localObject).getRawType();
          break;
        }
        throw new runtimeexception("TODO");
        if (localClass.isAssignableFrom(HashSet.class))
        {
          localObject = new HashSet();
          break label57;
        }
        if (localClass.isAssignableFrom(LinkedHashSet.class))
        {
          localObject = new LinkedHashSet();
          break label57;
        }
        if (localClass.isAssignableFrom(TreeSet.class))
        {
          localObject = new TreeSet();
          break label57;
        }
        if (localClass.isAssignableFrom(ArrayList.class))
        {
          localObject = new ArrayList();
          break label57;
        }
        try
        {
          localObject = (Collection)localClass.newInstance();
        }
        catch (Exception paramc)
        {
          throw new runtimeexception("create instane error, class " + localClass.getName());
        }
      }
    }
  }
  
  public final int a_()
  {
    return 14;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.r

 * JD-Core Version:    0.7.0.1

 */