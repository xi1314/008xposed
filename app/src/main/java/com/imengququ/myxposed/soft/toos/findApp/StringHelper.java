package com.imengququ.myxposed.soft.toos.findApp;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;

public class StringHelper
{
  public static String getHeadChar(String paramString)
  {
    char c = paramString.charAt(0);
    paramString = PinyinHelper.toHanyuPinyinStringArray(c);
    if (paramString != null) {}
    for (paramString = "" + paramString[0].charAt(0);; paramString = "" + c) {
      return paramString.toUpperCase();
    }
  }
  
  public static String getPinYinHeadChar(String paramString)
  {
    String str = "";
    int i = 0;
    if (i >= paramString.length()) {
      return str.toUpperCase();
    }
    char c = paramString.charAt(i);
    String[] arrayOfString = PinyinHelper.toHanyuPinyinStringArray(c);
    if (arrayOfString != null) {}
    for (str = str + arrayOfString[0].charAt(0);; str = str + c)
    {
      i += 1;
      break;
    }
  }
  
  public static String getPingYin(String paramString)
  {
    Object localObject = (char[])null;
    char[] arrayOfChar = paramString.toCharArray();
    paramString = new String[arrayOfChar.length];
    HanyuPinyinOutputFormat localHanyuPinyinOutputFormat = new HanyuPinyinOutputFormat();
    localHanyuPinyinOutputFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
    localHanyuPinyinOutputFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
    localHanyuPinyinOutputFormat.setVCharType(HanyuPinyinVCharType.WITH_V);
    paramString = "";
    int j = arrayOfChar.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return paramString;
      }
      try
      {
        if (Character.toString(arrayOfChar[i]).matches("[\\u4E00-\\u9FA5]+"))
        {
          localObject = PinyinHelper.toHanyuPinyinStringArray(arrayOfChar[i], localHanyuPinyinOutputFormat);
          localObject = paramString + localObject[0];
          paramString = (String)localObject;
        }
        else
        {
          localObject = paramString + Character.toString(arrayOfChar[i]);
          paramString = (String)localObject;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return paramString;
      }
      i += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     StringHelper

 * JD-Core Version:    0.7.0.1

 */