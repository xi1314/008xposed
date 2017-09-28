package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.c.e;
import com.a.a.Map.k;
import java.lang.reflect.Type;

public final class ap
  implements aq
{
  public static final ap a = new ap();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    e locale = paramc.k();
    if (locale.c() == 2) {
      if ((paramType == Double.TYPE) || (paramType == Double.class))
      {
        paramc = locale.i();
        locale.a(16);
        paramc = Double.valueOf(Double.parseDouble(paramc));
      }
    }
    do
    {
      return paramc;
      long l = locale.w();
      locale.a(16);
      if ((paramType == Short.TYPE) || (paramType == Short.class)) {
        return Short.valueOf((short)(int)l);
      }
      if ((paramType == Byte.TYPE) || (paramType == Byte.class)) {
        return Byte.valueOf((byte)(int)l);
      }
      if ((l >= -2147483648L) && (l <= 2147483647L)) {
        return Integer.valueOf((int)l);
      }
      return Long.valueOf(l);
      if (locale.c() != 3) {
        break label238;
      }
      if ((paramType == Double.TYPE) || (paramType == Double.class))
      {
        paramc = locale.i();
        locale.a(16);
        return Double.valueOf(Double.parseDouble(paramc));
      }
      paramObject = locale.x();
      locale.a(16);
      if ((paramType == Short.TYPE) || (paramType == Short.class)) {
        return Short.valueOf(paramObject.shortValue());
      }
      if (paramType == Byte.TYPE) {
        break;
      }
      paramc = paramObject;
    } while (paramType != Byte.class);
    return Byte.valueOf(paramObject.byteValue());
    label238:
    paramc = paramc.j();
    if (paramc == null) {
      return null;
    }
    if ((paramType == Double.TYPE) || (paramType == Double.class)) {
      return k.h(paramc);
    }
    if ((paramType == Short.TYPE) || (paramType == Short.class)) {
      return k.d(paramc);
    }
    if ((paramType == Byte.TYPE) || (paramType == Byte.class)) {
      return k.b(paramc);
    }
    return k.e(paramc);
  }
  
  public final int a_()
  {
    return 2;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.ap

 * JD-Core Version:    0.7.0.1

 */