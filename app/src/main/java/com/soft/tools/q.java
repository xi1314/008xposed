package com.soft.tools;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import java.util.HashMap;

final class q
  implements CompoundButton.OnCheckedChangeListener
{
  q(BackupFileActivity.a parama, int paramInt) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      BackupFileActivity.g(BackupFileActivity.a.a(this.a)).put(this.b, this.b);
      return;
    }
    BackupFileActivity.g(BackupFileActivity.a.a(this.a)).remove(this.b);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.q
 * JD-Core Version:    0.7.0.1
 */