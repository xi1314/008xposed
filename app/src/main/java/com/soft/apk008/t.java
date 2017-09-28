package com.soft.apk008;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;

import de.robv.android.xposed.mods.tutorial.sysstr;

import java.util.HashMap;

final class t
  implements DialogInterface.OnClickListener
{
  t(Apk008Activity paramApk008Activity, EditText paramEditText1, EditText paramEditText2, EditText paramEditText3) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new HashMap();
    String str1 = this.b.getText().toString().trim();
    String str2 = this.c.getText().toString().trim();
    if (!str2.equals(this.d.getText().toString().trim()))
    {
      Toast.makeText(this.a, "两次输入的密码不一致", 0).show();
      return;
    }
    if ((str1.length() < 6) || (str1.length() > 20))
    {
      Toast.makeText(this.a, "用户名长度不正确", 0).show();
      return;
    }
    if ((str2.length() < 6) || (str2.length() > 20))
    {
      Toast.makeText(this.a, "密码长度不正确", 0).show();
      return;
    }
    Apk008Activity.i(this.a).setMessage("操作进行中，请稍后");
    Apk008Activity.i(this.a).show();
    paramDialogInterface.put("name", str1);
    paramDialogInterface.put("password", str2);
    paramDialogInterface.put("verCode", StartActivity.c(this.a));
    paramInt = LoadActivity.libSign(this.a, LoadActivity.a, LoadActivity.b);
    paramDialogInterface.put("a", LoadActivity.a);
    paramDialogInterface.put("b", paramInt);
    paramDialogInterface.put("imei", sysstr.a());
    paramDialogInterface.put("action", "reg");
    Apk008Activity.j(this.a).a(Apk008Activity.e(), paramDialogInterface, new u(this));
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.t

 * JD-Core Version:    0.7.0.1

 */