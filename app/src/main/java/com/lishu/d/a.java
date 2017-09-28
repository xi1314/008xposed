package com.lishu.d;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import de.robv.android.xposed.mods.tutorial.Shell;

import java.util.HashMap;
import java.util.Iterator;

public final class a
{
  private static String a;
  private static HashMap b = new HashMap();
  
  public a()
  {
    Object localObject1 = PoseHelper008.getFileData("prop");
    int i;
    int j;
    if (((String)localObject1).length() == 0)
    {
      localObject1 = Shell.execCommandWithResult("getprop", false);
      a = (String)localObject1;
      i = ((String)localObject1).lastIndexOf("]");
      if (i > 0)
      {
        a = a.substring(0, i + 1);
        PoseHelper008.saveDataToFile("prop", a);
      }
      localObject1 = a.split("\n");
      j = localObject1.length;
      i = 0;
    }
    for (;;)
    {
      if (i >= j)
      {
        return;
        a = (String)localObject1;
        break;
      }
      Object localObject2 = localObject1[i].split(":");
      if (localObject2.length == 2)
      {
        String str = localObject2[0].trim();
        localObject2 = localObject2[1].trim();
        str = str.substring(1, str.length() - 1);
        localObject2 = ((String)localObject2).substring(1, ((String)localObject2).length() - 1);
        b.put(str, localObject2);
      }
      i += 1;
    }
  }
  
  public static String a()
  {
    Iterator localIterator = b.entrySet().iterator();
    Object localObject;
    String str2;
    for (String str1 = "";; str1 = new StringBuilder(String.valueOf(str1)).append(str2).append(": ").append((String)localObject).toString() + "\n")
    {
      if (!localIterator.hasNext())
      {
        str1.trim();
        return PoseHelper008.saveDataToFile("propNew", str1);
      }
      localObject = (Map.Entry)localIterator.next();
      str2 = (String)((Map.Entry)localObject).getKey();
      localObject = (String)((Map.Entry)localObject).getValue();
      str2 = "[" + str2 + "]";
      localObject = "[" + (String)localObject + "]";
    }
  }
  
  public static String a(String paramString)
  {
    return (String)b.get(paramString);
  }
  
  public static void b()
  {
    String str1 = PoseHelper008.valueMap.get("getSimSerialNumber");
    Object localObject2 = PoseHelper008.valueMap.get("getSimCountryIso");
    String str2 = PoseHelper008.valueMap.get("MODEL");
    String str3 = PoseHelper008.valueMap.get("PRODUCT");
    String str4 = PoseHelper008.valueMap.get("FINGERPRINT");
    String str5 = PoseHelper008.valueMap.get("HARDWARE");
    String str6 = PoseHelper008.valueMap.get("BRAND");
    String str7 = PoseHelper008.valueMap.get("SERIAL");
    String str8 = PoseHelper008.valueMap.getStringfrommap("getDeviceId");
    String str9 = PoseHelper008.valueMap.getStringfrommap("getRadioVersion");
    String str10 = PoseHelper008.valueMap.getStringfrommap("ID");
    String str11 = PoseHelper008.valueMap.getStringfrommap("DISPLAY");
    String str12 = PoseHelper008.valueMap.getStringfrommap("HOST");
    Object localObject1 = PoseHelper008.valueMap.getStringfrommap("ARCH").split("_");
    String str13 = PoseHelper008.valueMap.getStringfrommap("RELEASE");
    c(str1);
    b(str2);
    d(str3);
    f();
    e((String)localObject2);
    f(str7);
    g(str4);
    m(str3);
    n(str2);
    o(str5);
    p(str6);
    q(str8);
    r(str9);
    h(str10);
    j(str11);
    l(str13);
    k(System.currentTimeMillis());
    i(str12);
    if ((localObject1 != null) && (localObject1.length == 2))
    {
      str1 = localObject1[0];
      localObject1 = localObject1[1];
      if ((str1 != null) && (!str1.equals("null"))) {}
    }
    else
    {
      return;
    }
    localObject2 = new String[2];
    localObject2[0] = "ro.product.cpu.abi";
    localObject2[1] = "ro.product.cpu.abi2";
    b.put(localObject2[0], str1);
    b.put(localObject2[1], localObject1);
  }
  
