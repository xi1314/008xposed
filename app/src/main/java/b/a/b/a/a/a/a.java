package b.a.b.a.a.a;

public abstract class a
  implements b
{
  private final String a;
  private final String b;
  private final String c;
  
  public a(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("MIME type may not be null");
    }
    this.a = paramString;
    int i = paramString.indexOf('/');
    if (i != -1)
    {
      this.b = paramString.substring(0, i);
      this.c = paramString.substring(i + 1);
      return;
    }
    this.b = paramString;
    this.c = null;
  }
  
  public final String a()
  {
    return this.a;
  }
}


