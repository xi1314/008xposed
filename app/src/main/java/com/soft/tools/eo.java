package com.soft.tools;

import android.app.Dialog;
import android.provider.Settings.System;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

final class eo
  implements View.OnClickListener
{
  eo(SetSystemValueActivity paramSetSystemValueActivity, EditText paramEditText, String paramString, Dialog paramDialog) {}
  
  public final void onClick(View paramView)
  {
    paramView = this.b.getText().toString();
    try
    {
      Settings.System.putString(this.a.getContentResolver(), this.c, paramView);
      Toast.makeText(this.a, "设置成功！", 0).show();
      this.d.cancel();
      return;
    }
    catch (Exception paramView)
    {
      paramView.printStackTrace();
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.eo
 * JD-Core Version:    0.7.0.1
 */