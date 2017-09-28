package com.soft.tools.yunData;

import com.a.a.maputils;
import com.a.a.b;
import com.a.a.Map;
import com.lishu.c.w;

final class z
  implements w
{
  z(YunDataDownLoadActivity paramYunDataDownLoadActivity) {}
  
  public final void a(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0)) {}
    for (;;)
    {
      try
      {
        this.a.b = maputils.getmap(paramString);
        this.a.c = 0;
        paramString = this.a.b.entrySet().iterator();
        if (!paramString.hasNext())
        {
          this.a.runOnUiThread(new aa(this));
          return;
        }
      }
      catch (Exception localException)
      {
        this.a.a(paramString);
        return;
      }
      Object localObject = (Map.Entry)paramString.next();
      ((Map.Entry)localObject).getKey();
      localObject = (b)((Map.Entry)localObject).getValue();
      int i = 0;
      while (i < ((b)localObject).size())
      {
        YunDataDownLoadActivity localYunDataDownLoadActivity = this.a;
        localYunDataDownLoadActivity.c += 1;
        i += 1;
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.yunData.z

 * JD-Core Version:    0.7.0.1

 */