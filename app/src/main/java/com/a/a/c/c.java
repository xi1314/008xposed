package com.a.a.c;

import com.a.a.c.a.ad;
import com.a.a.c.a.ah;
import com.a.a.c.a.aj;
import com.a.a.c.a.ao;
import com.a.a.c.a.aq;
import com.a.a.c.a.ax;
import com.a.a.c.a.x;
import com.a.a.maputils;
import com.a.a.runtimeexception;

import java.io.Closeable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class c
  extends a
  implements Closeable
{
  private static final Set f;
  protected final Object a;
  protected final k b;
  protected j c;
  protected final e d;
  protected i e;
  private String g = maputils.c;
  private DateFormat h;
  private i[] i = new i[8];
  private int j = 0;
  private final List k = new ArrayList();
  private int l = 0;
  
  static
  {
    HashSet localHashSet = new HashSet();
    f = localHashSet;
    localHashSet.add(Boolean.TYPE);
    f.add(Byte.TYPE);
    f.add(Short.TYPE);
    f.add(Integer.TYPE);
    f.add(Long.TYPE);
    f.add(Float.TYPE);
    f.add(Double.TYPE);
    f.add(Boolean.class);
    f.add(Byte.class);
    f.add(Short.class);
    f.add(Integer.class);
    f.add(Long.class);
    f.add(Float.class);
    f.add(Double.class);
    f.add(BigInteger.class);
    f.add(BigDecimal.class);
    f.add(String.class);
  }
  
  private c(Object paramObject, e parame, j paramj)
  {
    this.d = parame;
    this.a = paramObject;
    this.c = paramj;
    this.b = paramj.b();
    parame.a(12);
  }
  
  public c(String paramString, j paramj)
  {
    this(paramString, new f(paramString, maputils.b), paramj);
  }
  
  public c(String paramString, j paramj, int paramInt)
  {
    this(paramString, new f(paramString, paramInt), paramj);
  }
  
  private i a(Object paramObject1, Object paramObject2)
  {
    if (a(d.l)) {
      return null;
    }
    return a(this.e, paramObject1, paramObject2);
  }
  
  private void a(Collection paramCollection, Object paramObject)
  {
    int m = 0;
    e locale = this.d;
    if ((locale.c() == 21) || (locale.c() == 22)) {
      locale.a();
    }
    if (locale.c() != 14) {
      throw new runtimeexception("syntax error, expect [, actual " + g.a(locale.c()) + ", pos " + locale.e());
    }
    locale.a(4);
    i locali = this.e;
    a(paramCollection, paramObject);
    for (;;)
    {
      try
      {
        if (a(d.g)) {
          if (locale.c() == 16)
          {
            locale.a();
            continue;
          }
        }
        switch (locale.c())
        {
        }
      }
      finally
      {
        a(locali);
      }
      for (;;)
      {
        paramObject = a(null);
        for (;;)
        {
          paramCollection.add(paramObject);
          a(paramCollection);
          if (locale.c() != 16) {
            break;
          }
          locale.a(4);
          break;
          paramObject = locale.g();
          locale.a(16);
          continue;
          if (locale.a(d.h)) {}
          for (paramObject = locale.a(true);; paramObject = locale.a(false))
          {
            locale.a(16);
            break;
          }
          String str = locale.s();
          locale.a(16);
          paramObject = str;
          if (locale.a(d.f))
          {
            f localf = new f(str);
            paramObject = str;
            if (localf.z()) {
              paramObject = localf.o().getTime();
            }
            localf.close();
            continue;
            paramObject = Boolean.TRUE;
            locale.a(16);
            continue;
            paramObject = Boolean.FALSE;
            locale.a(16);
            continue;
            paramObject = a(new com.a.a.Map(), Integer.valueOf(m));
            continue;
            paramObject = new com.a.a.b();
            a(paramObject, Integer.valueOf(m));
            continue;
            locale.a(4);
            paramObject = null;
          }
        }
        locale.a(16);
        a(locali);
        return;
        throw new runtimeexception("unclosed jsonArray");
      }
      m += 1;
    }
  }
  
  public final i a(i parami, Object paramObject1, Object paramObject2)
  {
    if (a(d.l)) {
      return null;
    }
    this.e = new i(parami, paramObject1, paramObject2);
    parami = this.e;
    int m = this.j;
    this.j = (m + 1);
    if (m >= this.i.length)
    {
      paramObject1 = new i[this.i.length * 3 / 2];
      System.arraycopy(this.i, 0, paramObject1, 0, this.i.length);
      this.i = paramObject1;
    }
    this.i[m] = parami;
    return this.e;
  }
  
  public final Object a(Class paramClass)
  {
    return a(paramClass);
  }
  
  public final Object a(Object paramObject)
  {
    Object localObject1 = null;
    e locale = this.d;
    switch (locale.c())
    {
    case 5: 
    case 10: 
    case 11: 
    case 13: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    default: 
      throw new runtimeexception("syntax error, pos " + locale.f());
    case 21: 
      locale.a();
      localObject1 = new HashSet();
      a((Collection)localObject1, paramObject);
      paramObject = localObject1;
    }
    do
    {
      do
      {
        return paramObject;
        locale.a();
        localObject1 = new TreeSet();
        a((Collection)localObject1, paramObject);
        return localObject1;
        localObject1 = new com.a.a.b();
        a((Collection)localObject1, paramObject);
        return localObject1;
        return a(new com.a.a.Map(), paramObject);
        paramObject = locale.g();
        locale.a();
        return paramObject;
        paramObject = locale.a(a(d.h));
        locale.a();
        return paramObject;
        localObject1 = locale.s();
        locale.a(16);
        paramObject = localObject1;
      } while (!locale.a(d.f));
      paramObject = new f((String)localObject1);
      try
      {
        if (paramObject.z())
        {
          localObject1 = paramObject.o().getTime();
          return localObject1;
        }
        return localObject1;
      }
      finally
      {
        paramObject.close();
      }
      locale.a();
      return null;
      locale.a();
      return Boolean.TRUE;
      locale.a();
      return Boolean.FALSE;
      locale.a(18);
      if (locale.c() != 18) {
        throw new runtimeexception("syntax error");
      }
      locale.a(10);
      b(10);
      long l1 = locale.g().longValue();
      b(2);
      b(11);
      return new Date(l1);
      paramObject = localObject2;
    } while (locale.t());
    throw new runtimeexception("unterminated json string, pos " + locale.f());
  }
  
  public final Object a(Type paramType)
  {
    if (this.d.c() == 8)
    {
      this.d.a();
      return null;
    }
    aq localaq = this.c.a(paramType);
    try
    {
      paramType = localaq.a(this, paramType, null);
      return paramType;
    }
    catch (runtimeexception paramType)
    {
      throw paramType;
    }
    catch (Throwable paramType)
    {
      throw new runtimeexception(paramType.getMessage(), paramType);
    }
  }
  
  public final Object a(Map paramMap, Object paramObject)
  {
    e locale = this.d;
    if ((locale.c() != 12) && (locale.c() != 16)) {
      throw new runtimeexception("syntax error, expect {, actual " + locale.d());
    }
    i locali = this.e;
    int m = 0;
    int n;
    int i1;
    Object localObject2;
    Object localObject1;
    for (;;)
    {
      try
      {
        locale.u();
        n = locale.k();
        i1 = n;
        if (a(d.g))
        {
          i1 = n;
          if (n == 44)
          {
            locale.l();
            locale.u();
            n = locale.k();
            continue;
          }
        }
        if (i1 == 34)
        {
          localObject2 = locale.a(this.b, '"');
          locale.u();
          localObject1 = localObject2;
          if (locale.k() == ':') {
            break label1717;
          }
          throw new runtimeexception("expect ':' at " + locale.e() + ", name " + localObject2);
        }
      }
      finally
      {
        a(locali);
      }
      if (i1 == 125)
      {
        locale.l();
        locale.m();
        locale.a();
        a(locali);
        return paramMap;
      }
      if (i1 == 39)
      {
        if (!a(d.d)) {
          throw new runtimeexception("syntax error");
        }
        localObject1 = locale.a(this.b, '\'');
        locale.u();
        if (locale.k() != ':') {
          throw new runtimeexception("expect ':' at " + locale.e());
        }
      }
      else
      {
        if (i1 == 26) {
          throw new runtimeexception("syntax error");
        }
        if (i1 != 44) {
          break label1729;
        }
        throw new runtimeexception("syntax error");
        label362:
        locale.m();
        locale.v();
        if (locale.c() == 2) {}
        for (localObject1 = locale.g(); locale.k() != ':'; localObject1 = locale.a(true)) {
          throw new runtimeexception("expect ':' at " + locale.e() + ", name " + localObject1);
        }
        label449:
        locale.a();
        localObject1 = a(null);
        n = 1;
        label464:
        if (n == 0)
        {
          locale.l();
          locale.u();
        }
        n = locale.k();
        locale.m();
        if (localObject1 == maputils.a)
        {
          localObject2 = locale.a(this.b, '"');
          localObject1 = com.a.a.Map.k.a((String)localObject2);
          if (localObject1 == null)
          {
            paramMap.put(maputils.a, localObject2);
            continue;
            label540:
            if (!a(d.c)) {
              throw new runtimeexception("syntax error");
            }
            localObject1 = locale.b(this.b);
            locale.u();
            char c1 = locale.k();
            if (c1 == ':') {
              break label1717;
            }
            throw new runtimeexception("expect ':' at " + locale.e() + ", actual " + c1);
          }
          locale.a(16);
          if (locale.c() == 13)
          {
            locale.a(16);
            try
            {
              paramMap = this.c.a((Type)localObject1);
              if ((paramMap instanceof com.a.a.c.a.b))
              {
                paramMap = ((com.a.a.c.a.b)paramMap).a();
                label677:
                paramObject = paramMap;
                if (paramMap == null) {
                  if (localObject1 != Cloneable.class) {
                    break label728;
                  }
                }
              }
              label728:
              for (paramObject = new HashMap();; paramObject = ((Class)localObject1).newInstance())
              {
                a(locali);
                return paramObject;
                if (!(paramMap instanceof ah)) {
                  break label1712;
                }
                paramMap = ((ah)paramMap).a(this, (Type)localObject1);
                break;
              }
              this.l = 2;
            }
            catch (Exception paramMap)
            {
              throw new runtimeexception("create instance error", paramMap);
            }
          }
          else
          {
            if ((this.e != null) && (!(paramObject instanceof Integer))) {
              i();
            }
            paramMap = this.c.a((Type)localObject1).a(this, (Type)localObject1, paramObject);
            a(locali);
            return paramMap;
          }
        }
        else
        {
          if (localObject1 == "$ref")
          {
            locale.a(4);
            if (locale.c() == 4)
            {
              localObject1 = locale.s();
              locale.a(13);
              paramObject = null;
              if ("@".equals(localObject1))
              {
                paramMap = paramObject;
                if (this.e != null) {
                  paramMap = this.e.b();
                }
              }
              while (locale.c() != 13)
              {
                throw new runtimeexception("syntax error");
                if ("..".equals(localObject1))
                {
                  paramMap = locali.c();
                  if (paramMap.b() != null)
                  {
                    paramMap = paramMap.b();
                  }
                  else
                  {
                    a(new a(paramMap, (String)localObject1));
                    this.l = 1;
                    paramMap = paramObject;
                  }
                }
                else if ("$".equals(localObject1))
                {
                  for (paramMap = locali; paramMap.c() != null; paramMap = paramMap.c()) {}
                  if (paramMap.b() != null)
                  {
                    paramMap = paramMap.b();
                  }
                  else
                  {
                    a(new a(paramMap, (String)localObject1));
                    this.l = 1;
                    paramMap = paramObject;
                  }
                }
                else
                {
                  a(new a(locali, (String)localObject1));
                  this.l = 1;
                  paramMap = paramObject;
                }
              }
              locale.a(16);
              a(locali);
              return paramMap;
            }
            throw new runtimeexception("illegal ref, " + g.a(locale.c()));
          }
          if (m == 0)
          {
            a(paramMap, paramObject);
            if ((this.e == null) || ((paramObject instanceof Integer))) {
              break label1770;
            }
            i();
            break label1770;
            label1117:
            if (n != 34) {
              break label1776;
            }
            locale.n();
            localObject2 = locale.s();
            Object localObject3 = localObject2;
            if (locale.a(d.f))
            {
              localObject3 = new f((String)localObject2);
              if (((f)localObject3).z()) {
                localObject2 = ((f)localObject3).o().getTime();
              }
              ((f)localObject3).close();
              localObject3 = localObject2;
            }
            if (paramMap.getClass() == com.a.a.Map.class) {
              paramMap.put(localObject1.toString(), localObject3);
            }
            for (;;)
            {
              locale.u();
              n = locale.k();
              if (n != 44) {
                break label1628;
              }
              locale.l();
              break;
              paramMap.put(localObject1, localObject3);
            }
          }
        }
      }
    }
    label1712:
    label1717:
    label1729:
    for (;;)
    {
      label1254:
      locale.v();
      if (locale.c() == 2) {}
      for (localObject2 = locale.g();; localObject2 = locale.y())
      {
        paramMap.put(localObject1, localObject2);
        break;
      }
      label1628:
      label1770:
      label1776:
      do
      {
        if (n == 91)
        {
          locale.a();
          localObject2 = new com.a.a.b();
          a((Collection)localObject2, localObject1);
          paramMap.put(localObject1, localObject2);
          if (locale.c() == 13)
          {
            locale.a();
            a(locali);
            return paramMap;
          }
          if (locale.c() != 16) {
            throw new runtimeexception("syntax error");
          }
        }
        else if (n == 123)
        {
          locale.a();
          localObject2 = a(new com.a.a.Map(), localObject1);
          a(paramMap, localObject1.toString());
          if (paramMap.getClass() == com.a.a.Map.class) {
            paramMap.put(localObject1.toString(), localObject2);
          }
          for (;;)
          {
            a(locali, localObject2, localObject1);
            if (locale.c() != 13) {
              break;
            }
            locale.a();
            a(locali);
            a(locali);
            return paramMap;
            paramMap.put(localObject1, localObject2);
          }
          if (locale.c() != 16) {
            throw new runtimeexception("syntax error, " + locale.d());
          }
        }
        else
        {
          locale.a();
          paramMap.put(localObject1, a(null));
          if (locale.c() == 13)
          {
            locale.a();
            a(locali);
            return paramMap;
          }
          if (locale.c() != 16)
          {
            throw new runtimeexception("syntax error, position at " + locale.e() + ", name " + localObject1);
            if (n == 125)
            {
              locale.l();
              locale.m();
              locale.a();
              a(paramMap, paramObject);
              a(locali);
              return paramMap;
            }
            throw new runtimeexception("syntax error, position at " + locale.e() + ", name " + localObject1);
          }
        }
        break;
        break label1117;
        paramMap = null;
        break label677;
        n = 0;
        break label464;
        n = 0;
        break label464;
        if (((i1 >= 48) && (i1 <= 57)) || (i1 == 45)) {
          break label362;
        }
        if (i1 == 123) {
          break label449;
        }
        if (i1 != 91) {
          break label540;
        }
        break label449;
        m = 1;
        break label1117;
        if ((n >= 48) && (n <= 57)) {
          break label1254;
        }
      } while (n != 45);
    }
  }
  
  public final DateFormat a()
  {
    if (this.h == null) {
      this.h = new SimpleDateFormat(this.g);
    }
    return this.h;
  }
  
  public final void a(int paramInt)
  {
    this.l = paramInt;
  }
  
  public final void a(a parama)
  {
    this.k.add(parama);
  }
  
  public final void a(i parami)
  {
    if (a(d.l)) {
      return;
    }
    this.e = parami;
  }
  
  public final void a(String paramString)
  {
    e locale = this.d;
    locale.b();
    if (locale.c() != 4) {
      throw new runtimeexception("type not match error");
    }
    if (paramString.equals(locale.s()))
    {
      locale.a();
      if (locale.c() == 16) {
        locale.a();
      }
      return;
    }
    throw new runtimeexception("type not match error");
  }
  
  public final void a(Type paramType, Collection paramCollection)
  {
    a(paramType, paramCollection, null);
  }
  
  public final void a(Type paramType, Collection paramCollection, Object paramObject)
  {
    if ((this.d.c() == 21) || (this.d.c() == 22)) {
      this.d.a();
    }
    if (this.d.c() != 14) {
      throw new runtimeexception("exepct '[', but " + g.a(this.d.c()));
    }
    Object localObject;
    i locali;
    int m;
    if (Integer.TYPE == paramType)
    {
      localObject = ad.a;
      this.d.a(2);
      locali = this.e;
      a(paramCollection, paramObject);
      m = 0;
    }
    for (;;)
    {
      try
      {
        if (!a(d.g)) {
          break label203;
        }
        if (this.d.c() != 16) {
          break label203;
        }
        this.d.a();
        continue;
        if (String.class != paramType) {
          break label176;
        }
      }
      finally
      {
        a(locali);
      }
      localObject = ax.a;
      this.d.a(4);
      break;
      label176:
      localObject = this.c.a(paramType);
      this.d.a(((aq)localObject).a_());
      break;
      label203:
      if (this.d.c() != 15)
      {
        if (Integer.TYPE == paramType)
        {
          paramCollection.add(ad.a.a(this, null, null));
          if (this.d.c() == 16) {
            this.d.a(((aq)localObject).a_());
          }
        }
        else
        {
          if (String.class == paramType)
          {
            if (this.d.c() == 4)
            {
              paramObject = this.d.s();
              this.d.a(16);
            }
            for (;;)
            {
              paramCollection.add(paramObject);
              break;
              paramObject = a(null);
              if (paramObject == null) {
                paramObject = null;
              } else {
                paramObject = paramObject.toString();
              }
            }
          }
          if (this.d.c() == 8) {
            this.d.a();
          }
          for (paramObject = null;; paramObject = ((aq)localObject).a(this, paramType, Integer.valueOf(m)))
          {
            paramCollection.add(paramObject);
            a(paramCollection);
            break;
          }
        }
      }
      else
      {
        a(locali);
        this.d.a(16);
        return;
      }
      m += 1;
    }
  }
  
  public final void a(Collection paramCollection)
  {
    if (this.l == 1)
    {
      int m = paramCollection.size();
      paramCollection = (List)paramCollection;
      a locala = h();
      locala.a(new aj(this, paramCollection, m - 1));
      locala.a(this.e);
      this.l = 0;
    }
  }
  
  public final void a(Map paramMap, String paramString)
  {
    if (this.l == 1)
    {
      paramMap = new ao(paramMap, paramString);
      paramString = h();
      paramString.a(paramMap);
      paramString.a(this.e);
      this.l = 0;
    }
  }
  
  public final boolean a(d paramd)
  {
    return this.d.a(paramd);
  }
  
  public final k b()
  {
    return this.b;
  }
  
  public final Object b(String paramString)
  {
    int m = 0;
    while (m < this.j)
    {
      if (paramString.equals(this.i[m].d())) {
        return this.i[m].b();
      }
      m += 1;
    }
    return null;
  }
  
  public final void b(int paramInt)
  {
    e locale = this.d;
    if (locale.c() == paramInt)
    {
      locale.a();
      return;
    }
    throw new runtimeexception("syntax error, expect " + g.a(paramInt) + ", actual " + g.a(locale.c()));
  }
  
  public final void b(Collection paramCollection)
  {
    a(paramCollection, null);
  }
  
  public final j c()
  {
    return this.c;
  }
  
  public void close()
  {
    e locale = this.d;
    try
    {
      if ((a(d.a)) && (locale.c() != 20)) {
        throw new runtimeexception("not close json text, token : " + g.a(locale.c()));
      }
    }
    finally
    {
      locale.close();
    }
    locale.close();
  }
  
  public final int d()
  {
    return this.l;
  }
  
  public final com.a.a.Map e()
  {
    com.a.a.Map locale = new com.a.a.Map();
    a(locale, null);
    return locale;
  }
  
  public final i f()
  {
    return this.e;
  }
  
  public final List g()
  {
    return this.k;
  }
  
  public final a h()
  {
    return (a)this.k.get(this.k.size() - 1);
  }
  
  public final void i()
  {
    if (a(d.l)) {
      return;
    }
    this.e = this.e.c();
    this.i[(this.j - 1)] = null;
    this.j -= 1;
  }
  
  public final Object j()
  {
    return a(null);
  }
  
  public final e k()
  {
    return this.d;
  }
  
  public static class a
  {
    private final i a;
    private final String b;
    private x c;
    private i d;
    
    public a(i parami, String paramString)
    {
      this.a = parami;
      this.b = paramString;
    }
    
    public final i a()
    {
      return this.a;
    }
    
    public final void a(x paramx)
    {
      this.c = paramx;
    }
    
    public final void a(i parami)
    {
      this.d = parami;
    }
    
    public final String b()
    {
      return this.b;
    }
    
    public final x c()
    {
      return this.c;
    }
    
    public final i d()
    {
      return this.d;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.saveaccountdatatoFile

 * JD-Core Version:    0.7.0.1

 */