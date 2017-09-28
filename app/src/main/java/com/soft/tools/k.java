package com.soft.tools;

import com.lishu.c.a;

import de.robv.android.xposed.mods.tutorial.Shell;

final class k
  extends Thread
{
  k(j paramj, int paramInt, String[] paramArrayOfString) {}
  
  public final void run()
  {
    String str1 = Shell.execCommandWithResult("cat /data/system/packages.list", true);
    String str2 = (String)BackupFileActivity.h(j.a(this.a)).get(this.b);
    String[] arrayOfString1 = this.c;
    int k = arrayOfString1.length;
    int i = 0;
    String str3;
    String[] arrayOfString2;
    int j;
    for (;;)
    {
      if (i >= k)
      {
        j.a(this.a).runOnUiThread(new l(this));
        return;
      }
      str3 = arrayOfString1[i];
      j.a(this.a);
      arrayOfString2 = BackupFileActivity.b(str2).list();
      int m = arrayOfString2.length;
      j = 0;
      if (j < m) {
        break;
      }
      i += 1;
    }
    int n;
    if (arrayOfString2[j].equals(str3))
    {
      n = str1.indexOf(str3);
      if (n >= 0) {
        break label178;
      }
      a.c(j.a(this.a).getParent(), "发生错误：未找到" + str3 + "的uid，请重新安装应用再试");
    }
    for (;;)
    {
      j += 1;
      break;
      label178:
      int i1 = str1.indexOf(" ", str3.length() + n + 1);
      String str4 = str1.substring(n + str3.length() + 1, i1).trim();
      BackupFileActivity.a(j.a(this.a), str3, str2, str4);
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.k

 * JD-Core Version:    0.7.0.1

 */