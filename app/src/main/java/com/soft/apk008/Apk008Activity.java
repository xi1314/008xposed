package com.soft.apk008;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.a.a.Map;
import com.a.a.maputils;
import com.lishu.c.o;
import com.lishu.c.p;
import com.lishu.c.w;
import com.soft.apk008.agreement.AgreeMentActivity;
import com.soft.apk008.remainNew.Widget008BaseProvider;
import com.soft.apk008.service.ServiceFor008K;
import com.umeng.analytics.MobclickAgent;
import com.umeng.update.UmengUpdateAgent;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import de.robv.android.xposed.mods.tutorial.Shell;

import java.io.File;
import java.lang.reflect.Field;
import java.net.NetworkInterface;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;

public class Apk008Activity
  extends Activity
  implements w
{
  private static String C = StartActivity.b + "/phone/LogicSimpleAction.action";
  public static Activity a;
  public static boolean b;
  public static String f;
  public static String g;
  public static String h;
  public static String i;
  public static String j;
  public static String k;
  private static String s = StartActivity.b + "/phone/LogicSimpleAction.action";
  private static long z;
  private int A = 0;
  private boolean B = true;
  private String D = "";
  public View.OnClickListener c = new a(this);
  View.OnTouchListener d = new k(this);
  Dialog e = null;
  o l = new o();
  private View m;
  private ImageView n;// 进入修改界面 的按钮
  private View o;
  private View p;
  private TextView q;
  private View r;
  private p t = new p();
  private TextView u;
  private View v;
  private TextView w;
  private TextView x;
  private ProgressDialog y;
  PackageManager localPackageManager;
  PackageInfo  localApplicationInfo;
  static
  {
    b = true;
    z = 0L;
    f = "小偷可耻";
    g = "fuck you";
    h = "";
    i = "";
    j = "";
    k = "";
  }
  
  public static void a(Dialog paramDialog)
  {
    try
    {
      Field localField = paramDialog.getClass().getSuperclass().getDeclaredField("mShowing");
      localField.setAccessible(true);
      localField.set(paramDialog, Boolean.valueOf(true));
      paramDialog.cancel();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  private void a(ImageView paramImageView)
  {
    paramImageView.setOnClickListener(new g(this, paramImageView));
    new h(this, paramImageView).start();
  }
  
  /* Error */
  private static android.graphics.Bitmap c(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 210	java/net/URL
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 211	java/net/URL:<init>	(Ljava/lang/String;)V
    //   10: invokevirtual 215	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   13: checkcast 217	java/net/HttpURLConnection
    //   16: astore_0
    //   17: aload_0
    //   18: ldc 219
    //   20: new 54	java/lang/StringBuilder
    //   23: dup
    //   24: ldc 221
    //   26: invokespecial 68	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   29: getstatic 223	com/lishu/saveaccountdatatoFile/p:XhookMethod	Ljava/lang/String;
    //   32: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   38: invokevirtual 227	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   41: aload_0
    //   42: sipush 10000
    //   45: invokevirtual 231	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   48: aload_0
    //   49: sipush 10000
    //   52: invokevirtual 234	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   55: aload_0
    //   56: iconst_1
    //   57: invokevirtual 237	java/net/HttpURLConnection:setDoInput	(Z)V
    //   60: aload_0
    //   61: iconst_1
    //   62: invokevirtual 240	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   65: aload_0
    //   66: invokevirtual 244	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   69: invokestatic 250	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   72: astore_1
    //   73: aload_0
    //   74: ifnull +7 -> 81
    //   77: aload_0
    //   78: invokevirtual 253	java/net/HttpURLConnection:disconnect	()V
    //   81: aload_1
    //   82: areturn
    //   83: astore_1
    //   84: aconst_null
    //   85: astore_0
    //   86: aload_1
    //   87: invokevirtual 183	java/lang/Exception:printStackTrace	()V
    //   90: aload_0
    //   91: ifnull +40 -> 131
    //   94: aload_0
    //   95: invokevirtual 253	java/net/HttpURLConnection:disconnect	()V
    //   98: aconst_null
    //   99: areturn
    //   100: astore_0
    //   101: aload_1
    //   102: ifnull +7 -> 109
    //   105: aload_1
    //   106: invokevirtual 253	java/net/HttpURLConnection:disconnect	()V
    //   109: aload_0
    //   110: athrow
    //   111: astore_2
    //   112: aload_0
    //   113: astore_1
    //   114: aload_2
    //   115: astore_0
    //   116: goto -15 -> 101
    //   119: astore_2
    //   120: aload_0
    //   121: astore_1
    //   122: aload_2
    //   123: astore_0
    //   124: goto -23 -> 101
    //   127: astore_1
    //   128: goto -42 -> 86
    //   131: aconst_null
    //   132: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	paramString	String
    //   1	81	1	localBitmap	android.graphics.Bitmap
    //   83	23	1	localException1	Exception
    //   113	9	1	str	String
    //   127	1	1	localException2	Exception
    //   111	4	2	localObject1	Object
    //   119	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	17	83	java/lang/Exception
    //   2	17	100	finally
    //   17	73	111	finally
    //   86	90	119	finally
    //   17	73	127	java/lang/Exception
  }
  
  private static boolean f()
  {
    try
    {
      Object localObject = NetworkInterface.getNetworkInterfaces();
      if (localObject != null)
      {
        localObject = Collections.list((Enumeration)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          NetworkInterface localNetworkInterface = (NetworkInterface)((Iterator)localObject).next();
          if ((localNetworkInterface.isUp()) && (localNetworkInterface.getInterfaceAddresses().size() != 0)) {
            if (!"tun0".equals(localNetworkInterface.getName()))
            {
              boolean bool = "ppp0".equals(localNetworkInterface.getName());
              if (!bool) {
                break;
              }
            }
            else
            {
              return true;
            }
          }
        }
      }
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
    return false;
  }
  
  public final String a()
  {
    Object localObject2 = null;
    try
    {
     localPackageManager = getApplicationContext().getPackageManager();
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException1)
    {
      for (;;)
      {
        PackageManager localPackageManager;
        ApplicationInfo localApplicationInfo;
        label22:
        Object localObject1 = null;
      }
    }
    try
    {
    localApplicationInfo = localPackageManager.getApplicationInfo(getPackageName(), 0);
      localObject2 = localApplicationInfo;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException2)
    {
      break label22;
    }
    return (String)localPackageManager.getApplicationLabel(localObject2);
  }
  
  public final void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    for (;;)
    {
      return;
      try
      {

        //
        Object localObject = maputils.getmap(paramString);
        paramString = ((Map)localObject).get("time");
        String str1 = ((Map)localObject).get("id");
        String str2 = ((Map)localObject).get("userName");
        localObject = ((Map)localObject).get("overTime");
        if (!paramString.equals("null"))
        {
          long l1 = Long.parseLong(paramString);
          runOnUiThread(new n(this, new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(l1)), str1, (String)localObject, str2));
          return;
        }
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
      }
    }
  }
  
  public final void b()
  {
    if (!b) {
      return;
    }
    b = false;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("注意");
    localBuilder.setMessage("请先注册，完成注册后，如果再后续的使用过程中，你的ID发送了变化，可以点击菜单键，登陆你的用户名和密码找回余下时间");
    localBuilder.setNegativeButton("注册", new q(this));
    localBuilder.setNeutralButton("找回时间", new r(this));
    localBuilder.setPositiveButton("稍后", new s(this));
    localBuilder.create().show();
  }
  
  public final void c()
  {
    Object localObject = new AlertDialog.Builder(this);
    ((AlertDialog.Builder)localObject).setTitle("用户注册");
    View localView = LayoutInflater.from(this).inflate(2130903053, null);
    ((AlertDialog.Builder)localObject).setView(localView);
    ((AlertDialog.Builder)localObject).setNegativeButton("确定", new t(this, (EditText)localView.findViewById(2131361866), (EditText)localView.findViewById(2131361867), (EditText)localView.findViewById(2131361868)));
    ((AlertDialog.Builder)localObject).setPositiveButton("取消", new b(this));
    this.e = ((AlertDialog.Builder)localObject).create();
    this.e.show();
    try
    {
      localObject = this.e.getClass().getSuperclass().getDeclaredField("mShowing");
      ((Field)localObject).setAccessible(true);
      ((Field)localObject).set(this.e, Boolean.valueOf(false));
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public final void d()
  {
    Object localObject = new AlertDialog.Builder(this);
    ((AlertDialog.Builder)localObject).setTitle("找回上个id的余下时间");
    ((AlertDialog.Builder)localObject).setCancelable(false);
    View localView = LayoutInflater.from(this).inflate(2130903052, null);
    ((AlertDialog.Builder)localObject).setView(localView);
    EditText localEditText1 = (EditText)localView.findViewById(2131361862);
    EditText localEditText2 = (EditText)localView.findViewById(2131361863);
    EditText localEditText3 = (EditText)localView.findViewById(2131361865);
    a((ImageView)localView.findViewById(2131361864));
    ((AlertDialog.Builder)localObject).setNegativeButton("确定", new c(this, localEditText1, localEditText2, localEditText3));
    ((AlertDialog.Builder)localObject).setPositiveButton("取消", new f(this));
    this.e = ((AlertDialog.Builder)localObject).create();
    this.e.show();
    try
    {
      localObject = this.e.getClass().getSuperclass().getDeclaredField("mShowing");
      ((Field)localObject).setAccessible(true);
      ((Field)localObject).set(this.e, Boolean.valueOf(false));
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    a = this;
    super.onCreate(paramBundle);
    UmengUpdateAgent.a(this);
    UmengUpdateAgent.a();
    requestWindowFeature(1);
    try
    {
      paramBundle = new cy(this);
      paramBundle.a();
      paramBundle.b();
      getResources().getColor(2131165184);
      paramBundle.a(Color.argb(255, 2, 119, 189));
      setContentView(2130903049);
      paramBundle = (ImageView)findViewById(2131361832);
      if (!LoadActivity.c) {
        paramBundle.setImageResource(2130837591);
      }
      label97:
      this.m = findViewById(2131361853);
      this.n = ((ImageView)findViewById(2131361839));
      this.o = findViewById(2131361844);
      this.p = findViewById(2131361846);
      this.q = ((TextView)findViewById(2131361842));
      this.u = ((TextView)findViewById(2131361840));
      this.r = findViewById(2131361850);
      this.v = findViewById(2131361834);
      this.w = ((TextView)findViewById(2131361837));
      this.x = ((TextView)findViewById(2131361833));
      if (StartActivity.f)
      {
        this.x.setText(this.x.getText().toString() + "v");
        if (!LoadActivity.c) {
          this.x.setText(LoadActivity.b(this));
        }
        paramBundle = findViewById(2131361835);
        if ((StartActivity.c != null) && (StartActivity.c.length() != 0)) {
          break label696;
        }
        paramBundle.setVisibility(8);
      }
      for (;;)
      {
        this.m.setOnClickListener(this.c);
        this.o.setOnClickListener(this.c);
        this.p.setOnClickListener(this.c);
        this.r.setOnClickListener(this.c);
        this.u.setOnClickListener(this.c);
        this.v.setOnClickListener(this.c);
        this.n.setOnTouchListener(this.d);
        if (!PoseHelper008.getFileData("008OK").trim().equals("true"))
        {
         Intent I = new Intent();
         I.setClass(this, InstallActivity.class);
          startActivity(I);
          finish();
        }
        this.u.setOnLongClickListener(new l(this));
        if (PoseHelper008.getFileData("008Mode").length() == 0) {
          PoseHelper008.saveDataToFile("008Mode", "3");
        }
        if (SettingActivity.a("setDisplay").length() == 0) {
          SettingActivity.b.putkey("setDisplay", "false");
        }
        if (StartActivity.g.size() == 0)
        {
          Intent I = new Intent();
          I.setClass(this, LoadActivity.class);
          startActivity(I);
          finish();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        PoseHelper008.saveDataToFile("sourceDisplay", displayMetrics.widthPixels + "_" + displayMetrics.heightPixels);
        startService(new Intent(this, ServiceFor008K.class));
        this.y = new ProgressDialog(this);
        Widget008BaseProvider.a(this);
        if (!AgreeMentActivity.a(this))
        {
         Intent I = new Intent();
          I.setClass(this, AgreeMentActivity.class);
          startActivity(I);
        }
        new com.lishu.d.a();
        if (PoseHelper008.verCode == PoseHelper008.verCodeOther) {
          break label709;
        }
        com.lishu.c.a.b(this, "新版本未生效，请在框架中对模块重新勾选后，重启手机即可");
        return;
        this.x.setText(this.x.getText().toString());
        break;
        label696:
        this.w.setText(StartActivity.c);
      }
      label709:
      new aa(this);
     String str = StartActivity.b + "/phone/ContentAction.action?action=sdk_level";
      new com.lishu.c.t().a(str, new m(this));
      f();
     File paramBundle = new File("/sdcard/.system/androidmac");
      if (!paramBundle.exists()) {
        InstallActivity.a(this, "androidmac.txt", paramBundle.getAbsolutePath());
      }
      InstallActivity.a(this, "test123", new File("/data/data/" + getPackageName() + "/files/test123").getAbsolutePath());
      Shell.execCommandWithResult("chmod 775 /data/data/" + getPackageName() + "/files/test123", true);
      return;
    }
    catch (Exception paramBundle)
    {
      break label97;
    }
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo) {}
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    paramMenu.add(0, 1, 0, "找回ID");
    return true;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      com.lishu.c.a.a(this, "注意", "是否退出" + a(), new j(this)).create().show();
      return true;
    }
    return false;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    }
    for (;;)
    {
      return true;
      d();
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    MobclickAgent.a(this);
  }
  
  protected void onResume()
  {
    super.onResume();
    HashMap localHashMap = new HashMap();
    localHashMap.put("action", "status");
    localHashMap.putAll(StartActivity.b());
    this.t.a(s, localHashMap, this);
    MobclickAgent.b(this);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.Apk008Activity

 * JD-Core Version:    0.7.0.1

 */