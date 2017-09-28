package tutorial;

import android.os.Environment;

import com.soft.tools.DESUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.HashMap;

public class MyLog
{
  public static String ExternalStorage = "";
  public static HashMap<String, String> fileMap;
  public static final String finalFolder = ".log";
  static boolean used = false;
  private static boolean userd = false;
  
  public static void addLog(String paramString)
  {
    try
    {
      if (!new File("saveaccountdatatoFile:\\log.txt").exists()) {
        new File("saveaccountdatatoFile:\\log.txt").createNewFile();
      }
      RandomAccessFile localRandomAccessFile = new RandomAccessFile(new File("saveaccountdatatoFile:\\log.txt"), "rw");
      localRandomAccessFile.seek(localRandomAccessFile.length());
      localRandomAccessFile.write(("\n" + paramString + "\n").getBytes());
      return;
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  public static boolean addLog(String filename, String str)
  {
    userd = true;
    File file
    String string = getLogContent(filename);
    if (str.indexOf(str) >= 0)
    {
      userd = false;
      return false;
    }
    for (;;)
    {
      try
      {
        File localFile = new File(ExternalStorage + File.separator + ".log");
        if (!localFile.exists()) {
          localFile.mkdir();
        }
     file = new File(ExternalStorage, ".log" + File.separator + filename);
        boolean bool = file.exists();
        if (bool) {}
      }
      catch (Exception e)
      {
        e.printStackTrace();
        continue;
      }
      try
      {
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        fileOutputStream.write(DESUtil.encrypto(str + "\n" + str));
        fileOutputStream.flush();
        fileOutputStream.close();
        userd = false;
        return true;
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
      }
    }
  }
  
  public static boolean addLogLast(String paramString1, String paramString2)
  {
    int i = 0;
    if ((fileMap != null) && (fileMap.get(paramString2.trim()) != null)) {
      return false;
    }
    for (;;)
    {
      try
      {
        localFile = new File(ExternalStorage + File.separator + ".log");
        if (!localFile.exists()) {
          localFile.mkdir();
        }
        localFile = new File(ExternalStorage, ".log" + File.separator + paramString1);
        boolean bool = localFile.exists();
        if (bool) {}
      }
      catch (Exception paramString1)
      {
        File localFile;
        int j;
        paramString1.printStackTrace();
        break label285;
        Object localObject = paramString1[i];
        if (localObject.trim().length() <= 0) {
          continue;
        }
        fileMap.put(localObject.trim(), localObject.trim());
        i += 1;
        if (i < j) {
          continue;
        }
        continue;
      }
      try
      {
        localFile.createNewFile();
        if (fileMap == null)
        {
          fileMap = new HashMap();
          paramString1 = getLogContentNoDes(paramString1).split("\n");
          j = paramString1.length;
        }
        else
        {
          paramString1 = new RandomAccessFile(localFile, "rw");
          paramString1.seek(paramString1.length());
          paramString1.write(("\n" + paramString2).getBytes());
          paramString1.close();
          fileMap.put(paramString2.trim(), paramString2.trim());
        }
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
      }
    }
    label285:
    return true;
  }
  
  public static boolean checkLog(String paramString)
  {
    return new File("saveaccountdatatoFile:\\" + paramString + ".txt").exists();
  }
  
  public static void clearLog(String paramString)
  {
    try
    {
      File localFile = new File(Environment.getExternalStorageDirectory(), ".log");
      if (!localFile.exists()) {
        localFile.mkdir();
      }
      paramString = new File(Environment.getExternalStorageDirectory(), ".log" + File.separator + paramString);
      if (paramString.exists()) {
        paramString.delete();
      }
      return;
    }
    catch (Exception paramString) {}
  }
  
  public static String getLogContent(String paramString)
  {
    if (ExternalStorage.length() == 0) {
      ExternalStorage = Environment.getExternalStorageDirectory().getAbsolutePath();
    }
    String str2 = "";
    str1 = str2;
    for (;;)
    {
      try
      {
        localObject = new File(ExternalStorage, ".log");
        str1 = str2;
        if (!((File)localObject).exists())
        {
          str1 = str2;
          ((File)localObject).mkdir();
        }
        str1 = str2;
        paramString = new File(ExternalStorage, ".log" + File.separator + paramString);
        str1 = str2;
        boolean bool = paramString.exists();
        if (!bool) {
          str1 = str2;
        }
      }
      catch (Exception paramString)
      {
        Object localObject;
        ByteBuffer localByteBuffer;
        int i;
        int k;
        int j;
        paramString.printStackTrace();
        paramString = str1;
        continue;
      }
      try
      {
        paramString.createNewFile();
        str1 = str2;
        localObject = new FileInputStream(paramString);
        str1 = str2;
        localByteBuffer = ByteBuffer.allocate(102400);
        str1 = str2;
        paramString = new byte[512];
        i = 0;
        str1 = str2;
        k = ((FileInputStream)localObject).read(paramString);
        j = i;
        if (k != -1) {
          j = i + k;
        }
        str1 = str2;
        localByteBuffer.put(paramString);
        i = j;
        if (k != -1) {
          continue;
        }
        paramString = str2;
        if (j > 0)
        {
          str1 = str2;
          paramString = new byte[j];
          str1 = str2;
          localByteBuffer.position(0);
          str1 = str2;
          localByteBuffer.get(paramString);
          str1 = str2;
          paramString = DESUtil.decrypt(paramString);
        }
        str1 = paramString;
        ((FileInputStream)localObject).close();
        return paramString.trim();
      }
      catch (IOException localIOException)
      {
        str1 = str2;
        localIOException.printStackTrace();
      }
    }
  }
  
  public static String getLogContentNoDes(String paramString)
  {
    if (ExternalStorage.length() == 0) {
      ExternalStorage = Environment.getExternalStorageDirectory().getAbsolutePath();
    }
    str2 = "";
    str1 = str2;
    for (;;)
    {
      try
      {
        localObject = new File(ExternalStorage, ".log");
        str1 = str2;
        if (!((File)localObject).exists())
        {
          str1 = str2;
          ((File)localObject).mkdir();
        }
        str1 = str2;
        paramString = new File(ExternalStorage, ".log" + File.separator + paramString);
        str1 = str2;
        boolean bool = paramString.exists();
        if (!bool) {
          str1 = str2;
        }
      }
      catch (Exception paramString)
      {
        Object localObject;
        paramString.printStackTrace();
        paramString = str1;
        continue;
        str1 = paramString;
        paramString = paramString + str2 + "\n";
        continue;
      }
      try
      {
        paramString.createNewFile();
        str1 = str2;
        localObject = new BufferedReader(new FileReader(paramString));
        paramString = str2;
        str1 = paramString;
        str2 = ((BufferedReader)localObject).readLine();
        if (str2 == null)
        {
          str1 = paramString;
          ((BufferedReader)localObject).close();
          return paramString.trim();
        }
      }
      catch (IOException localIOException)
      {
        str1 = str2;
        localIOException.printStackTrace();
      }
    }
  }
}

