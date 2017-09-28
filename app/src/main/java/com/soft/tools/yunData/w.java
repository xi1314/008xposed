package com.soft.tools.yunData;

import android.content.DialogInterface;

import com.a.a.Map;

final class w
  implements DialogInterface.OnClickListener
{
  w(v paramv, Map parame) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    YunDataDownLoadActivity.b(this.a.a, this.b);
    YunDataDownLoadActivity.f(this.a.a).notifyDataSetChanged();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.yunData.w

 * JD-Core Version:    0.7.0.1

 */