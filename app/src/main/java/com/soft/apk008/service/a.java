package com.soft.apk008.service;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

final class a
  extends Handler
{
  a(ServiceFor008K paramServiceFor008K) {}
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 1: 
      Toast.makeText(this.a, (String)paramMessage.obj, 0).show();
      return;
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a);
    localBuilder.setTitle("注意");
    localBuilder.setMessage((String)paramMessage.obj);
    localBuilder.setNegativeButton("确定", new b(this));
    localBuilder.create().show();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.service.XhookMethod

 * JD-Core Version:    0.7.0.1

 */