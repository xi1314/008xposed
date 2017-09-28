package com.soft.apk008;

import android.text.ClipboardManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

final class z
  implements View.OnClickListener
{
  z(FreeActivity paramFreeActivity) {}
  
  public final void onClick(View paramView)
  {
    Toast.makeText(this.a, "成功复制链接到剪贴板中", 0).show();
    paramView = (ClipboardManager)this.a.getSystemService("clipboard");
    if (LoadActivity.c) {
      paramView.setText(StartActivity.b + StartActivity.i);
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.z
 * JD-Core Version:    0.7.0.1
 */