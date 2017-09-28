package com.soft.apk008;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.Renderer;
import android.util.Log;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout.LayoutParams;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class aa
{
  public static String a = null;
  public static String b = null;
  public static String c = null;
  public static String d = null;
  
  public aa(Activity paramActivity)
  {
    if (a != null) {
      return;
    }
    a locala = new a(paramActivity);
    ((ViewGroup)paramActivity.getWindow().getDecorView()).addView(locala, new LinearLayout.LayoutParams(10, 10));
    new ab(this, paramActivity, locala).start();
  }
  
  public static String a()
  {
    if (a == null) {
      a = "";
    }
    return a;
  }
  
  public static String b()
  {
    if (b == null) {
      b = "";
    }
    return b;
  }
  
  final class a
    extends GLSurfaceView
  {
    aa.b a;
    
    public a(Context paramContext)
    {
      super();
      setEGLConfigChooser(8, 8, 8, 8, 0, 0);
      this.a = new aa.b(aa.this);
      setRenderer(this.a);
    }
  }
  
  final class b
    implements GLSurfaceView.Renderer
  {
    b() {}
    
    public final void onDrawFrame(GL10 paramGL10) {}
    
    public final void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2) {}
    
    public final void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
    {
      Log.d("SystemInfo", "GL_RENDERER = " + paramGL10.glGetString(7937));
      Log.d("SystemInfo", "GL_VENDOR = " + paramGL10.glGetString(7936));
      Log.d("SystemInfo", "GL_VERSION = " + paramGL10.glGetString(7938));
      Log.i("SystemInfo", "GL_EXTENSIONS = " + paramGL10.glGetString(7939));
      aa.a = paramGL10.glGetString(7937);
      aa.b = paramGL10.glGetString(7936);
      aa.c = paramGL10.glGetString(7938);
      aa.d = paramGL10.glGetString(7939);
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.aa
 * JD-Core Version:    0.7.0.1
 */