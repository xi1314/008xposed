package com.soft.apk008.remainNew;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

final class ad
  extends BroadcastReceiver
{
  ad(NewReMainToolActivity paramNewReMainToolActivity) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("PROGRESS_CHANGE")) {
      Toast.makeText(paramContext, paramIntent.getStringExtra("msg"), 0).show();
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.remainNew.ad
 * JD-Core Version:    0.7.0.1
 */