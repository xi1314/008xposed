package com.a.a.d;

import java.util.Iterator;
import java.util.List;

public class ag
{
  public static Object a(ap paramap, Object paramObject)
  {
    Object localObject = paramap.c();
    paramap = paramObject;
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      for (;;)
      {
        paramap = paramObject;
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        paramObject = ((bt)((Iterator)localObject).next()).a();
      }
    }
    return paramap;
  }
  
  public static String a(ap paramap, String paramString)
  {
    Object localObject = paramap.g();
    paramap = paramString;
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      for (;;)
      {
        paramap = paramString;
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        paramString = ((ax)((Iterator)localObject).next()).a();
      }
    }
    return paramap;
  }
  
  public static boolean a(ap paramap)
  {
    paramap = paramap.i();
    if (paramap == null) {
      return true;
    }
    paramap = paramap.iterator();
    while (paramap.hasNext()) {
      if (!((be)paramap.next()).a()) {
        return false;
      }
    }
    return true;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.ag

 * JD-Core Version:    0.7.0.1

 */