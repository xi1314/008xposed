package com.soft.apk008;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;

final class am
  implements View.OnClickListener
{
  am(HistoryActivity paramHistoryActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = (String)paramView.getTag();
    if ((paramView != null) && (paramView.length() > 0))
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a);
      localBuilder.setTitle("是否删除");
      localBuilder.setMessage("是否删除该项");
      localBuilder.setNegativeButton("确定", new an(this, paramView));
      localBuilder.setPositiveButton("取消", new ao(this));
      localBuilder.create().show();
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.am
 * JD-Core Version:    0.7.0.1
 */