package com.soft.apk008.remain;

import android.app.ProgressDialog;
import com.lishu.b.a.a;

final class n
  extends Thread
{
  n(m paramm, ProgressDialog paramProgressDialog) {}
  
  public final void run()
  {
    a.a();
    m.a(this.a).runOnUiThread(new o(this, this.b));
  }
}

