package com.utils.folderChoose;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;

final class clicklistener
  implements View.OnClickListener
{
  clicklistener(FSExplorer paramFSExplorer) {}
  
  public final void onClick(View paramView)
  {
    if (paramView.equals(FSExplorer.a(this.a))) {
      this.a.finish();
    }
    while (!paramView.equals(FSExplorer.b(this.a))) {
      return;
    }
    FSExplorer.e.clear();
    this.a.finish();
  }
}

