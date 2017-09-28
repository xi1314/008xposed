package com.soft.tools;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;

final class bs
  implements AdapterView.OnItemLongClickListener
{
  bs(IpRecordActivity paramIpRecordActivity) {}
  
  public final boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.a(paramInt);
    return false;
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.bs
 * JD-Core Version:    0.7.0.1
 */