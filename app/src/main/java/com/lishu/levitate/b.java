package com.lishu.levitate;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.soft.apk008.Apk008Activity;
import com.soft.apk008.LoadActivity;
import com.soft.apk008.SetMessageActivity;

import de.robv.android.xposed.mods.tutorial.Shell;

final class b
  implements View.OnClickListener
{
  b(a parama) {}
  
  public final void onClick(View paramView)
  {
    this.a.a.dismiss();
    if (paramView.equals(a.a(this.a))) {
      if ((Apk008Activity.a == null) || (Apk008Activity.b))
      {
        paramView = new Intent(a.b(this.a), LoadActivity.class);
        paramView.putExtra("action", "dataView");
        paramView.addFlags(268435456);
        a.b(this.a).startActivity(paramView);
        Toast.makeText(a.b(this.a), "需要进入一次008", 0).show();
      }
    }
    do
    {
      return;
      SetMessageActivity.a(a.b(this.a));
      this.a.a();
      return;
      if (paramView.equals(a.c(this.a)))
      {
        if ((Apk008Activity.a == null) || (Apk008Activity.b))
        {
          paramView = new Intent(a.b(this.a), LoadActivity.class);
          paramView.putExtra("action", "dataView");
          paramView.addFlags(268435456);
          a.b(this.a).startActivity(paramView);
          Toast.makeText(a.b(this.a), "需要进入一次008", 0).show();
          return;
        }
        a.d(this.a);
        return;
      }
      if (paramView.equals(a.e(this.a)))
      {
        if ((Apk008Activity.a == null) || (Apk008Activity.b))
        {
          paramView = new Intent(a.b(this.a), LoadActivity.class);
          paramView.putExtra("action", "dataView");
          paramView.addFlags(268435456);
          a.b(this.a).startActivity(paramView);
          return;
        }
        Shell.execCommandWithResult("am start -XhookMethod android.intent.action.VIEW -getMap  soft008://?action=dataView", true);
        return;
      }
    } while (!paramView.equals(a.f(this.a)));
    if (Apk008Activity.a == null)
    {
      paramView = new Intent(a.b(this.a), LoadActivity.class);
      paramView.putExtra("action", "dataView");
      paramView.addFlags(268435456);
      a.b(this.a).startActivity(paramView);
      return;
    }
    Shell.execCommandWithResult("am start -XhookMethod android.intent.action.VIEW -getMap  soft008://?action=gongju", true);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.lishu.levitate.Inttolong

 * JD-Core Version:    0.7.0.1

 */