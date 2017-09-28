package com.soft.tools;

import android.widget.SeekBar;

import com.a.a.Map;

final class ci
  implements SeekBar.OnSeekBarChangeListener
{
  ci(PhoneNetWork_NetWorkTypeActivity.a parama, Map parame) {}
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean) {}
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    this.b.a("progress", Integer.valueOf(paramSeekBar.getProgress()));
    PhoneNetWork_NetWorkTypeActivity.a.a(this.a).a();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.ci

 * JD-Core Version:    0.7.0.1

 */