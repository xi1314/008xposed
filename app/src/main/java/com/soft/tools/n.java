package com.soft.tools;

import android.content.DialogInterface;

import de.robv.android.xposed.mods.tutorial.Shell;

import java.io.File;

final class n
  implements DialogInterface.OnClickListener
{
  n(m paramm, int paramInt, String[] paramArrayOfString) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = (String)BackupFileActivity.h(this.a.a).get(this.b);
    String[] arrayOfString = this.c;
    int j = arrayOfString.length;
    paramInt = 0;
    for (;;)
    {
      if (paramInt >= j) {}
      try
      {
        Thread.sleep(500L);
        this.a.a.a();
        BackupFileActivity.e(this.a.a).notifyDataSetChanged();
        return;
        String str1 = arrayOfString[paramInt];
        Object localObject = this.a.a;
        localObject = BackupFileActivity.b(paramDialogInterface).list();
        int k = localObject.length;
        int i = 0;
        for (;;)
        {
          if (i >= k)
          {
            paramInt += 1;
            break;
          }
          String str2 = localObject[i];
          if (str2.equals(str1)) {
            Shell.execCommand("rm  -r " + BackupFileActivity.c() + File.separator + "008backUp" + File.separator + paramDialogInterface + File.separator + str2);
          }
          i += 1;
        }
      }
      catch (InterruptedException paramDialogInterface)
      {
        for (;;)
        {
          paramDialogInterface.printStackTrace();
        }
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.n

 * JD-Core Version:    0.7.0.1

 */