package com.soft.apk008;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.soft.tools.BackupFileActivity;
import com.soft.tools.FolderBackUpActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class br
  implements View.OnClickListener
{
  br(SetMessageActivity paramSetMessageActivity) {}
  
  public final void onClick(View paramView)
  {
    if (paramView.equals(SetMessageActivity.a(this.a)))
    {
      paramView = new Intent();
      paramView.setClass(this.a, HistoryActivity.class);
      this.a.startActivityForResult(paramView, 1);
    }
    do
    {
      return;
      if (paramView.equals(SetMessageActivity.b(this.a)))
      {
        SetMessageActivity.c(this.a);
        return;
      }
      if (paramView.equals(SetMessageActivity.d(this.a)))
      {
        SetMessageActivity.e(this.a);
        this.a.c();
        return;
      }
      if (paramView.equals(SetMessageActivity.f(this.a)))
      {
        paramView = HistoryActivity.b();
        SetMessageActivity localSetMessageActivity = this.a;
        FolderBackUpActivity.a(paramView, PoseHelper008.valueMap.getStringfrommap("getDeviceId"));
        paramView = this.a;
        PoseHelper008.valueMap.getStringfrommap("getDeviceId");
        BackupFileActivity.b();
        this.a.a(true);
        return;
      }
      if (paramView.equals(SetMessageActivity.g(this.a)))
      {
        SetMessageActivity.h(this.a).show();
        new bs(this).start();
        return;
      }
      if (paramView.equals(SetMessageActivity.i(this.a))) {
        try
        {
          paramView = new Intent("android.intent.action.getMap");
          paramView.putExtra("android.intent.extra.EMAIL", "hello haozi");
          this.a.startActivityForResult(paramView, 3);
          return;
        }
        catch (Exception paramView)
        {
          Toast.makeText(this.a, LoadActivity.b(this.a) + "工具箱未安装,或者为旧版本，请更新后使用", 0).show();
          InstallActivity.a(this.a, "Apk008Tool.apk");
          return;
        }
      }
    } while (!paramView.equals(SetMessageActivity.j(this.a)));
    try
    {
      paramView = new Intent("android.intent.action.getJiZhanNew");
      this.a.startActivityForResult(paramView, 7);
      return;
    }
    catch (Exception paramView)
    {
      Toast.makeText(this.a, LoadActivity.b(this.a) + "工具箱未安装,或者为旧版本，请更新后使用", 0).show();
      InstallActivity.a(this.a, "Apk008Tool.apk");
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.br

 * JD-Core Version:    0.7.0.1

 */