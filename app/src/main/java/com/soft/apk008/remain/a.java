package com.soft.apk008.remain;

import android.view.View;
import android.widget.Toast;

import com.a.a.Map;
import java.util.Iterator;

final class a
  implements View.OnClickListener
{
  a(ReMainActivity paramReMainActivity) {}
  
  public final void onClick(View paramView)
  {
    Object localObject = null;
    Iterator localIterator;
    if (paramView.equals(ReMainActivity.a(this.a)))
    {
      localIterator = this.a.a.iterator();
      paramView = (View)localObject;
      if (!localIterator.hasNext())
      {
        label40:
        if (paramView != null) {
          break label101;
        }
        Toast.makeText(this.a, "向前已经没有了数据", 0).show();
      }
    }
    label101:
    label243:
    do
    {
      return;
      localObject = (Map)localIterator.next();
      int i = ((Map)localObject).h("nowProgess");
      if (i == ((Map)localObject).h("count"))
      {
        paramView = (View)localObject;
        break;
      }
      if (i <= 1) {
        break;
      }
      paramView = (View)localObject;
      break label40;
      i = paramView.h("nowProgess");
      paramView.a("nowProgess", i - 1);
      this.a.a(i - 1, paramView.get("titleText"));
      return;
      if (paramView.equals(ReMainActivity.b(this.a)))
      {
        localObject = this.a.a.iterator();
        if (!((Iterator)localObject).hasNext()) {
          paramView = null;
        }
        for (;;)
        {
          if (paramView != null) {
            break label243;
          }
          Toast.makeText(this.a, "向后已经没有了数据", 0).show();
          return;
          paramView = (Map)((Iterator)localObject).next();
          if (paramView.h("nowProgess") >= paramView.h("count")) {
            break;
          }
        }
        i = paramView.h("nowProgess");
        paramView.a("nowProgess", i + 1);
        this.a.a(i + 1, paramView.get("titleText"));
        return;
      }
    } while (!paramView.equals(ReMainActivity.c(this.a)));
    paramView = this.a.a.iterator();
    for (;;)
    {
      if (!paramView.hasNext())
      {
        this.a.a();
        ReMainActivity.d(this.a).notifyDataSetChanged();
        return;
      }
      ((Map)paramView.next()).putkey("nowProgess", "0");
    }
  }
}


