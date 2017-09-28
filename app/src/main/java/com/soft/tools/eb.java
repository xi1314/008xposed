package com.soft.tools;

import com.a.a.Map;
import com.a.a.maputils;
import com.lishu.c.b.c;

final class eb
  implements c
{
  public final void a()
  {
    if (RemoteVpnActivity.d() != null) {
      RemoteVpnActivity.d().runOnUiThread(new ee(this));
    }
  }
  
  public final void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    for (;;)
    {
      return;
      try
      {
        Object localObject = maputils.getmap(paramString);
        paramString = ((Map)localObject).getStringfrommap("status");
        localObject = ((Map)localObject).getStringfrommap("message");
        if (paramString.equals("true"))
        {
          RemoteVpnActivity.e = true;
          if (RemoteVpnActivity.d() != null)
          {
            RemoteVpnActivity.d().runOnUiThread(new ec(this, (String)localObject));
            return;
          }
        }
      }
      catch (Exception paramString)
      {
        if (RemoteVpnActivity.d() != null) {
          RemoteVpnActivity.d().runOnUiThread(new ed(this));
        }
        RemoteVpnActivity.c = true;
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.eb

 * JD-Core Version:    0.7.0.1

 */