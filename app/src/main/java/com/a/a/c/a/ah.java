package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.c.g;
import com.a.a.c.i;
import com.a.a.c.j;
import com.a.a.Map.f;
import com.a.a.Map.k;
import com.a.a.runtimeexception;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ah
  implements aq
{
  private final Map a = new IdentityHashMap();
  private final List b = new ArrayList();
  private final Class c;
  private com.a.a.Map.e d;
  
  public ah(j paramj, Class paramClass)
  {
    this(paramj, paramClass, paramClass);
  }
  
  public ah(j paramj, Class paramClass, Type paramType)
  {
    this.c = paramClass;
    this.d = com.a.a.Map.e.a(paramClass, paramType);
    paramType = this.d.e().iterator();
    while (paramType.hasNext())
    {
      f localf = (f)paramType.next();
      x localx = a(paramj, paramClass, localf);
      this.a.put(localf.d().intern(), localx);
      this.b.add(localx);
    }
  }
  
  private Object a(c paramc, Type paramType, Object paramObject1, Object paramObject2)
  {
    com.a.a.c.e locale = paramc.k();
    if (locale.c() == 8)
    {
      locale.a(16);
      return null;
    }
    i locali = paramc.f();
    Object localObject1 = null;
    Object localObject2 = null;
    try
    {
      if (locale.c() == 13)
      {
        locale.a(16);
        paramType = a(paramc, paramType);
        paramc.a(locali);
        return paramType;
      }
      if ((locale.c() != 12) && (locale.c() != 16))
      {
        paramType = new StringBuffer("syntax error, expect {, actual ").append(locale.d()).append(", pos ").append(locale.e());
        if ((paramObject1 instanceof String)) {
          paramType.append(", fieldName ").append(paramObject1);
        }
        throw new runtimeexception(paramType.toString());
      }
    }
    finally
    {
      paramObject1 = localObject1;
    }
    for (;;)
    {
      if (paramObject1 != null) {
        paramObject1.a(paramObject2);
      }
      paramc.a(locali);
      throw paramType;
      if (paramc.d() == 2) {
        paramc.a(0);
      }
      localObject1 = null;
      label188:
      Object localObject3 = paramObject2;
      String str;
      for (;;)
      {
        try
        {
          str = locale.a(paramc.b());
          if (str == null)
          {
            localObject3 = paramObject2;
            if (locale.c() == 13)
            {
              localObject3 = paramObject2;
              locale.a(16);
              paramObject1 = localObject1;
              label236:
              if (paramObject2 != null) {
                break label1285;
              }
              if (localObject2 != null) {
                break label1071;
              }
            }
          }
        }
        finally
        {
          paramObject2 = localObject3;
          paramObject1 = localObject1;
        }
        try
        {
          paramType = a(paramc, paramType);
          if (paramObject1 != null) {
            paramObject1.a(paramType);
          }
          paramc.a(locali);
          return paramType;
        }
        finally {}
        localObject3 = paramObject2;
        if (locale.c() == 16)
        {
          localObject3 = paramObject2;
          if (paramc.a(com.a.a.c.d.g)) {
            break label188;
          }
        }
        if ("$ref" == str)
        {
          localObject3 = paramObject2;
          locale.b(4);
          localObject3 = paramObject2;
          if (locale.c() == 4)
          {
            localObject3 = paramObject2;
            localObject2 = locale.s();
            localObject3 = paramObject2;
            if ("@".equals(localObject2))
            {
              localObject3 = paramObject2;
              paramType = locali.b();
              try
              {
                locale.a(13);
                if (locale.c() == 13) {
                  break label658;
                }
                throw new runtimeexception("illegal ref");
              }
              finally
              {
                paramObject2 = paramType;
                paramType = paramObject1;
                paramObject1 = localObject1;
              }
              break;
            }
            localObject3 = paramObject2;
            if ("..".equals(localObject2))
            {
              localObject3 = paramObject2;
              paramType = locali.c();
              localObject3 = paramObject2;
              if (paramType.b() != null)
              {
                localObject3 = paramObject2;
                paramType = paramType.b();
                continue;
              }
              localObject3 = paramObject2;
              paramc.a(new c.a(paramType, (String)localObject2));
              localObject3 = paramObject2;
              paramc.a(1);
              paramType = paramObject2;
              continue;
            }
            localObject3 = paramObject2;
            if ("$".equals(localObject2))
            {
              paramType = locali;
              localObject3 = paramObject2;
              if (paramType.c() != null)
              {
                localObject3 = paramObject2;
                paramType = paramType.c();
                continue;
              }
              localObject3 = paramObject2;
              if (paramType.b() != null)
              {
                localObject3 = paramObject2;
                paramType = paramType.b();
                continue;
              }
              localObject3 = paramObject2;
              paramc.a(new c.a(paramType, (String)localObject2));
              localObject3 = paramObject2;
              paramc.a(1);
              paramType = paramObject2;
              continue;
            }
            localObject3 = paramObject2;
            paramc.a(new c.a(locali, (String)localObject2));
            localObject3 = paramObject2;
            paramc.a(1);
            paramType = paramObject2;
            continue;
          }
          localObject3 = paramObject2;
          throw new runtimeexception("illegal ref, " + g.a(locale.c()));
          break;
          label658:
          locale.a(16);
          paramc.a(locali, paramType, paramObject1);
          if (localObject1 != null) {
            ((i)localObject1).a(paramType);
          }
          paramc.a(locali);
          return paramType;
        }
        localObject3 = paramObject2;
        if (a.a == str)
        {
          localObject3 = paramObject2;
          locale.b(4);
          localObject3 = paramObject2;
          if (locale.c() == 4)
          {
            localObject3 = paramObject2;
            localObject4 = locale.s();
            localObject3 = paramObject2;
            locale.a(16);
            localObject3 = paramObject2;
            if ((paramType instanceof Class))
            {
              localObject3 = paramObject2;
              if (((String)localObject4).equals(((Class)paramType).getName()))
              {
                localObject3 = paramObject2;
                if (locale.c() != 13) {
                  break label188;
                }
                localObject3 = paramObject2;
                locale.a();
                paramObject1 = localObject1;
                continue;
              }
            }
            localObject3 = paramObject2;
            paramType = k.a((String)localObject4);
            localObject3 = paramObject2;
            paramType = paramc.c().a(paramType).a(paramc, paramType, paramObject1);
            if (localObject1 != null) {
              ((i)localObject1).a(paramObject2);
            }
            paramc.a(locali);
            return paramType;
          }
          localObject3 = paramObject2;
          throw new runtimeexception("syntax error");
        }
        if ((paramObject2 != null) || (localObject2 != null)) {
          break label1294;
        }
        localObject3 = paramObject2;
        paramObject2 = a(paramc, paramType);
        if (paramObject2 == null)
        {
          localObject3 = paramObject2;
          localObject2 = new HashMap(this.b.size());
        }
        localObject3 = paramObject2;
        Object localObject4 = paramc.a(locali, paramObject2, paramObject1);
        localObject1 = localObject4;
      }
      label1285:
      label1291:
      label1294:
      for (;;)
      {
        try
        {
          if (!a(paramc, str, paramObject2, paramType, (Map)localObject2))
          {
            if (locale.c() != 13) {
              break label1291;
            }
            locale.a();
            paramObject1 = localObject1;
            break label236;
          }
          if (locale.c() == 16) {
            break label1291;
          }
          if (locale.c() == 13)
          {
            locale.a(16);
            paramObject1 = localObject1;
            break label236;
          }
          if ((locale.c() != 18) && (locale.c() != 1)) {
            break label1068;
          }
          throw new runtimeexception("syntax error, unexpect token " + g.a(locale.c()));
        }
        finally
        {
          paramObject1 = localObject1;
        }
        break;
        label1068:
        break label188;
        label1071:
        localObject1 = this.d.e();
        int j = ((List)localObject1).size();
        paramType = new Object[j];
        int i = 0;
        while (i < j)
        {
          paramType[i] = ((Map)localObject2).get(((f)((List)localObject1).get(i)).d());
          i += 1;
        }
        localObject1 = this.d.b();
        if (localObject1 != null) {}
        for (;;)
        {
          try
          {
            paramType = this.d.b().newInstance(paramType);
            if (paramObject1 != null) {
              paramObject1.a(paramType);
            }
            paramc.a(locali);
            return paramType;
          }
          catch (Exception paramType)
          {
            throw new runtimeexception("create instance error, " + this.d.b().toGenericString(), paramType);
          }
          localObject1 = this.d.c();
          if (localObject1 != null) {
            try
            {
              paramType = this.d.c().invoke(null, paramType);
            }
            catch (Exception paramType)
            {
              throw new runtimeexception("create factory method error, " + this.d.c().toString(), paramType);
            }
          } else {
            paramType = paramObject2;
          }
        }
        break label188;
      }
    }
  }
  
  public x a(j paramj, Class paramClass, f paramf)
  {
    return paramj.a(paramj, paramClass, paramf);
  }
  
  /* Error */
  public final Object a(c paramc, Type paramType)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 219
    //   4: ifeq +49 -> 53
    //   7: aload_0
    //   8: getfield 35	com/XhookMethod/XhookMethod/saveaccountdatatoFile/XhookMethod/ah:saveaccountdatatoFile	Ljava/lang/Class;
    //   11: invokevirtual 294	java/lang/Class:isInterface	()Z
    //   14: ifeq +39 -> 53
    //   17: aload_2
    //   18: checkcast 219	java/lang/Class
    //   21: astore_1
    //   22: invokestatic 300	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   25: invokevirtual 304	java/lang/Thread:getContextClassLoader	()Ljava/lang/ClassLoader;
    //   28: astore_2
    //   29: new 306	com/XhookMethod/XhookMethod/packageinfolist
    //   32: dup
    //   33: invokespecial 307	com/XhookMethod/XhookMethod/packageinfolist:<init>	()V
    //   36: astore_3
    //   37: aload_2
    //   38: iconst_1
    //   39: anewarray 219	java/lang/Class
    //   42: dup
    //   43: iconst_0
    //   44: aload_1
    //   45: aastore
    //   46: aload_3
    //   47: invokestatic 313	java/lang/reflect/Proxy:newProxyInstance	(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
    //   50: astore_3
    //   51: aload_3
    //   52: areturn
    //   53: aload_0
    //   54: getfield 42	com/XhookMethod/XhookMethod/saveaccountdatatoFile/XhookMethod/ah:getMap	Lcom/XhookMethod/XhookMethod/packageinfolist/packageinfolist;
    //   57: invokevirtual 315	com/XhookMethod/XhookMethod/packageinfolist/packageinfolist:XhookMethod	()Ljava/lang/reflect/Constructor;
    //   60: ifnonnull +5 -> 65
    //   63: aconst_null
    //   64: areturn
    //   65: aload_0
    //   66: getfield 42	com/XhookMethod/XhookMethod/saveaccountdatatoFile/XhookMethod/ah:getMap	Lcom/XhookMethod/XhookMethod/packageinfolist/packageinfolist;
    //   69: invokevirtual 315	com/XhookMethod/XhookMethod/packageinfolist/packageinfolist:XhookMethod	()Ljava/lang/reflect/Constructor;
    //   72: astore_2
    //   73: aload_2
    //   74: invokevirtual 319	java/lang/reflect/Constructor:getParameterTypes	()[Ljava/lang/Class;
    //   77: arraylength
    //   78: ifne +111 -> 189
    //   81: aload_2
    //   82: iconst_0
    //   83: anewarray 4	java/lang/Object
    //   86: invokevirtual 270	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   89: astore_2
    //   90: aload_2
    //   91: astore_3
    //   92: aload_1
    //   93: getstatic 322	com/XhookMethod/XhookMethod/saveaccountdatatoFile/getMap:m	Lcom/XhookMethod/XhookMethod/saveaccountdatatoFile/getMap;
    //   96: invokevirtual 165	com/XhookMethod/XhookMethod/saveaccountdatatoFile/saveaccountdatatoFile:XhookMethod	(Lcom/XhookMethod/XhookMethod/saveaccountdatatoFile/getMap;)Z
    //   99: ifeq -48 -> 51
    //   102: aload_0
    //   103: getfield 42	com/XhookMethod/XhookMethod/saveaccountdatatoFile/XhookMethod/ah:getMap	Lcom/XhookMethod/XhookMethod/packageinfolist/packageinfolist;
    //   106: invokevirtual 46	com/XhookMethod/XhookMethod/packageinfolist/packageinfolist:packageinfolist	()Ljava/util/List;
    //   109: invokeinterface 52 1 0
    //   114: astore_1
    //   115: aload_2
    //   116: astore_3
    //   117: aload_1
    //   118: invokeinterface 58 1 0
    //   123: ifeq -72 -> 51
    //   126: aload_1
    //   127: invokeinterface 62 1 0
    //   132: checkcast 64	com/XhookMethod/XhookMethod/packageinfolist/applicationInfolist
    //   135: astore_3
    //   136: aload_3
    //   137: invokevirtual 325	com/XhookMethod/XhookMethod/packageinfolist/applicationInfolist:Inttolong	()Ljava/lang/Class;
    //   140: ldc 72
    //   142: if_acmpne -27 -> 115
    //   145: aload_3
    //   146: aload_2
    //   147: ldc_w 327
    //   150: invokevirtual 330	com/XhookMethod/XhookMethod/packageinfolist/applicationInfolist:XhookMethod	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   153: goto -38 -> 115
    //   156: astore_1
    //   157: new 138	com/XhookMethod/XhookMethod/getMap
    //   160: dup
    //   161: new 197	java/lang/StringBuilder
    //   164: dup
    //   165: ldc_w 332
    //   168: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   171: aload_0
    //   172: getfield 35	com/XhookMethod/XhookMethod/saveaccountdatatoFile/XhookMethod/ah:saveaccountdatatoFile	Ljava/lang/Class;
    //   175: invokevirtual 222	java/lang/Class:getName	()Ljava/lang/String;
    //   178: invokevirtual 208	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: invokevirtual 209	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   184: aload_1
    //   185: invokespecial 278	com/XhookMethod/XhookMethod/getMap:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   188: athrow
    //   189: aload_2
    //   190: iconst_1
    //   191: anewarray 4	java/lang/Object
    //   194: dup
    //   195: iconst_0
    //   196: aload_1
    //   197: invokevirtual 106	com/XhookMethod/XhookMethod/saveaccountdatatoFile/saveaccountdatatoFile:applicationInfolist	()Lcom/XhookMethod/XhookMethod/saveaccountdatatoFile/i;
    //   200: invokevirtual 179	com/XhookMethod/XhookMethod/saveaccountdatatoFile/i:Inttolong	()Ljava/lang/Object;
    //   203: aastore
    //   204: invokevirtual 270	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   207: astore_2
    //   208: goto -118 -> 90
    //   211: astore_1
    //   212: new 138	com/XhookMethod/XhookMethod/getMap
    //   215: dup
    //   216: new 197	java/lang/StringBuilder
    //   219: dup
    //   220: ldc_w 332
    //   223: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   226: aload_0
    //   227: getfield 35	com/XhookMethod/XhookMethod/saveaccountdatatoFile/XhookMethod/ah:saveaccountdatatoFile	Ljava/lang/Class;
    //   230: invokevirtual 222	java/lang/Class:getName	()Ljava/lang/String;
    //   233: invokevirtual 208	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: invokevirtual 209	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   239: aload_1
    //   240: invokespecial 278	com/XhookMethod/XhookMethod/getMap:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   243: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	244	0	this	ah
    //   0	244	1	paramc	saveaccountdatatoFile
    //   0	244	2	paramType	Type
    //   36	110	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   145	153	156	java/lang/Exception
    //   65	90	211	java/lang/Exception
    //   189	208	211	java/lang/Exception
  }
  
  public Object a(c paramc, Type paramType, Object paramObject)
  {
    return a(paramc, paramType, paramObject, null);
  }
  
  public boolean a(c paramc, String paramString, Object paramObject, Type paramType, Map paramMap)
  {
    com.a.a.c.e locale = paramc.k();
    x localx = (x)this.a.get(paramString);
    Object localObject = localx;
    if (localx == null)
    {
      Iterator localIterator = this.a.entrySet().iterator();
      do
      {
        localObject = localx;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject = (Map.Entry)localIterator.next();
      } while (!((String)((Map.Entry)localObject).getKey()).equalsIgnoreCase(paramString));
      localObject = (x)((Map.Entry)localObject).getValue();
    }
    if (localObject == null)
    {
      if (!paramc.a(com.a.a.c.d.i)) {
        throw new runtimeexception("setter not found, class " + this.c.getName() + ", property " + paramString);
      }
      locale.b();
      paramc.j();
      return false;
    }
    locale.b(((x)localObject).a());
    ((x)localObject).a(paramc, paramObject, paramType, paramMap);
    return true;
  }
  
  public int a_()
  {
    return 12;
  }
  
  public final Map b()
  {
    return this.a;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.ah

 * JD-Core Version:    0.7.0.1

 */