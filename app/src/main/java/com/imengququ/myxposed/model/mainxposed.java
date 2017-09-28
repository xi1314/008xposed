package com.imengququ.myxposed.model;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/**
 * Created by Administrator on 2017/9/4.
 * 萌趣修改器的主要hook 的功能实现class
 */

public class mainxposed implements IXposedHookLoadPackage{





    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable {


        XposedBridge.log("正在修改APP"+loadPackageParam.packageName);
        XposedHelpers.findAndHookMethod();
        XposedHelpers.findAndHookMethod();
        XposedHelpers.findAndHookMethod();
        XposedHelpers.findAndHookMethod();




    }


    public void fixNetwork(XC_LoadPackage.LoadPackageParam paramLoadPackageParam)
    {
        new XC_MethodHook()
        {
            protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramAnonymousMethodHookParam)
                    throws Throwable
            {
                XposedBridge.log("hit " + paramAnonymousMethodHookParam.method.getName());
                if ((paramAnonymousMethodHookParam.thisObject instanceof ConnectivityManager))
                {
                    paramAnonymousMethodHookParam.setResult(((ConnectivityManager)paramAnonymousMethodHookParam.thisObject).getNetworkInfo(0));
                    return;
                }
                if ((paramAnonymousMethodHookParam.thisObject instanceof WifiManager))
                {
                    paramAnonymousMethodHookParam.setResult(Boolean.FALSE);
                    return;
                }
                if ((paramAnonymousMethodHookParam.thisObject instanceof WifiInfo))
                {
                    paramAnonymousMethodHookParam.setResult(Integer.valueOf(0));
                    return;
                }
                if (((NetworkInfo)paramAnonymousMethodHookParam.thisObject).getType() == 0)
                {
                    paramAnonymousMethodHookParam.setResult(Boolean.TRUE);
                    return;
                }
                paramAnonymousMethodHookParam.setResult(Boolean.FALSE);
            }
        };
    }
}
