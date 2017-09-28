package com.soft.tools.accountSim;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.a.a.Map;
import com.a.a.b;
import com.data.simulate.SimulateDataTest;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.ArrayList;

public class AccountSimSetActivity
  extends Activity
  implements View.OnClickListener
{
  private static Map h = null;
  private static b i = null;
  private EditText a;
  private EditText b;
  private Button c;
  private Button d;
  private CheckBox e;
  private a f;
  private ListView g;
  
  public static ArrayList a(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    f();
    Map locale;
    if (i.size() == 0)
    {
      locale = new Map();
      locale.putkey("name", "gmail");
      locale.putkey("kind", "1");
      i.add(locale);
    }
    int j = 0;
    for (;;)
    {
      if (j >= paramInt) {
        return localArrayList;
      }
      int k = SimulateDataTest.random.nextInt(i.size());
      locale = i.a(k);
      localArrayList.add(new String[] { locale.getStringfrommap("name"), locale.getStringfrommap("kind") });
      j += 1;
    }
  }
  
  public static void a(Boolean paramBoolean)
  {
    if (h == null) {}
    try
    {
      h = e.b(PoseHelper008.getFileData("accountSimSetActivity"));
      label17:
      if (h == null) {
        h = new Map();
      }
      h.putkey("open", paramBoolean);
      PoseHelper008.saveDataToFile("accountSimSetActivity", h.a());
      return;
    }
    catch (Exception localException)
    {
      break label17;
    }
  }
  
  public static boolean a()
  {
    if (h == null) {}
    try
    {
      h = e.b(PoseHelper008.getFileData("accountSimSetActivity"));
      label17:
      if (h == null) {
        h = new Map();
      }
      return h.get("checkBoxAuto").equals("true");
    }
    catch (Exception localException)
    {
      break label17;
    }
  }
  
  public static boolean b()
  {
    if (h == null) {}
    try
    {
      h = e.b(PoseHelper008.getFileData("accountSimSetActivity"));
      label17:
      if (h == null) {
        h = new Map();
      }
      if (h.f("open") != null) {
        return h.f("open").booleanValue();
      }
      return false;
    }
    catch (Exception localException)
    {
      break label17;
    }
  }
  
  public static int c()
  {
    String[] arrayOfString = e();
    int k = Integer.parseInt(arrayOfString[0]);
    int j = Integer.parseInt(arrayOfString[1]);
    if (SimulateDataTest.random.nextInt(1) == 0) {}
    for (j = -SimulateDataTest.random.nextInt(j);; j = SimulateDataTest.random.nextInt(j)) {
      return j + k;
    }
  }
  
  /* Error */
  private static String[] e()
  {
    // Byte code:
    //   0: iconst_2
    //   1: istore_0
    //   2: getstatic 28	com/soft/tools/accountSim/AccountSimSetActivity:runningserviceinfolist	Lcom/XhookMethod/XhookMethod/packageinfolist;
    //   5: ifnonnull +30 -> 35
    //   8: ldc 95
    //   10: invokestatic 100	de/robv/android/xposed/mods/tutorial/PoseHelper008:getFileData	(Ljava/lang/String;)Ljava/lang/String;
    //   13: invokestatic 103	com/XhookMethod/XhookMethod/packageinfolist:Inttolong	(Ljava/lang/String;)Lcom/XhookMethod/XhookMethod/packageinfolist;
    //   16: putstatic 28	com/soft/tools/accountSim/AccountSimSetActivity:runningserviceinfolist	Lcom/XhookMethod/XhookMethod/packageinfolist;
    //   19: getstatic 28	com/soft/tools/accountSim/AccountSimSetActivity:runningserviceinfolist	Lcom/XhookMethod/XhookMethod/packageinfolist;
    //   22: ifnonnull +13 -> 35
    //   25: new 52	com/XhookMethod/XhookMethod/packageinfolist
    //   28: dup
    //   29: invokespecial 53	com/XhookMethod/XhookMethod/packageinfolist:<init>	()V
    //   32: putstatic 28	com/soft/tools/accountSim/AccountSimSetActivity:runningserviceinfolist	Lcom/XhookMethod/XhookMethod/packageinfolist;
    //   35: new 115	java/lang/StringBuilder
    //   38: dup
    //   39: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   42: getstatic 28	com/soft/tools/accountSim/AccountSimSetActivity:runningserviceinfolist	Lcom/XhookMethod/XhookMethod/packageinfolist;
    //   45: ldc 237
    //   47: invokevirtual 122	com/XhookMethod/XhookMethod/packageinfolist:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   50: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   53: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   56: astore_2
    //   57: new 115	java/lang/StringBuilder
    //   60: dup
    //   61: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   64: getstatic 28	com/soft/tools/accountSim/AccountSimSetActivity:runningserviceinfolist	Lcom/XhookMethod/XhookMethod/packageinfolist;
    //   67: ldc 239
    //   69: invokevirtual 122	com/XhookMethod/XhookMethod/packageinfolist:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   72: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   75: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: astore_3
    //   79: aload_2
    //   80: invokestatic 235	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   83: istore_1
    //   84: iload_1
    //   85: istore_0
    //   86: aload_3
    //   87: invokestatic 235	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   90: istore_1
    //   91: iconst_2
    //   92: anewarray 85	java/lang/String
    //   95: dup
    //   96: iconst_0
    //   97: new 115	java/lang/StringBuilder
    //   100: dup
    //   101: iload_0
    //   102: invokestatic 243	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   105: invokespecial 246	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   108: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: aastore
    //   112: dup
    //   113: iconst_1
    //   114: new 115	java/lang/StringBuilder
    //   117: dup
    //   118: iload_1
    //   119: invokestatic 243	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   122: invokespecial 246	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   125: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   128: aastore
    //   129: areturn
    //   130: astore_2
    //   131: iconst_1
    //   132: istore_1
    //   133: goto -42 -> 91
    //   136: astore_2
    //   137: goto -6 -> 131
    //   140: astore_2
    //   141: goto -122 -> 19
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	101	0	recenttaskinfolist	int
    //   83	50	1	k	int
    //   56	24	2	str1	String
    //   130	1	2	localException1	Exception
    //   136	1	2	localException2	Exception
    //   140	1	2	localException3	Exception
    //   78	9	3	str2	String
    // Exception table:
    //   from	to	target	type
    //   79	84	130	java/lang/Exception
    //   86	91	136	java/lang/Exception
    //   8	19	140	java/lang/Exception
  }
  
  private static b f()
  {
    if (h == null) {}
    try
    {
      h = e.b(PoseHelper008.getFileData("accountSimSetActivity"));
      label17:
      if (h == null) {
        h = new Map();
      }
      b localb = h.e("itemsArray");
      i = localb;
      if (localb == null)
      {
        i = new b();
        h.putkey("itemsArray", i);
      }
      return i;
    }
    catch (Exception localException)
    {
      break label17;
    }
  }
  
  public void onClick(View paramView)
  {
    paramView = this.a.getText().toString();
    String str = this.b.getText().toString();
    label97:
    for (;;)
    {
      try
      {
        j = Integer.parseInt(paramView);
        k = 0;
      }
      catch (Exception paramView)
      {
        try
        {
          k = Integer.parseInt(str);
          if ((j > 0) && (k > 0)) {
            break;
          }
          paramView = new AlertDialog.Builder(this);
          paramView.setTitle("注意");
          paramView.setMessage("输入的信息不合法");
          paramView.setNegativeButton("确定", new f(this));
          paramView.create().show();
          return;
        }
        catch (Exception paramView)
        {
          int j;
          int k;
          break label97;
        }
        paramView = paramView;
        j = 0;
      }
    }
    if (h == null) {}
    try
    {
      h = e.b(PoseHelper008.getFileData("accountSimSetActivity"));
      label119:
      if (h == null) {
        h = new Map();
      }
      h.putkey("packageCount", j);
      h.putkey("packageFloat", k);
      PoseHelper008.saveDataToFile("accountSimSetActivity", h.a());
      Toast.makeText(this, "保存成功", 0).show();
      return;
    }
    catch (Exception paramView)
    {
      break label119;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903079);
    this.a = ((EditText)findViewById(2131362007));
    this.b = ((EditText)findViewById(2131362008));
    this.c = ((Button)findViewById(2131362009));
    this.c.setOnClickListener(this);
    this.e = ((CheckBox)findViewById(2131362010));
    this.g = ((ListView)findViewById(2131362011));
    this.d = ((Button)findViewById(2131362012));
    paramBundle = e();
    this.a.setText(paramBundle[0]);
    this.b.setText(paramBundle[1]);
    if (h == null) {}
    try
    {
      h = e.b(PoseHelper008.getFileData("accountSimSetActivity"));
      label145:
      if (h == null) {
        h = new Map();
      }
      if (a()) {
        this.e.setChecked(true);
      }
      for (;;)
      {
        paramBundle = h.e("itemsArray");
        i = paramBundle;
        if (paramBundle == null)
        {
          i = new b();
          h.putkey("itemsArray", i);
        }
        this.f = new a();
        this.d.setOnClickListener(new c(this));
        this.f = new a();
        this.g.setAdapter(this.f);
        return;
        this.e.setChecked(false);
      }
    }
    catch (Exception paramBundle)
    {
      break label145;
    }
  }
  
  protected void onPause()
  {
    if (this.e.isChecked()) {
      h.putkey("checkBoxAuto", "true");
    }
    for (;;)
    {
      PoseHelper008.saveDataToFile("accountSimSetActivity", h.a());
      super.onDestroy();
      return;
      h.putkey("checkBoxAuto", "false");
    }
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return AccountSimSetActivity.d().size();
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
      if (paramView == null) {
        paramView = new TextView(AccountSimSetActivity.this);
      }
      for (;;)
      {
        TextView localTextView = (TextView)paramView;
        localTextView.setOnClickListener(new g(this, paramInt));
        paramView = AccountSimSetActivity.d().a(paramInt);
        String str = paramView.j("name");
        paramViewGroup = paramView.get("kind");
        if (paramViewGroup.equals("0")) {
          paramView = "email";
        }
        for (;;)
        {
          localTextView.setText("类型名：" + str + " 类型：" + paramView);
          return localTextView;
          if (paramViewGroup.equals("1"))
          {
            paramView = "手机号码";
          }
          else
          {
            paramView = paramViewGroup;
            if (paramViewGroup.equals("2")) {
              paramView = "随机字符串";
            }
          }
        }
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.accountSim.AccountSimSetActivity

 * JD-Core Version:    0.7.0.1

 */