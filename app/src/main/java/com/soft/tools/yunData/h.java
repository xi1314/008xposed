package com.soft.tools.yunData;

import b.a.b.a.a.d;
import b.a.b.a.a.g;
import java.nio.charset.Charset;

public final class h
  extends g
{
  public h(d paramd, Charset paramCharset)
  {
    super(paramd, paramCharset);
  }
  
  protected final String a(String paramString, Charset paramCharset)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("multipart/form-data");
    if (paramCharset != null)
    {
      localStringBuilder.append("; charset=");
      localStringBuilder.append(paramCharset.name());
    }
    localStringBuilder.append(";boundary=");
    localStringBuilder.append(paramString);
    return localStringBuilder.toString();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.yunData.h
 * JD-Core Version:    0.7.0.1
 */