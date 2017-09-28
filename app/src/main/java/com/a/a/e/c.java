package com.a.a.e;

import java.lang.reflect.Method;

public class c
{
  public static String a(Class paramClass)
  {
    if (paramClass.isPrimitive()) {
      return c(paramClass);
    }
    if (paramClass.isArray()) {
      return "[" + a(paramClass.getComponentType());
    }
    return "L" + b(paramClass) + ";";
  }
  
  public static String a(Method paramMethod)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("(");
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    int i = 0;
    while (i < arrayOfClass.length)
    {
      localStringBuffer.append(a(arrayOfClass[i]));
      i += 1;
    }
    localStringBuffer.append(")");
    localStringBuffer.append(a(paramMethod.getReturnType()));
    return localStringBuffer.toString();
  }
  
  public static boolean a()
  {
    String str = System.getProperty("java.vm.name").toLowerCase();
    return (str.contains("dalvik")) || (str.contains("lemur"));
  }
  
  public static String b(Class paramClass)
  {
    if (paramClass.isArray()) {
      return "[" + a(paramClass.getComponentType());
    }
    if (!paramClass.isPrimitive()) {
      return paramClass.getName().replaceAll("\\.", "/");
    }
    return c(paramClass);
  }
  
  private static String c(Class paramClass)
  {
    if (Integer.TYPE.equals(paramClass)) {
      return "I";
    }
    if (Void.TYPE.equals(paramClass)) {
      return "V";
    }
    if (Boolean.TYPE.equals(paramClass)) {
      return "Z";
    }
    if (Character.TYPE.equals(paramClass)) {
      return "C";
    }
    if (Byte.TYPE.equals(paramClass)) {
      return "B";
    }
    if (Short.TYPE.equals(paramClass)) {
      return "S";
    }
    if (Float.TYPE.equals(paramClass)) {
      return "F";
    }
    if (Long.TYPE.equals(paramClass)) {
      return "J";
    }
    if (Double.TYPE.equals(paramClass)) {
      return "D";
    }
    throw new IllegalStateException("Type: " + paramClass.getCanonicalName() + " is not XhookMethod primitive type");
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.packageinfolist.saveaccountdatatoFile

 * JD-Core Version:    0.7.0.1

 */