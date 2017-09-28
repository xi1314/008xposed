package com.soft.tools;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.widget.Toast;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class dd
  implements Runnable
{
  dd(dc paramdc) {}
  
  public final void run()
  {
    Object localObject = QuickToolActivity.e(dc.a(this.a)).getText().toString().split("_");
    PackageManager localPackageManager;
    if (localObject.length == 2)
    {
      if (QuickToolActivity.l(dc.a(this.a)).isChecked()) {
        FindPhoneDataActivity.a(dc.a(this.a), PoseHelper008.valueMap.getStringfrommap("getDeviceId"));
      }
      localObject = localObject[1];
      localPackageManager = dc.a(this.a).getPackageManager();
      new Intent();
    }
    try
    {
      localObject = localPackageManager.getLaunchIntentForPackage((String)localObject);
      dc.a(this.a).startActivity((Intent)localObject);
      return;
    }
    catch (Exception localException)
    {
      Toast.makeText(dc.a(this.a), "未找到该应用", 0).show();
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.dd

 * JD-Core Version:    0.7.0.1

 */