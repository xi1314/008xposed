package com.a.a.e;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class j
{
  private static final Set a = new HashSet();
  
  public static Set a(Class paramClass, ClassLoader paramClassLoader)
  {
    localHashSet = new HashSet();
    paramClass = paramClass.getName();
    Object localObject = "META-INF/services/" + paramClass;
    paramClass = new HashSet();
    try
    {
      localObject = paramClassLoader.getResources((String)localObject);
      while (((Enumeration)localObject).hasMoreElements())
      {
        URL localURL = (URL)((Enumeration)localObject).nextElement();
        if (!a.contains(localURL.toString()))
        {
          a(localURL, paramClass);
          a.add(localURL.toString());
        }
      }
      String str;
      return localHashSet;
    }
    catch (IOException localIOException)
    {
      paramClass = paramClass.iterator();
      while (paramClass.hasNext())
      {
        str = (String)paramClass.next();
        try
        {
          localHashSet.add(paramClassLoader.loadClass(str).newInstance());
        }
        catch (Exception localException) {}
      }
    }
  }
  
  /* Error */
  private static void a(URL paramURL, Set paramSet)
    throws IOException
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: invokevirtual 97	java/net/URL:openStream	()Ljava/io/InputStream;
    //   6: astore_0
    //   7: new 99	java/io/BufferedReader
    //   10: dup
    //   11: new 101	java/io/InputStreamReader
    //   14: dup
    //   15: aload_0
    //   16: ldc 103
    //   18: invokespecial 106	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   21: invokespecial 109	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   24: astore 4
    //   26: aload 4
    //   28: invokevirtual 112	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   31: astore 5
    //   33: aload 5
    //   35: ifnull +69 -> 104
    //   38: aload 5
    //   40: bipush 35
    //   42: invokevirtual 116	java/lang/String:indexOf	(I)I
    //   45: istore_2
    //   46: aload 5
    //   48: astore_3
    //   49: iload_2
    //   50: iflt +11 -> 61
    //   53: aload 5
    //   55: iconst_0
    //   56: iload_2
    //   57: invokevirtual 120	java/lang/String:substring	(II)Ljava/lang/String;
    //   60: astore_3
    //   61: aload_3
    //   62: invokevirtual 123	java/lang/String:trim	()Ljava/lang/String;
    //   65: astore_3
    //   66: aload_3
    //   67: invokevirtual 127	java/lang/String:length	()I
    //   70: ifeq -44 -> 26
    //   73: aload_1
    //   74: aload_3
    //   75: invokeinterface 72 2 0
    //   80: pop
    //   81: goto -55 -> 26
    //   84: astore 5
    //   86: aload_0
    //   87: astore_3
    //   88: aload 4
    //   90: astore_1
    //   91: aload 5
    //   93: astore_0
    //   94: aload_1
    //   95: invokestatic 132	com/XhookMethod/XhookMethod/packageinfolist/runningappprocessinfolist:XhookMethod	(Ljava/io/Closeable;)V
    //   98: aload_3
    //   99: invokestatic 132	com/XhookMethod/XhookMethod/packageinfolist/runningappprocessinfolist:XhookMethod	(Ljava/io/Closeable;)V
    //   102: aload_0
    //   103: athrow
    //   104: aload 4
    //   106: invokestatic 132	com/XhookMethod/XhookMethod/packageinfolist/runningappprocessinfolist:XhookMethod	(Ljava/io/Closeable;)V
    //   109: aload_0
    //   110: invokestatic 132	com/XhookMethod/XhookMethod/packageinfolist/runningappprocessinfolist:XhookMethod	(Ljava/io/Closeable;)V
    //   113: return
    //   114: astore_0
    //   115: aconst_null
    //   116: astore_1
    //   117: goto -23 -> 94
    //   120: astore 4
    //   122: aconst_null
    //   123: astore_1
    //   124: aload_0
    //   125: astore_3
    //   126: aload 4
    //   128: astore_0
    //   129: goto -35 -> 94
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	132	0	paramURL	URL
    //   0	132	1	paramSet	Set
    //   45	12	2	runningtaskinfolist	int
    //   1	125	3	localObject1	Object
    //   24	81	4	localBufferedReader	java.io.BufferedReader
    //   120	7	4	localObject2	Object
    //   31	23	5	str	String
    //   84	8	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   26	33	84	finally
    //   38	46	84	finally
    //   53	61	84	finally
    //   61	81	84	finally
    //   2	7	114	finally
    //   7	26	120	finally
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.packageinfolist.recenttaskinfolist

 * JD-Core Version:    0.7.0.1

 */