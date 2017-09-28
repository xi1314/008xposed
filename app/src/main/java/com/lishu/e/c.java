package com.lishu.e;

import java.security.Key;
import java.security.KeyFactory;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

public final class c
{
  static String a = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCBzuzNBKunvcW2mMbCnfo94p1cYbGUU9HNnqKp/9zN8ADXBacfUFUC7dO7+n5lGrZsrJ4yecYqO8Pr9pFspitiWD0UPz3B/RTidi3ONrAFQzrjbP4YfIQ7c/KVp/d313nIxhCh2+t1RfAVfcNxiEVi8gjkdh56j38QDgNsAsoAIwIDAQAB";
  private static String b = "5ygTCo2JjGGGDvOkfVTo5A==";
  
  public static String a(String paramString)
  {
    try
    {
      paramString = paramString.getBytes("UTF-8");
      Object localObject = new X509EncodedKeySpec(a.a(a));
      localObject = KeyFactory.getInstance("RSA").generatePublic((KeySpec)localObject);
      Cipher localCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
      localCipher.init(1, (Key)localObject);
      paramString = b.a(localCipher.doFinal(paramString));
      return paramString;
    }
    catch (Exception paramString) {}
    return "";
  }
  
  public static String b(String paramString)
  {
    try
    {
      paramString = b.a(paramString.toCharArray());
      Object localObject = new X509EncodedKeySpec(a.a(a));
      localObject = KeyFactory.getInstance("RSA").generatePublic((KeySpec)localObject);
      Cipher localCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
      localCipher.init(2, (Key)localObject);
      paramString = new String(localCipher.doFinal(paramString), "utf-8");
      return paramString;
    }
    catch (Exception paramString) {}
    return "";
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.lishu.Map.c

 * JD-Core Version:    0.7.0.1

 */