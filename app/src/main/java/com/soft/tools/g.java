package com.soft.tools;

import android.content.DialogInterface;

import de.robv.android.xposed.mods.tutorial.Shell;
import java.io.File;

final class g
  implements DialogInterface.OnClickListener
{
  g(d paramd) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = BackupFileActivity.g(d.a(this.a)).entrySet().iterator();
    for (;;)
    {
      if (!paramDialogInterface.hasNext())
      {
        d.a(this.a).a();
        BackupFileActivity.e(d.a(this.a)).notifyDataSetChanged();
        return;
      }
      paramInt = Integer.parseInt((String)((Map.Entry)paramDialogInterface.next()).getKey());
      if (paramInt < BackupFileActivity.h(d.a(this.a)).size())
      {
        BackupFileActivity.c(d.a(this.a)).getText().toString();
        BackupFileActivity.c(d.a(this.a)).getText().toString().split(",");
        String str = (String)BackupFileActivity.h(d.a(this.a)).get(paramInt);
        str = BackupFileActivity.c() + File.separator + "008backUp" + File.separator + str;
        new File(str).list();
        if (new File(str).exists()) {
          Shell.execCommand("rm -r " + str);
        }
        try
        {
          Thread.sleep(500L);
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
        }
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.runningappprocessinfolist

 * JD-Core Version:    0.7.0.1

 */