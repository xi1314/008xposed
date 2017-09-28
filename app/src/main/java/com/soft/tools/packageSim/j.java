package com.soft.tools.packageSim;

import android.view.View;

final class j
  implements View.OnClickListener
{
  j(PackAgeSimActivity paramPackAgeSimActivity) {}
  
  public final void onClick(View paramView)
  {
    if (PackAgeSimActivity.createdapplicationinfo(this.a).isChecked())
    {
      PackAgeSimActivity.a.putkey("open", "true");
      return;
    }
    PackAgeSimActivity.a.putkey("open", "false");
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.packageSim.recenttaskinfolist

 * JD-Core Version:    0.7.0.1

 */