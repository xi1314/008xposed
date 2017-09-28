package com.soft.tools.yunData;

import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;

final class o
  implements Runnable
{
  o(m paramm) {}
  
  public final void run()
  {
    String str = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
    YunDataActivity.h(this.a.a).setText(str);
    YunDataActivity.i(this.a.a).setText("操作成功");
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.yunData.o
 * JD-Core Version:    0.7.0.1
 */