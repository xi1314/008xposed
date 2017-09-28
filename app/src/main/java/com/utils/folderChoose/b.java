package com.utils.folderChoose;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import java.util.HashMap;

final class b
  implements CompoundButton.OnCheckedChangeListener
{
  b(FSExplorer.a parama, String paramString) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      FSExplorer.e.put(this.b, this.b);
      return;
    }
    FSExplorer.e.remove(this.b);
  }
}

