package com.soft.apk008;

import android.app.ProgressDialog;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

final class bb
  implements View.OnClickListener
{
  bb(SetDataActivity paramSetDataActivity) {}
  
  public final void onClick(View paramView)
  {
    if (paramView.equals(SetDataActivity.a(this.a)))
    {
      paramView = new Intent();
      paramView.setClass(this.a, HistoryActivity.class);
      this.a.startActivityForResult(paramView, 1);
    }
    do
    {
      return;
      if (paramView.equals(SetDataActivity.b(this.a)))
      {
        SetDataActivity.c(this.a);
        return;
      }
      if (paramView.equals(SetDataActivity.d(this.a)))
      {
        SetDataActivity.e(this.a);
        this.a.c();
        return;
      }
      if (paramView.equals(SetDataActivity.f(this.a)))
      {
        SetDataActivity.g(this.a).show();
        SetDataActivity.g(this.a).show();
        new bc(this).start();
        return;
      }
      if (paramView.equals(SetDataActivity.h(this.a))) {
        try
        {
          paramView = new Intent("android.intent.action.getMap");
          paramView.putExtra("android.intent.extra.EMAIL", "hello haozi");
          this.a.startActivityForResult(paramView, 3);
          return;
        }
        catch (Exception paramView)
        {
          Toast.makeText(this.a, LoadActivity.b(this.a) + "工具箱未安装", 0).show();
          InstallActivity.a(this.a, "Apk008Tool.apk");
          return;
        }
      }
    } while (!paramView.equals(SetDataActivity.i(this.a)));
    try
    {
      paramView = new Intent("android.intent.action.getJiZhan");
      this.a.startActivityForResult(paramView, 4);
      return;
    }
    catch (Exception paramView)
    {
      Toast.makeText(this.a, LoadActivity.b(this.a) + "工具箱未安装", 0).show();
      InstallActivity.a(this.a, "Apk008Tool.apk");
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.bb
 * JD-Core Version:    0.7.0.1
 */