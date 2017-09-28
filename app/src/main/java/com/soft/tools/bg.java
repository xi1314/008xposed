package com.soft.tools;

import android.app.ProgressDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class bg
  implements View.OnClickListener
{
  bg(GetAllApkActivity paramGetAllApkActivity) {}
  
  public final void onClick(View paramView)
  {
    if (paramView.equals(GetAllApkActivity.a(this.a)))
    {
      GetAllApkActivity.b(this.a).show();
      GetAllApkActivity.c(this.a).setText("");
      this.a.a = new ArrayList();
      new bh(this).start();
    }
    while (!paramView.equals(GetAllApkActivity.d(this.a))) {
      return;
    }
    paramView = this.a.a.iterator();
    int i = 0;
    for (;;)
    {
      if (!paramView.hasNext())
      {
        this.a.a = new ArrayList();
        GetAllApkActivity.c(this.a).setText("");
        Toast.makeText(this.a, "删除成功,共删除" + i + "个", 1).show();
        return;
      }
      File localFile = (File)paramView.next();
      if ((!localFile.getAbsolutePath().contains("system.apk")) && (localFile.delete())) {
        i += 1;
      }
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.bg
 * JD-Core Version:    0.7.0.1
 */