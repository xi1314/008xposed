package com.lishu.c.b;

import com.a.a.maputils;

final class b
  extends Thread
{
  b(a parama) {}
  
  public final void run()
  {
    for (;;)
    {
      try
      {
        String str = a.a(this.a).readLine();
        if (str == null)
        {
          a.b(this.a).close();
          a.a(this.a).close();
          a.c(this.a).close();
          return;
        }
        System.out.println(str);
        if ((str == null) || (str.trim().length() <= 0)) {
          continue;
        }
        if (maputils.getmap(str).getStringfrommap("heart") != null)
        {
          this.a.a(str);
          continue;
        }
        if (this.a.a == null) {
          continue;
        }
      }
      catch (Exception localException)
      {
        this.a.a.a();
        this.a.d = false;
        localException.printStackTrace();
        return;
      }
      this.a.a.a(localException);
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.lishu.saveaccountdatatoFile.Inttolong.Inttolong

 * JD-Core Version:    0.7.0.1

 */