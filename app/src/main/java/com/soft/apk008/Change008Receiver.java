package com.soft.apk008;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;

import com.a.a.Map;
import com.data.simulate.SimulateDataTest;
import com.lishu.c.p;
import com.lishu.c.w;
import com.soft.tools.ClearApplicationDataActivity;
import com.soft.tools.RecordAppFileHandler;
import com.soft.tools.SetSystemValueActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.HashMap;

public class Change008Receiver
  extends BroadcastReceiver
  implements w
{
  private static String b = StartActivity.b + "/phone/LogicSimpleAction.action";
  int a = 0;
  private p c = new p();
  private Context d;
  private Handler e = new y(this);
  
  public final void a(String paramString)
  {
    Object localObject = a.b(paramString);
    paramString = ((Map)localObject).get("time");
    new StringBuilder().append(((Map)localObject).get("id")).toString();
    localObject = ((Map)localObject).get("overTime");
    if (!paramString.equals("null"))
    {
      if (((String)localObject).equals("true"))
      {
        if (!PoseHelper008.getFileData("preStatus").equals("true"))
        {
          PoseHelper008.saveDataToFile("fresh", "true");
          PoseHelper008.saveDataToFile("preStatus", "true");
        }
        paramString = new Message();
        paramString.obj = "【008神器提示】：修改数据失败，原因：已经过期，请查询";
        this.e.sendMessage(paramString);
        return;
      }
      if (!PoseHelper008.getFileData("preStatus").equals("false"))
      {
        PoseHelper008.saveDataToFile("preStatus", "false");
        PoseHelper008.saveDataToFile("fresh", "true");
      }
      SetMessageActivity.a(this.d);
      paramString = LoadActivity.getProPackAge(this.d, LoadActivity.a, LoadActivity.b);
      RecordAppFileHandler.a(this.d, true);
      ClearApplicationDataActivity.a(this.d, paramString);
      SetSystemValueActivity.a(this.d);
      paramString = new Message();
      paramString.obj = "【008神器提示】：修改数据成功！";
      this.e.sendMessage(paramString);
      return;
    }
    paramString = new Message();
    paramString.obj = "【008神器提示】：修改数据失败，原因：与服务器通信失败";
    this.e.sendMessage(paramString);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    this.d = paramContext;
    if (paramIntent.getAction().equals("soft.008.change")) {
      this.a = 1;
    }
    for (;;)
    {
      if (this.a == 1)
      {
        paramIntent = new HashMap();
        paramIntent.put("action", "status");
        if ((StartActivity.g == null) || (StartActivity.g.size() == 0))
        {
          StartActivity.b(paramContext);
          SimulateDataTest.init(paramContext);
        }
        paramIntent.putAll(StartActivity.b());
        this.c.a(b, paramIntent, this);
      }
      return;
      if (paramIntent.getAction().equals("soft.008.changeQuick")) {
        this.a = 2;
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.apk008.Change008Receiver

 * JD-Core Version:    0.7.0.1

 */