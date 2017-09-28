package com.soft.apk008.remainNew;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

final class a
  extends Handler
{
  public final void handleMessage(Message paramMessage)
  {
    if (NewReMainActivity.a == null) {
      return;
    }
    switch (paramMessage.what)
    {
    default: 
      return;
    }
    Toast.makeText(NewReMainActivity.a, (String)paramMessage.obj, 0).show();
  }
}


