package com.soft.tools;

import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public final class y
{
  public static String a = "dada" + 1530.0D / Math.sqrt(100.0D);
  
  public static String a(byte[] paramArrayOfByte)
    throws Exception
  {
    SecureRandom localSecureRandom = new SecureRandom();
    Object localObject = new DESKeySpec(a.getBytes());
    localObject = SecretKeyFactory.getInstance("DES").generateSecret((KeySpec)localObject);
    Cipher localCipher = Cipher.getInstance("DES");
    localCipher.init(2, (Key)localObject, localSecureRandom);
    return new String(localCipher.doFinal(paramArrayOfByte), "UTF-8");
  }
  
  public static byte[] a(String paramString)
  {
    try
    {
      paramString = paramString.getBytes("UTF-8");
      SecureRandom localSecureRandom = new SecureRandom();
      Object localObject = new DESKeySpec(a.getBytes());
      localObject = SecretKeyFactory.getInstance("DES").generateSecret((KeySpec)localObject);
      Cipher localCipher = Cipher.getInstance("DES");
      localCipher.init(1, (Key)localObject, localSecureRandom);
      paramString = localCipher.doFinal(paramString);
      return paramString;
    }
    catch (Throwable paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.y
 * JD-Core Version:    0.7.0.1
 */