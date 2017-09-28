package com.imengququ.myxposed.soft.tools;

import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class DESUtil
{
  public static String password = "dada" + 1530.0D / Math.sqrt(100.0D);
  
  public static String decrypt(byte[] paramArrayOfByte)
    throws Exception
  {
    SecureRandom localSecureRandom = new SecureRandom();
    Object localObject = new DESKeySpec(password.getBytes());
    localObject = SecretKeyFactory.getInstance("DES").generateSecret((KeySpec)localObject);
    Cipher localCipher = Cipher.getInstance("DES");
    localCipher.init(2, (Key)localObject, localSecureRandom);
    return new String(localCipher.doFinal(paramArrayOfByte), "UTF-8");
  }
  
  public static byte[] encrypto(String paramString)
  {
    try
    {
      byte[] bytes = paramString.getBytes("UTF-8");
      SecureRandom localSecureRandom = new SecureRandom();
      Object localObject = new DESKeySpec(password.getBytes());
      localObject = SecretKeyFactory.getInstance("DES").generateSecret((KeySpec)localObject);
      Cipher localCipher = Cipher.getInstance("DES");
      localCipher.init(1, (Key)localObject, localSecureRandom);
      byte[] String = localCipher.doFinal(bytes);
      return String;
    }
    catch (Throwable throwable)
    {
      throwable.printStackTrace();
    }
    return null;
  }
}


