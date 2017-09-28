package com.soft.tools.yunData;

import com.a.a.maputils;
import com.lishu.c.w;

final class m
  implements w
{
  m(YunDataActivity paramYunDataActivity) {}
  
  public final void a(String paramString)
  {
    this.a.runOnUiThread(new n(this));
    if ((paramString == null) || (paramString.length() == 0)) {}
    for (;;)
    {
      return;
      try
      {
        paramString = maputils.getmap(paramString);
        paramString = paramString.get("status");
        if (paramString.equals("true"))
        {
          this.a.b("同步到云端成功,共上传" + (this.a.b + this.a.c) + "个文件,其中分类文件" + this.a.b + "个,tar文件" + this.a.c + "个");
          this.a.runOnUiThread(new o(this));
          return;
        }
        if (paramString.equals("false"))
        {
          this.a.b("同步到云端失败");
          return;
        }
      }
      catch (Exception paramString) {}
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.yunData.m

 * JD-Core Version:    0.7.0.1

 */