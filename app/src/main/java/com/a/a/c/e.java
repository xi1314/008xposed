package com.a.a.c;

import com.a.a.runtimeexception;

import java.io.Closeable;
import java.lang.ref.SoftReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;

public abstract class e
  implements Closeable
{
  protected static final char[] n;
  protected static boolean[] o;
  protected static final int[] p;
  private static final ThreadLocal q = new ThreadLocal();
  protected int a;
  protected int b;
  protected int c = a.b;
  protected char d;
  protected int e;
  protected int f;
  protected char[] g;
  protected int h;
  protected int i;
  protected boolean j;
  protected Calendar k = null;
  public int l = 0;
  protected h m = h.a;
  
  static
  {
    n = ("\"" + a.a + "\":\"").toCharArray();
    boolean[] arrayOfBoolean = new boolean[256];
    o = arrayOfBoolean;
    arrayOfBoolean[32] = true;
    o[10] = true;
    o[13] = true;
    o[9] = true;
    o[12] = true;
    o[8] = true;
    p = new int[103];
    int i1 = 48;
    while (i1 <= 57)
    {
      p[i1] = (i1 - 48);
      i1 += 1;
    }
    i1 = 97;
    while (i1 <= 102)
    {
      p[i1] = (i1 - 97 + 10);
      i1 += 1;
    }
    i1 = 65;
    while (i1 <= 70)
    {
      p[i1] = (i1 - 65 + 10);
      i1 += 1;
    }
  }
  
  public e()
  {
    SoftReference localSoftReference = (SoftReference)q.get();
    if (localSoftReference != null)
    {
      this.g = ((char[])localSoftReference.get());
      q.set(null);
    }
    if (this.g == null) {
      this.g = new char[64];
    }
  }
  
  private void a(char paramChar)
  {
    if (this.h == this.g.length)
    {
      arrayOfChar = new char[this.g.length * 2];
      System.arraycopy(this.g, 0, arrayOfChar, 0, this.g.length);
      this.g = arrayOfChar;
    }
    char[] arrayOfChar = this.g;
    int i1 = this.h;
    this.h = (i1 + 1);
    arrayOfChar[i1] = paramChar;
  }
  
  private static boolean b(char paramChar)
  {
    return (paramChar == ' ') || (paramChar == '\n') || (paramChar == '\r') || (paramChar == '\t') || (paramChar == '\f') || (paramChar == '\b');
  }
  
  public final Number a(boolean paramBoolean)
  {
    int i1 = c(this.i + this.h - 1);
    if (i1 == 70) {
      return Float.valueOf(Float.parseFloat(i()));
    }
    if (i1 == 68) {
      return Double.valueOf(Double.parseDouble(i()));
    }
    if (paramBoolean) {
      return x();
    }
    return Double.valueOf(Double.parseDouble(i()));
  }
  
  public abstract String a(int paramInt1, int paramInt2, int paramInt3, k paramk);
  
  public final String a(k paramk)
  {
    u();
    if (this.d == '"') {
      return a(paramk, '"');
    }
    if (this.d == '\'')
    {
      if (!a(d.d)) {
        throw new runtimeexception("syntax error");
      }
      return a(paramk, '\'');
    }
    if (this.d == '}')
    {
      l();
      this.a = 13;
      return null;
    }
    if (this.d == ',')
    {
      l();
      this.a = 16;
      return null;
    }
    if (this.d == '\032')
    {
      this.a = 20;
      return null;
    }
    if (!a(d.c)) {
      throw new runtimeexception("syntax error");
    }
    return b(paramk);
  }
  
  public final String a(k paramk, char paramChar)
  {
    this.i = this.e;
    this.h = 0;
    int i4 = 0;
    int i2 = 0;
    for (;;)
    {
      int i3 = this.e + 1;
      this.e = i3;
      char c1 = c(i3);
      if (c1 == paramChar) {
        break;
      }
      if (c1 == '\032') {
        throw new runtimeexception("unclosed.str");
      }
      char[] arrayOfChar;
      if (c1 == '\\')
      {
        i3 = i4;
        if (i4 == 0)
        {
          if (this.h >= this.g.length)
          {
            i4 = this.g.length * 2;
            i3 = i4;
            if (this.h > i4) {
              i3 = this.h;
            }
            arrayOfChar = new char[i3];
            System.arraycopy(this.g, 0, arrayOfChar, 0, this.g.length);
            this.g = arrayOfChar;
          }
          a(this.i + 1, this.g, this.h);
          i3 = 1;
        }
        i4 = this.e + 1;
        this.e = i4;
        c1 = c(i4);
        char c2;
        switch (c1)
        {
        default: 
          this.d = c1;
          throw new runtimeexception("unclosed.str.lit");
        case '0': 
          i2 = i2 * 31 + c1;
          a('\000');
          i4 = i3;
          break;
        case '1': 
          i2 = i2 * 31 + c1;
          a('\001');
          i4 = i3;
          break;
        case '2': 
          i2 = i2 * 31 + c1;
          a('\002');
          i4 = i3;
          break;
        case '3': 
          i2 = i2 * 31 + c1;
          a('\003');
          i4 = i3;
          break;
        case '4': 
          i2 = i2 * 31 + c1;
          a('\004');
          i4 = i3;
          break;
        case '5': 
          i2 = i2 * 31 + c1;
          a('\005');
          i4 = i3;
          break;
        case '6': 
          i2 = i2 * 31 + c1;
          a('\006');
          i4 = i3;
          break;
        case '7': 
          i2 = i2 * 31 + c1;
          a('\007');
          i4 = i3;
          break;
        case 'b': 
          i2 = i2 * 31 + 8;
          a('\b');
          i4 = i3;
          break;
        case 't': 
          i2 = i2 * 31 + 9;
          a('\t');
          i4 = i3;
          break;
        case 'n': 
          i2 = i2 * 31 + 10;
          a('\n');
          i4 = i3;
          break;
        case 'v': 
          i2 = i2 * 31 + 11;
          a('\013');
          i4 = i3;
          break;
        case 'F': 
        case 'f': 
          i2 = i2 * 31 + 12;
          a('\f');
          i4 = i3;
          break;
        case 'r': 
          i2 = i2 * 31 + 13;
          a('\r');
          i4 = i3;
          break;
        case '"': 
          i2 = i2 * 31 + 34;
          a('"');
          i4 = i3;
          break;
        case '\'': 
          i2 = i2 * 31 + 39;
          a('\'');
          i4 = i3;
          break;
        case '/': 
          i2 = i2 * 31 + 47;
          a('/');
          i4 = i3;
          break;
        case '\\': 
          i2 = i2 * 31 + 92;
          a('\\');
          i4 = i3;
          break;
        case 'x': 
          i4 = this.e + 1;
          this.e = i4;
          c1 = c(i4);
          this.d = c1;
          i4 = this.e + 1;
          this.e = i4;
          c2 = c(i4);
          this.d = c2;
          c1 = (char)(p[c1] * 16 + p[c2]);
          i2 = i2 * 31 + c1;
          a(c1);
          i4 = i3;
          break;
        case 'u': 
          i4 = this.e + 1;
          this.e = i4;
          c1 = c(i4);
          i4 = this.e + 1;
          this.e = i4;
          c2 = c(i4);
          i4 = this.e + 1;
          this.e = i4;
          int i1 = c(i4);
          i4 = this.e + 1;
          this.e = i4;
          i4 = Integer.parseInt(new String(new char[] { c1, c2, i1, c(i4) }), 16);
          i2 = i2 * 31 + i4;
          a((char)i4);
          i4 = i3;
          break;
        }
      }
      else
      {
        i2 = i2 * 31 + c1;
        if (i4 == 0)
        {
          this.h += 1;
        }
        else if (this.h == this.g.length)
        {
          a(c1);
        }
        else
        {
          arrayOfChar = this.g;
          i3 = this.h;
          this.h = (i3 + 1);
          arrayOfChar[i3] = c1;
        }
      }
    }
    this.a = 4;
    l();
    if (i4 == 0) {
      return a(this.i + 1, this.h, i2, paramk);
    }
    return paramk.a(this.g, this.h, i2);
  }
  
  public final void a()
  {
    this.h = 0;
    for (;;)
    {
      this.b = this.e;
      if (this.d == '"')
      {
        n();
        return;
      }
      if (this.d == ',')
      {
        l();
        this.a = 16;
        return;
      }
      if ((this.d >= '0') && (this.d <= '9'))
      {
        v();
        return;
      }
      if (this.d == '-')
      {
        v();
        return;
      }
      switch (this.d)
      {
      default: 
        if (!j()) {
          break label2389;
        }
        if (this.a != 20) {
          break;
        }
        throw new runtimeexception("EOF error");
      case '\'': 
        if (!a(d.d)) {
          throw new runtimeexception("Feature.AllowSingleQuotes is false");
        }
        this.i = this.e;
        this.j = false;
        for (;;)
        {
          i3 = this.e + 1;
          this.e = i3;
          char c1 = c(i3);
          if (c1 == '\'') {
            break;
          }
          if (c1 == '\032') {
            throw new runtimeexception("unclosed single-quote string");
          }
          char[] arrayOfChar;
          if (c1 == '\\')
          {
            if (!this.j)
            {
              this.j = true;
              if (this.h > this.g.length)
              {
                arrayOfChar = new char[this.h * 2];
                System.arraycopy(this.g, 0, arrayOfChar, 0, this.g.length);
                this.g = arrayOfChar;
              }
              a(this.i + 1, this.h, this.g);
            }
            i3 = this.e + 1;
            this.e = i3;
            c1 = c(i3);
            switch (c1)
            {
            default: 
              this.d = c1;
              throw new runtimeexception("unclosed single-quote string");
            case '0': 
              a('\000');
              break;
            case '1': 
              a('\001');
              break;
            case '2': 
              a('\002');
              break;
            case '3': 
              a('\003');
              break;
            case '4': 
              a('\004');
              break;
            case '5': 
              a('\005');
              break;
            case '6': 
              a('\006');
              break;
            case '7': 
              a('\007');
              break;
            case 'b': 
              a('\b');
              break;
            case 't': 
              a('\t');
              break;
            case 'n': 
              a('\n');
              break;
            case 'v': 
              a('\013');
              break;
            case 'F': 
            case 'f': 
              a('\f');
              break;
            case 'r': 
              a('\r');
              break;
            case '"': 
              a('"');
              break;
            case '\'': 
              a('\'');
              break;
            case '/': 
              a('/');
              break;
            case '\\': 
              a('\\');
              break;
            case 'x': 
              i3 = this.e + 1;
              this.e = i3;
              i3 = c(i3);
              int i4 = this.e + 1;
              this.e = i4;
              i4 = c(i4);
              a((char)(p[i3] * 16 + p[i4]));
              break;
            case 'u': 
              i3 = this.e + 1;
              this.e = i3;
              c1 = c(i3);
              i3 = this.e + 1;
              this.e = i3;
              int i1 = c(i3);
              i3 = this.e + 1;
              this.e = i3;
              int i2 = c(i3);
              i3 = this.e + 1;
              this.e = i3;
              a((char)Integer.parseInt(new String(new char[] { c1, i1, i2, c(i3) }), 16));
              break;
            }
          }
          else if (!this.j)
          {
            this.h += 1;
          }
          else if (this.h == this.g.length)
          {
            a(c1);
          }
          else
          {
            arrayOfChar = this.g;
            i3 = this.h;
            this.h = (i3 + 1);
            arrayOfChar[i3] = c1;
          }
        }
        this.a = 4;
        l();
        return;
      case '\b': 
      case '\t': 
      case '\n': 
      case '\f': 
      case '\r': 
      case ' ': 
        l();
      }
    }
    if (this.d != 't') {
      throw new runtimeexception("error parse true");
    }
    l();
    if (this.d != 'r') {
      throw new runtimeexception("error parse true");
    }
    l();
    if (this.d != 'u') {
      throw new runtimeexception("error parse true");
    }
    l();
    if (this.d != 'packageinfolist') {
      throw new runtimeexception("error parse true");
    }
    l();
    if ((this.d == ' ') || (this.d == ',') || (this.d == '}') || (this.d == ']') || (this.d == '\n') || (this.d == '\r') || (this.d == '\t') || (this.d == '\032') || (this.d == '\f') || (this.d == '\b'))
    {
      this.a = 6;
      return;
    }
    throw new runtimeexception("scan true error");
    if (this.d != 'T') {
      throw new runtimeexception("error parse true");
    }
    l();
    if (this.d != 'r') {
      throw new runtimeexception("error parse true");
    }
    l();
    if (this.d != 'packageinfolist') {
      throw new runtimeexception("error parse true");
    }
    l();
    if (this.d != 'packageinfolist') {
      throw new runtimeexception("error parse true");
    }
    l();
    if (this.d != 'S') {
      throw new runtimeexception("error parse true");
    }
    l();
    if (this.d != 'packageinfolist') {
      throw new runtimeexception("error parse true");
    }
    l();
    if (this.d != 't') {
      throw new runtimeexception("error parse true");
    }
    l();
    if ((this.d == ' ') || (this.d == '\n') || (this.d == '\r') || (this.d == '\t') || (this.d == '\f') || (this.d == '\b') || (this.d == '[') || (this.d == '('))
    {
      this.a = 22;
      return;
    }
    throw new runtimeexception("scan set error");
    if (this.d != 'S') {
      throw new runtimeexception("error parse true");
    }
    l();
    if (this.d != 'packageinfolist') {
      throw new runtimeexception("error parse true");
    }
    l();
    if (this.d != 't') {
      throw new runtimeexception("error parse true");
    }
    l();
    if ((this.d == ' ') || (this.d == '\n') || (this.d == '\r') || (this.d == '\t') || (this.d == '\f') || (this.d == '\b') || (this.d == '[') || (this.d == '('))
    {
      this.a = 21;
      return;
    }
    throw new runtimeexception("scan set error");
    if (this.d != 'f') {
      throw new runtimeexception("error parse false");
    }
    l();
    if (this.d != 'a') {
      throw new runtimeexception("error parse false");
    }
    l();
    if (this.d != 'l') {
      throw new runtimeexception("error parse false");
    }
    l();
    if (this.d != 's') {
      throw new runtimeexception("error parse false");
    }
    l();
    if (this.d != 'packageinfolist') {
      throw new runtimeexception("error parse false");
    }
    l();
    if ((this.d == ' ') || (this.d == ',') || (this.d == '}') || (this.d == ']') || (this.d == '\n') || (this.d == '\r') || (this.d == '\t') || (this.d == '\032') || (this.d == '\f') || (this.d == '\b'))
    {
      this.a = 7;
      return;
    }
    throw new runtimeexception("scan false error");
    if (this.d != 'n') {
      throw new runtimeexception("error parse null or new");
    }
    l();
    if (this.d == 'u')
    {
      l();
      if (this.d != 'l') {
        throw new runtimeexception("error parse true");
      }
      l();
      if (this.d != 'l') {
        throw new runtimeexception("error parse true");
      }
      l();
      if ((this.d == ' ') || (this.d == ',') || (this.d == '}') || (this.d == ']') || (this.d == '\n') || (this.d == '\r') || (this.d == '\t') || (this.d == '\032') || (this.d == '\f') || (this.d == '\b'))
      {
        this.a = 8;
        return;
      }
      throw new runtimeexception("scan true error");
    }
    if (this.d != 'packageinfolist') {
      throw new runtimeexception("error parse packageinfolist");
    }
    l();
    if (this.d != 'w') {
      throw new runtimeexception("error parse w");
    }
    l();
    if ((this.d == ' ') || (this.d == ',') || (this.d == '}') || (this.d == ']') || (this.d == '\n') || (this.d == '\r') || (this.d == '\t') || (this.d == '\032') || (this.d == '\f') || (this.d == '\b'))
    {
      this.a = 9;
      return;
    }
    throw new runtimeexception("scan true error");
    l();
    this.a = 10;
    return;
    l();
    this.a = 11;
    return;
    l();
    this.a = 14;
    return;
    l();
    this.a = 15;
    return;
    l();
    this.a = 12;
    return;
    l();
    this.a = 13;
    return;
    l();
    this.a = 17;
    return;
    this.a = 20;
    int i3 = this.f;
    this.e = i3;
    this.b = i3;
    return;
    label2389:
    i3 = this.d;
    this.a = 1;
    l();
  }
  
  public final void a(int paramInt)
  {
    this.h = 0;
    switch (paramInt)
    {
    }
    for (;;)
    {
      if ((this.d == ' ') || (this.d == '\n') || (this.d == '\r') || (this.d == '\t') || (this.d == '\f') || (this.d == '\b'))
      {
        l();
        break;
        if (this.d == '{')
        {
          this.a = 12;
          l();
          return;
        }
        if (this.d == '[')
        {
          this.a = 14;
          l();
          return;
          if (this.d == ',')
          {
            this.a = 16;
            l();
            return;
          }
          if (this.d == '}')
          {
            this.a = 13;
            l();
            return;
          }
          if (this.d == ']')
          {
            this.a = 15;
            l();
            return;
          }
          if (this.d == '\032')
          {
            this.a = 20;
            return;
            if ((this.d >= '0') && (this.d <= '9'))
            {
              this.b = this.e;
              v();
              return;
            }
            if (this.d == '"')
            {
              this.b = this.e;
              n();
              return;
            }
            if (this.d == '[')
            {
              this.a = 14;
              l();
              return;
            }
            if (this.d == '{')
            {
              this.a = 12;
              l();
              return;
              if (this.d == '"')
              {
                this.b = this.e;
                n();
                return;
              }
              if ((this.d >= '0') && (this.d <= '9'))
              {
                this.b = this.e;
                v();
                return;
              }
              if (this.d == '[')
              {
                this.a = 14;
                l();
                return;
              }
              if (this.d == '{')
              {
                this.a = 12;
                l();
                return;
                if (this.d == '[')
                {
                  this.a = 14;
                  l();
                  return;
                }
                if (this.d == '{')
                {
                  this.a = 12;
                  l();
                  return;
                  if (this.d == ']')
                  {
                    this.a = 15;
                    l();
                    return;
                  }
                  if (this.d == '\032')
                  {
                    this.a = 20;
                    return;
                    while (b(this.d)) {
                      l();
                    }
                    if ((this.d == '_') || (Character.isLetter(this.d)))
                    {
                      this.i = (this.e - 1);
                      this.j = false;
                      do
                      {
                        this.h += 1;
                        l();
                      } while (Character.isLetterOrDigit(this.d));
                      Object localObject = s();
                      localObject = this.m.a((String)localObject);
                      if (localObject != null)
                      {
                        this.a = ((Integer)localObject).intValue();
                        return;
                      }
                      this.a = 18;
                      return;
                    }
                    a();
                    return;
                  }
                }
              }
            }
          }
        }
      }
    }
    a();
  }
  
  protected abstract void a(int paramInt1, int paramInt2, char[] paramArrayOfChar);
  
  protected abstract void a(int paramInt1, char[] paramArrayOfChar, int paramInt2);
  
  public final boolean a(d paramd)
  {
    return d.a(this.c, paramd);
  }
  
  public final String b(k paramk)
  {
    boolean[] arrayOfBoolean = b.b;
    int i2 = this.d;
    if ((this.d >= arrayOfBoolean.length) || (arrayOfBoolean[i2] != 0)) {}
    for (int i1 = 1; i1 == 0; i1 = 0) {
      throw new runtimeexception("illegal identifier : " + this.d);
    }
    arrayOfBoolean = b.c;
    this.i = this.e;
    this.h = 1;
    i1 = i2;
    for (;;)
    {
      i2 = this.e + 1;
      this.e = i2;
      i2 = c(i2);
      if ((i2 < arrayOfBoolean.length) && (arrayOfBoolean[i2] == 0)) {
        break;
      }
      i1 = i1 * 31 + i2;
      this.h += 1;
    }
    this.d = c(this.e);
    this.a = 18;
    if ((this.h == 4) && (i1 == 3392903) && (c(this.i) == 'n') && (c(this.i + 1) == 'u') && (c(this.i + 2) == 'l') && (c(this.i + 3) == 'l')) {
      return null;
    }
    return a(this.i, this.h, i1, paramk);
  }
  
  public final void b()
  {
    this.h = 0;
    for (;;)
    {
      if (this.d == ':')
      {
        l();
        a();
        return;
      }
      if ((this.d != ' ') && (this.d != '\n') && (this.d != '\r') && (this.d != '\t') && (this.d != '\f') && (this.d != '\b')) {
        break;
      }
      l();
    }
    throw new runtimeexception("not match ':' - " + this.d);
  }
  
  public final void b(int paramInt)
  {
    this.h = 0;
    if (this.d == ':') {
      l();
    }
    for (;;)
    {
      if (paramInt == 2)
      {
        if ((this.d >= '0') && (this.d <= '9'))
        {
          this.b = this.e;
          v();
          return;
          if (b(this.d))
          {
            l();
            break;
          }
          throw new runtimeexception("not match ':', actual " + this.d);
        }
        if (this.d != '"') {
          break label277;
        }
        this.b = this.e;
        n();
        return;
      }
      if (paramInt == 4)
      {
        if (this.d == '"')
        {
          this.b = this.e;
          n();
          return;
        }
        if ((this.d >= '0') && (this.d <= '9'))
        {
          this.b = this.e;
          v();
        }
      }
      else if (paramInt == 12)
      {
        if (this.d == '{')
        {
          this.a = 12;
          l();
          return;
        }
        if (this.d == '[')
        {
          this.a = 14;
          l();
        }
      }
      else if (paramInt == 14)
      {
        if (this.d == '[')
        {
          this.a = 14;
          l();
          return;
        }
        if (this.d == '{')
        {
          this.a = 12;
          l();
          return;
        }
      }
      label277:
      if (!b(this.d)) {
        break label295;
      }
      l();
    }
    label295:
    a();
  }
  
  public abstract char c(int paramInt);
  
  public final int c()
  {
    return this.a;
  }
  
  public void close()
  {
    if (this.g.length <= 8192) {
      q.set(new SoftReference(this.g));
    }
    this.g = null;
  }
  
  public final String d()
  {
    return g.a(this.a);
  }
  
  public final int e()
  {
    return this.b;
  }
  
  public final int f()
  {
    return this.e;
  }
  
  public final Number g()
    throws NumberFormatException
  {
    long l1 = 0L;
    int i3 = this.i;
    int i1 = this.i;
    int i2 = this.h + i1;
    i1 = 32;
    int i4;
    long l2;
    label89:
    int i5;
    switch (c(i2 - 1))
    {
    default: 
      if (c(this.i) == '-')
      {
        i4 = 1;
        l2 = -9223372036854775808L;
        i3 += 1;
        if (i3 >= i2) {
          break label360;
        }
        int[] arrayOfInt = p;
        i5 = i3 + 1;
        l1 = -arrayOfInt[c(i3)];
        i3 = i5;
      }
      break;
    }
    label360:
    for (;;)
    {
      if (i3 < i2)
      {
        i5 = p[c(i3)];
        if (l1 < -922337203685477580L)
        {
          return new BigInteger(i());
          i2 -= 1;
          i1 = 76;
          break;
          i2 -= 1;
          i1 = 83;
          break;
          i2 -= 1;
          i1 = 66;
          break;
          i4 = 0;
          l2 = -9223372036854775807L;
          break label89;
        }
        l1 *= 10L;
        if (l1 < i5 + l2) {
          return new BigInteger(i());
        }
        l1 -= i5;
        i3 += 1;
        continue;
      }
      if (i4 != 0)
      {
        if (i3 > this.i + 1)
        {
          if ((l1 >= -2147483648L) && (i1 != 76)) {
            return Integer.valueOf((int)l1);
          }
          return Long.valueOf(l1);
        }
        throw new NumberFormatException(i());
      }
      l1 = -l1;
      if ((l1 <= 2147483647L) && (i1 != 76))
      {
        if (i1 == 83) {
          return Short.valueOf((short)(int)l1);
        }
        if (i1 == 66) {
          return Byte.valueOf((byte)(int)l1);
        }
        return Integer.valueOf((int)l1);
      }
      return Long.valueOf(l1);
    }
  }
  
  public final float h()
  {
    return Float.parseFloat(i());
  }
  
  public abstract String i();
  
  public abstract boolean j();
  
  public final char k()
  {
    return this.d;
  }
  
  public abstract char l();
  
  public final void m()
  {
    this.h = 0;
  }
  
  public final void n()
  {
    this.i = this.e;
    this.j = false;
    for (;;)
    {
      i3 = this.e + 1;
      this.e = i3;
      char c1 = c(i3);
      if (c1 == '"') {
        break;
      }
      if (c1 == '\032') {
        throw new runtimeexception("unclosed string : " + c1);
      }
      char[] arrayOfChar;
      if (c1 == '\\')
      {
        int i4;
        if (!this.j)
        {
          this.j = true;
          if (this.h >= this.g.length)
          {
            i4 = this.g.length * 2;
            i3 = i4;
            if (this.h > i4) {
              i3 = this.h;
            }
            arrayOfChar = new char[i3];
            System.arraycopy(this.g, 0, arrayOfChar, 0, this.g.length);
            this.g = arrayOfChar;
          }
          a(this.i + 1, this.h, this.g);
        }
        i3 = this.e + 1;
        this.e = i3;
        c1 = c(i3);
        switch (c1)
        {
        default: 
          this.d = c1;
          throw new runtimeexception("unclosed string : " + c1);
        case '0': 
          a('\000');
          break;
        case '1': 
          a('\001');
          break;
        case '2': 
          a('\002');
          break;
        case '3': 
          a('\003');
          break;
        case '4': 
          a('\004');
          break;
        case '5': 
          a('\005');
          break;
        case '6': 
          a('\006');
          break;
        case '7': 
          a('\007');
          break;
        case 'b': 
          a('\b');
          break;
        case 't': 
          a('\t');
          break;
        case 'n': 
          a('\n');
          break;
        case 'v': 
          a('\013');
          break;
        case 'F': 
        case 'f': 
          a('\f');
          break;
        case 'r': 
          a('\r');
          break;
        case '"': 
          a('"');
          break;
        case '\'': 
          a('\'');
          break;
        case '/': 
          a('/');
          break;
        case '\\': 
          a('\\');
          break;
        case 'x': 
          i3 = this.e + 1;
          this.e = i3;
          i3 = c(i3);
          i4 = this.e + 1;
          this.e = i4;
          i4 = c(i4);
          a((char)(p[i3] * 16 + p[i4]));
          break;
        case 'u': 
          i3 = this.e + 1;
          this.e = i3;
          c1 = c(i3);
          i3 = this.e + 1;
          this.e = i3;
          int i1 = c(i3);
          i3 = this.e + 1;
          this.e = i3;
          int i2 = c(i3);
          i3 = this.e + 1;
          this.e = i3;
          a((char)Integer.parseInt(new String(new char[] { c1, i1, i2, c(i3) }), 16));
          break;
        }
      }
      else if (!this.j)
      {
        this.h += 1;
      }
      else if (this.h == this.g.length)
      {
        a(c1);
      }
      else
      {
        arrayOfChar = this.g;
        i3 = this.h;
        this.h = (i3 + 1);
        arrayOfChar[i3] = c1;
      }
    }
    this.a = 4;
    int i3 = this.e + 1;
    this.e = i3;
    this.d = c(i3);
  }
  
  public final Calendar o()
  {
    return this.k;
  }
  
  public final int p()
  {
    int i2 = 0;
    int i1 = this.i;
    int i6 = this.i + this.h;
    int i3;
    int i4;
    int i5;
    if (c(this.i) == '-')
    {
      i3 = 1;
      i4 = -2147483648;
      i1 += 1;
      if (i1 >= i6) {
        break label223;
      }
      int[] arrayOfInt = p;
      i2 = i1 + 1;
      i5 = -arrayOfInt[c(i1)];
      i1 = i2;
      i2 = i5;
    }
    label223:
    for (;;)
    {
      if (i1 < i6)
      {
        i5 = i1 + 1;
        int i7 = c(i1);
        i1 = i5;
        if (i7 != 76)
        {
          i1 = i5;
          if (i7 != 83)
          {
            i1 = i5;
            if (i7 != 66)
            {
              i1 = p[i7];
              if (i2 < -214748364)
              {
                throw new NumberFormatException(i());
                i4 = -2147483647;
                i3 = 0;
                break;
              }
              i2 *= 10;
              if (i2 < i4 + i1) {
                throw new NumberFormatException(i());
              }
              i2 -= i1;
              i1 = i5;
              continue;
            }
          }
        }
      }
      if (i3 != 0)
      {
        if (i1 > this.i + 1) {
          return i2;
        }
        throw new NumberFormatException(i());
      }
      return -i2;
    }
  }
  
  public abstract byte[] q();
  
  public final boolean r()
  {
    if (this.h != 4) {}
    while ((c(this.i + 1) != '$') || (c(this.i + 2) != 'r') || (c(this.i + 3) != 'packageinfolist') || (c(this.i + 4) != 'f')) {
      return false;
    }
    return true;
  }
  
  public abstract String s();
  
  public final boolean t()
  {
    int i1 = 0;
    for (;;)
    {
      char c1 = c(i1);
      if (c1 == '\032') {
        break;
      }
      if (!b(c1)) {
        return false;
      }
      i1 += 1;
    }
    return true;
  }
  
  public final void u()
  {
    while (o[this.d] != 0) {
      l();
    }
  }
  
  public final void v()
  {
    this.i = this.e;
    if (this.d == '-')
    {
      this.h += 1;
      l();
    }
    while ((this.d >= '0') && (this.d <= '9'))
    {
      this.h += 1;
      l();
    }
    int i1 = 0;
    if (this.d == '.')
    {
      this.h += 1;
      l();
      while ((this.d >= '0') && (this.d <= '9'))
      {
        this.h += 1;
        l();
      }
      i1 = 1;
    }
    if (this.d == 'L')
    {
      this.h += 1;
      l();
    }
    while (i1 != 0)
    {
      this.a = 3;
      return;
      if (this.d == 'S')
      {
        this.h += 1;
        l();
      }
      else if (this.d == 'B')
      {
        this.h += 1;
        l();
      }
      else
      {
        if (this.d == 'F')
        {
          this.h += 1;
          l();
        }
        for (;;)
        {
          i1 = 1;
          break;
          if (this.d == 'D')
          {
            this.h += 1;
            l();
          }
          else
          {
            if ((this.d != 'packageinfolist') && (this.d != 'E')) {
              break;
            }
            this.h += 1;
            l();
            if ((this.d == '+') || (this.d == '-'))
            {
              this.h += 1;
              l();
            }
            while ((this.d >= '0') && (this.d <= '9'))
            {
              this.h += 1;
              l();
            }
            if ((this.d == 'D') || (this.d == 'F'))
            {
              this.h += 1;
              l();
            }
          }
        }
      }
    }
    this.a = 2;
  }
  
  public final long w()
    throws NumberFormatException
  {
    long l1 = 0L;
    int i1 = this.i;
    int i4 = this.i + this.h;
    int i2;
    long l2;
    int i3;
    if (c(this.i) == '-')
    {
      i2 = 1;
      l2 = -9223372036854775808L;
      i1 += 1;
      if (i1 >= i4) {
        break label230;
      }
      int[] arrayOfInt = p;
      i3 = i1 + 1;
      l1 = -arrayOfInt[c(i1)];
      i1 = i3;
    }
    label230:
    for (;;)
    {
      if (i1 < i4)
      {
        i3 = i1 + 1;
        int i5 = c(i1);
        i1 = i3;
        if (i5 != 76)
        {
          i1 = i3;
          if (i5 != 83)
          {
            i1 = i3;
            if (i5 != 66)
            {
              i1 = p[i5];
              if (l1 < -922337203685477580L)
              {
                throw new NumberFormatException(i());
                i2 = 0;
                l2 = -9223372036854775807L;
                break;
              }
              l1 *= 10L;
              if (l1 < i1 + l2) {
                throw new NumberFormatException(i());
              }
              l1 -= i1;
              i1 = i3;
              continue;
            }
          }
        }
      }
      if (i2 != 0)
      {
        if (i1 > this.i + 1) {
          return l1;
        }
        throw new NumberFormatException(i());
      }
      return -l1;
    }
  }
  
  public final BigDecimal x()
  {
    return new BigDecimal(i());
  }
  
  public final Number y()
  {
    int i1 = c(this.i + this.h - 1);
    String str = i();
    switch (i1)
    {
    case 69: 
    default: 
      return new BigDecimal(str);
    case 68: 
      return Double.valueOf(Double.parseDouble(str));
    }
    return Float.valueOf(Float.parseFloat(str));
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.packageinfolist

 * JD-Core Version:    0.7.0.1

 */