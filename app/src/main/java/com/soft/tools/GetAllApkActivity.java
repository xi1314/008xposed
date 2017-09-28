package com.soft.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GetAllApkActivity
  extends Activity
{
  private static final FileFilter h = new bj();
  List a = new ArrayList();
  String b = "";
  private Button c;
  private Button d;
  private ProgressDialog e;
  private EditText f;
  private View.OnClickListener g = new bg(this);
  
  private void a(File paramFile)
  {
    int j;
    int i;
    try
    {
      paramFile = paramFile.listFiles(h);
      if (paramFile == null) {
        break label77;
      }
      j = paramFile.length;
      i = 0;
    }
    catch (Exception paramFile)
    {
      File localFile;
      Log.e("GetAllApkActivity", paramFile.getStackTrace().toString());
      return;
    }
    localFile = paramFile[i];
    if (localFile.isDirectory()) {
      a(localFile);
    } else {
      this.a.add(localFile);
    }
    while (i >= j)
    {
      label77:
      return;
      i += 1;
    }
  }
  
  private static String b()
  {
    String str1 = null;
    String str2 = Environment.getExternalStorageDirectory().getAbsolutePath();
    Log.d("text", str2);
    String str3 = str2.charAt(str2.length() - 1);
    try
    {
      i = Integer.parseInt(str3);
      i += 1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int i = -1;
      }
    }
    if (i != -1) {
      str1 = str2.substring(0, str2.length() - 1) + i;
    }
    str2 = str1;
    if (!new File(str1).exists()) {
      str2 = "/storage/sdcard1";
    }
    return str2;
  }
  
  public final String a()
  {
    a(new File(Environment.getExternalStorageDirectory().getAbsolutePath()));
    Object localObject = b();
    if ((localObject != null) && (((String)localObject).trim().length() > 0) && (new File((String)localObject).exists())) {
      a(new File((String)localObject));
    }
    this.b = "";
    localObject = this.a.iterator();
    for (;;)
    {
      if (!((Iterator)localObject).hasNext()) {
        return this.b;
      }
      File localFile = (File)((Iterator)localObject).next();
      if (!localFile.getAbsolutePath().contains("system.apk")) {
        this.b = (this.b + localFile.getAbsolutePath() + "\n");
      }
      runOnUiThread(new bk(this));
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903094);
    this.c = ((Button)findViewById(2131362079));
    this.d = ((Button)findViewById(2131362080));
    this.f = ((EditText)findViewById(2131362078));
    this.c.setOnClickListener(this.g);
    this.d.setOnClickListener(this.g);
    this.e = new ProgressDialog(this);
    this.e.setMessage("操作中，请稍后");
    this.e.show();
    this.e.hide();
    this.e.setCancelable(false);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.GetAllApkActivity
 * JD-Core Version:    0.7.0.1
 */