package de.robv.android.xposed.mods.tutorial.funcs;

import com.soft.tools.packageSim.PackAgeSimActivity;

import de.robv.android.xposed.XC_MethodHook;

import java.util.List;

public class Fuc_ActivityManager
  extends XhookMethod
{
  private static final String className = "android.app.ActivityManager";
  
  public Fuc_ActivityManager()
  {
    addHookWithOnlyMethodName("android.app.ActivityManager", "getRunningAppProcesses");
    addHookWithOnlyMethodName("android.app.ActivityManager", "getRunningServices");
    addHookWithOnlyMethodName("android.app.ActivityManager", "getRunningTasks");
    addHookWithOnlyMethodName("android.app.ActivityManager", "getRecentTasks");
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    Object localObject = paramMethodHookParam.method.getName();
    if (((String)localObject).equals("getRunningAppProcesses"))
    {
      localObject = PackAgeSimActivity.runningappprocessinfolist();

    }else if(((String)localObject).equals("getRunningServices") ){
      localObject = PackAgeSimActivity.runningserviceinfolist();
    }
    else if(((String)localObject).equals("getRunningTasks")){
    localObject = PackAgeSimActivity.runningtaskinfolist();
    }
    else if(((String)localObject).equals("getRecentTasks")){
      localObject = PackAgeSimActivity.recenttaskinfolist();
    }

     if ((localObject != null) && (((List)localObject).size() > 0)) {
      paramMethodHookParam.setResult(localObject);
    }

}
}

