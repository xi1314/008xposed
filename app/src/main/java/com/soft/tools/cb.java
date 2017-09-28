package com.soft.tools;

import android.widget.ProgressBar;
import android.widget.TextView;

import com.a.a.Map;
import com.a.a.maputils;
import com.lishu.c.w;

final class cb
  implements w
{
  cb(IpRecordActivity paramIpRecordActivity, ProgressBar paramProgressBar, TextView paramTextView) {}
  
  public final void a(String paramString)
  {
    String str1 = null;
    try
    {
      paramString = maputils.getmap(paramString);
      if (paramString == null) {}
      Object localObject;
      String str2;
      for (paramString = "获取失败";; paramString = paramString + "," + str1 + "," + str2 + "," + (String)localObject)
      {
        this.a.runOnUiThread(new cc(this, this.b, this.c, paramString));
        return;
        localObject = paramString.d("data");
        paramString = ((Map)localObject).getStringfrommap("country");
        str1 = ((Map)localObject).getStringfrommap("region");
        str2 = ((Map)localObject).getStringfrommap("city");
        localObject = ((Map)localObject).getStringfrommap("isp");
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString = str1;
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.cb

 * JD-Core Version:    0.7.0.1

 */