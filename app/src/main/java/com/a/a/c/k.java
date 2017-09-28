package com.a.a.c;

public class k
{
  private final a[] a = new a[''];
  private final String[] b = new String[''];
  private final char[][] c = new char[''][];
  private final int d = 127;
  private int e = 0;
  
  public k()
  {
    this((byte)0);
  }
  
  private k(byte paramByte) {}
  
  public final String a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    int m = paramInt3 & this.d;
    Object localObject = this.b[m];
    char[] arrayOfChar;
    int i;
    if (localObject != null) {
      if (((String)localObject).length() == paramInt2)
      {
        arrayOfChar = this.c[m];
        i = 0;
        for (;;)
        {
          if (i >= paramInt2) {
            break label320;
          }
          if (paramString.charAt(paramInt1 + i) != arrayOfChar[i])
          {
            i = 0;
            if (i == 0) {
              break;
            }
            return localObject;
          }
          i += 1;
        }
      }
    }
    for (;;)
    {
      localObject = this.a[m];
      int j = 0;
      label98:
      if (localObject != null)
      {
        arrayOfChar = ((a)localObject).c;
        k = j;
        if (paramInt2 == arrayOfChar.length)
        {
          k = j;
          if (paramInt3 == ((a)localObject).b)
          {
            k = 0;
            if (k >= paramInt2) {
              break label314;
            }
            if (paramString.charAt(paramInt1 + k) == arrayOfChar[k]) {
              break label194;
            }
          }
        }
      }
      label138:
      label314:
      for (int k = 0;; k = 1)
      {
        if (k == 0)
        {
          k = j + 1;
          localObject = ((a)localObject).e;
          j = k;
          break label98;
          i = 0;
          break;
          label194:
          k += 1;
          break label138;
        }
        return ((a)localObject).a;
        if (j >= 8) {
          return paramString.substring(paramInt1, paramInt1 + paramInt2);
        }
        if (this.e >= 1024) {
          return paramString.substring(paramInt1, paramInt1 + paramInt2);
        }
        paramString = new a(paramString, paramInt1, paramInt2, paramInt3, this.a[m]);
        this.a[m] = paramString;
        if (i != 0)
        {
          this.b[m] = paramString.a;
          this.c[m] = paramString.c;
        }
        this.e += 1;
        return paramString.a;
      }
      label320:
      i = 1;
      break;
      i = 1;
    }
  }
  
  public final String a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int m = paramInt2 & this.d;
    Object localObject = this.b[m];
    char[] arrayOfChar;
    int j;
    if (localObject != null) {
      if (((String)localObject).length() == paramInt1)
      {
        arrayOfChar = this.c[m];
        i = 0;
        for (;;)
        {
          if (i >= paramInt1) {
            break label317;
          }
          if (paramArrayOfChar[(i + 0)] != arrayOfChar[i])
          {
            j = 0;
            i = j;
            if (j == 0) {
              break;
            }
            return localObject;
          }
          i += 1;
        }
      }
    }
    for (int i = 0;; i = 1)
    {
      localObject = this.a[m];
      j = 0;
      if (localObject != null)
      {
        arrayOfChar = ((a)localObject).c;
        k = j;
        if (paramInt1 == arrayOfChar.length)
        {
          k = j;
          if (paramInt2 == ((a)localObject).b)
          {
            k = 0;
            label141:
            if (k >= paramInt1) {
              break label311;
            }
            if (paramArrayOfChar[(k + 0)] == arrayOfChar[k]) {
              break label189;
            }
          }
        }
      }
      label311:
      for (int k = 0;; k = 1)
      {
        if (k == 0)
        {
          k = j + 1;
          localObject = ((a)localObject).e;
          j = k;
          break;
          label189:
          k += 1;
          break label141;
        }
        return ((a)localObject).a;
        if (j >= 8) {
          return new String(paramArrayOfChar, 0, paramInt1);
        }
        if (this.e >= 1024) {
          return new String(paramArrayOfChar, 0, paramInt1);
        }
        paramArrayOfChar = new a(paramArrayOfChar, paramInt1, paramInt2, this.a[m]);
        this.a[m] = paramArrayOfChar;
        if (i != 0)
        {
          this.b[m] = paramArrayOfChar.a;
          this.c[m] = paramArrayOfChar.c;
        }
        this.e += 1;
        return paramArrayOfChar.a;
      }
      label317:
      j = 1;
      break;
    }
  }
  
  protected static final class a
  {
    public final String a;
    public final int b;
    public final char[] c;
    public final byte[] d;
    public a e;
    
    public a(String paramString, int paramInt1, int paramInt2, int paramInt3, a parama)
    {
      this.a = paramString.substring(paramInt1, paramInt1 + paramInt2).intern();
      this.c = this.a.toCharArray();
      this.e = parama;
      this.b = paramInt3;
      this.d = null;
    }
    
    public a(char[] paramArrayOfChar, int paramInt1, int paramInt2, a parama)
    {
      this.c = new char[paramInt1];
      System.arraycopy(paramArrayOfChar, 0, this.c, 0, paramInt1);
      this.a = new String(this.c).intern();
      this.e = parama;
      this.b = paramInt2;
      this.d = null;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.k

 * JD-Core Version:    0.7.0.1

 */