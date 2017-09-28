package com.soft.apk008.remainNew;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.a.a.Map;
import com.a.a.maputils;
import com.lishu.c.p;
import com.lishu.c.r;
import com.lishu.c.w;
import com.soft.apk008.LoadActivity;
import com.soft.apk008.SetMessageActivity;
import com.soft.apk008.SettingActivity;
import com.soft.apk008.StartActivity;
import com.soft.apk008.WebMessageActivity;
import com.soft.tools.ClearApplicationDataActivity;
import com.soft.tools.RecordAppFileHandler;
import com.soft.tools.SelectManuActivity;
import com.soft.tools.SetNetAddressActivity;
import com.soft.tools.SetSystemValueActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class NewReMainActivity
  extends Activity
  implements w
{
  public static Context a;
  public static Handler b = new a();
  public static boolean c = false;
  private static Map d;
  private static ArrayList e;
  private static Activity h;
  private static p i = new p();
  private static int j;
  private static int k;
  private static Map l;
  private static String m = "newReMainActivity_progressFile";
  private static r n = new r();
  private a f;
  private ListView g;
  
  /* Error */
  public static void a(Context paramContext)
  {
    // Byte code:
    //   0: invokestatic 74	com/soft/apk008/remainNew/NewReMainActivity:runningappprocessinfolist	()V
    //   3: aconst_null
    //   4: astore 4
    //   6: ldc 76
    //   8: invokestatic 82	de/robv/android/xposed/mods/tutorial/PoseHelper008:getFileData	(Ljava/lang/String;)Ljava/lang/String;
    //   11: invokestatic 87	com/XhookMethod/XhookMethod/packageinfolist:Inttolong	(Ljava/lang/String;)Lcom/XhookMethod/XhookMethod/packageinfolist;
    //   14: astore 5
    //   16: aload 5
    //   18: astore 4
    //   20: aload 4
    //   22: astore 5
    //   24: aload 4
    //   26: ifnonnull +12 -> 38
    //   29: new 84	com/XhookMethod/XhookMethod/packageinfolist
    //   32: dup
    //   33: invokespecial 88	com/XhookMethod/XhookMethod/packageinfolist:<init>	()V
    //   36: astore 5
    //   38: new 90	java/text/SimpleDateFormat
    //   41: dup
    //   42: ldc 92
    //   44: invokespecial 95	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   47: new 97	java/util/Date
    //   50: dup
    //   51: invokespecial 98	java/util/Date:<init>	()V
    //   54: invokevirtual 102	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   57: astore 4
    //   59: aload 4
    //   61: aload 5
    //   63: ldc 104
    //   65: invokevirtual 106	com/XhookMethod/XhookMethod/packageinfolist:recenttaskinfolist	(Ljava/lang/String;)Ljava/lang/String;
    //   68: invokevirtual 112	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   71: ifne +30 -> 101
    //   74: aload 5
    //   76: ldc 104
    //   78: aload 4
    //   80: invokevirtual 115	com/XhookMethod/XhookMethod/packageinfolist:XhookMethod	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   83: pop
    //   84: aload_0
    //   85: invokestatic 117	com/soft/apk008/remainNew/NewReMainActivity:applicationInfolist	(Landroid/content/Context;)V
    //   88: aload_0
    //   89: ldc 119
    //   91: iconst_0
    //   92: invokestatic 125	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   95: invokevirtual 128	android/widget/Toast:show	()V
    //   98: goto -98 -> 0
    //   101: aload 5
    //   103: ldc 104
    //   105: new 90	java/text/SimpleDateFormat
    //   108: dup
    //   109: ldc 92
    //   111: invokespecial 95	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   114: new 97	java/util/Date
    //   117: dup
    //   118: invokespecial 98	java/util/Date:<init>	()V
    //   121: invokevirtual 102	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   124: invokevirtual 115	com/XhookMethod/XhookMethod/packageinfolist:XhookMethod	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   127: pop
    //   128: aload 5
    //   130: ldc 130
    //   132: invokevirtual 106	com/XhookMethod/XhookMethod/packageinfolist:recenttaskinfolist	(Ljava/lang/String;)Ljava/lang/String;
    //   135: astore 8
    //   137: aload 5
    //   139: ldc 132
    //   141: invokevirtual 106	com/XhookMethod/XhookMethod/packageinfolist:recenttaskinfolist	(Ljava/lang/String;)Ljava/lang/String;
    //   144: astore 7
    //   146: aload 5
    //   148: ldc 134
    //   150: invokevirtual 106	com/XhookMethod/XhookMethod/packageinfolist:recenttaskinfolist	(Ljava/lang/String;)Ljava/lang/String;
    //   153: astore 6
    //   155: aload 6
    //   157: astore 4
    //   159: aload 6
    //   161: ifnonnull +17 -> 178
    //   164: ldc 136
    //   166: astore 4
    //   168: aload 5
    //   170: ldc 134
    //   172: ldc 136
    //   174: invokevirtual 115	com/XhookMethod/XhookMethod/packageinfolist:XhookMethod	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   177: pop
    //   178: aload 8
    //   180: ifnonnull +13 -> 193
    //   183: aload 5
    //   185: ldc 130
    //   187: ldc 138
    //   189: invokevirtual 115	com/XhookMethod/XhookMethod/packageinfolist:XhookMethod	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   192: pop
    //   193: aload 7
    //   195: astore 6
    //   197: aload 7
    //   199: ifnonnull +17 -> 216
    //   202: ldc 136
    //   204: astore 6
    //   206: aload 5
    //   208: ldc 132
    //   210: ldc 136
    //   212: invokevirtual 115	com/XhookMethod/XhookMethod/packageinfolist:XhookMethod	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   215: pop
    //   216: aload 6
    //   218: invokestatic 144	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   221: istore_3
    //   222: aload 4
    //   224: ldc 136
    //   226: invokevirtual 112	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   229: ifeq +456 -> 685
    //   232: ldc 146
    //   234: invokestatic 150	com/soft/apk008/remainNew/NewReMainSetActivity:XhookMethod	(Ljava/lang/String;)Ljava/lang/String;
    //   237: astore 4
    //   239: ldc 152
    //   241: invokestatic 150	com/soft/apk008/remainNew/NewReMainSetActivity:XhookMethod	(Ljava/lang/String;)Ljava/lang/String;
    //   244: astore 6
    //   246: aload 4
    //   248: invokestatic 144	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   251: istore_1
    //   252: aload 6
    //   254: invokestatic 144	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   257: istore_2
    //   258: iload_1
    //   259: iconst_m1
    //   260: if_icmpeq +8 -> 268
    //   263: iload_2
    //   264: iconst_m1
    //   265: if_icmpne +23 -> 288
    //   268: aload_0
    //   269: ldc 154
    //   271: iconst_0
    //   272: invokestatic 125	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   275: invokevirtual 128	android/widget/Toast:show	()V
    //   278: return
    //   279: astore 4
    //   281: iconst_m1
    //   282: istore_1
    //   283: iconst_m1
    //   284: istore_2
    //   285: goto -27 -> 258
    //   288: getstatic 160	com/data/simulate/SimulateDataTest:random	Ljava/util/Random;
    //   291: iload_2
    //   292: iload_1
    //   293: isub
    //   294: invokevirtual 166	java/util/Random:nextInt	(I)I
    //   297: iload_1
    //   298: iadd
    //   299: istore_1
    //   300: aload 5
    //   302: ldc 134
    //   304: new 168	java/lang/StringBuilder
    //   307: dup
    //   308: iload_1
    //   309: invokestatic 172	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   312: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   315: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   318: invokevirtual 115	com/XhookMethod/XhookMethod/packageinfolist:XhookMethod	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   321: pop
    //   322: new 168	java/lang/StringBuilder
    //   325: dup
    //   326: iload_1
    //   327: invokestatic 172	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   330: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   333: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   336: astore 6
    //   338: iload_3
    //   339: aload 5
    //   341: ldc 134
    //   343: invokevirtual 106	com/XhookMethod/XhookMethod/packageinfolist:recenttaskinfolist	(Ljava/lang/String;)Ljava/lang/String;
    //   346: invokestatic 144	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   349: if_icmplt +118 -> 467
    //   352: ldc 179
    //   354: astore 4
    //   356: invokestatic 181	com/soft/apk008/remainNew/NewReMainActivity:Inttolong	()V
    //   359: getstatic 183	com/soft/apk008/remainNew/NewReMainActivity:k	I
    //   362: getstatic 185	com/soft/apk008/remainNew/NewReMainActivity:recenttaskinfolist	I
    //   365: if_icmpne +115 -> 480
    //   368: aload_0
    //   369: ldc 187
    //   371: iconst_0
    //   372: invokestatic 125	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   375: invokevirtual 128	android/widget/Toast:show	()V
    //   378: aload_0
    //   379: ldc 189
    //   381: iconst_0
    //   382: invokestatic 125	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   385: invokevirtual 128	android/widget/Toast:show	()V
    //   388: new 84	com/XhookMethod/XhookMethod/packageinfolist
    //   391: dup
    //   392: invokespecial 88	com/XhookMethod/XhookMethod/packageinfolist:<init>	()V
    //   395: putstatic 191	com/soft/apk008/remainNew/NewReMainActivity:l	Lcom/XhookMethod/XhookMethod/packageinfolist;
    //   398: getstatic 56	com/soft/apk008/remainNew/NewReMainActivity:m	Ljava/lang/String;
    //   401: getstatic 191	com/soft/apk008/remainNew/NewReMainActivity:l	Lcom/XhookMethod/XhookMethod/packageinfolist;
    //   404: invokevirtual 193	com/XhookMethod/XhookMethod/packageinfolist:XhookMethod	()Ljava/lang/String;
    //   407: invokestatic 197	de/robv/android/xposed/mods/tutorial/PoseHelper008:saveDataToFile	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   410: pop
    //   411: getstatic 199	com/soft/apk008/remainNew/NewReMainActivity:packageinfolist	Ljava/util/ArrayList;
    //   414: invokevirtual 205	java/util/ArrayList:size	()I
    //   417: ifle +38 -> 455
    //   420: getstatic 207	com/soft/apk008/remainNew/NewReMainActivity:getMap	Lcom/XhookMethod/XhookMethod/packageinfolist;
    //   423: ldc 209
    //   425: getstatic 199	com/soft/apk008/remainNew/NewReMainActivity:packageinfolist	Ljava/util/ArrayList;
    //   428: iconst_0
    //   429: invokevirtual 213	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   432: invokevirtual 115	com/XhookMethod/XhookMethod/packageinfolist:XhookMethod	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   435: pop
    //   436: getstatic 207	com/soft/apk008/remainNew/NewReMainActivity:getMap	Lcom/XhookMethod/XhookMethod/packageinfolist;
    //   439: ldc 215
    //   441: iconst_0
    //   442: invokestatic 218	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   445: invokevirtual 115	com/XhookMethod/XhookMethod/packageinfolist:XhookMethod	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   448: pop
    //   449: invokestatic 220	com/soft/apk008/remainNew/NewReMainActivity:runningserviceinfolist	()V
    //   452: invokestatic 74	com/soft/apk008/remainNew/NewReMainActivity:runningappprocessinfolist	()V
    //   455: ldc 222
    //   457: invokestatic 226	com/soft/apk008/remainNew/NewReMainToolActivity:XhookMethod	(Ljava/lang/String;)V
    //   460: aload_0
    //   461: ldc 222
    //   463: invokestatic 231	com/soft/apk008/remainNew/Widget008BaseProvider:XhookMethod	(Landroid/content/Context;Ljava/lang/String;)V
    //   466: return
    //   467: getstatic 183	com/soft/apk008/remainNew/NewReMainActivity:k	I
    //   470: getstatic 185	com/soft/apk008/remainNew/NewReMainActivity:recenttaskinfolist	I
    //   473: if_icmpne +141 -> 614
    //   476: ldc 138
    //   478: astore 4
    //   480: aload 4
    //   482: ldc 138
    //   484: invokevirtual 112	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   487: ifeq +155 -> 642
    //   490: aload 5
    //   492: ldc 134
    //   494: invokevirtual 106	com/XhookMethod/XhookMethod/packageinfolist:recenttaskinfolist	(Ljava/lang/String;)Ljava/lang/String;
    //   497: invokestatic 144	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   500: istore_2
    //   501: iload_3
    //   502: iconst_1
    //   503: iadd
    //   504: istore_1
    //   505: iload_1
    //   506: iload_2
    //   507: if_icmplt +7 -> 514
    //   510: ldc 179
    //   512: astore 4
    //   514: aload_0
    //   515: invokestatic 233	com/soft/apk008/remainNew/NewReMainActivity:getMap	(Landroid/content/Context;)V
    //   518: new 168	java/lang/StringBuilder
    //   521: dup
    //   522: ldc 235
    //   524: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   527: iload_1
    //   528: invokevirtual 239	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   531: ldc 241
    //   533: invokevirtual 244	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   536: aload 6
    //   538: invokevirtual 244	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   541: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   544: astore 6
    //   546: aload 6
    //   548: invokestatic 226	com/soft/apk008/remainNew/NewReMainToolActivity:XhookMethod	(Ljava/lang/String;)V
    //   551: aload_0
    //   552: aload 6
    //   554: invokestatic 231	com/soft/apk008/remainNew/Widget008BaseProvider:XhookMethod	(Landroid/content/Context;Ljava/lang/String;)V
    //   557: aload 5
    //   559: ldc 132
    //   561: new 168	java/lang/StringBuilder
    //   564: dup
    //   565: iload_1
    //   566: invokestatic 172	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   569: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   572: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   575: invokevirtual 115	com/XhookMethod/XhookMethod/packageinfolist:XhookMethod	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   578: pop
    //   579: aload 5
    //   581: ldc 130
    //   583: new 168	java/lang/StringBuilder
    //   586: dup
    //   587: aload 4
    //   589: invokestatic 247	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   592: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   595: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   598: invokevirtual 115	com/XhookMethod/XhookMethod/packageinfolist:XhookMethod	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   601: pop
    //   602: ldc 76
    //   604: aload 5
    //   606: invokevirtual 193	com/XhookMethod/XhookMethod/packageinfolist:XhookMethod	()Ljava/lang/String;
    //   609: invokestatic 197	de/robv/android/xposed/mods/tutorial/PoseHelper008:saveDataToFile	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   612: pop
    //   613: return
    //   614: getstatic 52	com/soft/apk008/remainNew/NewReMainActivity:saveaccountdatatoFile	Z
    //   617: ifeq +14 -> 631
    //   620: ldc 179
    //   622: astore 4
    //   624: iconst_0
    //   625: putstatic 52	com/soft/apk008/remainNew/NewReMainActivity:saveaccountdatatoFile	Z
    //   628: goto -148 -> 480
    //   631: ldc 138
    //   633: astore 4
    //   635: iconst_1
    //   636: putstatic 52	com/soft/apk008/remainNew/NewReMainActivity:saveaccountdatatoFile	Z
    //   639: goto -159 -> 480
    //   642: aload 4
    //   644: ldc 179
    //   646: invokevirtual 112	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   649: ifeq +31 -> 680
    //   652: aload_0
    //   653: invokestatic 250	com/soft/apk008/remainNew/NewReMainActivity:runningserviceinfolist	(Landroid/content/Context;)Z
    //   656: ifne +24 -> 680
    //   659: aload_0
    //   660: ldc 252
    //   662: iconst_0
    //   663: invokestatic 125	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   666: invokevirtual 128	android/widget/Toast:show	()V
    //   669: return
    //   670: astore 4
    //   672: goto -389 -> 283
    //   675: astore 5
    //   677: goto -657 -> 20
    //   680: iload_3
    //   681: istore_1
    //   682: goto -125 -> 557
    //   685: aload 4
    //   687: astore 6
    //   689: goto -351 -> 338
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	692	0	paramContext	Context
    //   251	431	1	i1	int
    //   257	251	2	i2	int
    //   221	460	3	i3	int
    //   4	243	4	localObject1	Object
    //   279	1	4	localException1	Exception
    //   354	289	4	str1	String
    //   670	16	4	localException2	Exception
    //   14	591	5	localObject2	Object
    //   675	1	5	localException3	Exception
    //   153	535	6	localObject3	Object
    //   144	54	7	str2	String
    //   135	44	8	str3	String
    // Exception table:
    //   from	to	target	type
    //   246	252	279	java/lang/Exception
    //   252	258	670	java/lang/Exception
    //   6	16	675	java/lang/Exception
  }
  
  public static void a(Context paramContext, String paramString)
  {
    a = paramContext;
    paramContext = new Message();
    paramContext.what = 1;
    paramContext.obj = paramString;
    b.sendMessage(paramContext);
  }
  
  private static void a(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null) {}
    for (;;)
    {
      return;
      int i1 = 0;
      int i2 = paramArrayOfLong.length - 1;
      while (i2 > i1)
      {
        long l1 = paramArrayOfLong[i2];
        paramArrayOfLong[i2] = paramArrayOfLong[i1];
        paramArrayOfLong[i1] = l1;
        i2 -= 1;
        i1 += 1;
      }
    }
  }
  
  private static int b(String paramString)
  {
    int i2;
    if (paramString == null)
    {
      i2 = -1;
      return i2;
    }
    Iterator localIterator = e.iterator();
    int i1 = 0;
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return -1;
      }
      i2 = i1;
      if (paramString.equals((String)localIterator.next())) {
        break;
      }
      i1 += 1;
    }
  }
  
  private static int b(Calendar paramCalendar1, Calendar paramCalendar2)
  {
    int i3 = paramCalendar1.get(1);
    int i4 = paramCalendar2.get(1);
    int i2 = paramCalendar1.get(6) - paramCalendar2.get(6);
    int i1 = 0;
    for (;;)
    {
      if (i1 >= i3 - i4) {
        return i2;
      }
      paramCalendar2.set(1, paramCalendar2.get(1) + 1);
      i2 += paramCalendar2.getMaximum(6);
      i1 += 1;
    }
  }
  
  public static void b()
  {
    j = 0;
    k = 0;
    Calendar.getInstance().setTime(new Date());
    int i1 = 0;
    for (;;)
    {
      if (i1 >= e.size()) {
        return;
      }
      j = c((String)e.get(i1)) + j;
      try
      {
        i2 = Integer.parseInt(l.get(e.get(i1)));
        k = i2 + k;
        i1 += 1;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          int i2 = 0;
        }
      }
    }
  }
  
  public static void b(Context paramContext)
  {
    
    if (e.size() == 0)
    {
      Toast.makeText(paramContext, "当前没有可用历史记录", 0).show();
      return;
    }
    new StringBuilder().append(l.get("lastItem")).toString();
    Object localObject1 = e.iterator();
    String str1;
    for (;;)
    {
      if (!((Iterator)localObject1).hasNext())
      {
        str1 = null;
        if (str1 == null) {
          Toast.makeText(paramContext, "向前已经没有了数据", 0).show();
        }
      }
      else
      {
        str1 = (String)((Iterator)localObject1).next();
        if (c(str1) == 0) {
          continue;
        }
        String str2 = l.get(str1);
        try
        {
          i1 = Integer.parseInt(str2);
          if (i1 <= 1) {}
        }
        catch (Exception localException)
        {
          for (;;)
          {
            i1 = 0;
          }
        }
      }
    }
    int i1 = l.h(str1);
    localObject1 = (ArrayList)com.lishu.b.a.a.a.get(str1);
    i1 -= 1;
    localObject1 = (HashMap)((ArrayList)localObject1).get(i1 - 1);
    l.putkey("lastItem", str1);
    l.putkey(str1, i1);
    if (localObject1 != null) {
      localObject1 = ((HashMap)localObject1).entrySet().iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject1).hasNext())
      {
        PoseHelper008.valueMap.putkey("sign", SetMessageActivity.b(PoseHelper008.valueMap.getStringfrommap("getDeviceId")));
        PoseHelper008.saveData();
        i(paramContext);
        NewReMainToolActivity.a("自动", str1, k, j);
        Widget008BaseProvider.a(paramContext, "自动", str1, k, j);
        h();
        g(paramContext);
        PoseHelper008.saveDataToFile(m, l.a());
        return;
      }
      Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
      String str3 = (String)((Map.Entry)localObject2).getKey();
      localObject2 = (String)((Map.Entry)localObject2).getValue();
      PoseHelper008.valueMap.putkey(str3, localObject2);
    }
  }
  
  private static int c(String paramString)
  {
    Calendar localCalendar1 = Calendar.getInstance();
    localCalendar1.setTime(new Date());
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Calendar localCalendar2 = Calendar.getInstance();
    try
    {
      localCalendar2.setTime(localSimpleDateFormat.parse(paramString));
      i1 = b(localCalendar1, localCalendar2);
      paramString = (ArrayList)com.lishu.b.a.a.a.get(paramString);
      if (paramString == null)
      {
        Toast.makeText(a, "请检查历史记录是否已经被重命名，如果重命名请删除留存控制中的相关项", 1).show();
        return 0;
      }
    }
    catch (ParseException localParseException)
    {
      for (;;)
      {
        localParseException.printStackTrace();
      }
      i1 = NewReMainSetActivity.d(i1);
      if (i1 == 0) {}
    }
    for (int i1 = (int)(paramString.size() / 100.0F * i1 + 0.5D);; i1 = 0) {
      return i1;
    }
  }
  
  public static boolean c(Context paramContext)
  {
    
    if (e.size() == 0)
    {
      Toast.makeText(paramContext, "当前没有可用历史记录", 0).show();
      return false;
    }
    Object localObject1 = null;
    new StringBuilder().append(l.get("lastItem")).toString();
    Object localObject3 = e.iterator();
    for (;;)
    {
      if (!((Iterator)localObject3).hasNext())
      {
        if (localObject1 == null)
        {
          Toast.makeText(paramContext, "向后已经没有了数据", 0).show();
          return false;
        }
      }
      else
      {
        localObject2 = (String)((Iterator)localObject3).next();
        int i2 = c((String)localObject2);
        if (i2 == 0) {
          continue;
        }
        String str = l.get(localObject2);
        try
        {
          i1 = Integer.parseInt(str);
          if (i1 <= i2 - 1) {
            localObject1 = localObject2;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            i1 = 0;
          }
        }
      }
    }
    int i1 = l.h(localObject1);
    Object localObject2 = (ArrayList)com.lishu.b.a.a.a.get(localObject1);
    i1 += 1;
    localObject2 = (HashMap)((ArrayList)localObject2).get(i1 - 1);
    l.putkey("lastItem", localObject1);
    l.putkey(localObject1, i1);
    if (localObject2 != null) {
      localObject2 = ((HashMap)localObject2).entrySet().iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject2).hasNext())
      {
        PoseHelper008.valueMap.putkey("sign", SetMessageActivity.b(PoseHelper008.valueMap.getStringfrommap("getDeviceId")));
        PoseHelper008.saveData();
        i(paramContext);
        NewReMainToolActivity.a("自动", localObject1, k, j);
        Widget008BaseProvider.a(paramContext, "自动", localObject1, k, j);
        h();
        g(paramContext);
        PoseHelper008.saveDataToFile(m, l.a());
        return true;
      }
      Object localObject4 = (Map.Entry)((Iterator)localObject2).next();
      localObject3 = (String)((Map.Entry)localObject4).getKey();
      localObject4 = (String)((Map.Entry)localObject4).getValue();
      PoseHelper008.valueMap.putkey((String)localObject3, localObject4);
    }
  }
  
  public static void d(Context paramContext)
  {
    a = paramContext;
    if ((PoseHelper008.valueMap == null) || (PoseHelper008.valueMap.size() == 0))
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      new Intent().addFlags(268435456);
      try
      {
        paramContext.startActivity(localPackageManager.getLaunchIntentForPackage(paramContext.getPackageName()));
        return;
      }
      catch (Exception localException1)
      {
        Toast.makeText(paramContext, "未找到该应用", 0).show();
        return;
      }
    }
    g();
    Object localObject;
    if (!"true".equals(NewReMainSetActivity.a("radio_dbNet")))
    {
      localObject = NewReMainSetActivity.a();
      if (((String)localObject).equals("自动"))
      {
        SetMessageActivity.a(paramContext);
        com.lishu.b.a.a.a(new SimpleDateFormat("yyyy-MM-dd").format(new Date()), PoseHelper008.valueMap);
        Toast.makeText(paramContext, "生成随机数据成功", 1).show();
      }
    }
    for (;;)
    {
      g(paramContext);
      return;
      SetMessageActivity.a(paramContext);
      com.lishu.b.a.a.a((String)localObject, PoseHelper008.valueMap);
      NewReMainToolActivity.a("设置值", (String)localObject, k, j);
      Widget008BaseProvider.a(paramContext, "设置值", (String)localObject, k, j);
      break;
      SetMessageActivity.a(paramContext);
      localObject = paramContext.getApplicationContext();
      Toast.makeText(paramContext, "从网络获取数据中", 0).show();
      HashMap localHashMap = new HashMap();
      localHashMap.put("action", "netData2");
      int i1 = PoseHelper008.a;
      int i2 = LoadActivity.libSign((Context)localObject, i1, PoseHelper008.b);
      localHashMap.put("verCode", StartActivity.c((Context)localObject));
      localHashMap.put("a", i1);
      localHashMap.put("b", i2);
      if (SettingActivity.a("setSdkInt").equals("true")) {}
      try
      {
        i1 = Integer.parseInt(SettingActivity.a("sdkIntSpinnerMin")) - 1;
        i2 = Integer.parseInt(SettingActivity.a("sdkIntSpinnerMax")) - 1;
        if ((i1 >= 0) && (i2 > i1))
        {
          localHashMap.put("min", i1);
          localHashMap.put("max", i2);
        }
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          String str;
          localException2.printStackTrace();
        }
      }
      localHashMap.putAll(StartActivity.b());
      localHashMap.put("MANUFACTURER", SelectManuActivity.a());
      str = StartActivity.b + "/phone/LogicSimpleAction.action";
      i.a(str, localHashMap, new b(paramContext, (Context)localObject));
    }
  }
  
  public static void e(Context paramContext)
  {
    HashMap localHashMap = new HashMap();
    String str = SetNetAddressActivity.c();
    int i1 = 0;
    if (str.indexOf("?") > 0) {
      i1 = 1;
    }
    if (i1 == 0) {}
    for (str = str + "?imei=";; str = str + "&imei=")
    {
      TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
      str = str + localTelephonyManager.getDeviceId();
      paramContext = new c(paramContext);
      n.a(str, localHashMap, paramContext);
      return;
    }
  }
  
  public static void f(Context paramContext)
  {
    Object localObject1 = null;
    try
    {
      localObject2 = Map.getmap(PoseHelper008.getFileData("reMain_Auto"));
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      Object localObject2;
      label13:
      break label13;
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new Map();
    }
    ((Map)localObject2).putkey("nowStep", "1");
    ((Map)localObject2).putkey("index", "0");
    ((Map)localObject2).putkey("addNum", "0");
    ((Map)localObject2).putkey("lastDay", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    PoseHelper008.saveDataToFile("reMain_Auto", ((Map)localObject2).a());
    l = new Map();
    PoseHelper008.saveDataToFile(m, l.a());
    if (e.size() > 0)
    {
      d.putkey("kindName", e.get(0));
      d.putkey("progress", Integer.valueOf(0));
      h();
      g();
    }
    NewReMainToolActivity.a("当前还未开始");
    Widget008BaseProvider.a(paramContext, "当前还未开始");
  }
  
  private static void g()
  {
    Object localObject1;
    if (d == null) {
      localObject1 = PoseHelper008.getFileData("ReMainNewActivity");
    }
    try
    {
      d = Map.getmap((String)localObject1);
      label22:
      if (d == null) {
        d = new Map();
      }
      e = new ArrayList();
      Object localObject3 = new ArrayList();
      Object localObject4 = com.lishu.b.a.a.a.entrySet().iterator();
      for (;;)
      {
        int i1;
        if (!((Iterator)localObject4).hasNext())
        {
          localObject1 = new long[((ArrayList)localObject3).size()];
          i1 = 0;
          label91:
          if (i1 < ((ArrayList)localObject3).size()) {
            break label409;
          }
          Arrays.sort((long[])localObject1);
          a((long[])localObject1);
          int i2 = localObject1.length;
          i1 = 0;
          label116:
          if (i1 < i2) {
            break label432;
          }
          if (b(d.getStringfrommap("kindName")) == -1)
          {
            if (e.size() <= 0) {
              break label479;
            }
            d.putkey("kindName", e.get(0));
            d.putkey("progress", Integer.valueOf(0));
          }
          d.h("progress");
          localObject1 = d.getStringfrommap("kindName");
          if (localObject1 == null)
          {
            if (e.size() > 0) {
              localObject1 = (String)e.get(0);
            }
            d.putkey("progress", Integer.valueOf(0));
            d.putkey("kindName", localObject1);
          }
          localObject1 = PoseHelper008.getFileData(m);
          if (localObject1 == null) {}
        }
        try
        {
          if (((String)localObject1).trim().length() > 0) {
            l = maputils.getmap((String)localObject1);
          }
          label275:
          if (l == null) {
            l = new Map();
          }
          return;
          localObject1 = (String)((Map.Entry)((Iterator)localObject4).next()).getKey();
          Object localObject5 = new SimpleDateFormat("yyyy-MM-dd");
          Object localObject2;
          try
          {
            localObject1 = ((SimpleDateFormat)localObject5).parse((String)localObject1);
            if (localObject1 == null) {
              continue;
            }
            localObject5 = Calendar.getInstance();
            ((Calendar)localObject5).setTime(new Date());
            Calendar localCalendar = Calendar.getInstance();
            localCalendar.setTime((Date)localObject1);
            if (NewReMainSetActivity.d(b((Calendar)localObject5, localCalendar)) <= 0) {
              continue;
            }
            ((ArrayList)localObject3).add(Long.valueOf(((Date)localObject1).getTime()));
          }
          catch (Exception localException1)
          {
            for (;;)
            {
              localException1.printStackTrace();
              localObject2 = null;
            }
          }
          label409:
          localObject2[i1] = ((Long)((ArrayList)localObject3).get(i1)).longValue();
          i1 += 1;
          break label91;
          label432:
          long l1 = localObject2[i1];
          localObject3 = new SimpleDateFormat("yyyy-MM-dd");
          localObject4 = new Date(l1);
          e.add(((SimpleDateFormat)localObject3).format((Date)localObject4));
          i1 += 1;
          break label116;
          label479:
          d.putkey("kindName", "");
          d.putkey("progress", Integer.valueOf(0));
        }
        catch (Exception localException2)
        {
          break label275;
        }
      }
    }
    catch (Exception localException3)
    {
      break label22;
    }
  }
  
  private static void g(Context paramContext)
  {
    String str = LoadActivity.getProPackAge(paramContext, LoadActivity.a, LoadActivity.b);
    if ((NewReMainSetActivity.a("check_deleteFile") != null) && (NewReMainSetActivity.a("check_deleteFile").equals("true"))) {
      RecordAppFileHandler.a(paramContext, true);
    }
    if ((NewReMainSetActivity.a("check_clearData") != null) && (NewReMainSetActivity.a("check_clearData").equals("true"))) {
      ClearApplicationDataActivity.a(paramContext, str);
    }
    if ((NewReMainSetActivity.a("check_deleteSystem") != null) && (NewReMainSetActivity.a("check_deleteSystem").equals("true"))) {
      SetSystemValueActivity.a(paramContext);
    }
  }
  
  private static void h()
  {
    PoseHelper008.saveDataToFile("ReMainNewActivity", d.a());
  }
  
  private static boolean h(Context paramContext)
  {
    
    if (e.size() == 0) {
      Toast.makeText(paramContext, "当前没有可用历史记录", 0).show();
    }
    Object localObject3;
    Object localObject4;
    Iterator localIterator;
    int i1;
    Object localObject1;
    do
    {
      return false;
      localObject3 = new ArrayList();
      localObject4 = l.get("lastItem");
      localIterator = e.iterator();
      i1 = 0;
      localObject1 = null;
      if (localIterator.hasNext()) {
        break;
      }
    } while (((ArrayList)localObject3).size() == 0);
    if (i1 == 0) {
      localObject1 = (String)((ArrayList)localObject3).get(0);
    }
    for (;;)
    {
      if (localObject1 == null) {
        localObject1 = (String)((ArrayList)localObject3).get(0);
      }
      for (;;)
      {
        i1 = l.h((String)localObject1);
        Object localObject2 = (ArrayList)com.lishu.b.a.a.a.get(localObject1);
        i1 += 1;
        localObject2 = (HashMap)((ArrayList)localObject2).get(i1 - 1);
        l.putkey("lastItem", localObject1);
        l.putkey((String)localObject1, i1);
        if (localObject2 != null) {
          localObject2 = ((HashMap)localObject2).entrySet().iterator();
        }
        for (;;)
        {
          for (;;)
          {
            if (!((Iterator)localObject2).hasNext())
            {
              PoseHelper008.valueMap.putkey("sign", SetMessageActivity.b(PoseHelper008.valueMap.getStringfrommap("getDeviceId")));
              PoseHelper008.saveData();
              i(paramContext);
              NewReMainToolActivity.a("自动", (String)localObject1, k, j);
              Widget008BaseProvider.a(paramContext, "自动", (String)localObject1, k, j);
              h();
              g(paramContext);
              PoseHelper008.saveDataToFile(m, l.a());
              return true;
              localObject2 = (String)localIterator.next();
              int i4 = c((String)localObject2);
              if (i4 == 0) {
                break;
              }
              String str = l.get(localObject2);
              try
              {
                i2 = Integer.parseInt(str);
                int i3 = i1;
                if (((String)localObject2).equals(localObject4)) {
                  i3 = 1;
                }
                i1 = i3;
                if (i2 > i4 - 1) {
                  break;
                }
                ((ArrayList)localObject3).add(localObject2);
                i1 = i3;
                if (((String)localObject2).equals(localObject4)) {
                  break;
                }
                i1 = i3;
                if (i3 == 0) {
                  break;
                }
                i1 = i3;
                if (localObject1 != null) {
                  break;
                }
                localObject1 = localObject2;
                i1 = i3;
              }
              catch (Exception localException)
              {
                for (;;)
                {
                  int i2 = 0;
                }
              }
            }
          }
          localObject4 = (Map.Entry)((Iterator)localObject2).next();
          localObject3 = (String)((Map.Entry)localObject4).getKey();
          localObject4 = (String)((Map.Entry)localObject4).getValue();
          PoseHelper008.valueMap.putkey((String)localObject3, localObject4);
        }
      }
    }
  }
  
  private static void i(Context paramContext)
  {
    b();
    int i1 = (int)(k * 100 / j);
    a(paramContext, "当前所在分类为：" + d.getStringfrommap("kindName") + "   当前总进度为" + i1);
  }
  
  public final void a()
  {
    TextView localTextView1 = (TextView)findViewById(2131361887);
    TextView localTextView2 = (TextView)findViewById(2131361888);
    ProgressBar localProgressBar = (ProgressBar)findViewById(2131361889);
    TextView localTextView3 = (TextView)findViewById(2131361890);
    if (NewReMainSetActivity.a().equals("自动")) {
      localTextView1.setText("当前新增模式为:自动");
    }
    for (;;)
    {
      localTextView2.setText("当前分类为：" + l.get("lastItem"));
      localTextView3.setText("当前为第" + k + "条数据，共" + j + "条数据");
      localProgressBar.setMax(j);
      localProgressBar.setProgress(k);
      return;
      localTextView1.setText("当前新增模式为:设置值");
    }
  }
  
  public final void a(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0)) {
      try
      {
        paramString = maputils.getmap(paramString).getStringfrommap("key").split("_");
        int i1 = Integer.parseInt(paramString[0]);
        int i2 = Integer.parseInt(paramString[1]);
        StartActivity.e = LoadActivity.stringFromJNI(this, i1, i2);
        LoadActivity.a = i1;
        LoadActivity.b = i2;
        paramString = new HashMap();
        StartActivity.a(this);
        paramString.putAll(StartActivity.g);
        i.a(StartActivity.d, paramString, new e(this));
        return;
      }
      catch (Exception paramString)
      {
        runOnUiThread(new i(this));
        return;
      }
    }
    com.lishu.c.a.b(this, "连接服务器失败，请重新，如果还不行，请联系客服");
    runOnUiThread(new j(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903059);
    if ((h != null) && (!h.isFinishing())) {
      h.finish();
    }
    h = this;
    this.g = ((ListView)findViewById(2131361886));
    g();
    b();
    this.f = new a();
    this.g.setAdapter(this.f);
    a();
    LoadActivity.a(this, this);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296259, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362277) {
      com.lishu.c.a.a(this, "是否重置进度", new d(this)).create().show();
    }
    for (;;)
    {
      return true;
      if (paramMenuItem.getItemId() == 2131362276)
      {
        paramMenuItem = new Intent();
        paramMenuItem.setClass(this, NewReMainSetActivity.class);
        startActivity(paramMenuItem);
      }
      else if (paramMenuItem.getItemId() == 2131362278)
      {
        paramMenuItem = new Intent();
        paramMenuItem.setClass(this, WebMessageActivity.class);
        paramMenuItem.putExtra("url", StartActivity.b + "/phone/ContentAction.action?action=newremain_help");
        startActivity(paramMenuItem);
      }
    }
  }
  
  protected void onResume()
  {
    g();
    b();
    this.f.notifyDataSetChanged();
    a();
    super.onResume();
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return NewReMainActivity.c().size();
    }
    
    public final Object getItem(int paramInt)
    {
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int i = 0;
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = LayoutInflater.from(NewReMainActivity.this).inflate(2130903060, null);
        paramView = new NewReMainActivity.b(NewReMainActivity.this);
        paramViewGroup.setTag(paramView);
        paramView.c = ((TextView)paramViewGroup.findViewById(2131361893));
        paramView.a = ((TextView)paramViewGroup.findViewById(2131361892));
        paramView.b = ((ProgressBar)paramViewGroup.findViewById(2131361895));
        paramView.d = ((TextView)paramViewGroup.findViewById(2131361891));
        paramView.e = ((TextView)paramViewGroup.findViewById(2131361894));
      }
      paramView = (NewReMainActivity.b)paramViewGroup.getTag();
      String str = (String)NewReMainActivity.c().get(paramInt);
      Object localObject = Calendar.getInstance();
      ((Calendar)localObject).setTime(new Date());
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
      Calendar localCalendar = Calendar.getInstance();
      try
      {
        localCalendar.setTime(localSimpleDateFormat.parse(str));
        int j = NewReMainActivity.a((Calendar)localObject, localCalendar);
        localObject = (ArrayList)com.lishu.b.a.a.a.get(str);
        int k = NewReMainSetActivity.d(j);
        if (k != 0)
        {
          paramInt = (int)(((ArrayList)localObject).size() / 100.0F * k + 0.5D);
          paramView.c.setText("分类名：" + str);
          paramView.a.setText("第" + j + "天");
          paramView.d.setText("留存率:" + k);
          str = NewReMainActivity.d().get(str);
          try
          {
            j = Integer.parseInt(str);
            i = j;
          }
          catch (Exception localException)
          {
            label335:
            break label335;
          }
          paramView.b.setMax(paramInt);
          paramView.b.setProgress(i);
          paramView.e.setText("总共" + paramInt + "条数据,已经完成" + i + "条");
          return paramViewGroup;
        }
      }
      catch (ParseException localParseException)
      {
        for (;;)
        {
          localParseException.printStackTrace();
          continue;
          paramInt = 0;
        }
      }
    }
  }
  
  final class b
  {
    public TextView a;
    public ProgressBar b;
    public TextView c;
    public TextView d;
    public TextView e;
    
    b() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.remainNew.NewReMainActivity

 * JD-Core Version:    0.7.0.1

 */