package com.soft.tools.yunData;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;

final class al
  implements Runnable
{
  al(YunDataDownLoadActivity paramYunDataDownLoadActivity, String paramString) {}
  
  public final void run()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a);
    localBuilder.setTitle("注意");
    localBuilder.setMessage(this.b);
    localBuilder.create().show();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.yunData.al
 * JD-Core Version:    0.7.0.1
 */