  private static void b(String paramString)
  {
    int i = 0;
    String[] arrayOfString = new String[3];
    arrayOfString[0] = "net.hostname";
    arrayOfString[1] = "ro.product.model";
    arrayOfString[2] = "ro.product.name";
    int j = arrayOfString.length;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      String str = arrayOfString[i];
      b.put(str, paramString);
      i += 1;
    }
  }
  
  public static void c()
  {
    String str1 = PoseHelper008.valueMap.get("getSimSerialNumber");
    String str2 = PoseHelper008.valueMap.get("getSimCountryIso");
    String str3 = PoseHelper008.valueMap.get("MODEL");
    String str4 = PoseHelper008.valueMap.get("PRODUCT");
    String str5 = PoseHelper008.valueMap.get("FINGERPRINT");
    new StringBuilder().append(PoseHelper008.valueMap.get("HARDWARE")).toString();
    String str6 = PoseHelper008.valueMap.get("BRAND");
    String str7 = PoseHelper008.valueMap.get("SERIAL");
    String str8 = PoseHelper008.valueMap.getStringfrommap("getDeviceId");
    new StringBuilder(String.valueOf(PoseHelper008.valueMap.getStringfrommap("getRadioVersion"))).toString();
    String str9 = PoseHelper008.valueMap.getStringfrommap("ID");
    String str10 = PoseHelper008.valueMap.getStringfrommap("DISPLAY");
    String str11 = PoseHelper008.valueMap.getStringfrommap("HOST");
    PoseHelper008.valueMap.getStringfrommap("ARCH").split("_");
    String str12 = PoseHelper008.valueMap.getStringfrommap("RELEASE");
    b.clear();
    c(str1);
    b(str3);
    d(str4);
    f();
    e(str2);
    f(str7);
    g(str5);
    m(str4);
    n(str3);
    p(str6);
    q(str8);
    h(str9);
    j(str10);
    l(str12);
    k(System.currentTimeMillis());
    i(str11);
    e();
    Shell.execCommandWithResult("./data/data/com.soft.apk008v/files/test123 --import /sdcard/.system/propNew1", true);
  }
  
  private static void c(String paramString)
  {
    int i = 0;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "persist.radio.cfu.iccid.0";
    arrayOfString[1] = "ril.iccid.sim1";
    int j = arrayOfString.length;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      String str = arrayOfString[i];
      b.put(str, paramString);
      i += 1;
    }
  }
  
  public static String d()
  {
    return (String)b.get("name");
  }
  
  private static void d(String paramString)
  {
    int i = 0;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = "persist.sys.device_name";
    int j = arrayOfString.length;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      String str = arrayOfString[i];
      b.put(str, paramString);
      i += 1;
    }
  }
  
  private static String e()
  {
    Iterator localIterator = b.entrySet().iterator();
    Object localObject;
    String str2;
    for (String str1 = "";; str1 = new StringBuilder(String.valueOf(str1)).append(str2).append("=").append((String)localObject).toString() + "\n")
    {
      if (!localIterator.hasNext())
      {
        str1.trim();
        return PoseHelper008.saveDataToFile("propNew1", str1);
      }
      localObject = (Map.Entry)localIterator.next();
      str2 = (String)((Map.Entry)localObject).getKey();
      localObject = (String)((Map.Entry)localObject).getValue();
    }
  }
  
  private static void e(String paramString)
  {
    int i = 0;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = "ro.product.locale.region";
    int j = arrayOfString.length;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      String str = arrayOfString[i];
      b.put(str, paramString.toUpperCase());
      i += 1;
    }
  }
  
  private static void f()
  {
    int i = 0;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "persist.sys.language";
    arrayOfString[1] = "ro.product.locale.language";
    int j = arrayOfString.length;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      String str = arrayOfString[i];
      b.put(str, "zh");
      i += 1;
    }
  }
  
  private static void f(String paramString)
  {
    int i = 0;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "ro.boot.serialno";
    arrayOfString[1] = "ro.serialno";
    int j = arrayOfString.length;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      String str = arrayOfString[i];
      b.put(str, paramString);
      i += 1;
    }
  }
  
  private static void g(String paramString)
  {
    int i = 0;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "ro.build.fingerprint";
    arrayOfString[1] = "ro.build.description";
    int j = arrayOfString.length;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      String str = arrayOfString[i];
      b.put(str, paramString);
      i += 1;
    }
  }
  
  private static void h(String paramString)
  {
    int i = 0;
    if ((paramString == null) || (paramString.equals("null"))) {}
    for (;;)
    {
      return;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = "ro.build.id";
      int j = arrayOfString.length;
      while (i < j)
      {
        String str = arrayOfString[i];
        b.put(str, paramString);
        i += 1;
      }
    }
  }
  
  private static void i(String paramString)
  {
    int i = 0;
    if ((paramString == null) || (paramString.equals("null"))) {}
    for (;;)
    {
      return;
      String[] arrayOfString = new String[2];
      arrayOfString[0] = "ro.build.host";
      arrayOfString[1] = "net.host";
      int j = arrayOfString.length;
      while (i < j)
      {
        String str = arrayOfString[i];
        b.put(str, paramString);
        i += 1;
      }
    }
  }
  
  private static void j(String paramString)
  {
    int i = 0;
    if ((paramString == null) || (paramString.equals("null"))) {}
    for (;;)
    {
      return;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = "ro.build.display.id";
      int j = arrayOfString.length;
      while (i < j)
      {
        String str = arrayOfString[i];
        b.put(str, paramString);
        i += 1;
      }
    }
  }
  
  private static void k(String paramString)
  {
    int i = 0;
    if ((paramString == null) || (paramString.equals("null"))) {}
    for (;;)
    {
      return;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = "ro.build.firstboot";
      int j = arrayOfString.length;
      while (i < j)
      {
        String str = arrayOfString[i];
        b.put(str, paramString);
        i += 1;
      }
    }
  }
  
  private static void l(String paramString)
  {
    int i = 0;
    if ((paramString == null) || (paramString.equals("null"))) {}
    for (;;)
    {
      return;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = "ro.build.version.release";
      int j = arrayOfString.length;
      while (i < j)
      {
        String str = arrayOfString[i];
        b.put(str, paramString);
        i += 1;
      }
    }
  }
  
  private static void m(String paramString)
  {
    int i = 0;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = "ro.build.product";
    int j = arrayOfString.length;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      String str = arrayOfString[i];
      b.put(str, paramString);
      i += 1;
    }
  }
  
  private static void n(String paramString)
  {
    int i = 0;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "ro.product.model";
    arrayOfString[1] = "ro.product.name";
    int j = arrayOfString.length;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      String str = arrayOfString[i];
      b.put(str, paramString);
      i += 1;
    }
  }
  
  private static void o(String paramString)
  {
    int i = 0;
    String[] arrayOfString = new String[4];
    arrayOfString[0] = "ro.hardware";
    arrayOfString[1] = "ro.boot.hardware";
    arrayOfString[2] = "ro.mediatek.platform";
    arrayOfString[3] = "ro.mtk.hardware";
    int j = arrayOfString.length;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      String str = arrayOfString[i];
      b.put(str, paramString);
      i += 1;
    }
  }
  
  private static void p(String paramString)
  {
    int i = 0;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "ro.product.brand";
    arrayOfString[1] = "ro.product.manufacturer";
    int j = arrayOfString.length;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      String str = arrayOfString[i];
      b.put(str, paramString);
      i += 1;
    }
  }
  
  private static void q(String paramString)
  {
    int i = 0;
    String[] arrayOfString = new String[3];
    arrayOfString[0] = "ro.ril.miui.imei";
    arrayOfString[1] = "ro.ril.oem.imei";
    arrayOfString[2] = "persist.radio.imei";
    int j = arrayOfString.length;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      String str = arrayOfString[i];
      b.put(str, paramString);
      i += 1;
    }
  }
  
  private static void r(String paramString)
  {
    int i = 0;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = "gsm.version.baseband";
    int j = arrayOfString.length;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      String str = arrayOfString[i];
      b.put(str, paramString);
      i += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.lishu.getMap.XhookMethod

 * JD-Core Version:    0.7.0.1

 */