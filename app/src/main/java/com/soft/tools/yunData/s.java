package com.soft.tools.yunData;

import android.view.View;

final class s
  implements View.OnClickListener
{
  s(YunDataDownLoadActivity paramYunDataDownLoadActivity) {}
  
  public final void onClick(View paramView)
  {
    if (paramView.equals(YunDataDownLoadActivity.a(this.a))) {
      this.a.b();
    }
    do
    {
      return;
      if (paramView.equals(YunDataDownLoadActivity.b(this.a)))
      {
        this.a.d();
        return;
      }
      if (paramView.equals(YunDataDownLoadActivity.c(this.a)))
      {
        this.a.c();
        return;
      }
    } while (!paramView.equals(YunDataDownLoadActivity.d(this.a)));
    YunDataDownLoadActivity.e(this.a).clear();
    YunDataDownLoadActivity.f(this.a).notifyDataSetChanged();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.yunData.s

 * JD-Core Version:    0.7.0.1

 */