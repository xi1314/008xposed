package com.a.a.c.a;

import com.a.a.c.c;
import java.lang.reflect.Type;
import java.util.Locale;

public final class ak
  implements aq
{
  public static final ak a = new ak();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    paramc = (String)paramc.j();
    if (paramc == null) {
      return null;
    }
    paramc = paramc.split("_");
    if (paramc.length == 1) {
      return new Locale(paramc[0]);
    }
    if (paramc.length == 2) {
      return new Locale(paramc[0], paramc[1]);
    }
    return new Locale(paramc[0], paramc[1], paramc[2]);
  }
  
  public final int a_()
  {
    return 4;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.c.XhookMethod.ak

 * JD-Core Version:    0.7.0.1

 */