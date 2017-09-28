package b.a.b.a.a;

public final class f
{
  private final String a;
  private final String b;
  
  f(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public final String b()
  {
    return this.b;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    localStringBuilder.append(": ");
    localStringBuilder.append(this.b);
    return localStringBuilder.toString();
  }
}

