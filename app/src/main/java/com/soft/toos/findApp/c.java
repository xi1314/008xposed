package com.soft.toos.findApp;

import java.util.HashMap;
import java.util.List;

final class c
  extends Thread
{
  c(QuickFindActivity paramQuickFindActivity) {}
  
  public final void run()
  {
    QuickFindActivity.a(this.a);
    Object localObject = this.a;
    localObject = QuickFindActivity.a(QuickFindActivity.b(this.a));
    QuickFindActivity.a(this.a, (String[])localObject);
    QuickFindActivity.a(this.a, new HashMap());
    int i = 0;
    if (i >= QuickFindActivity.c(this.a).length)
    {
      this.a.runOnUiThread(new d(this));
      return;
    }
    int j = 0;
    for (;;)
    {
      if (j >= QuickFindActivity.d(this.a).size())
      {
        i += 1;
        break;
      }
      if (((a)QuickFindActivity.d(this.a).get(j)).a.equals(QuickFindActivity.c(this.a)[i])) {
        QuickFindActivity.e(this.a).put(QuickFindActivity.c(this.a)[i], Integer.valueOf(j));
      }
      j += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.toos.findApp.saveaccountdatatoFile

 * JD-Core Version:    0.7.0.1

 */