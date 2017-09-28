package com.imengququ.myxposed.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Handler;
import android.os.RemoteException;
import android.text.format.Formatter;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.content.pm.IPackageDataObserver;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by Administrator on 2017/9/5.
 */

public class clearAPP {

    private PackageManager pm;
    StringBuilder sb = new StringBuilder();
    StringBuilder sbCache = new StringBuilder();
    private long cacheS;
    Handler mHadler = new Handler();

    class MyPackageStateObserver extends IPackageStatsObserver.Stub {

        @Override
        public void onGetStatsCompleted(PackageStats pStats, boolean succeeded) throws RemoteException {
            String packageName = pStats.packageName;
            long cacheSize = pStats.cacheSize;
            long codeSize = pStats.codeSize;
            long dataSize = pStats.dataSize;
            cacheS += cacheSize;
           sb.delete(0, sb.length());
            if (cacheSize > 0) {
                sb.append("packageName = " + packageName + "\n")
                        .append("   cacheSize: " + cacheSize + "\n")
                        .append("   dataSize: " + dataSize + "\n")
                        .append("-----------------------\n")
                ;

                Log.e("aaaa", sb.toString());
            }

        }
    }
    class ClearCacheObj extends IPackageDataObserver.Stub {

        @Override
        public void onRemoveCompleted(String packageName, final boolean succeeded) throws RemoteException {
            mHadler.post(new Runnable() {
                @Override
                public void run() {
//                    Toast.makeText(getApplicationContext(), "清楚状态： " + succeeded, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
    private void getCaches(){
        // scan

        List<PackageInfo> packages = pm.getInstalledPackages(0);

        int max = packages.size();
        int current = 0;
        sb.delete(0, sb.length());
        sb.append("所有已安装的app信息：\n");
        sb.append("所有App 总和：" + max + " \n");

        for (PackageInfo pinfo : packages) {
            String packageName = pinfo.packageName;
            try {

                Method getPackageSizeInfo = PackageManager.class
                        .getDeclaredMethod("getPackageSizeInfo", String.class, IPackageStatsObserver.class);
                getPackageSizeInfo.invoke(pm, packageName, new MyPackageStateObserver());
                current++;
            } catch (Exception e) {
                current++;
                e.printStackTrace();
            }

        }

    }
    /**
     * 清理全部应用程序缓存的点击事件
     *
     * @param
     */
    public void cleanAll() {
        //freeStorageAndNotify
        Method[] methods = PackageManager.class.getMethods();
        for (Method method : methods) {
            if ("freeStorageAndNotify".equals(method.getName())) {
                try {
                    method.invoke(pm, Long.MAX_VALUE, new ClearCacheObj());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return;
            }
        }
    }
}
