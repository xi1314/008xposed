package de.robv.android.xposed.mods.tutorial.funcs;

public final class Inttolong
{
  //int 转为long
  public static long inttolong(int paramInt)
  {
    return (long) ((1L + (Math.random() * paramInt)) * 1048576L + 1024L * (1024.0D * Math.random()));
  }
}

