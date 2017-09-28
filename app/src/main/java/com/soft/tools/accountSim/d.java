package com.soft.tools.accountSim;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Spinner;

import com.a.a.Map;

final class d
  implements DialogInterface.OnClickListener
{
  d(AccountSimSetActivity paramAccountSimSetActivity, EditText paramEditText, Spinner paramSpinner) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = this.b.getText().toString().trim();
    paramInt = this.c.getSelectedItemPosition();
    if (paramDialogInterface.length() == 0) {
      return;
    }
    Map locale = new Map();
    locale.putkey("name", paramDialogInterface);
    locale.putkey("kind", Integer.valueOf(paramInt));
    AccountSimSetActivity.d().add(locale);
    AccountSimSetActivity.a(this.a).notifyDataSetChanged();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.accountSim.getMap

 * JD-Core Version:    0.7.0.1

 */