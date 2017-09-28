package com.soft.tools.yunData;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;

final class aa
  implements Runnable
{
  aa(z paramz) {}
  
  public final void run()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a.a);
    localBuilder.setTitle("注意");
    localBuilder.setMessage("选中的分类文件中，共有" + this.a.a.c + "个备份文件需要下载");
    localBuilder.setNegativeButton("确定", new ab(this));
    localBuilder.setPositiveButton("取消", new ac(this));
    localBuilder.create().show();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.yunData.aa
 * JD-Core Version:    0.7.0.1
 */