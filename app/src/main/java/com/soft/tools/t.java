package com.soft.tools;

import android.widget.CheckBox;
import de.robv.android.xposed.mods.tutorial.Shell;

import java.util.Iterator;

final class t
  extends Thread
{
  t(s params) {}
  
  public final void run()
  {
    ClearApplicationDataActivity.a(s.a(this.a), true);
    s.a(this.a).a();
    for (;;)
    {
      try
      {
        localIterator = s.a(this.a).a.entrySet().iterator();
        boolean bool = localIterator.hasNext();
        if (bool) {
          continue;
        }
      }
      catch (Exception localException)
      {
        Iterator localIterator;
        Object localObject;
        String str;
        localException.printStackTrace();
        continue;
      }
      s.a(this.a).runOnUiThread(new v(this));
      ClearApplicationDataActivity.a(s.a(this.a), false);
      return;
      localObject = (Map.Entry)localIterator.next();
      ((Map.Entry)localObject).getKey();
      localObject = (CheckBox)((Map.Entry)localObject).getValue();
      if (((CheckBox)localObject).isChecked())
      {
        localObject = (ClearApplicationDataActivity.a)((CheckBox)localObject).getTag();
        Shell.execCommandWithResult("pm clear " + ClearApplicationDataActivity.a.a((ClearApplicationDataActivity.a)localObject), true);
        str = ClearApplicationDataActivity.a.b((ClearApplicationDataActivity.a)localObject);
        a.a(ClearApplicationDataActivity.a.a((ClearApplicationDataActivity.a)localObject));
        s.a(this.a).runOnUiThread(new u(this, str));
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.t

 * JD-Core Version:    0.7.0.1

 */