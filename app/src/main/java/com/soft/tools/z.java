package com.soft.tools;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;

final class z
  implements AdapterView.OnItemLongClickListener
{
  z(DeleteFolderActivity paramDeleteFolderActivity) {}
  
  public final boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    DeleteFolderActivity.a(this.a, paramInt);
    return false;
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.z
 * JD-Core Version:    0.7.0.1
 */