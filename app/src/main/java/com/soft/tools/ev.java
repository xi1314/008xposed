package com.soft.tools;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class ev
  implements View.OnClickListener
{
  ev(UnInstallActivity paramUnInstallActivity) {}
  
  public final void onClick(View paramView)
  {
    if (UnInstallActivity.a(this.a).equals(paramView))
    {
      paramView = this.a.a.entrySet().iterator();
      if (paramView.hasNext()) {}
    }
    label161:
    do
    {
      for (;;)
      {
        return;
        Object localObject = (Map.Entry)paramView.next();
        ((Map.Entry)localObject).getKey();
        localObject = (CheckBox)((Map.Entry)localObject).getValue();
        if (((CheckBox)localObject).isChecked()) {}
        for (boolean bool = false;; bool = true)
        {
          ((CheckBox)localObject).setChecked(bool);
          break;
        }
        if (!UnInstallActivity.b(this.a).equals(paramView)) {
          break label161;
        }
        paramView = this.a.a.entrySet().iterator();
        while (paramView.hasNext())
        {
          localObject = (Map.Entry)paramView.next();
          ((Map.Entry)localObject).getKey();
          ((CheckBox)((Map.Entry)localObject).getValue()).setChecked(false);
        }
      }
    } while (!UnInstallActivity.c(this.a).equals(paramView));
    new ew(this).start();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.ev
 * JD-Core Version:    0.7.0.1
 */