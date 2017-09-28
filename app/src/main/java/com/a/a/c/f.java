package com.a.a.c;

import com.a.a.Map.d;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public final class f
  extends e
{
  public final int q = 10;
  public final int r = 19;
  public final int s = 23;
  private final String t;
  
  public f(String paramString)
  {
    this(paramString, a.b);
  }
  
  public f(String paramString, int paramInt)
  {
    this.c = paramInt;
    this.t = paramString;
    this.e = -1;
    l();
    if (this.d == 65279) {
      l();
    }
  }
  
  private void a(char paramChar1, char paramChar2, char paramChar3, char paramChar4, char paramChar5, char paramChar6, char paramChar7, char paramChar8)
  {
    Locale localLocale = Locale.getDefault();
    this.k = Calendar.getInstance(TimeZone.getDefault(), localLocale);
    paramChar1 = p[paramChar1];
    paramChar2 = p[paramChar2];
    paramChar3 = p[paramChar3];
    paramChar4 = p[paramChar4];
    paramChar5 = p[paramChar5];
    paramChar6 = p[paramChar6];
    paramChar7 = p[paramChar7];
    paramChar8 = p[paramChar8];
    this.k.set(1, paramChar1 * 'Ϩ' + paramChar2 * 'd' + paramChar3 * '\n' + paramChar4);
    this.k.set(2, paramChar5 * '\n' + paramChar6 - 1);
    this.k.set(5, paramChar7 * '\n' + paramChar8);
  }
  
  private static boolean a(char paramChar1, char paramChar2, char paramChar3, char paramChar4, char paramChar5, char paramChar6)
  {
    if (paramChar1 == '0') {
      if ((paramChar2 >= '0') && (paramChar2 <= '9')) {
        break label38;
      }
    }
    label38:
    label62:
    do
    {
      do
      {
        do
        {
          return false;
          if (paramChar1 != '1') {
            break;
          }
        } while ((paramChar2 < '0') || (paramChar2 > '9'));
        if ((paramChar3 < '0') || (paramChar3 > '5')) {
          break label112;
        }
      } while ((paramChar4 < '0') || (paramChar4 > '9'));
      if ((paramChar5 < '0') || (paramChar5 > '5')) {
        break label126;
      }
    } while ((paramChar6 < '0') || (paramChar6 > '9'));
    label112:
    label126:
    do
    {
      return true;
      if ((paramChar1 != '2') || (paramChar2 < '0')) {
        break;
      }
      if (paramChar2 <= '4') {
        break label38;
      }
      return false;
      if (paramChar3 != '6') {
        break;
      }
      if (paramChar4 == '0') {
        break label62;
      }
      return false;
      if (paramChar5 != '6') {
        break;
      }
    } while (paramChar6 == '0');
    return false;
  }
  
  private static boolean a(char paramChar1, char paramChar2, char paramChar3, char paramChar4, char paramChar5, char paramChar6, int paramInt1, int paramInt2)
  {
    if ((paramChar1 != '1') && (paramChar1 != '2')) {}
    label71:
    do
    {
      do
      {
        do
        {
          return false;
        } while ((paramChar2 < '0') || (paramChar2 > '9') || (paramChar3 < '0') || (paramChar3 > '9') || (paramChar4 < '0') || (paramChar4 > '9'));
        if (paramChar5 != '0') {
          break;
        }
      } while ((paramChar6 < '1') || (paramChar6 > '9'));
      if (paramInt1 != 48) {
        break label124;
      }
    } while ((paramInt2 < 49) || (paramInt2 > 57));
    label124:
    do
    {
      do
      {
        return true;
        if (paramChar5 != '1') {
          break;
        }
        if ((paramChar6 == '0') || (paramChar6 == '1') || (paramChar6 == '2')) {
          break label71;
        }
        return false;
        if ((paramInt1 != 49) && (paramInt1 != 50)) {
          break label154;
        }
        if (paramInt2 < 48) {
          break;
        }
      } while (paramInt2 <= 57);
      return false;
      if (paramInt1 != 51) {
        break;
      }
    } while ((paramInt2 == 48) || (paramInt2 == 49));
    label154:
    return false;
  }
  
  public final String a(int paramInt1, int paramInt2, int paramInt3, k paramk)
  {
    return paramk.a(this.t, paramInt1, paramInt2, paramInt3);
  }
  
  protected final void a(int paramInt1, int paramInt2, char[] paramArrayOfChar)
  {
    this.t.getChars(paramInt1, paramInt1 + paramInt2, paramArrayOfChar, 0);
  }
  
  protected final void a(int paramInt1, char[] paramArrayOfChar, int paramInt2)
  {
    this.t.getChars(paramInt1, paramInt1 + paramInt2, paramArrayOfChar, 0);
  }
  
  public final boolean b(boolean paramBoolean)
  {
    int m = this.t.length() - this.e;
    if ((!paramBoolean) && (m > 13))
    {
      i = c(this.e);
      j = c(this.e + 1);
      k = c(this.e + 2);
      n = c(this.e + 3);
      i1 = c(this.e + 4);
      i2 = c(this.e + 5);
      int i3 = c(this.e + m - 1);
      int i4 = c(this.e + m - 2);
      if ((i == 47) && (j == 68) && (k == 97) && (n == 116) && (i1 == 101) && (i2 == 40) && (i3 == 47) && (i4 == 41))
      {
        j = -1;
        i = 6;
        if (i < m)
        {
          n = c(this.e + i);
          if (n == 43) {
            k = i;
          }
          do
          {
            i += 1;
            j = k;
            break;
            if (n < 48) {
              break label250;
            }
            k = j;
          } while (n <= 57);
        }
        label250:
        if (j == -1) {
          return false;
        }
        i = this.e + 6;
        long l = Long.parseLong(this.t.substring(i, j - i + i));
        Locale localLocale = Locale.getDefault();
        this.k = Calendar.getInstance(TimeZone.getDefault(), localLocale);
        this.k.setTimeInMillis(l);
        this.a = 5;
        return true;
      }
    }
    if ((m == 8) || (m == 14) || (m == 17))
    {
      if (paramBoolean) {
        return false;
      }
      c1 = c(this.e);
      c2 = c(this.e + 1);
      c3 = c(this.e + 2);
      c4 = c(this.e + 3);
      c5 = c(this.e + 4);
      c6 = c(this.e + 5);
      c7 = c(this.e + 6);
      c8 = c(this.e + 7);
      if (!a(c1, c2, c3, c4, c5, c6, c7, c8)) {
        return false;
      }
      a(c1, c2, c3, c4, c5, c6, c7, c8);
      if (m != 8)
      {
        c1 = c(this.e + 8);
        c2 = c(this.e + 9);
        c3 = c(this.e + 10);
        c4 = c(this.e + 11);
        c5 = c(this.e + 12);
        c6 = c(this.e + 13);
        if (!a(c1, c2, c3, c4, c5, c6)) {
          return false;
        }
        if (m == 17)
        {
          i = c(this.e + 14);
          j = c(this.e + 15);
          k = c(this.e + 16);
          if ((i < 48) || (i > 57)) {
            return false;
          }
          if ((j < 48) || (j > 57)) {
            return false;
          }
          if ((k < 48) || (k > 57)) {
            return false;
          }
          i = p[i] * 100 + p[j] * 10 + p[k];
          j = p[c1];
          j = p[c2] + j * 10;
          k = p[c3];
          k = p[c4] + k * 10;
          n = p[c5] * 10 + p[c6];
          m = i;
          i = n;
        }
      }
      for (;;)
      {
        this.k.set(11, j);
        this.k.set(12, k);
        this.k.set(13, i);
        this.k.set(14, m);
        this.a = 5;
        return true;
        i = 0;
        break;
        j = 0;
        k = 0;
        i = 0;
        m = 0;
      }
    }
    if (m < this.q) {
      return false;
    }
    if (c(this.e + 4) != '-') {
      return false;
    }
    if (c(this.e + 7) != '-') {
      return false;
    }
    char c1 = c(this.e);
    char c2 = c(this.e + 1);
    char c3 = c(this.e + 2);
    char c4 = c(this.e + 3);
    char c5 = c(this.e + 5);
    char c6 = c(this.e + 6);
    char c7 = c(this.e + 8);
    char c8 = c(this.e + 9);
    if (!a(c1, c2, c3, c4, c5, c6, c7, c8)) {
      return false;
    }
    a(c1, c2, c3, c4, c5, c6, c7, c8);
    int i = c(this.e + 10);
    if ((i == 84) || ((i == 32) && (!paramBoolean)))
    {
      if (m < this.r) {
        return false;
      }
    }
    else
    {
      if ((i == 34) || (i == 26))
      {
        this.k.set(11, 0);
        this.k.set(12, 0);
        this.k.set(13, 0);
        this.k.set(14, 0);
        i = this.e + 10;
        this.e = i;
        this.d = c(i);
        this.a = 5;
        return true;
      }
      return false;
    }
    if (c(this.e + 13) != ':') {
      return false;
    }
    if (c(this.e + 16) != ':') {
      return false;
    }
    c1 = c(this.e + 11);
    c2 = c(this.e + 12);
    c3 = c(this.e + 14);
    c4 = c(this.e + 15);
    c5 = c(this.e + 17);
    c6 = c(this.e + 18);
    if (!a(c1, c2, c3, c4, c5, c6)) {
      return false;
    }
    i = p[c1];
    int j = p[c2];
    int k = p[c3];
    int n = p[c4];
    int i1 = p[c5];
    int i2 = p[c6];
    this.k.set(11, i * 10 + j);
    this.k.set(12, k * 10 + n);
    this.k.set(13, i1 * 10 + i2);
    if (c(this.e + 19) == '.')
    {
      if (m < this.s) {
        return false;
      }
    }
    else
    {
      this.k.set(14, 0);
      i = this.e + 19;
      this.e = i;
      this.d = c(i);
      this.a = 5;
      return true;
    }
    j = c(this.e + 20);
    k = c(this.e + 21);
    i = c(this.e + 22);
    if ((j < 48) || (j > 57)) {
      return false;
    }
    if ((k < 48) || (k > 57)) {
      return false;
    }
    if ((i < 48) || (i > 57)) {
      return false;
    }
    j = p[j];
    k = p[k];
    i = p[i];
    this.k.set(14, j * 100 + k * 10 + i);
    i = this.e + 23;
    this.e = i;
    this.d = c(i);
    this.a = 5;
    return true;
  }
  
  public final char c(int paramInt)
  {
    if (paramInt >= this.t.length()) {
      return '\032';
    }
    return this.t.charAt(paramInt);
  }
  
  public final String i()
  {
    int k = c(this.i + this.h - 1);
    int j = this.h;
    int i;
    if ((k != 76) && (k != 83) && (k != 66) && (k != 70))
    {
      i = j;
      if (k != 68) {}
    }
    else
    {
      i = j - 1;
    }
    return this.t.substring(this.i, i + this.i);
  }
  
  public final boolean j()
  {
    return (this.e == this.t.length()) || ((this.d == '\032') && (this.e + 1 == this.t.length()));
  }
  
  public final char l()
  {
    int i = this.e + 1;
    this.e = i;
    char c = c(i);
    this.d = c;
    return c;
  }
  
  public final byte[] q()
  {
    return d.a(this.t, this.i + 1, this.h);
  }
  
  public final String s()
  {
    if (!this.j) {
      return this.t.substring(this.i + 1, this.i + 1 + this.h);
    }
    return new String(this.g, 0, this.h);
  }
  
  public final boolean z()
  {
    return b(true);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.type

 * JD-Core Version:    0.7.0.1

 */