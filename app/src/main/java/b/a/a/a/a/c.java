package b.a.a.a.a;

import java.io.UnsupportedEncodingException;

public final class c
{
  public static String a(byte[] paramArrayOfByte, String paramString)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    try
    {
      paramArrayOfByte = new String(paramArrayOfByte, paramString);
      return paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      throw new IllegalStateException(paramString + ": " + paramArrayOfByte);
    }
  }
}
