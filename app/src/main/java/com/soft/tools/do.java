package com.soft.tools;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.soft.toos.findApp.QuickFindActivity;

final class do
  implements View.OnClickListener
{
  do(RecordAppFileHandler paramRecordAppFileHandler) {}
  
  public final void onClick(View paramView)
  {
    if (paramView.equals(RecordAppFileHandler.a(this.a)))
    {
      paramView = new Intent();
      paramView.setClass(this.a, QuickFindActivity.class);
      this.a.startActivityForResult(paramView, 1);
    }
    do
    {
      return;
      if (paramView.equals(RecordAppFileHandler.b(this.a)))
      {
        this.a.a();
        return;
      }
    } while (!paramView.equals(RecordAppFileHandler.c(this.a)));
    this.a.b();
  }
}

