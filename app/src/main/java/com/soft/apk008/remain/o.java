package com.soft.apk008.remain;

import android.app.ProgressDialog;

final class o
  implements Runnable
{
  o(n paramn, ProgressDialog paramProgressDialog) {}
  
  public final void run()
  {
    this.b.cancel();
    RecordSelectActivity.b(m.a(n.a(this.a)));
  }
}


