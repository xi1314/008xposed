package com.soft.tools;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class ao
  implements View.OnClickListener
{
  ao(FolderBackUpActivity paramFolderBackUpActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = new Intent(this.a, FolderBackUpListActivity.class);
    this.a.startActivity(paramView);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.ao
 * JD-Core Version:    0.7.0.1
 */