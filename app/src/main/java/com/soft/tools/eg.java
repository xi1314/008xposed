package com.soft.tools;

import android.app.Activity;
import android.widget.Toast;
import com.lishu.c.a;

final class eg
  implements Runnable
{
  eg(ef paramef, boolean paramBoolean, Activity paramActivity) {}
  
  public final void run()
  {
    if (this.b)
    {
      Toast.makeText(this.c, "连接服务器成功", 0).show();
      RemoteVpnActivity.e();
      RemoteVpnActivity.f = false;
      return;
    }
    a.c(this.c, "连接服务器失败");
    RemoteVpnActivity.g = false;
    RemoteVpnActivity.f = false;
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.eg
 * JD-Core Version:    0.7.0.1
 */