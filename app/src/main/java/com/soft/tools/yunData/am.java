package com.soft.tools.yunData;

import android.view.View;

final class am
  implements View.OnClickListener
{
  am(YunDataDownLoadActivity.a parama, String paramString) {}
  
  public final void onClick(View paramView)
  {
    int i = 0;
    if (!YunDataDownLoadActivity.e(YunDataDownLoadActivity.a.a(this.a)).containsKey(this.b)) {
      i = 1;
    }
    if (i != 0)
    {
      YunDataDownLoadActivity.e(YunDataDownLoadActivity.a.a(this.a)).a(this.b, this.b);
      return;
    }
    YunDataDownLoadActivity.e(YunDataDownLoadActivity.a.a(this.a)).remove(this.b);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.yunData.am

 * JD-Core Version:    0.7.0.1

 */