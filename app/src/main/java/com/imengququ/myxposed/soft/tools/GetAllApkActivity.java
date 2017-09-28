package com.imengququ.myxposed.soft.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GetAllApkActivity
  extends Activity
{
  private static final FileFilter APK_FILTER = new FileFilter()
  {
    public boolean accept(File file)
    {
      return (file.isDirectory()) || (file.getName().contains(".apk"));
    }
  };
  private Button buttonDelete;
  private Button buttonFind;
  private ProgressDialog dialog;
  private EditText edit;
  List<File> fileList = new ArrayList();
  private OnClickListener listener = new OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView.equals(GetAllApkActivity.this.buttonFind))
      {
        GetAllApkActivity.this.dialog.show();
        GetAllApkActivity.this.edit.setText("");
        GetAllApkActivity.this.fileList = new ArrayList();
        new Thread()
        {
          public void run()
          {
            final String str = GetAllApkActivity.this.startFind();
            GetAllApkActivity.this.runOnUiThread(new Runnable()
            {
              public void run()
              {
                GetAllApkActivity.this.dialog.cancel();
                GetAllApkActivity.this.edit.setText(str);
              }
            });
          }
        }.start();
      }
      else if (paramAnonymousView.equals(GetAllApkActivity.this.buttonDelete)) {

      int i =0;
       Iterator iterator = GetAllApkActivity.this.fileList.iterator();
      while (iterator.hasNext())
      {
         File localFile = (File)iterator.next();
        if ((!localFile.getAbsolutePath().contains("system.apk")) && (localFile.delete())) {
          i += 1;
        }
      }
        GetAllApkActivity.this.fileList = new ArrayList();
        GetAllApkActivity.this.edit.setText("");
        Toast.makeText(GetAllApkActivity.this, "删除成功,共删除" + i + "个", 1).show();


    }
    }
  };
  String text = "";
  
  private void fill(File paramFile)
  {
    int j;
    int i;
    try
    {
      paramFile = paramFile.listFiles(APK_FILTER);
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
      fill(localFile);
    } else {
      this.fileList.add(localFile);
    }
    while (i >= j)
    {
      label77:
      return;
      i += 1;
    }
  }
  
  public String getPath2()
  {
    String str1 = null;
    String str2 = Environment.getExternalStorageDirectory().getAbsolutePath();
    Log.d("text", str2);
    String str3 = str2.charAt(str2.length() - 1);
    int i = -1;
    try
    {
      int j = Integer.parseInt(str3);
      i = j + 1;
    }
    catch (Exception localException)
    {
      label57:
      break label57;
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
  
  public String getPath21()
  {
    localObject2 = null;
    String str = null;
    Object localObject4 = Environment.getExternalStorageDirectory().getAbsolutePath();
    Log.d("text", (String)localObject4);
    Object localObject3 = localObject4;
    if (((String)localObject4).endsWith("/")) {
      localObject3 = ((String)localObject4).substring(0, ((String)localObject4).length() - 1);
    }
    for (;;)
    {
      try
      {
        localObject4 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("mount").getInputStream()));
        localObject2 = str;
        localObject5 = ((BufferedReader)localObject4).readLine();
        if (localObject5 != null) {
          continue;
        }
      }
      catch (Exception localException)
      {
        Object localObject5;
        localException.printStackTrace();
        Object localObject1 = localObject2;
        continue;
      }
      Log.d("text", str);
      return str;
      localObject2 = str;
      if (!((String)localObject5).contains("secure"))
      {
        localObject2 = str;
        if (!((String)localObject5).contains("asec"))
        {
          localObject2 = str;
          if (((String)localObject5).contains("fat"))
          {
            localObject2 = str;
            if (((String)localObject5).contains("/mnt/"))
            {
              localObject2 = str;
              localObject5 = ((String)localObject5).split(" ");
              if (localObject5 == null) {
                continue;
              }
              localObject2 = str;
              if (localObject5.length <= 1) {
                continue;
              }
              localObject2 = str;
              if (((String)localObject3).trim().equals(localObject5[1].trim())) {
                continue;
              }
              str = localObject5[1];
              continue;
            }
          }
          localObject2 = str;
          if (((String)localObject5).contains("fuse"))
          {
            localObject2 = str;
            if (((String)localObject5).contains("/mnt/"))
            {
              localObject2 = str;
              localObject5 = ((String)localObject5).split(" ");
              if (localObject5 != null)
              {
                localObject2 = str;
                if (localObject5.length > 1)
                {
                  localObject2 = str;
                  if (!((String)localObject3).trim().equals(localObject5[1].trim())) {
                    str = localObject5[1];
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903073);
    this.buttonFind = ((Button)findViewById(2131230881));
    this.buttonDelete = ((Button)findViewById(2131230882));
    this.edit = ((EditText)findViewById(2131230880));
    this.buttonFind.setOnClickListener(this.listener);
    this.buttonDelete.setOnClickListener(this.listener);
    this.dialog = new ProgressDialog(this);
    this.dialog.setMessage("操作中，请稍后");
    this.dialog.show();
    this.dialog.hide();
    this.dialog.setCancelable(false);
  }
  
  public String startFind()
  {
    fill(new File(Environment.getExternalStorageDirectory().getAbsolutePath()));
    Object localObject = getPath2();
    if ((localObject != null) && (((String)localObject).trim().length() > 0) && (new File((String)localObject).exists())) {
      fill(new File((String)localObject));
    }
    this.text = "";
    localObject = this.fileList.iterator();
    for (;;)
    {
      if (!((Iterator)localObject).hasNext()) {
        return this.text;
      }
      File localFile = (File)((Iterator)localObject).next();
      if (!localFile.getAbsolutePath().contains("system.apk")) {
        this.text = (this.text + localFile.getAbsolutePath() + "\n");
      }
      runOnUiThread(new Runnable()
      {
        public void run()
        {
          GetAllApkActivity.this.edit.setText(GetAllApkActivity.this.text);
        }
      });
    }
  }
}

