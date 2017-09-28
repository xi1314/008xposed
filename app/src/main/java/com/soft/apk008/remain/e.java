package com.soft.apk008.remain;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;

import com.a.a.Map;

import java.util.ArrayList;

final class e
  implements DialogInterface.OnClickListener
{
  e(ReMainActivity paramReMainActivity, EditText paramEditText, ArrayList paramArrayList, String paramString) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = this.b.getText().toString();
    try
    {
      paramInt = Integer.parseInt(paramDialogInterface);
      if (paramInt == -1)
      {
        Toast.makeText(this.a, "留存为0到100的数值", 0).show();
        return;
      }
    }
    catch (Exception paramDialogInterface)
    {
      for (;;)
      {
        paramDialogInterface.printStackTrace();
        paramInt = -1;
      }
      if ((paramInt > 100) || (paramInt <= 0))
      {
        Toast.makeText(this.a, "留存为0到100的数值", 0).show();
        return;
      }
      paramDialogInterface = new Map();
      paramDialogInterface.a("askText", "设置的留存为" + paramInt + "%,总共任务数为：" + this.c.size() * paramInt / 100);
      paramDialogInterface.a("statusText", "当前第0个,进度为0%");
      paramDialogInterface.a("titleText", this.d);
      paramDialogInterface.a("count", paramInt * this.c.size() / 100);
      paramDialogInterface.a("nowProgess", "0");
      this.a.a.add(paramDialogInterface);
      ReMainActivity.d(this.a).notifyDataSetChanged();
      this.a.a();
    }
  }
}

