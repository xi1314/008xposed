package com.soft.tools;

import android.app.AlertDialog;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class d
  implements View.OnClickListener
{
  d(BackupFileActivity paramBackupFileActivity) {}
  
  public final void onClick(View paramView)
  {
    int i = 0;
    if (paramView.equals(BackupFileActivity.a(this.a)))
    {
      paramView = new Intent();
      paramView.setClass(this.a, BackUp_SelectMoreAppActivity.class);
      this.a.startActivityForResult(paramView, 1);
    }
    do
    {
      return;
      if (paramView.equals(BackupFileActivity.b(this.a)))
      {
        paramView = BackupFileActivity.c(this.a).getText().toString().split(",");
        if ((paramView == null) || (paramView.length == 0))
        {
          Toast.makeText(this.a, "还未选择应用", 0).show();
          return;
        }
        if (BackupFileSettingsActivity.a("oneImei").equals("true")) {
          BackupFileActivity.a(PoseHelper008.valueMap.getStringfrommap("getDeviceId"));
        }
        BackupFileActivity.d(this.a).show();
        new e(this, paramView).start();
        return;
      }
      if (paramView.equals(BackupFileActivity.f(this.a)))
      {
        paramView = new AlertDialog.Builder(this.a);
        paramView.setTitle("注意");
        paramView.setMessage("确定删除？删除后无法还原！");
        paramView.setNegativeButton("确定", new g(this));
        paramView.setPositiveButton("取消", new h(this));
        paramView.create().show();
        return;
      }
    } while (!paramView.equals(BackupFileActivity.i(this.a)));
    if (i >= BackupFileActivity.h(this.a).size())
    {
      BackupFileActivity.e(this.a).notifyDataSetChanged();
      return;
    }
    if (BackupFileActivity.g(this.a).get(i) == null) {
      BackupFileActivity.g(this.a).put(i, i);
    }
    for (;;)
    {
      i += 1;
      break;
      BackupFileActivity.g(this.a).remove(i);
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.getMap

 * JD-Core Version:    0.7.0.1

 */