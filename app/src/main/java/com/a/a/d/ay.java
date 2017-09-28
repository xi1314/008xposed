package com.a.a.d;

import com.a.a.Map.f;

final class ay
  extends ae
{
  public ay(f paramf)
  {
    super(paramf);
  }
  
  public final void a(ap paramap, Object paramObject)
    throws Exception
  {
    bk localbk = paramap.j();
    a(paramap);
    if (paramObject == null)
    {
      if (localbk.b(bl.h))
      {
        localbk.a('0');
        return;
      }
      localbk.a();
      return;
    }
    localbk.a(paramObject.toString());
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.ay

 * JD-Core Version:    0.7.0.1

 */