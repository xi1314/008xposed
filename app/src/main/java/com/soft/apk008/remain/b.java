package com.soft.apk008.remain;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;

final class b
  implements AdapterView.OnItemLongClickListener
{
  b(ReMainActivity paramReMainActivity) {}
  
  public final boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.a(paramInt);
    return false;
  }
}

