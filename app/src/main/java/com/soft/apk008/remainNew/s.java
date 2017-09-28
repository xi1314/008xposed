package com.soft.apk008.remainNew;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;

import com.a.a.Map;

final class s
  implements DialogInterface.OnClickListener
{
  s(NewReMainSetActivity paramNewReMainSetActivity, EditText paramEditText, Map parame) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = this.b.getText().toString().trim();
    try
    {
      paramInt = Integer.parseInt(paramDialogInterface);
      if (paramInt <= 0)
      {
        Toast.makeText(this.a, "留存为1-100的整数", 0).show();
        return;
      }
    }
    catch (Exception paramDialogInterface)
    {
      for (;;)
      {
        paramInt = 0;
      }
      this.c.a("remain", Integer.valueOf(paramInt));
      NewReMainSetActivity.c(this.a).notifyDataSetChanged();
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.remainNew.s

 * JD-Core Version:    0.7.0.1

 */