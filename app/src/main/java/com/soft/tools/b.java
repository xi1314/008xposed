package com.soft.tools;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.a.a.Map;
import com.soft.toos.findApp.a;

import java.util.Iterator;

final class b
  implements View.OnClickListener
{
  b(BackUp_SelectMoreAppActivity paramBackUp_SelectMoreAppActivity) {}
  
  public final void onClick(View paramView)
  {
    if (paramView.equals(BackUp_SelectMoreAppActivity.a(this.a))) {
      if (BackUp_SelectMoreAppActivity.b(this.a).size() == 0) {
        Toast.makeText(this.a, "没有选中项目", 0).show();
      }
    }
    Object localObject;
    do
    {
      return;
      Intent localIntent = new Intent();
      Iterator localIterator = BackUp_SelectMoreAppActivity.b(this.a).entrySet().iterator();
      paramView = "";
      for (;;)
      {
        if (!localIterator.hasNext())
        {
          localIntent.putExtra("items", paramView);
          this.a.setResult(0, localIntent);
          this.a.finish();
          return;
        }
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localObject = (String)localEntry.getKey();
        new StringBuilder().append(localEntry.getValue()).toString();
        if (paramView.length() == 0) {
          paramView = (View)localObject;
        } else {
          paramView = paramView + "," + (String)localObject;
        }
      }
      if (paramView.equals(BackUp_SelectMoreAppActivity.c(this.a)))
      {
        this.a.finish();
        return;
      }
      if (paramView.equals(BackUp_SelectMoreAppActivity.d(this.a)))
      {
        BackUp_SelectMoreAppActivity.b(this.a).clear();
        BackUp_SelectMoreAppActivity.e(this.a).notifyDataSetChanged();
        return;
      }
    } while (!paramView.equals(BackUp_SelectMoreAppActivity.f(this.a)));
    paramView = BackUp_SelectMoreAppActivity.g(this.a).iterator();
    for (;;)
    {
      if (!paramView.hasNext())
      {
        BackUp_SelectMoreAppActivity.e(this.a).notifyDataSetChanged();
        return;
      }
      localObject = (a)paramView.next();
      if (BackUp_SelectMoreAppActivity.b(this.a).containsKey(((a)localObject).c)) {
        BackUp_SelectMoreAppActivity.b(this.a).remove(((a)localObject).c);
      } else {
        BackUp_SelectMoreAppActivity.b(this.a).a(((a)localObject).c, ((a)localObject).a);
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.Inttolong

 * JD-Core Version:    0.7.0.1

 */