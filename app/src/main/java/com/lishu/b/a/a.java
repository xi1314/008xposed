package com.lishu.b.a;

import android.os.Environment;
import android.util.Log;

import com.a.a.Map;
import com.a.a.maputils;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import org.apache.http.util.EncodingUtils;

public final class a
{
  public static HashMap a = new HashMap();
  static String b = "";
  static Random c = new Random();
  
  static
  {
    c();
  }
  
  public static void a()
  {
    a.clear();
    c();
  }
  
  private static void a(File paramFile)
  {
    ArrayList localArrayList = new ArrayList();
    if (!paramFile.exists()) {
      try
      {
        paramFile.createNewFile();
        return;
      }
      catch (IOException paramFile)
      {
        paramFile.printStackTrace();
        return;
      }
    }
    for (;;)
    {
      try
      {
        FileInputStream localFileInputStream = new FileInputStream(paramFile);
        localObject1 = new byte[localFileInputStream.available()];
        localFileInputStream.read((byte[])localObject1);
        localObject1 = EncodingUtils.getString((byte[])localObject1, "UTF-8");
        if (((String)localObject1).length() > 0)
        {
          localObject1 = (ArrayList) maputils.creatmap((String)localObject1, ArrayList.class);
          if ((localObject1 != null) && (((ArrayList)localObject1).size() > 0))
          {
            localObject1 = ((ArrayList)localObject1).iterator();
            if (((Iterator)localObject1).hasNext()) {
              continue;
            }
          }
        }
        localFileInputStream.close();
      }
      catch (Exception localException)
      {
        Object localObject1;
        Object localObject2;
        HashMap localHashMap;
        localException.printStackTrace();
        continue;
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
        localHashMap.put((String)localEntry.getKey(), localEntry.getValue());
        continue;
      }
      a.put(paramFile.getName(), localArrayList);
      return;
      localObject2 = (Map)((Iterator)localObject1).next();
      localHashMap = new HashMap();
      localObject2 = ((Map)localObject2).entrySet().iterator();
      if (((Iterator)localObject2).hasNext()) {
        continue;
      }
      localArrayList.add(localHashMap);
    }
  }
  
