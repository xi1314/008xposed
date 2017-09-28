package b.a.b.a.a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class b
  implements Iterable
{
  private final List a = new LinkedList();
  private final Map b = new HashMap();
  
  public final f a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = paramString.toLowerCase(Locale.US);
    paramString = (List)this.b.get(paramString);
    if ((paramString != null) && (!paramString.isEmpty())) {
      return (f)paramString.get(0);
    }
    return null;
  }
  
  public final void a(f paramf)
  {
    if (paramf == null) {
      return;
    }
    String str = paramf.a().toLowerCase(Locale.US);
    List localList = (List)this.b.get(str);
    Object localObject = localList;
    if (localList == null)
    {
      localObject = new LinkedList();
      this.b.put(str, localObject);
    }
    ((List)localObject).add(paramf);
    this.a.add(paramf);
  }
  
  public final Iterator iterator()
  {
    return Collections.unmodifiableList(this.a).iterator();
  }
  
  public final String toString()
  {
    return this.a.toString();
  }
}

