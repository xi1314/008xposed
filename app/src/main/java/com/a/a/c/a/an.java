package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.c.e;
import com.a.a.c.g;
import com.a.a.c.i;
import com.a.a.Map.k;
import com.a.a.runtimeexception;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class an
  implements aq
{
  public static final an a = new an();
  
  private static Object a(c paramc, Map paramMap, Type paramType1, Type paramType2)
  {
    e locale = paramc.k();
    if ((locale.c() != 12) && (locale.c() != 16)) {
      throw new runtimeexception("syntax error, expect {, actual " + locale.d());
    }
    aq localaq1 = paramc.c().a(paramType1);
    aq localaq2 = paramc.c().a(paramType2);
    locale.a(localaq1.a_());
    i locali = paramc.f();
    for (;;)
    {
      try
      {
        if (locale.c() == 13)
        {
          locale.a(16);
          return paramMap;
        }
        if ((locale.c() != 4) || (!locale.r())) {
          break label314;
        }
        locale.b(4);
        if (locale.c() != 4) {
          break label268;
        }
        paramMap = locale.s();
        if ("..".equals(paramMap))
        {
          paramMap = locali.c().b();
          locale.a(13);
          if (locale.c() == 13) {
            break label299;
          }
          throw new runtimeexception("illegal ref");
        }
      }
      finally
      {
        paramc.a(locali);
      }
      if ("$".equals(paramMap))
      {
        for (paramMap = locali; paramMap.c() != null; paramMap = paramMap.c()) {}
        paramMap = paramMap.b();
      }
      else
      {
        paramc.a(new c.a(locali, paramMap));
        paramc.a(1);
        paramMap = null;
        continue;
        label268:
        throw new runtimeexception("illegal ref, " + g.a(locale.c()));
        label299:
        locale.a(16);
        paramc.a(locali);
        return paramMap;
        label314:
        if ((paramMap.size() == 0) && (locale.c() == 4) && (a.a.equals(locale.s())))
        {
          locale.b(4);
          locale.a(16);
          if (locale.c() == 13)
          {
            locale.a();
            paramc.a(locali);
            return paramMap;
          }
          locale.a(localaq1.a_());
        }
        Object localObject = localaq1.a(paramc, paramType1, null);
        if (locale.c() != 17) {
          throw new runtimeexception("syntax error, expect :, actual " + locale.c());
        }
        locale.a(localaq2.a_());
        paramMap.put(localObject, localaq2.a(paramc, paramType2, localObject));
        if (locale.c() == 16) {
          locale.a(localaq1.a_());
        }
      }
    }
  }
  
  private static Map a(c paramc, Map paramMap, Type paramType, Object paramObject)
  {
    e locale = paramc.k();
    if (locale.c() != 12) {
      throw new runtimeexception("syntax error, expect {, actual " + locale.c());
    }
    i locali = paramc.f();
    int i;
    label384:
    label531:
    do
    {
      Object localObject1;
      do
      {
        int j;
        try
        {
          locale.u();
          i = locale.k();
          j = i;
          if (paramc.a(com.a.a.c.d.g)) {
            for (;;)
            {
              j = i;
              if (i != 44) {
                break;
              }
              locale.l();
              locale.u();
              i = locale.k();
            }
          }
          if (j == 34)
          {
            localObject1 = locale.a(paramc.b(), '"');
            locale.u();
            if (locale.k() == ':') {
              break label384;
            }
            throw new runtimeexception("expect ':' at " + locale.e());
          }
        }
        finally
        {
          paramc.a(locali);
        }
        if (j == 125)
        {
          locale.l();
          locale.m();
          locale.a(16);
          paramc.a(locali);
          return paramMap;
        }
        if (j == 39)
        {
          if (!paramc.a(com.a.a.c.d.d)) {
            throw new runtimeexception("syntax error");
          }
          localObject1 = locale.a(paramc.b(), '\'');
          locale.u();
          if (locale.k() != ':') {
            throw new runtimeexception("expect ':' at " + locale.e());
          }
        }
        else
        {
          if (!paramc.a(com.a.a.c.d.c)) {
            throw new runtimeexception("syntax error");
          }
          localObject1 = locale.b(paramc.b());
          locale.u();
          char c = locale.k();
          if (c != ':') {
            throw new runtimeexception("expect ':' at " + locale.e() + ", actual " + c);
          }
        }
        locale.l();
        locale.u();
        locale.k();
        locale.m();
        if (localObject1 != a.a) {
          break label531;
        }
        localObject1 = k.a(locale.a(paramc.b(), '"'));
        if (localObject1 != paramMap.getClass()) {
          break;
        }
        locale.a(16);
      } while (locale.c() != 13);
      locale.a(16);
      paramc.a(locali);
      return paramMap;
      paramMap = paramc.c().a((Type)localObject1);
      locale.a(16);
      paramc.a(2);
      if ((locali != null) && (!(paramObject instanceof Integer))) {
        paramc.i();
      }
      paramMap = (Map)paramMap.a(paramc, (Type)localObject1, paramObject);
      paramc.a(locali);
      return paramMap;
      locale.a();
      Object localObject2;
      if (locale.c() == 8)
      {
        localObject2 = null;
        locale.a();
      }
      for (;;)
      {
        paramMap.put(localObject1, localObject2);
        paramc.a(paramMap, (String)localObject1);
        paramc.a(locali, localObject2, localObject1);
        i = locale.c();
        if ((i != 20) && (i != 15)) {
          break;
        }
        paramc.a(locali);
        return paramMap;
        localObject2 = paramc.a(paramType);
      }
    } while (i != 13);
    locale.a();
    paramc.a(locali);
    return paramMap;
  }
  
  private static Map a(Type paramType)
  {
    for (;;)
    {
      if (paramType == Properties.class) {
        return new Properties();
      }
      if (paramType == Hashtable.class) {
        return new Hashtable();
      }
      if (paramType == IdentityHashMap.class) {
        return new IdentityHashMap();
      }
      if ((paramType == SortedMap.class) || (paramType == TreeMap.class)) {
        return new TreeMap();
      }
      if ((paramType == ConcurrentMap.class) || (paramType == ConcurrentHashMap.class)) {
        return new ConcurrentHashMap();
      }
      if ((paramType == Map.class) || (paramType == HashMap.class)) {
        return new HashMap();
      }
      if (paramType == LinkedHashMap.class) {
        return new LinkedHashMap();
      }
      if (!(paramType instanceof ParameterizedType)) {
        break;
      }
      paramType = ((ParameterizedType)paramType).getRawType();
    }
    Object localObject = (Class)paramType;
    if (((Class)localObject).isInterface()) {
      throw new runtimeexception("unsupport type " + paramType);
    }
    try
    {
      localObject = (Map)((Class)localObject).newInstance();
      return localObject;
    }
    catch (Exception localException)
    {
      throw new runtimeexception("unsupport type " + paramType, localException);
    }
  }
  
  /* Error */
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 24	com/XhookMethod/XhookMethod/saveaccountdatatoFile/saveaccountdatatoFile:k	()Lcom/XhookMethod/XhookMethod/saveaccountdatatoFile/packageinfolist;
    //   4: astore 4
    //   6: aload 4
    //   8: invokevirtual 30	com/XhookMethod/XhookMethod/saveaccountdatatoFile/packageinfolist:saveaccountdatatoFile	()I
    //   11: bipush 8
    //   13: if_icmpne +12 -> 25
    //   16: aload 4
    //   18: bipush 16
    //   20: invokevirtual 65	com/XhookMethod/XhookMethod/saveaccountdatatoFile/packageinfolist:XhookMethod	(I)V
    //   23: aconst_null
    //   24: areturn
    //   25: aload_2
    //   26: invokestatic 263	com/XhookMethod/XhookMethod/saveaccountdatatoFile/XhookMethod/an:XhookMethod	(Ljava/lang/reflect/Type;)Ljava/util/Map;
    //   29: astore 5
    //   31: aload_1
    //   32: invokevirtual 69	com/XhookMethod/XhookMethod/saveaccountdatatoFile/saveaccountdatatoFile:applicationInfolist	()Lcom/XhookMethod/XhookMethod/saveaccountdatatoFile/runningtaskinfolist;
    //   35: astore 4
    //   37: aload_1
    //   38: aload 4
    //   40: aload 5
    //   42: aload_3
    //   43: invokevirtual 208	com/XhookMethod/XhookMethod/saveaccountdatatoFile/saveaccountdatatoFile:XhookMethod	(Lcom/XhookMethod/XhookMethod/saveaccountdatatoFile/runningtaskinfolist;Ljava/lang/Object;Ljava/lang/Object;)Lcom/XhookMethod/XhookMethod/saveaccountdatatoFile/runningtaskinfolist;
    //   46: pop
    //   47: aload_2
    //   48: instanceof 241
    //   51: ifeq +67 -> 118
    //   54: aload_2
    //   55: checkcast 241	java/lang/reflect/ParameterizedType
    //   58: astore 6
    //   60: aload 6
    //   62: invokeinterface 267 1 0
    //   67: iconst_0
    //   68: aaload
    //   69: astore_2
    //   70: aload 6
    //   72: invokeinterface 267 1 0
    //   77: iconst_1
    //   78: aaload
    //   79: astore 6
    //   81: ldc 86
    //   83: aload_2
    //   84: if_acmpne +21 -> 105
    //   87: aload_1
    //   88: aload 5
    //   90: aload 6
    //   92: aload_3
    //   93: invokestatic 269	com/XhookMethod/XhookMethod/saveaccountdatatoFile/XhookMethod/an:XhookMethod	(Lcom/XhookMethod/XhookMethod/saveaccountdatatoFile/saveaccountdatatoFile;Ljava/util/Map;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/util/Map;
    //   96: astore_2
    //   97: aload_1
    //   98: aload 4
    //   100: invokevirtual 72	com/XhookMethod/XhookMethod/saveaccountdatatoFile/saveaccountdatatoFile:XhookMethod	(Lcom/XhookMethod/XhookMethod/saveaccountdatatoFile/runningtaskinfolist;)V
    //   103: aload_2
    //   104: areturn
    //   105: aload_1
    //   106: aload 5
    //   108: aload_2
    //   109: aload 6
    //   111: invokestatic 271	com/XhookMethod/XhookMethod/saveaccountdatatoFile/XhookMethod/an:XhookMethod	(Lcom/XhookMethod/XhookMethod/saveaccountdatatoFile/saveaccountdatatoFile;Ljava/util/Map;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    //   114: astore_2
    //   115: goto -18 -> 97
    //   118: aload_1
    //   119: aload 5
    //   121: aload_3
    //   122: invokevirtual 274	com/XhookMethod/XhookMethod/saveaccountdatatoFile/saveaccountdatatoFile:XhookMethod	(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;
    //   125: astore_2
    //   126: goto -29 -> 97
    //   129: astore_2
    //   130: aload_1
    //   131: aload 4
    //   133: invokevirtual 72	com/XhookMethod/XhookMethod/saveaccountdatatoFile/saveaccountdatatoFile:XhookMethod	(Lcom/XhookMethod/XhookMethod/saveaccountdatatoFile/runningtaskinfolist;)V
    //   136: aload_2
    //   137: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	138	0	this	an
    //   0	138	1	paramc	saveaccountdatatoFile
    //   0	138	2	paramType	Type
    //   0	138	3	paramObject	Object
    //   4	128	4	localObject1	Object
    //   29	91	5	localMap	Map
    //   58	52	6	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   37	81	129	finally
    //   87	97	129	finally
    //   105	115	129	finally
    //   118	126	129	finally
  }
  
  public final int a_()
  {
    return 12;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.an

 * JD-Core Version:    0.7.0.1

 */