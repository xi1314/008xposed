package com.soft.tools.yunData;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.a.a.maputils;
import com.soft.apk008.StartActivity;
import com.soft.apk008.WebMessageActivity;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

final class i
  implements View.OnClickListener
{
  i(YunDataActivity paramYunDataActivity) {}
  
  public final void onClick(View paramView)
  {
    if (paramView.equals(YunDataActivity.a(this.a))) {
      if ((YunDataActivity.a == null) || (YunDataActivity.a.length() == 0)) {
        Toast.makeText(this.a, "未设置服务器地址", 0).show();
      }
    }
    do
    {
      return;
      paramView = new Intent();
      paramView.setClass(this.a, YunDataDownLoadActivity.class);
      this.a.startActivity(paramView);
      return;
      if (paramView.equals(YunDataActivity.b(this.a)))
      {
        YunDataActivity.a(this.a, YunDataActivity.c(this.a).getText().toString());
        if ((YunDataActivity.a == null) || (YunDataActivity.a.length() == 0))
        {
          Toast.makeText(this.a, "未设置服务器地址", 0).show();
          return;
        }
        if (YunDataActivity.a == null)
        {
          Toast.makeText(this.a, "未设置服务器地址", 0).show();
          return;
        }
        if ((YunDataActivity.d(this.a) == null) || (YunDataActivity.d(this.a).trim().length() == 0))
        {
          Toast.makeText(this.a, "未设置设备名", 0).show();
          return;
        }
        paramView = new HashMap();
        paramView.put("deviceName", YunDataActivity.d(this.a).trim());
        try
        {
          YunDataActivity localYunDataActivity = this.a;
          paramView.put("kindItems", new String(maputils.a(YunDataActivity.a()).getBytes(), "utf-8"));
          YunDataActivity.e(this.a).a(YunDataActivity.a + "/checkFileNew", paramView, this.a);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          for (;;)
          {
            localUnsupportedEncodingException.printStackTrace();
          }
        }
      }
    } while (!paramView.equals(YunDataActivity.f(this.a)));
    paramView = new Intent();
    paramView.setClass(this.a, WebMessageActivity.class);
    paramView.putExtra("url", StartActivity.b + "/phone/ContentAction.action?action=yunDataHelp");
    this.a.startActivity(paramView);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.yunData.i

 * JD-Core Version:    0.7.0.1

 */