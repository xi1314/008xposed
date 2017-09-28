package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.runtimeexception;

import java.awt.Point;
import java.lang.reflect.Type;

public final class as
  implements aq
{
  public static final as a = new as();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    int j = 0;
    paramType = paramc.k();
    if (paramType.c() == 8)
    {
      paramType.a(16);
      return null;
    }
    if ((paramType.c() != 12) && (paramType.c() != 16)) {
      throw new runtimeexception("syntax error");
    }
    paramType.a();
    int i = 0;
    for (;;)
    {
      if (paramType.c() == 13)
      {
        paramType.a();
        return new Point(i, j);
      }
      if (paramType.c() != 4) {
        break label190;
      }
      paramObject = paramType.s();
      if (!a.a.equals(paramObject)) {
        break;
      }
      paramc.a("java.awt.Point");
    }
    paramType.b(2);
    int k;
    int m;
    if (paramType.c() == 2)
    {
      k = paramType.p();
      paramType.a();
      if (!paramObject.equalsIgnoreCase("x")) {
        break label227;
      }
      m = k;
      k = j;
    }
    for (;;)
    {
      j = k;
      i = m;
      if (paramType.c() != 16) {
        break;
      }
      paramType.a(4);
      j = k;
      i = m;
      break;
      label190:
      throw new runtimeexception("syntax error");
      throw new runtimeexception("syntax error : " + paramType.d());
      label227:
      if (!paramObject.equalsIgnoreCase("y")) {
        break label243;
      }
      m = i;
    }
    label243:
    throw new runtimeexception("syntax error, " + paramObject);
  }
  
  public final int a_()
  {
    return 12;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.as

 * JD-Core Version:    0.7.0.1

 */