package com.a.a.d;

import com.a.a.Map;
import com.a.a.Map.g;
import com.a.a.runtimeexception;

import java.io.IOException;
import java.io.Writer;
import java.lang.ref.SoftReference;

public final class bk
  extends Writer
{
  private static final ThreadLocal c = new ThreadLocal();
  protected char[] a;
  protected int b;
  private int d = a.d;
  private final Writer e = null;
  
  public bk()
  {
    this((byte)0);
  }
  
  private bk(byte paramByte)
  {
    SoftReference localSoftReference = (SoftReference)c.get();
    if (localSoftReference != null)
    {
      this.a = ((char[])localSoftReference.get());
      c.set(null);
    }
    if (this.a == null) {
      this.a = new char[1024];
    }
  }
  
  private bk a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    Object localObject = paramCharSequence;
    if (paramCharSequence == null) {
      localObject = "null";
    }
    paramCharSequence = ((CharSequence)localObject).subSequence(paramInt1, paramInt2).toString();
    write(paramCharSequence, 0, paramCharSequence.length());
    return this;
  }
  
  private void a(String paramString, char paramChar, boolean paramBoolean)
  {
    if (paramString == null)
    {
      write("null");
      if (paramChar != 0) {
        a(paramChar);
      }
    }
    int k;
    int i2;
    do
    {
      return;
      m = paramString.length();
      k = this.b + m + 2;
      i2 = k;
      if (paramChar != 0) {
        i2 = k + 1;
      }
      if (i2 <= this.a.length) {
        break label412;
      }
      if (this.e == null) {
        break;
      }
      a('"');
      k = 0;
      if (k < paramString.length())
      {
        int i = paramString.charAt(k);
        if (b(bl.q)) {
          if ((i == 8) || (i == 12) || (i == 10) || (i == 13) || (i == 9) || (i == 34) || (i == 47) || (i == 92))
          {
            a('\\');
            a(b.f[i]);
          }
        }
        for (;;)
        {
          k += 1;
          break;
          if (i < 32)
          {
            a('\\');
            a('u');
            a('0');
            a('0');
            a(b.g[(i * 2)]);
            a(b.g[(i * 2 + 1)]);
          }
          else
          {
            if (i >= 127)
            {
              a('\\');
              a('u');
              a(b.a[(i >>> 12 & 0xF)]);
              a(b.a[(i >>> 8 & 0xF)]);
              a(b.a[(i >>> 4 & 0xF)]);
              a(b.a[(i & 0xF)]);
              continue;
              if (((i < b.d.length) && (b.d[i] != 0)) || ((i == 47) && (b(bl.p))))
              {
                a('\\');
                a(b.f[i]);
                continue;
              }
            }
            a(i);
          }
        }
      }
      a('"');
    } while (paramChar == 0);
    a(paramChar);
    return;
    b(i2);
    label412:
    int i5 = this.b + 1;
    int i9 = i5 + m;
    this.a[this.b] = '"';
    paramString.getChars(0, m, this.a, i5);
    this.b = i2;
    int j;
    if (b(bl.q))
    {
      n = -1;
      k = i5;
      if (k < i9)
      {
        i1 = this.a[k];
        if ((i1 == 34) || (i1 == 47) || (i1 == 92))
        {
          m = i2 + 1;
          n = k;
        }
        for (;;)
        {
          k += 1;
          i2 = m;
          break;
          if ((i1 == 8) || (i1 == 12) || (i1 == 10) || (i1 == 13) || (i1 == 9))
          {
            m = i2 + 1;
            n = k;
          }
          else if (i1 < 32)
          {
            m = i2 + 5;
            n = k;
          }
          else
          {
            m = i2;
            if (i1 >= 127)
            {
              m = i2 + 5;
              n = k;
            }
          }
        }
      }
      if (i2 > this.a.length) {
        b(i2);
      }
      this.b = i2;
      m = i9;
      if (n >= i5)
      {
        j = this.a[n];
        if ((j == 8) || (j == 12) || (j == 10) || (j == 13) || (j == 9))
        {
          System.arraycopy(this.a, n + 1, this.a, n + 2, m - n - 1);
          this.a[n] = '\\';
          this.a[(n + 1)] = b.f[j];
          k = m + 1;
        }
        for (;;)
        {
          n -= 1;
          m = k;
          break;
          if ((j == 34) || (j == 47) || (j == 92))
          {
            System.arraycopy(this.a, n + 1, this.a, n + 2, m - n - 1);
            this.a[n] = '\\';
            this.a[(n + 1)] = j;
            k = m + 1;
          }
          else if (j < 32)
          {
            System.arraycopy(this.a, n + 1, this.a, n + 6, m - n - 1);
            this.a[n] = '\\';
            this.a[(n + 1)] = 'u';
            this.a[(n + 2)] = '0';
            this.a[(n + 3)] = '0';
            this.a[(n + 4)] = b.g[(j * 2)];
            this.a[(n + 5)] = b.g[(j * 2 + 1)];
            k = m + 5;
          }
          else
          {
            k = m;
            if (j >= 127)
            {
              System.arraycopy(this.a, n + 1, this.a, n + 6, m - n - 1);
              this.a[n] = '\\';
              this.a[(n + 1)] = 'u';
              this.a[(n + 2)] = b.a[(j >>> 12 & 0xF)];
              this.a[(n + 3)] = b.a[(j >>> 8 & 0xF)];
              this.a[(n + 4)] = b.a[(j >>> 4 & 0xF)];
              this.a[(n + 5)] = b.a[(j & 0xF)];
              k = m + 5;
            }
          }
        }
      }
      if (paramChar != 0)
      {
        this.a[(this.b - 2)] = '"';
        this.a[(this.b - 1)] = paramChar;
        return;
      }
      this.a[(this.b - 1)] = '"';
      return;
    }
    int i8 = 0;
    int n = 0;
    int i1 = -1;
    int m = -1;
    int i6 = 0;
    int i3 = 0;
    int i4 = m;
    int i7 = i1;
    if (paramBoolean)
    {
      k = i5;
      i6 = i3;
      i4 = m;
      i7 = i1;
      i8 = n;
      if (k < i9)
      {
        i4 = this.a[k];
        if ((i4 >= 93) || (i4 == 32) || ((i4 >= 48) && (i4 != 92)) || (((i4 >= b.d.length) || (b.d[i4] == 0)) && ((i4 != 47) || (!b(bl.p))))) {
          break label1612;
        }
        i1 = n + 1;
        if (m != -1) {
          break label1601;
        }
        n = k;
        i3 = i4;
        m = k;
      }
    }
    for (;;)
    {
      k += 1;
      i4 = i1;
      i1 = n;
      n = i4;
      break;
      k = i2 + i8;
      if (k > this.a.length) {
        b(k);
      }
      this.b = k;
      if (i8 == 1)
      {
        System.arraycopy(this.a, i7 + 1, this.a, i7 + 2, i9 - i7 - 1);
        this.a[i7] = '\\';
        this.a[(i7 + 1)] = b.f[i6];
      }
      while (paramChar != 0)
      {
        this.a[(this.b - 2)] = '"';
        this.a[(this.b - 1)] = paramChar;
        return;
        if (i8 > 1)
        {
          m = i4 - i5;
          k = i4;
          label1466:
          if (m < paramString.length())
          {
            j = paramString.charAt(m);
            if (((j >= b.d.length) || (b.d[j] == 0)) && ((j != 47) || (!b(bl.p)))) {
              break label1569;
            }
            char[] arrayOfChar = this.a;
            n = k + 1;
            arrayOfChar[k] = '\\';
            arrayOfChar = this.a;
            k = n + 1;
            arrayOfChar[n] = b.f[j];
          }
          for (;;)
          {
            m += 1;
            break label1466;
            break;
            label1569:
            this.a[k] = j;
            k += 1;
          }
        }
      }
      this.a[(this.b - 1)] = '"';
      return;
      label1601:
      i3 = i4;
      n = k;
      continue;
      label1612:
      i4 = n;
      n = i1;
      i1 = i4;
    }
  }
  
  private void b(char paramChar, String paramString, int paramInt)
  {
    a(paramChar);
    a(paramString, false);
    a(paramInt);
  }
  
  private void b(int paramInt)
  {
    int i = this.a.length * 3 / 2 + 1;
    if (i < paramInt) {}
    for (;;)
    {
      char[] arrayOfChar = new char[paramInt];
      System.arraycopy(this.a, 0, arrayOfChar, 0, this.b);
      this.a = arrayOfChar;
      return;
      paramInt = i;
    }
  }
  
  private void c(String paramString)
  {
    int m = 0;
    int i = 0;
    if (paramString == null)
    {
      i = this.b + 4;
      if (i > this.a.length) {
        b(i);
      }
      "null".getChars(0, 4, this.a, this.b);
      this.b = i;
      return;
    }
    int j = paramString.length();
    int i3 = this.b + j + 2;
    if (i3 > this.a.length)
    {
      if (this.e != null)
      {
        a('\'');
        if (i < paramString.length())
        {
          char c1 = paramString.charAt(i);
          if ((c1 <= '\r') || (c1 == '\\') || (c1 == '\'') || ((c1 == '/') && (b(bl.p))))
          {
            a('\\');
            a(b.f[c1]);
          }
          for (;;)
          {
            i += 1;
            break;
            a(c1);
          }
        }
        a('\'');
        return;
      }
      b(i3);
    }
    int i1 = this.b + 1;
    int i2 = i1 + j;
    this.a[this.b] = '\'';
    paramString.getChars(0, j, this.a, i1);
    this.b = i3;
    int k = -1;
    i = i1;
    j = 0;
    int n;
    if (i < i2)
    {
      n = this.a[i];
      if ((n > 13) && (n != 92) && (n != 39) && ((n != 47) || (!b(bl.p)))) {
        break label607;
      }
      k = j + 1;
      m = n;
      j = i;
    }
    for (;;)
    {
      i += 1;
      n = k;
      k = j;
      j = n;
      break;
      i = i3 + j;
      if (i > this.a.length) {
        b(i);
      }
      this.b = i;
      if (j == 1)
      {
        System.arraycopy(this.a, k + 1, this.a, k + 2, i2 - k - 1);
        this.a[k] = '\\';
        this.a[(k + 1)] = b.f[m];
      }
      for (;;)
      {
        this.a[(this.b - 1)] = '\'';
        return;
        if (j > 1)
        {
          System.arraycopy(this.a, k + 1, this.a, k + 2, i2 - k - 1);
          this.a[k] = '\\';
          paramString = this.a;
          i = k + 1;
          paramString[i] = b.f[m];
          j = i2 + 1;
          i -= 2;
          while (i >= i1)
          {
            m = this.a[i];
            if ((m > 13) && (m != 92) && (m != 39))
            {
              k = j;
              if (m == 47)
              {
                k = j;
                if (!b(bl.p)) {}
              }
            }
            else
            {
              System.arraycopy(this.a, i + 1, this.a, i + 2, j - i - 1);
              this.a[i] = '\\';
              this.a[(i + 1)] = b.f[m];
              k = j + 1;
            }
            i -= 1;
            j = k;
          }
        }
      }
      label607:
      n = j;
      j = k;
      k = n;
    }
  }
  
  public final bk a(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {}
    for (paramCharSequence = "null";; paramCharSequence = paramCharSequence.toString())
    {
      write(paramCharSequence, 0, paramCharSequence.length());
      return this;
    }
  }
  
  public final void a()
  {
    write("null");
  }
  
  public final void a(char paramChar)
  {
    int j = this.b + 1;
    int i = j;
    if (j > this.a.length)
    {
      if (this.e != null) {
        break label48;
      }
      b(j);
    }
    for (i = j;; i = 1)
    {
      this.a[this.b] = paramChar;
      this.b = i;
      return;
      label48:
      flush();
    }
  }
  
  public final void a(char paramChar, String paramString, double paramDouble)
  {
    a(paramChar);
    a(paramString, false);
    if (paramDouble == 0.0D)
    {
      a('0');
      return;
    }
    if (Double.isNaN(paramDouble))
    {
      write("null");
      return;
    }
    if (Double.isInfinite(paramDouble))
    {
      write("null");
      return;
    }
    String str = Double.toString(paramDouble);
    paramString = str;
    if (str.endsWith(".0")) {
      paramString = str.substring(0, str.length() - 2);
    }
    write(paramString);
  }
  
  public final void a(char paramChar, String paramString, int paramInt)
  {
    if ((paramInt == -2147483648) || (!b(bl.a)))
    {
      b(paramChar, paramString, paramInt);
      return;
    }
    int i;
    if (b(bl.b))
    {
      i = 39;
      if (paramInt >= 0) {
        break label103;
      }
    }
    int k;
    label103:
    for (int j = g.a(-paramInt) + 1;; j = g.a(paramInt))
    {
      k = paramString.length();
      m = j + (this.b + k + 4);
      if (m <= this.a.length) {
        break label118;
      }
      if (this.e == null) {
        break label112;
      }
      b(paramChar, paramString, paramInt);
      return;
      i = 34;
      break;
    }
    label112:
    b(m);
    label118:
    j = this.b;
    this.b = m;
    this.a[j] = paramChar;
    int m = j + k + 1;
    this.a[(j + 1)] = i;
    paramString.getChars(0, k, this.a, j + 2);
    this.a[(m + 1)] = i;
    this.a[(m + 2)] = ':';
    g.a(paramInt, this.b, this.a);
  }
  
  public final void a(char paramChar, String paramString1, String paramString2)
  {
    int j;
    int k;
    int i;
    int i2;
    int m;
    int i3;
    int i5;
    int n;
    int i4;
    int i1;
    if (b(bl.a))
    {
      if (b(bl.b))
      {
        a(paramChar);
        a(paramString1, false);
        if (paramString2 == null)
        {
          write("null");
          return;
        }
        a(paramString2);
        return;
      }
      if (b(bl.q))
      {
        a(paramChar);
        a(paramString1, ':', true);
        a(paramString2, '\000', true);
        return;
      }
      j = paramString1.length();
      k = this.b;
      if (paramString2 == null)
      {
        i = 4;
        i2 = k + (j + 8);
      }
      while (i2 > this.a.length) {
        if (this.e != null)
        {
          a(paramChar);
          a(paramString1, ':', true);
          a(paramString2, '\000', true);
          return;
          i = paramString2.length();
          i2 = k + (j + i + 6);
        }
        else
        {
          b(i2);
        }
      }
      this.a[this.b] = paramChar;
      k = this.b + 2;
      m = k + j;
      this.a[(this.b + 1)] = '"';
      paramString1.getChars(0, j, this.a, k);
      this.b = i2;
      this.a[m] = '"';
      k = m + 1;
      paramString1 = this.a;
      j = k + 1;
      paramString1[k] = 58;
      if (paramString2 == null)
      {
        paramString1 = this.a;
        i = j + 1;
        paramString1[j] = 110;
        paramString1 = this.a;
        j = i + 1;
        paramString1[i] = 117;
        this.a[j] = 'l';
        this.a[(j + 1)] = 'l';
        return;
      }
      paramString1 = this.a;
      i3 = j + 1;
      paramString1[j] = 34;
      i5 = i3 + i;
      paramString2.getChars(0, i, this.a, i3);
      if (!b(bl.t))
      {
        k = 0;
        m = -1;
        j = -1;
        n = 0;
        i = i3;
        if (i < i5)
        {
          i4 = this.a[i];
          if (i4 >= 93) {
            break label814;
          }
          i1 = this.d;
          if (i4 != 32) {
            if ((i4 == 47) && (bl.a(i1, bl.p)))
            {
              i1 = 1;
              label442:
              if (i1 == 0) {
                break label814;
              }
              m = k + 1;
              if (j != -1) {
                break label803;
              }
              k = i;
              j = i;
              n = i4;
            }
          }
        }
      }
    }
    for (;;)
    {
      i += 1;
      i1 = m;
      m = k;
      k = i1;
      break;
      if (((i4 <= 35) || (i4 == 92)) && ((i4 <= 13) || (i4 == 92) || (i4 == 34)))
      {
        i1 = 1;
        break label442;
      }
      i1 = 0;
      break label442;
      if (k > 0)
      {
        i = i2 + k;
        if (i > this.a.length) {
          b(i);
        }
        this.b = i;
        if (k != 1) {
          break label643;
        }
        System.arraycopy(this.a, m + 1, this.a, m + 2, i5 - m - 1);
        this.a[m] = '\\';
        this.a[(m + 1)] = b.f[n];
      }
      label643:
      while (k <= 1)
      {
        this.a[(this.b - 1)] = '"';
        return;
      }
      k = j - i3;
      i = j;
      j = k;
      label664:
      if (j < paramString2.length())
      {
        paramChar = paramString2.charAt(j);
        if (((paramChar >= b.d.length) || (b.d[paramChar] == 0)) && ((paramChar != '/') || (!b(bl.p)))) {
          break label758;
        }
        paramString1 = this.a;
        k = i + 1;
        paramString1[i] = 92;
        paramString1 = this.a;
        i = k + 1;
        paramString1[k] = b.f[paramChar];
      }
      for (;;)
      {
        j += 1;
        break label664;
        break;
        label758:
        this.a[i] = paramChar;
        i += 1;
      }
      a(paramChar);
      a(paramString1, false);
      if (paramString2 == null)
      {
        write("null");
        return;
      }
      a(paramString2);
      return;
      label803:
      k = i;
      n = i4;
      continue;
      label814:
      i1 = k;
      k = m;
      m = i1;
    }
  }
  
  public final void a(int paramInt)
  {
    if (paramInt == -2147483648)
    {
      write("-2147483648");
      return;
    }
    if (paramInt < 0) {}
    for (int i = g.a(-paramInt) + 1;; i = g.a(paramInt))
    {
      int j = this.b + i;
      if (j > this.a.length)
      {
        if (this.e != null) {
          break;
        }
        b(j);
      }
      g.a(paramInt, j, this.a);
      this.b = j;
      return;
    }
    char[] arrayOfChar = new char[i];
    g.a(paramInt, i, arrayOfChar);
    write(arrayOfChar, 0, arrayOfChar.length);
  }
  
  public final void a(int paramInt, char paramChar)
  {
    if (paramInt == -2147483648)
    {
      write("-2147483648");
      a(paramChar);
      return;
    }
    if (paramInt < 0) {}
    int j;
    for (int i = g.a(-paramInt) + 1;; i = g.a(paramInt))
    {
      i += this.b;
      j = i + 1;
      if (j <= this.a.length) {
        break label84;
      }
      if (this.e == null) {
        break;
      }
      a(paramInt);
      a(paramChar);
      return;
    }
    b(j);
    label84:
    g.a(paramInt, i, this.a);
    this.a[i] = paramChar;
    this.b = j;
  }
  
  public final void a(long paramLong)
  {
    if (paramLong == -9223372036854775808L)
    {
      write("-9223372036854775808");
      return;
    }
    if (paramLong < 0L) {}
    for (int i = g.a(-paramLong) + 1;; i = g.a(paramLong))
    {
      int j = this.b + i;
      if (j > this.a.length)
      {
        if (this.e != null) {
          break;
        }
        b(j);
      }
      g.a(paramLong, j, this.a);
      this.b = j;
      return;
    }
    char[] arrayOfChar = new char[i];
    g.a(paramLong, i, arrayOfChar);
    write(arrayOfChar, 0, arrayOfChar.length);
  }
  
  public final void a(long paramLong, char paramChar)
    throws IOException
  {
    if (paramLong == -9223372036854775808L)
    {
      write("-9223372036854775808");
      a(paramChar);
      return;
    }
    if (paramLong < 0L) {}
    int j;
    for (int i = g.a(-paramLong) + 1;; i = g.a(paramLong))
    {
      i += this.b;
      j = i + 1;
      if (j <= this.a.length) {
        break label93;
      }
      if (this.e == null) {
        break;
      }
      a(paramLong);
      a(paramChar);
      return;
    }
    b(j);
    label93:
    g.a(paramLong, i, this.a);
    this.a[i] = paramChar;
    this.b = j;
  }
  
  public final void a(bl parambl)
  {
    this.d |= parambl.a();
  }
  
  public final void a(String paramString)
  {
    if (b(bl.b))
    {
      c(paramString);
      return;
    }
    a(paramString, '\000', true);
  }
  
  public final void a(String paramString, long paramLong)
  {
    if ((paramLong == -9223372036854775808L) || (!b(bl.a)))
    {
      a(',');
      a(paramString, false);
      a(paramLong);
      return;
    }
    int i;
    if (b(bl.b))
    {
      i = 39;
      if (paramLong >= 0L) {
        break label127;
      }
    }
    int k;
    label127:
    for (int j = g.a(-paramLong) + 1;; j = g.a(paramLong))
    {
      k = paramString.length();
      m = j + (this.b + k + 4);
      if (m <= this.a.length) {
        break label142;
      }
      if (this.e == null) {
        break label136;
      }
      a(',');
      a(paramString, false);
      a(paramLong);
      return;
      i = 34;
      break;
    }
    label136:
    b(m);
    label142:
    j = this.b;
    this.b = m;
    this.a[j] = ',';
    int m = j + k + 1;
    this.a[(j + 1)] = i;
    paramString.getChars(0, k, this.a, j + 2);
    this.a[(m + 1)] = i;
    this.a[(m + 2)] = ':';
    g.a(paramLong, this.b, this.a);
  }
  
  public final void a(String paramString, boolean paramBoolean)
  {
    if (paramString == null)
    {
      write("null:");
      return;
    }
    boolean[] arrayOfBoolean;
    int n;
    int i5;
    int m;
    if (b(bl.b))
    {
      if (b(bl.a))
      {
        c(paramString);
        a(':');
        return;
      }
      arrayOfBoolean = b.e;
      n = paramString.length();
      i5 = this.b + n + 1;
      if (i5 > this.a.length) {
        if (this.e != null)
        {
          if (n == 0)
          {
            a('\'');
            a('\'');
            a(':');
            return;
          }
          k = 0;
          if (k >= n) {
            break label1442;
          }
          m = paramString.charAt(k);
          if ((m >= arrayOfBoolean.length) || (arrayOfBoolean[m] == 0)) {}
        }
      }
    }
    label157:
    label1442:
    for (int k = 1;; k = 0)
    {
      if (k != 0) {
        a('\'');
      }
      m = 0;
      if (m < n)
      {
        int i = paramString.charAt(m);
        if ((i < arrayOfBoolean.length) && (arrayOfBoolean[i] != 0))
        {
          a('\\');
          a(b.f[i]);
        }
        for (;;)
        {
          m += 1;
          break label157;
          k += 1;
          break;
          a(i);
        }
      }
      if (k != 0) {
        a('\'');
      }
      a(':');
      return;
      b(i5);
      if (n == 0)
      {
        if (this.b + 3 > this.a.length) {
          b(this.b + 3);
        }
        paramString = this.a;
        k = this.b;
        this.b = (k + 1);
        paramString[k] = 39;
        paramString = this.a;
        k = this.b;
        this.b = (k + 1);
        paramString[k] = 39;
        paramString = this.a;
        k = this.b;
        this.b = (k + 1);
        paramString[k] = 58;
        return;
      }
      int i6 = this.b;
      int i2 = i6 + n;
      paramString.getChars(0, n, this.a, i6);
      this.b = i5;
      int i3 = 0;
      k = i6;
      int i7;
      int i4;
      int i1;
      if (k < i2)
      {
        i7 = this.a[k];
        i4 = i3;
        m = i2;
        n = i5;
        i1 = k;
        if (i7 < arrayOfBoolean.length)
        {
          i4 = i3;
          m = i2;
          n = i5;
          i1 = k;
          if (arrayOfBoolean[i7] != 0)
          {
            if (i3 != 0) {
              break label622;
            }
            n = i5 + 3;
            if (n > this.a.length) {
              b(n);
            }
            this.b = n;
            System.arraycopy(this.a, k + 1, this.a, k + 3, i2 - k - 1);
            System.arraycopy(this.a, 0, this.a, 1, k);
            this.a[i6] = '\'';
            paramString = this.a;
            k += 1;
            paramString[k] = 92;
            paramString = this.a;
            i1 = k + 1;
            paramString[i1] = b.f[i7];
            m = i2 + 2;
            this.a[(this.b - 2)] = '\'';
          }
        }
        for (i4 = 1;; i4 = i3)
        {
          k = i1 + 1;
          i3 = i4;
          i2 = m;
          i5 = n;
          break;
          label622:
          n = i5 + 1;
          if (n > this.a.length) {
            b(n);
          }
          this.b = n;
          System.arraycopy(this.a, k + 1, this.a, k + 2, i2 - k);
          this.a[k] = '\\';
          paramString = this.a;
          i1 = k + 1;
          paramString[i1] = b.f[i7];
          m = i2 + 1;
        }
      }
      this.a[(i5 - 1)] = ':';
      return;
      if (b(bl.a))
      {
        a(paramString, ':', paramBoolean);
        return;
      }
      arrayOfBoolean = b.d;
      n = paramString.length();
      i5 = this.b + n + 1;
      if (i5 > this.a.length) {
        if (this.e != null)
        {
          if (n == 0)
          {
            a('"');
            a('"');
            a(':');
            return;
          }
          k = 0;
          if (k >= n) {
            break label1436;
          }
          m = paramString.charAt(k);
          if ((m >= arrayOfBoolean.length) || (arrayOfBoolean[m] == 0)) {}
        }
      }
      for (k = 1;; k = 0)
      {
        if (k != 0) {
          a('"');
        }
        m = 0;
        label862:
        if (m < n)
        {
          int j = paramString.charAt(m);
          if ((j < arrayOfBoolean.length) && (arrayOfBoolean[j] != 0))
          {
            a('\\');
            a(b.f[j]);
          }
          for (;;)
          {
            m += 1;
            break label862;
            k += 1;
            break;
            a(j);
          }
        }
        if (k != 0) {
          a('"');
        }
        a(':');
        return;
        b(i5);
        if (n == 0)
        {
          if (this.b + 3 > this.a.length) {
            b(this.b + 3);
          }
          paramString = this.a;
          k = this.b;
          this.b = (k + 1);
          paramString[k] = 34;
          paramString = this.a;
          k = this.b;
          this.b = (k + 1);
          paramString[k] = 34;
          paramString = this.a;
          k = this.b;
          this.b = (k + 1);
          paramString[k] = 58;
          return;
        }
        i6 = this.b;
        i2 = i6 + n;
        paramString.getChars(0, n, this.a, i6);
        this.b = i5;
        i3 = 0;
        k = i6;
        if (k < i2)
        {
          i7 = this.a[k];
          i4 = i3;
          m = i2;
          n = i5;
          i1 = k;
          if (i7 < arrayOfBoolean.length)
          {
            i4 = i3;
            m = i2;
            n = i5;
            i1 = k;
            if (arrayOfBoolean[i7] != 0)
            {
              if (i3 != 0) {
                break label1327;
              }
              n = i5 + 3;
              if (n > this.a.length) {
                b(n);
              }
              this.b = n;
              System.arraycopy(this.a, k + 1, this.a, k + 3, i2 - k - 1);
              System.arraycopy(this.a, 0, this.a, 1, k);
              this.a[i6] = '"';
              paramString = this.a;
              k += 1;
              paramString[k] = 92;
              paramString = this.a;
              i1 = k + 1;
              paramString[i1] = b.f[i7];
              m = i2 + 2;
              this.a[(this.b - 2)] = '"';
            }
          }
          for (i4 = 1;; i4 = i3)
          {
            k = i1 + 1;
            i3 = i4;
            i2 = m;
            i5 = n;
            break;
            label1327:
            n = i5 + 1;
            if (n > this.a.length) {
              b(n);
            }
            this.b = n;
            System.arraycopy(this.a, k + 1, this.a, k + 2, i2 - k);
            this.a[k] = '\\';
            paramString = this.a;
            i1 = k + 1;
            paramString[i1] = b.f[i7];
            m = i2 + 1;
          }
        }
        this.a[(this.b - 1)] = ':';
        return;
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      write("true");
      return;
    }
    write("false");
  }
  
  public final void a(byte[] paramArrayOfByte)
  {
    int k = 0;
    int j = 0;
    int m = paramArrayOfByte.length;
    if (m == 0)
    {
      write("\"\"");
      return;
    }
    char[] arrayOfChar1 = Map.d.a;
    int n = m / 3 * 3;
    int i1 = (m - 1) / 3;
    int i = this.b;
    i1 = (i1 + 1 << 2) + this.b + 2;
    int i2;
    if (i1 > this.a.length)
    {
      if (this.e != null)
      {
        a('"');
        i = 0;
        while (i < n)
        {
          i2 = i + 1;
          k = paramArrayOfByte[i];
          i1 = i2 + 1;
          i2 = paramArrayOfByte[i2];
          i = i1 + 1;
          k = (i2 & 0xFF) << 8 | (k & 0xFF) << 16 | paramArrayOfByte[i1] & 0xFF;
          a(arrayOfChar1[(k >>> 18 & 0x3F)]);
          a(arrayOfChar1[(k >>> 12 & 0x3F)]);
          a(arrayOfChar1[(k >>> 6 & 0x3F)]);
          a(arrayOfChar1[(k & 0x3F)]);
        }
        k = m - n;
        if (k > 0)
        {
          n = paramArrayOfByte[n];
          i = j;
          if (k == 2) {
            i = (paramArrayOfByte[(m - 1)] & 0xFF) << 2;
          }
          i |= (n & 0xFF) << 10;
          a(arrayOfChar1[(i >> 12)]);
          a(arrayOfChar1[(i >>> 6 & 0x3F)]);
          if (k != 2) {
            break label320;
          }
        }
        label320:
        for (c1 = arrayOfChar1[(i & 0x3F)];; c1 = '=')
        {
          a(c1);
          a('=');
          a('"');
          return;
        }
      }
      b(i1);
    }
    this.b = i1;
    this.a[i] = '"';
    i += 1;
    j = 0;
    while (j < n)
    {
      int i4 = j + 1;
      i2 = paramArrayOfByte[j];
      int i3 = i4 + 1;
      i4 = paramArrayOfByte[i4];
      j = i3 + 1;
      i2 = (i4 & 0xFF) << 8 | (i2 & 0xFF) << 16 | paramArrayOfByte[i3] & 0xFF;
      char[] arrayOfChar2 = this.a;
      i3 = i + 1;
      arrayOfChar2[i] = arrayOfChar1[(i2 >>> 18 & 0x3F)];
      arrayOfChar2 = this.a;
      i = i3 + 1;
      arrayOfChar2[i3] = arrayOfChar1[(i2 >>> 12 & 0x3F)];
      arrayOfChar2 = this.a;
      i3 = i + 1;
      arrayOfChar2[i] = arrayOfChar1[(i2 >>> 6 & 0x3F)];
      arrayOfChar2 = this.a;
      i = i3 + 1;
      arrayOfChar2[i3] = arrayOfChar1[(i2 & 0x3F)];
    }
    j = m - n;
    if (j > 0)
    {
      n = paramArrayOfByte[n];
      i = k;
      if (j == 2) {
        i = (paramArrayOfByte[(m - 1)] & 0xFF) << 2;
      }
      i |= (n & 0xFF) << 10;
      this.a[(i1 - 5)] = arrayOfChar1[(i >> 12)];
      this.a[(i1 - 4)] = arrayOfChar1[(i >>> 6 & 0x3F)];
      paramArrayOfByte = this.a;
      if (j != 2) {
        break label662;
      }
    }
    label662:
    for (char c1 = arrayOfChar1[(i & 0x3F)];; c1 = '=')
    {
      paramArrayOfByte[(i1 - 3)] = c1;
      this.a[(i1 - 2)] = '=';
      this.a[(i1 - 1)] = '"';
      return;
    }
  }
  
  public final bk b(char paramChar)
  {
    a(paramChar);
    return this;
  }
  
  public final void b(String paramString)
  {
    a(paramString, false);
  }
  
  public final boolean b(bl parambl)
  {
    return bl.a(this.d, parambl);
  }
  
  public final void close()
  {
    if ((this.e != null) && (this.b > 0)) {
      flush();
    }
    if (this.a.length <= 8192) {
      c.set(new SoftReference(this.a));
    }
    this.a = null;
  }
  
  public final void flush()
  {
    if (this.e == null) {
      return;
    }
    try
    {
      this.e.write(this.a, 0, this.b);
      this.e.flush();
      this.b = 0;
      return;
    }
    catch (IOException localIOException)
    {
      throw new runtimeexception(localIOException.getMessage(), localIOException);
    }
  }
  
  public final String toString()
  {
    return new String(this.a, 0, this.b);
  }
  
  public final void write(int paramInt)
  {
    int j = this.b + 1;
    int i = j;
    if (j > this.a.length)
    {
      if (this.e != null) {
        break label49;
      }
      b(j);
    }
    for (i = j;; i = 1)
    {
      this.a[this.b] = ((char)paramInt);
      this.b = i;
      return;
      label49:
      flush();
    }
  }
  
  public final void write(String paramString)
  {
    while (paramString == null) {
      paramString = "null";
    }
    write(paramString, 0, paramString.length());
  }
  
  public final void write(String paramString, int paramInt1, int paramInt2)
  {
    int k = this.b + paramInt2;
    int i;
    int j;
    if (k > this.a.length)
    {
      i = paramInt1;
      j = paramInt2;
      if (this.e == null)
      {
        b(k);
        i = k;
        j = paramInt1;
      }
    }
    for (;;)
    {
      paramString.getChars(j, paramInt2 + j, this.a, this.b);
      this.b = i;
      return;
      do
      {
        paramInt2 = this.a.length - this.b;
        paramString.getChars(i, i + paramInt2, this.a, this.b);
        this.b = this.a.length;
        flush();
        paramInt1 = j - paramInt2;
        k = i + paramInt2;
        i = k;
        j = paramInt1;
      } while (paramInt1 > this.a.length);
      paramInt2 = paramInt1;
      j = k;
      i = paramInt1;
      continue;
      i = k;
      j = paramInt1;
    }
  }
  
  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 > paramArrayOfChar.length) || (paramInt2 < 0) || (paramInt1 + paramInt2 > paramArrayOfChar.length) || (paramInt1 + paramInt2 < 0)) {
      throw new IndexOutOfBoundsException();
    }
    if (paramInt2 == 0) {
      return;
    }
    int k = this.b + paramInt2;
    int i;
    int j;
    if (k > this.a.length)
    {
      i = paramInt1;
      j = paramInt2;
      if (this.e == null)
      {
        b(k);
        i = k;
        j = paramInt1;
      }
    }
    for (;;)
    {
      System.arraycopy(paramArrayOfChar, j, this.a, this.b, paramInt2);
      this.b = i;
      return;
      do
      {
        paramInt2 = this.a.length - this.b;
        System.arraycopy(paramArrayOfChar, i, this.a, this.b, paramInt2);
        this.b = this.a.length;
        flush();
        paramInt1 = j - paramInt2;
        k = i + paramInt2;
        i = k;
        j = paramInt1;
      } while (paramInt1 > this.a.length);
      paramInt2 = paramInt1;
      j = k;
      i = paramInt1;
      continue;
      i = k;
      j = paramInt1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.bk

 * JD-Core Version:    0.7.0.1

 */