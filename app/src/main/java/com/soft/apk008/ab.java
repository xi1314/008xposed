package com.soft.apk008;

import android.app.Activity;
import android.opengl.GLSurfaceView;

final class ab
  extends Thread
{
  ab(aa paramaa, Activity paramActivity, GLSurfaceView paramGLSurfaceView) {}
  
  public final void run()
  {
    for (;;)
    {
      if (aa.a != null)
      {
        this.b.runOnUiThread(new ac(this, this.b, this.c));
        return;
      }
      try
      {
        Thread.sleep(100L);
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
      }
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.ab
 * JD-Core Version:    0.7.0.1
 */