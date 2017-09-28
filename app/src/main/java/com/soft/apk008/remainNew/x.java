package com.soft.apk008.remainNew;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;

final class x
  implements DialogInterface.OnClickListener
{
  x(NewReMainSetActivity paramNewReMainSetActivity, EditText paramEditText1, EditText paramEditText2) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = this.b.getText().toString();
    String str = this.c.getText().toString();
    paramInt = -1;
    try
    {
      i = Integer.parseInt(paramDialogInterface);
      paramInt = i;
      int j = Integer.parseInt(str);
      paramInt = j;
    }
    catch (Exception paramDialogInterface)
    {
      int i;
      for (;;)
      {
        i = paramInt;
        paramInt = -2;
      }
      NewReMainSetActivity.a(this.a).setText(i);
      NewReMainSetActivity.b(this.a).setText(paramInt);
      paramDialogInterface = this.a;
      NewReMainSetActivity.a(this.a.c);
    }
    if ((i <= 0) || (paramInt <= 0))
    {
      Toast.makeText(this.a, "输入不合法", 0).show();
      return;
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.remainNew.x
 * JD-Core Version:    0.7.0.1
 */