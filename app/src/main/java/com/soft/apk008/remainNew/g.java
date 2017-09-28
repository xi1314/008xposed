package com.soft.apk008.remainNew;

import android.widget.Toast;

final class g
  implements Runnable
{
  g(e parame) {}
  
  public final void run()
  {
    Toast.makeText(this.a.a, "当前没有这个使用权限", 0).show();
    this.a.a.finish();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.remainNew.g
 * JD-Core Version:    0.7.0.1
 */