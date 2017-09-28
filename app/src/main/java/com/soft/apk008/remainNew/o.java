package com.soft.apk008.remainNew;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;

import com.a.a.Map;

import java.util.Iterator;

final class o
  implements DialogInterface.OnClickListener
{
  o(NewReMainSetActivity paramNewReMainSetActivity, EditText paramEditText1, EditText paramEditText2) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      paramInt = Integer.parseInt(this.b.getText().toString().trim());
      if (paramInt <= 0)
      {
        Toast.makeText(this.a, "天数输入错误", 0).show();
        return;
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        paramInt = 0;
      }
      try
      {
        i = Integer.parseInt(this.c.getText().toString().trim());
        if (i <= 0)
        {
          Toast.makeText(this.a, "留存输入错误", 0).show();
          return;
        }
      }
      catch (Exception localException2)
      {
        int i;
        for (;;)
        {
          i = 0;
        }
        Object localObject = NewReMainSetActivity.b.iterator();
        Map locale;
        do
        {
          if (!((Iterator)localObject).hasNext())
          {
            localObject = new Map();
            ((Map)localObject).putkey("day", Integer.valueOf(paramInt));
            ((Map)localObject).putkey("remain", Integer.valueOf(i));
            NewReMainSetActivity.b.add(localObject);
            this.a.c();
            paramDialogInterface.cancel();
            NewReMainSetActivity.g();
            return;
          }
          locale = (Map)((Iterator)localObject).next();
        } while (!locale.get("day").equals(paramInt));
        Toast.makeText(this.a, "天数已经存在", 0).show();
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.remainNew.o

 * JD-Core Version:    0.7.0.1

 */