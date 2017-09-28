package com.imengququ.myxposed.soft.apk008;

import android.os.Environment;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CPUTool
{
  public static String file = ".system/cpuinfo";
  private final static String CurPath = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq";//当前cpu频率
  private final static String MaxPath = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq";//CPU可运行最大频率

  private final static String MinPath = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq";//CPU可运行最小频率

  public static String myCpuFile = Environment.getExternalStorageDirectory() + File.separator + ".system/cpuinfo";
  public static String xposeFile = "cpuinfo";
  

  public static String getCpuName()
  {

return "";

  }
  

 public static int getCurCpuFreq()
  {
    int result = 0;
    FileReader fr = null;
    BufferedReader br = null;
    try{
      fr = new FileReader(CurPath);
      br = new BufferedReader(fr);
      String text = br.readLine();
      result = Integer.parseInt(text.trim());
    }catch (FileNotFoundException e){
      e.printStackTrace();
    }catch (IOException e){
      e.printStackTrace();
    }finally {
      if (fr != null)
        try{
          fr.close();
        }catch (IOException e){
          e.printStackTrace();
        }
      if (br != null)
        try{
          br.close();
        }catch (IOException e){
          e.printStackTrace();
        }
    }
    return result;
  }
  

  public static int getMaxCpuFreq()
  {


    int result = 0;
    FileReader fr = null;
    BufferedReader br = null;
    try{
      fr = new FileReader(MaxPath);
      br = new BufferedReader(fr);
      String text = br.readLine();
      result = Integer.parseInt(text.trim());
    }catch (FileNotFoundException e){
      e.printStackTrace();
    }catch (IOException e){
      e.printStackTrace();
    }finally {
      if (fr != null)
        try{
          fr.close();
        }catch (IOException e){
          e.printStackTrace();
        }
      if (br != null)
        try{
          br.close();
        }catch (IOException e){
          e.printStackTrace();
        }
    }
    return result;


  }
  

 public static int getMinCpuFreq()
  {
    int result = 0;
    FileReader fr = null;
    BufferedReader br = null;
    try{
      fr = new FileReader(MinPath);
      br = new BufferedReader(fr);
      String text = br.readLine();
      result = Integer.parseInt(text.trim());
    }catch (FileNotFoundException e){
      e.printStackTrace();
    }catch (IOException e){
      e.printStackTrace();
    }finally {
      if (fr != null)
        try{
          fr.close();
        }catch (IOException e){
          e.printStackTrace();
        }
      if (br != null)
        try{
          br.close();
        }catch (IOException e){
          e.printStackTrace();
        }
    }
    return result;


  }
  //设置cpu 的名字
  public static void setCpuName(String paramString)
  {
    String str2 = PoseHelper008.getFileData(xposeFile);
    int i = str2.indexOf("Hardware\t:") + "Hardware\t:".length();
    String str1 = str2;
    if (i >= 0)
    {
      int j = str2.indexOf("\n", i);
      str1 = str2;
      if (j >= 0) {
        str1 = str2.replace(str2.substring(i, j).trim(), paramString.trim());
      }
    }
    PoseHelper008.saveDataToFile(xposeFile, str1);
  }
}

