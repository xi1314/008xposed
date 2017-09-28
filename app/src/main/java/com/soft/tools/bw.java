package com.soft.tools;

final class bw
  implements Runnable
{
  bw(bt parambt, String paramString) {}
  
  public final void run()
  {
    int i = 0;
    IpRecordActivity.d(this.a.a).setText(this.b);
    int j = 0;
    for (;;)
    {
      if (i >= IpRecordActivity.a(this.a.a).size())
      {
        if (j == 0) {
          break;
        }
        IpRecordActivity.e(this.a.a).setTextColor(-65536);
        IpRecordActivity.e(this.a.a).setText("注意当前ip已经在列表中");
        return;
      }
      if (IpRecordActivity.a(this.a.a).a(i).j("ip").equals(this.b)) {
        j = 1;
      }
      i += 1;
    }
    IpRecordActivity.e(this.a.a).setTextColor(-1);
    IpRecordActivity.e(this.a.a).setText("当前ip未被使用过");
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.bw

 * JD-Core Version:    0.7.0.1

 */