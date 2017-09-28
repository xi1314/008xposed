package com.soft.tools;

import java.io.File;
import java.io.FileFilter;

final class bj
  implements FileFilter
{
  public final boolean accept(File paramFile)
  {
    return (paramFile.isDirectory()) || (paramFile.getName().contains(".apk"));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.bj
 * JD-Core Version:    0.7.0.1
 */