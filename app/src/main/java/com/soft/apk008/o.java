package com.soft.apk008;

import android.content.Intent;
import com.lishu.levitate.FloatWindow;

final class o
  implements Runnable
{
  o(n paramn) {}
  
  public final void run()
  {
    Intent localIntent = new Intent(this.a.a, FloatWindow.class);
    this.a.a.startService(localIntent);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.o
 * JD-Core Version:    0.7.0.1
 */