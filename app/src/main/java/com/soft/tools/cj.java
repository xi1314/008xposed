package com.soft.tools;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.lishu.c.a;

final class cj
  implements View.OnClickListener
{
  cj(ProcessFakeSetActivity paramProcessFakeSetActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = ProcessFakeSetActivity.a(this.a).getText().toString().trim();
    String str = ProcessFakeSetActivity.b(this.a).getText().toString().trim();
    if ((paramView.length() == 0) || (str.length() == 0))
    {
      a.c(this.a, "信息填写不完整");
      return;
    }
    int i;
    int j;
    try
    {
      i = Integer.parseInt(paramView);
      j = Integer.parseInt(str);
      if ((i <= 0) || (j <= 0))
      {
        a.c(this.a, "两个数都必须大于0");
        return;
      }
    }
    catch (Exception paramView)
    {
      a.c(this.a, "信息输入错误");
      return;
    }
    if (i >= j)
    {
      a.c(this.a, "最大值必须大于最小值");
      return;
    }
    ProcessFakeActivity.a(new String[] { paramView, str });
    Toast.makeText(this.a, "保存成功", 0).show();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.cj
 * JD-Core Version:    0.7.0.1
 */