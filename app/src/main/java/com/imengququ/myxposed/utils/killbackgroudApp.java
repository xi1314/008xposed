package com.imengququ.myxposed.utils;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;

import java.util.List;

/**
 * Created by Administrator on 2017/9/5.
 */

public class killbackgroudApp {

    public static void  killbackgroudApp (Context context , String packageName) {
        ActivityManager mActivityManager = (ActivityManager) context
                .getSystemService(Context.ACTIVITY_SERVICE);
        // 通过调用ActivityManager的getRunningAppServicees()方法获得系统里所有正在运行的进程
        List<ActivityManager.RunningServiceInfo> runServiceList = mActivityManager
                .getRunningServices(50);
//        System.out.println(runServiceList.size());
        // ServiceInfo Model类 用来保存所有进程信息
        for (ActivityManager.RunningServiceInfo runServiceInfo : runServiceList) {
            ComponentName serviceCMP = runServiceInfo.service;
            String serviceName = serviceCMP.getShortClassName(); // service 的类名
            String pkgName = serviceCMP.getPackageName(); // 包名

            if (pkgName.equals(packageName)) {
            mActivityManager.forceStopPackage(packageName);
                mActivityManager.killBackgroundProcesses(packageName);

            }

        }
    }

}
