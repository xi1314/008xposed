package com.soft.apk008;

import android.graphics.Bitmap;
import android.widget.ImageView;

final class h
  extends Thread
{
  h(Apk008Activity paramApk008Activity, ImageView paramImageView) {}
  
  public final void run()
  {
    Object localObject = StartActivity.b + "/VerifyCodeAction.action";
    Apk008Activity localApk008Activity = this.a;
    localObject = Apk008Activity.b((String)localObject);
    this.a.runOnUiThread(new i(this, (Bitmap)localObject, this.b));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.h
 * JD-Core Version:    0.7.0.1
 */