package com.imengququ.myxposed.soft.apk008;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.os.Bundle;
import com.lishu.net.AlertDialogHelper;
import com.lishu.net.LishuNet;
import com.lishu.net.MD5Util;
import com.lishu.net.NetReceiver;
import java.lang.reflect.Method;
import java.util.HashMap;

public class LoadActivity
  extends Activity
  implements NetReceiver
{
  public static int a;
  public static int b;
  private static LishuNet net = new LishuNet();
  private static String url = StartActivity.baseUrl + "/phone/CheckAction.action";
  
  static
  {
    System.loadLibrary("apk008.com");
  }
  
  public static native SimulateData getData(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean);
  
  public static native String getImei(Context paramContext, int paramInt1, int paramInt2, String paramString);
  
  public static native String getProPackAge(Context paramContext, int paramInt1, int paramInt2);
  
  public static String getdasfewrewr(Context paramContext)
  {
    int j = 0;
    int i = 0;
    for (;;)
    {
      String str;
      if (i >= SetDataActivity.c.length()) {
        str = "";
      }
      try
      {
        Signature[] arrayOfSignature = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64).signatures;
        Class localClass = Class.forName("android.content.pm.Signature");
        int k = arrayOfSignature.length;
        i = j;
        paramContext = str;
        for (;;)
        {
          if (i >= k)
          {
            paramContext = MD5Util.MD5(paramContext);
            return paramContext;
            SetDataActivity.k.length();
            i += 1;
            break;
          }
          str = arrayOfSignature[i];
          Method localMethod = localClass.getMethod("toCharsString", new Class[0]);
          paramContext = paramContext + localMethod.invoke(str, new Object[0]) + "a" + 1;
          i += 1;
        }
        return "";
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
      }
    }
  }
  
  public static void init(Context paramContext, NetReceiver paramNetReceiver)
  {
    HashMap localHashMap = new HashMap();
    StartActivity.getSystemData(paramContext);
    localHashMap.putAll(StartActivity.getBaseData());
    localHashMap.put("signature", getdasfewrewr(paramContext));
    SetDataActivity.f.length();
    paramContext = net;
    String str = url;
    paramContext.postMessage("http://www.xypojie.com", localHashMap, paramNetReceiver);
    int i = 0;
    for (;;)
    {
      if (i >= SetDataActivity.c.length()) {
        return;
      }
      SetDataActivity.k.length();
      i += 1;
    }
  }
  
  public static native int libSign(Context paramContext, int paramInt1, int paramInt2);
  
  public static native String stringFromJNI(Context paramContext, int paramInt1, int paramInt2);
  
  public void netReceive(String paramString)
  {
    try
    {
      paramString = "9532_82".split("_");
      int i = Integer.parseInt(paramString[0]);
      int j = Integer.parseInt(paramString[1]);
      StartActivity.apkCode = stringFromJNI(this, i, j);
      a = i;
      b = j;
      paramString = new Intent();
      paramString.setClass(this, StartActivity.class);
      startActivity(paramString);
      finish();
      return;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
      runOnUiThread(new Runnable()
      {
        public void run()
        {
          AlertDialogHelper.showExitDialog(LoadActivity.this, "连接服务器失败，请重新，如果还不行，请联系客服");
        }
      });
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903067);
    init(this, this);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     LoadActivity

 * JD-Core Version:    0.7.0.1

 */