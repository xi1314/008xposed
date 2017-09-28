package com.soft.tools;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

final class r
  implements View.OnClickListener
{
  r(BackupFileSettingsActivity paramBackupFileSettingsActivity) {}
  
  public final void onClick(View paramView)
  {
    BackupFileSettingsActivity.a(this.a);
    Toast.makeText(this.a, "安装成功", 0).show();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.r
 * JD-Core Version:    0.7.0.1
 */