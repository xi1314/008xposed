package b.a.b.a.a;

import b.a.b.a.a.a.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

public class g
  implements HttpEntity
{
  private static final char[] a = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
  private final c b;
  private final Header c;
  private long d;
  private volatile boolean e;
  
  public g(d paramd, Charset paramCharset)
  {
    String str = a();
    d locald = paramd;
    if (paramd == null) {
      locald = d.a;
    }
    this.b = new c("form-data", paramCharset, str, locald);
    this.c = new BasicHeader("Content-Type", a(str, paramCharset));
    this.e = true;
  }
  
  private static String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Random localRandom = new Random();
    int j = localRandom.nextInt(11);
    int i = 0;
    while (i < j + 30)
    {
      localStringBuilder.append(a[localRandom.nextInt(a.length)]);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  protected String a(String paramString, Charset paramCharset)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("multipart/form-data; boundary=");
    localStringBuilder.append(paramString);
    if (paramCharset != null)
    {
      localStringBuilder.append("; charset=");
      localStringBuilder.append(paramCharset.name());
    }
    return localStringBuilder.toString();
  }
  
  public final void a(String paramString, b paramb)
  {
    paramString = new a(paramString, paramb);
    this.b.a(paramString);
    this.e = true;
  }
  
  public void consumeContent()
    throws IOException, UnsupportedOperationException
  {
    if (isStreaming()) {
      throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
    }
  }
  
  public InputStream getContent()
    throws IOException, UnsupportedOperationException
  {
    throw new UnsupportedOperationException("Multipart form entity does not implement #getContent()");
  }
  
  public Header getContentEncoding()
  {
    return null;
  }
  
  public long getContentLength()
  {
    if (this.e)
    {
      this.d = this.b.b();
      this.e = false;
    }
    return this.d;
  }
  
  public Header getContentType()
  {
    return this.c;
  }
  
  public boolean isChunked()
  {
    return !isRepeatable();
  }
  
  public boolean isRepeatable()
  {
    Iterator localIterator = this.b.a().iterator();
    while (localIterator.hasNext()) {
      if (((a)localIterator.next()).a().e() < 0L) {
        return false;
      }
    }
    return true;
  }
  
  public boolean isStreaming()
  {
    return !isRepeatable();
  }
  
  public void writeTo(OutputStream paramOutputStream)
    throws IOException
  {
    this.b.a(paramOutputStream);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     Inttolong.XhookMethod.Inttolong.XhookMethod.XhookMethod.g

 * JD-Core Version:    0.7.0.1

 */