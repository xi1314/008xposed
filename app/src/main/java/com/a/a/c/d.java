package com.a.a.c;

public enum d
{
  private final int n = 1 << ordinal();
  
  public static boolean a(int paramInt, d paramd)
  {
    return (paramd.n & paramInt) != 0;
  }
  
  public static int b(int paramInt, d paramd)
  {
    return paramd.n | paramInt;
  }
  
  public final int a()
  {
    return this.n;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.getMap

 * JD-Core Version:    0.7.0.1

 */