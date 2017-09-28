package com.soft.apk008;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.soft.toos.findApp.a;

final class az
  implements View.OnClickListener
{
  az(SelectMoreAppActivity paramSelectMoreAppActivity) {}
  
  public final void onClick(View paramView)
  {
    if (paramView.equals(SelectMoreAppActivity.a(this.a))) {
      if (SelectMoreAppActivity.b(this.a).size() == 0) {
        Toast.makeText(this.a, "没有选中项目", 0).show();
      }
    }
    do
    {
      return;
      paramView = new Intent();
      paramView.putExtra("items", SelectMoreAppActivity.b(this.a).size());
      if (SelectMoreAppActivity.c(this.a).isChecked()) {
        paramView.putExtra("selectKind", "select");
      }
      for (;;)
      {
        this.a.setResult(0, paramView);
        this.a.finish();
        return;
        paramView.putExtra("selectKind", "noSelect");
      }
      if (paramView.equals(SelectMoreAppActivity.d(this.a)))
      {
        this.a.finish();
        return;
      }
      if (paramView.equals(SelectMoreAppActivity.e(this.a)))
      {
        SelectMoreAppActivity.b(this.a).clear();
        SelectMoreAppActivity.f(this.a).notifyDataSetChanged();
        return;
      }
    } while (!paramView.equals(SelectMoreAppActivity.g(this.a)));
    paramView = SelectMoreAppActivity.h(this.a).iterator();
    for (;;)
    {
      if (!paramView.hasNext())
      {
        SelectMoreAppActivity.f(this.a).notifyDataSetChanged();
        return;
      }
      a locala = (a)paramView.next();
      if (SelectMoreAppActivity.b(this.a).containsKey(locala.c)) {
        SelectMoreAppActivity.b(this.a).remove(locala.c);
      } else {
        SelectMoreAppActivity.b(this.a).a(locala.c, locala.a);
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.az

 * JD-Core Version:    0.7.0.1

 */