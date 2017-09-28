package com.soft.tools;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class ej
  implements View.OnClickListener
{
  ej(SetLocalIpActivity paramSetLocalIpActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = SetLocalIpActivity.a(this.a).getText().toString();
    if (paramView.split("\\.").length != 4)
    {
      Toast.makeText(this.a, "ip地址设置不正确", 0).show();
      return;
    }
    SetLocalIpActivity.a = paramView;
    SetLocalIpActivity.b = SetLocalIpActivity.b(this.a).getSelectedItemPosition() + 1;
    PoseHelper008.saveDataToFile("SetLocalIpActivity", SetLocalIpActivity.a + "_" + SetLocalIpActivity.b);
    this.a.finish();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.ej
 * JD-Core Version:    0.7.0.1
 */