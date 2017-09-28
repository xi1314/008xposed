package com.lishu.c;

import com.lishu.e.c;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import de.robv.android.xposed.mods.tutorial.sysstr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

final class q
  extends Thread
{
  q(p paramp, HashMap paramHashMap, String paramString, w paramw) {}
  
  public final void run()
  {
    String str2;
    Object localObject4;
    Object localObject2;
    Object localObject5;
    try
    {
      this.b.put("verCode008new", "12");
      str2 = System.currentTimeMillis();
      this.b.put("sysTime", str2);
      String str1 = PoseHelper008.getFileData("Key008");
      this.b.put("Key008", str1);
      localObject3 = new String[this.b.size()];
      localObject4 = this.b.entrySet().iterator();
      int i = 0;
      str1 = "";
      int j;
      if (!((Iterator)localObject4).hasNext())
      {
        Arrays.sort((Object[])localObject3);
        j = localObject3.length;
        localObject2 = "";
        i = 0;
      }
      for (;;)
      {
        if (i >= j)
        {
          localObject4 = v.a(localObject2 + "apk008");
          localObject5 = new URL(this.c);
          if (p.b(p.a(((URL)localObject5).toURI().toString()))) {
            break label371;
          }
          return;
          localObject2 = (Map.Entry)((Iterator)localObject4).next();
          localObject5 = (String)((Map.Entry)localObject2).getKey();
          localObject6 = (String)((Map.Entry)localObject2).getValue();
          localObject2 = str1;
          if (str1.length() > 0) {
            localObject2 = str1 + "&";
          }
          localObject3[i] = localObject6;
          str1 = localObject2 + URLEncoder.encode((String)localObject5, "utf-8") + "=" + URLEncoder.encode((String)localObject6, "utf-8");
          i += 1;
          break;
        }
        localObject4 = localObject3[i];
        localObject2 = localObject2 + (String)localObject4;
        i += 1;
      }
      label371:
      localObject3 = ((URL)localObject5).openConnection();
      localObject2 = (HttpURLConnection)localObject3;
      Object localObject6 = this.a;
      if (!p.b(p.a((URL)localObject5))) {
        return;
      }
      ((HttpURLConnection)localObject2).setRequestMethod("POST");
      ((HttpURLConnection)localObject2).setRequestProperty("apk008", (String)localObject4);
      ((HttpURLConnection)localObject2).setRequestProperty("apk0082", c.a((String)localObject4));
      ((HttpURLConnection)localObject2).setConnectTimeout(20000);
      ((HttpURLConnection)localObject2).setReadTimeout(20000);
      if (p.a != null) {
        ((HttpURLConnection)localObject2).setRequestProperty("Cookie", "JSESSIONID=" + p.a + ";");
      }
      ((URLConnection)localObject3).setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
      ((HttpURLConnection)localObject2).setUseCaches(false);
      ((URLConnection)localObject3).setDoOutput(true);
      ((URLConnection)localObject3).setDoInput(true);
      ((URLConnection)localObject3).connect();
      localObject4 = ((URLConnection)localObject3).getOutputStream();
      ((OutputStream)localObject4).write(str1.getBytes("utf-8"));
      ((OutputStream)localObject4).flush();
      ((OutputStream)localObject4).close();
      if (((HttpURLConnection)localObject2).getResponseCode() != 200)
      {
        p.d = "statusCode: " + ((HttpURLConnection)localObject2).getResponseCode();
        this.d.a("");
        return;
      }
    }
    catch (Exception localException)
    {
      p.d = "error: " + localException.getMessage();
      this.d.a("");
      localException.printStackTrace();
      return;
    }
    Object localObject3 = new BufferedReader(new InputStreamReader(((URLConnection)localObject3).getInputStream()));
    for (Object localObject1 = "";; localObject1 = localObject1 + "\n" + (String)localObject4)
    {
      localObject4 = ((BufferedReader)localObject3).readLine();
      if (localObject4 == null)
      {
        localObject1 = ((String)localObject1).trim();
        ((BufferedReader)localObject3).close();
        ((HttpURLConnection)localObject2).disconnect();
        if (((String)localObject1).length() != 0) {
          break;
        }
        this.d.a("");
        return;
      }
    }
    localObject3 = this.a;
    if (p.b(p.a(((HttpURLConnection)localObject2).getURL())))
    {
      localObject4 = ((HttpURLConnection)localObject2).getHeaderField("Set-Cookie");
      localObject3 = ((HttpURLConnection)localObject2).getHeaderField("apk008");
      if ((localObject3 == null) || (((String)localObject3).length() == 0))
      {
        localObject5 = this.a;
        p.a();
      }
      if ((localObject4 != null) && (((String)localObject4).length() > 0))
      {
        System.out.println("cookie value:" + (String)localObject4);
        p.a = ((String)localObject4).substring(11, ((String)localObject4).indexOf(";"));
      }
      localObject4 = ((HttpURLConnection)localObject2).getHeaderField("apk0082");
      if ((localObject4 == null) || (((String)localObject4).length() == 0))
      {
        p.d = "errorCode:111";
        this.d.a("");
        return;
      }
      localObject4 = c.b((String)localObject4);
      if ((localObject4 == null) || (((String)localObject4).length() == 0))
      {
        p.d = "errorCode:112";
        this.d.a("");
        return;
      }
      localObject5 = ((HttpURLConnection)localObject2).getHeaderField("Key008");
      if (localObject5 != null) {
        PoseHelper008.saveDataToFile("Key008", (String)localObject5);
      }
      if (this.d != null)
      {
        localObject1 = n.a((String)localObject1, p.a);
        str2 = v.a(((String)localObject1).length() + str2);
        if (!((String)localObject3).equals(str2))
        {
          localObject1 = this.a;
          p.a();
          return;
        }
        localObject3 = sysstr.a();
        if (!((String)localObject4).equals(str2 + (String)localObject3))
        {
          p.d = "连接服务器失败，请重新，如果还不行，请联系客服或者到官网下载新版本  【www.apk008.com】\n  errorCode:101";
          this.d.a("");
        }
        p.d = "statusCode: " + ((HttpURLConnection)localObject2).getResponseCode();
        this.d.a((String)localObject1);
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.lishu.c.q

 * JD-Core Version:    0.7.0.1

 */