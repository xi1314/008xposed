package b.a.b.a.a.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class d
  extends a
{
  private final File a;
  private final String b;
  private final String c;
  
  private d(File paramFile, String paramString)
  {
    super(paramString);
    if (paramFile == null) {
      throw new IllegalArgumentException("File may not be null");
    }
    this.a = paramFile;
    this.b = paramFile.getName();
    this.c = null;
  }
  
  private d(File paramFile, String paramString, byte paramByte)
  {
    this(paramFile, paramString);
  }
  
  public d(File paramFile, String paramString, char paramChar)
  {
    this(paramFile, paramString, (byte)0);
  }
  
  public final void a(OutputStream paramOutputStream)
    throws IOException
  {
    if (paramOutputStream == null) {
      throw new IllegalArgumentException("Output stream may not be null");
    }
    FileInputStream localFileInputStream = new FileInputStream(this.a);
    try
    {
      byte[] arrayOfByte = new byte[4096];
      for (;;)
      {
        int i = localFileInputStream.read(arrayOfByte);
        if (i == -1) {
          break;
        }
        paramOutputStream.write(arrayOfByte, 0, i);
      }
    }
    finally
    {
      localFileInputStream.close();
    }
    localFileInputStream.close();
  }
  
  public final String b()
  {
    return this.b;
  }
  
  public final String c()
  {
    return this.c;
  }
  
  public final String d()
  {
    return "binary";
  }
  
  public final long e()
  {
    return this.a.length();
  }
}


