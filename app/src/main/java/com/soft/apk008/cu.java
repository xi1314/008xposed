package com.soft.apk008;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public final class cu
{
  public static Random a = new Random(new Date().getTime());
  static HashMap b = new HashMap();
  public static ArrayList c = new ArrayList();
  static HashMap d = null;
  private static HashMap e;
  
  static
  {
    HashMap localHashMap = new HashMap();
    e = localHashMap;
    localHashMap.put("6", "2.0.1");
    e.put("7", "2.1.2");
    e.put("8", "2.2.3");
    e.put("9", "2.3.1");
    e.put("10", "2.3.4");
    e.put("11", "3.0.3");
    e.put("12", "3.1.1");
    e.put("13", "3.2");
    e.put("14", "4.0.2");
    e.put("15", "4.0.4");
    e.put("16", "4.1.1");
    e.put("17", "4.2.2");
    e.put("18", "4.3.3");
    e.put("19", "4.4.2");
    e.put("20", "4.4W");
    e.put("21", "5.0");
    e.put("22", "5.1");
    e.put("23", "6.0");
    e.put("24", "7.0");
    e.put("25", "7.1.1");
    e.put("26", "8.0");

  }
  
  public static String a()
  {
    String str1 = "";
    int i = 0;
    for (;;)
    {
      if (i >= 10) {
        return str1;
      }
      String str2 = Integer.toHexString(Byte.valueOf((byte)a.nextInt(17)).byteValue() & 0xF);
      str1 = str1 + str2;
      i += 1;
    }
  }
  
  public static String getAddress()
  {
    Object localObject = "";
    int i = 0;
    for (;;)
    {
      if (i >= 6) {
        return (String) localObject;
      }
      String str2 = Integer.toHexString(Byte.valueOf((byte)a.nextInt(255)).byteValue() & 0xFF);
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
}

