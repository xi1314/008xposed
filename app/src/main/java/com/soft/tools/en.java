package com.soft.tools;

import android.app.Dialog;
import android.provider.Settings.System;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

final class en
  implements View.OnClickListener
{
  en(SetSystemValueActivity paramSetSystemValueActivity, String paramString, Dialog paramDialog) {}
  
  public final void onClick(View paramView)
  {
    Settings.System.putString(this.a.getContentResolver(), this.b, null);
    Toast.makeText(this.a, "清空成功！", 0).show();
    this.c.cancel();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.en
 * JD-Core Version:    0.7.0.1
 */