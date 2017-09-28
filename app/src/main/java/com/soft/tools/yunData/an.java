package com.soft.tools.yunData;

import android.view.View;

final class an
  implements View.OnClickListener
{
  an(YunDataDownLoadActivity.a parama, String paramString1, String paramString2) {}
  
  public final void onClick(View paramView)
  {
    if (!YunDataDownLoadActivity.e(YunDataDownLoadActivity.a.a(this.a)).containsKey(this.b)) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        YunDataDownLoadActivity.e(YunDataDownLoadActivity.a.a(this.a)).a(this.b, this.b);
      }
      int j;
      for (;;)
      {
        paramView = YunDataDownLoadActivity.h(YunDataDownLoadActivity.a.a(this.a)).e(this.c);
        j = 0;
        if (j < paramView.size()) {
          break;
        }
        YunDataDownLoadActivity.f(YunDataDownLoadActivity.a.a(this.a)).notifyDataSetChanged();
        return;
        YunDataDownLoadActivity.e(YunDataDownLoadActivity.a.a(this.a)).remove(this.b);
      }
      String str = YunDataDownLoadActivity.b(paramView.e(j))[0];
      str = this.c + "=_=" + str;
      if (i != 0) {
        YunDataDownLoadActivity.e(YunDataDownLoadActivity.a.a(this.a)).a(str, str);
      }
      for (;;)
      {
        j += 1;
        break;
        YunDataDownLoadActivity.e(YunDataDownLoadActivity.a.a(this.a)).remove(str);
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.yunData.an

 * JD-Core Version:    0.7.0.1

 */