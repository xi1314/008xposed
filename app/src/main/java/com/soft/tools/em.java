package com.soft.tools;

import android.content.Context;
import android.widget.Toast;

final class em
  implements Runnable
{
  em(Context paramContext, int paramInt) {}
  
  public final void run()
  {
    Toast.makeText(this.a, "共清除" + this.b + "条记录", 0).show();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.em
 * JD-Core Version:    0.7.0.1
 */