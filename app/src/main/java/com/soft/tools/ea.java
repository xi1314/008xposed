package com.soft.tools;

import android.app.ProgressDialog;
import android.widget.TextView;

final class ea
  implements Runnable
{
  ea(dz paramdz, boolean paramBoolean) {}
  
  public final void run()
  {
    if (this.b) {
      RemoteVpnActivity.c().setText("连接成功");
    }
    for (;;)
    {
      RemoteVpnActivity.a().hide();
      return;
      RemoteVpnActivity.c().setText("连接失败");
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.ea
 * JD-Core Version:    0.7.0.1
 */