package com.soft.tools;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

final class dl
  implements DialogInterface.OnClickListener
{
  dl(dj paramdj, Activity paramActivity, String paramString) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramInt = Integer.parseInt(this.a.a);
    if (paramInt == 0)
    {
      Toast.makeText(this.b, "已经到了第一条", 0).show();
      return;
    }
    paramInt -= 1;
    er.a(this.b, this.c, paramInt);
    paramDialogInterface = this.a;
    dj.a(this.b, paramInt);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.dl
 * JD-Core Version:    0.7.0.1
 */