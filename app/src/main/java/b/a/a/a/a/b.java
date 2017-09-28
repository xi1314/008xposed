package b.a.a.a.a;

public abstract class b
{
  private final int a = 3;
  protected final byte b = 61;
  protected final int c = 0;
  protected byte[] d;
  protected int e;
  protected boolean f;
  protected int g;
  protected int h;
  private final int i = 4;
  private final int j;
  private int k;
  
  protected b(int paramInt)
  {
    this.j = paramInt;
  }
  
  protected final void a(int paramInt)
  {
    if ((this.d == null) || (this.d.length < this.e + paramInt))
    {
      if (this.d == null)
      {
        this.d = new byte[8192];
        this.e = 0;
        this.k = 0;
      }
    }
    else {
      return;
    }
    byte[] arrayOfByte = new byte[this.d.length * 2];
    System.arraycopy(this.d, 0, arrayOfByte, 0, this.d.length);
    this.d = arrayOfByte;
  }
  
  abstract void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  protected abstract boolean a(byte paramByte);
  
  public final byte[] b(byte[] paramArrayOfByte)
  {
    this.d = null;
    this.e = 0;
    this.k = 0;
    this.g = 0;
    this.h = 0;
    this.f = false;
    byte[] arrayOfByte = paramArrayOfByte;
    if (paramArrayOfByte != null)
    {
      if (paramArrayOfByte.length == 0) {
        arrayOfByte = paramArrayOfByte;
      }
    }
    else {
      return arrayOfByte;
    }
    a(paramArrayOfByte, 0, paramArrayOfByte.length);
    a(paramArrayOfByte, 0, -1);
    paramArrayOfByte = new byte[this.e];
    int n = paramArrayOfByte.length;
    if (this.d != null)
    {
      if (this.d != null) {}
      for (int m = this.e - this.k;; m = 0)
      {
        m = Math.min(m, n);
        System.arraycopy(this.d, this.k, paramArrayOfByte, 0, m);
        this.k = (m + this.k);
        arrayOfByte = paramArrayOfByte;
        if (this.k < this.e) {
          break;
        }
        this.d = null;
        return paramArrayOfByte;
      }
    }
    boolean bool = this.f;
    return paramArrayOfByte;
  }
  
  protected final boolean c(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (;;)
    {
      return false;
      int n = paramArrayOfByte.length;
      int m = 0;
      while (m < n)
      {
        byte b1 = paramArrayOfByte[m];
        if ((61 == b1) || (a(b1))) {
          return true;
        }
        m += 1;
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     Inttolong.XhookMethod.XhookMethod.XhookMethod.XhookMethod.Inttolong

 * JD-Core Version:    0.7.0.1

 */