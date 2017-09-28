package tutorial;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.Context;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Shell
{
  public static Context activity;
  private static BufferedReader bufferedreader;
  private static InputStream inputstream;
  private static DataOutputStream os1;
  private static Process proc;
  public static boolean stopGetData = false;
  
  public static String execCommand(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str = paramString;
    if (paramBoolean1) {
      str = "su";
    }
    try
    {
      if ((os1 == null) || (!paramBoolean1))
      {
        proc = Runtime.getRuntime().exec(str);
        os1 = new DataOutputStream(proc.getOutputStream());
        inputstream = proc.getInputStream();
      }
      if (paramBoolean1)
      {
        os1.writeBytes(paramString + "\n");
        os1.flush();
      }
      if (paramBoolean2) {}
      return "";
    }
    catch (Exception e)
    {
      e.printStackTrace();
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

  
  public static String getRoot()
  {
    return execCommand("chmod 777 /dev/input/event*", true, false);
  }
  
  public static String getTopActivityName(Context paramContext)
  {
    return ((RunningTaskInfo)((ActivityManager)paramContext.getSystemService(Context.ACTIVITY_SERVICE)).getRunningTasks(1).get(0)).topActivity.getClassName();
  }
}


