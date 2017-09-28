package com.soft.tools;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import com.lishu.b.a.a;
import com.soft.apk008.HistoryActivity;
import java.util.ArrayList;
import java.util.HashMap;

final class dm
  implements DialogInterface.OnClickListener
{
  dm(dj paramdj, Activity paramActivity, String paramString) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramInt = Integer.parseInt(this.a.a);
    ArrayList localArrayList = (ArrayList)a.a.get(HistoryActivity.a);
    paramDialogInterface = localArrayList;
    if (localArrayList == null) {
      paramDialogInterface = new ArrayList();
    }
    if (paramInt == paramDialogInterface.size() - 1)
    {
      Toast.makeText(this.b, "已经到了最后一条", 0).show();
      return;
    }
    paramInt += 1;
    er.a(this.b, this.c, paramInt);
    paramDialogInterface = this.a;
    dj.a(this.b, paramInt);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.dm
 * JD-Core Version:    0.7.0.1
 */