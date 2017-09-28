package com.soft.tools;

import android.view.View;
import android.view.View.OnClickListener;

final class av
  implements View.OnClickListener
{
  av(FolderBackUpListActivity paramFolderBackUpListActivity) {}
  
  public final void onClick(View paramView)
  {
    if (paramView.equals(FolderBackUpListActivity.a(this.a))) {
      FolderBackUpListActivity.b(this.a);
    }
    while (!paramView.equals(FolderBackUpListActivity.c(this.a))) {
      return;
    }
    FolderBackUpListActivity.d(this.a);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.av
 * JD-Core Version:    0.7.0.1
 */