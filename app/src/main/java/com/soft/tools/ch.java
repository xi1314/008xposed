package com.soft.tools;

import android.content.DialogInterface;
import android.widget.Spinner;

import com.a.a.Map;

final class ch
  implements DialogInterface.OnClickListener
{
  ch(PhoneNetWork_NetWorkTypeActivity paramPhoneNetWork_NetWorkTypeActivity, Spinner paramSpinner) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramInt = this.b.getSelectedItemPosition();
    if (paramInt < 0) {
      return;
    }
    paramDialogInterface = new Map();
    paramDialogInterface.a("precent", Integer.valueOf(0));
    paramDialogInterface.a("progress", Integer.valueOf(100));
    paramDialogInterface.a("value", Integer.valueOf(paramInt + 1));
    PhoneNetWork_NetWorkTypeActivity.a(this.a).add(paramDialogInterface);
    this.a.a();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.ch

 * JD-Core Version:    0.7.0.1

 */