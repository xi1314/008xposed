package com.soft.apk008;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.View.OnClickListener;
import android.widget.TextView;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InstallActivity
  extends Activity
{
  public static String a = "de.robv.android.xposed.installer";
  public static String b = "pro.burgerz.wsm.manager";
  public static String e = "";
  public static boolean f = false;
  private static Pattern k = Pattern.compile(".*with Xposed support \\(version (.+)\\).*");
  View.OnClickListener c = new au(this);
  public int d = 0;
  private TextView g;
  private TextView h;
  private TextView i;
  private TextView j;
  
  public static int a(Activity paramActivity)
  {
    int n = 0;
    if (d()) {
      n = 1;
    }
    int m = n;
    if (b(paramActivity) == 2) {
      m = n + 1;
    }
    n = m;
    if (c()) {
      n = m + 1;
    }
    return n;
  }
  
  private static int a(InputStream paramInputStream)
    throws IOException
  {
    Object localObject = new BufferedReader(new InputStreamReader(paramInputStream));
    String str;
    do
    {
      str = ((BufferedReader)localObject).readLine();
      if (str == null)
      {
        paramInputStream.close();
        return 0;
      }
    } while (!str.contains("Xposed"));
    localObject = k.matcher(str);
    if (((Matcher)localObject).find())
    {
      paramInputStream.close();
      return a(((Matcher)localObject).group(1));
    }
    paramInputStream.close();
    return 1;
  }
  
  private static int a(String paramString)
  {
    int m = 0;
    int i1 = paramString.length();
    int n = 0;
    for (;;)
    {
      if (m >= i1) {}
      int i2;
      do
      {
        return n;
        i2 = paramString.charAt(m);
      } while ((48 > i2) || (i2 > 57));
      n = n * 10 + (i2 - 48);
      m += 1;
    }
  }
  
  public static void a(Activity paramActivity, String paramString)
  {
    String str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/XposedInstaller.apk";
    if (a(paramActivity, paramString, str)) {
      paramActivity.runOnUiThread(new av(str, paramActivity));
    }
  }
  
  public static boolean a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      paramContext = paramContext.getAssets().open(paramString1);
      paramString1 = new File(paramString2);
      if (!paramString1.exists()) {
        paramString1.createNewFile();
      }
      paramString1 = new FileOutputStream(paramString1);
      paramString2 = new byte[1024];
      for (;;)
      {
        int m = paramContext.read(paramString2);
        if (m <= 0)
        {
          paramString1.close();
          paramContext.close();
          return true;
        }
        paramString1.write(paramString2, 0, m);
      }
      return false;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  private static int b(Activity paramActivity)
  {
    try
    {
      PackageInfo localPackageInfo1 = paramActivity.getPackageManager().getPackageInfo(a, 0);
      localPackageInfo2 = localPackageInfo1;
      if (localPackageInfo1 != null) {}
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      try
      {
        localPackageInfo2 = paramActivity.getPackageManager().getPackageInfo(b, 0);
        if (localPackageInfo2 == null)
        {
          return 0;
          localNameNotFoundException = localNameNotFoundException;
          localNameNotFoundException.printStackTrace();
          Object localObject = null;
        }
      }
      catch (PackageManager.NameNotFoundException paramActivity)
      {
        for (;;)
        {
          paramActivity.printStackTrace();
          PackageInfo localPackageInfo2 = null;
        }
        if (e() > 0) {
          return 2;
        }
      }
    }
    return 1;
  }
  
  private static boolean c()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (PoseHelper008.getFileData("install").trim().equals("true"))
    {
      bool1 = bool2;
      if (PoseHelper008.effect) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  /* Error */
  private static boolean d()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: iconst_0
    //   6: istore_1
    //   7: ldc 2
    //   9: monitorenter
    //   10: invokestatic 253	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   13: ldc 255
    //   15: invokevirtual 259	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   18: astore_2
    //   19: new 261	java/io/DataOutputStream
    //   22: dup
    //   23: aload_2
    //   24: invokevirtual 267	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
    //   27: invokespecial 270	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   30: astore_3
    //   31: aload_3
    //   32: ldc_w 272
    //   35: invokevirtual 275	java/io/DataOutputStream:writeBytes	(Ljava/lang/String;)V
    //   38: aload_3
    //   39: invokevirtual 278	java/io/DataOutputStream:flush	()V
    //   42: aload_2
    //   43: invokevirtual 281	java/lang/Process:waitFor	()I
    //   46: istore_0
    //   47: iload_0
    //   48: ifne +32 -> 80
    //   51: aload_3
    //   52: invokevirtual 282	java/io/DataOutputStream:close	()V
    //   55: aload_2
    //   56: invokevirtual 285	java/lang/Process:destroy	()V
    //   59: iconst_1
    //   60: istore_1
    //   61: ldc 2
    //   63: monitorexit
    //   64: iload_1
    //   65: ireturn
    //   66: astore_2
    //   67: aload_2
    //   68: invokevirtual 286	java/lang/Exception:printStackTrace	()V
    //   71: goto -12 -> 59
    //   74: astore_2
    //   75: ldc 2
    //   77: monitorexit
    //   78: aload_2
    //   79: athrow
    //   80: aload_3
    //   81: invokevirtual 282	java/io/DataOutputStream:close	()V
    //   84: aload_2
    //   85: invokevirtual 285	java/lang/Process:destroy	()V
    //   88: goto -27 -> 61
    //   91: astore_2
    //   92: aload_2
    //   93: invokevirtual 286	java/lang/Exception:printStackTrace	()V
    //   96: goto -35 -> 61
    //   99: astore_2
    //   100: aconst_null
    //   101: astore_3
    //   102: ldc_w 288
    //   105: new 129	java/lang/StringBuilder
    //   108: dup
    //   109: ldc_w 290
    //   112: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   115: aload_2
    //   116: invokevirtual 293	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   119: invokevirtual 153	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   125: invokestatic 298	android/util/Log:getMap	(Ljava/lang/String;Ljava/lang/String;)I
    //   128: pop
    //   129: aload_3
    //   130: ifnull +7 -> 137
    //   133: aload_3
    //   134: invokevirtual 282	java/io/DataOutputStream:close	()V
    //   137: aload 4
    //   139: invokevirtual 285	java/lang/Process:destroy	()V
    //   142: goto -81 -> 61
    //   145: astore_2
    //   146: aload_2
    //   147: invokevirtual 286	java/lang/Exception:printStackTrace	()V
    //   150: goto -89 -> 61
    //   153: astore_2
    //   154: aconst_null
    //   155: astore 5
    //   157: aload_3
    //   158: astore 4
    //   160: aload 5
    //   162: astore_3
    //   163: aload_3
    //   164: ifnull +7 -> 171
    //   167: aload_3
    //   168: invokevirtual 282	java/io/DataOutputStream:close	()V
    //   171: aload 4
    //   173: invokevirtual 285	java/lang/Process:destroy	()V
    //   176: aload_2
    //   177: athrow
    //   178: astore_3
    //   179: aload_3
    //   180: invokevirtual 286	java/lang/Exception:printStackTrace	()V
    //   183: goto -7 -> 176
    //   186: astore 5
    //   188: aconst_null
    //   189: astore_3
    //   190: aload_2
    //   191: astore 4
    //   193: aload 5
    //   195: astore_2
    //   196: goto -33 -> 163
    //   199: astore 5
    //   201: aload_2
    //   202: astore 4
    //   204: aload 5
    //   206: astore_2
    //   207: goto -44 -> 163
    //   210: astore_2
    //   211: goto -48 -> 163
    //   214: astore 5
    //   216: aconst_null
    //   217: astore_3
    //   218: aload_2
    //   219: astore 4
    //   221: aload 5
    //   223: astore_2
    //   224: goto -122 -> 102
    //   227: astore 5
    //   229: aload_2
    //   230: astore 4
    //   232: aload 5
    //   234: astore_2
    //   235: goto -133 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   46	2	0	m	int
    //   6	59	1	bool	boolean
    //   18	38	2	localProcess	java.lang.Process
    //   66	2	2	localException1	java.lang.Exception
    //   74	11	2	localObject1	Object
    //   91	2	2	localException2	java.lang.Exception
    //   99	17	2	localException3	java.lang.Exception
    //   145	2	2	localException4	java.lang.Exception
    //   153	38	2	localObject2	Object
    //   195	12	2	localObject3	Object
    //   210	9	2	localObject4	Object
    //   223	12	2	localObject5	Object
    //   1	167	3	localObject6	Object
    //   178	2	3	localException5	java.lang.Exception
    //   189	29	3	localObject7	Object
    //   3	228	4	localObject8	Object
    //   155	6	5	localObject9	Object
    //   186	8	5	localObject10	Object
    //   199	6	5	localObject11	Object
    //   214	8	5	localException6	java.lang.Exception
    //   227	6	5	localException7	java.lang.Exception
    // Exception table:
    //   from	to	target	type
    //   51	59	66	java/lang/Exception
    //   51	59	74	finally
    //   67	71	74	finally
    //   80	88	74	finally
    //   92	96	74	finally
    //   133	137	74	finally
    //   137	142	74	finally
    //   146	150	74	finally
    //   167	171	74	finally
    //   171	176	74	finally
    //   176	178	74	finally
    //   179	183	74	finally
    //   80	88	91	java/lang/Exception
    //   10	19	99	java/lang/Exception
    //   133	137	145	java/lang/Exception
    //   137	142	145	java/lang/Exception
    //   10	19	153	finally
    //   167	171	178	java/lang/Exception
    //   171	176	178	java/lang/Exception
    //   19	31	186	finally
    //   31	47	199	finally
    //   102	129	210	finally
    //   19	31	214	java/lang/Exception
    //   31	47	227	java/lang/Exception
  }
  
  private static int e()
  {
    try
    {
      int m = a(new FileInputStream("/system/bin/app_process"));
      return m;
    }
    catch (IOException localIOException) {}
    return 0;
  }
  
  public final int a()
  {
    if (d())
    {
      this.g.setEnabled(false);
      this.g.setText("已完成");
    }
    for (int n = 1;; n = 0)
    {
      this.d = b(this);
      int m;
      if (this.d == 2)
      {
        this.h.setEnabled(false);
        this.h.setText("已完成");
        m = n + 1;
      }
      for (;;)
      {
        n = m;
        if (c())
        {
          this.i.setEnabled(false);
          this.i.setText("已完成");
          if (this.g.isEnabled()) {
            break;
          }
          n = 3;
        }
        return n;
        m = n;
        if (this.d == 1)
        {
          this.h.setText("未安装成功");
          m = n;
        }
      }
      return m + 1;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 1)
    {
      localIntent = new Intent();
      localIntent.putExtra("url", StartActivity.b + "/phone/ContentAction.action?action=install_root");
      localIntent.setClass(this, WebMessageActivity.class);
      startActivity(localIntent);
    }
    do
    {
      do
      {
        return;
        if (paramInt1 != 2) {
          break;
        }
        if (paramInt2 == 0)
        {
          a(this, "wsm.apk");
          return;
        }
      } while (paramInt2 != 1);
      localIntent = new Intent();
      localIntent.putExtra("url", StartActivity.b + "/phone/ContentAction.action?action=install_xposed");
      localIntent.setClass(this, WebMessageActivity.class);
      startActivity(localIntent);
      return;
    } while (paramInt1 != 3);
    Intent localIntent = new Intent();
    localIntent.putExtra("url", StartActivity.b + "/phone/ContentAction.action?action=install_moudles");
    localIntent.setClass(this, WebMessageActivity.class);
    startActivity(localIntent);
  }
  
  public final void b()
  {
    Intent localIntent = new Intent();
    localIntent.setClass(this, Apk008Activity.class);
    startActivity(localIntent);
    PoseHelper008.saveDataToFile("008OK", "true");
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903045);
    this.g = ((TextView)findViewById(2131361808));
    this.h = ((TextView)findViewById(2131361811));
    this.i = ((TextView)findViewById(2131361814));
    this.j = ((TextView)findViewById(2131361816));
    this.g.setOnClickListener(this.c);
    this.h.setOnClickListener(this.c);
    this.i.setOnClickListener(this.c);
    this.j.setOnClickListener(this.c);
    if (a() == 3) {
      b();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      finish();
    }
    return true;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.InstallActivity

 * JD-Core Version:    0.7.0.1

 */