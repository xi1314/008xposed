package com.soft.apk008;

import android.widget.TextView;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class n
  implements Runnable
{
  n(Apk008Activity paramApk008Activity, String paramString1, String paramString2, String paramString3, String paramString4) {}
  
  public final void run()
  {
    Apk008Activity.g(this.a).setText(this.b);
    Apk008Activity.e(this.a).setText("ID:" + this.c);
    if (this.d.equals("true"))
    {
      Apk008Activity.g(this.a).setText("已经到期");
      if (!PoseHelper008.getFileData("preStatus").equals("true"))
      {
        PoseHelper008.saveDataToFile("fresh", "true");
        PoseHelper008.saveDataToFile("preStatus", "true");
      }
      if (!this.e.equals("null")) {
        break label163;
      }
      this.a.b();
    }
    label163:
    while (!Apk008Activity.b)
    {
      return;
      this.a.runOnUiThread(new o(this));
      if (PoseHelper008.getFileData("preStatus").equals("false")) {
        break;
      }
      PoseHelper008.saveDataToFile("preStatus", "false");
      PoseHelper008.saveDataToFile("fresh", "true");
      break;
    }
    Apk008Activity.b = false;
    this.a.runOnUiThread(new p(this, this.e));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.n
 * JD-Core Version:    0.7.0.1
 */