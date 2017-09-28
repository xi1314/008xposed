package a.a.a;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

final class a
{
  private Properties a = null;
  
  private a()
  {
    try
    {
      this.a = new Properties();
      this.a.load(c.a("/pinyindb/unicode_to_hanyu_pinyin.txt"));
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      localFileNotFoundException.printStackTrace();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
  
  a(byte paramByte)
  {
    this();
  }
  
  final String[] a(char paramChar)
  {
    String[] arrayOfString = null;
    String str = Integer.toHexString(paramChar).toUpperCase();
    str = this.a.getProperty(str);
    if ((str != null) && (!str.equals("(none0)")) && (str.startsWith("(")) && (str.endsWith(")")))
    {
      paramChar = '\001';
      if (paramChar == 0) {
        break label91;
      }
    }
    for (;;)
    {
      if (str != null) {
        arrayOfString = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")")).split(",");
      }
      return arrayOfString;
      paramChar = '\000';
      break;
      label91:
      str = null;
    }
  }
  
  private static final class a
  {
    static final a a = new a((byte)0);
  }
}

