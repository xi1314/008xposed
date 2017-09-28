package com.soft.tools;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

final class ag
  implements View.OnClickListener
{
  ag(FindPhoneDataActivity paramFindPhoneDataActivity) {}
  
  public final void onClick(View paramView)
  {
    String str;
    if (paramView.equals(FindPhoneDataActivity.a(this.a)))
    {
      str = FindPhoneDataActivity.b(this.a).getText().toString();
      paramView = str;
      if (str.trim().length() == 0) {
        Toast.makeText(this.a, "请填写imei号", 0).show();
      }
    }
    else
    {
      if (!paramView.equals(FindPhoneDataActivity.c(this.a))) {
        break label222;
      }
      paramView = FindPhoneDataActivity.d(this.a).getText().toString();
      if (paramView.trim().length() == 0)
      {
        Toast.makeText(this.a, "请填写路径", 0).show();
        return;
      }
      paramView = new File(paramView);
      if (paramView.exists()) {}
    }
    for (;;)
    {
      try
      {
        paramView.createNewFile();
      }
      catch (IOException localIOException)
      {
        try
        {
          str = new BufferedReader(new FileReader(paramView)).readLine();
          if (str != null)
          {
            paramView = str;
            if (str.length() != 0) {}
          }
          else
          {
            Toast.makeText(this.a, "文件内容为空", 0).show();
            return;
          }
        }
        catch (FileNotFoundException paramView)
        {
          paramView.printStackTrace();
          paramView = "";
          if (paramView.trim().length() != 0) {
            break;
          }
          Toast.makeText(this.a, "imei为空", 0).show();
          return;
          localIOException = localIOException;
          localIOException.printStackTrace();
          continue;
        }
        catch (IOException paramView)
        {
          paramView.printStackTrace();
        }
      }
      label222:
      paramView = "";
    }
    if (!FindPhoneDataActivity.a(paramView))
    {
      Toast.makeText(this.a, "设置数据失败，未找到该imei数据", 0).show();
      return;
    }
    Toast.makeText(this.a, "设置数据成功!——" + paramView, 0).show();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.ag
 * JD-Core Version:    0.7.0.1
 */