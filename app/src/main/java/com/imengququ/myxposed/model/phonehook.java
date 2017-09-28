package com.imengququ.myxposed.model;

import de.robv.android.xposed.XC_MethodHook;

/**
 * Created by Administrator on 2017/9/4.
 */

public class phonehook extends XC_MethodHook {



    //hool之后的操作

    protected  void afterHookedMethod(XC_MethodHook.MethodHookParam  methodHookParam) throws Throwable
    {

        String str = methodHookParam.method.getName();
        if (str.equals("getNetworkType"))
        {
            methodHookParam.setResult(Integer.valueOf(4));
            return;
        }
        if (str.equals("getPhoneType"))
        {
            methodHookParam.setResult(Integer.valueOf(2));
            return;
        }
        if (str.equals("getSimState"))
        {
            methodHookParam.setResult(Integer.valueOf(5));
            return;
        }

    }



    //kook 之前的操作
    protected void  beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam)   throws Throwable{

        String methodname=methodHookParam.method.getName();
        if(methodname.equals("getDeviceId")){
            methodHookParam.setResult("这里填写deviceid");
        }





    }


}
