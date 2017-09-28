package com.soft.tools;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;

final class cw
  implements AdapterView.OnItemSelectedListener
{
  cw(QuickToolActivity paramQuickToolActivity, String[] paramArrayOfString) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    QuickToolActivity.b(this.a).setText(this.b[QuickToolActivity.c(this.a).getSelectedItemPosition()]);
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView) {}
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.cw
 * JD-Core Version:    0.7.0.1
 */