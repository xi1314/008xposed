package com.soft.apk008.remainNew;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;

import com.a.a.Map;
import com.data.simulate.SimulateDataTest;

final class q
  implements DialogInterface.OnClickListener
{
  q(NewReMainSetActivity paramNewReMainSetActivity, EditText paramEditText1, EditText paramEditText2, EditText paramEditText3, EditText paramEditText4) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    for (;;)
    {
      try
      {
        j = Integer.parseInt(this.b.getText().toString());
        k = i;
      }
      catch (Exception paramDialogInterface)
      {
        try
        {
          i = Integer.parseInt(this.c.getText().toString());
        }
        catch (Exception paramDialogInterface)
        {
          for (;;)
          {
            int j;
            int m;
            int k;
            paramInt = -1;
            int i = -1;
          }
        }
        try
        {
          paramInt = Integer.parseInt(this.d.getText().toString());
        }
        catch (Exception paramDialogInterface)
        {
          paramInt = -1;
          break label113;
        }
        try
        {
          m = Integer.parseInt(this.e.getText().toString());
          k = i;
          i = m;
          m = j;
          j = paramInt;
          paramInt = m;
          if ((paramInt >= 0) && (k >= 0)) {
            break;
          }
          Toast.makeText(this.a, "留存天数输入错误", 0).show();
          return;
        }
        catch (Exception paramDialogInterface)
        {
          break label113;
        }
        paramDialogInterface = paramDialogInterface;
        paramInt = -1;
        i = -1;
        j = -1;
      }
      label113:
      m = -1;
      i = j;
      j = paramInt;
      paramInt = i;
      i = m;
    }
    if (paramInt >= k)
    {
      Toast.makeText(this.a, "起始天数应该小于结束天数", 0).show();
      return;
    }
    if ((j < 0) || (i < 0) || (j > 100) || (i > 100))
    {
      Toast.makeText(this.a, "留存输入错误", 0).show();
      return;
    }
    if (j >= i)
    {
      Toast.makeText(this.a, "起始留存应该小于结束留存", 0).show();
      return;
    }
    if (paramInt > k)
    {
      this.a.c();
      this.a.c.cancel();
      NewReMainSetActivity.g();
      paramDialogInterface = this.a;
      NewReMainSetActivity.a(this.a.c);
      return;
    }
    paramDialogInterface = NewReMainSetActivity.b.iterator();
    for (;;)
    {
      if (!paramDialogInterface.hasNext())
      {
        paramDialogInterface = new Map();
        paramDialogInterface.a("day", Integer.valueOf(paramInt));
        paramDialogInterface.a("remain", Integer.valueOf(SimulateDataTest.random.nextInt(i - j) + j));
        NewReMainSetActivity.b.add(paramDialogInterface);
        paramInt += 1;
        break;
      }
      Map locale = (Map)paramDialogInterface.next();
      locale.get("day").equals(paramInt);
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.remainNew.q

 * JD-Core Version:    0.7.0.1

 */