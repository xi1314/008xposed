package com.soft.tools.packageSim;

import android.view.View;

final class i
  implements View.OnClickListener
{
  i(PackAgeSimActivity paramPackAgeSimActivity) {}
  
  public final void onClick(View paramView)
  {
    PackAgeSimActivity.d();
    PackAgeSimActivity.getpackageinfo(this.a).notifyDataSetChanged();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.packageSim.runningtaskinfolist

 * JD-Core Version:    0.7.0.1

 */