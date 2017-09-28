package de.robv.android.xposed.mods.tutorial.funcs;

import android.util.DisplayMetrics;

import com.soft.apk008.SettingActivity;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class Fuc_Resources
  extends XhookMethod
{
  private static final String className = "android.content.res.Resources";
  
  public Fuc_Resources()
  {
    addHookWithOnlyMethodName("android.content.res.Resources", "getDisplayMetrics");
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    Object localObject = paramMethodHookParam.method.getName();
    if (((String)localObject).equals("getDisplayMetrics"))
    {
      localObject = (DisplayMetrics)paramMethodHookParam.getResult();
      if ((localObject != null) && (SettingActivity.a("setDisplay").equals("true")))
      {
        paramMethodHookParam.getResult();
        str = (String)PoseHelper008.valueMap.get("getMetrics");
        arrayOfString1 = str.split("x");
        arrayOfString2 = PoseHelper008.getFileData("sourceDisplay").split("_");
        if (arrayOfString2.length == 2)
        {
          i = Integer.parseInt(arrayOfString2[0]);
          j = Integer.parseInt(arrayOfString2[1]);
          if ((i == ((DisplayMetrics)localObject).widthPixels) && (j == ((DisplayMetrics)localObject).heightPixels)) {
            break label129;
          }
        }
      }
    }
    label129:
    while (!((String)localObject).equals("getDrawable"))
    {
      String str;
      String[] arrayOfString1;
      String[] arrayOfString2;
      int j;
      do
      {
        return;
      } while (arrayOfString1.length != 2);
      onLog("模拟分辨率2 " + str);
      int i = Integer.parseInt(arrayOfString1[0]);
      ((DisplayMetrics)localObject).heightPixels = Integer.parseInt(arrayOfString1[1]);
      ((DisplayMetrics)localObject).widthPixels = i;
      if (PoseHelper008.valueMap.get("density") != null) {
        ((DisplayMetrics)localObject).density = Float.parseFloat(PoseHelper008.valueMap.get("density"));
      }
      if (PoseHelper008.valueMap.get("densityDpi") != null) {
        ((DisplayMetrics)localObject).densityDpi = Integer.parseInt(PoseHelper008.valueMap.get("densityDpi"));
      }
      if (PoseHelper008.valueMap.get("scaledDensity") != null) {
        ((DisplayMetrics)localObject).scaledDensity = Float.parseFloat(PoseHelper008.valueMap.get("scaledDensity"));
      }
      if (PoseHelper008.valueMap.get("xdpi") != null) {
        ((DisplayMetrics)localObject).xdpi = Float.parseFloat(PoseHelper008.valueMap.get("xdpi"));
      }
      if (PoseHelper008.valueMap.get("ydpi") != null) {
        ((DisplayMetrics)localObject).ydpi = Float.parseFloat(PoseHelper008.valueMap.get("ydpi"));
      }
      paramMethodHookParam.setResult(localObject);
      return;
    }
    onLog("------getDrawable----" + paramMethodHookParam.args[0]);
  }
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     de.robv.android.xposed.mods.tutorial.funcs.Fuc_Resources

 * JD-Core Version:    0.7.0.1

 */