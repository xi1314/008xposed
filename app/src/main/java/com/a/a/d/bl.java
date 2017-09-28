package com.a.a.d;

public enum bl
{
  private final int u = 1 << ordinal();
  
  public static boolean a(int paramInt, bl parambl)
  {
    return (parambl.u & paramInt) != 0;
  }
  
  public final int a()
  {
    return this.u;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.runtimeexception.bl

 * JD-Core Version:    0.7.0.1

 */