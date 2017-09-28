package com.soft.apk008;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

final class w
  implements View.OnClickListener
{
  w(BuyActivity paramBuyActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = new Intent();
    paramView.setAction("android.intent.action.VIEW");
    try
    {
      if (!LoadActivity.c) {
        StartActivity.j = "http://www.baidu.com";
      }
      paramView.setData(Uri.parse(StartActivity.j));
      this.a.startActivity(paramView);
      return;
    }
    catch (Exception paramView)
    {
      Toast.makeText(this.a, "链接失效", 0).show();
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.w
 * JD-Core Version:    0.7.0.1
 */