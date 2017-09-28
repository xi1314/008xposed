package com.imengququ.myxposed.utils;

import android.net.Uri;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/9/5.
 */

public class uninstallAPP {




    private void pmuninstall(String appname) {

        String[] args = { "pm", "uninstall", appname };
        String result = null;
        ProcessBuilder processBuilder = new ProcessBuilder(args);

        Process process = null;
        InputStream errIs = null;
        InputStream inIs = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int read = -1;
            process = processBuilder.start();
            errIs = process.getErrorStream();
            while ((read = errIs.read()) != -1) {
                baos.write(read);
            }
            baos.write('\n');
            inIs = process.getInputStream();
            while ((read = inIs.read()) != -1) {
                baos.write(read);
            }
            byte[] data = baos.toByteArray();
            result = new String(data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (errIs != null) {
                    errIs.close();
                }
                if (inIs != null) {
                    inIs.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (process != null) {
                process.destroy();
            }
        }
    }

private void refleuninstall(String appname) throws NoSuchMethodException {
    Class<?> pmService;
    Class<?> activityTherad;
    Method method;

    try {
        activityTherad = Class.forName("android.app.ActivityThread");
        Class<?> paramTypes[] = getParamTypes(activityTherad,
                "getPackageManager");
        method = activityTherad.getMethod("getPackageManager", paramTypes);
        Object PackageManagerService = method.invoke(activityTherad);

        pmService = PackageManagerService.getClass();

        Class<?> paramTypes1[] = getParamTypes(pmService, "deletePackage");
        method = pmService.getMethod("deletePackage", paramTypes1);
        method.invoke(PackageManagerService, appname, null, 0);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (InvocationTargetException e) {
        e.printStackTrace();
    } catch (IllegalAccessException e) {
        e.printStackTrace();
    }

}

    private boolean pminstall(Uri appname)
    {
        String[] args = {"pm", "install", "-r", appname.getPath()};
        String result = null;
        ProcessBuilder processBuilder = new ProcessBuilder(args);;
        Process process = null;
        InputStream errIs = null;
        InputStream inIs = null;
        try{
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int read = -1;
            process = processBuilder.start();
            errIs = process.getErrorStream();
            while((read = errIs.read()) != -1){
                baos.write(read);
            }
            baos.write('\n');
            inIs = process.getInputStream();
            while((read = inIs.read()) != -1){
                baos.write(read);
            }
            byte[] data = baos.toByteArray();
            result = new String(data);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(errIs != null){
                    errIs.close();
                }
                if(inIs != null){
                    inIs.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            if(process != null){
                process.destroy();
            }
        }

        if(result != null && (result.endsWith("Success")||result.endsWith("Success\n")))
        {
            return true;
        }
        return false;
    }

    private void refinstall(Uri appname){

        try {
            Class<?> pmService;
            Class<?> activityTherad;
            Method method;

            activityTherad = Class.forName("android.app.ActivityThread");
            Class<?> paramTypes[] = getParamTypes(activityTherad , "getPackageManager");
            method = activityTherad.getMethod("getPackageManager", paramTypes);
            Object PackageManagerService = method.invoke(activityTherad);

            pmService = PackageManagerService.getClass();

            Class<?> paramTypes1[] = getParamTypes(pmService , "installPackage");
            method = pmService.getMethod("installPackage", paramTypes1);
            method.invoke(PackageManagerService , appname , null , 0 , null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
    }

    private Class<?>[] getParamTypes(Class<?> cls, String mName) {
        Class<?> cs[] = null;

        Method[] mtd = cls.getMethods();

        for (int i = 0; i < mtd.length; i++) {
            if (!mtd[i].getName().equals(mName)) {
                continue;
            }
            cs = mtd[i].getParameterTypes();
        }
        return cs;
    }

    private Uri getPackageUri()
    {
        File file = new File("/storage/sdcard0/download/1.apk");
        return Uri.fromFile(file);
    }

}
