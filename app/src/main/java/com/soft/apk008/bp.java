package com.soft.apk008;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import com.lishu.b.a.a;
import com.soft.tools.er;
import java.util.ArrayList;
import java.util.HashMap;

final class bp
  implements DialogInterface.OnClickListener
{
  bp(SetDataActivity paramSetDataActivity, String paramString) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramInt = Integer.parseInt(this.a.j);
    ArrayList localArrayList = (ArrayList)a.a.get(HistoryActivity.a);
    paramDialogInterface = localArrayList;
    if (localArrayList == null) {
      paramDialogInterface = new ArrayList();
    }
    if (paramInt == paramDialogInterface.size() - 1)
    {
      Toast.makeText(this.a, "已经到了最后一条", 0).show();
      return;
    }
    paramInt += 1;
    er.a(this.a, this.b, paramInt);
    this.a.a(paramInt);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.bp
 * JD-Core Version:    0.7.0.1
 */