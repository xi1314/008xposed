package b.a.a.a.a;

public final class a
  extends b
{
  static final byte[] a = { 13, 10 };
  private static final byte[] i = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
  private static final byte[] j = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
  private static final byte[] k = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51 };
  private final byte[] l;
  private final byte[] m;
  private final byte[] n;
  private final int o;
  private final int p;
  private int q;
  
  public a()
  {
    this((byte)0);
  }
  
  private a(byte paramByte)
  {
    this(a);
  }
  
  private a(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, (byte)0);
  }
  
  private a(byte[] paramArrayOfByte, byte paramByte) {}
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    return new a().b(paramArrayOfByte);
  }
  
  final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.f) {
      return;
    }
    if (paramInt2 < 0) {
      this.f = true;
    }
    int i1 = 0;
    for (;;)
    {
      int i2;
      if (i1 < paramInt2)
      {
        a(this.o);
        i2 = paramArrayOfByte[paramInt1];
        if (i2 == 61) {
          this.f = true;
        }
      }
      else
      {
        if ((!this.f) || (this.h == 0)) {
          break;
        }
        a(this.o);
      }
      switch (this.h)
      {
      default: 
        return;
      case 2: 
        this.q >>= 4;
        paramArrayOfByte = this.d;
        paramInt1 = this.e;
        this.e = (paramInt1 + 1);
        paramArrayOfByte[paramInt1] = ((byte)(this.q & 0xFF));
        return;
        if ((i2 >= 0) && (i2 < k.length))
        {
          i2 = k[i2];
          if (i2 >= 0)
          {
            this.h = ((this.h + 1) % 4);
            this.q = (i2 + (this.q << 6));
            if (this.h == 0)
            {
              byte[] arrayOfByte = this.d;
              i2 = this.e;
              this.e = (i2 + 1);
              arrayOfByte[i2] = ((byte)(this.q >> 16 & 0xFF));
              arrayOfByte = this.d;
              i2 = this.e;
              this.e = (i2 + 1);
              arrayOfByte[i2] = ((byte)(this.q >> 8 & 0xFF));
              arrayOfByte = this.d;
              i2 = this.e;
              this.e = (i2 + 1);
              arrayOfByte[i2] = ((byte)(this.q & 0xFF));
            }
          }
        }
        i1 += 1;
        paramInt1 += 1;
      }
    }
    this.q >>= 2;
    paramArrayOfByte = this.d;
    paramInt1 = this.e;
    this.e = (paramInt1 + 1);
    paramArrayOfByte[paramInt1] = ((byte)(this.q >> 8 & 0xFF));
    paramArrayOfByte = this.d;
    paramInt1 = this.e;
    this.e = (paramInt1 + 1);
    paramArrayOfByte[paramInt1] = ((byte)(this.q & 0xFF));
  }
  
  protected final boolean a(byte paramByte)
  {
    return (paramByte >= 0) && (paramByte < this.m.length) && (this.m[paramByte] != -1);
  }
}


