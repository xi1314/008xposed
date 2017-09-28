package com.soft.tools.yunData;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class a
{
  private c a;
  private ExecutorService b = Executors.newSingleThreadExecutor();
  
  public final void a(c paramc)
  {
    this.a = paramc;
  }
  
  public final void a(String paramString1, File paramFile, String paramString2)
  {
    this.b.submit(new b(this, paramString1, paramFile, paramString2));
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.yunData.XhookMethod

 * JD-Core Version:    0.7.0.1

 */