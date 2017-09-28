package com.soft.tools;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;

final class aw
  implements AdapterView.OnItemClickListener
{
  aw(FolderBackUpListActivity paramFolderBackUpListActivity) {}
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    FolderBackUpListActivity.a(this.a, (String)FolderBackUpListActivity.e(this.a).get(paramInt));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.aw
 * JD-Core Version:    0.7.0.1
 */