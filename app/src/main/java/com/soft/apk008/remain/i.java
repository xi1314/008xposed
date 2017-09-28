package com.soft.apk008.remain;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

final class i
  implements DialogInterface.OnClickListener
{
  i(h paramh, int paramInt) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = (HashMap)RecordSelectActivity.a(h.a(this.a)).get(this.b);
    paramDialogInterface = new File(new File(Environment.getExternalStorageDirectory(), "kind"), (String)paramDialogInterface.get("name"));
    if (paramDialogInterface.exists())
    {
      ProgressDialog localProgressDialog = new ProgressDialog(h.a(this.a));
      localProgressDialog.setMessage("正在刷新数据");
      localProgressDialog.show();
      new j(this, paramDialogInterface, localProgressDialog).start();
    }
  }
}

