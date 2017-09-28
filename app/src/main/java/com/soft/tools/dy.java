package com.soft.tools;

import android.view.View;
import android.widget.Toast;

import com.a.a.Map;
import com.lishu.c.b.a;

final class dy
  implements View.OnClickListener
{
  dy(RemoteVpnActivity paramRemoteVpnActivity) {}
  
  public final void onClick(View paramView)
  {
    if (paramView.equals(RemoteVpnActivity.a(this.a))) {
      if (RemoteVpnActivity.a == null) {
        Toast.makeText(this.a, "网络还未连接", 0).show();
      }
    }
    while (!paramView.equals(RemoteVpnActivity.b(this.a)))
    {
      return;
      RemoteVpnActivity.c = false;
      RemoteVpnActivity.a().show();
      paramView = new Map();
      paramView.a("message", "change");
      RemoteVpnActivity.a.a(paramView.a());
      return;
    }
    RemoteVpnActivity.c = false;
    RemoteVpnActivity.a().show();
    paramView = RemoteVpnActivity.b().getText().toString().split(":");
    if (paramView.length != 2)
    {
      Toast.makeText(this.a, "格式输入错误", 0).show();
      RemoteVpnActivity.a().hide();
      return;
    }
    if (RemoteVpnActivity.a == null) {
      RemoteVpnActivity.a = new a(paramView[0], Integer.parseInt(paramView[1]));
    }
    for (;;)
    {
      RemoteVpnActivity.a.a = RemoteVpnActivity.d;
      new dz(this).start();
      return;
      RemoteVpnActivity.a.b = paramView[0];
      RemoteVpnActivity.a.c = Integer.parseInt(paramView[1]);
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.dy

 * JD-Core Version:    0.7.0.1

 */