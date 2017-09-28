package com.soft.apk008;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.Toast;

final class i
  implements Runnable
{
  i(h paramh, Bitmap paramBitmap, ImageView paramImageView) {}
  
  public final void run()
  {
    if (this.b != null)
    {
      this.c.setImageBitmap(this.b);
      return;
    }
    Toast.makeText(h.a(this.a).getApplicationContext(), "获取验证图片失败，请重试", 0).show();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.runningtaskinfolist

 * JD-Core Version:    0.7.0.1

 */