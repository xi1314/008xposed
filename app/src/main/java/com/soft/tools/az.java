package com.soft.tools;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Log;
import com.lishu.c.a;

final class az
  implements DialogInterface.OnClickListener
{
  az(FolderBackUpListActivity paramFolderBackUpListActivity, String paramString) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Object localObject = this.b.substring(0, this.b.length() - 4).split("_");
    if (localObject.length != 2)
    {
      a.c(this.a, "数据格式不正确");
      return;
    }
    paramDialogInterface = localObject[0];
    localObject = localObject[1];
    Log.e("restore", "restore " + paramDialogInterface + "  " + (String)localObject);
    FolderBackUpListActivity.h(this.a).show();
    new ba(this, paramDialogInterface, (String)localObject).start();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.az
 * JD-Core Version:    0.7.0.1
 */