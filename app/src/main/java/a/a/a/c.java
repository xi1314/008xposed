package a.a.a;

import java.io.BufferedInputStream;

class c
{
  static Class a;
  
  static BufferedInputStream a(String paramString)
  {
    Class localClass;
    if (a == null)
    {
      localClass = b("XhookMethod.XhookMethod.XhookMethod.saveaccountdatatoFile");
      a = localClass;
    }
    for (;;)
    {
      return new BufferedInputStream(localClass.getResourceAsStream(paramString));
      localClass = a;
    }
  }
  
  private static Class b(String paramString)
  {
    try
    {
      paramString = Class.forName(paramString);
      return paramString;
    }
    catch (ClassNotFoundException paramString)
    {
      throw new NoClassDefFoundError(paramString.getMessage());
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     XhookMethod.XhookMethod.XhookMethod.saveaccountdatatoFile

 * JD-Core Version:    0.7.0.1

 */