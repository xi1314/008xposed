package com.soft.tools.yunData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class g
{
  protected static char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  protected static MessageDigest b = null;
  
  static
  {
    try
    {
      b = MessageDigest.getInstance("MD5");
      return;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {}
  }
  
  public static String a(File paramFile)
    throws IOException
  {
    FileInputStream localFileInputStream = new FileInputStream(paramFile);
    paramFile = localFileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, paramFile.length());
    b.update(paramFile);
    localFileInputStream.close();
    paramFile = b.digest();
    return a(paramFile, paramFile.length);
  }
  
  private static String a(byte[] paramArrayOfByte, int paramInt)
  {
    StringBuffer localStringBuffer = new StringBuffer(paramInt * 2);
    int i = 0;
    for (;;)
    {
      if (i >= paramInt + 0) {
        return localStringBuffer.toString();
      }
      int j = paramArrayOfByte[i];
      char c1 = a[((j & 0xF0) >> 4)];
      char c2 = a[(j & 0xF)];
      localStringBuffer.append(c1);
      localStringBuffer.append(c2);
      i += 1;
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.yunData.g
 * JD-Core Version:    0.7.0.1
 */