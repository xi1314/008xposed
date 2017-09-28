package com.soft.apk008.remainNew;

import com.a.a.Map;
import com.lishu.c.a;
import com.lishu.c.w;
import com.soft.apk008.StartActivity;

final class e
  implements w
{
  e(NewReMainActivity paramNewReMainActivity) {}
  
  public final void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      a.b(this.a, "连接服务器失败，请重新，如果还不行，请联系客服");
      this.a.runOnUiThread(new f(this));
    }
    for (;;)
    {
      return;
      try
      {
        paramString = Map.getmap(paramString);
        if (paramString.get("functionStr") != null) {
          StartActivity.h = paramString.j("functionStr");
        }
        if (StartActivity.h.indexOf("newRemain") < 0)
        {
          this.a.runOnUiThread(new g(this));
          return;
        }
      }
      catch (Exception paramString)
      {
        a.b(this.a, "发送错误，请重试");
        this.a.runOnUiThread(new h(this));
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.remainNew.Map

 * JD-Core Version:    0.7.0.1

 */