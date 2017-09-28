package com.soft.tools;

import android.view.View;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class cg
  implements View.OnClickListener
{
  cg(MyWifiNameActivity paramMyWifiNameActivity) {}
  
  public final void onClick(View paramView)
  {
    if (paramView.equals(MyWifiNameActivity.a(this.a))) {
      this.a.a();
    }
    while (!paramView.equals(MyWifiNameActivity.b(this.a))) {
      return;
    }
    MyWifiNameActivity.a.putkey("index", "0");
    PoseHelper008.saveDataToFile(".MyWifiNameActivity", MyWifiNameActivity.a.a());
    this.a.a();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.cg

 * JD-Core Version:    0.7.0.1

 */