package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.runtimeexception;

import java.awt.Rectangle;
import java.lang.reflect.Type;

public final class at
  implements aq
{
  public static final at a = new at();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    int n = 0;
    paramc = paramc.k();
    if (paramc.c() == 8)
    {
      paramc.a();
      return null;
    }
    if ((paramc.c() != 12) && (paramc.c() != 16)) {
      throw new runtimeexception("syntax error");
    }
    paramc.a();
    int m = 0;
    int k = 0;
    int j = 0;
    if (paramc.c() == 13)
    {
      paramc.a();
      return new Rectangle(j, k, m, n);
    }
    int i;
    int i3;
    int i2;
    int i1;
    if (paramc.c() == 4)
    {
      paramType = paramc.s();
      paramc.b(2);
      if (paramc.c() != 2) {
        break label213;
      }
      i = paramc.p();
      paramc.a();
      if (!paramType.equalsIgnoreCase("x")) {
        break label223;
      }
      i3 = i;
      i2 = k;
      i1 = m;
      i = n;
    }
    for (;;)
    {
      n = i;
      m = i1;
      k = i2;
      j = i3;
      if (paramc.c() != 16) {
        break;
      }
      paramc.a(4);
      n = i;
      m = i1;
      k = i2;
      j = i3;
      break;
      throw new runtimeexception("syntax error");
      label213:
      throw new runtimeexception("syntax error");
      label223:
      if (paramType.equalsIgnoreCase("y"))
      {
        i2 = i;
        i = n;
        i1 = m;
        i3 = j;
      }
      else if (paramType.equalsIgnoreCase("width"))
      {
        i1 = i;
        i = n;
        i2 = k;
        i3 = j;
      }
      else
      {
        if (!paramType.equalsIgnoreCase("height")) {
          break label303;
        }
        i1 = m;
        i2 = k;
        i3 = j;
      }
    }
    label303:
    throw new runtimeexception("syntax error, " + paramType);
  }
  
  public final int a_()
  {
    return 12;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.at

 * JD-Core Version:    0.7.0.1

 */