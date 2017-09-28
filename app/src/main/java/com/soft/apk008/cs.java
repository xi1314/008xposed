package com.soft.apk008;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.Toast;

final class cs
  implements AdapterView.OnItemSelectedListener
{
  cs(SettingActivity paramSettingActivity) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt == 0) {}
    int i;
    do
    {
      return;
      i = SettingActivity.a(this.a).getSelectedItemPosition();
    } while ((paramInt >= 0) && (i > paramInt));
    Toast.makeText(this.a, "必须小于最大值", 0).show();
    SettingActivity.a(this.a).setSelection(0);
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView) {}
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.cs
 * JD-Core Version:    0.7.0.1
 */