package com.a.a.d;

import com.a.a.maputils.b;
import com.a.a.Map.f;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class ae
{
  protected final f a;
  private final String b;
  private final String c;
  private final String d;
  private boolean e = false;
  
  public ae(f paramf)
  {
    this.a = paramf;
    paramf.g();
    this.b = ("\"" + paramf.d() + "\":");
    this.c = ("'" + paramf.d() + "':");
    this.d = (paramf.d() + ":");
    paramf = (b)paramf.a(b.class);
    if (paramf != null)
    {
      paramf = paramf.e();
      int j = paramf.length;
      int i = 0;
      while (i < j)
      {
        if (paramf[i] == bl.c) {
          this.e = true;
        }
        i += 1;
      }
    }
  }
  
  public final Object a(Object paramObject)
    throws Exception
  {
    return this.a.a(paramObject);
  }
  
  public final void a(ap paramap)
    throws IOException
  {
    bk localbk = paramap.j();
    if (paramap.b(bl.a))
    {
      if (paramap.b(bl.b))
      {
        localbk.write(this.c);
        return;
      }
      localbk.write(this.b);
      return;
    }
    localbk.write(this.d);
  }
  
  public abstract void a(ap paramap, Object paramObject)
    throws Exception;
  
  public final boolean a()
  {
    return this.e;
  }
  
  public final Field b()
  {
    return this.a.f();
  }
  
  public final String c()
  {
    return this.a.d();
  }
  
  public final Method d()
  {
    return this.a.e();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.ae

 * JD-Core Version:    0.7.0.1

 */