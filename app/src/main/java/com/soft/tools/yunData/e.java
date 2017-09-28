package com.soft.tools.yunData;

import android.util.Log;
import com.lishu.c.w;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

final class e
  extends Thread
{
  e(d paramd, HashMap paramHashMap, String paramString) {}
  
  public final void run()
  {
    Object localObject2 = new LinkedList();
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
      ((HttpClient)localObject3).getParams().setParameter("http.connection.timeout", Integer.valueOf(15000));
      ((HttpClient)localObject3).getParams().setParameter("http.socket.timeout", Integer.valueOf(15000));
      localObject1 = (w)this.a.a.get(this.c);
      this.a.a.remove(this.c);
      Log.d("url", this.c);
    }
    try
    {
      HttpPost localHttpPost = new HttpPost(this.c);
      if (d.a() != null) {
        localHttpPost.setHeader("Cookie", "JSESSIONID=" + d.a());
      }
      localHttpPost.setEntity(new UrlEncodedFormEntity((List)localObject2, "utf-8"));
      localObject2 = ((HttpClient)localObject3).execute(localHttpPost);
      Log.i("lishuNet", "resCode = " + ((HttpResponse)localObject2).getStatusLine().getStatusCode());
      localObject2 = EntityUtils.toString(((HttpResponse)localObject2).getEntity(), "utf-8");
      Log.i("lishuNet", "result = " + (String)localObject2);
      localObject3 = ((AbstractHttpClient)localObject3).getCookieStore().getCookies();
      i = 0;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        int i;
        ((w)localObject1).a("");
        localUnsupportedEncodingException.printStackTrace();
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
      if (localObject1 != null) {
        ((w)localObject1).a((String)localObject2);
      }
      return;
      localObject3 = (Map.Entry)((Iterator)localObject1).next();
      ((LinkedList)localObject2).add(new BasicNameValuePair((String)((Map.Entry)localObject3).getKey(), (String)((Map.Entry)localObject3).getValue()));
      break;
      if (!"JSESSIONID".equals(((Cookie)((List)localObject3).get(i)).getName())) {
        break label412;
      }
      d.a(((Cookie)((List)localObject3).get(i)).getValue());
    }
    label412:
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.yunData.Map

 * JD-Core Version:    0.7.0.1

 */