  public static void a(String paramString, Map parame)
  {
    ArrayList localArrayList;
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramString = new Date().getTime();
      com.soft.apk008.HistoryActivity.a = paramString;
      localArrayList = new ArrayList();
      a.put(paramString, localArrayList);
    }
    label85:
    label97:
    label118:
    label378:
    for (;;)
    {
      String str = parame.getStringfrommap(com.soft.apk008.SetMessageActivity.a[0]);
      Object localObject1 = new HashMap();
      Iterator localIterator = localArrayList.iterator();
      int i;
      if (!localIterator.hasNext())
      {
        i = 0;
        if (i != 0) {
          parame.remove("time");
        }
        parame = parame.entrySet().iterator();
        if (parame.hasNext()) {
          break label310;
        }
        if (i == 0)
        {
          localArrayList.add(localObject1);
          ((HashMap)localObject1).put("time", new Date().getTime());
        }
        parame = PoseHelper008.getFileData("HistoryActivity_maxNum");
      }
      for (;;)
      {
        try
        {
          int j = Integer.parseInt(parame);
          if ((j > 0) && (localArrayList.size() > j))
          {
            int k = localArrayList.size();
            i = 0;
            if (i < k - j) {
              continue;
            }
          }
        }
        catch (Exception parame)
        {
          Object localObject2;
          continue;
        }
        d(paramString);
        return;
        localArrayList = (ArrayList)a.get(paramString);
        if (localArrayList != null) {
          break label378;
        }
        localArrayList = new ArrayList();
        a.put(paramString, localArrayList);
        break;
        localObject2 = (HashMap)localIterator.next();
        if ((((HashMap)localObject2).get(com.soft.apk008.SetMessageActivity.a[0]) == null) || (!((String)((HashMap)localObject2).get(com.soft.apk008.SetMessageActivity.a[0])).equals(str))) {
          break label85;
        }
        i = 1;
        localObject1 = localObject2;
        break label97;
        localObject2 = (Map.Entry)parame.next();
        ((HashMap)localObject1).put((String)((Map.Entry)localObject2).getKey(), ((Map.Entry)localObject2).getValue());
        break label118;
        localArrayList.remove(i);
        i += 1;
      }
    }
  }
  
  public static void a(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = (ArrayList)a.get(paramString1);
    if (localObject == null) {
      return;
    }
    localObject = ((ArrayList)localObject).iterator();
    HashMap localHashMap;
    do
    {
      if (!((Iterator)localObject).hasNext())
      {
        d(paramString1);
        return;
      }
      localHashMap = (HashMap)((Iterator)localObject).next();
    } while (!((String)localHashMap.get(com.soft.apk008.SetMessageActivity.a[0])).equals(paramString2));
    localHashMap.put("tagName", paramString3);
    d(paramString1);
    Log.d("lishu", "update item");
  }
  
  public static boolean a(String paramString)
  {
    if ((ArrayList)a.get(paramString) != null) {
      return false;
    }
    ArrayList localArrayList = new ArrayList();
    a.put(paramString, localArrayList);
    d(paramString);
    return true;
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    paramString1 = c(paramString1);
    a(paramString2);
    a.put(paramString2, paramString1);
    return true;
  }
  
  public static HashMap b(String paramString1, String paramString2)
  {
    paramString1 = (ArrayList)a.get(paramString1);
    if (paramString1 == null) {
      return null;
    }
    paramString1 = paramString1.iterator();
    HashMap localHashMap;
    do
    {
      if (!paramString1.hasNext()) {
        return null;
      }
      localHashMap = (HashMap)paramString1.next();
    } while (!((String)localHashMap.get(com.soft.apk008.SetMessageActivity.a[0])).equals(paramString2));
    return localHashMap;
  }
  
  public static void b(String paramString)
  {
    ArrayList localArrayList = (ArrayList)a.get(paramString);
    if (localArrayList == null) {
      return;
    }
    localArrayList.clear();
    d(paramString);
  }
  
  public static String[] b()
  {
    int j = 0;
    String[] arrayOfString = new String[a.size()];
    Object localObject = a.entrySet().iterator();
    int i = 0;
    if (!((Iterator)localObject).hasNext())
    {
      Arrays.sort(arrayOfString);
      localObject = new String[arrayOfString.length];
      i = j;
    }
    for (;;)
    {
      if (i >= arrayOfString.length)
      {
        return localObject;
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        arrayOfString[i] = ((String)localEntry.getKey());
        localEntry.getValue();
        i += 1;
        break;
      }
      localObject[i] = arrayOfString[(arrayOfString.length - 1 - i)];
      i += 1;
    }
  }
  
  public static ArrayList c(String paramString)
  {
    ArrayList localArrayList = (ArrayList)a.get(paramString);
    a.remove(paramString);
    paramString = new File(d() + File.separator + paramString);
    if (paramString.exists()) {
      paramString.delete();
    }
    return localArrayList;
  }
  
  private static void c()
  {
    Object localObject = new File(Environment.getExternalStorageDirectory(), "kind");
    b = ((File)localObject).getAbsolutePath();
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdir();
    }
    int i;
    if (((File)localObject).isDirectory())
    {
      localObject = ((File)localObject).listFiles();
      if ((localObject != null) && (localObject.length != 0)) {
        i = 0;
      }
    }
    for (;;)
    {
      if (i >= localObject.length) {
        return;
      }
      a(localObject[i]);
      i += 1;
    }
  }
  
  public static void c(String paramString1, String paramString2)
  {
    ArrayList localArrayList = (ArrayList)a.get(paramString1);
    if (localArrayList == null) {}
    HashMap localHashMap;
    do
    {
      return;
      Iterator localIterator;
      while (!localIterator.hasNext()) {
        localIterator = localArrayList.iterator();
      }
      localHashMap = (HashMap)localIterator.next();
    } while (!((String)localHashMap.get(com.soft.apk008.SetMessageActivity.a[0])).equals(paramString2));
    localArrayList.remove(localHashMap);
    d(paramString1);
  }
  
  private static String d()
  {
    String str = new File(Environment.getExternalStorageDirectory(), "kind").getAbsolutePath();
    b = str;
    return str;
  }
  
  /* Error */
  private static void d(String paramString)
  {
    // Byte code:
    //   0: getstatic 19	com/lishu/Inttolong/XhookMethod/XhookMethod:XhookMethod	Ljava/util/HashMap;
    //   3: aload_0
    //   4: invokevirtual 196	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   7: checkcast 41	java/util/ArrayList
    //   10: astore_1
    //   11: aload_1
    //   12: ifnonnull +4 -> 16
    //   15: return
    //   16: new 44	java/io/File
    //   19: dup
    //   20: new 132	java/lang/StringBuilder
    //   23: dup
    //   24: invokestatic 235	com/lishu/Inttolong/XhookMethod/XhookMethod:getMap	()Ljava/lang/String;
    //   27: invokestatic 238	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   30: invokespecial 158	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   33: getstatic 241	java/io/File:separator	Ljava/lang/String;
    //   36: invokevirtual 244	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: aload_0
    //   40: invokevirtual 244	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: invokespecial 245	java/io/File:<init>	(Ljava/lang/String;)V
    //   49: astore_0
    //   50: aload_0
    //   51: invokevirtual 48	java/io/File:exists	()Z
    //   54: ifne +8 -> 62
    //   57: aload_0
    //   58: invokevirtual 51	java/io/File:createNewFile	()Z
    //   61: pop
    //   62: aload_1
    //   63: invokestatic 281	com/XhookMethod/XhookMethod/XhookMethod:XhookMethod	(Ljava/lang/Object;)Ljava/lang/String;
    //   66: astore_1
    //   67: new 283	java/io/FileOutputStream
    //   70: dup
    //   71: aload_0
    //   72: invokespecial 284	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   75: aload_1
    //   76: invokevirtual 288	java/lang/String:getBytes	()[B
    //   79: invokevirtual 292	java/io/FileOutputStream:write	([B)V
    //   82: return
    //   83: astore_0
    //   84: aload_0
    //   85: invokevirtual 293	java/io/FileNotFoundException:printStackTrace	()V
    //   88: return
    //   89: astore_0
    //   90: aload_0
    //   91: invokevirtual 54	java/io/IOException:printStackTrace	()V
    //   94: return
    //   95: astore_0
    //   96: aload_0
    //   97: invokevirtual 54	java/io/IOException:printStackTrace	()V
    //   100: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	paramString	String
    //   10	66	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   67	82	83	java/io/FileNotFoundException
    //   57	62	89	java/io/IOException
    //   67	82	95	java/io/IOException
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.lishu.Inttolong.XhookMethod.XhookMethod

 * JD-Core Version:    0.7.0.1

 */