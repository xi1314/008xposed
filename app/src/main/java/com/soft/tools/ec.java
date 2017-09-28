package com.soft.tools;

import android.app.ProgressDialog;
import android.widget.TextView;

final class ec
  implements Runnable
{
  ec(eb parameb, String paramString) {}
  
  public final void run()
  {
    RemoteVpnActivity.c().setText("连接成功，" + this.b);
    RemoteVpnActivity.a().hide();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.ec
 * JD-Core Version:    0.7.0.1
 */