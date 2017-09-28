package com.soft.tools;

import android.content.pm.PackageManager;
import android.widget.CheckBox;
import de.robv.android.xposed.mods.tutorial.Shell;

import java.util.Iterator;

final class x
  extends Thread
{
  x(w paramw) {}
  
  public final void run()
  {
    w.a(this.a).a();
    Iterator localIterator = w.a(this.a).a.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      Object localObject = (Map.Entry)localIterator.next();
      ((Map.Entry)localObject).getKey();
      localObject = (CheckBox)((Map.Entry)localObject).getValue();
      if (((CheckBox)localObject).isChecked())
      {
        localObject = (ClearApplicationDataWhiteActivity.a)((CheckBox)localObject).getTag();
        Shell.execCommand("pm uninstall " + ClearApplicationDataWhiteActivity.a.a((ClearApplicationDataWhiteActivity.a)localObject));
        PackageManager localPackageManager = w.a(this.a).getPackageManager();
        try
        {
          while (localPackageManager.getApplicationInfo(ClearApplicationDataWhiteActivity.a.a((ClearApplicationDataWhiteActivity.a)localObject), 128) != null) {
            Thread.sleep(300L);
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          localNameNotFoundException.printStackTrace();
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
        }
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.x

 * JD-Core Version:    0.7.0.1

 */