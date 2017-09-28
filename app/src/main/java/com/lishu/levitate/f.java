package com.lishu.levitate;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.widget.Toast;

import com.soft.tools.FindPhoneDataActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class f
  implements Runnable
{
  f(a parama, String paramString) {}
  
  public final void run()
  {
    Object localObject = this.b.split("_");
    PackageManager localPackageManager;
    if (localObject.length == 2)
    {
      FindPhoneDataActivity.a(a.b(this.a), PoseHelper008.valueMap.getStringfrommap("getDeviceId"));
      localObject = localObject[1];
      localPackageManager = a.b(this.a).getPackageManager();
      new Intent();
    }
    try
    {
      localObject = localPackageManager.getLaunchIntentForPackage((String)localObject);
      ((Intent)localObject).addFlags(268435456);
      a.b(this.a).startActivity((Intent)localObject);
      return;
    }
    catch (Exception localException)
    {
      Toast.makeText(a.b(this.a), "未找到该应用", 0).show();
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.lishu.levitate.type

 * JD-Core Version:    0.7.0.1

 */