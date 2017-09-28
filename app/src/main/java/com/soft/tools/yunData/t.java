package com.soft.tools.yunData;

import com.a.a.Map;
import com.lishu.c.w;
import java.util.Arrays;

final class t
  implements w
{
  t(YunDataDownLoadActivity paramYunDataDownLoadActivity) {}
  
  public final void a(String paramString)
  {
    if ((paramString != null) && (paramString.length() != 0)) {}
    try
    {
      YunDataDownLoadActivity.a(this.a, Map.getmap(paramString));
      label22:
      if (YunDataDownLoadActivity.h(this.a) == null) {
        YunDataDownLoadActivity.a(this.a, new Map());
      }
      paramString = YunDataDownLoadActivity.h(this.a).entrySet();
      YunDataDownLoadActivity.a(this.a, new String[paramString.size()]);
      paramString = paramString.iterator();
      int i = 0;
      for (;;)
      {
        if (!paramString.hasNext())
        {
          Arrays.sort(YunDataDownLoadActivity.g(this.a));
          this.a.runOnUiThread(new u(this));
          return;
        }
        String str = (String)((Map.Entry)paramString.next()).getKey();
        YunDataDownLoadActivity.g(this.a)[i] = str;
        i += 1;
      }
    }
    catch (Exception paramString)
    {
      break label22;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.yunData.t

 * JD-Core Version:    0.7.0.1

 */