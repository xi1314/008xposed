package com.soft.tools.yunData;

import android.util.Log;
import b.a.b.a.a.a.e;
import b.a.b.a.a.g;
import com.lishu.c.w;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

final class f
  extends Thread
{
  f(d paramd, HashMap paramHashMap, String paramString) {}
  
  public final void run()
  {
    int i = 0;
    Object localObject2 = new h(b.a.b.a.a.d.b, Charset.forName("UTF-8"));
    Object localObject1;
    Object localObject3;
    if (this.b != null)
    {
      localObject1 = this.b.entrySet().iterator();
      if (((Iterator)localObject1).hasNext()) {}
    }
    else
    {
      localObject3 = new DefaultHttpClient();
      localObject1 = (w)this.a.a.get(this.c);
      this.a.a.remove(this.c);
      Log.d("url", this.c);
    }
    try
    {
      localObject4 = new HttpPost(this.c);
      if (d.a() != null) {
        ((HttpPost)localObject4).setHeader("Cookie", "JSESSIONID=" + d.a());
      }
      ((HttpPost)localObject4).setEntity((HttpEntity)localObject2);
      localObject2 = ((HttpClient)localObject3).execute((HttpUriRequest)localObject4);
      Log.i("lishuNet", "resCode = " + ((HttpResponse)localObject2).getStatusLine().getStatusCode());
      localObject2 = EntityUtils.toString(((HttpResponse)localObject2).getEntity(), "utf-8");
      Log.i("lishuNet", "result = " + (String)localObject2);
      localObject3 = ((AbstractHttpClient)localObject3).getCookieStore().getCookies();
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException1)
    {
      for (;;)
      {
        Object localObject4;
        ((w)localObject1).a("");
        localUnsupportedEncodingException1.printStackTrace();
        return;
        i += 1;
      }
    }
    catch (ClientProtocolException localClientProtocolException)
    {
      ((w)localObject1).a("");
      localClientProtocolException.printStackTrace();
      return;
    }
    catch (IOException localIOException)
    {
      ((w)localObject1).a("");
      localIOException.printStackTrace();
    }
    if (i >= ((List)localObject3).size()) {}
    for (;;)
    {
      for (;;)
      {
        if (localObject1 != null) {
          ((w)localObject1).a((String)localObject2);
        }
        return;
        localObject4 = (Map.Entry)((Iterator)localObject1).next();
        localObject3 = (String)((Map.Entry)localObject4).getKey();
        localObject4 = ((Map.Entry)localObject4).getValue();
        if ((localObject4 instanceof File))
        {
          ((g)localObject2).a((String)localObject3, new b.a.b.a.a.a.d((File)localObject4, "text/plain", '\000'));
          break;
        }
        try
        {
          ((g)localObject2).a((String)localObject3, new e(localObject4, Charset.forName("UTF-8")));
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          localUnsupportedEncodingException2.printStackTrace();
        }
      }
      break;
      if (!"JSESSIONID".equals(((Cookie)localUnsupportedEncodingException2.get(i)).getName())) {
        break label433;
      }
      d.a(((Cookie)localUnsupportedEncodingException2.get(i)).getValue());
    }
    label433:
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.yunData.type

 * JD-Core Version:    0.7.0.1

 */