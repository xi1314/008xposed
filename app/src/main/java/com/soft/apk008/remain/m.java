package com.soft.apk008.remain;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Environment;
import android.widget.Toast;
import com.soft.tools.FolderBackUpActivity;
import java.io.File;

final class m
  implements DialogInterface.OnClickListener
{
  m(RecordSelectActivity paramRecordSelectActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new File(Environment.getExternalStorageDirectory(), "kind");
    if (paramDialogInterface.exists())
    {
      paramDialogInterface = paramDialogInterface.listFiles();
      int j = paramDialogInterface.length;
      paramInt = 0;
      if (paramInt < j) {}
    }
    else
    {
      Toast.makeText(this.a, "删除成功", 0).show();
      paramDialogInterface = new ProgressDialog(this.a);
      paramDialogInterface.setMessage("重新读取数据");
      paramDialogInterface.show();
      new n(this, paramDialogInterface).start();
      return;
    }
    String str = paramDialogInterface[paramInt];
    str.delete();
    str = str.getName();
    File[] arrayOfFile = new File(FolderBackUpActivity.d()).listFiles();
    int k;
    int i;
    if ((arrayOfFile != null) && (arrayOfFile.length > 0))
    {
      k = arrayOfFile.length;
      i = 0;
    }
    for (;;)
    {
      if (i >= k)
      {
        paramInt += 1;
        break;
      }
      File localFile = arrayOfFile[i];
      if (localFile.getName().startsWith(str)) {
        localFile.delete();
      }
      i += 1;
    }
  }
}


