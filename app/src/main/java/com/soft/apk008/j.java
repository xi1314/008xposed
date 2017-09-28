package com.soft.apk008;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.umeng.analytics.MobclickAgent;

final class j
  implements DialogInterface.OnClickListener
{
  j(Apk008Activity paramApk008Activity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    MobclickAgent.c(this.a);
    System.exit(0);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.recenttaskinfolist

 * JD-Core Version:    0.7.0.1

 */