package com.soft.tools;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;

final class dv
  implements View.OnClickListener
{
  dv(RecordAppFileHandlerSetting.a parama, int paramInt) {}
  
  public final void onClick(View paramView)
  {
    paramView = new AlertDialog.Builder(paramView.getContext());
    paramView.setTitle("是否删除");
    paramView.setNegativeButton("确定", new dw(this, this.b));
    paramView.setPositiveButton("取消", new dx(this));
    paramView.create().show();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.dv
 * JD-Core Version:    0.7.0.1
 */