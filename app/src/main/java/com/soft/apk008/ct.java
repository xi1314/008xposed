package com.soft.apk008;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

final class ct
  implements AdapterView.OnItemSelectedListener
{
  ct(SettingActivity paramSettingActivity) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt == 0) {}
    int i;
    do
    {
      return;
      i = SettingActivity.islog(this.a).getSelectedItemPosition();
    } while ((i >= 0) && (paramInt > i));
    Toast.makeText(this.a, "必须大于最小值", 0).show();
    SettingActivity.a(this.a).setSelection(0);
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView) {}
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.ct

 * JD-Core Version:    0.7.0.1

 */