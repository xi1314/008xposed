package com.lishu.c;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class s
  extends Thread
{
  s(r paramr, String paramString, HashMap paramHashMap, w paramw) {}
  
  public final void run()
  {
    String str1 = "";
    for (;;)
    {
      Object localObject3;
      try
      {
        if (this.b.indexOf("?") < 0) {
          break label532;
        }
        int i = this.b.indexOf("?");
        str1 = this.b.substring(i + 1, this.b.length());
        localObject1 = this.b.substring(0, i);
        Object localObject2 = new String[this.c.size()];
        localObject3 = this.c.entrySet().iterator();
        i = 0;
        if (!((Iterator)localObject3).hasNext())
        {
          localObject2 = new URL((String)localObject1).openConnection();
          localObject1 = (HttpURLConnection)localObject2;
          ((HttpURLConnection)localObject1).setRequestMethod("POST");
          ((HttpURLConnection)localObject1).setConnectTimeout(20000);
          ((HttpURLConnection)localObject1).setReadTimeout(20000);
          ((URLConnection)localObject2).setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
          ((HttpURLConnection)localObject1).setUseCaches(false);
          ((URLConnection)localObject2).setDoOutput(true);
          ((URLConnection)localObject2).setDoInput(true);
          ((URLConnection)localObject2).connect();
          localObject3 = ((URLConnection)localObject2).getOutputStream();
          ((OutputStream)localObject3).write(str1.getBytes("utf-8"));
          ((OutputStream)localObject3).flush();
          ((OutputStream)localObject3).close();
          if (((HttpURLConnection)localObject1).getResponseCode() != 200)
          {
            r.e = "statusCode: " + ((HttpURLConnection)localObject1).getResponseCode();
            this.d.a("");
          }
        }
        else
        {
          Object localObject4 = (Map.Entry)((Iterator)localObject3).next();
          String str3 = (String)((Map.Entry)localObject4).getKey();
          localObject4 = (String)((Map.Entry)localObject4).getValue();
          if (str1.length() <= 0) {
            break label529;
          }
          str1 = str1 + "&";
          localObject2[i] = localObject4;
          str1 = str1 + URLEncoder.encode(str3, "utf-8") + "=" + URLEncoder.encode((String)localObject4, "utf-8");
          i += 1;
          continue;
        }
        localObject2 = new BufferedReader(new InputStreamReader(((URLConnection)localObject2).getInputStream()));
        str1 = "";
        localObject3 = ((BufferedReader)localObject2).readLine();
        if (localObject3 == null)
        {
          str1 = str1.trim();
          ((BufferedReader)localObject2).close();
          ((HttpURLConnection)localObject1).disconnect();
          if (str1.length() != 0) {
            break label511;
          }
          this.d.a("");
          return;
        }
      }
      catch (Exception localException)
      {
        r.e = "error: " + localException.getMessage();
        this.d.a("");
        localException.printStackTrace();
        return;
      }
      String str2 = localException + "\n" + (String)localObject3;
      continue;
      label511:
      if (this.d == null) {
        break;
      }
      this.d.a(str2);
      return;
      label529:
      continue;
      label532:
      Object localObject1 = "";
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.lishu.c.s
 * JD-Core Version:    0.7.0.1
 */