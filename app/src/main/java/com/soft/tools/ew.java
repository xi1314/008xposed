package com.soft.tools;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.widget.CheckBox;

import de.robv.android.xposed.mods.tutorial.Shell;

import java.util.Iterator;

final class ew
  extends Thread
{
  ew(ev paramev) {}
  
  public final void run()
  {
    UnInstallActivity.a(ev.a(this.a), true);
    ev.a(this.a).a();
    Iterator localIterator = ev.a(this.a).a.entrySet().iterator();
    do
    {
      if (!localIterator.hasNext())
      {
        ev.a(this.a).runOnUiThread(new ey(this));
        UnInstallActivity.a(ev.a(this.a), false);
        return;
      }
      localObject1 = (Map.Entry)localIterator.next();
      ((Map.Entry)localObject1).getKey();
      localObject1 = (CheckBox)((Map.Entry)localObject1).getValue();
    } while (!((CheckBox)localObject1).isChecked());
    Object localObject1 = (UnInstallActivity.a)((CheckBox)localObject1).getTag();
    Shell.execCommand("pm uninstall " + UnInstallActivity.a.a((UnInstallActivity.a)localObject1));
    Object localObject2 = ev.a(this.a).getPackageManager();
    for (;;)
    {
      try
      {
        ApplicationInfo localApplicationInfo = ((PackageManager)localObject2).getApplicationInfo(UnInstallActivity.a.a((UnInstallActivity.a)localObject1), 128);
        if (localApplicationInfo != null) {
          continue;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        localNameNotFoundException.printStackTrace();
        continue;
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
        continue;
      }
      localObject2 = UnInstallActivity.a.b((UnInstallActivity.a)localObject1);
      a.a(UnInstallActivity.a.a((UnInstallActivity.a)localObject1));
      ev.a(this.a).runOnUiThread(new ex(this, (String)localObject2));
      break;
      Thread.sleep(300L);
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.ew

 * JD-Core Version:    0.7.0.1

 */