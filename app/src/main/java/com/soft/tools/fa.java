package com.soft.tools;

import android.content.pm.PackageManager;
import android.widget.CheckBox;

import de.robv.android.xposed.mods.tutorial.Shell;

import java.util.Iterator;

final class fa
  extends Thread
{
  fa(ez paramez) {}
  
  public final void run()
  {
    ez.a(this.a).a();
    Iterator localIterator = ez.a(this.a).a.entrySet().iterator();
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
        localObject = (UnInstallWhiteActivity.a)((CheckBox)localObject).getTag();
        Shell.execCommand("pm uninstall " + UnInstallWhiteActivity.a.a((UnInstallWhiteActivity.a)localObject));
        PackageManager localPackageManager = ez.a(this.a).getPackageManager();
        try
        {
          while (localPackageManager.getApplicationInfo(UnInstallWhiteActivity.a.a((UnInstallWhiteActivity.a)localObject), 128) != null) {
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

 * Qualified Name:     com.soft.tools.fa

 * JD-Core Version:    0.7.0.1

 */