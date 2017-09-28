package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.runtimeexception;

import java.awt.Font;
import java.lang.reflect.Type;

public final class aa
  implements aq
{
  public static final aa a = new aa();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    paramType = null;
    int j = 0;
    paramObject = paramc.k();
    if (paramObject.c() == 8)
    {
      paramObject.a(16);
      return null;
    }
    if ((paramObject.c() != 12) && (paramObject.c() != 16)) {
      throw new runtimeexception("syntax error");
    }
    paramObject.a();
    int i = 0;
    paramc = paramType;
    if (paramObject.c() == 13)
    {
      paramObject.a();
      return new Font(paramc, j, i);
    }
    int m;
    int k;
    if (paramObject.c() == 4)
    {
      paramType = paramObject.s();
      paramObject.b(2);
      if (!paramType.equalsIgnoreCase("name")) {
        break label199;
      }
      if (paramObject.c() != 4) {
        break label189;
      }
      paramType = paramObject.s();
      paramObject.a();
      m = i;
      k = j;
    }
    for (;;)
    {
      paramc = paramType;
      j = k;
      i = m;
      if (paramObject.c() != 16) {
        break;
      }
      paramObject.a(4);
      paramc = paramType;
      j = k;
      i = m;
      break;
      throw new runtimeexception("syntax error");
      label189:
      throw new runtimeexception("syntax error");
      label199:
      if (paramType.equalsIgnoreCase("style"))
      {
        if (paramObject.c() == 2)
        {
          k = paramObject.p();
          paramObject.a();
          paramType = paramc;
          m = i;
        }
        else
        {
          throw new runtimeexception("syntax error");
        }
      }
      else
      {
        if (!paramType.equalsIgnoreCase("size")) {
          break label291;
        }
        if (paramObject.c() != 2) {
          break label281;
        }
        m = paramObject.p();
        paramObject.a();
        paramType = paramc;
        k = j;
      }
    }
    label281:
    throw new runtimeexception("syntax error");
    label291:
    throw new runtimeexception("syntax error, " + paramType);
  }
  
  public final int a_()
  {
    return 12;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.aa

 * JD-Core Version:    0.7.0.1

 */