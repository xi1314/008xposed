package com.soft.tools;

import android.app.ProgressDialog;
import android.widget.TextView;

final class ed
  implements Runnable
{
  ed(eb parameb) {}
  
  public final void run()
  {
    RemoteVpnActivity.c().setText("状态异常请重试");
    RemoteVpnActivity.a().hide();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.ed
 * JD-Core Version:    0.7.0.1
 */