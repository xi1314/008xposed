package de.robv.android.xposed.mods.tutorial;

import android.util.Log;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public final class Shell
{
  public static boolean a = false;
  private static DataOutputStream dataOutputStream;
  private static Process process;
  private static InputStream inputStream;
  
  public static String execCommand(String cmdstr)
  {
    try
    {
      if (dataOutputStream == null)
      {
        process = Runtime.getRuntime().exec("su");
        dataOutputStream = new DataOutputStream(process.getOutputStream());
        inputStream = process.getInputStream();
      }
      dataOutputStream.writeBytes(cmdstr + "\n");
      dataOutputStream.flush();
      return "";
    }
    catch (Exception E)
    {
      E.printStackTrace();
    }
    return "";
  }
  
  public static String execCommandWithResult(String cmdstr, boolean paramBoolean)
  {
    StringBuffer stringBuffer=null;
    try
    {
      Object localObject2 = Runtime.getRuntime();
      Object localObject1 = cmdstr;
      if (paramBoolean) {
        localObject1 = "su";
      }
      Process process = ((Runtime)localObject2).exec((String)localObject1);
      DataOutputStream dataOutputStream = new DataOutputStream(((Process)process).getOutputStream());
      InputStream inputStream = ((Process)process).getInputStream();
      if (paramBoolean)
      {
        dataOutputStream.writeBytes(cmdstr + "\n");
        dataOutputStream.writeBytes("exit\n");
        dataOutputStream.flush();
        dataOutputStream.close();
      }
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
      stringBuffer = new StringBuffer();
      String str = bufferedReader.readLine();;
      while((str = bufferedReader.readLine()) != null)
      {
        stringBuffer.append((String)str);
        stringBuffer.append("\n");
      }
      return stringBuffer.toString();
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }

    return stringBuffer.toString();

  }
}

