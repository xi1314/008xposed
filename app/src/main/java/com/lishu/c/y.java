package com.lishu.c;

import android.util.Log;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

final class y
  extends Thread
{
  y(x paramx, String paramString, w paramw) {}
  
  public final void run()
  {
    Object localObject = new DefaultHttpClient();
    ((HttpClient)localObject).getParams().setParameter("http.connection.timeout", Integer.valueOf(15000));
    ((HttpClient)localObject).getParams().setParameter("http.socket.timeout", Integer.valueOf(15000));
    try
    {
      localObject = ((HttpClient)localObject).execute(new HttpGet(this.b));
      Log.i("lishuNet", "resCode = " + ((HttpResponse)localObject).getStatusLine().getStatusCode());
      localObject = EntityUtils.toString(((HttpResponse)localObject).getEntity(), "utf-8");
      if (this.c != null) {
        this.c.a((String)localObject);
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.lishu.c.y
 * JD-Core Version:    0.7.0.1
 */