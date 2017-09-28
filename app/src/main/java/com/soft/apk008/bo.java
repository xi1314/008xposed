package com.soft.apk008;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import com.soft.tools.er;

final class bo
  implements DialogInterface.OnClickListener
{
  bo(SetDataActivity paramSetDataActivity, String paramString) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramInt = Integer.parseInt(this.a.j);
    if (paramInt == 0)
    {
      Toast.makeText(this.a, "已经到了第一条", 0).show();
      return;
    }
    paramInt -= 1;
    er.a(this.a, this.b, paramInt);
    this.a.a(paramInt);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.bo
 * JD-Core Version:    0.7.0.1
 */