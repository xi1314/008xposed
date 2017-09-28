package com.imengququ.myxposed.soft.apk008;

import android.content.Context;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class SimulateData
{
  private static final int DIANXING = 3;
  private static final int LIANTONG = 2;
  private static final int YIDONG = 1;
  private static HashMap<String, String> apiLevelMap = new HashMap();
  static HashMap<String, String> imeiMap = null;
  public static ArrayList<HashMap<String, String>> imeiStore;
  static HashMap<String, String[]> imsiPhoneTag;
  public static Random r;
  public String datagogo = "";
  
  static
  {
    apiLevelMap.put("6", "2.0.1");
    apiLevelMap.put("7", "2.1.2");
    apiLevelMap.put("8", "2.2.3");
    apiLevelMap.put("9", "2.3.1");
    apiLevelMap.put("10", "2.3.4");
    apiLevelMap.put("11", "3.0.3");
    apiLevelMap.put("12", "3.1.1");
    apiLevelMap.put("13", "3.2");
    apiLevelMap.put("14", "4.0.2");
    apiLevelMap.put("15", "4.0.4");
    apiLevelMap.put("16", "4.1.1");
    apiLevelMap.put("17", "4.2.2");
    apiLevelMap.put("18", "4.3.3");
    apiLevelMap.put("19", "4.4.2");
    r = new Random(new Date().getTime());
    imsiPhoneTag = new HashMap();
    imeiStore = new ArrayList();
  }
  
  public static String getDisplay()
  {
    if (imeiMap != null) {
      return (String)imeiMap.get("display");
    }
    return null;
  }
  
  public static String getHead(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      do
      {
        i = r.nextInt(imeiStore.size());
        imeiMap = (HashMap)imeiStore.get(i);
      } while (((String)imeiMap.get("imei")).toUpperCase().indexOf("A") != 0);
    }
    for (;;)
    {
      return (String)imeiMap.get("imei");
      do
      {
        i = r.nextInt(imeiStore.size());
        imeiMap = (HashMap)imeiStore.get(i);
      } while (((String)imeiMap.get("imei")).toUpperCase().indexOf("A") == 0);
    }
  }
  
  public static String getMac()
  {
    Object localObject = "";
    int i = 0;
    for (;;)
    {
      if (i >= 6) {
        return localObject;
      }
      String str2 = Integer.toHexString(Byte.valueOf((byte)r.nextInt(255)).byteValue() & 0xFF);
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
  
  public static String getModal()
  {
    if (imeiMap != null) {
      return (String)imeiMap.get("name") + " " + (String)imeiMap.get("modal");
    }
    return null;
  }
  
  public static String getPhoneName()
  {
    if (imeiMap != null) {
      return (String)imeiMap.get("name");
    }
    return null;
  }
  
  public static String getPhoneNumber(String paramString)
  {
    if (imsiPhoneTag.size() == 0)
    {
      imsiPhoneTag.put("46000", new String[] { "135", "136", "137", "138", "139" });
      imsiPhoneTag.put("46002", new String[] { "150", "151", "152", "158", "159", "134" });
      imsiPhoneTag.put("46007", new String[] { "147", "157", "187", "188" });
      imsiPhoneTag.put("46001", new String[] { "130", "131", "132", "155", "156" });
      imsiPhoneTag.put("46003", new String[] { "133", "1349", "180", "153", "189" });
    }
    int j;
    int i;
    if (paramString.length() > 5)
    {
      paramString = paramString.substring(0, 5);
      paramString = (String[])imsiPhoneTag.get(paramString);
      paramString = paramString[r.nextInt(paramString.length)];
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
        paramString = "1" + paramString[r.nextInt(paramString.length)];
        break;
      }
      int k = r.nextInt(10);
      paramString = paramString + k;
      i += 1;
    }
  }
  
  public static String getProductName()
  {
    if (imeiMap != null) {
      return (String)imeiMap.get("modal");
    }
    return null;
  }
  
  public static String getRandData(int paramInt1, int paramInt2)
  {
    String str2 = "";
    String str1;
    if (paramInt1 == 1)
    {
      paramInt1 = 0;
      str1 = str2;
      if (paramInt1 < paramInt2) {}
    }
    do
    {
      do
      {
        return str1;
        str1 = str1 + r.nextInt(10);
        paramInt1 += 1;
        break;
        str1 = str2;
      } while (paramInt1 == 2);
      str1 = str2;
    } while (paramInt1 != 3);
    paramInt1 = 0;
    for (;;)
    {
      str1 = str2;
      if (paramInt1 >= paramInt2) {
        break;
      }
      str1 = Integer.toHexString(Byte.valueOf((byte)r.nextInt(17)).byteValue() & 0xF);
      str2 = str2 + str1;
      paramInt1 += 1;
    }
  }
  
  public static String getRandData(String paramString, int paramInt1, int paramInt2)
  {
    int i = 0;
    String str;
    if (i >= 100)
    {
      str = paramString;
      i = paramInt1 - paramString.length();
      if (paramInt2 != 1) {
        break label84;
      }
      paramInt1 = 0;
      paramString = str;
      label28:
      if (paramInt1 < i) {
        break label51;
      }
    }
    label51:
    label84:
    do
    {
      do
      {
        return paramString;
        i = i * r.nextInt() / 0 + 1;
        break;
        paramString = paramString + r.nextInt(10);
        paramInt1 += 1;
        break label28;
        paramString = str;
      } while (paramInt2 == 2);
      paramString = str;
    } while (paramInt2 != 3);
    paramInt1 = 0;
    for (;;)
    {
      paramString = str;
      if (paramInt1 >= i) {
        break;
      }
      paramString = Integer.toHexString(Byte.valueOf((byte)r.nextInt(17)).byteValue() & 0xF);
      str = str + paramString;
      paramInt1 += 1;
    }
  }
  
  public static String[] getSdkLevel()
  {
    int i = apiLevelMap.size();
    String str = r.nextInt(i) + 6;
    return new String[] { str, (String)apiLevelMap.get(str) };
  }
  
  public static String[] getSimData()
  {
    String[] arrayOfString = new String[4];
    int i = r.nextInt(3) + 1;
    String str = getSubscriberId(i);
    arrayOfString[0] = str;
    arrayOfString[1] = str.substring(0, 5);
    if (i == 1) {
      arrayOfString[2] = "中国移动";
    }
    for (;;)
    {
      arrayOfString[3] = getSimSerial(i);
      return arrayOfString;
      if (i == 2) {
        arrayOfString[2] = "中国联通";
      } else if (i == 3) {
        arrayOfString[2] = "中国电信";
      }
    }
  }
  
  public static String getSimSerial(int paramInt)
  {
    String str = "";
    Random localRandom = null;
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
  
  public static void init(Context paramContext)
  {
    paramContext = StartActivity.getFromAssets(paramContext, "imeiStore").split("\n");
    int j = paramContext.length;
    int i = 0;
    if (i >= j) {
      return;
    }
    Object localObject1 = paramContext[i];
    if (localObject1.trim().length() == 0) {}
    for (;;)
    {
      i += 1;
      break;
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
}

