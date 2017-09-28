package b.a.b.a.a.a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public final class e
  extends a
{
  private final byte[] a;
  private final Charset b;
  
  private e(String paramString1, String paramString2, Charset paramCharset)
    throws UnsupportedEncodingException
  {
    super(paramString2);
    if (paramString1 == null) {
      throw new IllegalArgumentException("Text may not be null");
    }
    paramString2 = paramCharset;
    if (paramCharset == null) {
      paramString2 = Charset.forName("US-ASCII");
    }
    this.a = paramString1.getBytes(paramString2.name());
    this.b = paramString2;
  }
  
  public e(String paramString, Charset paramCharset)
    throws UnsupportedEncodingException
  {
    this(paramString, "text/plain", paramCharset);
  }
  
  public final void a(OutputStream paramOutputStream)
    throws IOException
  {
    if (paramOutputStream == null) {
      throw new IllegalArgumentException("Output stream may not be null");
    }
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(this.a);
    byte[] arrayOfByte = new byte[4096];
    for (;;)
    {
      int i = localByteArrayInputStream.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      paramOutputStream.write(arrayOfByte, 0, i);
    }
    paramOutputStream.flush();
  }
  
  public final String b()
  {
    return null;
  }
  
  public final String c()
  {
    return this.b.name();
  }
  
  public final String d()
  {
    return "8bit";
  }
  
  public final long e()
  {
    return this.a.length;
  }
}


