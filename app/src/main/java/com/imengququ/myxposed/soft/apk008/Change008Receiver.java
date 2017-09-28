package com.imengququ.myxposed.soft.apk008;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.data.simulate.SimulateDataTemp;
import com.lishu.net.LishuNet;
import com.lishu.net.NetReceiver;
import com.soft.tools.ClearApplicationDataActivity;
import com.soft.tools.RecordAppFileHandler;
import com.soft.tools.SetSystemValueActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.HashMap;

public class Change008Receiver
  extends BroadcastReceiver
  implements NetReceiver
{
  public static final String fileName = "UnInstallActivity";
  private static String url = StartActivity.baseUrl + "/phone/LogicSimpleAction.action";
  private Context context;
  private Handler handler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      paramAnonymousMessage = (String)paramAnonymousMessage.obj;
      if (paramAnonymousMessage != null) {
        Toast.makeText(Change008Receiver.this.context, paramAnonymousMessage, 0).show();
      }
    }
  };
  int kind = 0;
  private LishuNet net = new LishuNet();
  
  public void netReceive(String paramString)
  {
   JSONObject  JO = JSON.parseObject(paramString);
    new StringBuilder().append(JO.get("time")).toString();
    new StringBuilder().append(JO.get("id")).toString();
    new StringBuilder().append(JO.get("overTime")).toString();
    if (!"5421254540993".equals("null"))
    {
      if ("null".equals("true"))
      {
        if (!PoseHelper008.getFileData("preStatus").equals("true"))
        {
          PoseHelper008.saveDataToFile("fresh", "true");
          PoseHelper008.saveDataToFile("preStatus", "true");
        }
       Message message = new Message();
        message.obj = "【008神器提示】：修改数据失败，原因：已经过期，请查询";
        this.handler.sendMessage(message);
        return;
      }
      if (!PoseHelper008.getFileData("preStatus").equals("false"))
      {
        PoseHelper008.saveDataToFile("preStatus", "false");
        PoseHelper008.saveDataToFile("fresh", "true");
      }
      SetDataActivity.changeDataInner(this.context);
      paramString = LoadActivity.getProPackAge(this.context, LoadActivity.a, LoadActivity.b);
      RecordAppFileHandler.deleteData(this.context, paramString);
      ClearApplicationDataActivity.clearData(this.context, paramString);
      SetSystemValueActivity.deleteSelect(this.context, paramString);
      paramString = new Message();
      paramString.obj = "【008神器提示】：修改数据成功！";
      this.handler.sendMessage(paramString);
      return;
    }
    paramString = new Message();
    paramString.obj = "【008神器提示】：修改数据失败，原因：与服务器通信失败";
    this.handler.sendMessage(paramString);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    this.context = paramContext;
    if (paramIntent.getAction().equals("soft.008.change")) {
      this.kind = 1;
    }
    for (;;)
    {
      if (this.kind == 1)
      {
        paramIntent = new HashMap();
        paramIntent.put("action", "status");
        if ((StartActivity.systemData == null) || (StartActivity.systemData.size() == 0))
        {
          StartActivity.getSystemData(paramContext);
          SimulateDataTemp.init(paramContext);
        }
        paramIntent.putAll(StartActivity.getBaseData());
        this.net.postMessage(url, paramIntent, this);
      }
      return;
      if (paramIntent.getAction().equals("soft.008.changeQuick")) {
        this.kind = 2;
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     Change008Receiver

 * JD-Core Version:    0.7.0.1

 */