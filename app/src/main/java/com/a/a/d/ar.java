package com.a.a.d;

import com.a.a.runtimeexception;
import com.a.a.Map.f;
import com.a.a.Map.k;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;

public class ar
  implements bb
{
  private final ae[] a;
  private final ae[] b;
  
  public ar(Class paramClass)
  {
    this(paramClass, (byte)0);
  }
  
  private ar(Class paramClass, byte paramByte)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = k.a(paramClass, false).iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(a((f)localIterator.next()));
    }
    this.a = ((ae[])localArrayList.toArray(new ae[localArrayList.size()]));
    localArrayList = new ArrayList();
    paramClass = k.a(paramClass, true).iterator();
    while (paramClass.hasNext()) {
      localArrayList.add(a((f)paramClass.next()));
    }
    this.b = ((ae[])localArrayList.toArray(new ae[localArrayList.size()]));
  }
  
  private static ae a(f paramf)
  {
    if (paramf.b() == Number.class) {
      return new ay(paramf);
    }
    return new ba(paramf);
  }
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    int j = 0;
    bk localbk = paramap.j();
    if (paramObject1 == null)
    {
      localbk.a();
      return;
    }
    if (paramap.a(paramObject1))
    {
      paramap.b(paramObject1);
      return;
    }
    ae[] arrayOfae;
    bi localbi;
    if (localbk.b(bl.k))
    {
      arrayOfae = this.b;
      localbi = paramap.b();
      paramap.a(localbi, paramObject1, paramObject2);
    }
    for (;;)
    {
      try
      {
        localbk.b('{');
        if ((arrayOfae.length > 0) && (localbk.b(bl.m)))
        {
          paramap.d();
          paramap.f();
        }
        if ((!a(paramap, paramType)) || (paramObject1.getClass() == paramType)) {
          break label424;
        }
        localbk.b(a.a);
        paramap.c(paramObject1.getClass());
        i = 1;
        if (j >= arrayOfae.length) {
          break label384;
        }
        paramObject2 = arrayOfae[j];
        if (paramap.b(bl.j))
        {
          paramType = paramObject2.b();
          if (paramType != null)
          {
            k = i;
            if (Modifier.isTransient(paramType.getModifiers())) {
              continue;
            }
          }
        }
        paramType = paramObject2.a(paramObject1);
        paramObject2.c();
        int k = i;
        Object localObject;
        if (ag.a(paramap))
        {
          String str = ag.a(paramap, paramObject2.c());
          paramObject2.c();
          localObject = ag.a(paramap, paramType);
          if ((localObject == null) && (!paramObject2.a()))
          {
            k = i;
            if (!paramap.b(bl.c)) {}
          }
          else
          {
            if (i != 0)
            {
              localbk.b(',');
              if (localbk.b(bl.m)) {
                paramap.f();
              }
            }
            if (str == paramObject2.c()) {
              continue;
            }
            localbk.b(str);
            paramap.c(localObject);
            k = 1;
          }
        }
        j += 1;
        i = k;
        continue;
        arrayOfae = this.a;
        break;
        if (paramType != localObject)
        {
          paramObject2.a(paramap);
          paramap.c(localObject);
          continue;
        }
        paramObject2.a(paramap, localObject);
      }
      catch (Exception paramObject1)
      {
        throw new runtimeexception("write javaBean error", paramObject1);
      }
      finally
      {
        paramap.a(localbi);
      }
      continue;
      label384:
      if ((arrayOfae.length > 0) && (localbk.b(bl.m)))
      {
        paramap.e();
        paramap.f();
      }
      localbk.b('}');
      paramap.a(localbi);
      return;
      label424:
      int i = 0;
    }
  }
  
  protected boolean a(ap paramap, Type paramType)
  {
    return paramap.a(paramType);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.ar

 * JD-Core Version:    0.7.0.1

 */