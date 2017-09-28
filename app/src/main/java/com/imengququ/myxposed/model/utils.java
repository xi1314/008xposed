package com.imengququ.myxposed.model;

import android.content.pm.ApplicationInfo;

import java.io.File;

/**
 * Created by Administrator on 2017/9/4.
 */



public class utils {



    public static String[] lastImei;

    static
    {

    }

    //判断是否是系统应用
    public static boolean isSystemApplication(String paramString, ApplicationInfo paramApplicationInfo)
    {
        if (new File("/data/app/" + paramApplicationInfo.packageName + ".apk").exists()) {}
        while ((paramApplicationInfo.flags & 0x1) != 0) {
            return true;
        }
        return false;
    }

    public static void StoreLastImei(String paramString)
    {
        if (!lastImei[0].equals(paramString)) {
            lastImei[0] = paramString;
        }
        while (lastImei[1].equals(paramString)) {
            return;
        }
        lastImei[1] = paramString;
    }

}
