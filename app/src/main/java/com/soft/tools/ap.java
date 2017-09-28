package com.soft.tools;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;

final class ap
  implements AdapterView.OnItemLongClickListener
{
  ap(FolderBackUpActivity paramFolderBackUpActivity) {}
  
  public final boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    FolderBackUpActivity.a(this.a, paramInt);
    return false;
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.ap
 * JD-Core Version:    0.7.0.1
 */