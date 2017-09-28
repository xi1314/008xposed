package com.a.a.c;

import java.util.HashMap;
import java.util.Map;

public final class h
{
  public static h a;
  private final Map b;
  
  static
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("null", Integer.valueOf(8));
    localHashMap.put("new", Integer.valueOf(9));
    localHashMap.put("true", Integer.valueOf(6));
    localHashMap.put("false", Integer.valueOf(7));
    a = new h(localHashMap);
  }
  
  private h(Map paramMap)
  {
    this.b = paramMap;
  }
  
  public final Integer a(String paramString)
  {
    return (Integer)this.b.get(paramString);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.c.Shell

 * JD-Core Version:    0.7.0.1

 */