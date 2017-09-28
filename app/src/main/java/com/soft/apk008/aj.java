package com.soft.apk008;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

final class aj
  implements View.OnClickListener
{
  aj(HistoryActivity paramHistoryActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = (String)paramView.getTag();
    if ((paramView != null) && (paramView.length() > 0))
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a);
      localBuilder.setTitle("输入别名");
      EditText localEditText = new EditText(this.a);
      localBuilder.setView(localEditText);
      localBuilder.setNegativeButton("确定", new ak(this, localEditText, paramView));
      localBuilder.setPositiveButton("取消", new al(this));
      localBuilder.create().show();
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.aj
 * JD-Core Version:    0.7.0.1
 */