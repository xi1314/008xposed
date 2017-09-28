package com.soft.tools.otherSystemValue;

import android.view.View;
import android.widget.AdapterView;

import com.a.a.Map;

final class c
  implements AdapterView.OnItemClickListener
{
  c(a parama, Map parame) {}
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt == 0) {
      this.b.a("status", "1");
    }
    for (;;)
    {
      OtherSystemValueActivity.a(OtherSystemValueActivity.a.a(a.a(this.a))).notifyDataSetChanged();
      return;
      if (paramInt == 1) {
        this.b.a("status", "2");
      } else if (paramInt == 2) {
        this.b.a("status", "3");
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.otherSystemValue.c

 * JD-Core Version:    0.7.0.1

 */