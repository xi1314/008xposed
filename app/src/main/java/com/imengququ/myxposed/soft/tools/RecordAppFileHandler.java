package com.imengququ.myxposed.soft.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import com.soft.toos.findApp.QuickFindActivity;
import de.robv.android.xposed.mods.tutorial.MyLog;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.io.File;

public class RecordAppFileHandler
  extends Activity
{
  private EditText appEdit;
  private Button buttonClear;
  private Button buttonDelete;
  private Button buttonSet;
  private CheckBox checkBox;
  ProgressDialog dialog;
  private EditText editLog;
  OnClickListener listener = new OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView.equals(RecordAppFileHandler.this.buttonSet))
      {
        Intent i = new Intent();
       i .setClass(RecordAppFileHandler.this, QuickFindActivity.class);
        RecordAppFileHandler.this.startActivityForResult(i, 1);
      }
      do
      {
        return;
        if (paramAnonymousView.equals(RecordAppFileHandler.this.buttonClear))
        {
          RecordAppFileHandler.this.clear();
          return;
        }
      } while (!paramAnonymousView.equals(RecordAppFileHandler.this.buttonDelete));
      RecordAppFileHandler.this.delete();
    }
  };
  
  public static void deleteData(Context paramContext, String paramString)
  {
    if ((PoseHelper008.valueMap == null) || (PoseHelper008.valueMap.size() == 0)) {}
    do
    {
      do
      {
        return;
        paramString = PoseHelper008.valueMap.get("file_hook_package");
      } while (paramString.trim().length() <= 0);
      paramString = paramString.split("_");
    } while (paramString.length != 2);
    paramString = MyLog.getLogContentNoDes(paramString[1]).split("\n");
    j = 0;
    int m = paramString.length;
    int i = 0;
    for (;;)
    {
      if (i >= m)
      {
        Toast.makeText(paramContext, "清除成功,共清除" + j + "个文件", 0).show();
        return;
      }
      File localFile = new File(paramString[i].trim());
      k = j;
      if (localFile.exists())
      {
        k = j;
        if (!localFile.isFile()) {}
      }
      try
      {
        localFile.delete();
        k = j + 1;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          k = j;
        }
      }
      i += 1;
      j = k;
    }
  }
  
  public void clear()
  {
    String str = this.appEdit.getText().toString();
    if (str.trim().length() > 0)
    {
      str = str.split("_")[1];
      MyLog.clearLog(str);
      str = MyLog.getLogContentNoDes(str);
      this.editLog.setText(str);
      Toast.makeText(this, "清除成功", 0).show();
    }
  }
  
  public void delete()
  {
    Object localObject = this.appEdit.getText().toString();
    int m;
    int i;
    if (((String)localObject).trim().length() > 0)
    {
      localObject = MyLog.getLogContentNoDes(localObject.split("_")[1]).split("\n");
      j = 0;
      m = localObject.length;
      i = 0;
    }
    for (;;)
    {
      if (i >= m)
      {
        Toast.makeText(this, "清除成功,共清除" + j + "个文件", 0).show();
        return;
      }
      File localFile = new File(localObject[i].trim());
      k = j;
      if (localFile.exists())
      {
        k = j;
        if (!localFile.isFile()) {}
      }
      try
      {
        localFile.delete();
        k = j + 1;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          k = j;
        }
      }
      i += 1;
      j = k;
    }
  }
  
  public void loadLog()
  {
    this.appEdit.setText(PoseHelper008.valueMap.get("file_hook_package"));
    Object localObject = this.appEdit.getText().toString();
    if (((String)localObject).trim().length() > 0)
    {
      localObject = ((String)localObject).split("_");
      if (localObject.length == 2) {
        new Thread()
        {
          public void run()
          {
            final String str = MyLog.getLogContentNoDes(this.val$packageName);
            RecordAppFileHandler.this.runOnUiThread(new Runnable()
            {
              public void run()
              {
                RecordAppFileHandler.this.editLog.setText(str);
                RecordAppFileHandler.this.dialog.hide();
              }
            });
          }
        }.start();
      }
    }
    for (;;)
    {
      if (PoseHelper008.valueMap.get("file_hook_package_open").equals("true")) {
        this.checkBox.setChecked(true);
      }
      return;
      this.dialog.hide();
      continue;
      this.dialog.hide();
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 != 1) || (paramIntent == null)) {
      return;
    }
    paramIntent = paramIntent.getStringExtra("packageName");
    PoseHelper008.valueMap.put("file_hook_package", paramIntent);
    this.appEdit.setText(paramIntent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903080);
    this.appEdit = ((EditText)findViewById(2131230914));
    this.buttonSet = ((Button)findViewById(2131230915));
    this.editLog = ((EditText)findViewById(2131230916));
    this.buttonClear = ((Button)findViewById(2131230917));
    this.buttonDelete = ((Button)findViewById(2131230918));
    this.checkBox = ((CheckBox)findViewById(2131230919));
    this.buttonSet.setOnClickListener(this.listener);
    this.buttonClear.setOnClickListener(this.listener);
    this.buttonDelete.setOnClickListener(this.listener);
    this.dialog = new ProgressDialog(this);
    this.dialog.setCancelable(false);
    this.dialog.setMessage("文件读取中，请稍候");
    this.dialog.show();
    PoseHelper008.initData(this);
    loadLog();
  }
  
  protected void onDestroy()
  {
    if (this.checkBox.isChecked()) {
      PoseHelper008.valueMap.put("file_hook_package_open", "true");
    }
    for (;;)
    {
      PoseHelper008.saveData();
      super.onDestroy();
      return;
      PoseHelper008.valueMap.put("file_hook_package_open", "false");
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     RecordAppFileHandler

 * JD-Core Version:    0.7.0.1

 */