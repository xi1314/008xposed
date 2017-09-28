package com.a.a.b;

public final class b
{
  byte[] a;
  int b;
  
  public b()
  {
    this.a = new byte[64];
  }
  
  public b(int paramInt)
  {
    this.a = new byte[paramInt];
  }
  
  private void d(int paramInt)
  {
    int i = this.a.length * 2;
    paramInt = this.b + paramInt;
    if (i > paramInt) {
      paramInt = i;
    }
    for (;;)
    {
      byte[] arrayOfByte = new byte[paramInt];
      System.arraycopy(this.a, 0, arrayOfByte, 0, this.b);
      this.a = arrayOfByte;
      return;
    }
  }
  
  public final b a(int paramInt)
  {
    int i = this.b;
    if (i + 1 > this.a.length) {
      d(1);
    }
    this.a[i] = ((byte)paramInt);
    this.b = (i + 1);
    return this;
  }
  
  final b a(int paramInt1, int paramInt2)
  {
    int i = this.b;
    if (i + 2 > this.a.length) {
      d(2);
    }
    byte[] arrayOfByte = this.a;
    int j = i + 1;
    arrayOfByte[i] = ((byte)paramInt1);
    arrayOfByte[j] = ((byte)paramInt2);
    this.b = (j + 1);
    return this;
  }
  
  public final b a(String paramString)
  {
    int k = paramString.length();
    int i = this.b;
    if (i + 2 + k > this.a.length) {
      d(k + 2);
    }
    byte[] arrayOfByte = this.a;
    int j = i + 1;
    arrayOfByte[i] = ((byte)(k >>> 8));
    i = j + 1;
    arrayOfByte[j] = ((byte)k);
    j = 0;
    while (j < k)
    {
      int m = paramString.charAt(j);
      if ((m > 0) && (m <= 127))
      {
        arrayOfByte[i] = ((byte)m);
        j += 1;
        i += 1;
      }
      else
      {
        throw new UnsupportedOperationException();
      }
    }
    this.b = i;
    return this;
  }
  
  public final b a(byte[] paramArrayOfByte, int paramInt)
  {
    if (this.b + paramInt > this.a.length) {
      d(paramInt);
    }
    if (paramArrayOfByte != null) {
      System.arraycopy(paramArrayOfByte, 0, this.a, this.b, paramInt);
    }
    this.b += paramInt;
    return this;
  }
  
  public final b b(int paramInt)
  {
    int i = this.b;
    if (i + 2 > this.a.length) {
      d(2);
    }
    byte[] arrayOfByte = this.a;
    int j = i + 1;
    arrayOfByte[i] = ((byte)(paramInt >>> 8));
    arrayOfByte[j] = ((byte)paramInt);
    this.b = (j + 1);
    return this;
  }
  
  final b b(int paramInt1, int paramInt2)
  {
    int j = this.b;
    if (j + 3 > this.a.length) {
      d(3);
    }
    byte[] arrayOfByte = this.a;
    int i = j + 1;
    arrayOfByte[j] = ((byte)paramInt1);
    paramInt1 = i + 1;
    arrayOfByte[i] = ((byte)(paramInt2 >>> 8));
    arrayOfByte[paramInt1] = ((byte)paramInt2);
    this.b = (paramInt1 + 1);
    return this;
  }
  
  public final b c(int paramInt)
  {
    int j = this.b;
    if (j + 4 > this.a.length) {
      d(4);
    }
    byte[] arrayOfByte = this.a;
    int i = j + 1;
    arrayOfByte[j] = ((byte)(paramInt >>> 24));
    j = i + 1;
    arrayOfByte[i] = ((byte)(paramInt >>> 16));
    i = j + 1;
    arrayOfByte[j] = ((byte)(paramInt >>> 8));
    arrayOfByte[i] = ((byte)paramInt);
    this.b = (i + 1);
    return this;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.Inttolong.Inttolong

 * JD-Core Version:    0.7.0.1

 */