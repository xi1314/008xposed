package com.soft.tools;

import android.widget.CheckBox;

import de.robv.android.xposed.mods.tutorial.Shell;

import java.util.Iterator;
import java.util.Set;

final class ce
  extends Thread
{
  ce(cd paramcd) {}
  
  public final void run()
  {
    cd.a(this.a).b = 0;
    Object localObject1 = cd.a(this.a).a.entrySet();
    cd.a(this.a).a();
    localObject1 = ((Set)localObject1).iterator();
    for (;;)
    {
      if (!((Iterator)localObject1).hasNext())
      {
        cd.a(this.a).runOnUiThread(new cf(this));
        return;
      }
      Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
      ((Map.Entry)localObject2).getKey();
      localObject2 = (CheckBox)((Map.Entry)localObject2).getValue();
      if (((CheckBox)localObject2).isChecked())
      {
        localObject2 = (KillBackGroundActivity.b)((CheckBox)localObject2).getTag();
        cd.a(this.a).getSystemService("activity");
        Shell.execCommand("kill " + ((KillBackGroundActivity.b)localObject2).c);
        localObject2 = cd.a(this.a);
        ((KillBackGroundActivity)localObject2).b += 1;
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.ce

 * JD-Core Version:    0.7.0.1

 */