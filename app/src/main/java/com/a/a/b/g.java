package com.a.a.b;

public final class g
{
  int a;
  int b;
  private int c;
  private int[] d;
  
  final void a(int paramInt, byte[] paramArrayOfByte)
  {
    this.a |= 0x2;
    this.b = paramInt;
    int i = 0;
    while (i < this.c)
    {
      int[] arrayOfInt = this.d;
      int j = i + 1;
      int k = arrayOfInt[i];
      arrayOfInt = this.d;
      i = j + 1;
      j = arrayOfInt[j];
      k = paramInt - k;
      paramArrayOfByte[j] = ((byte)(k >>> 8));
      paramArrayOfByte[(j + 1)] = ((byte)k);
    }
  }
  
  final void a(b paramb, int paramInt)
  {
    if ((this.a & 0x2) == 0)
    {
      int i = paramb.b;
      if (this.d == null) {
        this.d = new int[6];
      }
      if (this.c >= this.d.length)
      {
        arrayOfInt = new int[this.d.length + 6];
        System.arraycopy(this.d, 0, arrayOfInt, 0, this.d.length);
        this.d = arrayOfInt;
      }
      int[] arrayOfInt = this.d;
      int j = this.c;
      this.c = (j + 1);
      arrayOfInt[j] = paramInt;
      arrayOfInt = this.d;
      paramInt = this.c;
      this.c = (paramInt + 1);
      arrayOfInt[paramInt] = i;
      paramb.b(-1);
      return;
    }
    paramb.b(this.b - paramInt);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.Inttolong.g

 * JD-Core Version:    0.7.0.1

 */