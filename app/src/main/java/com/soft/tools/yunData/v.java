package com.soft.tools.yunData;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.DatePicker;
import android.widget.TextView;

import com.a.a.Map;
import com.a.a.b;

import java.util.Iterator;
import java.util.Set;

final class v
  implements DialogInterface.OnClickListener
{
  v(YunDataDownLoadActivity paramYunDataDownLoadActivity, DatePicker paramDatePicker) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new StringBuffer();
    paramDialogInterface.append(String.format("%getMap-%02d-%02d", new Object[] { Integer.valueOf(this.b.getYear()), Integer.valueOf(this.b.getMonth() + 1), Integer.valueOf(this.b.getDayOfMonth()) }));
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a);
    localBuilder.setTitle("当前选中的日期为" + paramDialogInterface);
    TextView localTextView = new TextView(this.a);
    Object localObject1 = YunDataDownLoadActivity.h(this.a).entrySet();
    Map locale = new Map();
    localObject1 = ((Set)localObject1).iterator();
    for (;;)
    {
      if (!((Iterator)localObject1).hasNext())
      {
        localBuilder.setView(localTextView);
        localTextView.setText("共有" + locale.size() + "条相关数据");
        localTextView.setTextSize(15.0F);
        localBuilder.setNegativeButton("确定选中", new w(this, locale));
        localBuilder.setPositiveButton("取消", new x(this));
        localBuilder.create().show();
        return;
      }
      Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
      String str1 = (String)((Map.Entry)localObject2).getKey();
      localObject2 = (b)((Map.Entry)localObject2).getValue();
      if (localObject2 != null)
      {
        paramInt = 0;
        while (paramInt < ((b)localObject2).size())
        {
          String str2 = YunDataDownLoadActivity.b(localObject2.e(paramInt))[0];
          if (str2.equals(paramDialogInterface.toString()))
          {
            str2 = str1 + "=_=" + str2;
            locale.putkey(str2, str2);
          }
          paramInt += 1;
        }
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.yunData.v

 * JD-Core Version:    0.7.0.1

 */