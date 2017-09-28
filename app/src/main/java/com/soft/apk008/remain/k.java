package com.soft.apk008.remain;

import android.app.ProgressDialog;

final class k
  implements Runnable
{
  k(j paramj, ProgressDialog paramProgressDialog) {}
  
  public final void run()
  {
    this.b.cancel();
    RecordSelectActivity.b(h.a(i.a(j.a(this.a))));
  }
}


