package de.robv.android.xposed.mods.tutorial;

import java.io.BufferedReader;

final class readThread
  extends Thread
{
  BufferedReader paramBufferedReader;
  StringBuilder paramStringBuilder;
  readThread(BufferedReader paramBufferedReader, StringBuilder paramStringBuilder) {
    this.paramBufferedReader=paramBufferedReader;
    this.paramStringBuilder=paramStringBuilder;
  }
  
  public final void run()
  {
    try
    {

        String str = this.paramBufferedReader.readLine();
        if (str == null) {
          return;
        }
        this.paramStringBuilder.append(str);
        this.paramStringBuilder.append("\n");

      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


