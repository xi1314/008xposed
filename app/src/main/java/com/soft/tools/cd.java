package com.soft.tools;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

final class cd
  implements View.OnClickListener
{
  cd(KillBackGroundActivity paramKillBackGroundActivity) {}
  
  public final void onClick(View paramView)
  {
    if (KillBackGroundActivity.a(this.a).equals(paramView))
    {
      paramView = this.a.a.entrySet().iterator();
      if (paramView.hasNext()) {}
    }
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
      if (KillBackGroundActivity.b(this.a).equals(paramView))
      {
        new ce(this).start();
        return;
      }
      if (KillBackGroundActivity.f(this.a).equals(paramView))
      {
        KillBackGroundActivity.c(this.a).removeAllViews();
        this.a.a.clear();
        KillBackGroundActivity.a(this.a, KillBackGroundActivity.d(this.a));
        paramView = KillBackGroundActivity.e(this.a).iterator();
        while (paramView.hasNext())
        {
          localObject = (KillBackGroundActivity.b)paramView.next();
          String str = ((KillBackGroundActivity.b)localObject).b;
          CheckBox localCheckBox = this.a.a(str);
          localCheckBox.setTag(localObject);
          this.a.a.put(str, localCheckBox);
        }
      }
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.cd
 * JD-Core Version:    0.7.0.1
 */