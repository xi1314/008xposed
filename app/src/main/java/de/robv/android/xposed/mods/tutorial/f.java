package de.robv.android.xposed.mods.tutorial;

import android.os.Environment;
import com.soft.tools.y;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.HashMap;

public final class f
{
  public static String a = "";
  public static String dirname = "";
  static boolean c = false;
  public static HashMap d;
  private static boolean e = false;
  
  public static String a(String filename)
  {
    if (dirname.length() == 0) {
      dirname = Environment.getExternalStorageDirectory().getAbsolutePath();
    }
    for (;;)
    {
      try
      {
        Object localObject = new File(dirname, ".logwerdfsdfga");
        if (!((File)localObject).exists()) {
          ((File)localObject).mkdir();
        }
       File file = new File(dirname, ".logwerdfsdfga" + File.separator + filename);
        boolean bool = file.exists();
        if (!bool) {}
        try
        {
          file.createNewFile();
         BufferedReader localBufferedReader = new BufferedReader(new FileReader(filename));
          file = "";
        }
        catch (IOException localIOException)
        {
          try
          {
            BufferedReader localBufferedReader;
            localObject = localBufferedReader.readLine();
            if (localObject != null) {
              break label146;
            }
            localBufferedReader.close();
            return filename.trim();
          }
          catch (Exception localException2)
          {
            String str;
            break label139;
          }
          localIOException = localIOException;
          localIOException.printStackTrace();
          continue;
        }
        localException1.printStackTrace();
      }
      catch (Exception localException1)
      {
        filename = "";
      }
      label139:
      continue;
      label146:
      str = filename + localException1 + "\n";
      filename = str;
    }
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    e = true;
    String str = e(paramString1);
    if (str.indexOf(paramString2) >= 0)
    {
      e = false;
      return false;
    }
    for (;;)
    {
      try
      {
        File localFile = new File(dirname + File.separator + ".logwerdfsdfga");
        if (!localFile.exists()) {
          localFile.mkdir();
        }
        paramString1 = new File(dirname, ".logwerdfsdfga" + File.separator + paramString1);
        boolean bool = paramString1.exists();
        if (bool) {}
      }
      catch (Exception paramString1)
      {
        paramString1.printStackTrace();
        continue;
      }
      try
      {
        paramString1.createNewFile();
        paramString1 = new FileOutputStream(paramString1);
        paramString1.write(y.a(str + "\n" + paramString2));
        paramString1.flush();
        paramString1.close();
        e = false;
        return true;
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
      }
    }
  }
  
