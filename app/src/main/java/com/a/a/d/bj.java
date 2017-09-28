package com.a.a.d;

import com.a.a.Map;
import com.a.a.maputils;
import com.a.a.runtimeexception;

import java.io.File;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

public final class bj
  extends Map.h
{
  private static final bj a = new bj();
  private boolean b;
  private final a c;
  private String d;
  
  public bj()
  {
    this((byte)0);
  }
  
  private bj(byte paramByte)
  {
    super((byte)0);
    if (!Map.c.a()) {
      bool = true;
    }
    this.b = bool;
    this.c = new a();
    this.d = maputils.a;
    a(Boolean.class, m.a);
    a(Character.class, r.a);
    a(Byte.class, o.a);
    a(Short.class, bn.a);
    a(Integer.class, an.a);
    a(Long.class, av.a);
    a(Float.class, ai.a);
    a(Double.class, aa.a);
    a(BigDecimal.class, j.a);
    a(BigInteger.class, k.a);
    a(String.class, bo.a);
    a([B.class, n.a);
    a([S.class, bm.a);
    a([I.class, am.a);
    a([J.class, au.a);
    a([F.class, ah.a);
    a([D.class, z.a);
    a([Z.class, l.a);
    a([C.class, q.a);
    a([Ljava.lang.Object.class, az.a);
    a(Class.class, t.a);
    a(SimpleDateFormat.class, x.a);
    a(Locale.class, at.a);
    a(TimeZone.class, bp.a);
    a(UUID.class, bs.a);
    a(InetAddress.class, ak.a);
    a(Inet4Address.class, ak.a);
    a(Inet6Address.class, ak.a);
    a(InetSocketAddress.class, al.a);
    a(File.class, af.a);
    a(URI.class, bq.a);
    a(URL.class, br.a);
    a(Appendable.class, b.a);
    a(StringBuffer.class, b.a);
    a(StringBuilder.class, b.a);
    a(Pattern.class, bc.a);
    a(Charset.class, s.a);
    a(AtomicBoolean.class, d.a);
    a(AtomicInteger.class, f.a);
    a(AtomicLong.class, h.a);
    a(AtomicReference.class, bh.a);
    a(AtomicIntegerArray.class, e.a);
    a(AtomicLongArray.class, g.a);
    a(WeakReference.class, bh.a);
    a(SoftReference.class, bh.a);
    try
    {
      a(Class.forName("java.awt.Color"), w.a);
      a(Class.forName("java.awt.Font"), aj.a);
      a(Class.forName("java.awt.Point"), bd.a);
      a(Class.forName("java.awt.Rectangle"), bg.a);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public static final bj a()
  {
    return a;
  }
  
  public final bb a(Class paramClass)
  {
    if (!Modifier.isPublic(paramClass.getModifiers())) {
      return new ar(paramClass);
    }
    boolean bool1 = this.b;
    if (((bool1) && (this.c.b(paramClass))) || (paramClass == Serializable.class) || (paramClass == Object.class)) {
      bool1 = false;
    }
    for (;;)
    {
      Object localObject = (maputils.c)paramClass.getAnnotation(maputils.c.class);
      boolean bool2 = bool1;
      if (localObject != null)
      {
        bool2 = bool1;
        if (!((maputils.c)localObject).a()) {
          bool2 = false;
        }
      }
      if (bool2) {
        try
        {
          localObject = this.c.a(paramClass);
          return localObject;
        }
        catch (ClassCastException localClassCastException)
        {
          return new ar(paramClass);
        }
        catch (Throwable localThrowable)
        {
          throw new runtimeexception("create asm serializer error, class " + paramClass, localThrowable);
        }
      }
      return new ar(paramClass);
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.bj

 * JD-Core Version:    0.7.0.1

 */