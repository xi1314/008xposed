package com.a.a.e;

public class h
{
  private final a[] a = new a[1024];
  private final int b = 1023;
  
  public h()
  {
    this((byte)0);
  }
  
  public h(byte paramByte) {}
  
  public final Object a(Object paramObject)
  {
    int i = System.identityHashCode(paramObject);
    int j = this.b;
    for (a locala = this.a[(i & j)]; locala != null; locala = locala.d) {
      if (paramObject == locala.b) {
        return locala.c;
      }
    }
    return null;
  }
  
  public final boolean a(Object paramObject1, Object paramObject2)
  {
    int i = System.identityHashCode(paramObject1);
    int j = i & this.b;
    for (a locala = this.a[j]; locala != null; locala = locala.d) {
      if (paramObject1 == locala.b)
      {
        locala.c = paramObject2;
        return true;
      }
    }
    paramObject1 = new a(paramObject1, paramObject2, i, this.a[j]);
    this.a[j] = paramObject1;
    return false;
  }
  
  protected static final class a
  {
    public final int a;
    public final Object b;
    public Object c;
    public final a d;
    
    public a(Object paramObject1, Object paramObject2, int paramInt, a parama)
    {
      this.b = paramObject1;
      this.c = paramObject2;
      this.d = parama;
      this.a = paramInt;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.packageinfolist.runningserviceinfolist

 * JD-Core Version:    0.7.0.1

 */