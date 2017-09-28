package com.imengququ.myxposed.soft.apk008;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.View;
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
  private static Pattern PATTERN_APP_PROCESS_VERSION = Pattern.compile(".*with Xposed support \\(version (.+)\\).*");
  public static boolean exit;
  public static String frameWorkPackAgeName = "de.robv.android.xposed.installer";
  public static String frameWorkPackAgeName1 = "pro.burgerz.wsm.manager";
  public static String str = "";
  public int MoudleStatus = 0;
  OnClickListener listener = new OnClickListener()
  {
    public void onClick(View View)
    {
      if (View.equals(InstallActivity.this.text1)) {
        InstallActivity.this.onClick(1, 0);
      }else

        if (View.equals(InstallActivity.this.text2))
        {
          InstallActivity.this.onClick(2, InstallActivity.this.MoudleStatus);

        }else
        if (View.equals(InstallActivity.this.text3))
        {
          InstallActivity.this.onClick(3, 0);

        }
      }else
        if((View.equals(InstallActivity.this.text_fresh))&&(InstallActivity.this.reFresh() = 3)){
      InstallActivity.this.enter();}

  };
  private TextView text1;
  private TextView text2;
  private TextView text3;
  private TextView text_fresh;
  
  static
  {
    exit = false;
  }
  
  public static int checkFrameWork(Activity paramActivity)
  {
    try
    {
      localPackageInfo1 = paramActivity.getPackageManager().getPackageInfo(frameWorkPackAgeName, 0);
      localPackageInfo2 = localPackageInfo1;
      if (localPackageInfo1 != null) {}
    }
    catch (NameNotFoundException localNameNotFoundException)
    {
      try
      {
        PackageInfo localPackageInfo1;
        PackageInfo localPackageInfo2 = paramActivity.getPackageManager().getPackageInfo(frameWorkPackAgeName1, 0);
        if (localPackageInfo2 == null)
        {
          return 0;
          localNameNotFoundException = localNameNotFoundException;
          localPackageInfo1 = null;
          localNameNotFoundException.printStackTrace();
        }
      }
      catch (NameNotFoundException paramActivity)
      {
        for (;;)
        {
          Object localObject = null;
          paramActivity.printStackTrace();
        }
        if (getInstalledAppProcessVersion() > 0) {
          return 2;
        }
      }
    }
    return 1;
  }
  
  public static boolean checkModule(Activity paramActivity)
  {
    return PoseHelper008.getFileData("install").trim().equals("true");
  }
  
  public static boolean checkRoot()
  {
    return getRootAhth();
  }
  
  public static boolean copyApkFromAssets(Context Context, String filename, String paramString2)
  {
    try
    {
      InputStream IS = Context.getAssets().open(filename);
      File file  = new File(paramString2);
      if (!file.exists()) {
        file.createNewFile();
      }
     FileOutputStream  fileOutputStream = new FileOutputStream(file);
    byte[]  bytes = new byte[1024];
      for (;;)
      {
        int i = paramContext.read(paramString2);
        if (i <= 0)
        {
          paramString1.close();
          paramContext.close();
          return true;
        }
        paramString1.write(paramString2, 0, i);
      }
      return false;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public static int extractIntPart(String paramString)
  {
    int j = 0;
    int k = paramString.length();
    int i = 0;
    for (;;)
    {
      if (i >= k) {}
      int m;
      do
      {
        return j;
        m = paramString.charAt(i);
      } while ((48 > m) || (m > 57));
      j = j * 10 + (m - 48);
      i += 1;
    }
  }
  
  private static int getAppProcessVersion(InputStream paramInputStream)
    throws IOException
  {
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream));
    Object localObject;
    do
    {
      do
      {
        localObject = localBufferedReader.readLine();
        if (localObject == null)
        {
          paramInputStream.close();
          return 0;
        }
      } while (!((String)localObject).contains("Xposed"));
      localObject = PATTERN_APP_PROCESS_VERSION.matcher((CharSequence)localObject);
    } while (!((Matcher)localObject).find());
    paramInputStream.close();
    return extractIntPart(((Matcher)localObject).group(1));
  }
  
  private static int getInstalledAppProcessVersion()
  {
    try
    {
      int i = getAppProcessVersion(new FileInputStream("/system/bin/app_process"));
      return i;
    }
    catch (IOException localIOException) {}
    return 0;
  }
  
  /* Error */
  public static boolean getRootAhth()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc 2
    //   4: monitorenter
    //   5: aconst_null
    //   6: astore_3
    //   7: aconst_null
    //   8: astore 5
    //   10: aconst_null
    //   11: astore 6
    //   13: aconst_null
    //   14: astore 7
    //   16: aload 6
    //   18: astore 4
    //   20: invokestatic 231	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   23: ldc 233
    //   25: invokevirtual 237	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   28: astore_2
    //   29: aload_2
    //   30: astore 5
    //   32: aload 6
    //   34: astore 4
    //   36: aload_2
    //   37: astore_3
    //   38: new 239	java/io/DataOutputStream
    //   41: dup
    //   42: aload_2
    //   43: invokevirtual 245	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
    //   46: invokespecial 248	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   49: astore 6
    //   51: aload 6
    //   53: ldc 250
    //   55: invokevirtual 253	java/io/DataOutputStream:writeBytes	(Ljava/lang/String;)V
    //   58: aload 6
    //   60: invokevirtual 256	java/io/DataOutputStream:flush	()V
    //   63: aload_2
    //   64: invokevirtual 259	java/lang/Process:waitFor	()I
    //   67: istore_0
    //   68: iload_0
    //   69: ifne +38 -> 107
    //   72: aload 6
    //   74: ifnull +8 -> 82
    //   77: aload 6
    //   79: invokevirtual 260	java/io/DataOutputStream:close	()V
    //   82: aload_2
    //   83: invokevirtual 263	java/lang/Process:destroy	()V
    //   86: iconst_1
    //   87: istore_1
    //   88: ldc 2
    //   90: monitorexit
    //   91: iload_1
    //   92: ireturn
    //   93: astore_2
    //   94: aload_2
    //   95: invokevirtual 264	java/lang/Exception:printStackTrace	()V
    //   98: goto -12 -> 86
    //   101: astore_2
    //   102: ldc 2
    //   104: monitorexit
    //   105: aload_2
    //   106: athrow
    //   107: aload 6
    //   109: ifnull +8 -> 117
    //   112: aload 6
    //   114: invokevirtual 260	java/io/DataOutputStream:close	()V
    //   117: aload_2
    //   118: invokevirtual 263	java/lang/Process:destroy	()V
    //   121: goto -33 -> 88
    //   124: astore_2
    //   125: aload_2
    //   126: invokevirtual 264	java/lang/Exception:printStackTrace	()V
    //   129: goto -8 -> 121
    //   132: astore 6
    //   134: aload 5
    //   136: astore_2
    //   137: aload 7
    //   139: astore 5
    //   141: aload 5
    //   143: astore 4
    //   145: aload_2
    //   146: astore_3
    //   147: ldc_w 266
    //   150: new 268	java/lang/StringBuilder
    //   153: dup
    //   154: ldc_w 270
    //   157: invokespecial 271	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   160: aload 6
    //   162: invokevirtual 274	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   165: invokevirtual 278	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: invokevirtual 281	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: invokestatic 287	android/util/Log:runtimeexception	(Ljava/lang/String;Ljava/lang/String;)I
    //   174: pop
    //   175: aload 5
    //   177: ifnull +8 -> 185
    //   180: aload 5
    //   182: invokevirtual 260	java/io/DataOutputStream:close	()V
    //   185: aload_2
    //   186: invokevirtual 263	java/lang/Process:destroy	()V
    //   189: goto -101 -> 88
    //   192: astore_2
    //   193: aload_2
    //   194: invokevirtual 264	java/lang/Exception:printStackTrace	()V
    //   197: goto -109 -> 88
    //   200: astore_2
    //   201: goto -99 -> 102
    //   204: astore_2
    //   205: aload 4
    //   207: ifnull +8 -> 215
    //   210: aload 4
    //   212: invokevirtual 260	java/io/DataOutputStream:close	()V
    //   215: aload_3
    //   216: invokevirtual 263	java/lang/Process:destroy	()V
    //   219: aload_2
    //   220: athrow
    //   221: astore_3
    //   222: aload_3
    //   223: invokevirtual 264	java/lang/Exception:printStackTrace	()V
    //   226: goto -7 -> 219
    //   229: astore 5
    //   231: aload 6
    //   233: astore 4
    //   235: aload_2
    //   236: astore_3
    //   237: aload 5
    //   239: astore_2
    //   240: goto -35 -> 205
    //   243: astore_3
    //   244: aload 6
    //   246: astore 5
    //   248: aload_3
    //   249: astore 6
    //   251: goto -110 -> 141
    // Local variable table:
    //   start	length	slot	name	signature
    //   67	2	0	i	int
    //   1	91	1	bool	boolean
    //   28	55	2	localProcess	java.lang.Process
    //   93	2	2	localException1	java.lang.Exception
    //   101	17	2	localObject1	Object
    //   124	2	2	localException2	java.lang.Exception
    //   136	50	2	localObject2	Object
    //   192	2	2	localException3	java.lang.Exception
    //   200	1	2	localObject3	Object
    //   204	32	2	localObject4	Object
    //   239	1	2	localObject5	Object
    //   6	210	3	localObject6	Object
    //   221	2	3	localException4	java.lang.Exception
    //   236	1	3	localObject7	Object
    //   243	6	3	localException5	java.lang.Exception
    //   18	216	4	localObject8	Object
    //   8	173	5	localObject9	Object
    //   229	9	5	localObject10	Object
    //   246	1	5	localObject11	Object
    //   11	102	6	localDataOutputStream	java.io.DataOutputStream
    //   132	113	6	localException6	java.lang.Exception
    //   249	1	6	localException7	java.lang.Exception
    //   14	124	7	localObject12	Object
    // Exception table:
    //   from	to	target	type
    //   77	82	93	java/lang/Exception
    //   82	86	93	java/lang/Exception
    //   77	82	101	finally
    //   82	86	101	finally
    //   94	98	101	finally
    //   112	117	101	finally
    //   117	121	101	finally
    //   125	129	101	finally
    //   112	117	124	java/lang/Exception
    //   117	121	124	java/lang/Exception
    //   20	29	132	java/lang/Exception
    //   38	51	132	java/lang/Exception
    //   180	185	192	java/lang/Exception
    //   185	189	192	java/lang/Exception
    //   180	185	200	finally
    //   185	189	200	finally
    //   193	197	200	finally
    //   210	215	200	finally
    //   215	219	200	finally
    //   219	221	200	finally
    //   222	226	200	finally
    //   20	29	204	finally
    //   38	51	204	finally
    //   147	175	204	finally
    //   210	215	221	java/lang/Exception
    //   215	219	221	java/lang/Exception
    //   51	68	229	finally
    //   51	68	243	java/lang/Exception
  }
  
  public static void installAssets(final Activity paramActivity, String paramString)
  {
    String str1 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/XposedInstaller.apk";
    if (copyApkFromAssets(paramActivity, paramString, str1)) {
      paramActivity.runOnUiThread(new Runnable()
      {
        public void run()
        {
          Intent localIntent = new Intent("android.intent.action.VIEW");
          localIntent.setDataAndType(Uri.parse("file://" + InstallActivity.this), "application/vnd.android.package-archive");
          paramActivity.startActivity(localIntent);
        }
      });
    }
  }
  
  public static int reFreshStatic(Activity paramActivity)
  {
    int j = 0;
    if (checkRoot()) {
      j = 0 + 1;
    }
    int i = j;
    if (checkFrameWork(paramActivity) == 2) {
      i = j + 1;
    }
    j = i;
    if (checkModule(paramActivity)) {
      j = i + 1;
    }
    return j;
  }
  
  public void enter()
  {
    Intent localIntent = new Intent();
    localIntent.setClass(this, Apk008Activity.class);
    startActivity(localIntent);
    PoseHelper008.saveDataToFile("008OK", "true");
    finish();
  }
  
  public void onClick(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 1)
    {
     Intent localIntent = new Intent();
      localIntent.putExtra("url", StartActivity.baseUrl + "/phone/ContentAction.action?action=install_root");
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
          installAssets(this, "wsm.apk");
          return;
        }
      } while (paramInt2 != 1);
     Intent localIntent = new Intent();
      localIntent.putExtra("url", StartActivity.baseUrl + "/phone/ContentAction.action?action=install_xposed");
      localIntent.setClass(this, WebMessageActivity.class);
      startActivity(localIntent);
      return;
    } while (paramInt1 != 3);
    Intent localIntent = new Intent();
    localIntent.putExtra("url", StartActivity.baseUrl + "/phone/ContentAction.action?action=install_moudles");
    localIntent.setClass(this, WebMessageActivity.class);
    startActivity(localIntent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903042);
    this.text1 = ((TextView)findViewById(2131230728));
    this.text2 = ((TextView)findViewById(2131230731));
    this.text3 = ((TextView)findViewById(2131230734));
    this.text_fresh = ((TextView)findViewById(2131230736));
    this.text1.setOnClickListener(this.listener);
    this.text2.setOnClickListener(this.listener);
    this.text3.setOnClickListener(this.listener);
    this.text_fresh.setOnClickListener(this.listener);
    if (reFresh() == 3) {
      enter();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      finish();
    }
    return true;
  }
  
  public int reFresh()
  {
    int j = 0;
    if (checkRoot())
    {
      this.text1.setEnabled(false);
      this.text1.setText("已完成");
      j = 0 + 1;
    }
    this.MoudleStatus = checkFrameWork(this);
    int i;
    if (this.MoudleStatus == 2)
    {
      this.text2.setEnabled(false);
      this.text2.setText("已完成");
      i = j + 1;
    }
    for (;;)
    {
      j = i;
      if (checkModule(this))
      {
        this.text3.setEnabled(false);
        this.text3.setText("已完成");
        j = i + 1;
      }
      return j;
      i = j;
      if (this.MoudleStatus == 1)
      {
        this.text2.setText("未安装成功");
        i = j;
      }
    }
  }
}


