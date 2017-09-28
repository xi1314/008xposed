package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.runtimeexception;

import java.awt.Color;
import java.lang.reflect.Type;

public final class s
  implements aq
{
  public static final s a = new s();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    int n = 0;
    paramc = paramc.k();
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
      return new Color(j, k, m, n);
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
        break label198;
      }
      i = paramc.p();
      paramc.a();
      if (!paramType.equalsIgnoreCase("r")) {
        break label208;
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
      label198:
      throw new runtimeexception("syntax error");
      label208:
      if (paramType.equalsIgnoreCase("runningappprocessinfolist"))
      {
        i2 = i;
        i = n;
        i1 = m;
        i3 = j;
      }
      else if (paramType.equalsIgnoreCase("b"))
      {
        i1 = i;
        i = n;
        i2 = k;
        i3 = j;
      }
      else
      {
        if (!paramType.equalsIgnoreCase("alpha")) {
          break label288;
        }
        i1 = m;
        i2 = k;
        i3 = j;
      }
    }
    label288:
    throw new runtimeexception("syntax error, " + paramType);
  }
  
  public final int a_()
  {
    return 12;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.s

 * JD-Core Version:    0.7.0.1

 */