package com.soft.apk008;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.soft.tools.SetLocalIpActivity;

final class cr
  implements View.OnClickListener
{
  cr(SettingActivity paramSettingActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = new Intent();
    paramView.setClass(this.a, SetLocalIpActivity.class);
    this.a.startActivity(paramView);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.cr
 * JD-Core Version:    0.7.0.1
 */