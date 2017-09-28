package com.soft.apk008;

import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class k
  implements View.OnTouchListener
{
  k(Apk008Activity paramApk008Activity) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0) {
      Apk008Activity.h(this.a).setImageResource(2130837505);
    }
    while (paramMotionEvent.getAction() != 1) {
      return true;
    }
    Apk008Activity.h(this.a).setImageResource(2130837504);
    PoseHelper008.saveDataToFile("fresh", "true");
    if (Apk008Activity.g(this.a).getText().equals("已经到期"))
    {
      Toast.makeText(this.a, "已经到期，不能修改数据", 0).show();
      return true;
    }
    if (Apk008Activity.e(this.a).getText().toString().indexOf("加载") >= 0)
    {
      Toast.makeText(this.a, "加载中请稍候", 0).show();
      return true;
    }
   String str11 = Apk008Activity.e(this.a).getText().toString().replace("ID:", "");
    try
    {
      Long.parseLong(str11);
     Intent I = new Intent();
      I.setClass(this.a, SetMessageActivity.class);
      this.a.startActivity(I);
      return true;
    }
    catch (Exception E) {}
    return true;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.k

 * JD-Core Version:    0.7.0.1

 */