package com.a.a.c.a;

import com.a.a.runtimeexception;
import java.text.SimpleDateFormat;

public final class u
  extends c
  implements aq
{
  public static final u a = new u();
  
  protected final Object a(com.a.a.c.c paramc, Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return null;
      if (!(paramObject instanceof String)) {
        break;
      }
      paramc = (String)paramObject;
    } while (paramc.length() == 0);
    return new SimpleDateFormat(paramc);
    throw new runtimeexception("parse error");
  }
  
  public final int a_()
  {
    return 4;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.c.XhookMethod.u

 * JD-Core Version:    0.7.0.1

 */