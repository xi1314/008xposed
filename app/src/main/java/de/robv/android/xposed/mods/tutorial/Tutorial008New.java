package de.robv.android.xposed.mods.tutorial;

import dalvik.system.PathClassLoader;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

import java.io.File;

public class Tutorial008New
  implements IXposedHookLoadPackage, onlog
{
  public static boolean debug1 = true;
  public IXposedHookLoadPackage iXposedHookLoadPackage = null;
  
  public Tutorial008New()
  {
    if (this.iXposedHookLoadPackage != null) {}
    try
    {
      this.iXposedHookLoadPackage.handleLoadPackage(null);
      return;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
  }
  
  public void handleLoadPackage(XC_LoadPackage.LoadPackageParam paramLoadPackageParam)
    throws Throwable
  {
    String str = String.format("/data/app/%s-%s.apk", new Object[] { "com.soft.apk008v", Integer.valueOf(1) });
    Object localObject = str;
    int i;
    if (!new File(str).exists())
    {
      str = String.format("/data/app/%s-%s.apk", new Object[] { "com.soft.apk008v", Integer.valueOf(2) });
      localObject = str;
      if (!new File(str).exists())
      {
        i = 0;
        localObject = str;
      }
    }
    for (;;)
    {
      if (i == 0)
      {
        str = String.format("/data/app/%s-%s/base.apk", new Object[] { "com.soft.apk008v", Integer.valueOf(1) });
        localObject = str;
        if (!new File(str).exists())
        {
          str = String.format("/data/app/%s-%s/base.apk", new Object[] { "com.soft.apk008v", Integer.valueOf(2) });
          localObject = str;
          if (!new File(str).exists())
          {
            XposedBridge.log("Error:在/data/app找不到APK文件" + str);
            return;
          }
        }
      }
      try
      {
        localObject = new PathClassLoader((String)localObject, ClassLoader.getSystemClassLoader());
        localObject = Class.forName(Tutorial008.class.getName(), true, (ClassLoader)localObject);
        ((Class)localObject).getMethod("handleLoadPackageTrue", new Class[] { XC_LoadPackage.LoadPackageParam.class }).invoke(((Class)localObject).newInstance(), new Object[] { paramLoadPackageParam });
        return;
      }
      catch (Exception e)
      {
        e.printStackTrace();
        return;
      }
      i = 1;
    }
  }
  
  public void onLog(String paramString) {}
}


