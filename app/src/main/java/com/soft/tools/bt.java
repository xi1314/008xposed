package com.soft.tools;

import com.a.a.maputils;
import com.lishu.c.w;

final class bt
  implements w
{
  bt(IpRecordActivity paramIpRecordActivity) {}
  
  public final void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      this.a.runOnUiThread(new bu(this));
    }
    for (;;)
    {
      this.a.runOnUiThread(new bx(this));
      return;
      try
      {
        IpRecordActivity.a(this.a, maputils.getmap(paramString));
        IpRecordActivity.c(this.a).j("forwarded_ip");
        IpRecordActivity.c(this.a).j("proxy_ip");
        IpRecordActivity.c(this.a).j("WLProxy_ip");
        IpRecordActivity.c(this.a).j("remoteIp");
        paramString = IpRecordActivity.c(this.a).j("ipStr");
        this.a.runOnUiThread(new bw(this, paramString));
      }
      catch (Exception paramString) {}
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.bt

 * JD-Core Version:    0.7.0.1

 */