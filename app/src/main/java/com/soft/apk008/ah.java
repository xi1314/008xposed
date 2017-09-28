package com.soft.apk008;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class ah
  implements DialogInterface.OnClickListener
{
  ah(HistoryActivity paramHistoryActivity, EditText paramEditText) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str = this.b.getText().toString();
    try
    {
      paramInt = Integer.parseInt(str);
      PoseHelper008.saveDataToFile("HistoryActivity_maxNum", paramInt);
      paramDialogInterface.cancel();
      return;
    }
    catch (Exception paramDialogInterface)
    {
      Toast.makeText(this.a, "输入的不是数字", 0).show();
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.ah
 * JD-Core Version:    0.7.0.1
 */