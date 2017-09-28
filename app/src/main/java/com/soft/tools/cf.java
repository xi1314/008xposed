package com.soft.tools;

import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class cf
  implements Runnable
{
  cf(ce paramce) {}
  
  public final void run()
  {
    KillBackGroundActivity.c(cd.a(ce.a(this.a))).removeAllViews();
    cd.a(ce.a(this.a)).a.clear();
    KillBackGroundActivity.a(cd.a(ce.a(this.a)), KillBackGroundActivity.d(cd.a(ce.a(this.a))));
    Iterator localIterator = KillBackGroundActivity.e(cd.a(ce.a(this.a))).iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        Toast.makeText(cd.a(ce.a(this.a)), "一共杀死" + cd.a(ce.a(this.a)).b + "个进程", 0).show();
        return;
      }
      KillBackGroundActivity.b localb = (KillBackGroundActivity.b)localIterator.next();
      String str = localb.b;
      CheckBox localCheckBox = cd.a(ce.a(this.a)).a(str);
      localCheckBox.setTag(localb);
      cd.a(ce.a(this.a)).a.put(str, localCheckBox);
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.cf
 * JD-Core Version:    0.7.0.1
 */