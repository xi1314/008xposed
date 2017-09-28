package com.soft.apk008;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

final class av
  implements Runnable
{
  av(String paramString, Activity paramActivity) {}
  
  public final void run()
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setDataAndType(Uri.parse("file://" + this.a), "application/vnd.android.package-archive");
    this.b.startActivity(localIntent);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.av
 * JD-Core Version:    0.7.0.1
 */