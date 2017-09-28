package com.soft.toos.findApp;

import android.app.ProgressDialog;
import android.widget.ListView;

final class d
  implements Runnable
{
  d(c paramc) {}
  
  public final void run()
  {
    QuickFindActivity.a(c.a(this.a), new b(c.a(this.a), QuickFindActivity.d(c.a(this.a))));
    QuickFindActivity.f(c.a(this.a)).setAdapter(QuickFindActivity.g(c.a(this.a)));
    QuickFindActivity.g(c.a(this.a)).notifyDataSetChanged();
    QuickFindActivity.h(c.a(this.a)).cancel();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.toos.findApp.getMap

 * JD-Core Version:    0.7.0.1

 */