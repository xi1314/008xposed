package com.soft.tools;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;

final class bu
  implements Runnable
{
  bu(bt parambt) {}
  
  public final void run()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a.a);
    localBuilder.setTitle("获取数据失败，请重新获取");
    localBuilder.setNegativeButton("确定", new bv(this));
    localBuilder.create().show();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.bu
 * JD-Core Version:    0.7.0.1
 */