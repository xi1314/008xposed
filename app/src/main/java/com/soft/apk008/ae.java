package com.soft.apk008;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class ae
  implements View.OnClickListener
{
  ae(HistoryActivity paramHistoryActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = (String)paramView.getTag();
    Intent localIntent = new Intent();
    localIntent.putExtra("getDeviceId", paramView);
    this.a.setResult(1, localIntent);
    this.a.finish();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.ae
 * JD-Core Version:    0.7.0.1
 */