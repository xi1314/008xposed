package com.soft.tools.yunData;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Environment;
import android.widget.TextView;
import android.widget.Toast;
import com.lishu.b.a.a;
import java.io.File;

final class r
  implements DialogInterface.OnClickListener
{
  r(YunDataActivity paramYunDataActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new File(Environment.getExternalStorageDirectory(), "kind");
    int i;
    if (paramDialogInterface.exists())
    {
      paramDialogInterface = paramDialogInterface.listFiles();
      i = paramDialogInterface.length;
      paramInt = 0;
    }
    for (;;)
    {
      if (paramInt >= i)
      {
        Toast.makeText(this.a, "删除成功", 0).show();
        YunDataActivity.j(this.a).setText("当前设备共有0个分类");
        a.a();
        return;
      }
      paramDialogInterface[paramInt].delete();
      paramInt += 1;
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.yunData.r
 * JD-Core Version:    0.7.0.1
 */