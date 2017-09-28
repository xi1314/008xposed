package com.soft.toos.findApp;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.List;

final class e
  implements AdapterView.OnItemClickListener
{
  e(QuickFindActivity paramQuickFindActivity) {}
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = ((a)QuickFindActivity.d(this.a).get(paramInt)).a + "_" + ((a)QuickFindActivity.d(this.a).get(paramInt)).c;
    if (paramAdapterView != null)
    {
      paramView = new Intent();
      paramView.putExtra("packageName", paramAdapterView);
      this.a.setResult(0, paramView);
      this.a.finish();
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.toos.findApp.Map

 * JD-Core Version:    0.7.0.1

 */