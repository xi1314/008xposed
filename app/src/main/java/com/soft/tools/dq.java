package com.soft.tools;

import android.app.ProgressDialog;
import android.widget.EditText;
import com.lishu.c.a;

final class dq
  implements Runnable
{
  dq(dp paramdp, String paramString1, long paramLong, String paramString2) {}
  
  public final void run()
  {
    RecordAppFileHandler.d(dp.a(this.a)).setText(this.b);
    dp.a(this.a).a.cancel();
    if (this.c > 102400L)
    {
      String str = "记录文件过大,只显示前100k，文件路径为/sdcard/.log/" + this.d + "  ,该文件过大的原因可能是该应用扫描内存卡，请查看文件列表后，谨慎删除相应文件！";
      a.c(dp.a(this.a), str);
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.dq
 * JD-Core Version:    0.7.0.1
 */