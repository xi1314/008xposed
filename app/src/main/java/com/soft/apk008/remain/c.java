package com.soft.apk008.remain;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import com.a.a.b;

final class c
  implements DialogInterface.OnClickListener
{
  c(ReMainActivity paramReMainActivity, int paramInt) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.a.remove(this.b);
    ReMainActivity.d(this.a).notifyDataSetChanged();
    Toast.makeText(this.a, "删除成功", 0).show();
    this.a.a();
  }
}
