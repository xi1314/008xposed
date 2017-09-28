package com.lishu.levitate;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

final class w
  implements View.OnTouchListener
{
  w(FloatWindow paramFloatWindow) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      FloatWindow.a(this.a, 0.0F);
      FloatWindow.a(this.a, true);
      FloatWindow.b(this.a, paramMotionEvent.getRawX());
      FloatWindow.c(this.a, paramMotionEvent.getRawY());
      FloatWindow.d(this.a, this.a.b.x);
      FloatWindow.e(this.a, this.a.b.y);
    }
    do
    {
      return false;
      if (paramMotionEvent.getAction() != 2) {
        break;
      }
      float f2 = paramMotionEvent.getRawX() - FloatWindow.a(this.a);
      float f1 = paramMotionEvent.getRawY() - FloatWindow.b(this.a);
      paramView = this.a;
      FloatWindow.d(paramView, FloatWindow.c(paramView) + f2);
      paramView = this.a;
      FloatWindow.e(paramView, FloatWindow.d(paramView) + f1);
      paramView = this.a;
      float f3 = FloatWindow.e(paramView);
      FloatWindow.a(paramView, Math.abs(f2) + f3);
      paramView = this.a;
      f2 = FloatWindow.e(paramView);
      FloatWindow.a(paramView, Math.abs(f1) + f2);
      this.a.b.x = ((int)FloatWindow.c(this.a));
      this.a.b.y = ((int)FloatWindow.d(this.a));
      FloatWindow.b(this.a, paramMotionEvent.getRawX());
      FloatWindow.c(this.a, paramMotionEvent.getRawY());
      this.a.c.updateViewLayout(this.a.a, this.a.b);
    } while (FloatWindow.e(this.a) <= 5.0F);
    FloatWindow.b(this.a, true);
    return false;
    if (paramMotionEvent.getAction() == 1)
    {
      if (!FloatWindow.f(this.a)) {
        this.a.a();
      }
      FloatWindow.b(this.a, false);
      FloatWindow.g(this.a);
      return false;
    }
    FloatWindow.a(this.a, false);
    FloatWindow.b(this.a, false);
    FloatWindow.g(this.a);
    return false;
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.lishu.levitate.w
 * JD-Core Version:    0.7.0.1
 */