package com.soft.apk008.remain;

import android.app.ProgressDialog;
import com.lishu.b.a.a;
import com.soft.tools.FolderBackUpActivity;
import java.io.File;

final class j
  extends Thread
{
  j(i parami, File paramFile, ProgressDialog paramProgressDialog) {}
  
  public final void run()
  {
    this.b.delete();
    String str = this.b.getName();
    File[] arrayOfFile = new File(FolderBackUpActivity.d()).listFiles();
    int j;
    int i;
    if ((arrayOfFile != null) && (arrayOfFile.length > 0))
    {
      j = arrayOfFile.length;
      i = 0;
    }
    for (;;)
    {
      if (i >= j)
      {
        a.a();
        h.a(i.a(this.a)).runOnUiThread(new k(this, this.c));
        return;
      }
      File localFile = arrayOfFile[i];
      if (localFile.getName().startsWith(str)) {
        localFile.delete();
      }
      i += 1;
    }
  }
}

