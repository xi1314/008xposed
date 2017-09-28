package com.imengququ.myxposed.soft.toos.findApp;

public class App
{
  public String name;
  public String packAgeName;
  public String pinYinName;
  
  public App() {}
  
  public App(String paramString)
  {
    this.name = paramString;
  }
  
  public App(String paramString1, String paramString2, String paramString3)
  {
    this.name = paramString1;
    this.packAgeName = paramString3;
    this.pinYinName = paramString2;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String getPackAgeName()
  {
    return this.packAgeName;
  }
  
  public String getPinYinName()
  {
    return this.pinYinName;
  }
  
  public void setName(String paramString)
  {
    this.name = paramString;
  }
  
  public void setPackAgeName(String paramString)
  {
    this.packAgeName = paramString;
  }
  
  public void setPinYinName(String paramString)
  {
    this.pinYinName = paramString;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     App

 * JD-Core Version:    0.7.0.1

 */