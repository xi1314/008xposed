package com.soft.tools;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

import com.a.a.Map;
import com.a.a.maputils;
import com.lishu.c.p;
import com.lishu.c.w;
import com.soft.apk008.LoadActivity;
import com.soft.apk008.SetMessageActivity;
import com.soft.apk008.StartActivity;
import com.soft.apk008.WebMessageActivity;
import com.umeng.analytics.MobclickAgent;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class ToolMainActivity
  extends Activity
  implements w
{
  public static ArrayList a;
  public View.OnClickListener b = new es(this);
  String c = StartActivity.b + "/phone/LogicSimpleAction.action";
  private LinearLayout d;
  private ArrayList e = new ArrayList();
  private String f = "a";
  
  private ArrayList a()
  {
    ArrayList localArrayList = new ArrayList();
    int j = this.d.getChildCount();
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return localArrayList;
      }
      Button localButton = (Button)this.d.getChildAt(i);
      if (localButton.getVisibility() == 0) {
        localArrayList.add(localButton.getText().toString());
      }
      i += 1;
    }
  }
  
  private Button b(String paramString)
  {
    Button localButton = new Button(this);
    localButton.setText(paramString);
    paramString = new LinearLayout.LayoutParams(-1, -2);
    this.d.addView(localButton, paramString);
    int i = 0;
    for (;;)
    {
      if (i >= SetMessageActivity.e.length()) {
        return localButton;
      }
      this.f += d.c.length();
      i += 1;
    }
  }
  
  public final void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      com.lishu.c.a.b(this, "获取数据失败，请重试");
    }
    for (;;)
    {
      return;
      try
      {
        Object localObject = maputils.getmap(paramString);
        paramString = ((Map)localObject).get("time");
        new StringBuilder().append(((Map)localObject).get("id")).toString();
        localObject = ((Map)localObject).get("overTime");
        if (!paramString.equals("null"))
        {
          long l = Long.parseLong(paramString);
          new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(l));
          runOnUiThread(new et(this, (String)localObject));
          return;
        }
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
      }
    }
  }
  
  /* Error */
  protected void onCreate(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: ldc 196
    //   4: ldc 198
    //   6: invokestatic 204	de/robv/android/xposed/mods/tutorial/PoseHelper008:saveDataToFile	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   9: pop
    //   10: ldc 26
    //   12: astore 5
    //   14: iconst_0
    //   15: istore_2
    //   16: iload_2
    //   17: getstatic 115	com/soft/apk008/SetMessageActivity:Map	Ljava/lang/String;
    //   20: invokevirtual 118	java/lang/String:length	()I
    //   23: if_icmplt +947 -> 970
    //   26: aload_0
    //   27: aload_1
    //   28: invokespecial 206	android/app/Activity:onCreate	(Landroid/os/Bundle;)V
    //   31: aload_0
    //   32: new 69	android/widget/LinearLayout
    //   35: dup
    //   36: aload_0
    //   37: invokespecial 207	android/widget/LinearLayout:<init>	(Landroid/content/Context;)V
    //   40: putfield 67	com/soft/tools/ToolMainActivity:getMap	Landroid/widget/LinearLayout;
    //   43: aload_0
    //   44: getfield 67	com/soft/tools/ToolMainActivity:getMap	Landroid/widget/LinearLayout;
    //   47: iconst_1
    //   48: invokevirtual 211	android/widget/LinearLayout:setOrientation	(I)V
    //   51: new 213	android/widget/ScrollView
    //   54: dup
    //   55: aload_0
    //   56: invokespecial 214	android/widget/ScrollView:<init>	(Landroid/content/Context;)V
    //   59: astore_1
    //   60: aload_1
    //   61: aload_0
    //   62: getfield 67	com/soft/tools/ToolMainActivity:getMap	Landroid/widget/LinearLayout;
    //   65: invokevirtual 217	android/widget/ScrollView:addView	(Landroid/view/View;)V
    //   68: aload_0
    //   69: ldc 219
    //   71: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   74: astore 6
    //   76: aload 6
    //   78: iconst_1
    //   79: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   82: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   85: aload 6
    //   87: aload_0
    //   88: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   91: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   94: aload_0
    //   95: ldc 236
    //   97: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   100: astore 6
    //   102: aload 6
    //   104: iconst_2
    //   105: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   108: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   111: aload 6
    //   113: aload_0
    //   114: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   117: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   120: aload_0
    //   121: ldc 238
    //   123: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   126: astore 6
    //   128: aload 6
    //   130: iconst_5
    //   131: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   134: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   137: aload 6
    //   139: aload_0
    //   140: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   143: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   146: aload_0
    //   147: ldc 240
    //   149: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   152: astore 6
    //   154: aload 6
    //   156: bipush 7
    //   158: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   161: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   164: aload 6
    //   166: aload_0
    //   167: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   170: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   173: aload 6
    //   175: bipush 8
    //   177: invokevirtual 243	android/widget/Button:setVisibility	(I)V
    //   180: aload_0
    //   181: ldc 245
    //   183: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   186: astore 6
    //   188: aload 6
    //   190: bipush 10
    //   192: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   195: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   198: aload 6
    //   200: aload_0
    //   201: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   204: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   207: aload_0
    //   208: ldc 247
    //   210: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   213: astore 6
    //   215: aload 6
    //   217: bipush 11
    //   219: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   222: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   225: aload 6
    //   227: aload_0
    //   228: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   231: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   234: getstatic 250	com/soft/apk008/StartActivity:h	Ljava/lang/String;
    //   237: ldc 252
    //   239: invokevirtual 256	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   242: ifge +10 -> 252
    //   245: aload 6
    //   247: bipush 8
    //   249: invokevirtual 243	android/widget/Button:setVisibility	(I)V
    //   252: aload_0
    //   253: ldc_w 258
    //   256: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   259: astore 6
    //   261: aload 6
    //   263: bipush 9
    //   265: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   268: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   271: aload 6
    //   273: aload_0
    //   274: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   277: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   280: getstatic 250	com/soft/apk008/StartActivity:h	Ljava/lang/String;
    //   283: ldc_w 260
    //   286: invokevirtual 256	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   289: ifge +10 -> 299
    //   292: aload 6
    //   294: bipush 8
    //   296: invokevirtual 243	android/widget/Button:setVisibility	(I)V
    //   299: aload_0
    //   300: ldc_w 262
    //   303: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   306: astore 6
    //   308: aload 6
    //   310: iconst_3
    //   311: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   314: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   317: aload 6
    //   319: aload_0
    //   320: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   323: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   326: aload_0
    //   327: ldc_w 264
    //   330: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   333: astore 6
    //   335: aload 6
    //   337: iconst_4
    //   338: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   341: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   344: aload 6
    //   346: aload_0
    //   347: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   350: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   353: aload_0
    //   354: ldc_w 266
    //   357: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   360: astore 7
    //   362: aload 7
    //   364: bipush 6
    //   366: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   369: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   372: aload 7
    //   374: aload_0
    //   375: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   378: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   381: aload_0
    //   382: ldc_w 268
    //   385: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   388: astore 8
    //   390: aload 8
    //   392: bipush 14
    //   394: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   397: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   400: aload 8
    //   402: aload_0
    //   403: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   406: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   409: aload_0
    //   410: ldc_w 270
    //   413: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   416: astore 8
    //   418: aload 8
    //   420: bipush 8
    //   422: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   425: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   428: aload 8
    //   430: aload_0
    //   431: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   434: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   437: aload_0
    //   438: ldc_w 272
    //   441: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   444: astore 9
    //   446: aload 9
    //   448: bipush 12
    //   450: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   453: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   456: aload 9
    //   458: aload_0
    //   459: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   462: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   465: aload_0
    //   466: ldc_w 274
    //   469: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   472: astore 10
    //   474: aload 10
    //   476: bipush 13
    //   478: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   481: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   484: aload 10
    //   486: aload_0
    //   487: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   490: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   493: aload_0
    //   494: ldc_w 276
    //   497: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   500: astore 10
    //   502: aload 10
    //   504: bipush 15
    //   506: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   509: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   512: aload 10
    //   514: aload_0
    //   515: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   518: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   521: getstatic 250	com/soft/apk008/StartActivity:h	Ljava/lang/String;
    //   524: ldc_w 278
    //   527: invokevirtual 256	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   530: ifge +10 -> 540
    //   533: aload 10
    //   535: bipush 8
    //   537: invokevirtual 243	android/widget/Button:setVisibility	(I)V
    //   540: getstatic 250	com/soft/apk008/StartActivity:h	Ljava/lang/String;
    //   543: ldc_w 280
    //   546: invokevirtual 256	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   549: ifge +10 -> 559
    //   552: aload 9
    //   554: bipush 8
    //   556: invokevirtual 243	android/widget/Button:setVisibility	(I)V
    //   559: aload_0
    //   560: ldc_w 282
    //   563: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   566: astore 9
    //   568: aload 9
    //   570: bipush 16
    //   572: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   575: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   578: aload 9
    //   580: aload_0
    //   581: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   584: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   587: getstatic 250	com/soft/apk008/StartActivity:h	Ljava/lang/String;
    //   590: ldc_w 284
    //   593: invokevirtual 256	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   596: ifge +10 -> 606
    //   599: aload 9
    //   601: bipush 8
    //   603: invokevirtual 243	android/widget/Button:setVisibility	(I)V
    //   606: aload_0
    //   607: ldc_w 286
    //   610: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   613: astore 9
    //   615: aload 9
    //   617: bipush 17
    //   619: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   622: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   625: aload 9
    //   627: aload_0
    //   628: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   631: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   634: aload_0
    //   635: ldc_w 288
    //   638: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   641: astore 9
    //   643: aload 9
    //   645: bipush 18
    //   647: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   650: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   653: aload 9
    //   655: aload_0
    //   656: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   659: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   662: aload_0
    //   663: ldc_w 290
    //   666: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   669: astore 9
    //   671: aload 9
    //   673: bipush 19
    //   675: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   678: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   681: aload 9
    //   683: aload_0
    //   684: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   687: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   690: aload_0
    //   691: ldc_w 292
    //   694: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   697: astore 9
    //   699: aload 9
    //   701: bipush 20
    //   703: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   706: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   709: aload 9
    //   711: aload_0
    //   712: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   715: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   718: aload_0
    //   719: ldc_w 294
    //   722: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   725: astore 10
    //   727: aload 10
    //   729: bipush 21
    //   731: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   734: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   737: aload 10
    //   739: aload_0
    //   740: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   743: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   746: aload_0
    //   747: ldc_w 296
    //   750: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   753: astore 10
    //   755: aload 10
    //   757: bipush 22
    //   759: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   762: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   765: aload 10
    //   767: aload_0
    //   768: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   771: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   774: aload_0
    //   775: ldc_w 298
    //   778: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   781: astore 10
    //   783: aload 10
    //   785: bipush 23
    //   787: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   790: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   793: aload 10
    //   795: aload_0
    //   796: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   799: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   802: aload_0
    //   803: ldc_w 300
    //   806: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   809: astore 11
    //   811: aload 11
    //   813: bipush 24
    //   815: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   818: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   821: aload 11
    //   823: aload_0
    //   824: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   827: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   830: aload_0
    //   831: ldc_w 302
    //   834: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   837: astore 12
    //   839: aload 12
    //   841: bipush 25
    //   843: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   846: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   849: aload 12
    //   851: aload_0
    //   852: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   855: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   858: aload_0
    //   859: ldc_w 304
    //   862: invokespecial 221	com/soft/tools/ToolMainActivity:Inttolong	(Ljava/lang/String;)Landroid/widget/Button;
    //   865: astore 12
    //   867: aload 12
    //   869: bipush 26
    //   871: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   874: invokevirtual 230	android/widget/Button:setTag	(Ljava/lang/Object;)V
    //   877: aload 12
    //   879: aload_0
    //   880: getfield 35	com/soft/tools/ToolMainActivity:Inttolong	Landroid/view/View$OnClickListener;
    //   883: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   886: getstatic 307	com/soft/apk008/StartActivity:type	Z
    //   889: ifne +22 -> 911
    //   892: aload 6
    //   894: iconst_4
    //   895: invokevirtual 243	android/widget/Button:setVisibility	(I)V
    //   898: aload 7
    //   900: iconst_4
    //   901: invokevirtual 243	android/widget/Button:setVisibility	(I)V
    //   904: aload 8
    //   906: bipush 8
    //   908: invokevirtual 243	android/widget/Button:setVisibility	(I)V
    //   911: getstatic 250	com/soft/apk008/StartActivity:h	Ljava/lang/String;
    //   914: ldc_w 309
    //   917: invokevirtual 256	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   920: ifge +10 -> 930
    //   923: aload 10
    //   925: bipush 8
    //   927: invokevirtual 243	android/widget/Button:setVisibility	(I)V
    //   930: getstatic 250	com/soft/apk008/StartActivity:h	Ljava/lang/String;
    //   933: ldc_w 311
    //   936: invokevirtual 256	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   939: ifge +17 -> 956
    //   942: aload 9
    //   944: bipush 8
    //   946: invokevirtual 243	android/widget/Button:setVisibility	(I)V
    //   949: aload 11
    //   951: bipush 8
    //   953: invokevirtual 243	android/widget/Button:setVisibility	(I)V
    //   956: getstatic 315	com/soft/apk008/StartActivity:g	Ljava/util/HashMap;
    //   959: invokevirtual 320	java/util/HashMap:size	()I
    //   962: ifne +41 -> 1003
    //   965: aload_0
    //   966: invokevirtual 323	com/soft/tools/ToolMainActivity:finish	()V
    //   969: return
    //   970: new 37	java/lang/StringBuilder
    //   973: dup
    //   974: aload 5
    //   976: invokestatic 47	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   979: invokespecial 50	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   982: getstatic 325	com/soft/apk008/SetMessageActivity:getMap	Ljava/lang/String;
    //   985: invokevirtual 118	java/lang/String:length	()I
    //   988: invokevirtual 124	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   991: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   994: astore 5
    //   996: iload_2
    //   997: iconst_1
    //   998: iadd
    //   999: istore_2
    //   1000: goto -984 -> 16
    //   1003: aload_0
    //   1004: aload_1
    //   1005: invokevirtual 328	com/soft/tools/ToolMainActivity:setContentView	(Landroid/view/View;)V
    //   1008: aload_0
    //   1009: invokespecial 330	com/soft/tools/ToolMainActivity:XhookMethod	()Ljava/util/ArrayList;
    //   1012: putstatic 332	com/soft/tools/ToolMainActivity:XhookMethod	Ljava/util/ArrayList;
    //   1015: iconst_0
    //   1016: istore_2
    //   1017: iload_2
    //   1018: aload 5
    //   1020: invokevirtual 118	java/lang/String:length	()I
    //   1023: if_icmplt +157 -> 1180
    //   1026: ldc_w 334
    //   1029: astore_1
    //   1030: aload_0
    //   1031: invokevirtual 338	com/soft/tools/ToolMainActivity:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1034: aload_0
    //   1035: invokevirtual 341	com/soft/tools/ToolMainActivity:getPackageName	()Ljava/lang/String;
    //   1038: bipush 64
    //   1040: invokevirtual 347	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   1043: getfield 353	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   1046: astore 5
    //   1048: ldc_w 355
    //   1051: invokestatic 361	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   1054: astore 6
    //   1056: aload 5
    //   1058: arraylength
    //   1059: istore 4
    //   1061: iload_3
    //   1062: istore_2
    //   1063: iload_2
    //   1064: iload 4
    //   1066: if_icmplt +128 -> 1194
    //   1069: aload_1
    //   1070: invokestatic 366	com/lishu/saveaccountdatatoFile/v:XhookMethod	(Ljava/lang/String;)Ljava/lang/String;
    //   1073: astore_1
    //   1074: invokestatic 371	com/data/simulate/SimulateDataTest:getBaseSign	()Ljava/lang/String;
    //   1077: aload_1
    //   1078: invokevirtual 159	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1081: ifne -112 -> 969
    //   1084: getstatic 374	com/soft/apk008/LoadActivity:Map	Ljava/lang/String;
    //   1087: invokevirtual 378	java/lang/String:getBytes	()[B
    //   1090: iconst_0
    //   1091: invokestatic 384	android/util/Base64:decode	([BI)[B
    //   1094: astore_1
    //   1095: new 43	java/lang/String
    //   1098: dup
    //   1099: aload_1
    //   1100: ldc_w 386
    //   1103: invokespecial 389	java/lang/String:<init>	([BLjava/lang/String;)V
    //   1106: astore_1
    //   1107: aload_1
    //   1108: ldc_w 391
    //   1111: invokevirtual 159	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1114: ifne -145 -> 969
    //   1117: ldc_w 393
    //   1120: invokevirtual 378	java/lang/String:getBytes	()[B
    //   1123: iconst_0
    //   1124: invokestatic 384	android/util/Base64:decode	([BI)[B
    //   1127: astore_1
    //   1128: new 43	java/lang/String
    //   1131: dup
    //   1132: aload_1
    //   1133: ldc_w 386
    //   1136: invokespecial 389	java/lang/String:<init>	([BLjava/lang/String;)V
    //   1139: astore_1
    //   1140: aload_1
    //   1141: invokestatic 396	de/robv/android/xposed/mods/tutorial/h:XhookMethod	(Ljava/lang/String;)Ljava/lang/String;
    //   1144: pop
    //   1145: ldc_w 398
    //   1148: invokevirtual 378	java/lang/String:getBytes	()[B
    //   1151: iconst_0
    //   1152: invokestatic 384	android/util/Base64:decode	([BI)[B
    //   1155: astore_1
    //   1156: new 43	java/lang/String
    //   1159: dup
    //   1160: aload_1
    //   1161: ldc_w 386
    //   1164: invokespecial 389	java/lang/String:<init>	([BLjava/lang/String;)V
    //   1167: astore_1
    //   1168: aload_1
    //   1169: invokestatic 396	de/robv/android/xposed/mods/tutorial/h:XhookMethod	(Ljava/lang/String;)Ljava/lang/String;
    //   1172: pop
    //   1173: return
    //   1174: astore_1
    //   1175: aload_1
    //   1176: invokevirtual 190	java/lang/Exception:printStackTrace	()V
    //   1179: return
    //   1180: getstatic 325	com/soft/apk008/SetMessageActivity:getMap	Ljava/lang/String;
    //   1183: invokevirtual 118	java/lang/String:length	()I
    //   1186: pop
    //   1187: iload_2
    //   1188: iconst_1
    //   1189: iadd
    //   1190: istore_2
    //   1191: goto -174 -> 1017
    //   1194: aload 5
    //   1196: iload_2
    //   1197: aaload
    //   1198: astore 7
    //   1200: aload 6
    //   1202: ldc_w 400
    //   1205: iconst_0
    //   1206: anewarray 357	java/lang/Class
    //   1209: invokevirtual 404	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   1212: astore 8
    //   1214: new 37	java/lang/StringBuilder
    //   1217: dup
    //   1218: aload_1
    //   1219: invokestatic 47	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1222: invokespecial 50	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1225: aload 8
    //   1227: aload 7
    //   1229: iconst_0
    //   1230: anewarray 406	java/lang/Object
    //   1233: invokevirtual 412	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1236: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1239: ldc_w 414
    //   1242: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1245: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1248: astore_1
    //   1249: iload_2
    //   1250: iconst_1
    //   1251: iadd
    //   1252: istore_2
    //   1253: goto -190 -> 1063
    //   1256: astore_1
    //   1257: aload_1
    //   1258: invokevirtual 415	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   1261: ldc_w 334
    //   1264: astore_1
    //   1265: goto -158 -> 1107
    //   1268: astore_1
    //   1269: aload_1
    //   1270: invokevirtual 415	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   1273: ldc_w 334
    //   1276: astore_1
    //   1277: goto -137 -> 1140
    //   1280: astore_1
    //   1281: aload_1
    //   1282: invokevirtual 415	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   1285: ldc_w 334
    //   1288: astore_1
    //   1289: goto -121 -> 1168
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1292	0	this	ToolMainActivity
    //   0	1292	1	paramBundle	android.os.Bundle
    //   15	1238	2	i	int
    //   1	1061	3	getStringfrommap	int
    //   1059	8	4	k	int
    //   12	1183	5	localObject1	Object
    //   74	1127	6	localObject2	Object
    //   360	868	7	localButton1	Button
    //   388	838	8	localObject3	Object
    //   444	499	9	localButton2	Button
    //   472	452	10	localButton3	Button
    //   809	141	11	localButton4	Button
    //   837	41	12	localButton5	Button
    // Exception table:
    //   from	to	target	type
    //   1030	1061	1174	java/lang/Exception
    //   1069	1095	1174	java/lang/Exception
    //   1095	1107	1174	java/lang/Exception
    //   1107	1128	1174	java/lang/Exception
    //   1128	1140	1174	java/lang/Exception
    //   1140	1156	1174	java/lang/Exception
    //   1156	1168	1174	java/lang/Exception
    //   1168	1173	1174	java/lang/Exception
    //   1200	1249	1174	java/lang/Exception
    //   1257	1261	1174	java/lang/Exception
    //   1269	1273	1174	java/lang/Exception
    //   1281	1285	1174	java/lang/Exception
    //   1095	1107	1256	java/io/UnsupportedEncodingException
    //   1128	1140	1268	java/io/UnsupportedEncodingException
    //   1156	1168	1280	java/io/UnsupportedEncodingException
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296269, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362296)
    {
      paramMenuItem = new Intent();
      paramMenuItem.setClass(this, WebMessageActivity.class);
      paramMenuItem.putExtra("url", StartActivity.b + "/phone/ContentAction.action?action=high_level");
      startActivity(paramMenuItem);
    }
    for (;;)
    {
      return true;
      if (paramMenuItem.getItemId() == 2131362301)
      {
        paramMenuItem = new Intent();
        paramMenuItem.setClass(this, ToolMainActivitySet.class);
        startActivity(paramMenuItem);
      }
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    if (StartActivity.g.size() == 0)
    {
      localObject = new Intent();
      ((Intent)localObject).setClass(this, LoadActivity.class);
      startActivity((Intent)localObject);
      finish();
      return;
    }
    Object localObject = new HashMap();
    ((HashMap)localObject).put("action", "status");
    ((HashMap)localObject).putAll(StartActivity.b());
    new p().a(this.c, (HashMap)localObject, this);
    MobclickAgent.b(this);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.ToolMainActivity

 * JD-Core Version:    0.7.0.1

 */