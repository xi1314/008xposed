package com.soft.tools.packageSim;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.Editable;
import android.widget.EditText;
import com.a.a.b;

final class d
  implements DialogInterface.OnClickListener
{
  d(PackAgeSetActivity paramPackAgeSetActivity, EditText paramEditText) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = this.b.getText().toString();
    if (paramDialogInterface.length() > 0) {
      paramInt = 0;
    }
    for (;;)
    {
      if (paramInt >= PackAgeSetActivity.b().size())
      {
        PackAgeSetActivity.b().add(paramDialogInterface);
        PackAgeSetActivity.a(this.a).notifyDataSetChanged();
      }
      while (PackAgeSetActivity.b().e(paramInt).equals(paramDialogInterface)) {
        return;
      }
      paramInt += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.packageSim.runtimeexception

 * JD-Core Version:    0.7.0.1

 */