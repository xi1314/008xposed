package com.soft.toos.findApp;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import java.util.HashMap;

final class f
  implements View.OnTouchListener
{
  f(QuickFindActivity paramQuickFindActivity) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = (int)(paramMotionEvent.getY() / QuickFindActivity.i(this.a));
    int j;
    if ((i >= 0) && (i < QuickFindActivity.c(this.a).length))
    {
      paramView = QuickFindActivity.c(this.a)[i];
      if (QuickFindActivity.e(this.a).containsKey(paramView))
      {
        j = ((Integer)QuickFindActivity.e(this.a).get(paramView)).intValue();
        if (QuickFindActivity.f(this.a).getHeaderViewsCount() <= 0) {
          break label174;
        }
        QuickFindActivity.f(this.a).setSelectionFromTop(j + QuickFindActivity.f(this.a).getHeaderViewsCount(), 0);
        QuickFindActivity.j(this.a).setVisibility(0);
        QuickFindActivity.j(this.a).setText(QuickFindActivity.c(this.a)[i]);
      }
    }
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return true;
      label174:
      QuickFindActivity.f(this.a).setSelectionFromTop(j, 0);
      break;
      QuickFindActivity.k(this.a).setBackgroundColor(Color.parseColor("#606060"));
      continue;
      QuickFindActivity.k(this.a).setBackgroundColor(Color.parseColor("#00ffffff"));
      QuickFindActivity.j(this.a).setVisibility(8);
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.toos.findApp.applicationInfolist

 * JD-Core Version:    0.7.0.1

 */