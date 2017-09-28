package de.robv.android.xposed.mods.tutorial.funcs;

import android.util.Log;

import com.soft.apk008.SettingActivity;
import com.soft.tools.DepthSetActivity;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;

public abstract class XhookMethod
  extends XC_MethodHook
{
  protected static ClassLoader classLoader;
  public static ArrayList funcList = new ArrayList();
  protected static String targetPackageName;
  
  public XhookMethod()
  {
    funcList.add(this);
  }
  
  public static void addHooks(String PackageName, ClassLoader paramClassLoader)
  {
    targetPackageName = PackageName;
    classLoader = paramClassLoader;
    new Fuc_Account();
    if (DepthSetActivity.isexistkey("Fuc_ActivityManager")) {
      new Fuc_ActivityManager();
    }
    new Fuc_BlueAdapter();
    new Fuc_BlueDevice();
    new Fuc_LayoutParams();
    new Fuc_Resources();
    new Fuc_WebSettings();
    new Fuc_IoBridge();
    if (DepthSetActivity.isexistkey("Fuc_PackageManager")) {
      new Fuc_PackageManager();
    }
    if (DepthSetActivity.isexistkey("Fuc_PackageStats")) {
      new Fuc_PackageStats();
    }
    new Fuc_TelephonyManagerMore();
    if (!"false".equals(SettingActivity.a("Fuc_PhoneSubInfo"))) {
      new Fuc_PhoneSubInfo();
    }
    new Fuc_SystemProperties();
    new Fuc_System();
    if (DepthSetActivity.isexistkey("Fuc_Process")) {
      new Fuc_Process();
    }
    new Fuc_NetWorkInfo();
    new Fuc_NetworkInterface();
    new Fuc_GLImpl();
  }
  
  public static void changePrivateVariable(Field paramField, Object paramObject1, Object paramObject2)
    throws Exception
  {
    if ((paramObject2 == null) || (paramField == null)) {
      return;
    }
    paramField.setAccessible(true);
    paramField.set(paramObject1, paramObject2);
  }
  //改变文件的状态
  public static void changeStaticVariable(Field paramField, Object paramObject)
  {
    if ((paramObject == null) || (paramField == null)) {
      return;
    }
    try
    {
      paramField.setAccessible(true);
      paramField.set(null, paramObject);
      return;
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  //xposed 日记输出
  public static void onLog(String paramString)
  {
    Log.e("onLog", paramString);
    if (SettingActivity.islog()) {
      XposedBridge.log(paramString);
    }
  }
//    findAndHookMethod(String className, ClassLoader classLoader, String methodName, Object... parameterTypesAndCallback)

  //添加hook
  public void addHook(String className, String methodName, Object... paramVarArgs)
  {

    //不断
    Object[] arrayOfObject = new Object[paramVarArgs.length + 1];
    int i = 0;
    for (;;)
    {
      if (i >= paramVarArgs.length)
      {
        arrayOfObject[paramVarArgs.length] = this;
        XposedHelpers.findAndHookMethod(className, classLoader, methodName, arrayOfObject);
        return;
      }
      arrayOfObject[i] = paramVarArgs[i];
      i += 1;
    }
  }
  
  public void addHookCon(String className, Object... paramVarArgs)
  {
    Object[] arrayOfObject = new Object[paramVarArgs.length + 1];
    int i = 0;
    for (;;)
    {
      if (i >= paramVarArgs.length)
      {
        arrayOfObject[paramVarArgs.length] = this;
        XposedHelpers.findAndHookConstructor(className, classLoader, arrayOfObject);
        return;
      }
      arrayOfObject[i] = paramVarArgs[i];
      i += 1;
    }
  }
  //
  public void addHookConOnly(String className)
  {
   Class  paramClass = XposedHelpers.findClass(className, classLoader);
    if (paramClass == null) {

    }
    for (;;)
    {
//      return;
      Constructor[] paramConstructor = paramClass.getDeclaredConstructors();
        int j = paramConstructor.length;
      int i = 0;
      while (i < j)
      {
        Member localMember = paramConstructor[i];
        if (Modifier.isPublic(localMember.getModifiers())) {
          XposedBridge.hookMethod(localMember, this);
        }
        i += 1;
      }
    }

  }
  //只用方法名字添加hook
  public void addHookWithOnlyMethodName(String classloader, String Methodname)
  {
    for (;;)
    {
      ArrayList localArrayList;
      int i;
       Method localObject;
      try
      {
        Class paramClass = XposedHelpers.findClass(classloader, classLoader);
        if (paramClass == null) {
          return;
        }
          Method[] paramMethod = paramClass.getDeclaredMethods();
        localArrayList = new ArrayList();
        int j = paramMethod.length;
        i = 0;
        if (i >= j)
        {
         Iterator iterator = localArrayList.iterator();
          if (!iterator.hasNext()) {
            break;
          }
          XposedBridge.hookMethod((Method)iterator.next(), this);
          continue;
        }
        localObject = paramMethod[i];
      }
      catch (Exception e)
      {
        e.printStackTrace();
        return;
      }


      if ((localObject.getName().equals(Methodname)) && (!Modifier.isAbstract(localObject.getModifiers()))) {
        localArrayList.add(localObject);
      }
      i += 1;
    }
  }


  protected abstract void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam);
  
  protected abstract void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam);
}

