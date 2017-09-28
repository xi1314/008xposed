package com.soft.apk008;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class cj
  implements DialogInterface.OnClickListener
{
  cj(SetMessageActivity paramSetMessageActivity, String paramString, boolean paramBoolean) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    HistoryActivity.a = this.b;
    PoseHelper008.saveDataToFile("nowFileName", this.b);
    new ck(this).start();
    if (this.c) {
      Toast.makeText(this.a, "添加到历史记录成功", 0).show();
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.cj
 * JD-Core Version:    0.7.0.1
 */