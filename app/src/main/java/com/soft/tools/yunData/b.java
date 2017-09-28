package com.soft.tools.yunData;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

final class b
  extends Thread
{
  b(a parama, String paramString1, File paramFile, String paramString2) {}
  
  public final void run()
  {
    try
    {
      Object localObject1 = new DefaultHttpClient().execute(new HttpGet(this.b)).getEntity();
      ((HttpEntity)localObject1).getContentLength();
      Object localObject2 = ((HttpEntity)localObject1).getContent();
      localObject1 = null;
      byte[] arrayOfByte;
      if (localObject2 != null)
      {
        localObject1 = new FileOutputStream(this.c);
        arrayOfByte = new byte[1024];
      }
      for (;;)
      {
        int i = ((InputStream)localObject2).read(arrayOfByte);
        if (i == -1)
        {
          ((FileOutputStream)localObject1).flush();
          if (localObject1 != null) {
            ((FileOutputStream)localObject1).close();
          }
          if (a.a(this.a) == null) {
            break;
          }
          localObject1 = a.a(this.a);
          localObject2 = this.d;
          ((c)localObject1).a();
          return;
        }
        ((FileOutputStream)localObject1).write(arrayOfByte, 0, i);
        if (a.a(this.a) != null) {
          a.a(this.a);
        }
      }
      c localc;
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      if (a.a(this.a) != null)
      {
        localc = a.a(this.a);
        localObject2 = this.d;
        localc.b();
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.yunData.Inttolong

 * JD-Core Version:    0.7.0.1

 */