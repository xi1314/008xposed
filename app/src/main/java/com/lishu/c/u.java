package com.lishu.c;

import android.util.Log;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

final class u
  extends Thread
{
  u(t paramt, String paramString, w paramw) {}
  
  public final void run()
  {
    Object localObject = new DefaultHttpClient();
    HttpGet localHttpGet = new HttpGet(this.b);
    try
    {
      localObject = ((HttpClient)localObject).execute(localHttpGet);
      Log.i("lishuNet", "resCode = " + ((HttpResponse)localObject).getStatusLine().getStatusCode());
      localObject = EntityUtils.toString(((HttpResponse)localObject).getEntity(), "utf-8");
      this.c.a((String)localObject);
      return;
    }
    catch (ClientProtocolException localClientProtocolException)
    {
      localClientProtocolException.printStackTrace();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.lishu.c.u
 * JD-Core Version:    0.7.0.1
 */