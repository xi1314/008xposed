package tutorial;

import android.content.Context;
import android.provider.Settings;

import com.lishu.net.MD5Util;

import java.util.Date;
import java.util.HashMap;

public class TeleData
{
  public static HashMap<String, String> valueMap = new HashMap();
  
  static
  {
    initData();
  }
  
  public static String getImei()
  {
    String[] arrayOfString = PoseHelper008.getFileData("008system").trim().split("_");
    try
    {
      if (arrayOfString.length == 3)
      {
        String str = arrayOfString[0];
        long l = Long.parseLong(arrayOfString[1]);
        boolean bool = arrayOfString[2].equals(getSign(str, l));
        if (bool) {
          return str;
        }
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return "";
  }
  
  public static String getImeiContent()
  {
    return PoseHelper008.getFileData("008system").trim();
  }
  
  public static String getImeiContext(Context paramContext)
  {
    String str = getSystemImeiContent(paramContext);
    Object localObject = str;
    if (str == null) {
      localObject = "";
    }
    localObject = ((String)localObject).split("_");
    try
    {
      if (localObject.length == 3)
      {
        str = localObject[0];
        long l = Long.parseLong(localObject[1]);
        if (localObject[2].equals(getSign(str, l)))
        {
          setImei(paramContext, str);
          return str;
        }
      }
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return "";
  }
  
  public static String getImeiSystemFile(Context paramContext)
  {
    Object localObject = "";
    try
    {
      String str1 = Shell.execCommandWithResult("cat /system/x", true).trim();
      localObject = str1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
    localObject = ((String)localObject).split("_");
    if (localObject.length != 3)
    {
      localObject = getImeiContext(paramContext);
      if ((localObject == null) || (((String)localObject).length() == 0))
      {
        localObject = getImei();
        if (((String)localObject).length() == 0) {
          setImei(paramContext, (String)localObject);
        }
        return localObject;
      }
      return localObject;
    }
    String str2 = localObject[0];
    long l = Long.parseLong(localObject[1]);
    if (localObject[2].equals(getSign(str2, l)))
    {
      setImei(paramContext, str2);
      return str2;
    }
    return "";
  }
  
  public static String getSign(String paramString, long paramLong)
  {
    return MD5Util.MD5(paramString + (paramLong / 103L + 1854L));
  }
  
  public static String getSystemImeiContent(Context paramContext)
  {
    return Settings.System.getString(paramContext.getContentResolver(), "008system");
  }
  
  public static void initData() {}
  
  public static void setImei(Context paramContext, String paramString)
  {
    long l = new Date().getTime();
    String str = getSign(paramString, l);
    paramString = paramString + "_" + l + "_" + str;
    setSystemImeiContent(paramContext, paramString);
    PoseHelper008.saveDataToFile("008system", paramString);
    setSystemFileImeiContext(paramContext, paramString);
  }
  
  public static void setSystemFileImeiContext(Context paramContext, String paramString)
  {
    Shell.execCommand("mount -o remount rw /system", true, false);
    Shell.execCommand("touch /system/x", true, false);
    Shell.execCommand("echo " + paramString + " > /system/x", true, false);
    Shell.execCommand("mount -o remount,ro /system", true, false);
  }
  
  public static void setSystemImeiContent(Context paramContext, String paramString)
  {
    Settings.System.putString(paramContext.getContentResolver(), "008system", paramString);
  }
}

