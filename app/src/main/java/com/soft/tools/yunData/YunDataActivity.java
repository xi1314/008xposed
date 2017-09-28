package com.soft.tools.yunData;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.a.a.Map;
import com.a.a.b;
import com.lishu.c.w;
import com.soft.tools.FolderBackUpActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class YunDataActivity
  extends Activity
  implements w
{
  public static String a = "";
  int b = 0;
  int c = 0;
  private View d;
  private View e;
  private TextView f;
  private TextView g;
  private d h = new d();
  private Map i;
  private String j;
  private EditText k;
  private ProgressDialog l;
  private TextView m;
  private Button n;
  private CheckBox o;
  private View.OnClickListener p = new i(this);
  
  private static HashMap b()
  {
    HashMap localHashMap = new HashMap();
    File[] arrayOfFile = new File(Environment.getExternalStorageDirectory(), "kind").listFiles();
    int i2 = arrayOfFile.length;
    int i1 = 0;
    for (;;)
    {
      if (i1 >= i2) {
        return localHashMap;
      }
      File localFile = arrayOfFile[i1];
      String str = localFile.getName();
      try
      {
        localHashMap.put(str, g.a(localFile));
        i1 += 1;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          localIOException.printStackTrace();
        }
      }
    }
  }
  
  public final void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      runOnUiThread(new j(this));
      return;
    }
    for (;;)
    {
      int i1;
      int i3;
      int i2;
      try
      {
        Object localObject1 = a.c(paramString);
        if (((b)localObject1).size() == 0)
        {
          runOnUiThread(new k(this));
          return;
        }
        paramString = a + "/uploadFile";
        localHashMap = new HashMap();
        localHashMap.put("deviceName", this.j);
        i1 = 0;
        if (i1 >= ((b)localObject1).size())
        {
          i1 = 0;
          if (i1 >= ((b)localObject1).size())
          {
            runOnUiThread(new l(this));
            localObject1 = this.h;
            localObject2 = new m(this);
            ((d)localObject1).a.put(paramString, localObject2);
            localHashMap.put("verCode008new", "9");
            new f((d)localObject1, localHashMap, paramString).start();
          }
        }
        else
        {
          localHashMap.put(((b)localObject1).e(i1), new File(new File(Environment.getExternalStorageDirectory(), "kind"), ((b)localObject1).e(i1)));
          this.b += 1;
          i1 += 1;
          continue;
        }
        localObject2 = ((b)localObject1).e(i1);
        arrayOfFile = new File(FolderBackUpActivity.d()).listFiles();
        if ((arrayOfFile == null) || (arrayOfFile.length <= 0)) {
          break label350;
        }
        i3 = arrayOfFile.length;
        i2 = 0;
      }
      catch (Exception paramString)
      {
        HashMap localHashMap;
        Object localObject2;
        File[] arrayOfFile;
        File localFile;
        return;
      }
      localFile = arrayOfFile[i2];
      if (localFile.getName().startsWith((String)localObject2))
      {
        localHashMap.put(localFile.getName(), new File(FolderBackUpActivity.d(), localFile.getName()));
        this.c += 1;
      }
      i2 += 1;
      if (i2 >= i3) {
        label350:
        i1 += 1;
      }
    }
  }
  
  public final void b(String paramString)
  {
    runOnUiThread(new p(this, paramString));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903128);
    this.d = findViewById(2131362207);
    this.e = findViewById(2131362210);
    this.f = ((TextView)findViewById(2131362204));
    this.g = ((TextView)findViewById(2131362206));
    this.m = ((TextView)findViewById(2131362209));
    this.k = ((EditText)findViewById(2131362203));
    this.n = ((Button)findViewById(2131362211));
    this.o = ((CheckBox)findViewById(2131362212));
    this.e.setOnClickListener(this.p);
    this.d.setOnClickListener(this.p);
    this.n.setOnClickListener(this.p);
    paramBundle = PoseHelper008.getFileData("YunDataActivity");
    if ((paramBundle != null) && (paramBundle.length() > 0)) {}
    try
    {
      this.i = a.b(paramBundle);
      label168:
      if (this.i == null) {
        this.i = new Map();
      }
      a = this.i.getStringfrommap("url");
      this.j = this.i.getStringfrommap("deviceName");
      String str = this.i.getStringfrommap("lastTime");
      if ("true".equals(this.i.getStringfrommap("checkBoxOpenYunBackUp"))) {
        this.o.setChecked(true);
      }
      if ((this.j != null) && (this.j.length() > 0)) {
        this.k.setText(this.j);
      }
      if (a == null) {
        a = "";
      }
      paramBundle = str;
      if (str == null) {
        paramBundle = "";
      }
      this.g.setText(paramBundle);
      this.l = new ProgressDialog(this);
      this.l.setMessage("操作中，请稍后...");
      return;
    }
    catch (Exception paramBundle)
    {
      break label168;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296270, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    this.i.putkey("url", a);
    this.i.putkey("deviceName", this.k.getText().toString());
    this.i.putkey("lastTime", this.g.getText());
    if (this.o.isChecked()) {
      this.i.putkey("checkBoxOpenYunBackUp", "true");
    }
    for (;;)
    {
      PoseHelper008.saveDataToFile("YunDataActivity", this.i.a());
      super.onDestroy();
      return;
      this.i.putkey("checkBoxOpenYunBackUp", "false");
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362279)
    {
      paramMenuItem = new AlertDialog.Builder(this);
      paramMenuItem.setTitle("请设置服务器地址");
      EditText localEditText = new EditText(this);
      paramMenuItem.setView(localEditText);
      localEditText.setText(a);
      paramMenuItem.setPositiveButton("确定", new q(this, localEditText));
      paramMenuItem.create().show();
    }
    for (;;)
    {
      return true;
      if (paramMenuItem.getItemId() == 2131362280)
      {
        paramMenuItem = new AlertDialog.Builder(this);
        paramMenuItem.setTitle("注意");
        paramMenuItem.setMessage("是否删除本机所有分类");
        paramMenuItem.setPositiveButton("确定", new r(this));
        paramMenuItem.create().show();
      }
    }
  }
  
  protected void onResume()
  {
    File localFile = new File(Environment.getExternalStorageDirectory(), "kind");
    int i1 = 0;
    if (localFile.listFiles() != null) {
      i1 = localFile.listFiles().length;
    }
    this.f.setText("当前设备共有" + i1 + "个分类");
    super.onResume();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.yunData.YunDataActivity

 * JD-Core Version:    0.7.0.1

 */