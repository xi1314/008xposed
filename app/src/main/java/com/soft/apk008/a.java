package com.soft.apk008;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.soft.tools.ToolMainActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import de.robv.android.xposed.mods.tutorial.f;

final class a
  implements View.OnClickListener
{
  a(Apk008Activity paramApk008Activity) {}
  
  public final void onClick(View paramView)
  {
    if (Apk008Activity.a(this.a).equals(paramView))
    {
     Intent I = new Intent();
      I.setClass(this.a, BuyActivity.class);
      this.a.startActivity(paramView);
    }


    do
    {
      return;
      if (Apk008Activity.b(this.a).equals(paramView))
      {
       Intent I = new Intent();
        I.setClass(this.a, FreeActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (Apk008Activity.c(this.a).equals(paramView))
      {
      Intent I = new Intent();
       I.setClass(this.a, HelpActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (Apk008Activity.d(this.a).equals(paramView))
      {
        Intent intent = new Intent();
        intent.setClass(this.a, SystemMessageActivity.class);
        this.a.startActivity(paramView);
        return;
      }

      if (Apk008Activity.e(this.a).equals(paramView))
      {
        f.a("com", "test");
        if (PoseHelper008.check.savecheckerror())
        {
          Toast.makeText(this.a, "当前可使用", 0).show();
          return;
        }
        Toast.makeText(this.a, "当前不可使用", 0).show();
        return;
      }


    } while (!Apk008Activity.f(this.a).equals(paramView));


    PoseHelper008.saveDataToFile("fresh", "true");
    if (Apk008Activity.g(this.a).getText().equals("已经到期"))
    {
      Toast.makeText(this.a, "已经到期，不能修改数据", 0).show();
      return;
    }
    if (Apk008Activity.e(this.a).getText().toString().indexOf("加载") >= 0)
    {
      Toast.makeText(this.a, "加载中请稍候", 0).show();
      return;
    }
    paramView = Apk008Activity.e(this.a).getText().toString().replace("ID:", "");
    try
    {
      Long.parseLong(paramView);
      paramView = new Intent();
      paramView.setClass(this.a, ToolMainActivity.class);
      this.a.startActivity(paramView);
      return;
    }
    catch (Exception paramView) {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.XhookMethod

 * JD-Core Version:    0.7.0.1

 */