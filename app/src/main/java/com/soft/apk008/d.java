package com.soft.apk008;

import com.a.a.Map;
import com.a.a.maputils;
import com.lishu.c.w;

final class d
  implements w
{
  d(c paramc) {}
  
  public final void a(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      Object localObject = maputils.getmap(paramString);
      paramString = ((Map)localObject).get("success");
      localObject = ((Map)localObject).get("msg");
      com.lishu.c.a.c(c.a(this.a), (String)localObject);
      if (paramString.equals("true"))
      {
        c.a(this.a);
        Apk008Activity.a(c.a(this.a).e);
      }
    }
    c.a(this.a).runOnUiThread(new e(this));
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.getMap

 * JD-Core Version:    0.7.0.1

 */