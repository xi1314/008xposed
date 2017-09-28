package com.soft.tools;

final class eh
  implements Runnable
{
  eh(SelectManuActivity paramSelectManuActivity) {}
  
  public final void run()
  {
    SelectManuActivity.a(this.a).notifyDataSetChanged();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.eh
 * JD-Core Version:    0.7.0.1
 */