  public static long b(String paramString)
  {
    if (dirname.length() == 0) {
      dirname = Environment.getExternalStorageDirectory().getAbsolutePath();
    }
    try
    {
      File localFile = new File(dirname, ".logwerdfsdfga");
      if (!localFile.exists()) {
        localFile.mkdir();
      }
      paramString = new File(dirname, ".logwerdfsdfga" + File.separator + paramString);
      boolean bool = paramString.exists();
      if (!bool) {}
      try
      {
        paramString.createNewFile();
        return paramString.length();
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          localIOException.printStackTrace();
        }
      }
      return 0L;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public static boolean b(String paramString1, String paramString2)
  {
    if ((d != null) && (d.get(paramString2.trim()) != null)) {}
    for (;;)
    {
      return false;
      for (;;)
      {
        try
        {
          localFile = new File(dirname + File.separator + ".logwerdfsdfga");
          if (!localFile.exists()) {
            localFile.mkdir();
          }
          localFile = new File(dirname, ".logwerdfsdfga" + File.separator + paramString1);
          boolean bool = localFile.exists();
          if (bool) {}
        }
        catch (Exception paramString1)
        {
          File localFile;
          int i;
          paramString1.printStackTrace();
          break label295;
          Object localObject = paramString1[i];
          if (localObject.trim().length() <= 0) {
            continue;
          }
          d.put(localObject.trim(), localObject.trim());
          i += 1;
          continue;
        }
        try
        {
          localFile.createNewFile();
          if (d == null)
          {
            d = new HashMap();
            paramString1 = a(paramString1).split("\n");
            int j = paramString1.length;
            readThread = 0;
            if (readThread < j) {
              continue;
            }
            if (d.get(paramString2.trim()) != null) {
              break;
            }
          }
          paramString1 = new RandomAccessFile(localFile, "rw");
          paramString1.seek(paramString1.length());
          paramString1.write(("\n" + paramString2).getBytes());
          paramString1.close();
          d.put(paramString2.trim(), paramString2.trim());
        }
        catch (IOException localIOException)
        {
          localIOException.printStackTrace();
        }
      }
    }
    label295:
    return true;
  }
  
  public static String c(String paramString)
  {
    if (dirname.length() == 0) {
      dirname = Environment.getExternalStorageDirectory().getAbsolutePath();
    }
    for (;;)
    {
      try
      {
        localObject = new File(dirname, ".logwerdfsdfga");
        if (!((File)localObject).exists()) {
          ((File)localObject).mkdir();
        }
        paramString = new File(dirname, ".logwerdfsdfga" + File.separator + paramString);
        boolean bool = paramString.exists();
        if (bool) {}
      }
      catch (Exception paramString)
      {
        Object localObject;
        int i;
        paramString.printStackTrace();
        paramString = "";
        continue;
      }
      try
      {
        paramString.createNewFile();
        paramString = new RandomAccessFile(paramString, "rw");
        paramString.seek(0L);
        localObject = new byte[102400];
        readThread = paramString.read((byte[])localObject);
        paramString.close();
        paramString = new String((byte[])localObject, 0, readThread);
        return paramString.trim();
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
      }
    }
  }
  
  public static void d(String paramString)
  {
    try
    {
      File localFile = new File(Environment.getExternalStorageDirectory(), ".logwerdfsdfga");
      if (!localFile.exists()) {
        localFile.mkdir();
      }
      paramString = new File(Environment.getExternalStorageDirectory(), ".logwerdfsdfga" + File.separator + paramString);
      if (paramString.exists()) {
        paramString.delete();
      }
      return;
    }
    catch (Exception paramString) {}
  }
  
  private static String e(String paramString)
  {
    int i = 0;
    if (dirname.length() == 0) {
      dirname = Environment.getExternalStorageDirectory().getAbsolutePath();
    }
    for (;;)
    {
      try
      {
        localObject = new File(dirname, ".logwerdfsdfga");
        if (!((File)localObject).exists()) {
          ((File)localObject).mkdir();
        }
        paramString = new File(dirname, ".logwerdfsdfga" + File.separator + paramString);
        boolean bool = paramString.exists();
        if (bool) {}
      }
      catch (Exception localException1)
      {
        Object localObject;
        byte[] arrayOfByte;
        int k;
        int j;
        paramString = "";
        localException1.printStackTrace();
        continue;
        paramString = "";
        continue;
      }
      try
      {
        paramString.createNewFile();
        localObject = new FileInputStream(paramString);
        paramString = ByteBuffer.allocate(102400);
        arrayOfByte = new byte[512];
        k = ((FileInputStream)localObject).read(arrayOfByte);
        sysstr = i;
        if (k != -1) {
          sysstr = i + k;
        }
        paramString.put(arrayOfByte);
        i = sysstr;
        if (k != -1) {
          continue;
        }
        if (sysstr > 0)
        {
          arrayOfByte = new byte[sysstr];
          paramString.position(0);
          paramString.get(arrayOfByte);
          paramString = y.a(arrayOfByte);
        }
      }
      catch (IOException localIOException)
      {
        try
        {
          ((FileInputStream)localObject).close();
          return paramString.trim();
        }
        catch (Exception localException2)
        {
          continue;
        }
        localIOException = localIOException;
        localIOException.printStackTrace();
      }
    }
  }
}
