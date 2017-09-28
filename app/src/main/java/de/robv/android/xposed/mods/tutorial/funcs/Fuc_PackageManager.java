package de.robv.android.xposed.mods.tutorial.funcs;

import com.soft.tools.packageSim.PackAgeSimActivity;

import de.robv.android.xposed.XC_MethodHook;

import java.util.List;

public class Fuc_PackageManager
  extends XhookMethod
{
  private static final String className = "android.app.ApplicationPackageManager";
  
  public Fuc_PackageManager()
  {
    addHookWithOnlyMethodName("android.app.ApplicationPackageManager", "getInstalledApplications");
    addHookWithOnlyMethodName("android.app.ApplicationPackageManager", "getInstalledPackages");
    addHookWithOnlyMethodName("android.app.ApplicationPackageManager", "getPackageInfo");
    addHookWithOnlyMethodName("android.app.ApplicationPackageManager", "getApplicationInfo");
    addHookWithOnlyMethodName("android.app.ApplicationPackageManager", "getPackageArchiveInfo");
    addHookWithOnlyMethodName("android.app.ApplicationPackageManager", "queryIntentActivities");
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    if (PackAgeSimActivity.getpackageinfo()) {
    String   methodname = paramMethodHookParam.method.getName();
      if(  (methodname).equals("getInstalledApplications")){
      Object  localObject = PackAgeSimActivity.applicationInfolist();

      }
      else if(   (methodname).equals("getInstalledApplications") ){
        Object  localObject =
      }
      else if((methodname).equals("getInstalledPackages")){
        Object  localObject =
      }
      else if((methodname).equals("getPackageInfo")){
        Object  localObject =
      }
      else if((methodname).equals("getApplicationInfo")){
        Object  localObject =   PackAgeSimActivity.createdapplicationinfo((String)methodname);
      }
      else if((methodname).equals("getPackageArchiveInfo")){
        Object  localObject =
      }
      else if((methodname).equals("queryIntentActivities")){
        Object  localObject =
      }



      if((methodname != null) && (((List)methodname).size() > 0)){
        paramMethodHookParam.setResult(methodname);
      }

    }
    Object localObject;
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  return;
                  localObject = paramMethodHookParam.method.getName();
                  if (!((String)localObject).equals("getInstalledApplications")) {
                    break;
                  }
                  localObject = PackAgeSimActivity.applicationInfolist();
                } while ((localObject == null) || (((List)localObject).size() <= 0));
                onLog("---getInstalledApplications----");
                paramMethodHookParam.setResult(localObject);
                return;
                if (!((String)localObject).equals("getInstalledPackages")) {
                  break;
                }
                localObject = PackAgeSimActivity.packageinfolist();
              } while ((localObject == null) || (((List)localObject).size() <= 0));
              onLog("---getInstalledPackages----");
              paramMethodHookParam.setResult(localObject);
              return;
              if (!((String)localObject).equals("getPackageInfo")) {
                break;
              }
              localObject = paramMethodHookParam.args[0];
              onLog("---getPackageInfo----" + (String)localObject);
            } while (((String)localObject).equals(targetPackageName));
            onLog("---getPackageInfo----");
            localObject = PackAgeSimActivity.getpackageinfo((String)localObject);
          } while (localObject == null);
          paramMethodHookParam.setResult(localObject);
          return;
          if (!((String)localObject).equals("getApplicationInfo")) {
            break;
          }
          localObject = paramMethodHookParam.args[0];
          onLog("---getApplicationInfo----" + (String)localObject);
        } while (((String)localObject).equals(targetPackageName));
        onLog("---getApplicationInfo----");
        localObject = PackAgeSimActivity.createdapplicationinfo((String)localObject);
      } while (localObject == null);
      paramMethodHookParam.setResult(localObject);
      return;
    } while (((String)localObject).equals("getPackageArchiveInfo"));
    ((String)localObject).equals("queryIntentActivities");
  }
}

