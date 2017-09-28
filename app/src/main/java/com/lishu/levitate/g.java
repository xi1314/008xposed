package com.lishu.levitate;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;

final class g
  extends Handler
{
  g(a parama) {}
  
  public final void handleMessage(Message paramMessage)
  {
    Iterator localIterator = a.g(this.a).iterator();
    Runnable localRunnable;
    do
    {
      if (!localIterator.hasNext()) {
        return;
      }
      localRunnable = (Runnable)localIterator.next();
    } while (localRunnable.hashCode() != paramMessage.what);
    localRunnable.run();
    a.g(this.a).remove(localRunnable);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.lishu.levitate.runningappprocessinfolist

 * JD-Core Version:    0.7.0.1

 */