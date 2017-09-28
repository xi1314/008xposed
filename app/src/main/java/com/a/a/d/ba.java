package com.a.a.d;

import com.a.a.maputils.b;
import com.a.a.Map.f;

import java.util.Collection;

public final class ba
  extends ae
{
  boolean b = false;
  boolean c = false;
  boolean d = false;
  boolean e = false;
  private bb f;
  private Class g;
  private String h;
  private boolean i = false;
  
  public ba(f paramf)
  {
    super(paramf);
    paramf = (b)paramf.a(b.class);
    if (paramf != null)
    {
      this.h = paramf.b();
      if (this.h.trim().length() == 0) {
        this.h = null;
      }
      paramf = paramf.e();
      int k = paramf.length;
      int j = 0;
      if (j < k)
      {
        Object localObject = paramf[j];
        if (localObject == bl.h) {
          this.i = true;
        }
        for (;;)
        {
          j += 1;
          break;
          if (localObject == bl.g) {
            this.b = true;
          } else if (localObject == bl.i) {
            this.c = true;
          } else if (localObject == bl.f) {
            this.d = true;
          } else if (localObject == bl.d) {
            this.e = true;
          }
        }
      }
    }
  }
  
  public final void a(ap paramap, Object paramObject)
    throws Exception
  {
    a(paramap);
    if (this.h != null)
    {
      paramap.a(paramObject, this.h);
      return;
    }
    if (this.f == null) {
      if (paramObject != null) {
        break label89;
      }
    }
    label89:
    for (this.g = d().getReturnType();; this.g = paramObject.getClass())
    {
      this.f = paramap.a(this.g);
      if (paramObject != null) {
        break label201;
      }
      if ((!this.i) || (!Number.class.isAssignableFrom(this.g))) {
        break;
      }
      paramap.j().a('0');
      return;
    }
    if ((this.b) && (String.class == this.g))
    {
      paramap.j().write("\"\"");
      return;
    }
    if ((this.c) && (Boolean.class == this.g))
    {
      paramap.j().write("false");
      return;
    }
    if ((this.d) && (Collection.class.isAssignableFrom(this.g)))
    {
      paramap.j().write("[]");
      return;
    }
    this.f.a(paramap, null, this.a.d(), null);
    return;
    label201:
    if ((this.e == true) && (this.g.isEnum()))
    {
      paramap.j().a(((Enum)paramObject).name());
      return;
    }
    Class localClass = paramObject.getClass();
    if (localClass == this.g)
    {
      this.f.a(paramap, paramObject, this.a.d(), this.a.c());
      return;
    }
    paramap.a(localClass).a(paramap, paramObject, this.a.d(), this.a.c());
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.ba

 * JD-Core Version:    0.7.0.1

 */