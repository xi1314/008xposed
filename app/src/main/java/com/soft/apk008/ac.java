package com.soft.apk008;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.view.ViewGroup;
import android.view.Window;

final class ac
  implements Runnable
{
  ac(ab paramab, Activity paramActivity, GLSurfaceView paramGLSurfaceView) {}
  
  public final void run()
  {
    ((ViewGroup)this.b.getWindow().getDecorView()).removeView(this.c);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.ac
 * JD-Core Version:    0.7.0.1
 */