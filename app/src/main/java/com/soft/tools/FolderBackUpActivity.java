package com.soft.tools;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.a.a.b;
import com.a.a.Map;
import com.soft.apk008.StartActivity;
import com.soft.apk008.WebMessageActivity;
import com.soft.apk008.cu;
import com.utils.folderChoose.FSExplorer;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;

public class FolderBackUpActivity
  extends Activity
  implements View.OnClickListener
{
  public static String a = "busybox";
  public static String b = "";
  private static b e = null;
  private static Map f = null;
  private static String n = b + File.separator + "008FolderBackUp";
  private static String o = n + File.separator + "temp";
  private View c;
  private View d;
  private ListView g;
  private a h;
  private CheckBox i;
  private Button j;
  private Button k;
  private Button l;
  private AlertDialog m;
  
  private static int a(File paramFile)
  {
    int i2 = 2;
    int i1;
    if (!paramFile.exists()) {
      i1 = 1;
    }
    File[] arrayOfFile;
    do
    {
      do
      {
        do
        {
          return i1;
          i1 = i2;
        } while (!paramFile.canWrite());
        if (!paramFile.isFile()) {
          break;
        }
        i1 = i2;
      } while (!paramFile.delete());
      return 0;
      arrayOfFile = paramFile.listFiles();
      if ((arrayOfFile == null) || (arrayOfFile.length == 0))
      {
        paramFile.delete();
        return 0;
      }
      int i3 = arrayOfFile.length;
      i1 = 0;
      if (i1 < i3) {
        break;
      }
      i1 = i2;
    } while (!paramFile.delete());
    return 0;
    File localFile = arrayOfFile[i1];
    if (localFile.isDirectory()) {
      a(localFile);
    }
    for (;;)
    {
      i1 += 1;
      break;
      localFile.delete();
    }
  }
  
  public static void a()
  {
    b = Environment.getExternalStorageDirectory().getAbsolutePath();
    String str = h.a("ls " + b, true);
    if ((str.indexOf("No such") >= 0) || (str.trim().length() == 0))
    {
      b = "/sdcard";
      n = b + File.separator + "008FolderBackUp";
      o = n + File.separator + "temp";
    }
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
  
  public static void a(String paramString1, String paramString2)
  {
    if (!f()) {}
    while (paramString2.length() == 0) {
      return;
    }
    if (b.length() == 0) {
      a();
    }
    n = b + File.separator + "008FolderBackUp";
    o = n + File.separator + "temp";
    a(new File(o));
    new File(o).mkdirs();
    Object localObject;
    if (e == null)
    {
      localObject = PoseHelper008.getFileData("FolderBackUpActivity");
      if ((localObject == null) || (((String)localObject).length() <= 0)) {}
    }
    try
    {
      e = a.c((String)localObject);
      label144:
      if (e == null) {
        e = new b();
      }
      localObject = new Map();
      int i1 = 0;
      for (;;)
      {
        if (i1 >= e.size())
        {
          PoseHelper008.saveDataToFile("008FolderBackUp/temp", "peizhi", ((Map)localObject).a());
          localObject = n + File.separator + paramString1 + "_" + paramString2 + ".tar";
          if (new File((String)localObject).exists()) {
            new File((String)localObject).delete();
          }
          paramString1 = h.a(new StringBuilder("cd ").append(n).append("\n").toString() + a + " tar -cvf " + paramString1 + "_" + paramString2 + ".tar temp", true);
          System.out.println(paramString1);
          return;
        }
        String str1 = e.e(i1);
        if (new File(str1).exists())
        {
          String str2 = new File(str1).getName() + cu.a.nextInt(10000);
          ((Map)localObject).putkey(str1, str2);
          ((Map)localObject).putkey(str2, str1);
          a(str1, o, str2);
        }
        i1 += 1;
      }
    }
    catch (Exception localException)
    {
      break label144;
    }
  }
  
  private static void a(String paramString1, String paramString2, String paramString3)
  {
    new File(paramString1);
    String str = paramString2;
    if (paramString3.trim().length() > 0) {
      str = paramString2 + File.separator + paramString3;
    }
    h.a(a + " cp -r " + paramString1 + "  " + str, true);
  }
  
  public static void b(String paramString1, String paramString2)
  {
    if (!f()) {}
    for (;;)
    {
      return;
      if (b.length() == 0) {
        a();
      }
      n = b + File.separator + "008FolderBackUp";
      o = n + File.separator + "temp";
      Object localObject;
      if (e == null)
      {
        localObject = PoseHelper008.getFileData("FolderBackUpActivity");
        if ((localObject == null) || (((String)localObject).length() <= 0)) {}
      }
      try
      {
        e = a.c((String)localObject);
        if (e == null) {
          e = new b();
        }
        a(new File(o));
        new File(o).mkdirs();
        if (!new File(n + File.separator + paramString1 + "_" + paramString2 + ".tar").exists()) {
          continue;
        }
        h.a(new StringBuilder("cd ").append(n).append("\n").toString() + a + " tar -xvf " + paramString1 + "_" + paramString2 + ".tar", true);
        paramString1 = PoseHelper008.getFileData("008FolderBackUp/temp", "peizhi");
        try
        {
          paramString1 = e.getmap(paramString1);
          if (paramString1 != null) {
            break label677;
          }
        }
        catch (Exception paramString1)
        {
          for (;;)
          {
            label316:
            String str1;
            int i4;
            int i1;
            File localFile;
            String str2;
            int i2;
            paramString1 = null;
          }
        }
        try
        {
          paramString2 = new Map();
          paramString1 = paramString2;
        }
        catch (Exception paramString2)
        {
          break label316;
        }
        localObject = new File(o).listFiles();
        if (localObject == null) {
          continue;
        }
        str1 = h.a("cat /data/system/packages.list", true);
        i4 = localObject.length;
        i1 = 0;
        if (i1 >= i4) {
          continue;
        }
        localFile = localObject[i1];
        str2 = paramString1.j(localFile.getName());
        if (str2 != null)
        {
          if (new File(str2).exists()) {
            h.a("rm  -r " + str2, true);
          }
          a(localFile.getAbsolutePath(), str2, "");
          i2 = str2.indexOf("//data/data/");
          if (i2 != -1) {
            break label655;
          }
          i2 = str2.indexOf("/data/data/");
        }
        label655:
        for (paramString2 = "/data/data/";; paramString2 = "//data/data/")
        {
          if (i2 >= 0)
          {
            int i3 = str2.indexOf("/", paramString2.length() + 2);
            i2 = i3;
            if (i3 == -1) {
              i2 = str2.length();
            }
            paramString2 = str2.substring(paramString2.length() + 1, i2);
            i2 = str1.indexOf(paramString2);
            if (i2 >= 0)
            {
              i3 = str1.indexOf(" ", paramString2.length() + i2 + 1);
              paramString2 = str1.substring(paramString2.length() + i2 + 1, i3).trim();
              paramString2 = h.a("chmod -R 777 " + str2 + "\n" + a + " chown -R " + paramString2 + ":" + paramString2 + "  " + str2, true);
              System.out.println("result" + paramString2);
            }
          }
          else
          {
            a(localFile);
          }
          i1 += 1;
          break;
        }
      }
      catch (Exception localException)
      {
        label677:
        for (;;) {}
      }
    }
  }
  
  public static String d()
  {
    if (b.length() == 0) {
      a();
    }
    n = b + File.separator + "008FolderBackUp";
    o = n + File.separator + "temp";
    return n;
  }
  
  private static boolean f()
  {
    String str = PoseHelper008.getFileData("FolderBackUpActivity_check");
    if ((str != null) && (str.length() > 0)) {}
    try
    {
      f = a.b(str);
      label25:
      if (f == null) {
        f = new Map();
      }
      return "true".equals(f.get("checkBox_open"));
    }
    catch (Exception localException)
    {
      break label25;
    }
  }
  
  public final void b()
  {
    try
    {
      String str = b + File.separator + a;
      Object localObject = new File(str);
      if (!((File)localObject).exists()) {
        ((File)localObject).createNewFile();
      }
      InputStream localInputStream = getAssets().open("busybox-arm.png");
      localObject = new FileOutputStream((File)localObject);
      byte[] arrayOfByte = new byte[8192];
      for (;;)
      {
        int i1 = localInputStream.read(arrayOfByte);
        if (i1 <= 0)
        {
          ((FileOutputStream)localObject).close();
          localInputStream.close();
          h.a("mount -o remount rw /system");
          h.a("cp " + str + " /system/xbin/" + a);
          h.a("chmod 777 /system/xbin/" + a);
          h.a("mount -o remount,ro /system");
          return;
        }
        ((FileOutputStream)localObject).write(arrayOfByte, 0, i1);
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public final void c()
  {
    PoseHelper008.saveDataToFile("FolderBackUpActivity", e.a());
    if (this.i.isChecked()) {
      f.putkey("checkBox_open", "true");
    }
    for (;;)
    {
      PoseHelper008.saveDataToFile("FolderBackUpActivity_check", f.a());
      return;
      f.putkey("checkBox_open", "false");
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    paramIntent = FSExplorer.e.entrySet().iterator();
    if (!paramIntent.hasNext())
    {
      c();
      this.h.notifyDataSetChanged();
      return;
    }
    String str = (String)((Map.Entry)paramIntent.next()).getKey();
    paramInt1 = 0;
    for (;;)
    {
      if (paramInt1 >= e.size()) {}
      for (paramInt1 = 0;; paramInt1 = 1)
      {
        if (paramInt1 != 0) {
          break label100;
        }
        e.add(str);
        break;
        if (!e.e(paramInt1).equals(str)) {
          break label102;
        }
      }
      label100:
      break;
      label102:
      paramInt1 += 1;
    }
  }
  
  public void onClick(View paramView)
  {
    if (paramView.equals(this.c))
    {
      paramView = new AlertDialog.Builder(this);
      paramView.setTitle("提示");
      paramView.setMessage("是否清空列表");
      paramView.setPositiveButton("确定", new at(this));
      paramView.setNegativeButton("取消", new au(this));
      paramView.create().show();
    }
    while (!paramView.equals(this.d)) {
      return;
    }
    paramView = new Intent();
    paramView.putExtra("su", true);
    paramView.setClass(this, FSExplorer.class);
    startActivityForResult(paramView, 0);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903092);
    if (!new File(o).exists()) {
      new File(o).mkdirs();
    }
    this.i = ((CheckBox)findViewById(2131362069));
    this.c = findViewById(2131362070);
    this.d = findViewById(2131362071);
    this.c.setOnClickListener(this);
    this.d.setOnClickListener(this);
    this.g = ((ListView)findViewById(2131362068));
    this.j = ((Button)findViewById(2131362072));
    this.k = ((Button)findViewById(2131362073));
    this.l = ((Button)findViewById(2131362074));
    this.j.setVisibility(8);
    this.k.setVisibility(8);
    this.j.setOnClickListener(new aj(this));
    this.k.setOnClickListener(new an(this));
    this.l.setOnClickListener(new ao(this));
    paramBundle = PoseHelper008.getFileData("FolderBackUpActivity");
    if ((paramBundle != null) && (paramBundle.length() > 0)) {}
    try
    {
      e = a.c(paramBundle);
      label237:
      if (e == null) {
        e = new b();
      }
      paramBundle = PoseHelper008.getFileData("FolderBackUpActivity_check");
      if ((paramBundle != null) && (paramBundle.length() > 0)) {}
      try
      {
        f = a.b(paramBundle);
        label278:
        if (f == null) {
          f = new Map();
        }
        if (b == null) {
          b = "";
        }
        new aq(this).start();
        this.h = new a();
        this.g.setAdapter(this.h);
        this.g.setOnItemLongClickListener(new ap(this));
        if ("true".equals(f.getStringfrommap("checkBox_open")))
        {
          this.i.setChecked(true);
          return;
        }
        this.i.setChecked(false);
        return;
      }
      catch (Exception paramBundle)
      {
        break label278;
      }
    }
    catch (Exception paramBundle)
    {
      break label237;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296266, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    c();
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362295)
    {
      paramMenuItem = new Intent();
      paramMenuItem.setClass(this, WebMessageActivity.class);
      paramMenuItem.putExtra("url", StartActivity.b + "/phone/ContentAction.action?action=FolderbackUpHelp");
      startActivity(paramMenuItem);
    }
    while (paramMenuItem.getItemId() != 2131362294) {
      return true;
    }
    paramMenuItem = new AlertDialog.Builder(this);
    paramMenuItem.setTitle("直接输入路径");
    EditText localEditText = new EditText(this);
    paramMenuItem.setView(localEditText);
    paramMenuItem.setNegativeButton("插入/data/data/", new ak(this, localEditText));
    paramMenuItem.setPositiveButton("确定", new al(this, localEditText));
    paramMenuItem.setNeutralButton("取消", new am(this));
    this.m = paramMenuItem.create();
    this.m.show();
    try
    {
      paramMenuItem = this.m.getClass().getSuperclass().getDeclaredField("mShowing");
      paramMenuItem.setAccessible(true);
      paramMenuItem.set(this.m, Boolean.valueOf(false));
      return true;
    }
    catch (Exception paramMenuItem)
    {
      paramMenuItem.printStackTrace();
    }
    return true;
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return FolderBackUpActivity.e().size();
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
        paramView = new TextView(FolderBackUpActivity.this);
      }
      for (;;)
      {
        ((TextView)paramView).setText(FolderBackUpActivity.e().e(paramInt));
        return paramView;
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.FolderBackUpActivity

 * JD-Core Version:    0.7.0.1

 */