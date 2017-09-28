package b.a.b.a.a;

public final class a
{
  private final String a;
  private final b b;
  private final b.a.b.a.a.a.b c;
  
  public a(String paramString, b.a.b.a.a.a.b paramb)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("Name may not be null");
    }
    if (paramb == null) {
      throw new IllegalArgumentException("Body may not be null");
    }
    this.a = paramString;
    this.c = paramb;
    this.b = new b();
    paramString = new StringBuilder();
    paramString.append("form-data; name=\"");
    paramString.append(this.a);
    paramString.append("\"");
    if (paramb.b() != null)
    {
      paramString.append("; filename=\"");
      paramString.append(paramb.b());
      paramString.append("\"");
    }
    a("Content-Disposition", paramString.toString());
    paramString = new StringBuilder();
    paramString.append(paramb.a());
    if (paramb.c() != null)
    {
      paramString.append("; charset=");
      paramString.append(paramb.c());
    }
    a("Content-Type", paramString.toString());
    a("Content-Transfer-Encoding", paramb.d());
  }
  
  private void a(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      throw new IllegalArgumentException("Field name may not be null");
    }
    this.b.a(new f(paramString1, paramString2));
  }
  
  public final b.a.b.a.a.a.b a()
  {
    return this.c;
  }
  
  public final b b()
  {
    return this.b;
  }
}

