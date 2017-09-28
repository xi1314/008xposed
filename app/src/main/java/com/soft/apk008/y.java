package com.soft.apk008;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

final class y
  extends Handler
{
  y(Change008Receiver paramChange008Receiver) {}
  
  public final void handleMessage(Message paramMessage)
  {
    paramMessage = (String)paramMessage.obj;
    if (paramMessage != null) {
      Toast.makeText(Change008Receiver.a(this.a), paramMessage, 0).show();
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.y
 * JD-Core Version:    0.7.0.1
 */