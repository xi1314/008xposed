package com.soft.apk008.agreement;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.Toast;
import com.soft.tools.er;

final class a
  implements View.OnClickListener
{
  a(AgreeMentActivity paramAgreeMentActivity) {}
  
  public final void onClick(View paramView)
  {
    if (!AgreeMentActivity.a(this.a).isChecked())
    {
      Toast.makeText(this.a, "你还没有同意协议", 0).show();
      return;
    }
    er.a(this.a, "isAgreeMent", "true");
    this.a.finish();
  }
}

