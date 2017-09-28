package com.lishu.c.b;

import com.a.a.Map;
import com.a.a.maputils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public final class a
{
  public c a;
  public String b;
  public int c;
  public boolean d = false;
  private Socket e;
  private BufferedReader f;
  private PrintWriter g;
  
  public a(String paramString, int paramInt)
  {
    this.b = paramString;
    this.c = paramInt;
  }
  
  public final void a(String paramString)
  {
    paramString = paramString.replace("\n", "").replace("\r", "");
    this.g.println(paramString);
    this.g.flush();
  }
  
  public final boolean a()
  {
    try
    {
      Object localObject = new Socket();
      ((Socket)localObject).connect(new InetSocketAddress(this.b, this.c), 5000);
      this.g = new PrintWriter(((Socket)localObject).getOutputStream());
      this.f = new BufferedReader(new InputStreamReader(((Socket)localObject).getInputStream()));
      new b(this).start();
      localObject = System.currentTimeMillis();
      Map locale = new Map();
      locale.putkey("heart", localObject);
      a(maputils.creatmap(locale));
      this.d = true;
      return true;
    }
    catch (Exception localException)
    {
      System.out.println("Error" + localException);
      this.d = false;
    }
    return false;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.lishu.saveaccountdatatoFile.Inttolong.XhookMethod

 * JD-Core Version:    0.7.0.1

 */