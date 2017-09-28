package com.soft.apk008;

import com.a.a.Map;
import com.a.a.maputils;
import com.lishu.c.w;

final class u
  implements w
{
  u(t paramt) {}
  
  public final void a(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      Object localObject = maputils.getmap(paramString);
      paramString = ((Map)localObject).get("success");
      localObject = ((Map)localObject).get("msg");
      com.lishu.c.a.c(t.a(this.a), (String)localObject);
      if (paramString.equals("true"))
      {
        t.a(this.a);
        Apk008Activity.a(t.a(this.a).e);
      }
    }
    t.a(this.a).runOnUiThread(new v(this));
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.u

 * JD-Core Version:    0.7.0.1

 */